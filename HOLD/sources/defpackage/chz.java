package defpackage;

import android.view.View;
import com.google.android.tvlauncher.appsview.RemoveAppLinkActivity;

/* renamed from: chz  reason: default package */
/* compiled from: PG */
public final class chz implements View.OnClickListener {
    private final /* synthetic */ dby a;
    private final /* synthetic */ RemoveAppLinkActivity b;

    public chz(RemoveAppLinkActivity removeAppLinkActivity, dby dby) {
        this.b = removeAppLinkActivity;
        this.a = dby;
    }

    public final void onClick(View view) {
        cim a2 = cim.a(this.b);
        String str = this.a.k;
        if (a2.c.remove(str) != null) {
            a2.b.edit().remove(str).apply();
            a2.a.j(str);
        }
        cfs cfs = new cfs(41);
        dja h = cfs.h();
        String str2 = this.a.b;
        if (h.b) {
            h.b();
            h.b = false;
        }
        dmi dmi = (dmi) h.a;
        dmi dmi2 = dmi.e;
        str2.getClass();
        int i = dmi.a | 1;
        dmi.a = i;
        dmi.b = str2;
        dmi.a = i | 4;
        dmi.d = false;
        if (this.a.d != null) {
            dja h2 = cfs.h();
            String str3 = this.a.d;
            if (h2.b) {
                h2.b();
                h2.b = false;
            }
            dmi dmi3 = (dmi) h2.a;
            str3.getClass();
            dmi3.a |= 2;
            dmi3.c = str3;
        }
        this.b.a.a(cfs);
        this.b.setResult(-1);
        this.b.finish();
    }
}
