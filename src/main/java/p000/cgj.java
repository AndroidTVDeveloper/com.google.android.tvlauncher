package p000;

import android.view.View;
import com.google.android.tvlauncher.appsview.AddAppLinkActivity;

/* renamed from: cgj */
/* compiled from: PG */
public final class cgj implements View.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ AddAppLinkActivity f5467a;

    /* renamed from: b */
    private final /* synthetic */ dby f5468b;

    public cgj(AddAppLinkActivity addAppLinkActivity, dby dby) {
        this.f5467a = addAppLinkActivity;
        this.f5468b = dby;
    }

    public final void onClick(View view) {
        AddAppLinkActivity addAppLinkActivity = this.f5467a;
        dby dby = this.f5468b;
        String str = dby.f8184b;
        String str2 = dby.f8186d;
        cfs cfs = new cfs(40);
        dja h = cfs.mo2735h();
        if (h.f8673b) {
            h.mo4505b();
            h.f8673b = false;
        }
        dmi dmi = (dmi) h.f8672a;
        dmi dmi2 = dmi.f8827e;
        str.getClass();
        int i = dmi.f8828a | 1;
        dmi.f8828a = i;
        dmi.f8829b = str;
        dmi.f8828a = i | 4;
        dmi.f8831d = false;
        if (str2 != null) {
            dja h2 = cfs.mo2735h();
            if (h2.f8673b) {
                h2.mo4505b();
                h2.f8673b = false;
            }
            dmi dmi3 = (dmi) h2.f8672a;
            str2.getClass();
            dmi3.f8828a |= 2;
            dmi3.f8830c = str2;
        }
        addAppLinkActivity.f6378a.mo2714a(cfs);
        addAppLinkActivity.mo3217a();
    }
}
