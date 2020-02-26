package p000;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.util.NotifyRefreshOemConfigurationDataJobService;
import java.util.ArrayList;
import java.util.List;

/* renamed from: dck */
/* compiled from: PG */
public final class dck {

    /* renamed from: a */
    public static dck f8224a;

    /* renamed from: b */
    public static final Object f8225b = new Object();

    /* renamed from: c */
    public String f8226c;

    /* renamed from: d */
    public Context f8227d;

    /* renamed from: e */
    public final dcn f8228e;

    /* renamed from: f */
    public final List f8229f = new ArrayList(1);

    private dck(Context context, String str) {
        Context context2;
        int i;
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.f8227d = context2;
        this.f8226c = str;
        if (context2 != null) {
            i = dcr.m6171b(context2, str);
        } else {
            i = -1;
        }
        this.f8228e = new dcn(this.f8227d, i);
        if (this.f8227d != null) {
            mo4091a(dcg.f8217a);
            if (dhz.m6481a(this.f8227d)) {
                Context context3 = this.f8227d;
                JobScheduler jobScheduler = (JobScheduler) context3.getSystemService(JobScheduler.class);
                if (jobScheduler != null) {
                    jobScheduler.schedule(new JobInfo.Builder(2, new ComponentName(context3, NotifyRefreshOemConfigurationDataJobService.class)).addTriggerContentUri(new JobInfo.TriggerContentUri(dem.f8381a, 1)).build());
                }
            }
        }
    }

    /* renamed from: m */
    public static boolean m6124m() {
        return true;
    }

    /* renamed from: a */
    public final boolean mo4092a() {
        dcn dcn = this.f8228e;
        return dcn.f8242G && !dcn.f8243H;
    }

    /* renamed from: b */
    public final boolean mo4095b() {
        return this.f8228e.f8278m;
    }

    /* renamed from: c */
    public final boolean mo4096c() {
        return this.f8228e.f8271f;
    }

    /* renamed from: d */
    public final boolean mo4097d() {
        return this.f8228e.f8273h;
    }

    /* renamed from: e */
    public final String mo4098e() {
        return this.f8228e.f8270e;
    }

    /* renamed from: f */
    public final String mo4099f() {
        return this.f8228e.f8272g;
    }

    /* renamed from: g */
    public final Uri mo4100g() {
        return this.f8228e.f8269d;
    }

    /* renamed from: h */
    public final dch mo4101h() {
        return this.f8228e.f8236A;
    }

    /* renamed from: i */
    public final boolean mo4102i() {
        return this.f8228e.f8280o;
    }

    /* renamed from: j */
    public final String mo4103j() {
        return this.f8228e.f8281p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final String mo4104k() {
        return this.f8228e.f8240E;
    }

    /* renamed from: l */
    public final String mo4105l() {
        return this.f8228e.f8241F;
    }

    /* renamed from: a */
    public final void mo4090a(dci dci) {
        if (dci != null) {
            this.f8229f.add(dci);
        }
    }

    /* renamed from: a */
    public static dck m6123a(Context context) {
        ResolveInfo resolveInfo;
        synchronized (f8225b) {
            if (f8224a == null) {
                List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(new Intent("com.google.android.tvlauncher.action.PARTNER_CONFIGURATION"), 0);
                if (queryBroadcastReceivers == null) {
                    resolveInfo = null;
                } else {
                    resolveInfo = null;
                    for (ResolveInfo next : queryBroadcastReceivers) {
                        if (dej.m6251a(next)) {
                            resolveInfo = next;
                        }
                    }
                }
                String str = resolveInfo != null ? resolveInfo.activityInfo.packageName : null;
                if (str != null) {
                    f8224a = new dck(context, str);
                }
                if (f8224a == null) {
                    dck dck = new dck(null, null);
                    f8224a = dck;
                    dck.f8228e.f8242G = true;
                }
            }
        }
        return f8224a;
    }

    /* renamed from: b */
    public final String mo4093b(Context context) {
        if ("sources".equals(this.f8228e.f8277l)) {
            return context.getString(R.string.inputs_panel_label_sources);
        }
        return context.getString(R.string.inputs_panel_label_inputs);
    }

    /* renamed from: a */
    public final void mo4091a(dcj dcj) {
        this.f8228e.f8244I.add(dcj);
    }

    /* renamed from: b */
    public final void mo4094b(dcj dcj) {
        this.f8228e.f8244I.remove(dcj);
    }
}
