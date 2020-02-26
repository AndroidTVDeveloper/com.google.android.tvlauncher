package defpackage;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.View;

/* renamed from: dbq  reason: default package */
/* compiled from: PG */
public final class dbq {
    private static cja a;

    public static cja a(Context context) {
        if (a == null) {
            a = new cja(context.getApplicationContext());
        }
        return a;
    }

    public static ny a(int i) {
        return a(i, (Integer) null);
    }

    public static ny a(int i, Integer num) {
        nx nxVar = new nx();
        nxVar.b = i;
        nxVar.a(50.0f);
        if (num != null) {
            nxVar.a = num.intValue();
        }
        ny nyVar = new ny();
        nyVar.a = new nx[]{nxVar};
        return nyVar;
    }

    public static void a(Intent intent, View view) {
        intent.addFlags(268435456);
        int measuredWidth = view.getMeasuredWidth();
        float scaleX = view.getScaleX();
        int measuredHeight = view.getMeasuredHeight();
        float scaleY = view.getScaleY();
        int i = Build.VERSION.SDK_INT;
        view.getContext().startActivity(intent, new aa(ActivityOptions.makeClipRevealAnimation(view, 0, 0, (int) (((float) measuredWidth) * scaleX), (int) (((float) measuredHeight) * scaleY))).a.toBundle());
    }
}
