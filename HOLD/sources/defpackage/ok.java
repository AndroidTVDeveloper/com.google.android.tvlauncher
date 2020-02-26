package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.leanback.widget.SearchBar;

/* renamed from: ok  reason: default package */
/* compiled from: PG */
public final class ok implements TextView.OnEditorActionListener {
    public final /* synthetic */ SearchBar a;

    public ok(SearchBar searchBar) {
        this.a = searchBar;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 2) {
            return false;
        }
        this.a.a();
        this.a.d.postDelayed(new oj(this), 500);
        return true;
    }
}
