package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.tvlauncher.view.SearchView;

/* renamed from: ddq  reason: default package */
/* compiled from: PG */
public final class ddq extends ahe {
    private final /* synthetic */ SearchView a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ddq(SearchView searchView, int i, int i2) {
        super(i, i2);
        this.a = searchView;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        SearchView searchView = this.a;
        searchView.k = (Drawable) obj;
        searchView.b();
    }
}
