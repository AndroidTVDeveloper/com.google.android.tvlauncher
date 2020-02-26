package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: is  reason: default package */
/* compiled from: PG */
public class is extends ViewGroup {
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    public int f;
    public Drawable g;
    public int h;
    private float i;
    private boolean j;
    private int[] k;
    private int[] l;
    private int m;
    private int n;
    private int o;

    public is(Context context) {
        this(context, null);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public is(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: kz.a(int, boolean):boolean
     arg types: [int, int]
     candidates:
      kz.a(int, int):int
      kz.a(int, boolean):boolean */
    public is(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        boolean z = true;
        this.a = true;
        this.b = -1;
        this.c = 0;
        this.f = 8388659;
        kz a2 = kz.a(context, attributeSet, er.i, i2);
        int a3 = a2.a(1, -1);
        if (a3 >= 0 && this.d != a3) {
            this.d = a3;
            requestLayout();
        }
        int a4 = a2.a(0, -1);
        if (a4 >= 0 && this.f != a4) {
            a4 = (8388615 & a4) == 0 ? a4 | 8388611 : a4;
            this.f = (a4 & 112) == 0 ? a4 | 48 : a4;
            requestLayout();
        }
        if (!a2.a(2, true)) {
            d();
        }
        this.i = a2.b.getFloat(4, -1.0f);
        this.b = a2.a(3, -1);
        this.j = a2.a(7, false);
        Drawable a5 = a2.a(5);
        if (a5 != this.g) {
            this.g = a5;
            if (a5 != null) {
                this.h = a5.getIntrinsicWidth();
                this.m = a5.getIntrinsicHeight();
            } else {
                this.h = 0;
                this.m = 0;
            }
            setWillNotDraw(a5 != null ? false : z);
            requestLayout();
        }
        this.n = a2.a(8, 0);
        this.o = a2.d(6, 0);
        a2.a();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ir;
    }

    private final void a(Canvas canvas, int i2) {
        this.g.setBounds(getPaddingLeft() + this.o, i2, (getWidth() - getPaddingRight()) - this.o, this.m + i2);
        this.g.draw(canvas);
    }

    private final void b(Canvas canvas, int i2) {
        this.g.setBounds(i2, getPaddingTop() + this.o, this.h + i2, (getHeight() - getPaddingBottom()) - this.o);
        this.g.draw(canvas);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public ir generateDefaultLayoutParams() {
        int i2 = this.d;
        if (i2 == 0) {
            return new ir(-2);
        }
        if (i2 == 1) {
            return new ir(-1);
        }
        return null;
    }

    /* renamed from: a */
    public ir generateLayoutParams(AttributeSet attributeSet) {
        return new ir(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ir generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ir(layoutParams);
    }

    public final int getBaseline() {
        int i2;
        if (this.b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.b;
        if (childCount > i3) {
            View childAt = getChildAt(i3);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i4 = this.c;
                if (this.d == 1 && (i2 = this.f & 112) != 48) {
                    if (i2 == 16) {
                        i4 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.e) / 2;
                    } else if (i2 == 80) {
                        i4 = ((getBottom() - getTop()) - getPaddingBottom()) - this.e;
                    }
                }
                return i4 + ((ir) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.b == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i2) {
        if (i2 == 0) {
            return (this.n & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.n & 4) != 0;
        }
        if ((this.n & 2) == 0) {
            return false;
        }
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (getChildAt(i3).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        if (this.g != null) {
            int i5 = 0;
            if (this.d != 1) {
                int childCount = getChildCount();
                boolean a2 = ln.a(this);
                while (i5 < childCount) {
                    View childAt = getChildAt(i5);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !a(i5))) {
                        ir irVar = (ir) childAt.getLayoutParams();
                        if (a2) {
                            i4 = childAt.getRight() + irVar.rightMargin;
                        } else {
                            i4 = (childAt.getLeft() - irVar.leftMargin) - this.h;
                        }
                        b(canvas, i4);
                    }
                    i5++;
                }
                if (a(childCount)) {
                    View childAt2 = getChildAt(childCount - 1);
                    if (childAt2 != null) {
                        ir irVar2 = (ir) childAt2.getLayoutParams();
                        if (a2) {
                            i3 = (childAt2.getLeft() - irVar2.leftMargin) - this.h;
                        } else {
                            i3 = childAt2.getRight() + irVar2.rightMargin;
                        }
                    } else if (!a2) {
                        i3 = (getWidth() - getPaddingRight()) - this.h;
                    } else {
                        i3 = getPaddingLeft();
                    }
                    b(canvas, i3);
                    return;
                }
                return;
            }
            int childCount2 = getChildCount();
            while (i5 < childCount2) {
                View childAt3 = getChildAt(i5);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !a(i5))) {
                    a(canvas, (childAt3.getTop() - ((ir) childAt3.getLayoutParams()).topMargin) - this.m);
                }
                i5++;
            }
            if (a(childCount2)) {
                View childAt4 = getChildAt(childCount2 - 1);
                if (childAt4 != null) {
                    i2 = childAt4.getBottom() + ((ir) childAt4.getLayoutParams()).bottomMargin;
                } else {
                    i2 = (getHeight() - getPaddingBottom()) - this.m;
                }
                a(canvas, i2);
            }
        }
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.support.v7.widget.LinearLayoutCompat");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.support.v7.widget.LinearLayoutCompat");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        /*
            r21 = this;
            r0 = r21
            int r1 = r0.d
            r2 = 8
            r3 = 5
            r6 = 8388615(0x800007, float:1.1754953E-38)
            r8 = 2
            r9 = 1
            if (r1 == r9) goto L_0x012e
            boolean r1 = defpackage.ln.a(r21)
            int r10 = r21.getPaddingTop()
            int r11 = r26 - r24
            int r12 = r21.getPaddingBottom()
            int r12 = r11 - r12
            int r11 = r11 - r10
            int r13 = r21.getPaddingBottom()
            int r11 = r11 - r13
            int r13 = r21.getChildCount()
            int r14 = r0.f
            r15 = r14 & 112(0x70, float:1.57E-43)
            boolean r7 = r0.a
            int[] r4 = r0.k
            int[] r5 = r0.l
            r6 = r6 & r14
            int r14 = defpackage.dx.f(r21)
            int r6 = defpackage.el.a(r6, r14)
            if (r6 == r9) goto L_0x0050
            if (r6 == r3) goto L_0x0044
            int r3 = r21.getPaddingLeft()
            goto L_0x005b
        L_0x0044:
            int r3 = r21.getPaddingLeft()
            int r3 = r3 + r25
            int r3 = r3 - r23
            int r6 = r0.e
            int r3 = r3 - r6
            goto L_0x005b
        L_0x0050:
            int r3 = r21.getPaddingLeft()
            int r6 = r25 - r23
            int r14 = r0.e
            int r6 = r6 - r14
            int r6 = r6 / r8
            int r3 = r3 + r6
        L_0x005b:
            if (r1 == 0) goto L_0x0061
            int r1 = r13 + -1
            r14 = -1
            goto L_0x0064
        L_0x0061:
            r1 = 0
            r14 = 1
        L_0x0064:
            r16 = r3
            r3 = 0
        L_0x0067:
            if (r3 >= r13) goto L_0x01da
            int r17 = r14 * r3
            int r9 = r1 + r17
            android.view.View r8 = r0.getChildAt(r9)
            if (r8 != 0) goto L_0x007e
            r24 = r1
            r19 = r7
            r26 = r13
            r25 = r14
            r14 = -1
            goto L_0x011e
        L_0x007e:
            int r6 = r8.getVisibility()
            if (r6 == r2) goto L_0x0115
            int r6 = r8.getMeasuredWidth()
            int r2 = r8.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r19 = r8.getLayoutParams()
            r24 = r1
            r1 = r19
            ir r1 = (defpackage.ir) r1
            if (r7 == 0) goto L_0x00a7
            r19 = r7
            int r7 = r1.height
            r26 = r13
            r13 = -1
            if (r7 == r13) goto L_0x00a6
            int r7 = r8.getBaseline()
            goto L_0x00ac
        L_0x00a6:
            goto L_0x00ab
        L_0x00a7:
            r19 = r7
            r26 = r13
        L_0x00ab:
            r7 = -1
        L_0x00ac:
            int r13 = r1.h
            if (r13 < 0) goto L_0x00b1
            goto L_0x00b2
        L_0x00b1:
            r13 = r15
        L_0x00b2:
            r13 = r13 & 112(0x70, float:1.57E-43)
            r25 = r14
            r14 = 16
            if (r13 == r14) goto L_0x00f0
            r14 = 48
            if (r13 == r14) goto L_0x00de
            r14 = 80
            if (r13 == r14) goto L_0x00c5
            r7 = r10
        L_0x00c3:
            r14 = -1
            goto L_0x00fc
        L_0x00c5:
            int r13 = r12 - r2
            int r14 = r1.bottomMargin
            int r13 = r13 - r14
            r14 = -1
            if (r7 == r14) goto L_0x00dc
            int r14 = r8.getMeasuredHeight()
            r17 = 2
            r20 = r5[r17]
            int r14 = r14 - r7
            int r20 = r20 - r14
            int r7 = r13 - r20
            r14 = -1
            goto L_0x00fc
        L_0x00dc:
            r7 = r13
            goto L_0x00c3
        L_0x00de:
            int r13 = r1.topMargin
            int r13 = r13 + r10
            r14 = -1
            if (r7 != r14) goto L_0x00e6
            r7 = r13
            goto L_0x00fc
        L_0x00e6:
            r18 = 1
            r20 = r4[r18]
            int r20 = r20 - r7
            int r7 = r13 + r20
            goto L_0x00fc
        L_0x00f0:
            r14 = -1
            int r7 = r11 - r2
            r13 = 2
            int r7 = r7 / r13
            int r7 = r7 + r10
            int r13 = r1.topMargin
            int r7 = r7 + r13
            int r13 = r1.bottomMargin
            int r7 = r7 - r13
        L_0x00fc:
            boolean r9 = r0.a(r9)
            if (r9 != 0) goto L_0x0103
            goto L_0x0107
        L_0x0103:
            int r9 = r0.h
            int r16 = r16 + r9
        L_0x0107:
            int r9 = r1.leftMargin
            int r9 = r16 + r9
            a(r8, r9, r7, r6, r2)
            int r1 = r1.rightMargin
            int r6 = r6 + r1
            int r9 = r9 + r6
            r16 = r9
            goto L_0x011e
        L_0x0115:
            r24 = r1
            r19 = r7
            r26 = r13
            r25 = r14
            r14 = -1
        L_0x011e:
            int r3 = r3 + 1
            r1 = r24
            r14 = r25
            r13 = r26
            r7 = r19
            r2 = 8
            r8 = 2
            r9 = 1
            goto L_0x0067
        L_0x012e:
            int r1 = r21.getPaddingLeft()
            int r2 = r25 - r23
            int r4 = r21.getPaddingRight()
            int r4 = r2 - r4
            int r2 = r2 - r1
            int r5 = r21.getPaddingRight()
            int r2 = r2 - r5
            int r5 = r21.getChildCount()
            int r7 = r0.f
            r6 = r6 & r7
            r7 = r7 & 112(0x70, float:1.57E-43)
            r8 = 16
            if (r7 == r8) goto L_0x0162
            r8 = 80
            if (r7 == r8) goto L_0x0156
            int r7 = r21.getPaddingTop()
            goto L_0x016e
        L_0x0156:
            int r7 = r21.getPaddingTop()
            int r7 = r7 + r26
            int r7 = r7 - r24
            int r8 = r0.e
            int r7 = r7 - r8
            goto L_0x016e
        L_0x0162:
            int r7 = r21.getPaddingTop()
            int r8 = r26 - r24
            int r9 = r0.e
            int r8 = r8 - r9
            r9 = 2
            int r8 = r8 / r9
            int r7 = r7 + r8
        L_0x016e:
            r8 = r7
            r7 = 0
        L_0x0170:
            if (r7 >= r5) goto L_0x01da
            android.view.View r9 = r0.getChildAt(r7)
            if (r9 != 0) goto L_0x017b
            r14 = 2
            r15 = 1
            goto L_0x01d6
        L_0x017b:
            int r10 = r9.getVisibility()
            r11 = 8
            if (r10 == r11) goto L_0x01d4
            int r10 = r9.getMeasuredWidth()
            int r12 = r9.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r13 = r9.getLayoutParams()
            ir r13 = (defpackage.ir) r13
            int r14 = r13.h
            if (r14 < 0) goto L_0x0196
            goto L_0x0197
        L_0x0196:
            r14 = r6
        L_0x0197:
            int r15 = defpackage.dx.f(r21)
            int r14 = defpackage.el.a(r14, r15)
            r14 = r14 & 7
            r15 = 1
            if (r14 == r15) goto L_0x01b4
            if (r14 == r3) goto L_0x01ac
            int r14 = r13.leftMargin
            int r14 = r14 + r1
            r3 = r14
            r14 = 2
            goto L_0x01bf
        L_0x01ac:
            int r14 = r4 - r10
            int r3 = r13.rightMargin
            int r14 = r14 - r3
            r3 = r14
            r14 = 2
            goto L_0x01bf
        L_0x01b4:
            int r3 = r2 - r10
            r14 = 2
            int r3 = r3 / r14
            int r3 = r3 + r1
            int r11 = r13.leftMargin
            int r3 = r3 + r11
            int r11 = r13.rightMargin
            int r3 = r3 - r11
        L_0x01bf:
            boolean r11 = r0.a(r7)
            if (r11 != 0) goto L_0x01c6
            goto L_0x01c9
        L_0x01c6:
            int r11 = r0.m
            int r8 = r8 + r11
        L_0x01c9:
            int r11 = r13.topMargin
            int r8 = r8 + r11
            a(r9, r3, r8, r10, r12)
            int r3 = r13.bottomMargin
            int r12 = r12 + r3
            int r8 = r8 + r12
            goto L_0x01d6
        L_0x01d4:
            r14 = 2
            r15 = 1
        L_0x01d6:
            int r7 = r7 + 1
            r3 = 5
            goto L_0x0170
        L_0x01da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.is.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0367  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x049e  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x04a3  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x04d0  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x04d6  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x04e0  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x04ec  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x04fe  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x050b  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0529  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0559  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0561  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0571  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0580  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x08bd  */
    /* JADX WARNING: Removed duplicated region for block: B:419:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r40, int r41) {
        /*
            r39 = this;
            r6 = r39
            r7 = r40
            r8 = r41
            int r0 = r6.d
            r10 = 16777215(0xffffff, float:2.3509886E-38)
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 8
            r13 = 0
            r15 = 1
            r4 = 0
            if (r0 != r15) goto L_0x03ab
            r6.e = r4
            int r3 = r39.getChildCount()
            int r2 = android.view.View.MeasureSpec.getMode(r40)
            int r1 = android.view.View.MeasureSpec.getMode(r41)
            int r0 = r6.b
            boolean r15 = r6.j
            r5 = 0
            r9 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 1
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
        L_0x0039:
            if (r9 < r3) goto L_0x0244
            int r0 = r6.e
            if (r0 <= 0) goto L_0x004c
            boolean r0 = r6.a(r3)
            if (r0 == 0) goto L_0x004c
            int r0 = r6.e
            int r9 = r6.m
            int r0 = r0 + r9
            r6.e = r0
        L_0x004c:
            if (r15 != 0) goto L_0x004f
            goto L_0x0081
        L_0x004f:
            if (r1 == r11) goto L_0x0053
            if (r1 != 0) goto L_0x0081
        L_0x0053:
            r6.e = r4
            r0 = 0
        L_0x0057:
            if (r0 >= r3) goto L_0x0081
            android.view.View r9 = r6.getChildAt(r0)
            if (r9 != 0) goto L_0x0060
            goto L_0x007e
        L_0x0060:
            int r11 = r9.getVisibility()
            if (r11 == r12) goto L_0x007e
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            ir r9 = (defpackage.ir) r9
            int r11 = r6.e
            int r17 = r11 + r5
            int r14 = r9.topMargin
            int r17 = r17 + r14
            int r9 = r9.bottomMargin
            int r9 = r17 + r9
            int r9 = java.lang.Math.max(r11, r9)
            r6.e = r9
        L_0x007e:
            int r0 = r0 + 1
            goto L_0x0057
        L_0x0081:
            int r0 = r6.e
            int r9 = r39.getPaddingTop()
            int r11 = r39.getPaddingBottom()
            int r9 = r9 + r11
            int r0 = r0 + r9
            r6.e = r0
            int r9 = r39.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r0, r9)
            int r0 = android.view.View.resolveSizeAndState(r0, r8, r4)
            r9 = r0 & r10
            int r10 = r6.e
            int r9 = r9 - r10
            if (r24 == 0) goto L_0x00a3
            goto L_0x00ac
        L_0x00a3:
            if (r9 != 0) goto L_0x00a7
            goto L_0x0195
        L_0x00a7:
            int r10 = (r22 > r13 ? 1 : (r22 == r13 ? 0 : -1))
            if (r10 <= 0) goto L_0x0195
        L_0x00ac:
            float r5 = r6.i
            int r10 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r10 <= 0) goto L_0x00b3
            goto L_0x00b5
        L_0x00b3:
            r5 = r22
        L_0x00b5:
            r6.e = r4
            r15 = r5
            r14 = r9
            r9 = r18
            r10 = r19
            r11 = r25
            r5 = 0
        L_0x00c0:
            if (r5 < r3) goto L_0x00d4
            int r1 = r6.e
            int r5 = r39.getPaddingTop()
            int r13 = r39.getPaddingBottom()
            int r5 = r5 + r13
            int r1 = r1 + r5
            r6.e = r1
            r25 = r11
            goto L_0x01d8
        L_0x00d4:
            android.view.View r4 = r6.getChildAt(r5)
            int r13 = r4.getVisibility()
            if (r13 == r12) goto L_0x0189
            android.view.ViewGroup$LayoutParams r13 = r4.getLayoutParams()
            ir r13 = (defpackage.ir) r13
            float r12 = r13.g
            r17 = 0
            int r18 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r18 <= 0) goto L_0x0140
            float r8 = (float) r14
            float r8 = r8 * r12
            float r8 = r8 / r15
            int r8 = (int) r8
            float r15 = r15 - r12
            int r14 = r14 - r8
            int r12 = r39.getPaddingLeft()
            int r17 = r39.getPaddingRight()
            int r12 = r12 + r17
            r17 = r14
            int r14 = r13.leftMargin
            int r12 = r12 + r14
            int r14 = r13.rightMargin
            int r12 = r12 + r14
            int r14 = r13.width
            int r12 = getChildMeasureSpec(r7, r12, r14)
            int r14 = r13.height
            if (r14 != 0) goto L_0x0120
            r14 = 1073741824(0x40000000, float:2.0)
            if (r1 != r14) goto L_0x0120
            if (r8 <= 0) goto L_0x0116
            goto L_0x0118
        L_0x0116:
            r8 = 0
        L_0x0118:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r14)
            r4.measure(r12, r8)
            goto L_0x0133
        L_0x0120:
            int r14 = r4.getMeasuredHeight()
            int r8 = r8 + r14
            if (r8 < 0) goto L_0x0128
            goto L_0x012a
        L_0x0128:
            r8 = 0
        L_0x012a:
            r14 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r14)
            r4.measure(r12, r8)
        L_0x0133:
            int r8 = r4.getMeasuredState()
            r8 = r8 & -256(0xffffffffffffff00, float:NaN)
            int r9 = android.view.View.combineMeasuredStates(r9, r8)
            r14 = r17
            goto L_0x0141
        L_0x0140:
        L_0x0141:
            int r8 = r13.leftMargin
            int r12 = r13.rightMargin
            int r8 = r8 + r12
            int r12 = r4.getMeasuredWidth()
            int r12 = r12 + r8
            int r11 = java.lang.Math.max(r11, r12)
            r17 = r8
            r8 = 1073741824(0x40000000, float:2.0)
            if (r2 == r8) goto L_0x015f
            int r8 = r13.width
            r18 = r9
            r9 = -1
            if (r8 != r9) goto L_0x0161
            r12 = r17
            goto L_0x0161
        L_0x015f:
            r18 = r9
        L_0x0161:
            int r8 = java.lang.Math.max(r10, r12)
            if (r21 == 0) goto L_0x016f
            int r9 = r13.width
            r10 = -1
            if (r9 != r10) goto L_0x016e
            r9 = 1
            goto L_0x0170
        L_0x016e:
        L_0x016f:
            r9 = 0
        L_0x0170:
            int r10 = r6.e
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r10
            int r12 = r13.topMargin
            int r4 = r4 + r12
            int r12 = r13.bottomMargin
            int r4 = r4 + r12
            int r4 = java.lang.Math.max(r10, r4)
            r6.e = r4
            r10 = r8
            r21 = r9
            r9 = r18
            goto L_0x018a
        L_0x0189:
        L_0x018a:
            int r5 = r5 + 1
            r8 = r41
            r4 = 0
            r12 = 8
            r13 = 0
            goto L_0x00c0
        L_0x0195:
            r8 = r19
            r12 = r20
            int r10 = java.lang.Math.max(r8, r12)
            if (r15 == 0) goto L_0x01d6
            r4 = 1073741824(0x40000000, float:2.0)
            if (r1 == r4) goto L_0x01d6
            r1 = 0
        L_0x01a4:
            if (r1 >= r3) goto L_0x01d6
            android.view.View r4 = r6.getChildAt(r1)
            if (r4 != 0) goto L_0x01ad
            goto L_0x01d3
        L_0x01ad:
            int r8 = r4.getVisibility()
            r9 = 8
            if (r8 == r9) goto L_0x01d3
            android.view.ViewGroup$LayoutParams r8 = r4.getLayoutParams()
            ir r8 = (defpackage.ir) r8
            float r8 = r8.g
            r9 = 0
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x01d3
            int r8 = r4.getMeasuredWidth()
            r9 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r9)
            r4.measure(r8, r11)
        L_0x01d3:
            int r1 = r1 + 1
            goto L_0x01a4
        L_0x01d6:
            r9 = r18
        L_0x01d8:
            if (r21 == 0) goto L_0x01db
            goto L_0x01e1
        L_0x01db:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r2 == r1) goto L_0x01e1
            r25 = r10
        L_0x01e1:
            int r1 = r39.getPaddingLeft()
            int r2 = r39.getPaddingRight()
            int r1 = r1 + r2
            int r1 = r25 + r1
            int r2 = r39.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r1, r2)
            int r1 = android.view.View.resolveSizeAndState(r1, r7, r9)
            r6.setMeasuredDimension(r1, r0)
            if (r23 == 0) goto L_0x08fb
            int r0 = r39.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r8 = 0
        L_0x0208:
            if (r8 >= r3) goto L_0x08fb
            android.view.View r1 = r6.getChildAt(r8)
            int r0 = r1.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x023e
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r9 = r0
            ir r9 = (defpackage.ir) r9
            int r0 = r9.width
            r5 = -1
            if (r0 != r5) goto L_0x023b
            int r10 = r9.height
            int r0 = r1.getMeasuredHeight()
            r9.height = r0
            r4 = 0
            r11 = 0
            r0 = r39
            r2 = r7
            r13 = r3
            r3 = r4
            r4 = r41
            r14 = -1
            r5 = r11
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r9.height = r10
            goto L_0x0240
        L_0x023b:
            r13 = r3
            r14 = -1
            goto L_0x0240
        L_0x023e:
            r13 = r3
            r14 = -1
        L_0x0240:
            int r8 = r8 + 1
            r3 = r13
            goto L_0x0208
        L_0x0244:
            r13 = r3
            r8 = r19
            r12 = r20
            r14 = -1
            android.view.View r19 = r6.getChildAt(r9)
            if (r19 != 0) goto L_0x025c
            r28 = r0
            r29 = r1
            r1 = r2
            r4 = r5
            r0 = r18
            r11 = r25
            goto L_0x038c
        L_0x025c:
            int r3 = r19.getVisibility()
            r4 = 8
            if (r3 == r4) goto L_0x0382
            boolean r3 = r6.a(r9)
            if (r3 == 0) goto L_0x0271
            int r3 = r6.e
            int r4 = r6.m
            int r3 = r3 + r4
            r6.e = r3
        L_0x0271:
            android.view.ViewGroup$LayoutParams r3 = r19.getLayoutParams()
            r4 = r3
            ir r4 = (defpackage.ir) r4
            float r3 = r4.g
            float r22 = r22 + r3
            r3 = 1073741824(0x40000000, float:2.0)
            if (r1 != r3) goto L_0x02a6
            int r3 = r4.height
            if (r3 != 0) goto L_0x02a6
            float r3 = r4.g
            r20 = 0
            int r3 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r3 <= 0) goto L_0x02a6
            int r3 = r6.e
            int r10 = r4.topMargin
            int r10 = r10 + r3
            int r14 = r4.bottomMargin
            int r10 = r10 + r14
            int r3 = java.lang.Math.max(r3, r10)
            r6.e = r3
            r28 = r0
            r29 = r1
            r30 = r2
            r3 = r4
            r10 = 0
            r24 = 1
            goto L_0x0307
        L_0x02a6:
            int r3 = r4.height
            if (r3 != 0) goto L_0x02b6
            float r3 = r4.g
            r10 = 0
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x02b7
            r3 = -2
            r4.height = r3
            r14 = 0
            goto L_0x02b9
        L_0x02b6:
            r10 = 0
        L_0x02b7:
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x02b9:
            int r3 = (r22 > r10 ? 1 : (r22 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x02c1
            int r3 = r6.e
            r10 = r3
            goto L_0x02c3
        L_0x02c1:
            r10 = 0
        L_0x02c3:
            r3 = 0
            r28 = r0
            r0 = r39
            r29 = r1
            r1 = r19
            r30 = r2
            r2 = r40
            r31 = r4
            r4 = r41
            r32 = r5
            r5 = r10
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            if (r14 != r11) goto L_0x02e0
            r3 = r31
            r10 = 0
            goto L_0x02e6
        L_0x02e0:
            r3 = r31
            r10 = 0
            r3.height = r10
        L_0x02e6:
            int r0 = r19.getMeasuredHeight()
            int r1 = r6.e
            int r2 = r1 + r0
            int r4 = r3.topMargin
            int r2 = r2 + r4
            int r4 = r3.bottomMargin
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
            r6.e = r1
            if (r15 == 0) goto L_0x0304
            r4 = r32
            int r5 = java.lang.Math.max(r0, r4)
            goto L_0x0307
        L_0x0304:
            r4 = r32
            r5 = r4
        L_0x0307:
            r0 = r28
            if (r0 < 0) goto L_0x0313
            int r1 = r9 + 1
            if (r0 != r1) goto L_0x0313
            int r1 = r6.e
            r6.c = r1
        L_0x0313:
            if (r9 >= r0) goto L_0x0325
            float r1 = r3.g
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x031d
            goto L_0x0325
        L_0x031d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x0325:
            r1 = r30
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 != r2) goto L_0x032d
        L_0x032b:
            r2 = 0
            goto L_0x0335
        L_0x032d:
            int r2 = r3.width
            r4 = -1
            if (r2 != r4) goto L_0x032b
            r2 = 1
            r23 = 1
        L_0x0335:
            int r4 = r3.leftMargin
            int r14 = r3.rightMargin
            int r4 = r4 + r14
            int r14 = r19.getMeasuredWidth()
            int r14 = r14 + r4
            r11 = r25
            int r11 = java.lang.Math.max(r11, r14)
            int r10 = r19.getMeasuredState()
            r28 = r0
            r0 = r18
            int r0 = android.view.View.combineMeasuredStates(r0, r10)
            if (r21 == 0) goto L_0x035d
            int r10 = r3.width
            r18 = r0
            r0 = -1
            if (r10 != r0) goto L_0x035c
            r0 = 1
            goto L_0x0360
        L_0x035c:
            goto L_0x035f
        L_0x035d:
            r18 = r0
        L_0x035f:
            r0 = 0
        L_0x0360:
            float r3 = r3.g
            r10 = 0
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 > 0) goto L_0x0371
            if (r2 != 0) goto L_0x036a
            goto L_0x036b
        L_0x036a:
            r14 = r4
        L_0x036b:
            int r19 = java.lang.Math.max(r8, r14)
            r2 = r12
            goto L_0x037c
        L_0x0371:
            if (r2 != 0) goto L_0x0374
            goto L_0x0375
        L_0x0374:
            r14 = r4
        L_0x0375:
            int r2 = java.lang.Math.max(r12, r14)
            r19 = r8
        L_0x037c:
            r21 = r0
            r25 = r11
            goto L_0x0394
        L_0x0382:
            r28 = r0
            r29 = r1
            r1 = r2
            r4 = r5
            r0 = r18
            r11 = r25
        L_0x038c:
            r18 = r0
            r5 = r4
            r19 = r8
            r25 = r11
            r2 = r12
        L_0x0394:
            int r9 = r9 + 1
            r8 = r41
            r20 = r2
            r3 = r13
            r0 = r28
            r4 = 0
            r10 = 16777215(0xffffff, float:2.3509886E-38)
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 8
            r13 = 0
            r2 = r1
            r1 = r29
            goto L_0x0039
        L_0x03ab:
            r0 = 0
            r6.e = r0
            int r8 = r39.getChildCount()
            int r9 = android.view.View.MeasureSpec.getMode(r40)
            int r10 = android.view.View.MeasureSpec.getMode(r41)
            int[] r0 = r6.k
            r11 = 4
            if (r0 != 0) goto L_0x03c1
            goto L_0x03c5
        L_0x03c1:
            int[] r0 = r6.l
            if (r0 != 0) goto L_0x03ce
        L_0x03c5:
            int[] r0 = new int[r11]
            r6.k = r0
            int[] r0 = new int[r11]
            r6.l = r0
        L_0x03ce:
            int[] r12 = r6.k
            int[] r13 = r6.l
            r14 = 3
            r0 = -1
            r12[r14] = r0
            r15 = 2
            r12[r15] = r0
            r1 = 1
            r12[r1] = r0
            r2 = 0
            r12[r2] = r0
            r13[r14] = r0
            r13[r15] = r0
            r13[r1] = r0
            r13[r2] = r0
            boolean r5 = r6.a
            boolean r4 = r6.j
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r14 = 0
            r15 = 0
            r18 = 1
            r19 = 0
            r21 = 0
            r22 = 0
        L_0x03fa:
            if (r3 >= r8) goto L_0x05b6
            android.view.View r11 = r6.getChildAt(r3)
            if (r11 != 0) goto L_0x0412
            r28 = r3
            r17 = r4
            r30 = r5
            r29 = -2
            r5 = r2
            r38 = r1
            r1 = r0
            r0 = r38
            goto L_0x05a7
        L_0x0412:
            r28 = r0
            int r0 = r11.getVisibility()
            r29 = r1
            r1 = 8
            if (r0 == r1) goto L_0x059a
            boolean r0 = r6.a(r3)
            if (r0 == 0) goto L_0x042b
            int r0 = r6.e
            int r1 = r6.h
            int r0 = r0 + r1
            r6.e = r0
        L_0x042b:
            android.view.ViewGroup$LayoutParams r0 = r11.getLayoutParams()
            r1 = r0
            ir r1 = (defpackage.ir) r1
            float r0 = r1.g
            float r19 = r19 + r0
            r0 = 1073741824(0x40000000, float:2.0)
            if (r9 != r0) goto L_0x0482
            int r0 = r1.width
            if (r0 != 0) goto L_0x047d
            float r0 = r1.g
            r27 = 0
            int r0 = (r0 > r27 ? 1 : (r0 == r27 ? 0 : -1))
            if (r0 <= 0) goto L_0x047d
            int r0 = r6.e
            r30 = r2
            int r2 = r1.leftMargin
            r31 = r3
            int r3 = r1.rightMargin
            int r2 = r2 + r3
            int r0 = r0 + r2
            r6.e = r0
            if (r5 == 0) goto L_0x046a
            r0 = 0
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r11.measure(r2, r2)
            r0 = r1
            r17 = r4
            r37 = r28
            r34 = r29
            r36 = r30
            r28 = r31
            goto L_0x0477
        L_0x046a:
            r0 = r1
            r17 = r4
            r37 = r28
            r34 = r29
            r36 = r30
            r28 = r31
            r22 = 1
        L_0x0477:
            r29 = -2
            r30 = r5
            goto L_0x0505
        L_0x047d:
            r30 = r2
            r31 = r3
            goto L_0x0486
        L_0x0482:
            r30 = r2
            r31 = r3
        L_0x0486:
            int r0 = r1.width
            if (r0 != 0) goto L_0x0496
            float r0 = r1.g
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0497
            r3 = -2
            r1.width = r3
            r0 = 0
            goto L_0x049a
        L_0x0496:
            r2 = 0
        L_0x0497:
            r3 = -2
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x049a:
            int r17 = (r19 > r2 ? 1 : (r19 == r2 ? 0 : -1))
            if (r17 != 0) goto L_0x04a3
            int r2 = r6.e
            r17 = r2
            goto L_0x04a6
        L_0x04a3:
            r17 = 0
        L_0x04a6:
            r32 = 0
            r33 = r0
            r2 = r28
            r0 = r39
            r35 = r1
            r34 = r29
            r1 = r11
            r37 = r2
            r36 = r30
            r2 = r40
            r28 = r31
            r29 = -2
            r3 = r17
            r17 = r4
            r4 = r41
            r30 = r5
            r5 = r32
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r0 = r33
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x04d6
            r0 = r35
            r1 = 0
            r0.width = r1
            goto L_0x04d8
        L_0x04d6:
            r0 = r35
        L_0x04d8:
            int r1 = r11.getMeasuredWidth()
            r2 = 1073741824(0x40000000, float:2.0)
            if (r9 != r2) goto L_0x04ec
            int r2 = r6.e
            int r3 = r0.leftMargin
            int r3 = r3 + r1
            int r4 = r0.rightMargin
            int r3 = r3 + r4
            int r2 = r2 + r3
            r6.e = r2
            goto L_0x04fc
        L_0x04ec:
            int r2 = r6.e
            int r3 = r2 + r1
            int r4 = r0.leftMargin
            int r3 = r3 + r4
            int r4 = r0.rightMargin
            int r3 = r3 + r4
            int r2 = java.lang.Math.max(r2, r3)
            r6.e = r2
        L_0x04fc:
            if (r17 == 0) goto L_0x0504
            int r14 = java.lang.Math.max(r1, r14)
            goto L_0x0505
        L_0x0504:
        L_0x0505:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 != r1) goto L_0x050b
        L_0x0509:
            r1 = 0
            goto L_0x0513
        L_0x050b:
            int r1 = r0.height
            r2 = -1
            if (r1 != r2) goto L_0x0509
            r1 = 1
            r21 = 1
        L_0x0513:
            int r2 = r0.topMargin
            int r3 = r0.bottomMargin
            int r2 = r2 + r3
            int r3 = r11.getMeasuredHeight()
            int r3 = r3 + r2
            int r4 = r11.getMeasuredState()
            r5 = r36
            int r4 = android.view.View.combineMeasuredStates(r5, r4)
            if (r30 == 0) goto L_0x0559
            int r5 = r11.getBaseline()
            r11 = -1
            if (r5 == r11) goto L_0x0556
            int r11 = r0.h
            if (r11 < 0) goto L_0x0535
            goto L_0x0537
        L_0x0535:
            int r11 = r6.f
        L_0x0537:
            r11 = r11 & 112(0x70, float:1.57E-43)
            r25 = 4
            int r11 = r11 >> 4
            r16 = 1
            int r11 = r11 >> 1
            r31 = r2
            r2 = r12[r11]
            int r2 = java.lang.Math.max(r2, r5)
            r12[r11] = r2
            r2 = r13[r11]
            int r5 = r3 - r5
            int r2 = java.lang.Math.max(r2, r5)
            r13[r11] = r2
            goto L_0x055b
        L_0x0556:
            r31 = r2
            goto L_0x055b
        L_0x0559:
            r31 = r2
        L_0x055b:
            int r2 = java.lang.Math.max(r15, r3)
            if (r18 == 0) goto L_0x0569
            int r5 = r0.height
            r11 = -1
            if (r5 != r11) goto L_0x0568
            r5 = 1
            goto L_0x056a
        L_0x0568:
        L_0x0569:
            r5 = 0
        L_0x056a:
            float r0 = r0.g
            r11 = 0
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x0580
            if (r1 != 0) goto L_0x0574
            goto L_0x0576
        L_0x0574:
            r3 = r31
        L_0x0576:
            r0 = r34
            int r1 = java.lang.Math.max(r0, r3)
            r0 = r1
            r1 = r37
            goto L_0x058f
        L_0x0580:
            r0 = r34
            if (r1 != 0) goto L_0x0585
            goto L_0x0587
        L_0x0585:
            r3 = r31
        L_0x0587:
            r1 = r37
            int r1 = java.lang.Math.max(r1, r3)
        L_0x058f:
            r15 = r2
            r2 = r4
            r18 = r5
            r38 = r1
            r1 = r0
            r0 = r38
            goto L_0x05ad
        L_0x059a:
            r17 = r4
            r30 = r5
            r1 = r28
            r0 = r29
            r29 = -2
            r5 = r2
            r28 = r3
        L_0x05a7:
            r2 = r5
            r38 = r1
            r1 = r0
            r0 = r38
        L_0x05ad:
            int r3 = r28 + 1
            r4 = r17
            r5 = r30
            r11 = 4
            goto L_0x03fa
        L_0x05b6:
            r17 = r4
            r30 = r5
            r5 = r2
            r38 = r1
            r1 = r0
            r0 = r38
            int r2 = r6.e
            if (r2 <= 0) goto L_0x05d1
            boolean r2 = r6.a(r8)
            if (r2 == 0) goto L_0x05d1
            int r2 = r6.e
            int r3 = r6.h
            int r2 = r2 + r3
            r6.e = r2
        L_0x05d1:
            r2 = 1
            r3 = r12[r2]
            r2 = -1
            if (r3 != r2) goto L_0x05eb
            r4 = 0
            r11 = r12[r4]
            if (r11 != r2) goto L_0x05eb
            r4 = 2
            r11 = r12[r4]
            if (r11 != r2) goto L_0x05eb
            r4 = 3
            r11 = r12[r4]
            if (r11 == r2) goto L_0x05e8
            goto L_0x05eb
        L_0x05e8:
            r36 = r5
            goto L_0x061f
        L_0x05eb:
            r2 = 3
            r4 = r12[r2]
            r11 = 0
            r2 = r12[r11]
            r24 = 2
            r11 = r12[r24]
            int r3 = java.lang.Math.max(r3, r11)
            int r2 = java.lang.Math.max(r2, r3)
            int r2 = java.lang.Math.max(r4, r2)
            r3 = 3
            r4 = r13[r3]
            r3 = 0
            r11 = r13[r3]
            r36 = r5
            r3 = 1
            r5 = r13[r3]
            r3 = r13[r24]
            int r3 = java.lang.Math.max(r5, r3)
            int r3 = java.lang.Math.max(r11, r3)
            int r3 = java.lang.Math.max(r4, r3)
            int r2 = r2 + r3
            int r15 = java.lang.Math.max(r15, r2)
        L_0x061f:
            if (r17 != 0) goto L_0x0622
            goto L_0x0657
        L_0x0622:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 == r2) goto L_0x0628
            if (r9 != 0) goto L_0x0657
        L_0x0628:
            r2 = 0
            r6.e = r2
            r2 = 0
        L_0x062d:
            if (r2 >= r8) goto L_0x0657
            android.view.View r3 = r6.getChildAt(r2)
            if (r3 != 0) goto L_0x0636
            goto L_0x0654
        L_0x0636:
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 == r5) goto L_0x0654
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            ir r3 = (defpackage.ir) r3
            int r4 = r6.e
            int r5 = r4 + r14
            int r11 = r3.leftMargin
            int r5 = r5 + r11
            int r3 = r3.rightMargin
            int r5 = r5 + r3
            int r3 = java.lang.Math.max(r4, r5)
            r6.e = r3
        L_0x0654:
            int r2 = r2 + 1
            goto L_0x062d
        L_0x0657:
            int r2 = r6.e
            int r3 = r39.getPaddingLeft()
            int r4 = r39.getPaddingRight()
            int r3 = r3 + r4
            int r2 = r2 + r3
            r6.e = r2
            int r3 = r39.getSuggestedMinimumWidth()
            int r2 = java.lang.Math.max(r2, r3)
            r3 = 0
            int r2 = android.view.View.resolveSizeAndState(r2, r7, r3)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r2
            int r4 = r6.e
            int r3 = r3 - r4
            if (r22 == 0) goto L_0x067d
            r5 = 0
            goto L_0x068d
        L_0x067d:
            if (r3 != 0) goto L_0x0687
            r11 = r41
            r24 = r2
            r22 = 0
            goto L_0x0851
        L_0x0687:
            r5 = 0
            int r11 = (r19 > r5 ? 1 : (r19 == r5 ? 0 : -1))
            if (r11 <= 0) goto L_0x084b
        L_0x068d:
            float r1 = r6.i
            int r11 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r11 <= 0) goto L_0x0694
            goto L_0x0696
        L_0x0694:
            r1 = r19
        L_0x0696:
            r5 = 3
            r11 = -1
            r12[r5] = r11
            r14 = 2
            r12[r14] = r11
            r15 = 1
            r12[r15] = r11
            r4 = 0
            r12[r4] = r11
            r13[r5] = r11
            r13[r14] = r11
            r13[r15] = r11
            r13[r4] = r11
            r6.e = r4
            r5 = r0
            r11 = r1
            r4 = r36
            r0 = 0
            r1 = -1
        L_0x06b6:
            if (r0 < r8) goto L_0x0719
            int r0 = r6.e
            int r3 = r39.getPaddingLeft()
            int r9 = r39.getPaddingRight()
            int r3 = r3 + r9
            int r0 = r0 + r3
            r6.e = r0
            r0 = 1
            r3 = r12[r0]
            r0 = -1
            if (r3 != r0) goto L_0x06e0
            r9 = 0
            r11 = r12[r9]
            if (r11 != r0) goto L_0x06e0
            r9 = 2
            r11 = r12[r9]
            if (r11 != r0) goto L_0x06e0
            r9 = 3
            r11 = r12[r9]
            if (r11 == r0) goto L_0x06dc
            goto L_0x06e0
        L_0x06dc:
            r15 = r1
            r22 = 0
            goto L_0x0713
        L_0x06e0:
            r20 = 3
            r0 = r12[r20]
            r22 = 0
            r9 = r12[r22]
            r23 = 2
            r11 = r12[r23]
            int r3 = java.lang.Math.max(r3, r11)
            int r3 = java.lang.Math.max(r9, r3)
            int r0 = java.lang.Math.max(r0, r3)
            r3 = r13[r20]
            r9 = r13[r22]
            r11 = 1
            r11 = r13[r11]
            r12 = r13[r23]
            int r11 = java.lang.Math.max(r11, r12)
            int r9 = java.lang.Math.max(r9, r11)
            int r3 = java.lang.Math.max(r3, r9)
            int r0 = r0 + r3
            int r0 = java.lang.Math.max(r1, r0)
            r15 = r0
        L_0x0713:
            r11 = r41
            r24 = r2
            goto L_0x0893
        L_0x0719:
            r20 = 3
            r22 = 0
            r23 = 2
            android.view.View r14 = r6.getChildAt(r0)
            if (r14 != 0) goto L_0x0730
            r24 = r2
            r2 = r11
            r16 = 1
            r25 = 4
            r11 = r41
            goto L_0x0841
        L_0x0730:
            int r15 = r14.getVisibility()
            r7 = 8
            if (r15 == r7) goto L_0x0838
            android.view.ViewGroup$LayoutParams r7 = r14.getLayoutParams()
            ir r7 = (defpackage.ir) r7
            float r15 = r7.g
            r17 = 0
            int r24 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r24 <= 0) goto L_0x07a0
            r24 = r2
            float r2 = (float) r3
            float r2 = r2 * r15
            float r2 = r2 / r11
            int r2 = (int) r2
            float r11 = r11 - r15
            int r3 = r3 - r2
            int r15 = r39.getPaddingTop()
            int r17 = r39.getPaddingBottom()
            int r15 = r15 + r17
            r17 = r3
            int r3 = r7.topMargin
            int r15 = r15 + r3
            int r3 = r7.bottomMargin
            int r15 = r15 + r3
            int r3 = r7.height
            r26 = r11
            r11 = r41
            int r3 = getChildMeasureSpec(r11, r15, r3)
            int r15 = r7.width
            if (r15 != 0) goto L_0x077f
            r15 = 1073741824(0x40000000, float:2.0)
            if (r9 != r15) goto L_0x077f
            if (r2 <= 0) goto L_0x0776
            goto L_0x0777
        L_0x0776:
            r2 = 0
        L_0x0777:
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r14.measure(r2, r3)
            goto L_0x0792
        L_0x077f:
            int r15 = r14.getMeasuredWidth()
            int r2 = r2 + r15
            if (r2 < 0) goto L_0x0787
            goto L_0x0789
        L_0x0787:
            r2 = 0
        L_0x0789:
            r15 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r14.measure(r2, r3)
        L_0x0792:
            int r2 = r14.getMeasuredState()
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r3
            int r4 = android.view.View.combineMeasuredStates(r4, r2)
            r2 = r26
            goto L_0x07a7
        L_0x07a0:
            r24 = r2
            r2 = r11
            r11 = r41
            r17 = r3
        L_0x07a7:
            r3 = 1073741824(0x40000000, float:2.0)
            if (r9 == r3) goto L_0x07c1
            int r3 = r6.e
            int r15 = r14.getMeasuredWidth()
            int r15 = r15 + r3
            r26 = r2
            int r2 = r7.leftMargin
            int r15 = r15 + r2
            int r2 = r7.rightMargin
            int r15 = r15 + r2
            int r2 = java.lang.Math.max(r3, r15)
            r6.e = r2
            goto L_0x07d2
        L_0x07c1:
            r26 = r2
            int r2 = r6.e
            int r3 = r14.getMeasuredWidth()
            int r15 = r7.leftMargin
            int r3 = r3 + r15
            int r15 = r7.rightMargin
            int r3 = r3 + r15
            int r2 = r2 + r3
            r6.e = r2
        L_0x07d2:
            r2 = 1073741824(0x40000000, float:2.0)
            if (r10 == r2) goto L_0x07de
            int r2 = r7.height
            r3 = -1
            if (r2 != r3) goto L_0x07dd
            r2 = 1
            goto L_0x07df
        L_0x07dd:
        L_0x07de:
            r2 = 0
        L_0x07df:
            int r3 = r7.topMargin
            int r15 = r7.bottomMargin
            int r3 = r3 + r15
            int r15 = r14.getMeasuredHeight()
            int r15 = r15 + r3
            int r1 = java.lang.Math.max(r1, r15)
            if (r2 != 0) goto L_0x07f0
            r3 = r15
        L_0x07f0:
            int r2 = java.lang.Math.max(r5, r3)
            if (r18 == 0) goto L_0x07fe
            int r3 = r7.height
            r5 = -1
            if (r3 != r5) goto L_0x07fd
            r3 = 1
            goto L_0x07ff
        L_0x07fd:
        L_0x07fe:
            r3 = 0
        L_0x07ff:
            if (r30 == 0) goto L_0x082c
            int r5 = r14.getBaseline()
            r14 = -1
            if (r5 == r14) goto L_0x082c
            int r7 = r7.h
            if (r7 < 0) goto L_0x080d
            goto L_0x080f
        L_0x080d:
            int r7 = r6.f
        L_0x080f:
            r7 = r7 & 112(0x70, float:1.57E-43)
            r25 = 4
            int r7 = r7 >> 4
            r16 = 1
            int r7 = r7 >> 1
            r14 = r12[r7]
            int r14 = java.lang.Math.max(r14, r5)
            r12[r7] = r14
            r14 = r13[r7]
            int r15 = r15 - r5
            int r5 = java.lang.Math.max(r14, r15)
            r13[r7] = r5
            goto L_0x0830
        L_0x082c:
            r16 = 1
            r25 = 4
        L_0x0830:
            r5 = r2
            r18 = r3
            r3 = r17
            r2 = r26
            goto L_0x0841
        L_0x0838:
            r24 = r2
            r2 = r11
            r16 = 1
            r25 = 4
            r11 = r41
        L_0x0841:
            int r0 = r0 + 1
            r7 = r40
            r11 = r2
            r2 = r24
            goto L_0x06b6
        L_0x084b:
            r11 = r41
            r24 = r2
            r22 = 0
        L_0x0851:
            int r5 = java.lang.Math.max(r0, r1)
            if (r17 == 0) goto L_0x0891
            r0 = 1073741824(0x40000000, float:2.0)
            if (r9 == r0) goto L_0x0891
            r0 = 0
        L_0x085c:
            if (r0 >= r8) goto L_0x0891
            android.view.View r1 = r6.getChildAt(r0)
            if (r1 != 0) goto L_0x0866
            r3 = 0
            goto L_0x088e
        L_0x0866:
            int r2 = r1.getVisibility()
            r3 = 8
            if (r2 == r3) goto L_0x088d
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            ir r2 = (defpackage.ir) r2
            float r2 = r2.g
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x088e
            r2 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r2)
            int r7 = r1.getMeasuredHeight()
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r2)
            r1.measure(r4, r7)
            goto L_0x088e
        L_0x088d:
            r3 = 0
        L_0x088e:
            int r0 = r0 + 1
            goto L_0x085c
        L_0x0891:
            r4 = r36
        L_0x0893:
            if (r18 == 0) goto L_0x0896
            goto L_0x089b
        L_0x0896:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r10 == r0) goto L_0x089b
            r15 = r5
        L_0x089b:
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r4
            r0 = r24 | r0
            int r1 = r39.getPaddingTop()
            int r2 = r39.getPaddingBottom()
            int r1 = r1 + r2
            int r15 = r15 + r1
            int r1 = r39.getSuggestedMinimumHeight()
            int r1 = java.lang.Math.max(r15, r1)
            int r2 = r4 << 16
            int r1 = android.view.View.resolveSizeAndState(r1, r11, r2)
            r6.setMeasuredDimension(r0, r1)
            if (r21 == 0) goto L_0x08fb
            int r0 = r39.getMeasuredHeight()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r9 = 0
        L_0x08c8:
            if (r9 >= r8) goto L_0x08fb
            android.view.View r1 = r6.getChildAt(r9)
            int r0 = r1.getVisibility()
            r10 = 8
            if (r0 == r10) goto L_0x08f7
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r11 = r0
            ir r11 = (defpackage.ir) r11
            int r0 = r11.height
            r12 = -1
            if (r0 != r12) goto L_0x08f8
            int r13 = r11.width
            int r0 = r1.getMeasuredWidth()
            r11.width = r0
            r3 = 0
            r5 = 0
            r0 = r39
            r2 = r40
            r4 = r7
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r11.width = r13
            goto L_0x08f8
        L_0x08f7:
            r12 = -1
        L_0x08f8:
            int r9 = r9 + 1
            goto L_0x08c8
        L_0x08fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.is.onMeasure(int, int):void");
    }

    public final void d() {
        this.a = false;
    }

    private static void a(View view, int i2, int i3, int i4, int i5) {
        view.layout(i2, i3, i4 + i2, i5 + i3);
    }
}
