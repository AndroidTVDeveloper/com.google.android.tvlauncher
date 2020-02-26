package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

/* renamed from: cdq  reason: default package */
/* compiled from: PG */
public final class cdq implements cdh {
    private static final cdp a = new cdm();
    private static final cdp c = new cdn();
    private static final cdp d = new cdo();
    private final Context e;
    private final cdf f;
    private final String g;
    private volatile bmy h;

    public /* synthetic */ cdq(Context context, String str, cdf cdf) {
        this.e = context;
        this.g = (String) cev.a(str);
        this.f = (cdf) cev.a(cdf);
    }

    public static void a(Status status) {
        bog.a(2, "ClearcutTransmitter", "handleResult, success: %b", Boolean.valueOf(status.b()));
        if (!status.b()) {
            bog.a("ClearcutTransmitter", "Clearcut logging failed", new Object[0]);
        }
    }

    public cdq() {
    }

    private static void a(cdp cdp, dkj dkj) {
        if (TextUtils.isEmpty(cdp.b(dkj))) {
            cdp.a(dkj, bzo.a(cdp.a(dkj)));
        } else {
            cdp.a(dkj, null);
        }
        cdp.c(dkj);
    }

    public final void a(dom dom) {
        dja dja = (dja) dom.b(5);
        dja.a((dje) dom);
        a(a, dja);
        dom dom2 = (dom) dja.a;
        if ((dom2.a & 512) != 0) {
            dnl dnl = dom2.k;
            if (dnl == null) {
                dnl = dnl.c;
            }
            if ((dnl.a & 1) != 0) {
                dnl dnl2 = ((dom) dja.a).k;
                if (dnl2 == null) {
                    dnl2 = dnl.c;
                }
                dnk dnk = dnl2.b;
                if (dnk == null) {
                    dnk = dnk.e;
                }
                dja dja2 = (dja) dnk.b(5);
                dja2.a((dje) dnk);
                a(c, dja2);
                dnl dnl3 = ((dom) dja.a).k;
                if (dnl3 == null) {
                    dnl3 = dnl.c;
                }
                dja dja3 = (dja) dnl3.b(5);
                dja3.a((dje) dnl3);
                if (dja3.b) {
                    dja3.b();
                    dja3.b = false;
                }
                dnl dnl4 = (dnl) dja3.a;
                dnk dnk2 = (dnk) dja2.g();
                dnk2.getClass();
                dnl4.b = dnk2;
                dnl4.a |= 1;
                if (dja.b) {
                    dja.b();
                    dja.b = false;
                }
                dom dom3 = (dom) dja.a;
                dnl dnl5 = (dnl) dja3.g();
                dom dom4 = dom.q;
                dnl5.getClass();
                dom3.k = dnl5;
                dom3.a |= 512;
            }
        }
        dom dom5 = (dom) dja.a;
        if ((dom5.a & 256) != 0) {
            doi doi = dom5.j;
            if (doi == null) {
                doi = doi.k;
            }
            if (doi.j.size() != 0) {
                doi doi2 = ((dom) dja.a).j;
                if (doi2 == null) {
                    doi2 = doi.k;
                }
                dja dja4 = (dja) doi2.b(5);
                dja4.a((dje) doi2);
                for (int i = 0; i < ((doi) dja4.a).j.size(); i++) {
                    doh doh = (doh) ((doi) dja4.a).j.get(i);
                    dja dja5 = (dja) doh.b(5);
                    dja5.a((dje) doh);
                    if (!TextUtils.isEmpty(((doh) dja5.a).b)) {
                        if (dja5.b) {
                            dja5.b();
                            dja5.b = false;
                        }
                        doh doh2 = doh.d;
                        ((doh) dja5.a).c = doh.n();
                        for (String a2 : a(((doh) dja5.a).b)) {
                            long longValue = bzo.a(a2).longValue();
                            if (dja5.b) {
                                dja5.b();
                                dja5.b = false;
                            }
                            doh doh3 = (doh) dja5.a;
                            if (!doh3.c.a()) {
                                doh3.c = dje.a(doh3.c);
                            }
                            doh3.c.a(longValue);
                        }
                    }
                    if (dja5.b) {
                        dja5.b();
                        dja5.b = false;
                    }
                    doh doh4 = (doh) dja5.a;
                    doh doh5 = doh.d;
                    doh4.a &= -2;
                    doh4.b = doh.d.b;
                    if (dja4.b) {
                        dja4.b();
                        dja4.b = false;
                    }
                    doi doi3 = (doi) dja4.a;
                    doh doh6 = (doh) dja5.g();
                    doh6.getClass();
                    if (!doi3.j.a()) {
                        doi3.j = dje.a(doi3.j);
                    }
                    doi3.j.set(i, doh6);
                }
                if (dja.b) {
                    dja.b();
                    dja.b = false;
                }
                dom dom6 = (dom) dja.a;
                doi doi4 = (doi) dja4.g();
                dom dom7 = dom.q;
                doi4.getClass();
                dom6.j = doi4;
                dom6.a |= 256;
            }
        }
        dom dom8 = (dom) dja.a;
        if ((dom8.a & 32) != 0) {
            dnt dnt = dom8.g;
            if (dnt == null) {
                dnt = dnt.b;
            }
            if (dnt.a.size() != 0) {
                dnt dnt2 = ((dom) dja.a).g;
                if (dnt2 == null) {
                    dnt2 = dnt.b;
                }
                dja dja6 = (dja) dnt2.b(5);
                dja6.a((dje) dnt2);
                for (int i2 = 0; i2 < ((dnt) dja6.a).a.size(); i2++) {
                    dns dns = (dns) ((dnt) dja6.a).a.get(i2);
                    dja dja7 = (dja) dns.b(5);
                    dja7.a((dje) dns);
                    if (!TextUtils.isEmpty(((dns) dja7.a).b)) {
                        if (dja7.b) {
                            dja7.b();
                            dja7.b = false;
                        }
                        dns dns2 = dns.d;
                        ((dns) dja7.a).c = dns.n();
                        String[] a3 = a(((dns) dja7.a).b);
                        int length = a3.length;
                        long[] jArr = new long[length];
                        for (int i3 = 0; i3 < length; i3++) {
                            jArr[i3] = bzo.a(a3[i3]).longValue();
                        }
                        for (int i4 = 0; i4 < length; i4++) {
                            long j = jArr[i4];
                            if (dja7.b) {
                                dja7.b();
                                dja7.b = false;
                            }
                            dns dns3 = (dns) dja7.a;
                            if (!dns3.c.a()) {
                                dns3.c = dje.a(dns3.c);
                            }
                            dns3.c.a(j);
                        }
                    }
                    if (dja7.b) {
                        dja7.b();
                        dja7.b = false;
                    }
                    dns dns4 = (dns) dja7.a;
                    dns dns5 = dns.d;
                    dns4.a &= -262145;
                    dns4.b = dns.d.b;
                    if (dja6.b) {
                        dja6.b();
                        dja6.b = false;
                    }
                    dnt dnt3 = (dnt) dja6.a;
                    dns dns6 = (dns) dja7.g();
                    dns6.getClass();
                    if (!dnt3.a.a()) {
                        dnt3.a = dje.a(dnt3.a);
                    }
                    dnt3.a.set(i2, dns6);
                }
                if (dja.b) {
                    dja.b();
                    dja.b = false;
                }
                dom dom9 = (dom) dja.a;
                dnt dnt4 = (dnt) dja6.g();
                dom dom10 = dom.q;
                dnt4.getClass();
                dom9.g = dnt4;
                dom9.a |= 32;
            }
        }
        dom dom11 = (dom) dja.a;
        if ((dom11.a & 32768) != 0) {
            dnw dnw = dom11.m;
            if (dnw == null) {
                dnw = dnw.e;
            }
            if (dnw.d.size() != 0) {
                dnw dnw2 = ((dom) dja.a).m;
                if (dnw2 == null) {
                    dnw2 = dnw.e;
                }
                dja dja8 = (dja) dnw2.b(5);
                dja8.a((dje) dnw2);
                for (int i5 = 0; i5 < ((dnw) dja8.a).d.size(); i5++) {
                    dny dny = (dny) ((dnw) dja8.a).d.get(i5);
                    dja dja9 = (dja) dny.b(5);
                    dja9.a((dje) dny);
                    a(d, dja9);
                    if (dja8.b) {
                        dja8.b();
                        dja8.b = false;
                    }
                    dnw dnw3 = (dnw) dja8.a;
                    dny dny2 = (dny) dja9.g();
                    dny2.getClass();
                    dnw3.a();
                    dnw3.d.set(i5, dny2);
                }
                if (dja.b) {
                    dja.b();
                    dja.b = false;
                }
                dom dom12 = (dom) dja.a;
                dnw dnw4 = (dnw) dja8.g();
                dom dom13 = dom.q;
                dnw4.getClass();
                dom12.m = dnw4;
                dom12.a |= 32768;
            }
        }
        byte[] j2 = ((dom) dja.g()).j();
        String str = this.g;
        if (this.h == null) {
            synchronized (this) {
                if (this.h == null) {
                    this.h = new bmy(this.e, null);
                }
            }
        }
        bmw a4 = this.h.a(j2);
        a4.d = str;
        try {
            this.f.a();
            a4.c = null;
        } catch (Exception e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 73);
            sb.append("Failed to get Account Name, falling back to Zwieback logging, exception: ");
            sb.append(valueOf);
            bog.a("ClearcutTransmitter", sb.toString(), new Object[0]);
        }
        a4.a().a(cdk.a);
    }

    private static String[] a(String str) {
        return str.replaceFirst("^/+", "").split("/+");
    }
}
