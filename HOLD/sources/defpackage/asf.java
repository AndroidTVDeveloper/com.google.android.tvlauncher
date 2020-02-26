package defpackage;

import android.util.Log;

/* renamed from: asf  reason: default package */
/* compiled from: PG */
public final class asf implements asx {
    private final art a;
    private final bkx b = new bkx(new byte[10]);
    private int c = 0;
    private int d;
    private blj e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private boolean k;

    public asf(art art) {
        this.a = art;
    }

    public final void a(bky bky, int i2) {
        long j2;
        int i3;
        bky bky2 = bky;
        int i4 = -1;
        int i5 = 2;
        if ((i2 & 1) != 0) {
            int i6 = this.c;
            if (!(i6 == 0 || i6 == 1)) {
                if (i6 != 2) {
                    int i7 = this.j;
                    if (i7 != -1) {
                        StringBuilder sb = new StringBuilder(59);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i7);
                        sb.append(" more bytes");
                        Log.w("PesReader", sb.toString());
                    }
                    this.a.b();
                } else {
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            a(1);
        }
        int i8 = i2;
        while (bky.b() > 0) {
            int i9 = this.c;
            if (i9 != 0) {
                int i10 = 0;
                if (i9 != 1) {
                    if (i9 != i5) {
                        int b2 = bky.b();
                        int i11 = this.j;
                        if (i11 != i4) {
                            i10 = b2 - i11;
                        }
                        if (i10 > 0) {
                            b2 -= i10;
                            bky2.b(bky2.b + b2);
                        }
                        this.a.a(bky2);
                        int i12 = this.j;
                        if (i12 != i4) {
                            int i13 = i12 - b2;
                            this.j = i13;
                            if (i13 == 0) {
                                this.a.b();
                                a(1);
                            }
                        }
                    } else {
                        if (!a(bky2, this.b.a, Math.min(10, this.i))) {
                            i4 = -1;
                        } else if (a(bky2, (byte[]) null, this.i)) {
                            this.b.a(0);
                            if (this.f) {
                                this.b.b(4);
                                int c2 = this.b.c(3);
                                this.b.b(1);
                                int c3 = this.b.c(15);
                                this.b.b(1);
                                long c4 = ((long) (c3 << 15)) | (((long) c2) << 30) | ((long) this.b.c(15));
                                this.b.b(1);
                                if (!this.h && this.g) {
                                    this.b.b(4);
                                    int c5 = this.b.c(3);
                                    this.b.b(1);
                                    int c6 = this.b.c(15);
                                    this.b.b(1);
                                    int c7 = this.b.c(15);
                                    this.b.b(1);
                                    this.e.b((((long) c5) << 30) | ((long) (c6 << 15)) | ((long) c7));
                                    this.h = true;
                                }
                                j2 = this.e.b(c4);
                            } else {
                                j2 = -9223372036854775807L;
                            }
                            if (!this.k) {
                                i3 = 0;
                            } else {
                                i3 = 4;
                            }
                            i8 |= i3;
                            this.a.a(j2, i8);
                            a(3);
                            i4 = -1;
                            i5 = 2;
                        } else {
                            i4 = -1;
                        }
                    }
                } else if (a(bky2, this.b.a, 9)) {
                    int i14 = 0;
                    this.b.a(0);
                    int c8 = this.b.c(24);
                    if (c8 != 1) {
                        StringBuilder sb2 = new StringBuilder(41);
                        sb2.append("Unexpected start code prefix: ");
                        sb2.append(c8);
                        Log.w("PesReader", sb2.toString());
                        i4 = -1;
                        this.j = -1;
                    } else {
                        this.b.b(8);
                        int c9 = this.b.c(16);
                        this.b.b(5);
                        this.k = this.b.e();
                        this.b.b(2);
                        this.f = this.b.e();
                        this.g = this.b.e();
                        this.b.b(6);
                        int c10 = this.b.c(8);
                        this.i = c10;
                        if (c9 != 0) {
                            this.j = (c9 - 3) - c10;
                            i4 = -1;
                            i14 = 2;
                        } else {
                            i4 = -1;
                            this.j = -1;
                            i14 = 2;
                        }
                    }
                    a(i14);
                } else {
                    i4 = -1;
                }
            } else {
                bky2.d(bky.b());
            }
            i5 = 2;
        }
    }

    private final boolean a(bky bky, byte[] bArr, int i2) {
        int min = Math.min(bky.b(), i2 - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr != null) {
            bky.a(bArr, this.d, min);
        } else {
            bky.d(min);
        }
        int i3 = this.d + min;
        this.d = i3;
        if (i3 != i2) {
            return false;
        }
        return true;
    }

    public final void a(blj blj, aok aok, asw asw) {
        this.e = blj;
        this.a.a(aok, asw);
    }

    public final void a() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.a();
    }

    private final void a(int i2) {
        this.c = i2;
        this.d = 0;
    }
}
