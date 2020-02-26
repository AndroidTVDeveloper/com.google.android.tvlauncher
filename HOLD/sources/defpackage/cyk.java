package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.view.View;
import com.google.android.tvlauncher.notifications.NotificationsSidePanelActivity;
import java.util.List;

/* renamed from: cyk  reason: default package */
/* compiled from: PG */
public final /* synthetic */ class cyk implements View.OnClickListener {
    private final cyl a;

    public cyk(cyl cyl) {
        this.a = cyl;
    }

    public final void onClick(View view) {
        cyl cyl = this.a;
        cfs cfs = new cfs(0, (byte) 0);
        cfs.b(dhs.t);
        dja f = cfs.f();
        int i = cyl.d;
        if (f.b) {
            f.b();
            f.b = false;
        }
        dmv dmv = (dmv) f.a;
        dmv dmv2 = dmv.f;
        int i2 = dmv.a | 1;
        dmv.a = i2;
        dmv.b = i;
        boolean z = cyl.e;
        dmv.a = i2 | 4;
        dmv.d = !z;
        cyl.b.a(cfs);
        Context context = cyl.a;
        Intent intent = new Intent("com.android.tv.action.OPEN_NOTIFICATIONS_PANEL");
        intent.setPackage("com.google.android.tvrecommendations");
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
            context.startActivity(new Intent(context, NotificationsSidePanelActivity.class));
        } else {
            context.startActivity(intent);
        }
        cyl.c.a(true);
    }
}
