package p000;

import android.text.TextUtils;
import androidx.leanback.widget.SearchBar;

/* renamed from: og */
/* compiled from: PG */
public final class C0387og implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ SearchBar f10078a;

    public C0387og(SearchBar searchBar) {
        this.f10078a = searchBar;
    }

    public final void run() {
        SearchBar searchBar = this.f10078a;
        String obj = searchBar.f1246a.getText().toString();
        if (!TextUtils.equals(searchBar.f1248c, obj)) {
            searchBar.f1248c = obj;
        }
    }
}
