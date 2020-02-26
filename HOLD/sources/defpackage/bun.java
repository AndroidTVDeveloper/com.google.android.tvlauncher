package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* renamed from: bun  reason: default package */
/* compiled from: PG */
public final class bun {
    public final Context a;

    public bun(Context context) {
        this.a = context;
    }

    public final ApplicationInfo a(String str, int i) {
        return this.a.getPackageManager().getApplicationInfo(str, i);
    }
}
