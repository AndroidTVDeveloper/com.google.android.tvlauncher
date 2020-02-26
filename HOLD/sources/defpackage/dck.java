package defpackage;

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

/* renamed from: dck  reason: default package */
/* compiled from: PG */
public final class dck {
    public static dck a;
    public static final Object b = new Object();
    public String c;
    public Context d;
    public final dcn e;
    public final List f = new ArrayList(1);

    private dck(Context context, String str) {
        Context context2;
        int i;
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.d = context2;
        this.c = str;
        if (context2 != null) {
            i = dcr.b(context2, str);
        } else {
            i = -1;
        }
        this.e = new dcn(this.d, i);
        if (this.d != null) {
            a(dcg.a);
            if (dhz.a(this.d)) {
                Context context3 = this.d;
                JobScheduler jobScheduler = (JobScheduler) context3.getSystemService(JobScheduler.class);
                if (jobScheduler != null) {
                    jobScheduler.schedule(new JobInfo.Builder(2, new ComponentName(context3, NotifyRefreshOemConfigurationDataJobService.class)).addTriggerContentUri(new JobInfo.TriggerContentUri(dem.a, 1)).build());
                }
            }
        }
    }

    public static boolean m() {
        return true;
    }

    public final boolean a() {
        dcn dcn = this.e;
        return dcn.G && !dcn.H;
    }

    public final boolean b() {
        return this.e.m;
    }

    public final boolean c() {
        return this.e.f;
    }

    public final boolean d() {
        return this.e.h;
    }

    public final String e() {
        return this.e.e;
    }

    public final String f() {
        return this.e.g;
    }

    public final Uri g() {
        return this.e.d;
    }

    public final dch h() {
        return this.e.A;
    }

    public final boolean i() {
        return this.e.o;
    }

    public final String j() {
        return this.e.p;
    }

    /* access modifiers changed from: package-private */
    public final String k() {
        return this.e.E;
    }

    public final String l() {
        return this.e.F;
    }

    public final void a(dci dci) {
        if (dci != null) {
            this.f.add(dci);
        }
    }

    public static dck a(Context context) {
        ResolveInfo resolveInfo;
        synchronized (b) {
            if (a == null) {
                List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(new Intent("com.google.android.tvlauncher.action.PARTNER_CONFIGURATION"), 0);
                if (queryBroadcastReceivers == null) {
                    resolveInfo = null;
                } else {
                    resolveInfo = null;
                    for (ResolveInfo next : queryBroadcastReceivers) {
                        if (dej.a(next)) {
                            resolveInfo = next;
                        }
                    }
                }
                String str = resolveInfo != null ? resolveInfo.activityInfo.packageName : null;
                if (str != null) {
                    a = new dck(context, str);
                }
                if (a == null) {
                    dck dck = new dck(null, null);
                    a = dck;
                    dck.e.G = true;
                }
            }
        }
        return a;
    }

    public final String b(Context context) {
        if ("sources".equals(this.e.l)) {
            return context.getString(R.string.inputs_panel_label_sources);
        }
        return context.getString(R.string.inputs_panel_label_inputs);
    }

    public final void a(dcj dcj) {
        this.e.I.add(dcj);
    }

    public final void b(dcj dcj) {
        this.e.I.remove(dcj);
    }
}
