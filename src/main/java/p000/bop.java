package p000;

import android.content.Context;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

@Deprecated
/* renamed from: bop */
/* compiled from: PG */
public final class bop {

    /* renamed from: a */
    private final Set f4522a = new HashSet();

    /* renamed from: b */
    private final Set f4523b = new HashSet();

    /* renamed from: c */
    private final String f4524c;

    /* renamed from: d */
    private final String f4525d;

    /* renamed from: e */
    private final Map f4526e = new C0067cl();

    /* renamed from: f */
    private final Context f4527f;

    /* renamed from: g */
    private final Map f4528g = new C0067cl();

    /* renamed from: h */
    private final Looper f4529h;

    /* renamed from: i */
    private final bnu f4530i = bnu.f4493a;

    /* renamed from: j */
    private final ArrayList f4531j = new ArrayList();

    /* renamed from: k */
    private final ArrayList f4532k = new ArrayList();

    /* renamed from: l */
    private final cel f4533l = bwh.f4945b;

    public bop(Context context) {
        this.f4527f = context;
        this.f4529h = context.getMainLooper();
        this.f4524c = context.getPackageName();
        this.f4525d = context.getClass().getName();
    }

    /* renamed from: a */
    public final void mo2243a(bok bok) {
        buh.m4200a(bok, "Api must not be null");
        this.f4528g.put(bok, null);
        List emptyList = Collections.emptyList();
        this.f4523b.addAll(emptyList);
        this.f4522a.addAll(emptyList);
    }

    /* renamed from: a */
    public final bos mo2242a() {
        bwj bwj;
        boolean z;
        buh.m4213b(!this.f4528g.isEmpty(), "must call addApi() to add at least one API");
        bwj bwj2 = bwj.f4949a;
        if (this.f4528g.containsKey(bwh.f4944a)) {
            bwj = (bwj) this.f4528g.get(bwh.f4944a);
        } else {
            bwj = bwj2;
        }
        bsv bsv = new bsv(this.f4522a, this.f4526e, this.f4524c, this.f4525d, bwj);
        Map map = bsv.f4771c;
        C0067cl clVar = new C0067cl();
        C0067cl clVar2 = new C0067cl();
        ArrayList arrayList = new ArrayList();
        for (bok bok : this.f4528g.keySet()) {
            Object obj = this.f4528g.get(bok);
            if (map.get(bok) != null) {
                z = true;
            } else {
                z = false;
            }
            clVar.put(bok, Boolean.valueOf(z));
            bpt bpt = new bpt(bok, z);
            arrayList.add(bpt);
            clVar2.put(bok.mo2237a(), bok.mo2238b().mo2161a(this.f4527f, this.f4529h, bsv, obj, bpt, bpt));
        }
        bqt.m4004a(clVar2.values());
        bqt bqt = new bqt(this.f4527f, new ReentrantLock(), this.f4529h, bsv, this.f4530i, this.f4533l, clVar, this.f4531j, this.f4532k, clVar2, arrayList, (byte) 0, (byte) 0);
        synchronized (bos.f4534a) {
            bos.f4534a.add(bqt);
        }
        return bqt;
    }
}
