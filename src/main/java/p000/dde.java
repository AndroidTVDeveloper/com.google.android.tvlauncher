package p000;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.view.View;
import com.google.android.tvlauncher.view.HomeTopRowView;

/* renamed from: dde */
/* compiled from: PG */
public final /* synthetic */ class dde implements View.OnClickListener {

    /* renamed from: a */
    private final HomeTopRowView f8333a;

    public dde(HomeTopRowView homeTopRowView) {
        this.f8333a = homeTopRowView;
    }

    public final void onClick(View view) {
        Intent intent;
        HomeTopRowView homeTopRowView = this.f8333a;
        ResolveInfo b = czw.m6037a(homeTopRowView.getContext()).mo4021b();
        if (b != null) {
            ComponentName componentName = new ComponentName(b.activityInfo.applicationInfo.packageName, b.activityInfo.name);
            intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setComponent(componentName);
            intent.addFlags(270565376);
        } else {
            intent = null;
        }
        if (intent != null) {
            homeTopRowView.f6698a.startActivity(intent);
        }
    }
}
