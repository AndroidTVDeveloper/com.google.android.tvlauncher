package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;

/* renamed from: clb  reason: default package */
/* compiled from: PG */
public final class clb extends cjw {
    public clb(Context context) {
        super(context, cts.a);
    }

    public final /* bridge */ /* synthetic */ Object a() {
        Cursor query;
        this.a = null;
        try {
            query = getContext().getContentResolver().query(cts.a, null, null, null, null);
            if (query != null) {
                if (query.moveToFirst()) {
                    String string = query.getString(0);
                    if (!TextUtils.isEmpty(string)) {
                        try {
                            Resources resourcesForApplication = getContext().getPackageManager().getResourcesForApplication("com.google.android.katniss");
                            this.a = resourcesForApplication.getDrawable(resourcesForApplication.getIdentifier(string, "drawable", "com.google.android.katniss"), null);
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
            dhr.a(th, th);
        }
        return (Drawable) this.a;
        throw th;
    }
}
