package mcu.client.models;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mcu.utils.SidedProtection;
import net.minecraft.client.renderer.Tessellator;
import net.minecraftforge.client.model.IModelCustom;
import net.minecraftforge.client.model.ModelFormatException;
import net.minecraftforge.client.model.obj.Face;
import net.minecraftforge.client.model.obj.GroupObject;
import net.minecraftforge.client.model.obj.TextureCoordinate;
import net.minecraftforge.client.model.obj.Vertex;
import org.lwjgl.opengl.GL11;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

@SideOnly(Side.CLIENT)
public class MCUObject implements IModelCustom {
    private static Pattern vertexPattern;
    private static Pattern vertexNormalPattern;
    private static Pattern textureCoordinatePattern;
    private static Pattern face_V_VT_VN_Pattern;
    private static Pattern face_V_VT_Pattern;
    private static Pattern face_V_VN_Pattern;
    private static Pattern face_V_Pattern;
    private static Pattern groupObjectPattern;
    private static Matcher vertexMatcher;
    private static Matcher vertexNormalMatcher;
    private static Matcher textureCoordinateMatcher;
    private static Matcher face_V_VT_VN_Matcher;
    private static Matcher face_V_VT_Matcher;
    private static Matcher face_V_VN_Matcher;
    private static Matcher face_V_Matcher;
    private static Matcher groupObjectMatcher;

    static {
        MCUObject.vertexPattern = Pattern
                .compile("(v( (\\-){0,1}\\d+\\.\\d+){3,4} *\\n)|(v( (\\-){0,1}\\d+\\.\\d+){3,4} *$)");
        MCUObject.vertexNormalPattern = Pattern
                .compile("(vn( (\\-){0,1}\\d+\\.\\d+){3,4} *\\n)|(vn( (\\-){0,1}\\d+\\.\\d+){3,4} *$)");
        MCUObject.textureCoordinatePattern = Pattern
                .compile("(vt( (\\-){0,1}\\d+\\.\\d+){2,3} *\\n)|(vt( (\\-){0,1}\\d+\\.\\d+){2,3} *$)");
        MCUObject.face_V_VT_VN_Pattern = Pattern.compile("(f( \\d+/\\d+/\\d+){3,4} *\\n)|(f( \\d+/\\d+/\\d+){3,4} *$)");
        MCUObject.face_V_VT_Pattern = Pattern.compile("(f( \\d+/\\d+){3,4} *\\n)|(f( \\d+/\\d+){3,4} *$)");
        MCUObject.face_V_VN_Pattern = Pattern.compile("(f( \\d+//\\d+){3,4} *\\n)|(f( \\d+//\\d+){3,4} *$)");
        MCUObject.face_V_Pattern = Pattern.compile("(f( \\d+){3,4} *\\n)|(f( \\d+){3,4} *$)");
        MCUObject.groupObjectPattern = Pattern.compile("([go]( [\\w\\d]+) *\\n)|([go]( [\\w\\d]+) *$)");
    }

    public ArrayList<Vertex> vertices;
    public ArrayList<Vertex> vertexNormals;
    public ArrayList<TextureCoordinate> textureCoordinates;
    public ArrayList<GroupObject> groupObjects;
    private GroupObject currentGroupObject;
    private final String fileName;

    public MCUObject(final String fileName, final URL url) throws ModelFormatException {
        this.vertices = new ArrayList<Vertex>();
        this.vertexNormals = new ArrayList<Vertex>();
        this.textureCoordinates = new ArrayList<TextureCoordinate>();
        this.groupObjects = new ArrayList<GroupObject>();
        this.fileName = fileName;
        try {
            this.loadObjModel(url.openStream());
        } catch (IOException ex) {
            throw new ModelFormatException("IO Exception reading model format", ex);
        }
    }

