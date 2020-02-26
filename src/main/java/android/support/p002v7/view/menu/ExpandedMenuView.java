package android.support.p002v7.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* renamed from: android.support.v7.view.menu.ExpandedMenuView */
/* compiled from: PG */
public final class ExpandedMenuView extends ListView implements AdapterView.OnItemClickListener, C0151fn, C0161fx {

    /* renamed from: a */
    private static final int[] f961a = {16842964, 16843049};

    /* renamed from: a */
    public final boolean mo759a(C0153fp fpVar) {
        throw null;
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0298kz a = C0298kz.m7865a(context, attributeSet, f961a, i);
        if (a.mo5522e(0)) {
            setBackgroundDrawable(a.mo5512a(0));
        }
        if (a.mo5522e(1)) {
            setDivider(a.mo5512a(1));
        }
        a.mo5513a();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C0153fp fpVar = (C0153fp) getAdapter().getItem(i);
        throw null;
    }
}
