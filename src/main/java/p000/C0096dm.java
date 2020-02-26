package p000;

import android.view.View;
import android.view.ViewParent;

/* renamed from: dm */
/* compiled from: PG */
public final class C0096dm {

    /* renamed from: a */
    public boolean f8789a;

    /* renamed from: b */
    private ViewParent f8790b;

    /* renamed from: c */
    private ViewParent f8791c;

    /* renamed from: d */
    private final View f8792d;

    /* renamed from: e */
    private int[] f8793e;

    public C0096dm(View view) {
        this.f8792d = view;
    }

    /* renamed from: c */
    private final ViewParent m7071c(int i) {
        return i != 0 ? this.f8791c : this.f8790b;
    }

    /* renamed from: a */
    public final boolean mo4672a(float f, float f2, boolean z) {
        ViewParent c;
        if (!this.f8789a || (c = m7071c(0)) == null) {
            return false;
        }
        return C0122el.m7254a(c, this.f8792d, f, f2, z);
    }

    /* renamed from: a */
    public final boolean mo4671a(float f, float f2) {
        ViewParent c;
        if (!this.f8789a || (c = m7071c(0)) == null) {
            return false;
        }
        return C0122el.m7253a(c, this.f8792d, f, f2);
    }

    /* renamed from: a */
    public final boolean mo4677a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent c;
        int i4;
        int i5;
        if (!this.f8789a || (c = m7071c(i3)) == null) {
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
            this.f8792d.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i4 = iArr2[1];
        } else {
            i5 = 0;
            i4 = 0;
        }
        if (iArr == null) {
            iArr = m7070a();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        C0122el.m7250a(c, this.f8792d, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.f8792d.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i4;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    /* renamed from: a */
    public final boolean mo4675a(int i, int i2, int i3, int i4, int[] iArr) {
        return mo4676a(i, i2, i3, i4, iArr, 0, null);
    }

    /* renamed from: a */
    public final boolean mo4676a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent c;
        int i6;
        int i7;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (!this.f8789a || (c = m7071c(i5)) == null) {
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
            this.f8792d.getLocationInWindow(iArr4);
            i7 = iArr4[0];
            i6 = iArr4[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        if (iArr2 == null) {
            int[] a = m7070a();
            a[0] = 0;
            a[1] = 0;
            iArr3 = a;
        } else {
            iArr3 = iArr2;
        }
        C0122el.m7249a(c, this.f8792d, i, i2, i3, i4, i5, iArr3);
        if (iArr4 != null) {
            this.f8792d.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i7;
            iArr4[1] = iArr4[1] - i6;
        }
        return true;
    }

    /* renamed from: a */
    private final int[] m7070a() {
        if (this.f8793e == null) {
            this.f8793e = new int[2];
        }
        return this.f8793e;
    }

    /* renamed from: a */
    public final boolean mo4673a(int i) {
        return m7071c(i) != null;
    }

    /* renamed from: a */
    public final void mo4670a(boolean z) {
        if (this.f8789a) {
            C0107dx.m7216m(this.f8792d);
        }
        this.f8789a = z;
    }

    /* renamed from: a */
    private final void m7069a(int i, ViewParent viewParent) {
        if (i != 0) {
            this.f8791c = viewParent;
        } else {
            this.f8790b = viewParent;
        }
    }

    /* renamed from: a */
    public final boolean mo4674a(int i, int i2) {
        if (mo4673a(i2)) {
            return true;
        }
        if (!this.f8789a) {
            return false;
        }
        ViewParent parent = this.f8792d.getParent();
        View view = this.f8792d;
        while (parent != null) {
            if (!C0122el.m7255a(parent, view, this.f8792d, i, i2)) {
                if (parent instanceof View) {
                    view = (View) parent;
                }
                parent = parent.getParent();
            } else {
                m7069a(i2, parent);
                C0122el.m7256b(parent, view, this.f8792d, i, i2);
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo4678b(int i) {
        ViewParent c = m7071c(i);
        if (c != null) {
            C0122el.m7248a(c, this.f8792d, i);
            m7069a(i, (ViewParent) null);
        }
    }
}
