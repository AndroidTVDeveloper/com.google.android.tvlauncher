package p000;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p002v7.widget.RecyclerView;
import android.view.View;

/* renamed from: qt */
/* compiled from: PG */
public final class C0454qt extends akr {

    /* renamed from: a */
    public Drawable f10219a;

    /* renamed from: b */
    public int f10220b;

    /* renamed from: c */
    public boolean f10221c = true;

    /* renamed from: d */
    public final /* synthetic */ C0458qx f10222d;

    public C0454qt(C0458qx qxVar) {
        this.f10222d = qxVar;
    }

    /* renamed from: a */
    public final void mo465a(Rect rect, View view, RecyclerView recyclerView) {
        if (m8238a(view, recyclerView)) {
            rect.bottom = this.f10220b;
        }
    }

    /* renamed from: a */
    public final void mo464a(Canvas canvas, RecyclerView recyclerView) {
        if (this.f10219a != null) {
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (m8238a(childAt, recyclerView)) {
                    int y = ((int) childAt.getY()) + childAt.getHeight();
                    this.f10219a.setBounds(0, y, width, this.f10220b + y);
                    this.f10219a.draw(canvas);
                }
            }
        }
    }

    /* renamed from: a */
    private final boolean m8238a(View view, RecyclerView recyclerView) {
        C0285km a = recyclerView.mo823a(view);
        if (!(a instanceof C0473rl) || !((C0473rl) a).f10260q) {
            return false;
        }
        boolean z = this.f10221c;
        int indexOfChild = recyclerView.indexOfChild(view);
        if (indexOfChild >= recyclerView.getChildCount() - 1) {
            return z;
        }
        C0285km a2 = recyclerView.mo823a(recyclerView.getChildAt(indexOfChild + 1));
        if (!(a2 instanceof C0473rl) || !((C0473rl) a2).f10259p) {
            return false;
        }
        return true;
    }
}
