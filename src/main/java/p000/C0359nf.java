package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.p002v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: nf */
/* compiled from: PG */
public class C0359nf extends RecyclerView {

    /* renamed from: L */
    public final C0373nt f9985L;

    /* renamed from: M */
    public C0358ne f9986M;

    /* renamed from: N */
    public final int f9987N = 4;

    /* renamed from: O */
    private final boolean f9988O = true;

    /* renamed from: P */
    private int f9989P;

    public C0359nf(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0373nt ntVar = new C0373nt(this);
        this.f9985L = ntVar;
        mo833a(ntVar);
        this.f1086z = false;
        setDescendantFocusability(262144);
        this.f1074n = true;
        setChildrenDrawingOrderEnabled(true);
        setWillNotDraw(true);
        setOverScrollMode(2);
        ((C0292kt) this.f1084x).f9821j = false;
        this.f1069i = new C0357nd();
    }

    public final boolean hasOverlappingRendering() {
        return this.f9988O;
    }

    /* renamed from: r */
    public final int mo5622r() {
        return this.f9985L.f10049r;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        C0358ne neVar = this.f9986M;
        if (neVar == null) {
            return false;
        }
        csc csc = (csc) neVar;
        if (keyEvent.getKeyCode() != csc.f7166a.f7171e && keyEvent.getKeyCode() != csc.f7166a.f7172f) {
            return false;
        }
        if (!csc.f7166a.f7168b && keyEvent.getAction() == 0 && keyEvent.getRepeatCount() > 0 && !dcy.m6193b(csc.f7166a.f7170d.getContext())) {
            cse cse = csc.f7166a;
            cse.f7174h.removeCallbacks(cse.f7175i);
            csc.f7166a.mo3696a(true);
            return false;
        } else if (!csc.f7166a.f7168b || keyEvent.getAction() != 1) {
            return false;
        } else {
            cse cse2 = csc.f7166a;
            cse2.f7174h.removeCallbacks(cse2.f7175i);
            cse cse3 = csc.f7166a;
            cse3.f7174h.postDelayed(cse3.f7175i, (long) cse3.f7167a);
            return false;
        }
    }

    public final View focusSearch(int i) {
        if (isFocused()) {
            C0373nt ntVar = this.f9985L;
            View c = ntVar.mo5363c(ntVar.f10049r);
            if (c != null) {
                return focusSearch(c, i);
            }
        }
        return super.focusSearch(i);
    }

    public final int getChildDrawingOrder(int i, int i2) {
        int indexOfChild;
        C0373nt ntVar = this.f9985L;
        View c = ntVar.mo5363c(ntVar.f10049r);
        if (c == null || i2 < (indexOfChild = indexOfChild(c))) {
            return i2;
        }
        return i2 < i + -1 ? ((indexOfChild + i) - 1) - i2 : indexOfChild;
    }

