package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: qt  reason: default package */
/* compiled from: PG */
public final class qt extends akr {
    public Drawable a;
    public int b;
    public boolean c = true;
    public final /* synthetic */ qx d;

    public qt(qx qxVar) {
        this.d = qxVar;
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView) {
        if (a(view, recyclerView)) {
            rect.bottom = this.b;
        }
    }

    public final void a(Canvas canvas, RecyclerView recyclerView) {
        if (this.a != null) {
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (a(childAt, recyclerView)) {
                    int y = ((int) childAt.getY()) + childAt.getHeight();
                    this.a.setBounds(0, y, width, this.b + y);
                    this.a.draw(canvas);
                }
            }
        }
    }

    private final boolean a(View view, RecyclerView recyclerView) {
        km a2 = recyclerView.a(view);
        if (!(a2 instanceof rl) || !((rl) a2).q) {
            return false;
        }
        boolean z = this.c;
        int indexOfChild = recyclerView.indexOfChild(view);
        if (indexOfChild >= recyclerView.getChildCount() - 1) {
            return z;
        }
        km a3 = recyclerView.a(recyclerView.getChildAt(indexOfChild + 1));
        if (!(a3 instanceof rl) || !((rl) a3).p) {
            return false;
        }
        return true;
    }
}
