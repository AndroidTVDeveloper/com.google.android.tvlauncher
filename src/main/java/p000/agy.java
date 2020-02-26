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

/* renamed from: agy */
/* compiled from: PG */
final class agy {

    /* renamed from: d */
    private static Integer f351d;

    /* renamed from: a */
    public final View f352a;

    /* renamed from: b */
    public final List f353b = new ArrayList();

    /* renamed from: c */
    public agx f354c;

    public agy(View view) {
        this.f352a = view;
    }

    /* renamed from: a */
    private static final boolean m469a(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo248a() {
        ViewTreeObserver viewTreeObserver = this.f352a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f354c);
        }
        this.f354c = null;
        this.f353b.clear();
    }

    /* renamed from: a */
    private final int m468a(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        if (this.f352a.isLayoutRequested() || i2 != -2) {
            return 0;
        }
        Context context = this.f352a.getContext();
        if (f351d == null) {
            Display defaultDisplay = ((WindowManager) aic.m542a((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f351d = Integer.valueOf(Math.max(point.x, point.y));
        }
        return f351d.intValue();
    }

    /* renamed from: b */
    public final int mo249b() {
        int i;
        int paddingTop = this.f352a.getPaddingTop() + this.f352a.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = this.f352a.getLayoutParams();
        if (layoutParams != null) {
            i = layoutParams.height;
        } else {
            i = 0;
        }
        return m468a(this.f352a.getHeight(), i, paddingTop);
    }

    /* renamed from: c */
    public final int mo250c() {
        int i;
        int paddingLeft = this.f352a.getPaddingLeft() + this.f352a.getPaddingRight();
        ViewGroup.LayoutParams layoutParams = this.f352a.getLayoutParams();
        if (layoutParams != null) {
            i = layoutParams.width;
        } else {
            i = 0;
        }
        return m468a(this.f352a.getWidth(), i, paddingLeft);
    }

    /* renamed from: a */
    public static final boolean m470a(int i, int i2) {
        return m469a(i) && m469a(i2);
    }
}
