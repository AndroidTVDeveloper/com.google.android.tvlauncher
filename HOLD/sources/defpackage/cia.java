package defpackage;

import android.view.View;
import com.google.android.tvlauncher.appsview.RemoveAppLinkActivity;

/* renamed from: cia  reason: default package */
/* compiled from: PG */
public final class cia implements View.OnClickListener {
    private final /* synthetic */ dby a;
    private final /* synthetic */ RemoveAppLinkActivity b;

    public cia(RemoveAppLinkActivity removeAppLinkActivity, dby dby) {
        this.b = removeAppLinkActivity;
        this.a = dby;
    }

    public final void onClick(View view) {
        RemoveAppLinkActivity removeAppLinkActivity = this.b;
        dby dby = this.a;
        String str = dby.b;
        String str2 = dby.d;
        cfs cfs = new cfs(42);
        dja h = cfs.h();
        if (h.b) {
            h.b();
            h.b = false;
        }
        dmi dmi = (dmi) h.a;
        dmi dmi2 = dmi.e;
        str.getClass();
        int i = dmi.a | 1;
        dmi.a = i;
        dmi.b = str;
        dmi.a = i | 4;
        dmi.d = true;
        if (str2 != null) {
            dja h2 = cfs.h();
            if (h2.b) {
                h2.b();
                h2.b = false;
            }
            dmi dmi3 = (dmi) h2.a;
            str2.getClass();
            dmi3.a |= 2;
            dmi3.c = str2;
        }
        removeAppLinkActivity.a.a(cfs);
        removeAppLinkActivity.a();
    }
}
