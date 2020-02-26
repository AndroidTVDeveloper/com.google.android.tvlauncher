package p000;

import java.util.Arrays;

/* renamed from: ase */
/* compiled from: PG */
final class ase {

    /* renamed from: a */
    public boolean f2208a;

    /* renamed from: b */
    public byte[] f2209b;

    /* renamed from: c */
    public int f2210c;

    /* renamed from: d */
    private final int f2211d;

    /* renamed from: e */
    private boolean f2212e;

    public ase(int i) {
        this.f2211d = i;
        byte[] bArr = new byte[131];
        this.f2209b = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public final void mo1297a(byte[] bArr, int i, int i2) {
        if (this.f2212e) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f2209b;
            int length = bArr2.length;
            int i4 = this.f2210c + i3;
            if (length < i4) {
                this.f2209b = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.f2209b, this.f2210c, i3);
            this.f2210c += i3;
        }
    }

    /* renamed from: b */
    public final boolean mo1298b(int i) {
        if (!this.f2212e) {
            return false;
        }
        this.f2210c -= i;
        this.f2212e = false;
        this.f2208a = true;
        return true;
    }

    /* renamed from: a */
    public final void mo1295a() {
        this.f2212e = false;
        this.f2208a = false;
    }

    /* renamed from: a */
    public final void mo1296a(int i) {
        boolean z = true;
        bks.m3512b(!this.f2212e);
        if (i != this.f2211d) {
            z = false;
        }
        this.f2212e = z;
        if (z) {
            this.f2210c = 3;
            this.f2208a = false;
        }
    }
}
