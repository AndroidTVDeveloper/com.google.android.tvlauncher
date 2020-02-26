package p000;

import androidx.leanback.widget.SearchBar;

/* renamed from: oj */
/* compiled from: PG */
final class C0390oj implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C0391ok f10081a;

    public C0390oj(C0391ok okVar) {
        this.f10081a = okVar;
    }

    public final void run() {
        SearchBar searchBar = this.f10081a.f10082a;
        searchBar.f1250e = true;
        searchBar.f1247b.requestFocus();
    }
}
