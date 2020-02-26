package defpackage;

import android.util.Pair;
import android.view.View;
import com.google.android.tvlauncher.appsview.BannerView;

/* renamed from: chd  reason: default package */
/* compiled from: PG */
final class chd extends km implements View.OnClickListener, View.OnFocusChangeListener, ng {
    public final BannerView p;
    public final /* synthetic */ chf q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public chd(chf chf, View view) {
        super(view);
        this.q = chf;
        BannerView bannerView = (BannerView) view;
        this.p = bannerView;
        bannerView.setOnClickListener(this);
        this.p.setOnFocusChangeListener(this);
        this.p.setSelected(false);
    }

    public final Object a() {
        int i;
        if (d() == -1) {
            return null;
        }
        Pair a = chq.a(d());
        if (a != null) {
            int intValue = ((Integer) a.first).intValue();
            int a2 = (this.q.a() + 3) / 4;
            chf chf = this.q;
            int i2 = chf.h;
            i = chf.f;
            if (i2 == i && intValue == a2 - 2 && a2 >= 3) {
                i = chf.g;
            } else if (intValue != a2 - 1) {
                i = chf.e;
            }
        } else {
            i = this.q.e;
        }
        return dbq.a(-i);
    }

    public final void onClick(View view) {
        view.setSelected(!view.isSelected());
        if (view.isSelected()) {
            this.q.c.a(true);
        }
    }

    public final void onFocusChange(View view, boolean z) {
        if (view instanceof BannerView) {
            ((BannerView) view).b(z);
        }
    }
}
