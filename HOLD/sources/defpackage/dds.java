package defpackage;

import com.google.android.tvlauncher.view.SearchView;
import java.util.Random;

/* renamed from: dds  reason: default package */
/* compiled from: PG */
public final class dds implements Runnable {
    private final /* synthetic */ SearchView a;

    public dds(SearchView searchView) {
        this.a = searchView;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.tvlauncher.view.SearchView.a(boolean, int):void
     arg types: [int, int]
     candidates:
      com.google.android.tvlauncher.view.SearchView.a(android.content.Context, android.content.Intent):boolean
      com.google.android.tvlauncher.view.SearchView.a(boolean, int):void */
    public final void run() {
        SearchView searchView = this.a;
        int i = searchView.n;
        searchView.n = new Random().nextInt(this.a.j.length);
        SearchView searchView2 = this.a;
        int i2 = searchView2.n;
        if (i == i2) {
            searchView2.n = (i2 + 1) % searchView2.j.length;
        }
        searchView2.a(false, 0);
        SearchView searchView3 = this.a;
        searchView3.g.setText(searchView3.a(searchView3.j[searchView3.n]));
        SearchView searchView4 = this.a;
        searchView4.o.postDelayed(this, (long) searchView4.i);
    }
}
