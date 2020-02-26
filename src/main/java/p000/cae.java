package p000;

import android.os.SystemClock;
import android.text.TextUtils;

/* renamed from: cae */
/* compiled from: PG */
final class cae {

    /* renamed from: a */
    public final ccz f5109a;

    /* renamed from: b */
    public final dff f5110b;

    /* renamed from: c */
    public final int f5111c;

    /* renamed from: d */
    private final dnj f5112d;

    /* renamed from: e */
    private final dff f5113e;

    public cae(dnj dnj, dff dff, dff dff2, int i, int i2) {
        this.f5112d = (dnj) cev.m4629a(dnj);
        this.f5113e = (dff) cev.m4629a(dff);
        this.f5110b = dff2;
        this.f5111c = i;
        this.f5109a = new ccz(i2);
    }

    /* renamed from: a */
    public final void mo2599a(String str, boolean z, dom dom, dnm dnm, String str2) {
        if (dom != null) {
            cag cag = (cag) this.f5113e.mo2551a();
            dja dja = (dja) dom.mo4513b(5);
            dja.mo4366a((dje) dom);
            dja l = dod.f9029g.mo4516l();
            int i = cag.f5122g;
            if (l.f8673b) {
                l.mo4505b();
                l.f8673b = false;
            }
            dod dod = (dod) l.f8672a;
            dod.f9033d = i - 1;
            int i2 = dod.f9030a | 4;
            dod.f9030a = i2;
            String str3 = cag.f5116a;
            if (str3 != null) {
                str3.getClass();
                dod.f9030a = i2 | 1;
                dod.f9031b = str3;
            }
            long longValue = cag.f5121f.longValue();
            if (l.f8673b) {
                l.mo4505b();
                l.f8673b = false;
            }
            dod dod2 = (dod) l.f8672a;
            int i3 = dod2.f9030a | 8;
            dod2.f9030a = i3;
            dod2.f9034e = longValue;
            String str4 = cag.f5118c;
            if (str4 != null) {
                str4.getClass();
                i3 |= 2;
                dod2.f9030a = i3;
                dod2.f9032c = str4;
            }
            String str5 = cag.f5117b;
            if (str5 != null) {
                str5.getClass();
                dod2.f9030a = i3 | 16;
                dod2.f9035f = str5;
            }
            if (dja.f8673b) {
                dja.mo4505b();
                dja.f8673b = false;
            }
            dom dom2 = (dom) dja.f8672a;
            dod dod3 = (dod) l.mo4509g();
            dod3.getClass();
            dom2.f9083f = dod3;
            dom2.f9078a |= 16;
            dja l2 = dog.f9046d.mo4516l();
            long freeSpace = cag.f5119d.mo2542a().getFreeSpace() / 1024;
            if (l2.f8673b) {
                l2.mo4505b();
                l2.f8673b = false;
            }
            dog dog = (dog) l2.f8672a;
            int i4 = dog.f9047a | 1;
            dog.f9047a = i4;
            dog.f9048b = freeSpace;
            long j = cag.f5120e;
            dog.f9047a = i4 | 2;
            dog.f9049c = j;
            if (dja.f8673b) {
                dja.mo4505b();
                dja.f8673b = false;
            }
            dom dom3 = (dom) dja.f8672a;
            dog dog2 = (dog) l2.mo4509g();
            dog2.getClass();
            dom3.f9093p = dog2;
            dom3.f9078a |= 4194304;
            if (!TextUtils.isEmpty(null)) {
                dob dob = dom.f9092o;
                if (dob == null) {
                    dob = dob.f9025c;
                }
                dja dja2 = (dja) dob.mo4513b(5);
                dja2.mo4366a((dje) dob);
                if (!((dob) dja2.f8672a).f9027b.isEmpty()) {
                    String str6 = ((String) null) + "::" + ((dob) dja2.f8672a).f9027b;
                    if (dja2.f8673b) {
                        dja2.mo4505b();
                        dja2.f8673b = false;
                    }
                    dob dob2 = (dob) dja2.f8672a;
                    str6.getClass();
                    dob2.f9026a |= 1;
                    dob2.f9027b = str6;
                    if (dja.f8673b) {
                        dja.mo4505b();
                        dja.f8673b = false;
                    }
                    dom dom4 = (dom) dja.f8672a;
                    dob dob3 = (dob) dja2.mo4509g();
                    dob3.getClass();
                    dom4.f9092o = dob3;
                    dom4.f9078a |= 1048576;
                } else {
                    if (dja2.f8673b) {
                        dja2.mo4505b();
                        dja2.f8673b = false;
                    }
                    dob dob4 = (dob) dja2.f8672a;
                    throw null;
                }
            }
            dom dom5 = (dom) dja.mo4509g();
            dja dja3 = (dja) dom5.mo4513b(5);
            dja3.mo4366a((dje) dom5);
            if (!z) {
                if (str != null) {
                    if (dja3.f8673b) {
                        dja3.mo4505b();
                        dja3.f8673b = false;
                    }
                    dom dom6 = (dom) dja3.f8672a;
                    str.getClass();
                    dom6.f9078a |= 4;
                    dom6.f9081d = str;
                } else {
                    if (dja3.f8673b) {
                        dja3.mo4505b();
                        dja3.f8673b = false;
                    }
                    dom dom7 = (dom) dja3.f8672a;
                    dom7.f9078a &= -5;
                    dom7.f9081d = dom.f9077q.f9081d;
                }
            } else if (str != null) {
                if (dja3.f8673b) {
                    dja3.mo4505b();
                    dja3.f8673b = false;
                }
                dom dom8 = (dom) dja3.f8672a;
                str.getClass();
                dom8.f9078a |= 65536;
                dom8.f9091n = str;
            } else {
                if (dja3.f8673b) {
                    dja3.mo4505b();
                    dja3.f8673b = false;
                }
                dom dom9 = (dom) dja3.f8672a;
                dom9.f9078a &= -65537;
                dom9.f9091n = dom.f9077q.f9091n;
            }
            if (str2 != null) {
                dja l3 = dob.f9025c.mo4516l();
                if (l3.f8673b) {
                    l3.mo4505b();
                    l3.f8673b = false;
                }
                dob dob5 = (dob) l3.f8672a;
                str2.getClass();
                dob5.f9026a |= 1;
                dob5.f9027b = str2;
                if (dja3.f8673b) {
                    dja3.mo4505b();
                    dja3.f8673b = false;
                }
                dom dom10 = (dom) dja3.f8672a;
                dob dob6 = (dob) l3.mo4509g();
                dob6.getClass();
                dom10.f9092o = dob6;
                dom10.f9078a |= 1048576;
            }
            ((cdh) this.f5112d.mo2550a()).mo2603a((dom) dja3.mo4509g());
            ccz ccz = this.f5109a;
            synchronized (ccz.f5293a) {
                ccz.f5295c++;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - ccz.f5296d > 1000) {
                    ccz.f5295c = 0;
                    ccz.f5296d = elapsedRealtime;
                }
            }
            return;
        }
        String valueOf = String.valueOf(str);
        bog.m3837c("MetricRecorder", valueOf.length() == 0 ? new String("metric is null, skipping recorded metric for event: ") : "metric is null, skipping recorded metric for event: ".concat(valueOf), new Object[0]);
    }
}
