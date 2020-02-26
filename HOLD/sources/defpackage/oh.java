package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import androidx.leanback.widget.SearchBar;

/* renamed from: oh  reason: default package */
/* compiled from: PG */
public final class oh implements TextWatcher {
    private final /* synthetic */ Runnable a;
    private final /* synthetic */ SearchBar b;

    public oh(SearchBar searchBar, Runnable runnable) {
        this.b = searchBar;
        this.a = runnable;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.b.d.removeCallbacks(this.a);
        this.b.d.post(this.a);
    }
}
