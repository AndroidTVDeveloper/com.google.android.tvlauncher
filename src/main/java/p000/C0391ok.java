package p000;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.leanback.widget.SearchBar;

/* renamed from: ok */
/* compiled from: PG */
public final class C0391ok implements TextView.OnEditorActionListener {

    /* renamed from: a */
    public final /* synthetic */ SearchBar f10082a;

    public C0391ok(SearchBar searchBar) {
        this.f10082a = searchBar;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 2) {
            return false;
        }
        this.f10082a.mo1040a();
        this.f10082a.f1249d.postDelayed(new C0390oj(this), 500);
        return true;
    }
}
