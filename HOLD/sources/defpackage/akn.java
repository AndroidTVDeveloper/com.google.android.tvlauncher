package defpackage;

import android.util.Pair;

/* renamed from: akn  reason: default package */
/* compiled from: PG */
final class akn {
    public alh a = alh.a;
    public int b;
    public boolean c;
    public akl d;
    public akl e;
    public akl f;
    public int g;
    public Object h;
    private final alf i = new alf();
    private final alg j = new alg();
    private long k;
    private long l;

    public final boolean a(aws aws) {
        akl akl = this.f;
        return akl != null && akl.a == aws;
    }

    public final akl a() {
        akl akl = this.d;
        if (akl == null) {
            return null;
        }
        if (akl == this.e) {
            this.e = akl.g;
        }
        akl.e();
        int i2 = this.g - 1;
        this.g = i2;
        if (i2 == 0) {
            this.f = null;
            akl akl2 = this.d;
            this.h = akl2.b;
            this.l = akl2.f.a.d;
        }
        akl akl3 = this.d.g;
        this.d = akl3;
        return akl3;
    }

    public final void a(boolean z) {
        akl akl = this.d;
        if (akl != null) {
            this.h = z ? akl.b : null;
            this.l = akl.f.a.d;
            a(akl);
            akl.e();
        } else if (!z) {
            this.h = null;
        }
        this.d = null;
        this.f = null;
        this.e = null;
        this.g = 0;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: alh.a(int, alf, boolean):alf
     arg types: [int, alf, int]
     candidates:
      alh.a(int, alg, long):alg
      alh.a(int, alf, boolean):alf */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    public final akm a(akl akl, long j2) {
        long j3;
        Object obj;
        long j4;
        akl akl2 = akl;
        akm akm = akl2.f;
        long j5 = (akl2.j + akm.e) - j2;
        if (akm.f) {
            int a2 = this.a.a(this.a.a(akm.a.a), this.i, this.j, this.b);
            if (a2 == -1) {
                return null;
            }
            this.a.a(a2, this.i, true);
            Object obj2 = this.i.a;
            long j6 = akm.a.d;
            int i2 = this.a.a(0, this.j).e;
            long j7 = 0;
            if (a2 == 0) {
                Pair a3 = this.a.a(this.j, this.i, 0, -9223372036854775807L, Math.max(0L, j5));
                if (a3 == null) {
                    return null;
                }
                Object obj3 = a3.first;
                long longValue = ((Long) a3.second).longValue();
                akl akl3 = akl2.g;
                if (akl3 == null || !akl3.b.equals(obj3)) {
                    j4 = this.k;
                    this.k = 1 + j4;
                } else {
                    j4 = akl3.f.a.d;
                }
                j7 = longValue;
                j3 = j4;
                obj = obj3;
            } else {
                obj = obj2;
                j3 = j6;
            }
            return a(a(obj, j7, j3), j7);
        }
        awt awt = akm.a;
        this.a.a(awt.a, this.i);
        if (!awt.a()) {
            int a4 = this.i.a(akm.d);
            if (a4 == -1) {
                return b(awt.a, akm.e, awt.d);
            }
            this.i.b(a4);
            this.i.c();
            return null;
        }
        ayg[] aygArr = this.i.d.d;
        return null;
    }

    public final akm a(awt awt, long j2) {
        this.a.a(awt.a, this.i);
        if (awt.a()) {
            this.i.c();
            return null;
        }
        return b(awt.a, j2, awt.d);
    }

    private final akm b(Object obj, long j2, long j3) {
        int b2 = this.i.b(j2);
        awt awt = new awt(obj, j3, b2);
        boolean a2 = a(awt);
        boolean a3 = a(awt, a2);
        long a4 = b2 != -1 ? this.i.a(b2) : -9223372036854775807L;
        return new akm(awt, j2, a4, (a4 == -9223372036854775807L || a4 == Long.MIN_VALUE) ? this.i.b : a4, a2, a3);
    }

    public final akm a(akm akm) {
        long j2;
        long j3;
        awt awt = akm.a;
        boolean a2 = a(awt);
        boolean a3 = a(awt, a2);
        this.a.a(akm.a.a, this.i);
        if (awt.a()) {
            j3 = this.i.b();
        } else {
            j3 = akm.d;
            if (j3 == -9223372036854775807L || j3 == Long.MIN_VALUE) {
                j2 = this.i.b;
                return new akm(awt, akm.b, akm.d, j2, a2, a3);
            }
        }
        j2 = j3;
        return new akm(awt, akm.b, akm.d, j2, a2, a3);
    }

    private static final boolean a(awt awt) {
        return !awt.a() && awt.e == -1;
    }

    private final boolean a(awt awt, boolean z) {
        int a2 = this.a.a(awt.a);
        this.a.a(a2, this.i);
        if (this.a.a(0, this.j).d || this.a.a(a2, this.i, this.j, this.b) != -1 || !z) {
            return false;
        }
        return true;
    }

    public final void a(long j2) {
        akl akl = this.f;
        if (akl != null) {
            bks.b(akl.f());
            if (akl.d) {
                akl.a.g(akl.b(j2));
            }
        }
    }

    public final boolean a(akl akl) {
        boolean z = false;
        bks.b(akl != null);
        this.f = akl;
        while (true) {
            akl = akl.g;
            if (akl != null) {
                if (akl == this.e) {
                    this.e = this.d;
                    z = true;
                }
                akl.e();
                this.g--;
            } else {
                this.f.a((akl) null);
                return z;
            }
        }
    }

    public final awt a(Object obj, long j2) {
        long j3;
        int a2;
        this.a.a(obj, this.i);
        Object obj2 = this.h;
        if (obj2 == null || (a2 = this.a.a(obj2)) == -1) {
            akl akl = this.d;
            while (true) {
                if (akl == null) {
                    akl akl2 = this.d;
                    while (true) {
                        if (akl2 != null) {
                            int a3 = this.a.a(akl2.b);
                            if (a3 != -1) {
                                this.a.a(a3, this.i);
                                j3 = akl2.f.a.d;
                                break;
                            }
                            akl2 = akl2.g;
                        } else {
                            long j4 = this.k;
                            this.k = 1 + j4;
                            if (this.d == null) {
                                this.h = obj;
                                this.l = j4;
                            }
                            j3 = j4;
                        }
                    }
                } else if (akl.b.equals(obj)) {
                    j3 = akl.f.a.d;
                    break;
                } else {
                    akl = akl.g;
                }
            }
        } else {
            this.a.a(a2, this.i);
            j3 = this.l;
        }
        return a(obj, j2, j3);
    }

    private final awt a(Object obj, long j2, long j3) {
        this.a.a(obj, this.i);
        int a2 = this.i.a(j2);
        if (a2 == -1) {
            return new awt(obj, j3, this.i.b(j2));
        }
        return new awt(obj, a2, this.i.b(a2), j3);
    }

    public final boolean b() {
        akl akl;
        akl akl2 = this.d;
        if (akl2 == null) {
            return true;
        }
        int a2 = this.a.a(akl2.b);
        while (true) {
            a2 = this.a.a(a2, this.i, this.j, this.b);
            while (true) {
                akl = akl2.g;
                if (akl != null && !akl2.f.f) {
                    akl2 = akl;
                }
            }
            if (a2 == -1 || akl == null || this.a.a(akl.b) != a2) {
                boolean a3 = a(akl2);
                akl2.f = a(akl2.f);
            } else {
                akl2 = akl;
            }
        }
        boolean a32 = a(akl2);
        akl2.f = a(akl2.f);
        return !a32;
    }
}
