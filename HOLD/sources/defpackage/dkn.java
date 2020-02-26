package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: dkn  reason: default package */
/* compiled from: PG */
final class dkn implements dkw {
    private final dkk a;
    private final boolean b;

    private dkn(dkk dkk) {
        this.b = dkk instanceof djc;
        this.a = dkk;
    }

    public final boolean a(Object obj, Object obj2) {
        if (!dlw.a(obj).equals(dlw.a(obj2))) {
            return false;
        }
        if (this.b) {
            return dkc.a(obj).equals(dkc.a(obj2));
        }
        return true;
    }

    public final int b(Object obj) {
        dlm a2 = dlw.a(obj);
        int i = a2.e;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < a2.b; i3++) {
                int a3 = din.a(1);
                i2 += a3 + a3 + din.c(2, dme.b(a2.c[i3])) + din.a(3, (dik) a2.d[i3]);
            }
            a2.e = i2;
            i = i2;
        }
        if (!this.b) {
            return i;
        }
        div a4 = dkc.a(obj);
        int i4 = 0;
        for (int i5 = 0; i5 < a4.a.b(); i5++) {
            i4 += a4.b(a4.a.b(i5));
        }
        for (Map.Entry b2 : a4.a.c()) {
            i4 += a4.b(b2);
        }
        return i + i4;
    }

    public final int a(Object obj) {
        int hashCode = dlw.a(obj).hashCode();
        return this.b ? (hashCode * 53) + dkc.a(obj).hashCode() : hashCode;
    }

    public final boolean d(Object obj) {
        return dkc.a(obj).e();
    }

    public final void c(Object obj) {
        dlw.b(obj);
        dkc.b(obj);
    }

    public final void b(Object obj, Object obj2) {
        dky.c(obj, obj2);
        if (this.b) {
            dky.b(obj, obj2);
        }
    }

    public final void a(Object obj, byte[] bArr, int i, int i2, dhy dhy) {
        dje dje = (dje) obj;
        dlm dlm = dje.A;
        if (dlm == dlm.a) {
            dlm = dlm.a();
            dje.A = dlm;
        }
        ((djc) obj).a();
        diq diq = null;
        while (i < i2) {
            int a2 = dhz.a(bArr, i, dhy);
            int i3 = dhy.a;
            if (i3 == dme.a) {
                int i4 = 0;
                dik dik = null;
                while (a2 < i2) {
                    a2 = dhz.a(bArr, a2, dhy);
                    int i5 = dhy.a;
                    int a3 = dme.a(i5);
                    int b2 = dme.b(i5);
                    if (b2 != 2) {
                        if (b2 == 3) {
                            if (diq != null) {
                                dkt dkt = dkt.a;
                                throw null;
                            } else if (a3 == 2) {
                                a2 = dhz.e(bArr, a2, dhy);
                                dik = (dik) dhy.c;
                            }
                        }
                    } else if (a3 == 0) {
                        a2 = dhz.a(bArr, a2, dhy);
                        i4 = dhy.a;
                        diq = dhy.d.a(this.a, i4);
                    }
                    if (i5 == dme.b) {
                        break;
                    }
                    a2 = dhz.a(i5, bArr, a2, i2, dhy);
                }
                if (dik != null) {
                    dlm.a(dme.a(i4, 2), dik);
                }
                i = a2;
            } else if (dme.a(i3) == 2) {
                diq = dhy.d.a(this.a, dme.b(i3));
                if (diq == null) {
                    i = dhz.a(i3, bArr, a2, i2, dlm, dhy);
                } else {
                    dkt dkt2 = dkt.a;
                    throw null;
                }
            } else {
                i = dhz.a(i3, bArr, a2, i2, dhy);
            }
        }
        if (i != i2) {
            throw djn.e();
        }
    }

    public final Object a() {
        return this.a.p().f();
    }

    static dkn a(dlw dlw, dkc dkc, dkk dkk) {
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
    public final void a(Object obj, dmf dmf) {
        Iterator d = dkc.a(obj).d();
        while (d.hasNext()) {
            Map.Entry entry = (Map.Entry) d.next();
            diu diu = (diu) entry.getKey();
            if (diu.c() != dmd.MESSAGE || diu.d() || diu.e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (entry instanceof djp) {
                dmf.a(diu.a(), (Object) ((djr) ((djp) entry).a.getValue()).a());
            } else {
                dmf.a(diu.a(), entry.getValue());
            }
        }
        dlm a2 = dlw.a(obj);
        for (int i = 0; i < a2.b; i++) {
            dmf.a(dme.b(a2.c[i]), a2.d[i]);
        }
    }
}
