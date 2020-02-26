package defpackage;

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
/* renamed from: bop  reason: default package */
/* compiled from: PG */
public final class bop {
    private final Set a = new HashSet();
    private final Set b = new HashSet();
    private final String c;
    private final String d;
    private final Map e = new cl();
    private final Context f;
    private final Map g = new cl();
    private final Looper h;
    private final bnu i = bnu.a;
    private final ArrayList j = new ArrayList();
    private final ArrayList k = new ArrayList();
    private final cel l = bwh.b;

    public bop(Context context) {
        this.f = context;
        this.h = context.getMainLooper();
        this.c = context.getPackageName();
        this.d = context.getClass().getName();
    }

    public final void a(bok bok) {
        buh.a(bok, "Api must not be null");
        this.g.put(bok, null);
        List emptyList = Collections.emptyList();
        this.b.addAll(emptyList);
        this.a.addAll(emptyList);
    }

    public final bos a() {
        bwj bwj;
        boolean z;
        buh.b(!this.g.isEmpty(), "must call addApi() to add at least one API");
        bwj bwj2 = bwj.a;
        if (this.g.containsKey(bwh.a)) {
            bwj = (bwj) this.g.get(bwh.a);
        } else {
            bwj = bwj2;
        }
        bsv bsv = new bsv(this.a, this.e, this.c, this.d, bwj);
        Map map = bsv.c;
        cl clVar = new cl();
        cl clVar2 = new cl();
        ArrayList arrayList = new ArrayList();
        for (bok bok : this.g.keySet()) {
            Object obj = this.g.get(bok);
            if (map.get(bok) != null) {
                z = true;
            } else {
                z = false;
            }
            clVar.put(bok, Boolean.valueOf(z));
            bpt bpt = new bpt(bok, z);
            arrayList.add(bpt);
            clVar2.put(bok.a(), bok.b().a(this.f, this.h, bsv, obj, bpt, bpt));
        }
        bqt.a(clVar2.values());
        bqt bqt = new bqt(this.f, new ReentrantLock(), this.h, bsv, this.i, this.l, clVar, this.j, this.k, clVar2, arrayList, (byte) 0, (byte) 0);
        synchronized (bos.a) {
            bos.a.add(bqt);
        }
        return bqt;
    }
}
