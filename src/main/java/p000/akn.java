package p000;

import android.util.Pair;

/* renamed from: akn */
/* compiled from: PG */
final class akn {

    /* renamed from: a */
    public alh f598a = alh.f685a;

    /* renamed from: b */
    public int f599b;

    /* renamed from: c */
    public boolean f600c;

    /* renamed from: d */
    public akl f601d;

    /* renamed from: e */
    public akl f602e;

    /* renamed from: f */
    public akl f603f;

    /* renamed from: g */
    public int f604g;

    /* renamed from: h */
    public Object f605h;

    /* renamed from: i */
    private final alf f606i = new alf();

    /* renamed from: j */
    private final alg f607j = new alg();

    /* renamed from: k */
    private long f608k;

    /* renamed from: l */
    private long f609l;

    /* renamed from: a */
    public final boolean mo456a(aws aws) {
        akl akl = this.f603f;
        return akl != null && akl.f577a == aws;
    }

    /* renamed from: a */
    public final akl mo448a() {
        akl akl = this.f601d;
        if (akl == null) {
            return null;
        }
        if (akl == this.f602e) {
            this.f602e = akl.f583g;
        }
        akl.mo444e();
        int i = this.f604g - 1;
        this.f604g = i;
        if (i == 0) {
            this.f603f = null;
            akl akl2 = this.f601d;
            this.f605h = akl2.f578b;
            this.f609l = akl2.f582f.f591a.f2569d;
        }
        akl akl3 = this.f601d.f583g;
        this.f601d = akl3;
        return akl3;
    }

