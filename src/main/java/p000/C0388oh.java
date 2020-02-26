package p000;

import android.text.Editable;
import android.text.TextWatcher;
import androidx.leanback.widget.SearchBar;

/* renamed from: oh */
/* compiled from: PG */
public final class C0388oh implements TextWatcher {

    /* renamed from: a */
    private final /* synthetic */ Runnable f10079a;

    /* renamed from: b */
    private final /* synthetic */ SearchBar f10080b;

    public C0388oh(SearchBar searchBar, Runnable runnable) {
        this.f10080b = searchBar;
        this.f10079a = runnable;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f10080b.f1249d.removeCallbacks(this.f10079a);
        this.f10080b.f1249d.post(this.f10079a);
    }
}
