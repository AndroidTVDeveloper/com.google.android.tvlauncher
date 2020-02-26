package p000;

import android.view.View;
import com.google.android.tvlauncher.appsview.RemoveAppLinkActivity;

/* renamed from: chz */
/* compiled from: PG */
public final class chz implements View.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ dby f5588a;

    /* renamed from: b */
    private final /* synthetic */ RemoveAppLinkActivity f5589b;

    public chz(RemoveAppLinkActivity removeAppLinkActivity, dby dby) {
        this.f5589b = removeAppLinkActivity;
        this.f5588a = dby;
    }

    public final void onClick(View view) {
        cim a = cim.m4816a(this.f5589b);
        String str = this.f5588a.f8193k;
        if (a.f5650c.remove(str) != null) {
            a.f5649b.edit().remove(str).apply();
            a.f5648a.mo2905j(str);
        }
        cfs cfs = new cfs(41);
        dja h = cfs.mo2735h();
        String str2 = this.f5588a.f8184b;
        if (h.f8673b) {
            h.mo4505b();
            h.f8673b = false;
        }
        dmi dmi = (dmi) h.f8672a;
        dmi dmi2 = dmi.f8827e;
        str2.getClass();
        int i = dmi.f8828a | 1;
        dmi.f8828a = i;
        dmi.f8829b = str2;
        dmi.f8828a = i | 4;
        dmi.f8831d = false;
        if (this.f5588a.f8186d != null) {
            dja h2 = cfs.mo2735h();
            String str3 = this.f5588a.f8186d;
            if (h2.f8673b) {
                h2.mo4505b();
                h2.f8673b = false;
            }
            dmi dmi3 = (dmi) h2.f8672a;
            str3.getClass();
            dmi3.f8828a |= 2;
            dmi3.f8830c = str3;
        }
        this.f5589b.f6412a.mo2714a(cfs);
        this.f5589b.setResult(-1);
        this.f5589b.finish();
    }
}
