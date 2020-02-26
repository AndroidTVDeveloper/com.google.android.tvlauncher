package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.tvlauncher.appsview.BannerView;
import java.util.List;

/* renamed from: chx */
/* compiled from: PG */
final class chx extends C0285km implements View.OnClickListener, View.OnFocusChangeListener {

    /* renamed from: p */
    public final BannerView f5582p;

    /* renamed from: q */
    public final /* synthetic */ chy f5583q;

    /* renamed from: r */
    public dby f5584r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public chx(chy chy, View view) {
        super(view);
        this.f5583q = chy;
        BannerView bannerView = (BannerView) view;
        this.f5582p = bannerView;
        bannerView.setOnClickListener(this);
        this.f5582p.setOnFocusChangeListener(this);
    }

    public final void onClick(View view) {
        Intent intent;
        Context context = this.f9783a.getContext();
        if (this.f5584r.f8188f) {
            dby a = cim.m4816a(context).mo2862a(this.f5584r.f8193k);
            if (a == null) {
                intent = new Intent("com.android.tv.applink.action.ADD_APP_LINK");
                intent.putExtra("EXTRA_APP_NAME", this.f5584r.f8183a);
                intent.putExtra("EXTRA_PACKAGE_NAME", this.f5584r.f8184b);
                intent.putExtra("EXTRA_BANNER_URI", this.f5584r.f8185c);
                intent.putExtra("EXTRA_DATA_URI", this.f5584r.f8186d);
                intent.putExtra("EXTRA_DEVELOPER", this.f5584r.f8189g);
                intent.putExtra("EXTRA_CATEGORY", this.f5584r.f8190h);
                intent.putExtra("EXTRA_DESCRIPTION", this.f5584r.f8191i);
                intent.putExtra("EXTRA_IS_GAME", this.f5584r.f8187e);
                List a2 = this.f5584r.mo4081a();
                if (a2.size() > 0) {
                    intent.putExtra("EXTRA_SCREENSHOTS", (String[]) a2.toArray(new String[a2.size()]));
                }
            } else {
                intent = dbk.m6088a(a.f8184b, a.f8186d);
            }
        } else {
            intent = this.f9783a.getContext().getPackageManager().getLeanbackLaunchIntentForPackage(this.f5584r.f8184b);
            if (intent == null) {
                intent = new Intent("android.intent.action.VIEW");
                String valueOf = String.valueOf(this.f5584r.f8184b);
                intent.setData(Uri.parse(valueOf.length() == 0 ? new String("market://details?id=") : "market://details?id=".concat(valueOf)));
            } else {
                intent.addFlags(270532608);
            }
        }
        this.f5583q.f5586c.mo2763a(intent, this.f9783a);
    }

    public final void onFocusChange(View view, boolean z) {
        this.f5582p.mo3226a(z);
    }
}
