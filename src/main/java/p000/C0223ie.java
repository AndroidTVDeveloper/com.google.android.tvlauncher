package p000;

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

/* renamed from: ie */
/* compiled from: PG */
class C0223ie extends ListView {

    /* renamed from: a */
    public boolean f9553a;

    /* renamed from: b */
    public C0222id f9554b;

    /* renamed from: c */
    private final Rect f9555c = new Rect();

    /* renamed from: d */
    private int f9556d = 0;

    /* renamed from: e */
    private int f9557e = 0;

    /* renamed from: f */
    private int f9558f = 0;

    /* renamed from: g */
    private int f9559g = 0;

    /* renamed from: h */
    private int f9560h;

    /* renamed from: i */
    private Field f9561i;

    /* renamed from: j */
    private C0221ic f9562j;

    /* renamed from: k */
    private final boolean f9563k;

    /* renamed from: l */
    private boolean f9564l;

    /* renamed from: m */
    private C0120ej f9565m;

    public C0223ie(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f9563k = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f9561i = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            dhr.m6454a(e);
        }
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.f9555c.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f9555c);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        if (this.f9554b == null) {
            super.drawableStateChanged();
            m7563a(true);
            m7562a();
        }
    }

    public final boolean hasFocus() {
        return this.f9563k || super.hasFocus();
    }

    public final boolean hasWindowFocus() {
        return this.f9563k || super.hasWindowFocus();
    }

    public final boolean isFocused() {
        return this.f9563k || super.isFocused();
    }

    public final boolean isInTouchMode() {
        return (this.f9563k && this.f9553a) || super.isInTouchMode();
    }

    /* renamed from: a */
    public final int mo5232a(int i, int i2) {
        int i3;
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
        int i4 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i5 = i4;
        View view = null;
        int i6 = 0;
        int i7 = 0;
        while (i6 < count) {
            int itemViewType = adapter.getItemViewType(i6);
            int i8 = itemViewType == i7 ? i7 : itemViewType;
            if (itemViewType != i7) {
                view = null;
            }
            view = adapter.getView(i6, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            if (layoutParams.height > 0) {
                i3 = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            } else {
                i3 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, i3);
            view.forceLayout();
            if (i6 > 0) {
                i5 += dividerHeight;
            }
            i5 += view.getMeasuredHeight();
            if (i5 >= i2) {
                return i2;
            }
            i6++;
            i7 = i8;
        }
        return i5;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        this.f9554b = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0139 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0162  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5233a(android.view.MotionEvent r17, int r18) {
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
            r1.f9564l = r4
            int r0 = android.os.Build.VERSION.SDK_INT
            r1.drawableHotspotChanged(r7, r6)
            boolean r0 = r16.isPressed()
            if (r0 != 0) goto L_0x0050
            r1.setPressed(r4)
        L_0x0050:
            r16.layoutChildren()
            int r0 = r1.f9560h
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
            r1.f9560h = r8
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
            android.graphics.Rect r0 = r1.f9555c
            int r13 = r10.getLeft()
            int r14 = r10.getTop()
            int r15 = r10.getRight()
            int r5 = r10.getBottom()
            r0.set(r13, r14, r15, r5)
            int r5 = r0.left
            int r13 = r1.f9556d
            int r5 = r5 - r13
            r0.left = r5
            int r5 = r0.top
            int r13 = r1.f9557e
            int r5 = r5 - r13
            r0.top = r5
            int r5 = r0.right
            int r13 = r1.f9558f
            int r5 = r5 + r13
            r0.right = r5
            int r5 = r0.bottom
            int r13 = r1.f9559g
            int r5 = r5 + r13
            r0.bottom = r5
            java.lang.reflect.Field r0 = r1.f9561i     // Catch:{ IllegalAccessException -> 0x00ef }
            boolean r0 = r0.getBoolean(r1)     // Catch:{ IllegalAccessException -> 0x00ef }
            boolean r5 = r10.isEnabled()     // Catch:{ IllegalAccessException -> 0x00ef }
            if (r5 == r0) goto L_0x00f3
            java.lang.reflect.Field r5 = r1.f9561i     // Catch:{ IllegalAccessException -> 0x00ef }
            r0 = r0 ^ r4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x00ef }
            r5.set(r1, r0)     // Catch:{ IllegalAccessException -> 0x00ef }
            if (r8 == r9) goto L_0x00f3
            r16.refreshDrawableState()     // Catch:{ IllegalAccessException -> 0x00ef }
            goto L_0x00f3
        L_0x00ef:
            r0 = move-exception
            p000.dhr.m6454a(r0)
        L_0x00f3:
            if (r12 == 0) goto L_0x0110
            android.graphics.Rect r0 = r1.f9555c
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
            p000.C0045bq.m3942a(r11, r5, r0)
        L_0x0110:
            android.graphics.drawable.Drawable r0 = r16.getSelector()
            if (r0 == 0) goto L_0x011b
            if (r8 == r9) goto L_0x011b
            p000.C0045bq.m3942a(r0, r7, r6)
        L_0x011b:
            r5 = 0
            r1.m7563a(r5)
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
            r1.f9564l = r3
            r1.setPressed(r3)
            r16.drawableStateChanged()
            int r5 = r1.f9560h
            int r6 = r16.getFirstVisiblePosition()
            int r5 = r5 - r6
            android.view.View r5 = r1.getChildAt(r5)
            if (r5 == 0) goto L_0x0158
            r5.setPressed(r3)
        L_0x0158:
            if (r0 != 0) goto L_0x0162
            ej r2 = r1.f9565m
            if (r2 == 0) goto L_0x0178
            r2.mo4710a(r3)
            goto L_0x0178
        L_0x0162:
            ej r3 = r1.f9565m
            if (r3 == 0) goto L_0x0167
            goto L_0x016e
        L_0x0167:
            ej r3 = new ej
            r3.<init>(r1)
            r1.f9565m = r3
        L_0x016e:
            ej r3 = r1.f9565m
            r3.mo4710a(r4)
            ej r3 = r1.f9565m
            r3.onTouch(r1, r2)
        L_0x0178:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0223ie.mo5233a(android.view.MotionEvent, int):boolean");
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f9554b == null) {
            C0222id idVar = new C0222id(this);
            this.f9554b = idVar;
            idVar.f9552a.post(idVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m7562a();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f9560h = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C0222id idVar = this.f9554b;
        if (idVar != null) {
            C0223ie ieVar = idVar.f9552a;
            ieVar.f9554b = null;
            ieVar.removeCallbacks(idVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setSelector(Drawable drawable) {
        C0221ic icVar;
        if (drawable != null) {
            icVar = new C0221ic(drawable);
        } else {
            icVar = null;
        }
        this.f9562j = icVar;
        super.setSelector(icVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f9556d = rect.left;
        this.f9557e = rect.top;
        this.f9558f = rect.right;
        this.f9559g = rect.bottom;
    }

    /* renamed from: a */
    private final void m7563a(boolean z) {
        C0221ic icVar = this.f9562j;
        if (icVar != null) {
            icVar.f9551b = z;
        }
    }

    /* renamed from: a */
    private final void m7562a() {
        Drawable selector = getSelector();
        if (selector != null && this.f9564l && isPressed()) {
            selector.setState(getDrawableState());
        }
    }
}
