package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.android.tvlauncher.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: czh */
/* compiled from: PG */
public final class czh {

    /* renamed from: a */
    private czg f7968a;

    /* renamed from: b */
    private final cla f7969b;

    /* renamed from: c */
    private final Context f7970c;

    /* renamed from: d */
    private final ckj f7971d = new ckj(this);

    public czh(Context context) {
        this.f7970c = context;
        cla a = cla.m5025a(context);
        this.f7969b = a;
        a.mo3054a(this.f7971d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4003a(czg czg) {
        this.f7968a = czg;
        this.f7969b.mo3054a(this.f7971d);
        cla cla = this.f7969b;
        if (cla.f5889q != null) {
            mo4004b();
        } else {
            cla.mo3078l();
        }
    }

    /* renamed from: b */
    public final void mo4004b() {
        if (this.f7968a != null) {
            List<cxs> list = this.f7969b.f5889q;
            ArrayList arrayList = new ArrayList(list.size());
            PackageManager packageManager = this.f7970c.getPackageManager();
            for (cxs cxs : list) {
                String str = cxs.f7866a;
                ApplicationInfo applicationInfo = null;
                if ("sponsored.legacy".equals(str)) {
                    arrayList.add(new czf(str, cxs, this.f7970c.getString(R.string.promotional_channel_setting_panel_title), (ResolveInfo) null));
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
            this.f7968a.mo3996a(arrayList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4002a() {
        this.f7968a = null;
        cla cla = this.f7969b;
        cla.f5876d.remove(this.f7971d);
        cla.mo3069d();
        cla.mo3066c();
    }
}
