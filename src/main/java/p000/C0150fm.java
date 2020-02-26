package p000;

import android.support.p002v7.view.menu.ListMenuItemView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import java.util.ArrayList;

/* renamed from: fm */
/* compiled from: PG */
public final class C0150fm extends BaseAdapter {

    /* renamed from: a */
    public final C0152fo f9296a;

    /* renamed from: b */
    public boolean f9297b;

    /* renamed from: c */
    private int f9298c = -1;

    /* renamed from: d */
    private final boolean f9299d;

    /* renamed from: e */
    private final LayoutInflater f9300e;

    /* renamed from: f */
    private final int f9301f;

    public C0150fm(C0152fo foVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f9299d = z;
        this.f9300e = layoutInflater;
        this.f9296a = foVar;
        this.f9301f = i;
        m7309a();
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    /* renamed from: a */
    private final void m7309a() {
        C0152fo foVar = this.f9296a;
        C0153fp fpVar = foVar.f9309g;
        if (fpVar != null) {
            ArrayList h = foVar.mo4891h();
            int size = h.size();
            int i = 0;
            while (i < size) {
                if (((C0153fp) h.get(i)) != fpVar) {
                    i++;
                } else {
                    this.f9298c = i;
                    return;
                }
            }
        }
        this.f9298c = -1;
    }

    public final int getCount() {
        ArrayList h = this.f9299d ? this.f9296a.mo4891h() : this.f9296a.mo4887f();
        if (this.f9298c < 0) {
            return h.size();
        }
        return h.size() - 1;
    }

    /* renamed from: a */
    public final C0153fp getItem(int i) {
        ArrayList f = !this.f9299d ? this.f9296a.mo4887f() : this.f9296a.mo4891h();
        int i2 = this.f9298c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0153fp) f.get(i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f9300e.inflate(this.f9301f, viewGroup, false);
        }
        int i2 = getItem(i).f9326b;
        int i3 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        boolean z = this.f9296a.mo4864a() && i2 != (i3 >= 0 ? getItem(i3).f9326b : i2);
        ImageView imageView = listMenuItemView.f963b;
        if (imageView != null) {
            int i4 = 8;
            if (!listMenuItemView.f965d && z) {
                i4 = 0;
            }
            imageView.setVisibility(i4);
        }
        C0160fw fwVar = (C0160fw) view;
        if (this.f9297b) {
            listMenuItemView.f966e = true;
            listMenuItemView.f964c = true;
        }
        fwVar.mo748a(getItem(i));
        return view;
    }

    public final void notifyDataSetChanged() {
        m7309a();
        super.notifyDataSetChanged();
    }
}
