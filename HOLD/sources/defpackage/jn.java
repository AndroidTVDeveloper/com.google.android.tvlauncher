package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: jn  reason: default package */
/* compiled from: PG */
public final class jn implements hn {
    public final /* synthetic */ RecyclerView a;

    public jn(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final View b(int i) {
        return this.a.getChildAt(i);
    }

    public final int a() {
        return this.a.getChildCount();
    }

    public final int a(View view) {
        return this.a.indexOfChild(view);
    }

    public final void b(View view) {
        km c = RecyclerView.c(view);
        if (c != null) {
            this.a.a(c, c.m);
            c.m = 0;
        }
    }

    public final void a(int i) {
        View childAt = this.a.getChildAt(i);
        if (childAt != null) {
            RecyclerView.c(childAt);
            childAt.clearAnimation();
        }
        this.a.removeViewAt(i);
    }
}
