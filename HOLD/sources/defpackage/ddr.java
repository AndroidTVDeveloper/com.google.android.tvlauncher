package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewSwitcher;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.view.SearchView;

/* renamed from: ddr  reason: default package */
/* compiled from: PG */
public final class ddr implements ViewSwitcher.ViewFactory {
    private final LayoutInflater a = ((LayoutInflater) this.b.getSystemService("layout_inflater"));
    private final /* synthetic */ Context b;
    private final /* synthetic */ SearchView c;

    public ddr(SearchView searchView, Context context) {
        this.c = searchView;
        this.b = context;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.tvlauncher.view.SearchView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View makeView() {
        return this.a.inflate((int) R.layout.search_orb_text_hint, (ViewGroup) this.c, false);
    }
}
