package android.support.v7.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* compiled from: PG */
public final class ExpandedMenuView extends ListView implements AdapterView.OnItemClickListener, fn, fx {
    private static final int[] a = {16842964, 16843049};

    public final boolean a(fp fpVar) {
        throw null;
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        kz a2 = kz.a(context, attributeSet, a, i);
        if (a2.e(0)) {
            setBackgroundDrawable(a2.a(0));
        }
        if (a2.e(1)) {
            setDivider(a2.a(1));
        }
        a2.a();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        fp fpVar = (fp) getAdapter().getItem(i);
        throw null;
    }
}
