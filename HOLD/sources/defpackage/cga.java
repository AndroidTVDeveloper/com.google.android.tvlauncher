package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: cga  reason: default package */
/* compiled from: PG */
public final class cga {
    private static cga d;
    public cfz a;
    public int b;
    public boolean c = true;
    private int e;

    private cga() {
        if (d != null) {
            throw new RuntimeException("Use getInstance() method to get single instance.");
        }
    }

    public static boolean a(RecyclerView recyclerView) {
        jp jpVar = recyclerView.g;
        if (jpVar != null && jpVar.a() == 0) {
            return true;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (recyclerView.getChildAt(i).getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    public static cga a() {
        if (d == null) {
            d = new cga();
        }
        return d;
    }

    public final void b(RecyclerView recyclerView) {
        if (this.c) {
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new cfx(this, recyclerView));
        }
    }

    public final void a(View view) {
        if (this.c) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new cfy(this, view));
        }
    }

    public final void c() {
        cfz cfz;
        int i = this.e + 1;
        this.e = i;
        if (i >= this.b && (cfz = this.a) != null) {
            this.c = false;
            cfz.a();
            b();
        }
    }

    public final void b() {
        this.a = null;
    }
}
