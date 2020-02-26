package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* renamed from: bun */
/* compiled from: PG */
public final class bun {

    /* renamed from: a */
    public final Context f4854a;

    public bun(Context context) {
        this.f4854a = context;
    }

    /* renamed from: a */
    public final ApplicationInfo mo2453a(String str, int i) {
        return this.f4854a.getPackageManager().getApplicationInfo(str, i);
    }
}
