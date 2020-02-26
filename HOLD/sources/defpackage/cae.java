package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;

/* renamed from: cae  reason: default package */
/* compiled from: PG */
final class cae {
    public final ccz a;
    public final dff b;
    public final int c;
    private final dnj d;
    private final dff e;

    public cae(dnj dnj, dff dff, dff dff2, int i, int i2) {
        this.d = (dnj) cev.a(dnj);
        this.e = (dff) cev.a(dff);
        this.b = dff2;
        this.c = i;
        this.a = new ccz(i2);
    }

    public final void a(String str, boolean z, dom dom, dnm dnm, String str2) {
        if (dom != null) {
            cag cag = (cag) this.e.a();
            dja dja = (dja) dom.b(5);
            dja.a((dje) dom);
            dja l = dod.g.l();
            int i = cag.g;
            if (l.b) {
                l.b();
                l.b = false;
            }
            dod dod = (dod) l.a;
            dod.d = i - 1;
            int i2 = dod.a | 4;
            dod.a = i2;
            String str3 = cag.a;
            if (str3 != null) {
                str3.getClass();
                dod.a = i2 | 1;
                dod.b = str3;
            }
            long longValue = cag.f.longValue();
            if (l.b) {
                l.b();
                l.b = false;
            }
            dod dod2 = (dod) l.a;
            int i3 = dod2.a | 8;
            dod2.a = i3;
            dod2.e = longValue;
            String str4 = cag.c;
            if (str4 != null) {
                str4.getClass();
                i3 |= 2;
                dod2.a = i3;
                dod2.c = str4;
            }
            String str5 = cag.b;
            if (str5 != null) {
                str5.getClass();
                dod2.a = i3 | 16;
                dod2.f = str5;
            }
            if (dja.b) {
                dja.b();
                dja.b = false;
            }
            dom dom2 = (dom) dja.a;
            dod dod3 = (dod) l.g();
            dod3.getClass();
            dom2.f = dod3;
            dom2.a |= 16;
            dja l2 = dog.d.l();
            long freeSpace = cag.d.a().getFreeSpace() / 1024;
            if (l2.b) {
                l2.b();
                l2.b = false;
            }
            dog dog = (dog) l2.a;
            int i4 = dog.a | 1;
            dog.a = i4;
            dog.b = freeSpace;
            long j = cag.e;
            dog.a = i4 | 2;
            dog.c = j;
            if (dja.b) {
                dja.b();
                dja.b = false;
            }
            dom dom3 = (dom) dja.a;
            dog dog2 = (dog) l2.g();
            dog2.getClass();
            dom3.p = dog2;
            dom3.a |= 4194304;
            if (!TextUtils.isEmpty(null)) {
                dob dob = dom.o;
                if (dob == null) {
                    dob = dob.c;
                }
                dja dja2 = (dja) dob.b(5);
                dja2.a((dje) dob);
                if (!((dob) dja2.a).b.isEmpty()) {
                    String str6 = ((String) null) + "::" + ((dob) dja2.a).b;
                    if (dja2.b) {
                        dja2.b();
                        dja2.b = false;
                    }
                    dob dob2 = (dob) dja2.a;
                    str6.getClass();
                    dob2.a |= 1;
                    dob2.b = str6;
                    if (dja.b) {
                        dja.b();
                        dja.b = false;
                    }
                    dom dom4 = (dom) dja.a;
                    dob dob3 = (dob) dja2.g();
                    dob3.getClass();
                    dom4.o = dob3;
                    dom4.a |= 1048576;
                } else {
                    if (dja2.b) {
                        dja2.b();
                        dja2.b = false;
                    }
                    dob dob4 = (dob) dja2.a;
                    throw null;
                }
            }
            dom dom5 = (dom) dja.g();
            dja dja3 = (dja) dom5.b(5);
            dja3.a((dje) dom5);
            if (!z) {
                if (str != null) {
                    if (dja3.b) {
                        dja3.b();
                        dja3.b = false;
                    }
                    dom dom6 = (dom) dja3.a;
                    str.getClass();
                    dom6.a |= 4;
                    dom6.d = str;
                } else {
                    if (dja3.b) {
                        dja3.b();
                        dja3.b = false;
                    }
                    dom dom7 = (dom) dja3.a;
                    dom7.a &= -5;
                    dom7.d = dom.q.d;
                }
            } else if (str != null) {
                if (dja3.b) {
                    dja3.b();
                    dja3.b = false;
                }
                dom dom8 = (dom) dja3.a;
                str.getClass();
                dom8.a |= 65536;
                dom8.n = str;
            } else {
                if (dja3.b) {
                    dja3.b();
                    dja3.b = false;
                }
                dom dom9 = (dom) dja3.a;
                dom9.a &= -65537;
                dom9.n = dom.q.n;
            }
            if (str2 != null) {
                dja l3 = dob.c.l();
                if (l3.b) {
                    l3.b();
                    l3.b = false;
                }
                dob dob5 = (dob) l3.a;
                str2.getClass();
                dob5.a |= 1;
                dob5.b = str2;
                if (dja3.b) {
                    dja3.b();
                    dja3.b = false;
                }
                dom dom10 = (dom) dja3.a;
                dob dob6 = (dob) l3.g();
                dob6.getClass();
                dom10.o = dob6;
                dom10.a |= 1048576;
            }
            ((cdh) this.d.a()).a((dom) dja3.g());
            ccz ccz = this.a;
            synchronized (ccz.a) {
                ccz.c++;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - ccz.d > 1000) {
                    ccz.c = 0;
                    ccz.d = elapsedRealtime;
                }
            }
            return;
        }
        String valueOf = String.valueOf(str);
        bog.c("MetricRecorder", valueOf.length() == 0 ? new String("metric is null, skipping recorded metric for event: ") : "metric is null, skipping recorded metric for event: ".concat(valueOf), new Object[0]);
    }
}
