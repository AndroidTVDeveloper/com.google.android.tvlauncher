package androidx.leanback.preference.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;

/* compiled from: PG */
public class OutlineOnlyWithChildrenFrameLayout extends FrameLayout {

    /* renamed from: a */
    public ViewOutlineProvider f1169a;

    /* renamed from: b */
    private ViewOutlineProvider f1170b;

    public OutlineOnlyWithChildrenFrameLayout(Context context) {
        super(context);
    }

    public OutlineOnlyWithChildrenFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OutlineOnlyWithChildrenFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public OutlineOnlyWithChildrenFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        invalidateOutline();
    }

    public final void setOutlineProvider(ViewOutlineProvider viewOutlineProvider) {
        this.f1169a = viewOutlineProvider;
        if (this.f1170b == null) {
            this.f1170b = new C0337mk(this);
        }
        super.setOutlineProvider(this.f1170b);
    }
}
