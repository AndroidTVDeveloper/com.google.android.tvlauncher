package defpackage;

import android.util.Log;
import android.view.View;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.appsview.StoreRowButtonView;
import java.util.List;

/* renamed from: cih  reason: default package */
/* compiled from: PG */
final class cih extends cif {
    public List p;
    private final StoreRowButtonView q;
    private final StoreRowButtonView r;
    private final /* synthetic */ cij s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cih(cij cij, View view, cfp cfp) {
        super(view, cfp);
        this.s = cij;
        StoreRowButtonView storeRowButtonView = (StoreRowButtonView) view.findViewById(R.id.app_store);
        this.q = storeRowButtonView;
        storeRowButtonView.c = dhs.i;
        StoreRowButtonView storeRowButtonView2 = (StoreRowButtonView) view.findViewById(R.id.game_store);
        this.r = storeRowButtonView2;
        storeRowButtonView2.c = dhs.j;
    }

    /* access modifiers changed from: protected */
    public final int v() {
        return this.s.b;
    }

    public final void u() {
        List list = this.p;
        int size = list.size();
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            chn chn = (chn) list.get(i);
            if (cja.f(chn.c)) {
                this.q.a(this.s.i);
                this.q.a.setImageDrawable(this.s.g);
                this.q.a(chn, this.s.q);
                z = true;
            } else if (cja.g(chn.c)) {
                this.r.a(this.s.j);
                this.r.a.setImageDrawable(this.s.h);
                this.r.a(chn, this.s.q);
                z2 = true;
            } else {
                Log.e("RowListAdapter", "Trying to add an app to store button that is not a store.");
            }
        }
        int i2 = 8;
        this.q.setVisibility(!z ? 8 : 0);
        StoreRowButtonView storeRowButtonView = this.r;
        if (z2) {
            i2 = 0;
        }
        storeRowButtonView.setVisibility(i2);
    }
}
