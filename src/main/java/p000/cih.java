package p000;

import android.util.Log;
import android.view.View;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.appsview.StoreRowButtonView;
import java.util.List;

/* renamed from: cih */
/* compiled from: PG */
final class cih extends cif {

    /* renamed from: p */
    public List f5611p;

    /* renamed from: q */
    private final StoreRowButtonView f5612q;

    /* renamed from: r */
    private final StoreRowButtonView f5613r;

    /* renamed from: s */
    private final /* synthetic */ cij f5614s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cih(cij cij, View view, cfp cfp) {
        super(view, cfp);
        this.f5614s = cij;
        StoreRowButtonView storeRowButtonView = (StoreRowButtonView) view.findViewById(R.id.app_store);
        this.f5612q = storeRowButtonView;
        storeRowButtonView.f6421c = dhs.f8545i;
        StoreRowButtonView storeRowButtonView2 = (StoreRowButtonView) view.findViewById(R.id.game_store);
        this.f5613r = storeRowButtonView2;
        storeRowButtonView2.f6421c = dhs.f8546j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final int mo2847v() {
        return this.f5614s.f5620b;
    }

    /* renamed from: u */
    public final void mo2846u() {
        List list = this.f5611p;
        int size = list.size();
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            chn chn = (chn) list.get(i);
            if (cja.m4854f(chn.f5563c)) {
                this.f5612q.mo3245a(this.f5614s.f5627i);
                this.f5612q.f6419a.setImageDrawable(this.f5614s.f5625g);
                this.f5612q.mo3244a(chn, this.f5614s.f5635q);
                z = true;
            } else if (cja.m4855g(chn.f5563c)) {
                this.f5613r.mo3245a(this.f5614s.f5628j);
                this.f5613r.f6419a.setImageDrawable(this.f5614s.f5626h);
                this.f5613r.mo3244a(chn, this.f5614s.f5635q);
                z2 = true;
            } else {
                Log.e("RowListAdapter", "Trying to add an app to store button that is not a store.");
            }
        }
        int i2 = 8;
        this.f5612q.setVisibility(!z ? 8 : 0);
        StoreRowButtonView storeRowButtonView = this.f5613r;
        if (z2) {
            i2 = 0;
        }
        storeRowButtonView.setVisibility(i2);
    }
}
