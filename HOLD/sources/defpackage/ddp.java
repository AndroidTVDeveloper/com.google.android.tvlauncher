package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.tvlauncher.view.SearchOrb;
import com.google.android.tvlauncher.view.SearchView;

/* renamed from: ddp  reason: default package */
/* compiled from: PG */
public final /* synthetic */ class ddp implements View.OnClickListener {
    private final SearchView a;
    private final boolean b;

    public ddp(SearchView searchView, boolean z) {
        this.a = searchView;
        this.b = z;
    }

    public final void onClick(View view) {
        boolean z;
        SearchView searchView = this.a;
        boolean z2 = this.b;
        SearchOrb searchOrb = searchView.e;
        int i = 1;
        boolean z3 = searchOrb != null && searchOrb.hasFocus();
        if (!z3) {
            ddt ddt = searchView.c;
            cfs cfs = new cfs(48, (byte) 0);
            cfs.b(dhs.y);
            ((ddj) ddt).a.c.a(cfs);
        } else {
            ddt ddt2 = searchView.c;
            cfs cfs2 = new cfs(49, (byte) 0);
            cfs2.b(dhs.p);
            ((ddj) ddt2).a.c.a(cfs2);
        }
        if (!z2) {
            Context context = searchView.b;
            Intent intent = searchView.a;
            intent.putExtra("android.intent.extra.ASSIST_INPUT_DEVICE_ID", searchView.p);
            if (z3) {
                i = 2;
            }
            intent.putExtra("search_type", i);
            z = SearchView.a(context, intent);
        } else {
            Context context2 = searchView.b;
            Intent intent2 = searchView.a;
            if (z3) {
                i = 2;
            }
            intent2.putExtra("search_type", i);
            z = SearchView.a(context2, intent2);
        }
        if (z) {
            searchView.c();
        }
    }
}
