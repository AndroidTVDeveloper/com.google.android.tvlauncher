package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* renamed from: lt  reason: default package */
/* compiled from: PG */
final class lt extends InputStream implements DataInput {
    private static final ByteOrder d = ByteOrder.LITTLE_ENDIAN;
    private static final ByteOrder e = ByteOrder.BIG_ENDIAN;
    public ByteOrder a;
    public final int b;
    public int c;
    private DataInputStream f;

    public final String readLine() {
        return null;
    }

    public lt(InputStream inputStream) {
        this.a = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f = dataInputStream;
        int available = dataInputStream.available();
        this.b = available;
        this.c = 0;
        this.f.mark(available);
    }

    public lt(byte[] bArr) {
        this(new ByteArrayInputStream(bArr));
    }

    public final int available() {
        return this.f.available();
    }

    public final int read() {
        this.c++;
        return this.f.read();
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.f.read(bArr, i, i2);
        this.c += read;
        return read;
    }

    public final boolean readBoolean() {
        this.c++;
        return this.f.readBoolean();
    }

    public final byte readByte() {
        int i = this.c + 1;
        this.c = i;
        if (i <= this.b) {
            int read = this.f.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final char readChar() {
        this.c += 2;
        return this.f.readChar();
    }

    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public final void readFully(byte[] bArr) {
        int i = this.c;
        int length = bArr.length;
        int i2 = i + length;
        this.c = i2;
        if (i2 > this.b) {
            throw new EOFException();
        } else if (this.f.read(bArr, 0, length) != length) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }

    public final void readFully(byte[] bArr, int i, int i2) {
        int i3 = this.c + i2;
        this.c = i3;
        if (i3 > this.b) {
            throw new EOFException();
        } else if (this.f.read(bArr, i, i2) != i2) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }

    public final int readInt() {
        int i = this.c + 4;
        this.c = i;
        if (i <= this.b) {
            int read = this.f.read();
            int read2 = this.f.read();
            int read3 = this.f.read();
            int read4 = this.f.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.a;
                if (byteOrder == d) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == e) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                throw new IOException("Invalid byte order: " + this.a);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final long readLong() {
        int i = this.c + 8;
        this.c = i;
        if (i <= this.b) {
            int read = this.f.read();
            int read2 = this.f.read();
            int read3 = this.f.read();
            int read4 = this.f.read();
            int read5 = this.f.read();
            int read6 = this.f.read();
            int read7 = this.f.read();
            int read8 = this.f.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.a;
                if (byteOrder == d) {
                    return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                }
                int i2 = read2;
                if (byteOrder == e) {
                    return (((long) read) << 56) + (((long) i2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                }
                throw new IOException("Invalid byte order: " + this.a);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final short readShort() {
        int i = this.c + 2;
        this.c = i;
        if (i <= this.b) {
            int read = this.f.read();
            int read2 = this.f.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.a;
                if (byteOrder == d) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == e) {
                    return (short) ((read << 8) + read2);
                }
                throw new IOException("Invalid byte order: " + this.a);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final String readUTF() {
        this.c += 2;
        return this.f.readUTF();
    }

    public final int readUnsignedByte() {
        this.c++;
        return this.f.readUnsignedByte();
    }

    public final long a() {
        return ((long) readInt()) & 4294967295L;
    }

    public final int readUnsignedShort() {
        int i = this.c + 2;
        this.c = i;
        if (i <= this.b) {
            int read = this.f.read();
            int read2 = this.f.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.a;
                if (byteOrder == d) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == e) {
                    return (read << 8) + read2;
                }
                throw new IOException("Invalid byte order: " + this.a);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final void a(long j) {
        long j2 = (long) this.c;
        if (j2 > j) {
            this.c = 0;
            this.f.reset();
            this.f.mark(this.b);
        } else {
            j -= j2;
        }
        int i = (int) j;
        if (skipBytes(i) != i) {
            throw new IOException("Couldn't seek up to the byteCount");
        }
    }

    public final int skipBytes(int i) {
        int min = Math.min(i, this.b - this.c);
        int i2 = 0;
        while (i2 < min) {
            i2 += this.f.skipBytes(min - i2);
        }
        this.c += i2;
        return i2;
    }
}