    public MCUObject(final String fileName, final InputStream inputStream) throws ModelFormatException {
        this.vertices = new ArrayList<Vertex>();
        this.vertexNormals = new ArrayList<Vertex>();
        this.textureCoordinates = new ArrayList<TextureCoordinate>();
        this.groupObjects = new ArrayList<GroupObject>();
        this.fileName = fileName;
        this.loadObjModel(inputStream);
    }

    public MCUObject(final InputStream inputStream) throws ModelFormatException {
        this.vertices = new ArrayList<Vertex>();
        this.vertexNormals = new ArrayList<Vertex>();
        this.textureCoordinates = new ArrayList<TextureCoordinate>();
        this.groupObjects = new ArrayList<>();
        this.fileName = "unknown";
        this.loadObjModel(inputStream);
    }

    private static boolean isValidVertexLine(final String s) {
        if (MCUObject.vertexMatcher != null) {
            MCUObject.vertexMatcher.reset();
        }
        MCUObject.vertexMatcher = MCUObject.vertexPattern.matcher(s);
        return MCUObject.vertexMatcher.matches();
    }

    private static boolean isValidVertexNormalLine(final String s) {
        if (MCUObject.vertexNormalMatcher != null) {
            MCUObject.vertexNormalMatcher.reset();
        }
        MCUObject.vertexNormalMatcher = MCUObject.vertexNormalPattern.matcher(s);
        return MCUObject.vertexNormalMatcher.matches();
    }

    private static boolean isValidTextureCoordinateLine(final String s) {
        if (MCUObject.textureCoordinateMatcher != null) {
            MCUObject.textureCoordinateMatcher.reset();
        }
        MCUObject.textureCoordinateMatcher = MCUObject.textureCoordinatePattern.matcher(s);
        return MCUObject.textureCoordinateMatcher.matches();
    }

    private static boolean isValidFace_V_VT_VN_Line(final String s) {
        if (MCUObject.face_V_VT_VN_Matcher != null) {
            MCUObject.face_V_VT_VN_Matcher.reset();
        }
        MCUObject.face_V_VT_VN_Matcher = MCUObject.face_V_VT_VN_Pattern.matcher(s);
        return MCUObject.face_V_VT_VN_Matcher.matches();
    }

    private static boolean isValidFace_V_VT_Line(final String s) {
        if (MCUObject.face_V_VT_Matcher != null) {
            MCUObject.face_V_VT_Matcher.reset();
        }
        MCUObject.face_V_VT_Matcher = MCUObject.face_V_VT_Pattern.matcher(s);
        return MCUObject.face_V_VT_Matcher.matches();
    }

    private static boolean isValidFace_V_VN_Line(final String s) {
        if (MCUObject.face_V_VN_Matcher != null) {
            MCUObject.face_V_VN_Matcher.reset();
        }
        MCUObject.face_V_VN_Matcher = MCUObject.face_V_VN_Pattern.matcher(s);
        return MCUObject.face_V_VN_Matcher.matches();
    }

    private static boolean isValidFace_V_Line(final String s) {
        if (MCUObject.face_V_Matcher != null) {
            MCUObject.face_V_Matcher.reset();
        }
        MCUObject.face_V_Matcher = MCUObject.face_V_Pattern.matcher(s);
        return MCUObject.face_V_Matcher.matches();
    }

    private static boolean isValidFaceLine(final String s) {
        return isValidFace_V_VT_VN_Line(s) || isValidFace_V_VT_Line(s) || isValidFace_V_VN_Line(s)
                || isValidFace_V_Line(s);
    }

    private static boolean isValidGroupObjectLine(final String s) {
        if (MCUObject.groupObjectMatcher != null) {
            MCUObject.groupObjectMatcher.reset();
        }
        MCUObject.groupObjectMatcher = MCUObject.groupObjectPattern.matcher(s);
        return MCUObject.groupObjectMatcher.matches();
    }

