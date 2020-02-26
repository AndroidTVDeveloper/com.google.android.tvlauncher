package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: ir */
/* compiled from: PG */
public class C0236ir extends ViewGroup.MarginLayoutParams {

    /* renamed from: g */
    public float f9628g;

    /* renamed from: h */
    public int f9629h;

    public C0236ir(int i) {
        super(i, -2);
        this.f9629h = -1;
        this.f9628g = 0.0f;
    }

    public C0236ir(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9629h = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0128er.f9172j);
        this.f9628g = obtainStyledAttributes.getFloat(3, 0.0f);
        this.f9629h = obtainStyledAttributes.getInt(0, -1);
        obtainStyledAttributes.recycle();
    }

    public C0236ir(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f9629h = -1;
    }
}
