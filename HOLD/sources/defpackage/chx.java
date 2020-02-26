package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.tvlauncher.appsview.BannerView;
import java.util.List;

/* renamed from: chx  reason: default package */
/* compiled from: PG */
final class chx extends km implements View.OnClickListener, View.OnFocusChangeListener {
    public final BannerView p;
    public final /* synthetic */ chy q;
    public dby r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public chx(chy chy, View view) {
        super(view);
        this.q = chy;
        BannerView bannerView = (BannerView) view;
        this.p = bannerView;
        bannerView.setOnClickListener(this);
        this.p.setOnFocusChangeListener(this);
    }

    public final void onClick(View view) {
        Intent intent;
        Context context = this.a.getContext();
        if (this.r.f) {
            dby a = cim.a(context).a(this.r.k);
            if (a == null) {
                intent = new Intent("com.android.tv.applink.action.ADD_APP_LINK");
                intent.putExtra("EXTRA_APP_NAME", this.r.a);
                intent.putExtra("EXTRA_PACKAGE_NAME", this.r.b);
                intent.putExtra("EXTRA_BANNER_URI", this.r.c);
                intent.putExtra("EXTRA_DATA_URI", this.r.d);
                intent.putExtra("EXTRA_DEVELOPER", this.r.g);
                intent.putExtra("EXTRA_CATEGORY", this.r.h);
                intent.putExtra("EXTRA_DESCRIPTION", this.r.i);
                intent.putExtra("EXTRA_IS_GAME", this.r.e);
                List a2 = this.r.a();
                if (a2.size() > 0) {
                    intent.putExtra("EXTRA_SCREENSHOTS", (String[]) a2.toArray(new String[a2.size()]));
                }
            } else {
                intent = dbk.a(a.b, a.d);
            }
        } else {
            intent = this.a.getContext().getPackageManager().getLeanbackLaunchIntentForPackage(this.r.b);
            if (intent == null) {
                intent = new Intent("android.intent.action.VIEW");
                String valueOf = String.valueOf(this.r.b);
                intent.setData(Uri.parse(valueOf.length() == 0 ? new String("market://details?id=") : "market://details?id=".concat(valueOf)));
            } else {
                intent.addFlags(270532608);
            }
        }
        this.q.c.a(intent, this.a);
    }

    public final void onFocusChange(View view, boolean z) {
        this.p.a(z);
    }
}
