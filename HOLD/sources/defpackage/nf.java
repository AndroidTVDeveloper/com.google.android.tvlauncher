package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: nf  reason: default package */
/* compiled from: PG */
public class nf extends RecyclerView {
    public final nt L;
    public ne M;
    public final int N = 4;
    private final boolean O = true;
    private int P;

    public nf(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        nt ntVar = new nt(this);
        this.L = ntVar;
        a(ntVar);
        this.z = false;
        setDescendantFocusability(262144);
        this.n = true;
        setChildrenDrawingOrderEnabled(true);
        setWillNotDraw(true);
        setOverScrollMode(2);
        ((kt) this.x).j = false;
        this.i = new nd();
    }

    public final boolean hasOverlappingRendering() {
        return this.O;
    }

    public final int r() {
        return this.L.r;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        ne neVar = this.M;
        if (neVar == null) {
            return false;
        }
        csc csc = (csc) neVar;
        if (keyEvent.getKeyCode() != csc.a.e && keyEvent.getKeyCode() != csc.a.f) {
            return false;
        }
        if (!csc.a.b && keyEvent.getAction() == 0 && keyEvent.getRepeatCount() > 0 && !dcy.b(csc.a.d.getContext())) {
            cse cse = csc.a;
            cse.h.removeCallbacks(cse.i);
            csc.a.a(true);
            return false;
        } else if (!csc.a.b || keyEvent.getAction() != 1) {
            return false;
        } else {
            cse cse2 = csc.a;
            cse2.h.removeCallbacks(cse2.i);
            cse cse3 = csc.a;
            cse3.h.postDelayed(cse3.i, (long) cse3.a);
            return false;
        }
    }

    public final View focusSearch(int i) {
        if (isFocused()) {
            nt ntVar = this.L;
            View c = ntVar.c(ntVar.r);
            if (c != null) {
                return focusSearch(c, i);
            }
        }
        return super.focusSearch(i);
    }

    public final int getChildDrawingOrder(int i, int i2) {
        int indexOfChild;
        nt ntVar = this.L;
        View c = ntVar.c(ntVar.r);
        if (c == null || i2 < (indexOfChild = indexOfChild(c))) {
            return i2;
        }
        return i2 < i + -1 ? ((indexOfChild + i) - 1) - i2 : indexOfChild;
    }

