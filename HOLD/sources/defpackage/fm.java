package defpackage;

import android.support.v7.view.menu.ListMenuItemView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import java.util.ArrayList;

/* renamed from: fm  reason: default package */
/* compiled from: PG */
public final class fm extends BaseAdapter {
    public final fo a;
    public boolean b;
    private int c = -1;
    private final boolean d;
    private final LayoutInflater e;
    private final int f;

    public fm(fo foVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = foVar;
        this.f = i;
        a();
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    private final void a() {
        fo foVar = this.a;
        fp fpVar = foVar.g;
        if (fpVar != null) {
            ArrayList h = foVar.h();
            int size = h.size();
            int i = 0;
            while (i < size) {
                if (((fp) h.get(i)) != fpVar) {
                    i++;
                } else {
                    this.c = i;
                    return;
                }
            }
        }
        this.c = -1;
    }

    public final int getCount() {
        ArrayList h = this.d ? this.a.h() : this.a.f();
        if (this.c < 0) {
            return h.size();
        }
        return h.size() - 1;
    }

    /* renamed from: a */
    public final fp getItem(int i) {
        ArrayList f2 = !this.d ? this.a.f() : this.a.h();
        int i2 = this.c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (fp) f2.get(i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        boolean z = this.a.a() && i2 != (i3 >= 0 ? getItem(i3).b : i2);
        ImageView imageView = listMenuItemView.b;
        if (imageView != null) {
            int i4 = 8;
            if (!listMenuItemView.d && z) {
                i4 = 0;
            }
            imageView.setVisibility(i4);
        }
        fw fwVar = (fw) view;
        if (this.b) {
            listMenuItemView.e = true;
            listMenuItemView.c = true;
        }
        fwVar.a(getItem(i));
        return view;
    }

    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