    private void loadObjModel(final InputStream inputStream) throws ModelFormatException {
        if (!SidedProtection.CLIENT)
            return;
        BufferedReader bufferedReader = null;
        String s = null;
        int n = 0;
        try {
            final byte[] allFromAndClose = this.readAllFromAndClose(inputStream);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(
                        new GZIPInputStream(new WEikawiewaZ(new ByteArrayInputStream(allFromAndClose)))));
                s = bufferedReader.readLine();
            } catch (Throwable t) {
            }
            if (s == null) {
                bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(allFromAndClose)));
                s = bufferedReader.readLine();
            }
            do {
                ++n;
                final String trim;
                if (!(trim = s.replaceAll("\\s+", " ").trim()).startsWith("#")) {
                    if (trim.length() == 0) {
                        continue;
                    }
                    if (trim.startsWith("v ")) {
                        final Vertex vertex = this.parseVertex(trim, n);
                        if (vertex == null) {
                            continue;
                        }
                        this.vertices.add(vertex);
                    } else if (trim.startsWith("vn ")) {
                        final Vertex vertexNormal = this.parseVertexNormal(trim, n);
                        if (vertexNormal == null) {
                            continue;
                        }
                        this.vertexNormals.add(vertexNormal);
                    } else if (trim.startsWith("vt ")) {
                        final TextureCoordinate textureCoordinate = this.parseTextureCoordinate(trim, n);
                        if (textureCoordinate == null) {
                            continue;
                        }
                        this.textureCoordinates.add(textureCoordinate);
                    } else if (trim.startsWith("f ")) {
                        if (this.currentGroupObject == null) {
                            this.currentGroupObject = new GroupObject("Default");
                        }
                        final Face face;
                        if ((face = this.parseFace(trim, n)) == null) {
                            continue;
                        }
                        this.currentGroupObject.faces.add(face);
                    } else {
                        if (!(trim.startsWith("g ") | trim.startsWith("o "))) {
                            continue;
                        }
                        final GroupObject groupObject = this.parseGroupObject(trim, n);
                        if (groupObject != null && this.currentGroupObject != null) {
                            this.groupObjects.add(this.currentGroupObject);
                        }
                        this.currentGroupObject = groupObject;
                    }
                }
            } while ((s = bufferedReader.readLine()) != null);
            this.groupObjects.add(this.currentGroupObject);
        } catch (IOException ex) {
            throw new ModelFormatException("IO Exception reading model format", ex);
        }
    }

    private byte[] readAllFromAndClose(final InputStream inputStream) throws IOException {
        try {
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            final byte[] array = new byte[1024];
            int read;
            while ((read = inputStream.read(array)) != -1) {
                byteArrayOutputStream.write(array, 0, read);
            }
            inputStream.close();
            return byteArrayOutputStream.toByteArray();
        } finally {
            try {
                inputStream.close();
            } catch (IOException ex) {
            }
        }
    }

    public void renderAll() {
        Tessellator tessellator = Tessellator.instance;

        if (currentGroupObject != null) {
            tessellator.startDrawing(currentGroupObject.glDrawingMode);
        } else {
            tessellator.startDrawing(GL11.GL_TRIANGLES);
        }
        tessellateAll(tessellator);

        tessellator.draw();
    }

    public void tessellateAll(final Tessellator Tessellator) {
        final Iterator<GroupObject> iterator = this.groupObjects.iterator();
        while (iterator.hasNext()) {
            iterator.next().render(Tessellator);
        }
    }

    public void renderOnly(final String... array) {
        for (final GroupObject GroupObject : this.groupObjects) {
            for (int length = array.length, i = 0; i < length; ++i) {
                if (array[i].equalsIgnoreCase(GroupObject.name)) {
                    GroupObject.render();
                }
            }
        }
    }

    public void tessellateOnly(final Tessellator Tessellator, final String... array) {
        for (final GroupObject GroupObject : this.groupObjects) {
            for (int length = array.length, i = 0; i < length; ++i) {
                if (array[i].equalsIgnoreCase(GroupObject.name)) {
                    GroupObject.render(Tessellator);
                }
            }
        }
    }

    public void renderPart(final String s) {
        for (final GroupObject GroupObject : this.groupObjects) {
            if (s.equalsIgnoreCase(GroupObject.name)) {
                GroupObject.render();
            }
        }
    }

    public void tessellatePart(final Tessellator Tessellator, final String s) {
        for (final GroupObject GroupObject : this.groupObjects) {
            if (s.equalsIgnoreCase(GroupObject.name)) {
                GroupObject.render(Tessellator);
            }
        }
    }

    public void renderAllExcept(final String... array) {
        for (final GroupObject GroupObject : this.groupObjects) {
            boolean b = false;
            for (int length = array.length, i = 0; i < length; ++i) {
                if (array[i].equalsIgnoreCase(GroupObject.name)) {
                    System.out.println("GroupObject = " + GroupObject.name);
                    b = true;
                }
            }
            if (!b) {
                GroupObject.render();
            }
        }
    }

    public void tessellateAllExcept(final Tessellator Tessellator, final String... array) {
        for (final GroupObject GroupObject : this.groupObjects) {
            boolean b = false;
            for (int length = array.length, i = 0; i < length; ++i) {
                if (array[i].equalsIgnoreCase(GroupObject.name)) {
                    b = true;
                }
            }
            if (!b) {
                GroupObject.render(Tessellator);
            }
        }
    }

    private Vertex parseVertex(String substring, final int n) throws ModelFormatException {
        if (isValidVertexLine(substring)) {
            substring = substring.substring(substring.indexOf(" ") + 1);
            final String[] split = substring.split(" ");
            try {
                if (split.length == 2) {
                    return new Vertex(Float.parseFloat(split[0]), Float.parseFloat(split[1]));
                }
                if (split.length == 3) {
                    return new Vertex(Float.parseFloat(split[0]), Float.parseFloat(split[1]),
                            Float.parseFloat(split[2]));
                }
            } catch (NumberFormatException ex) {
                throw new ModelFormatException(String.format("Number formatting error at line %d", n), ex);
            }
            return null;
        }
        throw new ModelFormatException("Error parsing entry ('" + substring + "', line " + n + ") in file '"
                + this.fileName + "' - Incorrect format");
    }

    private Vertex parseVertexNormal(String substring, final int n) throws ModelFormatException {
        if (isValidVertexNormalLine(substring)) {
            substring = substring.substring(substring.indexOf(" ") + 1);
            final String[] split = substring.split(" ");
            try {
                if (split.length == 3) {
                    return new Vertex(Float.parseFloat(split[0]), Float.parseFloat(split[1]),
                            Float.parseFloat(split[2]));
                }
            } catch (NumberFormatException ex) {
                throw new ModelFormatException(String.format("Number formatting error at line %d", n), ex);
            }
            return null;
        }
        throw new ModelFormatException("Error parsing entry ('" + substring + "', line " + n + ") in file '"
                + this.fileName + "' - Incorrect format");
    }

    private TextureCoordinate parseTextureCoordinate(String substring, final int n) throws ModelFormatException {
        if (isValidTextureCoordinateLine(substring)) {
            substring = substring.substring(substring.indexOf(" ") + 1);
            final String[] split = substring.split(" ");
            try {
                if (split.length == 2) {
                    return new TextureCoordinate(Float.parseFloat(split[0]), 1.0f - Float.parseFloat(split[1]));
                }
                if (split.length == 3) {
                    return new TextureCoordinate(Float.parseFloat(split[0]), 1.0f - Float.parseFloat(split[1]),
                            Float.parseFloat(split[2]));
                }
            } catch (NumberFormatException ex) {
                throw new ModelFormatException(String.format("Number formatting error at line %d", n), ex);
            }
            return null;
        }
        throw new ModelFormatException("Error parsing entry ('" + substring + "', line " + n + ") in file '"
                + this.fileName + "' - Incorrect format");
    }

    private Face parseFace(final String s, final int n) throws ModelFormatException {
        if (isValidFaceLine(s)) {
            final Face Face = new Face();
            final String[] split = s.substring(s.indexOf(" ") + 1).split(" ");
            if (split.length == 3) {
                if (this.currentGroupObject.glDrawingMode == -1) {
                    this.currentGroupObject.glDrawingMode = 4;
                } else if (this.currentGroupObject.glDrawingMode != 4) {
                }
            } else if (split.length == 4) {
                if (this.currentGroupObject.glDrawingMode == -1) {
                    this.currentGroupObject.glDrawingMode = 7;
                } else if (this.currentGroupObject.glDrawingMode != 7) {
                    throw new ModelFormatException(
                            "Error parsing entry ('" + s + "', line " + n + ") in file '" + this.fileName
                                    + "' - Invalid number of points for face (expected 3, found " + split.length + ")");
                }
            }
            if (isValidFace_V_VT_VN_Line(s)) {
                Face.vertices = new Vertex[split.length];
                Face.textureCoordinates = new TextureCoordinate[split.length];
                Face.vertexNormals = new Vertex[split.length];
                for (int i = 0; i < split.length; ++i) {
                    final String[] split2 = split[i].split("/");
                    Face.vertices[i] = this.vertices.get(Integer.parseInt(split2[0]) - 1);
                    Face.textureCoordinates[i] = this.textureCoordinates.get(Integer.parseInt(split2[1]) - 1);
                    Face.vertexNormals[i] = this.vertexNormals.get(Integer.parseInt(split2[2]) - 1);
                }
                Face.faceNormal = Face.calculateFaceNormal();
            } else if (isValidFace_V_VT_Line(s)) {
                Face.vertices = new Vertex[split.length];
                Face.textureCoordinates = new TextureCoordinate[split.length];
                for (int j = 0; j < split.length; ++j) {
                    final String[] split3 = split[j].split("/");
                    Face.vertices[j] = this.vertices.get(Integer.parseInt(split3[0]) - 1);
                    Face.textureCoordinates[j] = this.textureCoordinates.get(Integer.parseInt(split3[1]) - 1);
                }
                Face.faceNormal = Face.calculateFaceNormal();
            } else if (isValidFace_V_VN_Line(s)) {
                Face.vertices = new Vertex[split.length];
                Face.vertexNormals = new Vertex[split.length];
                for (int k = 0; k < split.length; ++k) {
                    final String[] split4 = split[k].split("//");
                    Face.vertices[k] = this.vertices.get(Integer.parseInt(split4[0]) - 1);
                    Face.vertexNormals[k] = this.vertexNormals.get(Integer.parseInt(split4[1]) - 1);
                }
                Face.faceNormal = Face.calculateFaceNormal();
            } else {
                if (!isValidFace_V_Line(s)) {
                    throw new ModelFormatException("Error parsing entry ('" + s + "', line " + n + ") in file '"
                            + this.fileName + "' - Incorrect format");
                }
                Face.vertices = new Vertex[split.length];
                for (int l = 0; l < split.length; ++l) {
                    Face.vertices[l] = this.vertices.get(Integer.parseInt(split[l]) - 1);
                }
                Face.faceNormal = Face.calculateFaceNormal();
            }
            return Face;
        }
        throw new ModelFormatException(
                "Error parsing entry ('" + s + "', line " + n + ") in file '" + this.fileName + "' - Incorrect format");
    }

    private GroupObject parseGroupObject(String s, final int n) throws ModelFormatException {
        GroupObject GroupObject = null;
        s = s.replace(".", "");
        if (isValidGroupObjectLine(s)) {
            final String substring = s.substring(s.indexOf(" ") + 1);
            if (substring.length() > 0) {
                GroupObject = new GroupObject(substring);
            }
            return GroupObject;
        }
        throw new ModelFormatException(
                "Error parsing entry ('" + s + "', line " + n + ") in file '" + this.fileName + "' - Incorrect format");
    }

    public String getType() {
        return "obj";
    }
}
