package p000;

import com.google.android.tvlauncher.view.SearchView;
import java.util.Random;

/* renamed from: dds */
/* compiled from: PG */
public final class dds implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ SearchView f8345a;

    public dds(SearchView searchView) {
        this.f8345a = searchView;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.tvlauncher.view.SearchView.a(boolean, int):void
     arg types: [int, int]
     candidates:
      com.google.android.tvlauncher.view.SearchView.a(android.content.Context, android.content.Intent):boolean
      com.google.android.tvlauncher.view.SearchView.a(boolean, int):void */
    public final void run() {
        SearchView searchView = this.f8345a;
        int i = searchView.f6757n;
        searchView.f6757n = new Random().nextInt(this.f8345a.f6753j.length);
        SearchView searchView2 = this.f8345a;
        int i2 = searchView2.f6757n;
        if (i == i2) {
            searchView2.f6757n = (i2 + 1) % searchView2.f6753j.length;
        }
        searchView2.mo3494a(false, 0);
        SearchView searchView3 = this.f8345a;
        searchView3.f6750g.setText(searchView3.mo3490a(searchView3.f6753j[searchView3.f6757n]));
        SearchView searchView4 = this.f8345a;
        searchView4.f6758o.postDelayed(this, (long) searchView4.f6752i);
    }
}
