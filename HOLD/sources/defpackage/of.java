package defpackage;

import android.view.View;
import androidx.leanback.widget.SearchBar;

/* renamed from: of  reason: default package */
/* compiled from: PG */
public final class of implements View.OnFocusChangeListener {
    private final /* synthetic */ SearchBar a;

    public of(SearchBar searchBar) {
        this.a = searchBar;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            SearchBar searchBar = this.a;
            searchBar.d.post(new on(searchBar));
        } else {
            this.a.a();
        }
        this.a.a(z);
    }
}
