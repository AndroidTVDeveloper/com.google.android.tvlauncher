package p000;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* renamed from: lt */
/* compiled from: PG */
final class C0319lt extends InputStream implements DataInput {

    /* renamed from: d */
    private static final ByteOrder f9868d = ByteOrder.LITTLE_ENDIAN;

    /* renamed from: e */
    private static final ByteOrder f9869e = ByteOrder.BIG_ENDIAN;

    /* renamed from: a */
    public ByteOrder f9870a;

    /* renamed from: b */
    public final int f9871b;

    /* renamed from: c */
    public int f9872c;

    /* renamed from: f */
    private DataInputStream f9873f;

    public final String readLine() {
        return null;
    }

    public C0319lt(InputStream inputStream) {
        this.f9870a = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f9873f = dataInputStream;
        int available = dataInputStream.available();
        this.f9871b = available;
        this.f9872c = 0;
        this.f9873f.mark(available);
    }

    public C0319lt(byte[] bArr) {
        this(new ByteArrayInputStream(bArr));
    }

    public final int available() {
        return this.f9873f.available();
    }

    public final int read() {
        this.f9872c++;
        return this.f9873f.read();
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.f9873f.read(bArr, i, i2);
        this.f9872c += read;
        return read;
    }

    public final boolean readBoolean() {
        this.f9872c++;
        return this.f9873f.readBoolean();
    }

    public final byte readByte() {
        int i = this.f9872c + 1;
        this.f9872c = i;
        if (i <= this.f9871b) {
            int read = this.f9873f.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final char readChar() {
        this.f9872c += 2;
        return this.f9873f.readChar();
    }

    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public final void readFully(byte[] bArr) {
        int i = this.f9872c;
        int length = bArr.length;
        int i2 = i + length;
        this.f9872c = i2;
        if (i2 > this.f9871b) {
            throw new EOFException();
        } else if (this.f9873f.read(bArr, 0, length) != length) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }

    public final void readFully(byte[] bArr, int i, int i2) {
        int i3 = this.f9872c + i2;
        this.f9872c = i3;
        if (i3 > this.f9871b) {
            throw new EOFException();
        } else if (this.f9873f.read(bArr, i, i2) != i2) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }

    public final int readInt() {
        int i = this.f9872c + 4;
        this.f9872c = i;
        if (i <= this.f9871b) {
            int read = this.f9873f.read();
            int read2 = this.f9873f.read();
            int read3 = this.f9873f.read();
            int read4 = this.f9873f.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.f9870a;
                if (byteOrder == f9868d) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f9869e) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                throw new IOException("Invalid byte order: " + this.f9870a);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final long readLong() {
        int i = this.f9872c + 8;
        this.f9872c = i;
        if (i <= this.f9871b) {
            int read = this.f9873f.read();
            int read2 = this.f9873f.read();
            int read3 = this.f9873f.read();
            int read4 = this.f9873f.read();
            int read5 = this.f9873f.read();
            int read6 = this.f9873f.read();
            int read7 = this.f9873f.read();
            int read8 = this.f9873f.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.f9870a;
                if (byteOrder == f9868d) {
                    return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                }
                int i2 = read2;
                if (byteOrder == f9869e) {
                    return (((long) read) << 56) + (((long) i2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                }
                throw new IOException("Invalid byte order: " + this.f9870a);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final short readShort() {
        int i = this.f9872c + 2;
        this.f9872c = i;
        if (i <= this.f9871b) {
            int read = this.f9873f.read();
            int read2 = this.f9873f.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f9870a;
                if (byteOrder == f9868d) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == f9869e) {
                    return (short) ((read << 8) + read2);
                }
                throw new IOException("Invalid byte order: " + this.f9870a);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final String readUTF() {
        this.f9872c += 2;
        return this.f9873f.readUTF();
    }

    public final int readUnsignedByte() {
        this.f9872c++;
        return this.f9873f.readUnsignedByte();
    }

    /* renamed from: a */
    public final long mo5547a() {
        return ((long) readInt()) & 4294967295L;
    }

    public final int readUnsignedShort() {
        int i = this.f9872c + 2;
        this.f9872c = i;
        if (i <= this.f9871b) {
            int read = this.f9873f.read();
            int read2 = this.f9873f.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f9870a;
                if (byteOrder == f9868d) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == f9869e) {
                    return (read << 8) + read2;
                }
                throw new IOException("Invalid byte order: " + this.f9870a);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    /* renamed from: a */
    public final void mo5548a(long j) {
        long j2 = (long) this.f9872c;
        if (j2 > j) {
            this.f9872c = 0;
            this.f9873f.reset();
            this.f9873f.mark(this.f9871b);
        } else {
            j -= j2;
        }
        int i = (int) j;
        if (skipBytes(i) != i) {
            throw new IOException("Couldn't seek up to the byteCount");
        }
    }

    public final int skipBytes(int i) {
        int min = Math.min(i, this.f9871b - this.f9872c);
        int i2 = 0;
        while (i2 < min) {
            i2 += this.f9873f.skipBytes(min - i2);
        }
        this.f9872c += i2;
        return i2;
    }
}
