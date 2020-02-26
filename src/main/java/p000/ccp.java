package p000;

import android.app.Application;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: ccp */
/* compiled from: PG */
final class ccp extends byo implements ccn {

    /* renamed from: d */
    private final cda f5281d;

    /* renamed from: e */
    private final ConcurrentHashMap f5282e;

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
        dgx.m6408a(true, (Object) "the total number of elements must fit in an int");
        Object[] objArr = new Object[7];
        objArr[0] = "Cold startup";
        objArr[1] = "Cold startup interactive";
        objArr[2] = "Cold startup interactive before onDraw";
        objArr[3] = "Warm startup";
        objArr[4] = "Warm startup interactive";
        objArr[5] = "Warm startup interactive before onDraw";
        System.arraycopy(new String[]{"Warm startup activity onStart"}, 0, objArr, 6, 1);
        dfq.m6324a(7, objArr);
    }

    public ccp(dnj dnj, Application application, dff dff, dff dff2, cda cda, int i, ConcurrentHashMap concurrentHashMap) {
        super(dnj, application, dff, dff2, 1, i);
        this.f5281d = cda;
        this.f5282e = concurrentHashMap;
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
    /* renamed from: a */
    public final dhb mo2604a(ccm ccm, String str, String str2) {
        if (!this.f5281d.mo2673a() || !mo2547b()) {
            return dgy.f8518a;
        }
        dja l = dom.f9077q.mo4516l();
        dja l2 = don.f9095d.mo4516l();
        long j = ccm.f5277b - ccm.f5276a;
        if (l2.f8673b) {
            l2.mo4505b();
            l2.f8673b = false;
        }
        don don = (don) l2.f8672a;
        int i = don.f9096a | 1;
        don.f9096a = i;
        don.f9097b = j;
        don.f9098c = 0;
        don.f9096a = i | 2;
        don don2 = (don) l2.mo4509g();
        if (l.f8673b) {
            l.mo4505b();
            l.f8673b = false;
        }
        dom dom = (dom) l.f8672a;
        don2.getClass();
        dom.f9082e = don2;
        dom.f9078a |= 8;
        if (str2 != null) {
            dja l3 = dob.f9025c.mo4516l();
            if (l3.f8673b) {
                l3.mo4505b();
                l3.f8673b = false;
            }
            dob dob = (dob) l3.f8672a;
            str2.getClass();
            dob.f9026a |= 1;
            dob.f9027b = str2;
            if (l.f8673b) {
                l.mo4505b();
                l.f8673b = false;
            }
            dom dom2 = (dom) l.f8672a;
            dob dob2 = (dob) l3.mo4509g();
            dob2.getClass();
            dom2.f9092o = dob2;
            dom2.f9078a |= 1048576;
        }
        return dgx.m6400a((dgp) new cco(this, str, (dom) l.mo4509g()), (Executor) mo2548c());
    }

    /* renamed from: d */
    public final void mo2549d() {
        this.f5282e.clear();
    }
}
