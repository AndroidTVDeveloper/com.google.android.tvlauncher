package p000;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.View;

/* renamed from: dbq */
/* compiled from: PG */
public final class dbq {

    /* renamed from: a */
    private static cja f8165a;

    /* renamed from: a */
    public static cja m6093a(Context context) {
        if (f8165a == null) {
            f8165a = new cja(context.getApplicationContext());
        }
        return f8165a;
    }

    /* renamed from: a */
    public static C0378ny m6094a(int i) {
        return m6095a(i, (Integer) null);
    }

    /* renamed from: a */
    public static C0378ny m6095a(int i, Integer num) {
        C0377nx nxVar = new C0377nx();
        nxVar.f10064b = i;
        nxVar.mo5689a(50.0f);
        if (num != null) {
            nxVar.f10063a = num.intValue();
        }
        C0378ny nyVar = new C0378ny();
        nyVar.f10066a = new C0377nx[]{nxVar};
        return nyVar;
    }

    /* renamed from: a */
    public static void m6096a(Intent intent, View view) {
        intent.addFlags(268435456);
        int measuredWidth = view.getMeasuredWidth();
        float scaleX = view.getScaleX();
        int measuredHeight = view.getMeasuredHeight();
        float scaleY = view.getScaleY();
        int i = Build.VERSION.SDK_INT;
        view.getContext().startActivity(intent, new C0000aa(ActivityOptions.makeClipRevealAnimation(view, 0, 0, (int) (((float) measuredWidth) * scaleX), (int) (((float) measuredHeight) * scaleY))).f1a.toBundle());
    }
}
