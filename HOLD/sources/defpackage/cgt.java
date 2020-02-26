package defpackage;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.VerticalGridView;
import com.google.android.tvlauncher.R;

/* renamed from: cgt  reason: default package */
/* compiled from: PG */
public final class cgt extends Fragment {
    public cij a;
    public cja b;
    public VerticalGridView c;
    public final cfr d = new cfr(this);
    public cgs e;
    private View f;
    private chr g;
    /* access modifiers changed from: private */
    public boolean h = true;
    private boolean i = true;
    private final cgr j = new cgr(this);
    private final aic k = new cgo(this);

    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i3 == -1 && intent != null && intent.getBooleanExtra("extra_launched_virtual_app", false)) {
            this.e.a(true);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        cja a2 = dbq.a(getContext());
        this.b = a2;
        a2.e();
        cij cij = new cij(getContext(), this.d, this.b);
        this.a = cij;
        cij.a(this.k);
        this.b.a(this.a);
        this.g = new cgp(this);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) R.layout.apps_view_fragment, viewGroup, false);
        this.f = inflate;
        return inflate;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.b.b(this.a);
        this.a.b(this.k);
    }

    public final void onPause() {
        dcc a2 = dcc.a(getContext());
        cij cij = this.a;
        if (a2.g != null && a2.j.size() == 1 && a2.j.contains(cij)) {
            a2.g.getContentResolver().unregisterContentObserver(a2.k);
        }
        a2.j.remove(cij);
        this.b.b(a2);
        super.onPause();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cfs.<init>(int, char):void
     arg types: [int, int]
     candidates:
      cfs.<init>(int, byte):void
      cfs.<init>(int, char):void */
    public final void onResume() {
        cfr cfr = this.d;
        cfs cfs = new cfs(14, 0);
        cfs.b = new String[]{"app_count"};
        cfr.a(cfs);
        if (this.c != null && this.h && this.i) {
            int i2 = 0;
            while (true) {
                if (i2 < this.a.a()) {
                    if (this.a.a(i2) != 5) {
                        this.c.k(i2);
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
        }
        this.a.s = this.h;
        this.h = true;
        this.i = false;
        dcc a2 = dcc.a(getContext());
        cij cij = this.a;
        if (!a2.j.contains(cij)) {
            a2.j.add(cij);
        }
        try {
            if (a2.g != null && a2.j.size() == 1) {
                a2.g.getContentResolver().registerContentObserver(a2.h, true, a2.k);
            }
        } catch (SecurityException e2) {
            Log.e("OemAppPromotions", "failed to register content observer for app promotions", e2);
        }
        a2.a(true);
        this.b.a(a2);
        super.onResume();
    }

    public final void onStop() {
        this.i = true;
        super.onStop();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.c = (VerticalGridView) this.f.findViewById(R.id.row_list_view);
        this.a.e();
        cij cij = this.a;
        cij.q = this.g;
        cij.r = this.j;
        cij.f();
        this.c.a(this.a);
        this.f.requestFocus();
    }

    public final void a(int i2) {
        chr chr = this.g;
        if (chr != null) {
            chr.a(i2, 0);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (this.c != null && this.a.a() != 0) {
            if (this.a.a(0) == 3) {
                this.c.g(0);
                this.c.a(-1.0f);
                return;
            }
            int dimensionPixelSize = this.c.getContext().getResources().getDimensionPixelSize(R.dimen.apps_view_padding_top);
            this.c.h(dimensionPixelSize);
            this.c.a(-1.0f);
            this.c.g(1);
            VerticalGridView verticalGridView = this.c;
            verticalGridView.setPadding(verticalGridView.getPaddingLeft(), dimensionPixelSize, this.c.getPaddingRight(), this.c.getPaddingBottom());
        }
    }
}
