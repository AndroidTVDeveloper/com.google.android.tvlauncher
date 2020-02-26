package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: le  reason: default package */
/* compiled from: PG */
public final class le extends eq {
    public int b = 0;

    public le() {
        this.a = 8388627;
    }

    public le(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public le(eq eqVar) {
        super(eqVar);
    }

    public le(le leVar) {
        super((eq) leVar);
        this.b = leVar.b;
    }

    public le(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public le(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.leftMargin = marginLayoutParams.leftMargin;
        this.topMargin = marginLayoutParams.topMargin;
        this.rightMargin = marginLayoutParams.rightMargin;
        this.bottomMargin = marginLayoutParams.bottomMargin;
    }
}
