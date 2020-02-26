package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.view.View;
import com.google.android.tvlauncher.notifications.NotificationsSidePanelActivity;
import java.util.List;

/* renamed from: cyk */
/* compiled from: PG */
public final /* synthetic */ class cyk implements View.OnClickListener {

    /* renamed from: a */
    private final cyl f7917a;

    public cyk(cyl cyl) {
        this.f7917a = cyl;
    }

    public final void onClick(View view) {
        cyl cyl = this.f7917a;
        cfs cfs = new cfs(0, (byte) 0);
        cfs.mo2729b(dhs.f8556t);
        dja f = cfs.mo2733f();
        int i = cyl.f7921d;
        if (f.f8673b) {
            f.mo4505b();
            f.f8673b = false;
        }
        dmv dmv = (dmv) f.f8672a;
        dmv dmv2 = dmv.f8875f;
        int i2 = dmv.f8876a | 1;
        dmv.f8876a = i2;
        dmv.f8877b = i;
        boolean z = cyl.f7922e;
        dmv.f8876a = i2 | 4;
        dmv.f8879d = !z;
        cyl.f7919b.mo2714a(cfs);
        Context context = cyl.f7918a;
        Intent intent = new Intent("com.android.tv.action.OPEN_NOTIFICATIONS_PANEL");
        intent.setPackage("com.google.android.tvrecommendations");
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
            context.startActivity(new Intent(context, NotificationsSidePanelActivity.class));
        } else {
            context.startActivity(intent);
        }
        cyl.f7920c.mo3443a(true);
    }
}
