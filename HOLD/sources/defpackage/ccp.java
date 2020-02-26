package defpackage;

import android.app.Application;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: ccp  reason: default package */
/* compiled from: PG */
final class ccp extends byo implements ccn {
    private final cda d;
    private final ConcurrentHashMap e;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dgx.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      dgx.a(dgp, java.util.concurrent.Executor):dhb
      dgx.a(java.lang.Object, int):java.lang.Object
      dgx.a(java.lang.Object, java.lang.Object):java.lang.Object
      dgx.a(java.lang.String, java.lang.Object[]):java.lang.String
      dgx.a(int, int):void
      dgx.a(boolean, java.lang.Object):void */
    static {
        dgx.a(true, (Object) "the total number of elements must fit in an int");
        Object[] objArr = new Object[7];
        objArr[0] = "Cold startup";
        objArr[1] = "Cold startup interactive";
        objArr[2] = "Cold startup interactive before onDraw";
        objArr[3] = "Warm startup";
        objArr[4] = "Warm startup interactive";
        objArr[5] = "Warm startup interactive before onDraw";
        System.arraycopy(new String[]{"Warm startup activity onStart"}, 0, objArr, 6, 1);
        dfq.a(7, objArr);
    }

    public ccp(dnj dnj, Application application, dff dff, dff dff2, cda cda, int i, ConcurrentHashMap concurrentHashMap) {
        super(dnj, application, dff, dff2, 1, i);
        this.d = cda;
        this.e = concurrentHashMap;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dgx.a(dgp, java.util.concurrent.Executor):dhb
     arg types: [cco, dhe]
     candidates:
      dgx.a(java.lang.Object, int):java.lang.Object
      dgx.a(java.lang.Object, java.lang.Object):java.lang.Object
      dgx.a(java.lang.String, java.lang.Object[]):java.lang.String
      dgx.a(int, int):void
      dgx.a(boolean, java.lang.Object):void
      dgx.a(dgp, java.util.concurrent.Executor):dhb */
    public final dhb a(ccm ccm, String str, String str2) {
        if (!this.d.a() || !b()) {
            return dgy.a;
        }
        dja l = dom.q.l();
        dja l2 = don.d.l();
        long j = ccm.b - ccm.a;
        if (l2.b) {
            l2.b();
            l2.b = false;
        }
        don don = (don) l2.a;
        int i = don.a | 1;
        don.a = i;
        don.b = j;
        don.c = 0;
        don.a = i | 2;
        don don2 = (don) l2.g();
        if (l.b) {
            l.b();
            l.b = false;
        }
        dom dom = (dom) l.a;
        don2.getClass();
        dom.e = don2;
        dom.a |= 8;
        if (str2 != null) {
            dja l3 = dob.c.l();
            if (l3.b) {
                l3.b();
                l3.b = false;
            }
            dob dob = (dob) l3.a;
            str2.getClass();
            dob.a |= 1;
            dob.b = str2;
            if (l.b) {
                l.b();
                l.b = false;
            }
            dom dom2 = (dom) l.a;
            dob dob2 = (dob) l3.g();
            dob2.getClass();
            dom2.o = dob2;
            dom2.a |= 1048576;
        }
        return dgx.a((dgp) new cco(this, str, (dom) l.g()), (Executor) c());
    }

    public final void d() {
        this.e.clear();
    }
}
