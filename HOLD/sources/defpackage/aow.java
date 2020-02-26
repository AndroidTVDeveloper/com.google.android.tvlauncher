package defpackage;

import java.io.EOFException;
import java.util.Arrays;

/* renamed from: aow  reason: default package */
/* compiled from: PG */
public final class aow implements aoi {
    private static final int[] a = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] b = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    private static final byte[] c = blm.c("#!AMR\n");
    private static final byte[] d = blm.c("#!AMR-WB\n");
    private static final int e = b[8];
    private final byte[] f;
    private boolean g;
    private long h;
    private int i;
    private int j;
    private boolean k;
    private int l;
    private int m;
    private aok n;
    private aov o;
    private aos p;
    private boolean q;

    public aow() {
        this((byte) 0);
    }

    public aow(byte b2) {
        this.f = new byte[1];
        this.l = -1;
    }

    public final void a(aok aok) {
        this.n = aok;
        this.o = aok.a(0, 1);
        aok.S();
    }

    private static final boolean a(aoj aoj, byte[] bArr) {
        aoj.a();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        aoj.c(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    public final int a(aoj aoj, aop aop) {
        String str;
        if (((aof) aoj).c == 0 && !b(aoj)) {
            throw new ako("Could not find AMR header.");
        }
        if (!this.q) {
            this.q = true;
            boolean z = this.g;
            if (!z) {
                str = "audio/3gpp";
            } else {
                str = "audio/amr-wb";
            }
            this.o.a(akh.a(null, str, -1, e, 1, !z ? 8000 : 16000, -1, null, null, 0, null));
        }
        int c2 = c(aoj);
        if (!this.k) {
            aor aor = new aor(-9223372036854775807L);
            this.p = aor;
            this.n.a(aor);
            this.k = true;
        }
        return c2;
    }

    private final boolean b(aoj aoj) {
        if (a(aoj, c)) {
            this.g = false;
            aoj.a(c.length);
            return true;
        } else if (!a(aoj, d)) {
            return false;
        } else {
            this.g = true;
            aoj.a(d.length);
            return true;
        }
    }

    private final int c(aoj aoj) {
        String str;
        int i2 = this.j;
        if (i2 == 0) {
            try {
                aoj.a();
                aoj.c(this.f, 0, 1);
                byte b2 = this.f[0];
                if ((b2 & 131) <= 0) {
                    int i3 = (b2 >> 3) & 15;
                    boolean z = this.g;
                    if (!z || (i3 >= 10 && i3 <= 13)) {
                        if (!z) {
                            if (i3 >= 12) {
                                if (i3 > 14) {
                                }
                            }
                        }
                        if (!z) {
                            str = "NB";
                        } else {
                            str = "WB";
                        }
                        StringBuilder sb = new StringBuilder(str.length() + 35);
                        sb.append("Illegal AMR ");
                        sb.append(str);
                        sb.append(" frame type ");
                        sb.append(i3);
                        throw new ako(sb.toString());
                    }
                    i2 = !z ? a[i3] : b[i3];
                    this.i = i2;
                    this.j = i2;
                    int i4 = this.l;
                    if (i4 == -1) {
                        this.l = i2;
                        i4 = i2;
                    }
                    if (i4 == i2) {
                        this.m++;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(42);
                    sb2.append("Invalid padding bits for frame header ");
                    sb2.append((int) b2);
                    throw new ako(sb2.toString());
                }
            } catch (EOFException e2) {
                return -1;
            }
        }
        int a2 = this.o.a(aoj, i2, true);
        if (a2 == -1) {
            return -1;
        }
        int i5 = this.j - a2;
        this.j = i5;
        if (i5 <= 0) {
            this.o.a(this.h, 1, this.i, 0, null);
            this.h += 20000;
        }
        return 0;
    }

    public final void a(long j2, long j3) {
        this.h = 0;
        this.i = 0;
        this.j = 0;
    }

    public final boolean a(aoj aoj) {
        return b(aoj);
    }
}
