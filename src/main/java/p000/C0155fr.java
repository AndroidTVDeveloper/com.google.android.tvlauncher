package p000;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: fr */
/* compiled from: PG */
abstract class C0155fr implements AdapterView.OnItemClickListener, C0162fy, C0159fv {

    /* renamed from: g */
    public Rect f9351g;

    /* renamed from: a */
    public abstract void mo4840a(int i);

    /* renamed from: a */
    public final void mo4827a(Context context, C0152fo foVar) {
    }

    /* renamed from: a */
    public abstract void mo4841a(View view);

    /* renamed from: a */
    public abstract void mo4842a(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: a */
    public abstract void mo4843a(C0152fo foVar);

    /* renamed from: a */
    public abstract void mo4844a(boolean z);

    /* renamed from: a */
    public final boolean mo4831a(C0153fp fpVar) {
        return false;
    }

    /* renamed from: b */
    public abstract void mo4845b(int i);

    /* renamed from: b */
    public abstract void mo4846b(boolean z);

    /* renamed from: b */
    public final boolean mo4834b(C0153fp fpVar) {
        return false;
    }

    /* renamed from: c */
    public abstract void mo4848c(int i);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo4852g() {
        return true;
    }

    /* renamed from: a */
    protected static int m7357a(ListAdapter listAdapter, Context context, int i) {
        int i2 = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i3 = 0;
        int i4 = 0;
        while (i2 < count) {
            int itemViewType = listAdapter.getItemViewType(i2);
            int i5 = itemViewType == i4 ? i4 : itemViewType;
            if (itemViewType != i4) {
                view = null;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i2, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i3) {
                i3 = measuredWidth;
            }
            i2++;
            i4 = i5;
        }
        return i3;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        C0152fo foVar = m7358a(listAdapter).f9296a;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        if (!mo4852g()) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        foVar.mo4866a(menuItem, this, i2);
    }

    /* renamed from: b */
    protected static boolean m7359b(C0152fo foVar) {
        int size = foVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = foVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    protected static C0150fm m7358a(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (C0150fm) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (C0150fm) listAdapter;
    }
}
