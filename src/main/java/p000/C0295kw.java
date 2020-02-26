package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;

/* renamed from: kw */
/* compiled from: PG */
public final class C0295kw extends ContextWrapper {
    /* renamed from: a */
    public static Context m7862a(Context context) {
        if (!(context instanceof C0295kw) && !(context.getResources() instanceof C0297ky) && !(context.getResources() instanceof C0309lj)) {
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
