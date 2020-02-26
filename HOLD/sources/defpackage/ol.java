package defpackage;

import android.view.View;
import androidx.leanback.widget.SearchBar;

/* renamed from: ol  reason: default package */
/* compiled from: PG */
public final class ol implements View.OnClickListener {
    private final /* synthetic */ SearchBar a;

    public ol(SearchBar searchBar) {
        this.a = searchBar;
    }

    public final void onClick(View view) {
        this.a.b();
    }
}
