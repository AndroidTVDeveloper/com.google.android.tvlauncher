package defpackage;

import androidx.leanback.widget.SearchBar;

/* renamed from: oj  reason: default package */
/* compiled from: PG */
final class oj implements Runnable {
    private final /* synthetic */ ok a;

    public oj(ok okVar) {
        this.a = okVar;
    }

    public final void run() {
        SearchBar searchBar = this.a.a;
        searchBar.e = true;
        searchBar.b.requestFocus();
    }
}
