package defpackage;

import android.app.Activity;
import android.os.Looper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: ccg  reason: default package */
/* compiled from: PG */
final class ccg implements bza, ccl {
    private final bze a;
    private final dff b;
    private final dff c;

    public ccg(bze bze, dff dff, dff dff2, dfc dfc) {
        this.a = bze;
        bze.a(this);
        this.b = dff;
        this.c = dff2;
        if (dfc.a()) {
            dbk dbk = (dbk) dfc.b();
        }
    }

    private static long a(cce cce) {
        return cce.b ? cce.c : cce.a();
    }

    public final void b(Activity activity) {
        cbz[] cbzArr;
        int length;
        String str;
        dny[] dnyArr;
        String str2;
        String str3;
        long j;
        String str4;
        this.a.b(this);
        cce cce = cce.a;
        if (cce.h > 0) {
            long a2 = a(cce);
            if (this.b.a() != null && a2 > 0) {
                long j2 = cce.h;
                boolean z = cce.b;
                if (!z) {
                    str2 = "Warm startup";
                } else {
                    str2 = "Cold startup";
                }
                a(cce, a2, j2, str2);
                cce.b();
                if (cce.b() < cce.h) {
                    str4 = z ? "Cold startup interactive before onDraw" : "Warm startup interactive before onDraw";
                } else if (!z) {
                    str3 = "Warm startup interactive";
                    a(cce, a2, 0, str3);
                    j = cce.f;
                    long j3 = cce.h;
                    if (!z && j != 0) {
                        a(cce, j, j3, "Warm startup activity onStart");
                    }
                } else {
                    str4 = "Cold startup interactive";
                }
                str3 = str4;
                a(cce, a2, 0, str3);
                j = cce.f;
                long j32 = cce.h;
                a(cce, j, j32, "Warm startup activity onStart");
            } else {
                bog.b("PrimesStartupHandler", "not recording startup timer (start time: %d)", Long.valueOf(a2));
            }
            if (((dfc) this.c.a()).a() && a(cce) > 0) {
                if (cce.h >= a(cce)) {
                    long id = Looper.getMainLooper().getThread().getId();
                    ArrayList arrayList = new ArrayList();
                    boolean z2 = cce.b;
                    synchronized (cce.j) {
                        List list = cce.j;
                        cbzArr = (cbz[]) list.toArray(new cbz[list.size()]);
                    }
                    if (z2) {
                        long j4 = id;
                        arrayList.add(cdc.a(ccj.a, "App create", cce.c, cce.d, j4, 3));
                        cdc a3 = cdc.a(ccj.a, String.valueOf(cbzArr[0].a).concat(": onCreate"), cce.d, cbzArr[0].b, j4, 3);
                        arrayList.add(a3);
                        if (cce.a() > 0) {
                            ccj ccj = ccj.a;
                            cdc a4 = cdc.a(ccj.a, String.valueOf(cbzArr[0].a).concat(": init"), cce.d, cce.a(), id, 3);
                            cev.a(ccj);
                            if (a3.e == Collections.EMPTY_LIST) {
                                a3.e = new ArrayList();
                            }
                            a3.e.add(a4);
                        }
                    } else {
                        ccj ccj2 = ccj.a;
                        String concat = String.valueOf(cbzArr[0].a).concat(": onCreate");
                        cce.a();
                        arrayList.add(cdc.a(ccj2, concat, 0, cbzArr[0].b, id, 3));
                    }
                    long j5 = cbzArr[0].b;
                    int i = 1;
                    while (true) {
                        length = cbzArr.length;
                        if (i >= length) {
                            break;
                        }
                        long j6 = cbzArr[i].b;
                        arrayList.add(cdc.a(ccj.a, String.valueOf(cbzArr[i].a).concat(": onCreate"), j5, j6, id, 3));
                        i++;
                        j5 = j6;
                    }
                    int i2 = length - 1;
                    long j7 = cbzArr[i2].b;
                    String str5 = cbzArr[i2].a;
                    long j8 = id;
                    arrayList.add(cdc.a(ccj.a, String.valueOf(str5).concat(": onStart"), j7, cce.f, j8, 3));
                    arrayList.add(cdc.a(ccj.a, String.valueOf(str5).concat(": onResume"), cce.f, cce.g, j8, 3));
                    arrayList.add(cdc.a(ccj.a, String.valueOf(str5).concat(": onDraw"), cce.g, cce.h, j8, 3));
                    ccj ccj3 = ccj.a;
                    if (!cce.b) {
                        str = "Warm startup";
                    } else {
                        str = "Cold startup";
                    }
                    cdc a5 = cdc.a(ccj3, str, ((cdc) arrayList.get(0)).b, -1, id, 2);
                    cev.a(ccj.a);
                    if (a5.e == Collections.EMPTY_LIST) {
                        a5.e = new ArrayList();
                    }
                    a5.e.addAll(arrayList);
                    cev.a(ccj.a);
                    cdd cdd = new cdd(a5);
                    cev.a(ccj.a);
                    cdd.a(cdd.a, 0);
                    String str6 = null;
                    if (cdd.b.size() == 1) {
                        bog.a("TraceDataToProto", "No other span except for root span. Dropping trace...", new Object[0]);
                        dnyArr = null;
                    } else {
                        List list2 = cdd.b;
                        dnyArr = (dny[]) list2.toArray(new dny[list2.size()]);
                    }
                    dja l = dnw.e.l();
                    long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits();
                    if (l.b) {
                        l.b();
                        l.b = false;
                    }
                    dnw dnw = (dnw) l.a;
                    dnw.a |= 1;
                    dnw.b = leastSignificantBits;
                    List asList = Arrays.asList(dnyArr);
                    if (l.b) {
                        l.b();
                        l.b = false;
                    }
                    dnw dnw2 = (dnw) l.a;
                    dnw2.a();
                    dht.a(asList, dnw2.d);
                    if (l.b) {
                        l.b();
                        l.b = false;
                    }
                    dnw dnw3 = (dnw) l.a;
                    dnw3.c = 2;
                    dnw3.a |= 2;
                    dnw dnw4 = (dnw) l.g();
                    ccq ccq = (ccq) ((dfc) this.c.a()).b();
                    String a6 = cah.a(cce.c());
                    dja l2 = dom.q.l();
                    if (l2.b) {
                        l2.b();
                        l2.b = false;
                    }
                    dom dom = (dom) l2.a;
                    dnw4.getClass();
                    dom.m = dnw4;
                    dom.a |= 32768;
                    dom dom2 = (dom) l2.g();
                    Serializable[] serializableArr = new Serializable[2];
                    serializableArr[0] = (dnw4.a & 1) != 0 ? Long.valueOf(dnw4.b) : null;
                    if (dnw4.d.size() > 0) {
                        str6 = ((dny) dnw4.d.get(0)).b;
                    }
                    serializableArr[1] = str6;
                    bog.a("BaseTraceMetricService", "Recording trace %d: %s", serializableArr);
                    ccq.a(null, true, dom2, null, a6);
                    return;
                }
                return;
            }
            return;
        }
        bog.b("PrimesStartupHandler", "missing firstDraw timestamp", new Object[0]);
    }

    public final void a() {
        this.a.b(this);
    }

    private final void a(cce cce, long j, long j2, String str) {
        if (j2 >= j) {
            cev.a(((ccn) this.b.a()).a(new ccm(j, j2), str, cah.a(cce.c())));
            return;
        }
        bog.b("PrimesStartupHandler", "non-positive duration for startup timer %s", str);
    }
}
