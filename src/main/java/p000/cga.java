package p000;

import android.support.p002v7.widget.RecyclerView;
import android.view.View;

/* renamed from: cga */
/* compiled from: PG */
public final class cga {

    /* renamed from: d */
    private static cga f5449d;

    /* renamed from: a */
    public cfz f5450a;

    /* renamed from: b */
    public int f5451b;

    /* renamed from: c */
    public boolean f5452c = true;

    /* renamed from: e */
    private int f5453e;

    private cga() {
        if (f5449d != null) {
            throw new RuntimeException("Use getInstance() method to get single instance.");
        }
    }

    /* renamed from: a */
    public static boolean m4693a(RecyclerView recyclerView) {
        C0261jp jpVar = recyclerView.f1067g;
        if (jpVar != null && jpVar.mo2794a() == 0) {
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

    /* renamed from: a */
    public static cga m4692a() {
        if (f5449d == null) {
            f5449d = new cga();
        }
        return f5449d;
    }

    /* renamed from: b */
    public final void mo2747b(RecyclerView recyclerView) {
        if (this.f5452c) {
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new cfx(this, recyclerView));
        }
    }

    /* renamed from: a */
    public final void mo2745a(View view) {
        if (this.f5452c) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new cfy(this, view));
        }
    }

    /* renamed from: c */
    public final void mo2748c() {
        cfz cfz;
        int i = this.f5453e + 1;
        this.f5453e = i;
        if (i >= this.f5451b && (cfz = this.f5450a) != null) {
            this.f5452c = false;
            cfz.mo2743a();
            mo2746b();
        }
    }

    /* renamed from: b */
    public final void mo2746b() {
        this.f5450a = null;
    }
}
