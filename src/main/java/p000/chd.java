package p000;

import android.util.Pair;
import android.view.View;
import com.google.android.tvlauncher.appsview.BannerView;

/* renamed from: chd */
/* compiled from: PG */
final class chd extends C0285km implements View.OnClickListener, View.OnFocusChangeListener, C0360ng {

    /* renamed from: p */
    public final BannerView f5512p;

    /* renamed from: q */
    public final /* synthetic */ chf f5513q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public chd(chf chf, View view) {
        super(view);
        this.f5513q = chf;
        BannerView bannerView = (BannerView) view;
        this.f5512p = bannerView;
        bannerView.setOnClickListener(this);
        this.f5512p.setOnFocusChangeListener(this);
        this.f5512p.setSelected(false);
    }

    /* renamed from: a */
    public final Object mo2791a() {
        int i;
        if (mo5436d() == -1) {
            return null;
        }
        Pair a = chq.m4748a(mo5436d());
        if (a != null) {
            int intValue = ((Integer) a.first).intValue();
            int a2 = (this.f5513q.mo2794a() + 3) / 4;
            chf chf = this.f5513q;
            int i2 = chf.f5520h;
            i = chf.f5518f;
            if (i2 == i && intValue == a2 - 2 && a2 >= 3) {
                i = chf.f5519g;
            } else if (intValue != a2 - 1) {
                i = chf.f5517e;
            }
        } else {
            i = this.f5513q.f5517e;
        }
        return dbq.m6094a(-i);
    }

    public final void onClick(View view) {
        view.setSelected(!view.isSelected());
        if (view.isSelected()) {
            this.f5513q.f5515c.mo2782a(true);
        }
    }

    public final void onFocusChange(View view, boolean z) {
        if (view instanceof BannerView) {
            ((BannerView) view).mo3228b(z);
        }
    }
}
