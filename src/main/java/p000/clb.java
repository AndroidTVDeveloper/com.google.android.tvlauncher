package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;

/* renamed from: clb */
/* compiled from: PG */
public final class clb extends cjw {
    public clb(Context context) {
        super(context, cts.f7417a);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2936a() {
        Cursor query;
        this.f5762a = null;
        try {
            query = getContext().getContentResolver().query(cts.f7417a, null, null, null, null);
            if (query != null) {
                if (query.moveToFirst()) {
                    String string = query.getString(0);
                    if (!TextUtils.isEmpty(string)) {
                        try {
                            Resources resourcesForApplication = getContext().getPackageManager().getResourcesForApplication("com.google.android.katniss");
                            this.f5762a = resourcesForApplication.getDrawable(resourcesForApplication.getIdentifier(string, "drawable", "com.google.android.katniss"), null);
                        } catch (PackageManager.NameNotFoundException e) {
                        }
                    }
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (Exception e2) {
            Log.e("TvSearchIconLdr", "Exception in loadInBackground()", e2);
        } catch (Throwable th) {
            dhr.m6455a(th, th);
        }
        return (Drawable) this.f5762a;
        throw th;
    }
}
