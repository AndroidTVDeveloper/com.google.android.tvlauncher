package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewSwitcher;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.view.SearchView;

/* renamed from: ddr */
/* compiled from: PG */
public final class ddr implements ViewSwitcher.ViewFactory {

    /* renamed from: a */
    private final LayoutInflater f8342a = ((LayoutInflater) this.f8343b.getSystemService("layout_inflater"));

    /* renamed from: b */
    private final /* synthetic */ Context f8343b;

    /* renamed from: c */
    private final /* synthetic */ SearchView f8344c;

    public ddr(SearchView searchView, Context context) {
        this.f8344c = searchView;
        this.f8343b = context;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.tvlauncher.view.SearchView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View makeView() {
        return this.f8342a.inflate((int) R.layout.search_orb_text_hint, (ViewGroup) this.f8344c, false);
    }
}
