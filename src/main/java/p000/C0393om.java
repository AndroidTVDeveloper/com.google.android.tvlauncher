package p000;

import android.view.View;
import androidx.leanback.widget.SearchBar;

/* renamed from: om */
/* compiled from: PG */
public final class C0393om implements View.OnFocusChangeListener {

    /* renamed from: a */
    private final /* synthetic */ SearchBar f10084a;

    public C0393om(SearchBar searchBar) {
        this.f10084a = searchBar;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.f10084a.mo1040a();
            SearchBar searchBar = this.f10084a;
            if (searchBar.f1250e) {
                searchBar.mo1042b();
                this.f10084a.f1250e = false;
            }
        }
        this.f10084a.mo1041a(z);
    }
}
