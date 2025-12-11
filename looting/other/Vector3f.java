package mcu.looting.other;

public class Vector3f {
    public float x;
    public float y;
    public float z;

    public Vector3f(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Vector3f) {
            Vector3f vec = (Vector3f) obj;
            return vec.x == x && vec.y == y && vec.z == z;
        } else
            return false;
    }

    @Override
    public int hashCode() {
        return (int) x + (int) y + (int) z;
    }
}
