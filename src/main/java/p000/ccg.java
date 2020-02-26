package p000;

import android.app.Activity;
import android.os.Looper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: ccg */
/* compiled from: PG */
final class ccg implements bza, ccl {

    /* renamed from: a */
    private final bze f5265a;

    /* renamed from: b */
    private final dff f5266b;

    /* renamed from: c */
    private final dff f5267c;

    public ccg(bze bze, dff dff, dff dff2, dfc dfc) {
        this.f5265a = bze;
        bze.mo2564a(this);
        this.f5266b = dff;
        this.f5267c = dff2;
        if (dfc.mo4219a()) {
            dbk dbk = (dbk) dfc.mo4220b();
        }
    }

    /* renamed from: a */
    private static long m4526a(cce cce) {
        return cce.f5250b ? cce.f5251c : cce.mo2663a();
    }

    /* renamed from: b */
    public final void mo2561b(Activity activity) {
        cbz[] cbzArr;
        int length;
        String str;
        dny[] dnyArr;
        String str2;
        String str3;
        long j;
        String str4;
        this.f5265a.mo2565b(this);
        cce cce = cce.f5247a;
        if (cce.f5256h > 0) {
            long a = m4526a(cce);
            if (this.f5266b.mo2551a() != null && a > 0) {
                long j2 = cce.f5256h;
                boolean z = cce.f5250b;
                if (!z) {
                    str2 = "Warm startup";
                } else {
                    str2 = "Cold startup";
                }
                m4527a(cce, a, j2, str2);
                cce.mo2664b();
                if (cce.mo2664b() < cce.f5256h) {
                    str4 = z ? "Cold startup interactive before onDraw" : "Warm startup interactive before onDraw";
                } else if (!z) {
                    str3 = "Warm startup interactive";
                    m4527a(cce, a, 0, str3);
                    j = cce.f5254f;
                    long j3 = cce.f5256h;
                    if (!z && j != 0) {
                        m4527a(cce, j, j3, "Warm startup activity onStart");
                    }
                } else {
                    str4 = "Cold startup interactive";
                }
                str3 = str4;
                m4527a(cce, a, 0, str3);
                j = cce.f5254f;
                long j32 = cce.f5256h;
                m4527a(cce, j, j32, "Warm startup activity onStart");
            } else {
                bog.m3835b("PrimesStartupHandler", "not recording startup timer (start time: %d)", Long.valueOf(a));
            }
            if (((dfc) this.f5267c.mo2551a()).mo4219a() && m4526a(cce) > 0) {
                if (cce.f5256h >= m4526a(cce)) {
                    long id = Looper.getMainLooper().getThread().getId();
                    ArrayList arrayList = new ArrayList();
                    boolean z2 = cce.f5250b;
                    synchronized (cce.f5258j) {
                        List list = cce.f5258j;
                        cbzArr = (cbz[]) list.toArray(new cbz[list.size()]);
                    }
                    if (z2) {
                        long j4 = id;
                        arrayList.add(cdc.m4560a(ccj.f5273a, "App create", cce.f5251c, cce.f5252d, j4, 3));
                        cdc a2 = cdc.m4560a(ccj.f5273a, String.valueOf(cbzArr[0].f5232a).concat(": onCreate"), cce.f5252d, cbzArr[0].f5233b, j4, 3);
                        arrayList.add(a2);
                        if (cce.mo2663a() > 0) {
                            ccj ccj = ccj.f5273a;
                            cdc a3 = cdc.m4560a(ccj.f5273a, String.valueOf(cbzArr[0].f5232a).concat(": init"), cce.f5252d, cce.mo2663a(), id, 3);
                            cev.m4629a(ccj);
                            if (a2.f5309e == Collections.EMPTY_LIST) {
                                a2.f5309e = new ArrayList();
                            }
                            a2.f5309e.add(a3);
                        }
                    } else {
                        ccj ccj2 = ccj.f5273a;
                        String concat = String.valueOf(cbzArr[0].f5232a).concat(": onCreate");
                        cce.mo2663a();
                        arrayList.add(cdc.m4560a(ccj2, concat, 0, cbzArr[0].f5233b, id, 3));
                    }
                    long j5 = cbzArr[0].f5233b;
                    int i = 1;
                    while (true) {
                        length = cbzArr.length;
                        if (i >= length) {
                            break;
                        }
                        long j6 = cbzArr[i].f5233b;
                        arrayList.add(cdc.m4560a(ccj.f5273a, String.valueOf(cbzArr[i].f5232a).concat(": onCreate"), j5, j6, id, 3));
                        i++;
                        j5 = j6;
                    }
                    int i2 = length - 1;
                    long j7 = cbzArr[i2].f5233b;
                    String str5 = cbzArr[i2].f5232a;
                    long j8 = id;
                    arrayList.add(cdc.m4560a(ccj.f5273a, String.valueOf(str5).concat(": onStart"), j7, cce.f5254f, j8, 3));
                    arrayList.add(cdc.m4560a(ccj.f5273a, String.valueOf(str5).concat(": onResume"), cce.f5254f, cce.f5255g, j8, 3));
                    arrayList.add(cdc.m4560a(ccj.f5273a, String.valueOf(str5).concat(": onDraw"), cce.f5255g, cce.f5256h, j8, 3));
                    ccj ccj3 = ccj.f5273a;
                    if (!cce.f5250b) {
                        str = "Warm startup";
                    } else {
                        str = "Cold startup";
                    }
                    cdc a4 = cdc.m4560a(ccj3, str, ((cdc) arrayList.get(0)).f5306b, -1, id, 2);
                    cev.m4629a(ccj.f5273a);
                    if (a4.f5309e == Collections.EMPTY_LIST) {
                        a4.f5309e = new ArrayList();
                    }
                    a4.f5309e.addAll(arrayList);
                    cev.m4629a(ccj.f5273a);
                    cdd cdd = new cdd(a4);
                    cev.m4629a(ccj.f5273a);
                    cdd.mo2677a(cdd.f5312a, 0);
                    String str6 = null;
                    if (cdd.f5313b.size() == 1) {
                        bog.m3832a("TraceDataToProto", "No other span except for root span. Dropping trace...", new Object[0]);
                        dnyArr = null;
                    } else {
                        List list2 = cdd.f5313b;
                        dnyArr = (dny[]) list2.toArray(new dny[list2.size()]);
                    }
                    dja l = dnw.f9000e.mo4516l();
                    long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits();
                    if (l.f8673b) {
                        l.mo4505b();
                        l.f8673b = false;
                    }
                    dnw dnw = (dnw) l.f8672a;
                    dnw.f9001a |= 1;
                    dnw.f9002b = leastSignificantBits;
                    List asList = Arrays.asList(dnyArr);
                    if (l.f8673b) {
                        l.mo4505b();
                        l.f8673b = false;
                    }
                    dnw dnw2 = (dnw) l.f8672a;
                    dnw2.mo4679a();
                    dht.m6456a(asList, dnw2.f9004d);
                    if (l.f8673b) {
                        l.mo4505b();
                        l.f8673b = false;
                    }
                    dnw dnw3 = (dnw) l.f8672a;
                    dnw3.f9003c = 2;
                    dnw3.f9001a |= 2;
                    dnw dnw4 = (dnw) l.mo4509g();
                    ccq ccq = (ccq) ((dfc) this.f5267c.mo2551a()).mo4220b();
                    String a5 = cah.m4439a(cce.mo2665c());
                    dja l2 = dom.f9077q.mo4516l();
                    if (l2.f8673b) {
                        l2.mo4505b();
                        l2.f8673b = false;
                    }
                    dom dom = (dom) l2.f8672a;
                    dnw4.getClass();
                    dom.f9090m = dnw4;
                    dom.f9078a |= 32768;
                    dom dom2 = (dom) l2.mo4509g();
                    Serializable[] serializableArr = new Serializable[2];
                    serializableArr[0] = (dnw4.f9001a & 1) != 0 ? Long.valueOf(dnw4.f9002b) : null;
                    if (dnw4.f9004d.size() > 0) {
                        str6 = ((dny) dnw4.f9004d.get(0)).f9008b;
                    }
                    serializableArr[1] = str6;
                    bog.m3832a("BaseTraceMetricService", "Recording trace %d: %s", serializableArr);
                    ccq.mo2546a(null, true, dom2, null, a5);
                    return;
                }
                return;
            }
            return;
        }
        bog.m3835b("PrimesStartupHandler", "missing firstDraw timestamp", new Object[0]);
    }

    /* renamed from: a */
    public final void mo2543a() {
        this.f5265a.mo2565b(this);
    }

    /* renamed from: a */
    private final void m4527a(cce cce, long j, long j2, String str) {
        if (j2 >= j) {
            cev.m4630a(((ccn) this.f5266b.mo2551a()).mo2604a(new ccm(j, j2), str, cah.m4439a(cce.mo2665c())));
            return;
        }
        bog.m3835b("PrimesStartupHandler", "non-positive duration for startup timer %s", str);
    }
}
