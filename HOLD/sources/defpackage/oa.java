package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: oa  reason: default package */
/* compiled from: PG */
public class oa extends LinearLayout {
    private boolean a;

    public oa(Context context) {
        this(context, null);
    }

    public final boolean hasOverlappingRendering() {
        return false;
    }

    public oa(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public oa(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new Rect();
        if (context.getApplicationInfo().targetSdkVersion < 23) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843017});
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            if (drawable != null) {
                int i2 = Build.VERSION.SDK_INT;
                int i3 = Build.VERSION.SDK_INT;
                setForeground(drawable);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        int i4 = Build.VERSION.SDK_INT;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.a = z | this.a;
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == null;
    }
}