    /* renamed from: a */
    public final void mo454a(boolean z) {
        akl akl = this.f601d;
        if (akl != null) {
            this.f605h = z ? akl.f578b : null;
            this.f609l = akl.f582f.f591a.f2569d;
            mo455a(akl);
            akl.mo444e();
        } else if (!z) {
            this.f605h = null;
        }
        this.f601d = null;
        this.f603f = null;
        this.f602e = null;
        this.f604g = 0;
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
    /* renamed from: a */
    public final akm mo449a(akl akl, long j) {
        long j2;
        Object obj;
        long j3;
        akl akl2 = akl;
        akm akm = akl2.f582f;
        long j4 = (akl2.f586j + akm.f595e) - j;
        if (akm.f596f) {
            int a = this.f598a.mo546a(this.f598a.mo525a(akm.f591a.f2566a), this.f606i, this.f607j, this.f599b);
            if (a == -1) {
                return null;
            }
            this.f598a.mo526a(a, this.f606i, true);
            Object obj2 = this.f606i.f667a;
            long j5 = akm.f591a.f2569d;
            int i = this.f598a.mo548a(0, this.f607j).f676e;
            long j6 = 0;
            if (a == 0) {
                Pair a2 = this.f598a.mo550a(this.f607j, this.f606i, 0, -9223372036854775807L, Math.max(0L, j4));
                if (a2 == null) {
                    return null;
                }
                Object obj3 = a2.first;
                long longValue = ((Long) a2.second).longValue();
                akl akl3 = akl2.f583g;
                if (akl3 == null || !akl3.f578b.equals(obj3)) {
                    j3 = this.f608k;
                    this.f608k = 1 + j3;
                } else {
                    j3 = akl3.f582f.f591a.f2569d;
                }
                j6 = longValue;
                j2 = j3;
                obj = obj3;
            } else {
                obj = obj2;
                j2 = j5;
            }
            return mo451a(m768a(obj, j6, j2), j6);
        }
        awt awt = akm.f591a;
        this.f598a.mo547a(awt.f2566a, this.f606i);
        if (!awt.mo1504a()) {
            int a3 = this.f606i.mo530a(akm.f594d);
            if (a3 == -1) {
                return m771b(awt.f2566a, akm.f595e, awt.f2569d);
            }
            this.f606i.mo534b(a3);
            this.f606i.mo537c();
            return null;
        }
        ayg[] aygArr = this.f606i.f670d.f2760d;
        return null;
    }

    /* renamed from: a */
    public final akm mo451a(awt awt, long j) {
        this.f598a.mo547a(awt.f2566a, this.f606i);
        if (awt.mo1504a()) {
            this.f606i.mo537c();
            return null;
        }
        return m771b(awt.f2566a, j, awt.f2569d);
    }

    /* renamed from: b */
    private final akm m771b(Object obj, long j, long j2) {
        int b = this.f606i.mo535b(j);
        awt awt = new awt(obj, j2, b);
        boolean a = m769a(awt);
        boolean a2 = m770a(awt, a);
        long a3 = b != -1 ? this.f606i.mo532a(b) : -9223372036854775807L;
        return new akm(awt, j, a3, (a3 == -9223372036854775807L || a3 == Long.MIN_VALUE) ? this.f606i.f668b : a3, a, a2);
    }

    /* renamed from: a */
    public final akm mo450a(akm akm) {
        long j;
        long j2;
        awt awt = akm.f591a;
        boolean a = m769a(awt);
        boolean a2 = m770a(awt, a);
        this.f598a.mo547a(akm.f591a.f2566a, this.f606i);
        if (awt.mo1504a()) {
            j2 = this.f606i.mo536b();
        } else {
            j2 = akm.f594d;
            if (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) {
                j = this.f606i.f668b;
                return new akm(awt, akm.f592b, akm.f594d, j, a, a2);
            }
        }
        j = j2;
        return new akm(awt, akm.f592b, akm.f594d, j, a, a2);
    }

    /* renamed from: a */
    private static final boolean m769a(awt awt) {
        return !awt.mo1504a() && awt.f2570e == -1;
    }

    /* renamed from: a */
    private final boolean m770a(awt awt, boolean z) {
        int a = this.f598a.mo525a(awt.f2566a);
        this.f598a.mo551a(a, this.f606i);
        if (this.f598a.mo548a(0, this.f607j).f675d || this.f598a.mo546a(a, this.f606i, this.f607j, this.f599b) != -1 || !z) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo453a(long j) {
        akl akl = this.f603f;
        if (akl != null) {
            bks.m3512b(akl.mo445f());
            if (akl.f580d) {
                akl.f577a.mo1492g(akl.mo440b(j));
            }
        }
    }

    /* renamed from: a */
    public final boolean mo455a(akl akl) {
        boolean z = false;
        bks.m3512b(akl != null);
        this.f603f = akl;
        while (true) {
            akl = akl.f583g;
            if (akl != null) {
                if (akl == this.f602e) {
                    this.f602e = this.f601d;
                    z = true;
                }
                akl.mo444e();
                this.f604g--;
            } else {
                this.f603f.mo439a((akl) null);
                return z;
            }
        }
    }

    /* renamed from: a */
    public final awt mo452a(Object obj, long j) {
        long j2;
        int a;
        this.f598a.mo547a(obj, this.f606i);
        Object obj2 = this.f605h;
        if (obj2 == null || (a = this.f598a.mo525a(obj2)) == -1) {
            akl akl = this.f601d;
            while (true) {
                if (akl == null) {
                    akl akl2 = this.f601d;
                    while (true) {
                        if (akl2 != null) {
                            int a2 = this.f598a.mo525a(akl2.f578b);
                            if (a2 != -1) {
                                this.f598a.mo551a(a2, this.f606i);
                                j2 = akl2.f582f.f591a.f2569d;
                                break;
                            }
                            akl2 = akl2.f583g;
                        } else {
                            long j3 = this.f608k;
                            this.f608k = 1 + j3;
                            if (this.f601d == null) {
                                this.f605h = obj;
                                this.f609l = j3;
                            }
                            j2 = j3;
                        }
                    }
                } else if (akl.f578b.equals(obj)) {
                    j2 = akl.f582f.f591a.f2569d;
                    break;
                } else {
                    akl = akl.f583g;
                }
            }
        } else {
            this.f598a.mo551a(a, this.f606i);
            j2 = this.f609l;
        }
        return m768a(obj, j, j2);
    }

    /* renamed from: a */
    private final awt m768a(Object obj, long j, long j2) {
        this.f598a.mo547a(obj, this.f606i);
        int a = this.f606i.mo530a(j);
        if (a == -1) {
            return new awt(obj, j2, this.f606i.mo535b(j));
        }
        return new awt(obj, a, this.f606i.mo534b(a), j2);
    }

    /* renamed from: b */
    public final boolean mo457b() {
        akl akl;
        akl akl2 = this.f601d;
        if (akl2 == null) {
            return true;
        }
        int a = this.f598a.mo525a(akl2.f578b);
        while (true) {
            a = this.f598a.mo546a(a, this.f606i, this.f607j, this.f599b);
            while (true) {
                akl = akl2.f583g;
                if (akl != null && !akl2.f582f.f596f) {
                    akl2 = akl;
                }
            }
            if (a == -1 || akl == null || this.f598a.mo525a(akl.f578b) != a) {
                boolean a2 = mo455a(akl2);
                akl2.f582f = mo450a(akl2.f582f);
            } else {
                akl2 = akl;
            }
        }
        boolean a22 = mo455a(akl2);
        akl2.f582f = mo450a(akl2.f582f);
        return !a22;
    }
}
