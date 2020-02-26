package defpackage;

import android.view.View;
import androidx.leanback.widget.SearchBar;

/* renamed from: om  reason: default package */
/* compiled from: PG */
public final class om implements View.OnFocusChangeListener {
    private final /* synthetic */ SearchBar a;

    public om(SearchBar searchBar) {
        this.a = searchBar;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.a.a();
            SearchBar searchBar = this.a;
            if (searchBar.e) {
                searchBar.b();
                this.a.e = false;
            }
        }
        this.a.a(z);
    }
}
