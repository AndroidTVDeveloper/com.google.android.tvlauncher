package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ahi  reason: default package */
/* compiled from: PG */
final class ahi {
    private static Integer d;
    public final View a;
    public final List b = new ArrayList();
    public ahh c;

    public ahi(View view) {
        this.a = view;
    }

    private static final boolean a(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.c);
        }
        this.c = null;
        this.b.clear();
    }

    private final int a(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        if (this.a.isLayoutRequested() || i2 != -2) {
            return 0;
        }
        Context context = this.a.getContext();
        if (d == null) {
            Display defaultDisplay = ((WindowManager) aic.a((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            d = Integer.valueOf(Math.max(point.x, point.y));
        }
        return d.intValue();
    }

    public final int b() {
        int i;
        int paddingTop = this.a.getPaddingTop() + this.a.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        if (layoutParams != null) {
            i = layoutParams.height;
        } else {
            i = 0;
        }
        return a(this.a.getHeight(), i, paddingTop);
    }

    public final int c() {
        int i;
        int paddingLeft = this.a.getPaddingLeft() + this.a.getPaddingRight();
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        if (layoutParams != null) {
            i = layoutParams.width;
        } else {
            i = 0;
        }
        return a(this.a.getWidth(), i, paddingLeft);
    }

    public static final boolean a(int i, int i2) {
        return a(i) && a(i2);
    }
}
