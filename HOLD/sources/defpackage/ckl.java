package defpackage;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.ContentObserver;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.tvlauncher.R;

/* renamed from: ckl  reason: default package */
/* compiled from: PG */
public final class ckl extends AsyncTaskLoader {
    private final sx a;
    private final Uri b;
    private ContentObserver c = null;
    private ddw d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ckl(Context context) {
        super(context);
        sx c2 = si.c(context);
        Uri uri = null;
        this.a = c2;
        dck a2 = dck.a(context);
        String l = a2.l();
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(dem.d(l), 0);
        if (resolveContentProvider != null) {
            String str = resolveContentProvider.packageName;
            if (l != null) {
                if (!TextUtils.equals(str, l)) {
                    Log.e("PrtnrWidgetInfoLdr", String.format("Content provider configured with package name (%s) but different content provider was found (%s)", l, str));
                    l = null;
                }
            } else if (!dej.a(context, str)) {
                Log.w("PrtnrWidgetInfoLdr", String.format("Invalid content provider for OEM widget found: %s", str));
                l = null;
            }
            l = str;
        } else if (!TextUtils.isEmpty(l)) {
            Log.w("PrtnrWidgetInfoLdr", String.format("Content provider with authority %s not found", dem.d(l)));
        } else {
            Log.w("PrtnrWidgetInfoLdr", "No content provider for OEM widget found");
            l = null;
        }
        this.b = l != null ? dem.c(a2.l()) : uri;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        Cursor query;
        Uri uri = null;
        if (this.b == null) {
            return null;
        }
        this.d = null;
        Context context = getContext();
        try {
            query = context.getContentResolver().query(this.b, ddw.a, null, null, null);
            if (query != null) {
                if (query.moveToFirst()) {
                    String string = query.getString(0);
                    String string2 = query.getString(1);
                    String string3 = query.getString(2);
                    if (!TextUtils.isEmpty(string)) {
                        uri = Uri.parse(string);
                    }
                    int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.top_row_button_icon_size);
                    if (uri != null) {
                        su e = this.a.e();
                        e.a(uri);
                        su a2 = e.b(agj.b(vy.a));
                        agp agp = new agp(dimensionPixelSize, dimensionPixelSize);
                        Drawable drawable = (Drawable) ((agl) a2.a(agp, agp, a2, ahx.b)).get();
                        if (drawable != null) {
                            this.d = new ddw(drawable, string2, string3);
                        }
                    }
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (Exception e2) {
            Log.e("PrtnrWidgetInfoLdr", "Exception in loadInBackground()", e2);
        } catch (Throwable th) {
            dhr.a(th, th);
        }
        return this.d;
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        cancelLoad();
        this.d = null;
        if (this.c != null) {
            getContext().getContentResolver().unregisterContentObserver(this.c);
            this.c = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        if (this.b != null) {
            ddw ddw = this.d;
            if (ddw != null) {
                deliverResult(ddw);
            }
            if (this.c == null) {
                this.c = new ckk(this, new Handler());
                try {
                    getContext().getContentResolver().registerContentObserver(this.b, true, this.c);
                } catch (SecurityException e) {
                    String.format("Failed to register content observer for URI: %s.\nReason: %s", this.b, e.getMessage());
                    this.c = null;
                }
            }
            if (takeContentChanged() || this.d == null) {
                forceLoad();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onStopLoading() {
        cancelLoad();
    }
}
