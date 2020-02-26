package p000;

import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: agx */
/* compiled from: PG */
final class agx implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    private final WeakReference f350a;

    public agx(agy agy) {
        this.f350a = new WeakReference(agy);
    }

    public final boolean onPreDraw() {
        agy agy = (agy) this.f350a.get();
        if (agy == null || agy.f353b.isEmpty()) {
            return true;
        }
        int c = agy.mo250c();
        int b = agy.mo249b();
        if (!agy.m470a(c, b)) {
            return true;
        }
        ArrayList arrayList = new ArrayList(agy.f353b);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ahf) arrayList.get(i)).mo245a(c, b);
        }
        agy.mo248a();
        return true;
    }
}
