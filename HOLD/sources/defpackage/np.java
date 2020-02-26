package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: np  reason: default package */
/* compiled from: PG */
final class np extends jy {
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int[] k;
    public ny l;

    public np() {
    }

    public np(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public np(jy jyVar) {
        super(jyVar);
    }

    public np(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public np(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public np(np npVar) {
        super((jy) npVar);
    }

    /* access modifiers changed from: package-private */
    public final int a(View view) {
        return (view.getWidth() - this.e) - this.g;
    }
}
