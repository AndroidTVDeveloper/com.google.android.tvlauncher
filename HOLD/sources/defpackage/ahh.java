package defpackage;

import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: ahh  reason: default package */
/* compiled from: PG */
final class ahh implements ViewTreeObserver.OnPreDrawListener {
    private final WeakReference a;

    public ahh(ahi ahi) {
        this.a = new WeakReference(ahi);
    }

    public final boolean onPreDraw() {
        ahi ahi = (ahi) this.a.get();
        if (ahi == null || ahi.b.isEmpty()) {
            return true;
        }
        int c = ahi.c();
        int b = ahi.b();
        if (!ahi.a(c, b)) {
            return true;
        }
        ArrayList arrayList = new ArrayList(ahi.b);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ahf) arrayList.get(i)).a(c, b);
        }
        ahi.a();
        return true;
    }
}
