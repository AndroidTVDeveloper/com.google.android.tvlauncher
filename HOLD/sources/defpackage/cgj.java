package defpackage;

import android.view.View;
import com.google.android.tvlauncher.appsview.AddAppLinkActivity;

/* renamed from: cgj  reason: default package */
/* compiled from: PG */
public final class cgj implements View.OnClickListener {
    private final /* synthetic */ AddAppLinkActivity a;
    private final /* synthetic */ dby b;

    public cgj(AddAppLinkActivity addAppLinkActivity, dby dby) {
        this.a = addAppLinkActivity;
        this.b = dby;
    }

    public final void onClick(View view) {
        AddAppLinkActivity addAppLinkActivity = this.a;
        dby dby = this.b;
        String str = dby.b;
        String str2 = dby.d;
        cfs cfs = new cfs(40);
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
        dmi.d = false;
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
        addAppLinkActivity.a.a(cfs);
        addAppLinkActivity.a();
    }
}
