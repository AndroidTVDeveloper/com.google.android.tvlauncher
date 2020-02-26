package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.widget.TextView;

/* compiled from: PG */
class ResizingTextView extends TextView {
    private int a;
    private int b;
    private boolean c;
    private int d;
    private int e;
    private boolean f;
    private int g;
    private float h;
    private int i;
    private int j;

    public ResizingTextView(Context context) {
        this(context, null);
    }

    public ResizingTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public ResizingTextView(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public ResizingTextView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2);
        this.f = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ly.g, i2, i3);
        try {
            this.a = obtainStyledAttributes.getInt(1, 1);
            this.b = obtainStyledAttributes.getDimensionPixelSize(4, -1);
            this.c = obtainStyledAttributes.getBoolean(0, false);
            this.d = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
            this.e = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            boolean r0 = r5.f
            r1 = 1
            if (r0 != 0) goto L_0x0020
            float r0 = r5.getTextSize()
            int r0 = (int) r0
            r5.g = r0
            float r0 = r5.getLineSpacingExtra()
            r5.h = r0
            int r0 = r5.getPaddingTop()
            r5.i = r0
            int r0 = r5.getPaddingBottom()
            r5.j = r0
            r5.f = r1
        L_0x0020:
            int r0 = r5.g
            float r0 = (float) r0
            r2 = 0
            r5.setTextSize(r2, r0)
            float r0 = r5.h
            float r3 = r5.getLineSpacingMultiplier()
            r5.setLineSpacing(r0, r3)
            int r0 = r5.i
            int r3 = r5.j
            r5.a(r0, r3)
            super.onMeasure(r6, r7)
            android.text.Layout r0 = r5.getLayout()
            if (r0 == 0) goto L_0x0055
            int r3 = r5.a
            r3 = r3 & r1
            if (r3 <= 0) goto L_0x0055
            int r0 = r0.getLineCount()
            int r3 = r5.getMaxLines()
            if (r3 > r1) goto L_0x0050
            goto L_0x0055
        L_0x0050:
            if (r0 == r3) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r0 = 1
            goto L_0x0056
        L_0x0055:
            r0 = 0
        L_0x0056:
            float r3 = r5.getTextSize()
            int r3 = (int) r3
            r4 = -1
            if (r0 == 0) goto L_0x00a9
            int r0 = r5.b
            if (r0 != r4) goto L_0x0063
        L_0x0062:
            goto L_0x006d
        L_0x0063:
            if (r3 == r0) goto L_0x006c
            float r0 = (float) r0
            r5.setTextSize(r2, r0)
            r2 = 1
            goto L_0x006d
        L_0x006c:
            goto L_0x0062
        L_0x006d:
            float r0 = r5.h
            int r3 = r5.g
            float r3 = (float) r3
            float r0 = r0 + r3
            int r3 = r5.b
            float r3 = (float) r3
            float r0 = r0 - r3
            boolean r3 = r5.c
            if (r3 != 0) goto L_0x007c
            goto L_0x008d
        L_0x007c:
            float r3 = r5.getLineSpacingExtra()
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 == 0) goto L_0x008d
            float r2 = r5.getLineSpacingMultiplier()
            r5.setLineSpacing(r0, r2)
            goto L_0x008e
        L_0x008d:
            r1 = r2
        L_0x008e:
            int r0 = r5.i
            int r2 = r5.d
            int r0 = r0 + r2
            int r2 = r5.j
            int r3 = r5.e
            int r2 = r2 + r3
            int r3 = r5.getPaddingTop()
            if (r3 != r0) goto L_0x00a5
            int r3 = r5.getPaddingBottom()
            if (r3 != r2) goto L_0x00a5
            goto L_0x00ea
        L_0x00a5:
            r5.a(r0, r2)
            goto L_0x00ec
        L_0x00a9:
            int r0 = r5.b
            if (r0 == r4) goto L_0x00b8
            int r0 = r5.g
            if (r3 == r0) goto L_0x00b7
            float r0 = (float) r0
            r5.setTextSize(r2, r0)
            r2 = 1
            goto L_0x00b9
        L_0x00b7:
        L_0x00b8:
        L_0x00b9:
            boolean r0 = r5.c
            if (r0 == 0) goto L_0x00d0
            float r0 = r5.getLineSpacingExtra()
            float r3 = r5.h
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00c8
            goto L_0x00d0
        L_0x00c8:
            float r0 = r5.getLineSpacingMultiplier()
            r5.setLineSpacing(r3, r0)
            goto L_0x00d1
        L_0x00d0:
            r1 = r2
        L_0x00d1:
            int r0 = r5.getPaddingTop()
            int r2 = r5.i
            if (r0 == r2) goto L_0x00da
            goto L_0x00e2
        L_0x00da:
            int r0 = r5.getPaddingBottom()
            int r2 = r5.j
            if (r0 == r2) goto L_0x00ea
        L_0x00e2:
            int r0 = r5.i
            int r1 = r5.j
            r5.a(r0, r1)
            goto L_0x00ec
        L_0x00ea:
            if (r1 == 0) goto L_0x00ef
        L_0x00ec:
            super.onMeasure(r6, r7)
        L_0x00ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.ResizingTextView.onMeasure(int, int):void");
    }

    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(hc.a(this, callback));
    }

    private final void a(int i2, int i3) {
        if (isPaddingRelative()) {
            setPaddingRelative(getPaddingStart(), i2, getPaddingEnd(), i3);
        } else {
            setPadding(getPaddingLeft(), i2, getPaddingRight(), i3);
        }
    }
}
