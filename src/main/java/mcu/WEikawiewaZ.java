package mcu.client.models;

import mcu.utils.SidedProtection;

import java.io.IOException;
import java.io.InputStream;

public class WEikawiewaZ extends InputStream {
    private final InputStream is;
    private boolean beingRead;

    public WEikawiewaZ(final InputStream is) {
        this.is = is;
    }

    @Override
    public int read() throws IOException {
        if (!SidedProtection.CLIENT)
            return 0;
        return this.beingRead ? this.is.read() : (~this.is.read() & 0xFF);
    }

    @Override
    public int read(final byte[] array) throws IOException {
        if (!SidedProtection.CLIENT)
            return 0;
        return this.read(array, 0, array.length);
    }

    @Override
    public int read(final byte[] array, final int n, final int n2) throws IOException {
        if (!SidedProtection.CLIENT)
            return 0;
        this.beingRead = true;
        final int read = this.is.read(array, n, n2);
        this.beingRead = false;
        for (int i = n; i < n + read; ++i) {
            array[i] ^= -1;
        }
        return read;
    }

    @Override
    public long skip(final long n) throws IOException {
        if (!SidedProtection.CLIENT)
            return 0;
        return this.is.skip(n);
    }

    @Override
    public int available() throws IOException {
        if (!SidedProtection.CLIENT)
            return 0;
        return this.is.available();
    }

    @Override
    public void close() throws IOException {
        this.is.close();
    }

    @Override
    public synchronized void mark(final int n) {
        this.is.mark(n);
    }

    @Override
    public synchronized void reset() throws IOException {
        this.is.reset();
    }

    @Override
    public boolean markSupported() {
        return this.is.markSupported();
    }
}
