package p000;

import android.view.View;
import androidx.leanback.widget.SearchBar;

/* renamed from: of */
/* compiled from: PG */
public final class C0386of implements View.OnFocusChangeListener {

    /* renamed from: a */
    private final /* synthetic */ SearchBar f10077a;

    public C0386of(SearchBar searchBar) {
        this.f10077a = searchBar;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            SearchBar searchBar = this.f10077a;
            searchBar.f1249d.post(new C0394on(searchBar));
        } else {
            this.f10077a.mo1040a();
        }
        this.f10077a.mo1041a(z);
    }
}
