package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;

/* renamed from: kw  reason: default package */
/* compiled from: PG */
public final class kw extends ContextWrapper {
    public static Context a(Context context) {
        if (!(context instanceof kw) && !(context.getResources() instanceof ky) && !(context.getResources() instanceof lj)) {
            int i = Build.VERSION.SDK_INT;
        }
        return context;
    }

    public final AssetManager getAssets() {
        throw null;
    }

    public final Resources getResources() {
        throw null;
    }

    public final Resources.Theme getTheme() {
        throw null;
    }

    public final void setTheme(int i) {
        throw null;
    }
}
