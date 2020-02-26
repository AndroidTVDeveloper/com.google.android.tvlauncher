package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

/* renamed from: cdq */
/* compiled from: PG */
public final class cdq implements cdh {

    /* renamed from: a */
    private static final cdp f5325a = new cdm();

    /* renamed from: c */
    private static final cdp f5326c = new cdn();

    /* renamed from: d */
    private static final cdp f5327d = new cdo();

    /* renamed from: e */
    private final Context f5328e;

    /* renamed from: f */
    private final cdf f5329f;

    /* renamed from: g */
    private final String f5330g;

    /* renamed from: h */
    private volatile bmy f5331h;

    public /* synthetic */ cdq(Context context, String str, cdf cdf) {
        this.f5328e = context;
        this.f5330g = (String) cev.m4629a(str);
        this.f5329f = (cdf) cev.m4629a(cdf);
    }

    /* renamed from: a */
    public static void m4584a(Status status) {
        bog.m3829a(2, "ClearcutTransmitter", "handleResult, success: %b", Boolean.valueOf(status.mo3189b()));
        if (!status.mo3189b()) {
            bog.m3832a("ClearcutTransmitter", "Clearcut logging failed", new Object[0]);
        }
    }

    public cdq() {
    }

    /* renamed from: a */
    private static void m4583a(cdp cdp, dkj dkj) {
        if (TextUtils.isEmpty(cdp.mo2681b(dkj))) {
            cdp.mo2680a(dkj, bzo.m4422a(cdp.mo2679a(dkj)));
        } else {
            cdp.mo2680a(dkj, null);
        }
        cdp.mo2682c(dkj);
    }

