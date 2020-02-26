package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;

/* compiled from: PG */
public class VerticalGridView extends C0359nf {
    public VerticalGridView(Context context) {
        this(context, null);
    }

    public VerticalGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VerticalGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9985L.mo5667f(1);
        mo5610a(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0324ly.f9940j);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, C0324ly.f9940j, attributeSet, obtainStyledAttributes, 0, 0);
        }
        if (obtainStyledAttributes.peekValue(0) != null) {
            mo1065m(obtainStyledAttributes.getLayoutDimension(0, 0));
        }
        mo1064l(obtainStyledAttributes.getInt(1, 1));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: m */
    public final void mo1065m(int i) {
        this.f9985L.mo5670h(i);
        requestLayout();
    }

    /* renamed from: l */
    public final void mo1064l(int i) {
        this.f9985L.mo5669g(i);
        requestLayout();
    }
}
