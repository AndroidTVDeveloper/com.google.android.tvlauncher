package p000;

import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: ahh */
/* compiled from: PG */
final class ahh implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    private final WeakReference f364a;

    public ahh(ahi ahi) {
        this.f364a = new WeakReference(ahi);
    }

    public final boolean onPreDraw() {
        ahi ahi = (ahi) this.f364a.get();
        if (ahi == null || ahi.f367b.isEmpty()) {
            return true;
        }
        int c = ahi.mo259c();
        int b = ahi.mo258b();
        if (!ahi.m511a(c, b)) {
            return true;
        }
        ArrayList arrayList = new ArrayList(ahi.f367b);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ahf) arrayList.get(i)).mo245a(c, b);
        }
        ahi.mo257a();
        return true;
    }
}
