package p000;

import java.util.Arrays;

/* renamed from: aru */
/* compiled from: PG */
final class aru {

    /* renamed from: a */
    public static final byte[] f2069a = {0, 0, 1};

    /* renamed from: b */
    public boolean f2070b;

    /* renamed from: c */
    public int f2071c;

    /* renamed from: d */
    public int f2072d;

    /* renamed from: e */
    public byte[] f2073e = new byte[128];

    /* renamed from: a */
    public final void mo1289a(byte[] bArr, int i, int i2) {
        if (this.f2070b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f2073e;
            int length = bArr2.length;
            int i4 = this.f2071c + i3;
            if (length < i4) {
                this.f2073e = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.f2073e, this.f2071c, i3);
            this.f2071c += i3;
        }
    }
}
