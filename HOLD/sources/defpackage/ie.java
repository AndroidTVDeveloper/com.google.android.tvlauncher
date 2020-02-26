package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.tvlauncher.R;
import java.lang.reflect.Field;

/* renamed from: ie  reason: default package */
/* compiled from: PG */
class ie extends ListView {
    public boolean a;
    public id b;
    private final Rect c = new Rect();
    private int d = 0;
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private int h;
    private Field i;
    private ic j;
    private final boolean k;
    private boolean l;
    private ej m;

    public ie(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.k = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.i = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            dhr.a(e2);
        }
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.c.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.c);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        if (this.b == null) {
            super.drawableStateChanged();
            a(true);
            a();
        }
    }

    public final boolean hasFocus() {
        return this.k || super.hasFocus();
    }

    public final boolean hasWindowFocus() {
        return this.k || super.hasWindowFocus();
    }

    public final boolean isFocused() {
        return this.k || super.isFocused();
    }

    public final boolean isInTouchMode() {
        return (this.k && this.a) || super.isInTouchMode();
    }

    public final int a(int i2, int i3) {
        int i4;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i5 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i6 = i5;
        View view = null;
        int i7 = 0;
        int i8 = 0;
        while (i7 < count) {
            int itemViewType = adapter.getItemViewType(i7);
            int i9 = itemViewType == i8 ? i8 : itemViewType;
            if (itemViewType != i8) {
                view = null;
            }
            view = adapter.getView(i7, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            if (layoutParams.height > 0) {
                i4 = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            } else {
                i4 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i2, i4);
            view.forceLayout();
            if (i7 > 0) {
                i6 += dividerHeight;
            }
            i6 += view.getMeasuredHeight();
            if (i6 >= i3) {
                return i3;
            }
            i7++;
            i8 = i9;
        }
        return i6;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        this.b = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0139 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0162  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.view.MotionEvent r17, int r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            int r3 = r17.getActionMasked()
            r4 = 1
            r5 = 0
            if (r3 == r4) goto L_0x001c
            r0 = 2
            if (r3 == r0) goto L_0x0018
            r0 = 3
            if (r3 == r0) goto L_0x0015
            r0 = 1
            goto L_0x0137
        L_0x0015:
            r0 = 0
            goto L_0x0137
        L_0x0018:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            int r6 = r17.findPointerIndex(r18)
            if (r6 < 0) goto L_0x0135
            float r7 = r2.getX(r6)
            int r7 = (int) r7
            float r6 = r2.getY(r6)
            int r6 = (int) r6
            int r8 = r1.pointToPosition(r7, r6)
            r9 = -1
            if (r8 == r9) goto L_0x0133
            int r0 = r16.getFirstVisiblePosition()
            int r0 = r8 - r0
            android.view.View r10 = r1.getChildAt(r0)
            float r7 = (float) r7
            float r6 = (float) r6
            r1.l = r4
            int r0 = android.os.Build.VERSION.SDK_INT
            r1.drawableHotspotChanged(r7, r6)
            boolean r0 = r16.isPressed()
            if (r0 != 0) goto L_0x0050
            r1.setPressed(r4)
        L_0x0050:
            r16.layoutChildren()
            int r0 = r1.h
            if (r0 == r9) goto L_0x006f
            int r11 = r16.getFirstVisiblePosition()
            int r0 = r0 - r11
            android.view.View r0 = r1.getChildAt(r0)
            if (r0 == 0) goto L_0x006f
            if (r0 == r10) goto L_0x006f
            boolean r11 = r0.isPressed()
            if (r11 != 0) goto L_0x006b
            goto L_0x006f
        L_0x006b:
            r0.setPressed(r5)
        L_0x006f:
            r1.h = r8
            int r0 = r10.getLeft()
            int r11 = r10.getTop()
            int r12 = android.os.Build.VERSION.SDK_INT
            float r0 = (float) r0
            float r0 = r7 - r0
            float r11 = (float) r11
            float r11 = r6 - r11
            r10.drawableHotspotChanged(r0, r11)
            boolean r0 = r10.isPressed()
            if (r0 != 0) goto L_0x008d
            r10.setPressed(r4)
        L_0x008d:
            android.graphics.drawable.Drawable r11 = r16.getSelector()
            if (r11 != 0) goto L_0x0095
            r12 = 0
            goto L_0x009b
        L_0x0095:
            if (r8 != r9) goto L_0x009a
            r12 = 0
            goto L_0x009b
        L_0x009a:
            r12 = 1
        L_0x009b:
            if (r12 != 0) goto L_0x009e
            goto L_0x00a2
        L_0x009e:
            r11.setVisible(r5, r5)
        L_0x00a2:
            android.graphics.Rect r0 = r1.c
            int r13 = r10.getLeft()
            int r14 = r10.getTop()
            int r15 = r10.getRight()
            int r5 = r10.getBottom()
            r0.set(r13, r14, r15, r5)
            int r5 = r0.left
            int r13 = r1.d
            int r5 = r5 - r13
            r0.left = r5
            int r5 = r0.top
            int r13 = r1.e
            int r5 = r5 - r13
            r0.top = r5
            int r5 = r0.right
            int r13 = r1.f
            int r5 = r5 + r13
            r0.right = r5
            int r5 = r0.bottom
            int r13 = r1.g
            int r5 = r5 + r13
            r0.bottom = r5
            java.lang.reflect.Field r0 = r1.i     // Catch:{ IllegalAccessException -> 0x00ef }
            boolean r0 = r0.getBoolean(r1)     // Catch:{ IllegalAccessException -> 0x00ef }
            boolean r5 = r10.isEnabled()     // Catch:{ IllegalAccessException -> 0x00ef }
            if (r5 == r0) goto L_0x00f3
            java.lang.reflect.Field r5 = r1.i     // Catch:{ IllegalAccessException -> 0x00ef }
            r0 = r0 ^ r4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x00ef }
            r5.set(r1, r0)     // Catch:{ IllegalAccessException -> 0x00ef }
            if (r8 == r9) goto L_0x00f3
            r16.refreshDrawableState()     // Catch:{ IllegalAccessException -> 0x00ef }
            goto L_0x00f3
        L_0x00ef:
            r0 = move-exception
            defpackage.dhr.a(r0)
        L_0x00f3:
            if (r12 == 0) goto L_0x0110
            android.graphics.Rect r0 = r1.c
            float r5 = r0.exactCenterX()
            float r0 = r0.exactCenterY()
            int r12 = r16.getVisibility()
            if (r12 != 0) goto L_0x0107
            r12 = 1
            goto L_0x0109
        L_0x0107:
            r12 = 0
        L_0x0109:
            r13 = 0
            r11.setVisible(r12, r13)
            defpackage.bq.a(r11, r5, r0)
        L_0x0110:
            android.graphics.drawable.Drawable r0 = r16.getSelector()
            if (r0 == 0) goto L_0x011b
            if (r8 == r9) goto L_0x011b
            defpackage.bq.a(r0, r7, r6)
        L_0x011b:
            r5 = 0
            r1.a(r5)
            r16.refreshDrawableState()
            if (r3 != r4) goto L_0x0130
            long r5 = r1.getItemIdAtPosition(r8)
            r1.performItemClick(r10, r8, r5)
            r0 = 1
            r5 = 0
            goto L_0x0137
        L_0x0130:
            r0 = 1
            goto L_0x0136
        L_0x0133:
            r5 = 1
            goto L_0x0137
        L_0x0135:
            r0 = 0
        L_0x0136:
            r5 = 0
        L_0x0137:
            if (r0 == 0) goto L_0x013e
            if (r5 == 0) goto L_0x013c
            goto L_0x013e
        L_0x013c:
            r3 = 0
            goto L_0x0158
        L_0x013e:
            r3 = 0
            r1.l = r3
            r1.setPressed(r3)
            r16.drawableStateChanged()
            int r5 = r1.h
            int r6 = r16.getFirstVisiblePosition()
            int r5 = r5 - r6
            android.view.View r5 = r1.getChildAt(r5)
            if (r5 == 0) goto L_0x0158
            r5.setPressed(r3)
        L_0x0158:
            if (r0 != 0) goto L_0x0162
            ej r2 = r1.m
            if (r2 == 0) goto L_0x0178
            r2.a(r3)
            goto L_0x0178
        L_0x0162:
            ej r3 = r1.m
            if (r3 == 0) goto L_0x0167
            goto L_0x016e
        L_0x0167:
            ej r3 = new ej
            r3.<init>(r1)
            r1.m = r3
        L_0x016e:
            ej r3 = r1.m
            r3.a(r4)
            ej r3 = r1.m
            r3.onTouch(r1, r2)
        L_0x0178:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ie.a(android.view.MotionEvent, int):boolean");
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i2 = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.b == null) {
            id idVar = new id(this);
            this.b = idVar;
            idVar.a.post(idVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                a();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.h = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        id idVar = this.b;
        if (idVar != null) {
            ie ieVar = idVar.a;
            ieVar.b = null;
            ieVar.removeCallbacks(idVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setSelector(Drawable drawable) {
        ic icVar;
        if (drawable != null) {
            icVar = new ic(drawable);
        } else {
            icVar = null;
        }
        this.j = icVar;
        super.setSelector(icVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.d = rect.left;
        this.e = rect.top;
        this.f = rect.right;
        this.g = rect.bottom;
    }

    private final void a(boolean z) {
        ic icVar = this.j;
        if (icVar != null) {
            icVar.b = z;
        }
    }

    private final void a() {
        Drawable selector = getSelector();
        if (selector != null && this.l && isPressed()) {
            selector.setState(getDrawableState());
        }
    }
}
