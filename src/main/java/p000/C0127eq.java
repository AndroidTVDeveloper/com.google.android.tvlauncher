package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: eq */
/* compiled from: PG */
public class C0127eq extends ViewGroup.MarginLayoutParams {

    /* renamed from: a */
    public int f9162a = 8388627;

    public C0127eq() {
        super(-2, -2);
    }

    public C0127eq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0128er.f9164b);
        this.f9162a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public C0127eq(C0127eq eqVar) {
        super((ViewGroup.MarginLayoutParams) eqVar);
        this.f9162a = eqVar.f9162a;
    }

    public C0127eq(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
