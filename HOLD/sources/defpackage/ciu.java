package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import com.google.android.tvlauncher.appsview.data.StopOutOfBoxOrderingJobService;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: ciu  reason: default package */
/* compiled from: PG */
final class ciu extends AsyncTask {
    private final /* synthetic */ cja a;

    public ciu(cja cja) {
        this.a = cja;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        if (isCancelled()) {
            return null;
        }
        cja cja = this.a;
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LEANBACK_LAUNCHER");
        List<ResolveInfo> queryIntentActivities = cja.a.getPackageManager().queryIntentActivities(intent, 129);
        HashSet hashSet = new HashSet();
        boolean a2 = czw.a(this.a.a).a();
        if (queryIntentActivities == null) {
            return hashSet;
        }
        for (int i = 0; i < queryIntentActivities.size() && !isCancelled(); i++) {
            ResolveInfo resolveInfo = queryIntentActivities.get(i);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (activityInfo != null && (!a2 || !"com.android.vending".equals(activityInfo.packageName))) {
                cja cja2 = this.a;
                hashSet.add(cja2.a(cja2.a, resolveInfo));
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Set<chn> set = (Set) obj;
        for (dby dby : cim.a(this.a.a).c.values()) {
            if (isCancelled()) {
                break;
            }
            set.add(cja.a(dby));
        }
        this.a.i.clear();
        for (chn e : set) {
            this.a.e(e);
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.a.a);
        boolean z = defaultSharedPreferences.getBoolean("key_save_launch_item_order", true);
        if (z) {
            defaultSharedPreferences.edit().putBoolean("key_save_launch_item_order", false).apply();
        }
        cja cja = this.a;
        cja.b.a(cja.i);
        if (z) {
            cja cja2 = this.a;
            cja2.b.b(cja2.d());
            ((JobScheduler) this.a.a.getSystemService(JobScheduler.class)).schedule(new JobInfo.Builder(1, new ComponentName(this.a.a, StopOutOfBoxOrderingJobService.class)).setPeriodic(172800000, 8640000).setPersisted(true).build());
        }
        cja cja3 = this.a;
        cja3.c = true;
        for (cit d : cja3.h) {
            d.d();
        }
        this.a.e = null;
    }
}
