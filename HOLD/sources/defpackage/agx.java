package defpackage;

import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: agx  reason: default package */
/* compiled from: PG */
final class agx implements ViewTreeObserver.OnPreDrawListener {
    private final WeakReference a;

    public agx(agy agy) {
        this.a = new WeakReference(agy);
    }

    public final boolean onPreDraw() {
        agy agy = (agy) this.a.get();
        if (agy == null || agy.b.isEmpty()) {
            return true;
        }
        int c = agy.c();
        int b = agy.b();
        if (!agy.a(c, b)) {
            return true;
        }
        ArrayList arrayList = new ArrayList(agy.b);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ahf) arrayList.get(i)).a(c, b);
        }
        agy.a();
        return true;
    }
}
