package p000;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.VerticalGridView;
import com.google.android.tvlauncher.R;

/* renamed from: cgt */
/* compiled from: PG */
public final class cgt extends Fragment {

    /* renamed from: a */
    public cij f5479a;

    /* renamed from: b */
    public cja f5480b;

    /* renamed from: c */
    public VerticalGridView f5481c;

    /* renamed from: d */
    public final cfr f5482d = new cfr(this);

    /* renamed from: e */
    public cgs f5483e;

    /* renamed from: f */
    private View f5484f;

    /* renamed from: g */
    private chr f5485g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f5486h = true;

    /* renamed from: i */
    private boolean f5487i = true;

    /* renamed from: j */
    private final cgr f5488j = new cgr(this);

    /* renamed from: k */
    private final aic f5489k = new cgo(this);

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && intent != null && intent.getBooleanExtra("extra_launched_virtual_app", false)) {
            this.f5483e.mo2766a(true);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        cja a = dbq.m6093a(getContext());
        this.f5480b = a;
        a.mo2897e();
        cij cij = new cij(getContext(), this.f5482d, this.f5480b);
        this.f5479a = cij;
        cij.mo5307a(this.f5489k);
        this.f5480b.mo2886a(this.f5479a);
        this.f5485g = new cgp(this);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) R.layout.apps_view_fragment, viewGroup, false);
        this.f5484f = inflate;
        return inflate;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f5480b.mo2890b(this.f5479a);
        this.f5479a.mo5310b(this.f5489k);
    }

    public final void onPause() {
        dcc a = dcc.m6108a(getContext());
        cij cij = this.f5479a;
        if (a.f8204g != null && a.f8207j.size() == 1 && a.f8207j.contains(cij)) {
            a.f8204g.getContentResolver().unregisterContentObserver(a.f8208k);
        }
        a.f8207j.remove(cij);
        this.f5480b.mo2890b(a);
        super.onPause();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cfs.<init>(int, char):void
     arg types: [int, int]
     candidates:
      cfs.<init>(int, byte):void
      cfs.<init>(int, char):void */
    public final void onResume() {
        cfr cfr = this.f5482d;
        cfs cfs = new cfs(14, 0);
        cfs.f5419b = new String[]{"app_count"};
        cfr.mo2714a(cfs);
        if (this.f5481c != null && this.f5486h && this.f5487i) {
            int i = 0;
            while (true) {
                if (i < this.f5479a.mo2794a()) {
                    if (this.f5479a.mo2850a(i) != 5) {
                        this.f5481c.mo5619k(i);
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        this.f5479a.f5637s = this.f5486h;
        this.f5486h = true;
        this.f5487i = false;
        dcc a = dcc.m6108a(getContext());
        cij cij = this.f5479a;
        if (!a.f8207j.contains(cij)) {
            a.f8207j.add(cij);
        }
        try {
            if (a.f8204g != null && a.f8207j.size() == 1) {
                a.f8204g.getContentResolver().registerContentObserver(a.f8205h, true, a.f8208k);
            }
        } catch (SecurityException e) {
            Log.e("OemAppPromotions", "failed to register content observer for app promotions", e);
        }
        a.mo4088a(true);
        this.f5480b.mo2886a(a);
        super.onResume();
    }

    public final void onStop() {
        this.f5487i = true;
        super.onStop();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f5481c = (VerticalGridView) this.f5484f.findViewById(R.id.row_list_view);
        this.f5479a.mo2855e();
        cij cij = this.f5479a;
        cij.f5635q = this.f5485g;
        cij.f5636r = this.f5488j;
        cij.mo2857f();
        this.f5481c.mo831a(this.f5479a);
        this.f5484f.requestFocus();
    }

    /* renamed from: a */
    public final void mo2768a(int i) {
        chr chr = this.f5485g;
        if (chr != null) {
            chr.mo2762a(i, 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2767a() {
        if (this.f5481c != null && this.f5479a.mo2794a() != 0) {
            if (this.f5479a.mo2850a(0) == 3) {
                this.f5481c.mo5613g(0);
                this.f5481c.mo5609a(-1.0f);
                return;
            }
            int dimensionPixelSize = this.f5481c.getContext().getResources().getDimensionPixelSize(R.dimen.apps_view_padding_top);
            this.f5481c.mo5615h(dimensionPixelSize);
            this.f5481c.mo5609a(-1.0f);
            this.f5481c.mo5613g(1);
            VerticalGridView verticalGridView = this.f5481c;
            verticalGridView.setPadding(verticalGridView.getPaddingLeft(), dimensionPixelSize, this.f5481c.getPaddingRight(), this.f5481c.getPaddingBottom());
        }
    }
}
