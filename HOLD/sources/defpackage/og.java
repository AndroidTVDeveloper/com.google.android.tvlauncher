package defpackage;

import android.text.TextUtils;
import androidx.leanback.widget.SearchBar;

/* renamed from: og  reason: default package */
/* compiled from: PG */
public final class og implements Runnable {
    private final /* synthetic */ SearchBar a;

    public og(SearchBar searchBar) {
        this.a = searchBar;
    }

    public final void run() {
        SearchBar searchBar = this.a;
        String obj = searchBar.a.getText().toString();
        if (!TextUtils.equals(searchBar.c, obj)) {
            searchBar.c = obj;
        }
    }
}