    public final void a(Context context, AttributeSet attributeSet) {
        int i;
        int i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ly.c);
        boolean z = obtainStyledAttributes.getBoolean(4, false);
        boolean z2 = obtainStyledAttributes.getBoolean(3, false);
        nt ntVar = this.L;
        int i3 = (!z ? 0 : 2048) | (ntVar.p & -6145);
        if (!z2) {
            i = 0;
        } else {
            i = 4096;
        }
        ntVar.p = i3 | i;
        boolean z3 = obtainStyledAttributes.getBoolean(6, true);
        boolean z4 = obtainStyledAttributes.getBoolean(5, true);
        nt ntVar2 = this.L;
        int i4 = (!z3 ? 0 : 8192) | (ntVar2.p & -24577);
        if (!z4) {
            i2 = 0;
        } else {
            i2 = 16384;
        }
        ntVar2.p = i4 | i2;
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, obtainStyledAttributes.getDimensionPixelSize(8, 0));
        if (ntVar2.l == 1) {
            ntVar2.x = dimensionPixelSize;
            ntVar2.y = dimensionPixelSize;
        } else {
            ntVar2.x = dimensionPixelSize;
            ntVar2.z = dimensionPixelSize;
        }
        nt ntVar3 = this.L;
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, obtainStyledAttributes.getDimensionPixelSize(7, 0));
        if (ntVar3.l == 0) {
            ntVar3.y = dimensionPixelSize2;
        } else {
            ntVar3.z = dimensionPixelSize2;
        }
        if (obtainStyledAttributes.hasValue(0)) {
            this.L.A = obtainStyledAttributes.getInt(0, 0);
            requestLayout();
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: package-private */
    public final boolean s() {
        return isChildrenDrawingOrderEnabled();
    }

    /* access modifiers changed from: protected */
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        nt ntVar = this.L;
        if (z) {
            int i2 = ntVar.r;
            while (true) {
                View c = ntVar.c(i2);
                if (c == null) {
                    return;
                }
                if (c.getVisibility() == 0 && c.hasFocusable()) {
                    c.requestFocus();
                    return;
                }
                i2++;
            }
        }
    }

    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if ((this.P & 1) != 1) {
            nt ntVar = this.L;
            View c = ntVar.c(ntVar.r);
            if (c != null) {
                return c.requestFocus(i, rect);
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onRtlPropertiesChanged(int r7) {
        /*
            r6 = this;
            nt r0 = r6.L
            int r1 = r0.l
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x000d
            if (r7 != r3) goto L_0x0012
            r1 = 262144(0x40000, float:3.67342E-40)
            goto L_0x0013
        L_0x000d:
            if (r7 != r3) goto L_0x0012
            r1 = 524288(0x80000, float:7.34684E-40)
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            int r4 = r0.p
            r5 = 786432(0xc0000, float:1.102026E-39)
            r5 = r5 & r4
            if (r5 == r1) goto L_0x0031
            r5 = -786433(0xfffffffffff3ffff, float:NaN)
            r4 = r4 & r5
            r1 = r1 | r4
            r0.p = r1
            r1 = r1 | 256(0x100, float:3.59E-43)
            r0.p = r1
            oz r0 = r0.D
            oy r0 = r0.c
            if (r7 != r3) goto L_0x002d
            r2 = 1
            goto L_0x002f
        L_0x002d:
        L_0x002f:
            r0.k = r2
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nf.onRtlPropertiesChanged(int):void");
    }

    public final void removeView(View view) {
        boolean z = false;
        if (view.hasFocus() && isFocusable()) {
            z = true;
        }
        if (z) {
            this.P |= 1;
            requestFocus();
        }
        super.removeView(view);
        if (z) {
            this.P ^= -2;
        }
    }

    public final void removeViewAt(int i) {
        boolean hasFocus = getChildAt(i).hasFocus();
        if (hasFocus) {
            this.P |= 1;
            requestFocus();
        }
        super.removeViewAt(i);
        if (hasFocus) {
            this.P ^= -2;
        }
    }

    public final void k(int i) {
        if (this.L.v()) {
            this.L.k(i);
        } else if (!this.q) {
            e();
            jx jxVar = this.h;
            if (jxVar == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            jxVar.a(i);
            awakenScrollBars();
        }
    }

    public final void t() {
        nt ntVar = this.L;
        ntVar.E.d.a(0.0f);
        ntVar.u();
        requestLayout();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nt.a(int, boolean):void
     arg types: [int, int]
     candidates:
      nt.a(boolean, int):int
      nt.a(android.content.Context, android.util.AttributeSet):jy
      nt.a(int, jw):void
      nt.a(android.view.View, android.graphics.Rect):void
      nt.a(android.view.View, android.view.View):void
      nt.a(android.view.View, ed):void
      nt.a(android.view.View, boolean):void
      nt.a(jp, jp):void
      nt.a(kc, kk):void
      jx.a(android.content.Context, android.util.AttributeSet):jy
      jx.a(int, int):void
      jx.a(int, jw):void
      jx.a(android.view.View, int):void
      jx.a(android.view.View, android.graphics.Rect):void
      jx.a(android.view.View, android.view.View):void
      jx.a(android.view.View, ed):void
      jx.a(android.view.View, kc):void
      jx.a(jp, jp):void
      jx.a(kc, kk):void
      nt.a(int, boolean):void */
    public final void i(int i) {
        this.L.a(i, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nt.a(int, boolean):void
     arg types: [int, int]
     candidates:
      nt.a(boolean, int):int
      nt.a(android.content.Context, android.util.AttributeSet):jy
      nt.a(int, jw):void
      nt.a(android.view.View, android.graphics.Rect):void
      nt.a(android.view.View, android.view.View):void
      nt.a(android.view.View, ed):void
      nt.a(android.view.View, boolean):void
      nt.a(jp, jp):void
      nt.a(kc, kk):void
      jx.a(android.content.Context, android.util.AttributeSet):jy
      jx.a(int, int):void
      jx.a(int, jw):void
      jx.a(android.view.View, int):void
      jx.a(android.view.View, android.graphics.Rect):void
      jx.a(android.view.View, android.view.View):void
      jx.a(android.view.View, ed):void
      jx.a(android.view.View, kc):void
      jx.a(jp, jp):void
      jx.a(kc, kk):void
      nt.a(int, boolean):void */
    public final void j(int i) {
        this.L.a(i, true);
    }

    public final void g(int i) {
        this.L.D.d.e = i;
        requestLayout();
    }

    public final void h(int i) {
        this.L.D.d.f = i;
        requestLayout();
    }

    public final void a(float f) {
        oy oyVar = this.L.D.d;
        if ((f < 0.0f || f > 100.0f) && f != -1.0f) {
            throw new IllegalArgumentException();
        }
        oyVar.g = f;
        requestLayout();
    }

    public final void a(int i, int i2) {
        e(i, i2);
    }

    public final void d(int i, int i2) {
        e(i, i2);
    }

    public final void d(int i) {
        if (this.L.v()) {
            this.L.k(i);
        } else {
            super.d(i);
        }
    }
}