    /* renamed from: a */
    public final void mo2603a(dom dom) {
        dja dja = (dja) dom.mo4513b(5);
        dja.mo4366a((dje) dom);
        m4583a(f5325a, dja);
        dom dom2 = (dom) dja.f8672a;
        if ((dom2.f9078a & 512) != 0) {
            dnl dnl = dom2.f9088k;
            if (dnl == null) {
                dnl = dnl.f8952c;
            }
            if ((dnl.f8953a & 1) != 0) {
                dnl dnl2 = ((dom) dja.f8672a).f9088k;
                if (dnl2 == null) {
                    dnl2 = dnl.f8952c;
                }
                dnk dnk = dnl2.f8954b;
                if (dnk == null) {
                    dnk = dnk.f8947e;
                }
                dja dja2 = (dja) dnk.mo4513b(5);
                dja2.mo4366a((dje) dnk);
                m4583a(f5326c, dja2);
                dnl dnl3 = ((dom) dja.f8672a).f9088k;
                if (dnl3 == null) {
                    dnl3 = dnl.f8952c;
                }
                dja dja3 = (dja) dnl3.mo4513b(5);
                dja3.mo4366a((dje) dnl3);
                if (dja3.f8673b) {
                    dja3.mo4505b();
                    dja3.f8673b = false;
                }
                dnl dnl4 = (dnl) dja3.f8672a;
                dnk dnk2 = (dnk) dja2.mo4509g();
                dnk2.getClass();
                dnl4.f8954b = dnk2;
                dnl4.f8953a |= 1;
                if (dja.f8673b) {
                    dja.mo4505b();
                    dja.f8673b = false;
                }
                dom dom3 = (dom) dja.f8672a;
                dnl dnl5 = (dnl) dja3.mo4509g();
                dom dom4 = dom.f9077q;
                dnl5.getClass();
                dom3.f9088k = dnl5;
                dom3.f9078a |= 512;
            }
        }
        dom dom5 = (dom) dja.f8672a;
        if ((dom5.f9078a & 256) != 0) {
            doi doi = dom5.f9087j;
            if (doi == null) {
                doi = doi.f9054k;
            }
            if (doi.f9064j.size() != 0) {
                doi doi2 = ((dom) dja.f8672a).f9087j;
                if (doi2 == null) {
                    doi2 = doi.f9054k;
                }
                dja dja4 = (dja) doi2.mo4513b(5);
                dja4.mo4366a((dje) doi2);
                for (int i = 0; i < ((doi) dja4.f8672a).f9064j.size(); i++) {
                    doh doh = (doh) ((doi) dja4.f8672a).f9064j.get(i);
                    dja dja5 = (dja) doh.mo4513b(5);
                    dja5.mo4366a((dje) doh);
                    if (!TextUtils.isEmpty(((doh) dja5.f8672a).f9052b)) {
                        if (dja5.f8673b) {
                            dja5.mo4505b();
                            dja5.f8673b = false;
                        }
                        doh doh2 = doh.f9050d;
                        ((doh) dja5.f8672a).f9053c = doh.m6694n();
                        for (String a : m4585a(((doh) dja5.f8672a).f9052b)) {
                            long longValue = bzo.m4422a(a).longValue();
                            if (dja5.f8673b) {
                                dja5.mo4505b();
                                dja5.f8673b = false;
                            }
                            doh doh3 = (doh) dja5.f8672a;
                            if (!doh3.f9053c.mo4374a()) {
                                doh3.f9053c = dje.m6689a(doh3.f9053c);
                            }
                            doh3.f9053c.mo4528a(longValue);
                        }
                    }
                    if (dja5.f8673b) {
                        dja5.mo4505b();
                        dja5.f8673b = false;
                    }
                    doh doh4 = (doh) dja5.f8672a;
                    doh doh5 = doh.f9050d;
                    doh4.f9051a &= -2;
                    doh4.f9052b = doh.f9050d.f9052b;
                    if (dja4.f8673b) {
                        dja4.mo4505b();
                        dja4.f8673b = false;
                    }
                    doi doi3 = (doi) dja4.f8672a;
                    doh doh6 = (doh) dja5.mo4509g();
                    doh6.getClass();
                    if (!doi3.f9064j.mo4374a()) {
                        doi3.f9064j = dje.m6690a(doi3.f9064j);
                    }
                    doi3.f9064j.set(i, doh6);
                }
                if (dja.f8673b) {
                    dja.mo4505b();
                    dja.f8673b = false;
                }
                dom dom6 = (dom) dja.f8672a;
                doi doi4 = (doi) dja4.mo4509g();
                dom dom7 = dom.f9077q;
                doi4.getClass();
                dom6.f9087j = doi4;
                dom6.f9078a |= 256;
            }
        }
        dom dom8 = (dom) dja.f8672a;
        if ((dom8.f9078a & 32) != 0) {
            dnt dnt = dom8.f9084g;
            if (dnt == null) {
                dnt = dnt.f8996b;
            }
            if (dnt.f8997a.size() != 0) {
                dnt dnt2 = ((dom) dja.f8672a).f9084g;
                if (dnt2 == null) {
                    dnt2 = dnt.f8996b;
                }
                dja dja6 = (dja) dnt2.mo4513b(5);
                dja6.mo4366a((dje) dnt2);
                for (int i2 = 0; i2 < ((dnt) dja6.f8672a).f8997a.size(); i2++) {
                    dns dns = (dns) ((dnt) dja6.f8672a).f8997a.get(i2);
                    dja dja7 = (dja) dns.mo4513b(5);
                    dja7.mo4366a((dje) dns);
                    if (!TextUtils.isEmpty(((dns) dja7.f8672a).f8994b)) {
                        if (dja7.f8673b) {
                            dja7.mo4505b();
                            dja7.f8673b = false;
                        }
                        dns dns2 = dns.f8992d;
                        ((dns) dja7.f8672a).f8995c = dns.m6694n();
                        String[] a2 = m4585a(((dns) dja7.f8672a).f8994b);
                        int length = a2.length;
                        long[] jArr = new long[length];
                        for (int i3 = 0; i3 < length; i3++) {
                            jArr[i3] = bzo.m4422a(a2[i3]).longValue();
                        }
                        for (int i4 = 0; i4 < length; i4++) {
                            long j = jArr[i4];
                            if (dja7.f8673b) {
                                dja7.mo4505b();
                                dja7.f8673b = false;
                            }
                            dns dns3 = (dns) dja7.f8672a;
                            if (!dns3.f8995c.mo4374a()) {
                                dns3.f8995c = dje.m6689a(dns3.f8995c);
                            }
                            dns3.f8995c.mo4528a(j);
                        }
                    }
                    if (dja7.f8673b) {
                        dja7.mo4505b();
                        dja7.f8673b = false;
                    }
                    dns dns4 = (dns) dja7.f8672a;
                    dns dns5 = dns.f8992d;
                    dns4.f8993a &= -262145;
                    dns4.f8994b = dns.f8992d.f8994b;
                    if (dja6.f8673b) {
                        dja6.mo4505b();
                        dja6.f8673b = false;
                    }
                    dnt dnt3 = (dnt) dja6.f8672a;
                    dns dns6 = (dns) dja7.mo4509g();
                    dns6.getClass();
                    if (!dnt3.f8997a.mo4374a()) {
                        dnt3.f8997a = dje.m6690a(dnt3.f8997a);
                    }
                    dnt3.f8997a.set(i2, dns6);
                }
                if (dja.f8673b) {
                    dja.mo4505b();
                    dja.f8673b = false;
                }
                dom dom9 = (dom) dja.f8672a;
                dnt dnt4 = (dnt) dja6.mo4509g();
                dom dom10 = dom.f9077q;
                dnt4.getClass();
                dom9.f9084g = dnt4;
                dom9.f9078a |= 32;
            }
        }
        dom dom11 = (dom) dja.f8672a;
        if ((dom11.f9078a & 32768) != 0) {
            dnw dnw = dom11.f9090m;
            if (dnw == null) {
                dnw = dnw.f9000e;
            }
            if (dnw.f9004d.size() != 0) {
                dnw dnw2 = ((dom) dja.f8672a).f9090m;
                if (dnw2 == null) {
                    dnw2 = dnw.f9000e;
                }
                dja dja8 = (dja) dnw2.mo4513b(5);
                dja8.mo4366a((dje) dnw2);
                for (int i5 = 0; i5 < ((dnw) dja8.f8672a).f9004d.size(); i5++) {
                    dny dny = (dny) ((dnw) dja8.f8672a).f9004d.get(i5);
                    dja dja9 = (dja) dny.mo4513b(5);
                    dja9.mo4366a((dje) dny);
                    m4583a(f5327d, dja9);
                    if (dja8.f8673b) {
                        dja8.mo4505b();
                        dja8.f8673b = false;
                    }
                    dnw dnw3 = (dnw) dja8.f8672a;
                    dny dny2 = (dny) dja9.mo4509g();
                    dny2.getClass();
                    dnw3.mo4679a();
                    dnw3.f9004d.set(i5, dny2);
                }
                if (dja.f8673b) {
                    dja.mo4505b();
                    dja.f8673b = false;
                }
                dom dom12 = (dom) dja.f8672a;
                dnw dnw4 = (dnw) dja8.mo4509g();
                dom dom13 = dom.f9077q;
                dnw4.getClass();
                dom12.f9090m = dnw4;
                dom12.f9078a |= 32768;
            }
        }
        byte[] j2 = ((dom) dja.mo4509g()).mo4371j();
        String str = this.f5330g;
        if (this.f5331h == null) {
            synchronized (this) {
                if (this.f5331h == null) {
                    this.f5331h = new bmy(this.f5328e, null);
                }
            }
        }
        bmw a3 = this.f5331h.mo2165a(j2);
        a3.f4430d = str;
        try {
            this.f5329f.mo2678a();
            a3.f4429c = null;
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 73);
            sb.append("Failed to get Account Name, falling back to Zwieback logging, exception: ");
            sb.append(valueOf);
            bog.m3832a("ClearcutTransmitter", sb.toString(), new Object[0]);
        }
        a3.mo2163a().mo2250a(cdk.f5321a);
    }

    /* renamed from: a */
    private static String[] m4585a(String str) {
        return str.replaceFirst("^/+", "").split("/+");
    }
}
