package p000;

import android.view.View;
import com.google.android.tvlauncher.appsview.RemoveAppLinkActivity;

/* renamed from: cia */
/* compiled from: PG */
public final class cia implements View.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ dby f5590a;

    /* renamed from: b */
    private final /* synthetic */ RemoveAppLinkActivity f5591b;

    public cia(RemoveAppLinkActivity removeAppLinkActivity, dby dby) {
        this.f5591b = removeAppLinkActivity;
        this.f5590a = dby;
    }

    public final void onClick(View view) {
        RemoveAppLinkActivity removeAppLinkActivity = this.f5591b;
        dby dby = this.f5590a;
        String str = dby.f8184b;
        String str2 = dby.f8186d;
        cfs cfs = new cfs(42);
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
        dmi.f8831d = true;
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
        removeAppLinkActivity.f6412a.mo2714a(cfs);
        removeAppLinkActivity.mo3240a();
    }
}
