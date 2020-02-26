package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: dkn */
/* compiled from: PG */
final class dkn implements dkw {

    /* renamed from: a */
    private final dkk f8729a;

    /* renamed from: b */
    private final boolean f8730b;

    private dkn(dkk dkk) {
        this.f8730b = dkk instanceof djc;
        this.f8729a = dkk;
    }

    /* renamed from: a */
    public final boolean mo4579a(Object obj, Object obj2) {
        if (!dlw.m7050a(obj).equals(dlw.m7050a(obj2))) {
            return false;
        }
        if (this.f8730b) {
            return dkc.m6772a(obj).equals(dkc.m6772a(obj2));
        }
        return true;
    }

    /* renamed from: b */
    public final int mo4580b(Object obj) {
        dlm a = dlw.m7050a(obj);
        int i = a.f8770e;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < a.f8767b; i3++) {
                int a2 = din.m6528a(1);
                i2 += a2 + a2 + din.m6551c(2, dme.m7094b(a.f8768c[i3])) + din.m6529a(3, (dik) a.f8769d[i3]);
            }
            a.f8770e = i2;
            i = i2;
        }
        if (!this.f8730b) {
            return i;
        }
        div a3 = dkc.m6772a(obj);
        int i4 = 0;
        for (int i5 = 0; i5 < a3.f8607a.mo4612b(); i5++) {
            i4 += a3.mo4478b(a3.f8607a.mo4613b(i5));
        }
        for (Map.Entry b : a3.f8607a.mo4614c()) {
            i4 += a3.mo4478b(b);
        }
        return i + i4;
    }

    /* renamed from: a */
    public final int mo4574a(Object obj) {
        int hashCode = dlw.m7050a(obj).hashCode();
        return this.f8730b ? (hashCode * 53) + dkc.m6772a(obj).hashCode() : hashCode;
    }

    /* renamed from: d */
    public final boolean mo4583d(Object obj) {
        return dkc.m6772a(obj).mo4483e();
    }

    /* renamed from: c */
    public final void mo4582c(Object obj) {
        dlw.m7057b(obj);
        dkc.m6774b(obj);
    }

    /* renamed from: b */
    public final void mo4581b(Object obj, Object obj2) {
        dky.m6915c(obj, obj2);
        if (this.f8730b) {
            dky.m6911b(obj, obj2);
        }
    }

    /* renamed from: a */
    public final void mo4578a(Object obj, byte[] bArr, int i, int i2, dhy dhy) {
        dje dje = (dje) obj;
        dlm dlm = dje.f8677A;
        if (dlm == dlm.f8766a) {
            dlm = dlm.m6972a();
            dje.f8677A = dlm;
        }
        ((djc) obj).mo4510a();
        diq diq = null;
        while (i < i2) {
            int a = dhz.m6478a(bArr, i, dhy);
            int i3 = dhy.f8567a;
            if (i3 == dme.f8825a) {
                int i4 = 0;
                dik dik = null;
                while (a < i2) {
                    a = dhz.m6478a(bArr, a, dhy);
                    int i5 = dhy.f8567a;
                    int a2 = dme.m7092a(i5);
                    int b = dme.m7094b(i5);
                    if (b != 2) {
                        if (b == 3) {
                            if (diq != null) {
                                dkt dkt = dkt.f8733a;
                                throw null;
                            } else if (a2 == 2) {
                                a = dhz.m6490e(bArr, a, dhy);
                                dik = (dik) dhy.f8569c;
                            }
                        }
                    } else if (a2 == 0) {
                        a = dhz.m6478a(bArr, a, dhy);
                        i4 = dhy.f8567a;
                        diq = dhy.f8570d.mo4468a(this.f8729a, i4);
                    }
                    if (i5 == dme.f8826b) {
                        break;
                    }
                    a = dhz.m6470a(i5, bArr, a, i2, dhy);
                }
                if (dik != null) {
                    dlm.mo4627a(dme.m7093a(i4, 2), dik);
                }
                i = a;
            } else if (dme.m7092a(i3) == 2) {
                diq = dhy.f8570d.mo4468a(this.f8729a, dme.m7094b(i3));
                if (diq == null) {
                    i = dhz.m6472a(i3, bArr, a, i2, dlm, dhy);
                } else {
                    dkt dkt2 = dkt.f8733a;
                    throw null;
                }
            } else {
                i = dhz.m6470a(i3, bArr, a, i2, dhy);
            }
        }
        if (i != i2) {
            throw djn.m6735e();
        }
    }

    /* renamed from: a */
    public final Object mo4576a() {
        return this.f8729a.mo4519p().mo4508f();
    }

    /* renamed from: a */
    static dkn m6862a(dlw dlw, dkc dkc, dkk dkk) {
        return new dkn(dkk);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dmf.a(int, java.lang.Object):void
     arg types: [int, dik]
     candidates:
      dmf.a(int, double):void
      dmf.a(int, float):void
      dmf.a(int, int):void
      dmf.a(int, long):void
      dmf.a(int, dik):void
      dmf.a(int, boolean):void
      dmf.a(int, java.lang.Object):void */
    /* renamed from: a */
    public final void mo4577a(Object obj, dmf dmf) {
        Iterator d = dkc.m6772a(obj).mo4482d();
        while (d.hasNext()) {
            Map.Entry entry = (Map.Entry) d.next();
            diu diu = (diu) entry.getKey();
            if (diu.mo4471c() != dmd.MESSAGE || diu.mo4472d() || diu.mo4473e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (entry instanceof djp) {
                dmf.mo4449a(diu.mo4469a(), (Object) ((djr) ((djp) entry).f8695a.getValue()).mo4539a());
            } else {
                dmf.mo4449a(diu.mo4469a(), entry.getValue());
            }
        }
        dlm a = dlw.m7050a(obj);
        for (int i = 0; i < a.f8767b; i++) {
            dmf.mo4449a(dme.m7094b(a.f8768c[i]), a.f8769d[i]);
        }
    }
}