    /* renamed from: a */
    public final void mo5610a(Context context, AttributeSet attributeSet) {
        int i;
        int i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0324ly.f9933c);
        boolean z = obtainStyledAttributes.getBoolean(4, false);
        boolean z2 = obtainStyledAttributes.getBoolean(3, false);
        C0373nt ntVar = this.f9985L;
        int i3 = (!z ? 0 : 2048) | (ntVar.f10047p & -6145);
        if (!z2) {
            i = 0;
        } else {
            i = 4096;
        }
        ntVar.f10047p = i3 | i;
        boolean z3 = obtainStyledAttributes.getBoolean(6, true);
        boolean z4 = obtainStyledAttributes.getBoolean(5, true);
        C0373nt ntVar2 = this.f9985L;
        int i4 = (!z3 ? 0 : 8192) | (ntVar2.f10047p & -24577);
        if (!z4) {
            i2 = 0;
        } else {
            i2 = 16384;
        }
        ntVar2.f10047p = i4 | i2;
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, obtainStyledAttributes.getDimensionPixelSize(8, 0));
        if (ntVar2.f10043l == 1) {
            ntVar2.f10055x = dimensionPixelSize;
            ntVar2.f10056y = dimensionPixelSize;
        } else {
            ntVar2.f10055x = dimensionPixelSize;
            ntVar2.f10057z = dimensionPixelSize;
        }
        C0373nt ntVar3 = this.f9985L;
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, obtainStyledAttributes.getDimensionPixelSize(7, 0));
        if (ntVar3.f10043l == 0) {
            ntVar3.f10056y = dimensionPixelSize2;
        } else {
            ntVar3.f10057z = dimensionPixelSize2;
        }
        if (obtainStyledAttributes.hasValue(0)) {
            this.f9985L.f10020A = obtainStyledAttributes.getInt(0, 0);
            requestLayout();
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final boolean mo5625s() {
        return isChildrenDrawingOrderEnabled();
    }

    /* access modifiers changed from: protected */
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        C0373nt ntVar = this.f9985L;
        if (z) {
            int i2 = ntVar.f10049r;
            while (true) {
                View c = ntVar.mo5363c(i2);
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
        if ((this.f9989P & 1) != 1) {
            C0373nt ntVar = this.f9985L;
            View c = ntVar.mo5363c(ntVar.f10049r);
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
            nt r0 = r6.f9985L
            int r1 = r0.f10043l
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
            int r4 = r0.f10047p
            r5 = 786432(0xc0000, float:1.102026E-39)
            r5 = r5 & r4
            if (r5 == r1) goto L_0x0031
            r5 = -786433(0xfffffffffff3ffff, float:NaN)
            r4 = r4 & r5
            r1 = r1 | r4
            r0.f10047p = r1
            r1 = r1 | 256(0x100, float:3.59E-43)
            r0.f10047p = r1
            oz r0 = r0.f10023D
            oy r0 = r0.f10112c
            if (r7 != r3) goto L_0x002d
            r2 = 1
            goto L_0x002f
        L_0x002d:
        L_0x002f:
            r0.f10109k = r2
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0359nf.onRtlPropertiesChanged(int):void");
    }

    public final void removeView(View view) {
        boolean z = false;
        if (view.hasFocus() && isFocusable()) {
            z = true;
        }
        if (z) {
            this.f9989P |= 1;
            requestFocus();
        }
        super.removeView(view);
        if (z) {
            this.f9989P ^= -2;
        }
    }

    public final void removeViewAt(int i) {
        boolean hasFocus = getChildAt(i).hasFocus();
        if (hasFocus) {
            this.f9989P |= 1;
            requestFocus();
        }
        super.removeViewAt(i);
        if (hasFocus) {
            this.f9989P ^= -2;
        }
    }

    /* renamed from: k */
    public final void mo5619k(int i) {
        if (this.f9985L.mo5679v()) {
            this.f9985L.mo5675k(i);
        } else if (!this.f1077q) {
            mo872e();
            C0269jx jxVar = this.f1068h;
            if (jxVar == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            jxVar.mo5332a(i);
            awakenScrollBars();
        }
    }

    /* renamed from: t */
    public final void mo5626t() {
        C0373nt ntVar = this.f9985L;
        ntVar.f10024E.f10062d.mo5689a(0.0f);
        ntVar.mo5678u();
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
    /* renamed from: i */
    public final void mo5617i(int i) {
        this.f9985L.mo5661a(i, false);
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
    /* renamed from: j */
    public final void mo5618j(int i) {
        this.f9985L.mo5661a(i, true);
    }

    /* renamed from: g */
    public final void mo5613g(int i) {
        this.f9985L.f10023D.f10113d.f10103e = i;
        requestLayout();
    }

    /* renamed from: h */
    public final void mo5615h(int i) {
        this.f9985L.f10023D.f10113d.f10104f = i;
        requestLayout();
    }

    /* renamed from: a */
    public final void mo5609a(float f) {
        C0405oy oyVar = this.f9985L.f10023D.f10113d;
        if ((f < 0.0f || f > 100.0f) && f != -1.0f) {
            throw new IllegalArgumentException();
        }
        oyVar.f10105g = f;
        requestLayout();
    }

    /* renamed from: a */
    public final void mo825a(int i, int i2) {
        mo873e(i, i2);
    }

    /* renamed from: d */
    public final void mo861d(int i, int i2) {
        mo873e(i, i2);
    }

    /* renamed from: d */
    public final void mo860d(int i) {
        if (this.f9985L.mo5679v()) {
            this.f9985L.mo5675k(i);
        } else {
            super.mo860d(i);
        }
    }
}
