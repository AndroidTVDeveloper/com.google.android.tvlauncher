package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: fr  reason: default package */
/* compiled from: PG */
abstract class fr implements AdapterView.OnItemClickListener, fy, fv {
    public Rect g;

    public abstract void a(int i);

    public final void a(Context context, fo foVar) {
    }

    public abstract void a(View view);

    public abstract void a(PopupWindow.OnDismissListener onDismissListener);

    public abstract void a(fo foVar);

    public abstract void a(boolean z);

    public final boolean a(fp fpVar) {
        return false;
    }

    public abstract void b(int i);

    public abstract void b(boolean z);

    public final boolean b(fp fpVar) {
        return false;
    }

    public abstract void c(int i);

    /* access modifiers changed from: protected */
    public boolean g() {
        return true;
    }

    protected static int a(ListAdapter listAdapter, Context context, int i) {
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
        fo foVar = a(listAdapter).a;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        if (!g()) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        foVar.a(menuItem, this, i2);
    }

    protected static boolean b(fo foVar) {
        int size = foVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = foVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    protected static fm a(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (fm) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (fm) listAdapter;
    }
}
