package p000;

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

/* renamed from: ciu */
/* compiled from: PG */
final class ciu extends AsyncTask {

    /* renamed from: a */
    private final /* synthetic */ cja f5667a;

    public ciu(cja cja) {
        this.f5667a = cja;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        if (isCancelled()) {
            return null;
        }
        cja cja = this.f5667a;
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LEANBACK_LAUNCHER");
        List<ResolveInfo> queryIntentActivities = cja.f5679a.getPackageManager().queryIntentActivities(intent, 129);
        HashSet hashSet = new HashSet();
        boolean a = czw.m6037a(this.f5667a.f5679a).mo4020a();
        if (queryIntentActivities == null) {
            return hashSet;
        }
        for (int i = 0; i < queryIntentActivities.size() && !isCancelled(); i++) {
            ResolveInfo resolveInfo = queryIntentActivities.get(i);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (activityInfo != null && (!a || !"com.android.vending".equals(activityInfo.packageName))) {
                cja cja2 = this.f5667a;
                hashSet.add(cja2.mo2882a(cja2.f5679a, resolveInfo));
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Set<chn> set = (Set) obj;
        for (dby dby : cim.m4816a(this.f5667a.f5679a).f5650c.values()) {
            if (isCancelled()) {
                break;
            }
            set.add(cja.m4847a(dby));
        }
        this.f5667a.f5687i.clear();
        for (chn e : set) {
            this.f5667a.mo2898e(e);
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f5667a.f5679a);
        boolean z = defaultSharedPreferences.getBoolean("key_save_launch_item_order", true);
        if (z) {
            defaultSharedPreferences.edit().putBoolean("key_save_launch_item_order", false).apply();
        }
        cja cja = this.f5667a;
        cja.f5680b.mo2909a(cja.f5687i);
        if (z) {
            cja cja2 = this.f5667a;
            cja2.f5680b.mo2911b(cja2.mo2895d());
            ((JobScheduler) this.f5667a.f5679a.getSystemService(JobScheduler.class)).schedule(new JobInfo.Builder(1, new ComponentName(this.f5667a.f5679a, StopOutOfBoxOrderingJobService.class)).setPeriodic(172800000, 8640000).setPersisted(true).build());
        }
        cja cja3 = this.f5667a;
        cja3.f5681c = true;
        for (cit d : cja3.f5686h) {
            d.mo2801d();
        }
        this.f5667a.f5683e = null;
    }
}
