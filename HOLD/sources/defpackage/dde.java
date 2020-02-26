package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.view.View;
import com.google.android.tvlauncher.view.HomeTopRowView;

/* renamed from: dde  reason: default package */
/* compiled from: PG */
public final /* synthetic */ class dde implements View.OnClickListener {
    private final HomeTopRowView a;

    public dde(HomeTopRowView homeTopRowView) {
        this.a = homeTopRowView;
    }

    public final void onClick(View view) {
        Intent intent;
        HomeTopRowView homeTopRowView = this.a;
        ResolveInfo b = czw.a(homeTopRowView.getContext()).b();
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
            homeTopRowView.a.startActivity(intent);
        }
    }
}
