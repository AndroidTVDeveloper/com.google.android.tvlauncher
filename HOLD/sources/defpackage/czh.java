package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.android.tvlauncher.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: czh  reason: default package */
/* compiled from: PG */
public final class czh {
    private czg a;
    private final cla b;
    private final Context c;
    private final ckj d = new ckj(this);

    public czh(Context context) {
        this.c = context;
        cla a2 = cla.a(context);
        this.b = a2;
        a2.a(this.d);
    }

    /* access modifiers changed from: package-private */
    public final void a(czg czg) {
        this.a = czg;
        this.b.a(this.d);
        cla cla = this.b;
        if (cla.q != null) {
            b();
        } else {
            cla.l();
        }
    }

    public final void b() {
        if (this.a != null) {
            List<cxs> list = this.b.q;
            ArrayList arrayList = new ArrayList(list.size());
            PackageManager packageManager = this.c.getPackageManager();
            for (cxs cxs : list) {
                String str = cxs.a;
                ApplicationInfo applicationInfo = null;
                if ("sponsored.legacy".equals(str)) {
                    arrayList.add(new czf(str, cxs, this.c.getString(R.string.promotional_channel_setting_panel_title), (ResolveInfo) null));
                } else {
                    try {
                        applicationInfo = packageManager.getApplicationInfo(str, 0);
                    } catch (PackageManager.NameNotFoundException e) {
                    }
                    if (applicationInfo != null) {
                        arrayList.add(new czf(str, cxs, applicationInfo, packageManager));
                    }
                }
            }
            this.a.a(arrayList);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.a = null;
        cla cla = this.b;
        cla.d.remove(this.d);
        cla.d();
        cla.c();
    }
}
