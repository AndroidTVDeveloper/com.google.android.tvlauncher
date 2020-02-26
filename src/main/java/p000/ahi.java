package p000;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ahi */
/* compiled from: PG */
final class ahi {

    /* renamed from: d */
    private static Integer f365d;

    /* renamed from: a */
    public final View f366a;

    /* renamed from: b */
    public final List f367b = new ArrayList();

    /* renamed from: c */
    public ahh f368c;

    public ahi(View view) {
        this.f366a = view;
    }

    /* renamed from: a */
    private static final boolean m510a(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo257a() {
        ViewTreeObserver viewTreeObserver = this.f366a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f368c);
        }
        this.f368c = null;
        this.f367b.clear();
    }

    /* renamed from: a */
    private final int m509a(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        if (this.f366a.isLayoutRequested() || i2 != -2) {
            return 0;
        }
        Context context = this.f366a.getContext();
        if (f365d == null) {
            Display defaultDisplay = ((WindowManager) aic.m542a((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f365d = Integer.valueOf(Math.max(point.x, point.y));
        }
        return f365d.intValue();
    }

    /* renamed from: b */
    public final int mo258b() {
        int i;
        int paddingTop = this.f366a.getPaddingTop() + this.f366a.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = this.f366a.getLayoutParams();
        if (layoutParams != null) {
            i = layoutParams.height;
        } else {
            i = 0;
        }
        return m509a(this.f366a.getHeight(), i, paddingTop);
    }

    /* renamed from: c */
    public final int mo259c() {
        int i;
        int paddingLeft = this.f366a.getPaddingLeft() + this.f366a.getPaddingRight();
        ViewGroup.LayoutParams layoutParams = this.f366a.getLayoutParams();
        if (layoutParams != null) {
            i = layoutParams.width;
        } else {
            i = 0;
        }
        return m509a(this.f366a.getWidth(), i, paddingLeft);
    }

    /* renamed from: a */
    public static final boolean m511a(int i, int i2) {
        return m510a(i) && m510a(i2);
    }
}
