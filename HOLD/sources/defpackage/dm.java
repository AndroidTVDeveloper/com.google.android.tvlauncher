package defpackage;

import android.view.View;
import android.view.ViewParent;

/* renamed from: dm  reason: default package */
/* compiled from: PG */
public final class dm {
    public boolean a;
    private ViewParent b;
    private ViewParent c;
    private final View d;
    private int[] e;

    public dm(View view) {
        this.d = view;
    }

    private final ViewParent c(int i) {
        return i != 0 ? this.c : this.b;
    }

    public final boolean a(float f, float f2, boolean z) {
        ViewParent c2;
        if (!this.a || (c2 = c(0)) == null) {
            return false;
        }
        return el.a(c2, this.d, f, f2, z);
    }

    public final boolean a(float f, float f2) {
        ViewParent c2;
        if (!this.a || (c2 = c(0)) == null) {
            return false;
        }
        return el.a(c2, this.d, f, f2);
    }

    public final boolean a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent c2;
        int i4;
        int i5;
        if (!this.a || (c2 = c(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.d.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i4 = iArr2[1];
        } else {
            i5 = 0;
            i4 = 0;
        }
        if (iArr == null) {
            iArr = a();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        el.a(c2, this.d, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.d.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i4;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public final boolean a(int i, int i2, int i3, int i4, int[] iArr) {
        return a(i, i2, i3, i4, iArr, 0, null);
    }

    public final boolean a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent c2;
        int i6;
        int i7;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (!this.a || (c2 = c(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.d.getLocationInWindow(iArr4);
            i7 = iArr4[0];
            i6 = iArr4[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        if (iArr2 == null) {
            int[] a2 = a();
            a2[0] = 0;
            a2[1] = 0;
            iArr3 = a2;
        } else {
            iArr3 = iArr2;
        }
        el.a(c2, this.d, i, i2, i3, i4, i5, iArr3);
        if (iArr4 != null) {
            this.d.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i7;
            iArr4[1] = iArr4[1] - i6;
        }
        return true;
    }

    private final int[] a() {
        if (this.e == null) {
            this.e = new int[2];
        }
        return this.e;
    }

    public final boolean a(int i) {
        return c(i) != null;
    }

    public final void a(boolean z) {
        if (this.a) {
            dx.m(this.d);
        }
        this.a = z;
    }

    private final void a(int i, ViewParent viewParent) {
        if (i != 0) {
            this.c = viewParent;
        } else {
            this.b = viewParent;
        }
    }

    public final boolean a(int i, int i2) {
        if (a(i2)) {
            return true;
        }
        if (!this.a) {
            return false;
        }
        ViewParent parent = this.d.getParent();
        View view = this.d;
        while (parent != null) {
            if (!el.a(parent, view, this.d, i, i2)) {
                if (parent instanceof View) {
                    view = (View) parent;
                }
                parent = parent.getParent();
            } else {
                a(i2, parent);
                el.b(parent, view, this.d, i, i2);
                return true;
            }
        }
        return false;
    }

    public final void b(int i) {
        ViewParent c2 = c(i);
        if (c2 != null) {
            el.a(c2, this.d, i);
            a(i, (ViewParent) null);
        }
    }
}
