package p000;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.tvlauncher.view.SearchOrb;
import com.google.android.tvlauncher.view.SearchView;

/* renamed from: ddp */
/* compiled from: PG */
public final /* synthetic */ class ddp implements View.OnClickListener {

    /* renamed from: a */
    private final SearchView f8339a;

    /* renamed from: b */
    private final boolean f8340b;

    public ddp(SearchView searchView, boolean z) {
        this.f8339a = searchView;
        this.f8340b = z;
    }

    public final void onClick(View view) {
        boolean z;
        SearchView searchView = this.f8339a;
        boolean z2 = this.f8340b;
        SearchOrb searchOrb = searchView.f6748e;
        int i = 1;
        boolean z3 = searchOrb != null && searchOrb.hasFocus();
        if (!z3) {
            ddt ddt = searchView.f6746c;
            cfs cfs = new cfs(48, (byte) 0);
            cfs.mo2729b(dhs.f8561y);
            ((ddj) ddt).f8338a.f6700c.mo2714a(cfs);
        } else {
            ddt ddt2 = searchView.f6746c;
            cfs cfs2 = new cfs(49, (byte) 0);
            cfs2.mo2729b(dhs.f8552p);
            ((ddj) ddt2).f8338a.f6700c.mo2714a(cfs2);
        }
        if (!z2) {
            Context context = searchView.f6745b;
            Intent intent = searchView.f6744a;
            intent.putExtra("android.intent.extra.ASSIST_INPUT_DEVICE_ID", searchView.f6759p);
            if (z3) {
                i = 2;
            }
            intent.putExtra("search_type", i);
            z = SearchView.m5374a(context, intent);
        } else {
            Context context2 = searchView.f6745b;
            Intent intent2 = searchView.f6744a;
            if (z3) {
                i = 2;
            }
            intent2.putExtra("search_type", i);
            z = SearchView.m5374a(context2, intent2);
        }
        if (z) {
            searchView.mo3498c();
        }
    }
}
