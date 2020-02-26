package p000;

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

/* renamed from: ckl */
/* compiled from: PG */
public final class ckl extends AsyncTaskLoader {

    /* renamed from: a */
    private final C0512sx f5818a;

    /* renamed from: b */
    private final Uri f5819b;

    /* renamed from: c */
    private ContentObserver f5820c = null;

    /* renamed from: d */
    private ddw f5821d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ckl(Context context) {
        super(context);
        C0512sx c = C0497si.m8296c(context);
        Uri uri = null;
        this.f5818a = c;
        dck a = dck.m6123a(context);
        String l = a.mo4105l();
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(dem.m6259d(l), 0);
        if (resolveContentProvider != null) {
            String str = resolveContentProvider.packageName;
            if (l != null) {
                if (!TextUtils.equals(str, l)) {
                    Log.e("PrtnrWidgetInfoLdr", String.format("Content provider configured with package name (%s) but different content provider was found (%s)", l, str));
                    l = null;
                }
            } else if (!dej.m6249a(context, str)) {
                Log.w("PrtnrWidgetInfoLdr", String.format("Invalid content provider for OEM widget found: %s", str));
                l = null;
            }
            l = str;
        } else if (!TextUtils.isEmpty(l)) {
            Log.w("PrtnrWidgetInfoLdr", String.format("Content provider with authority %s not found", dem.m6259d(l)));
        } else {
            Log.w("PrtnrWidgetInfoLdr", "No content provider for OEM widget found");
            l = null;
        }
        this.f5819b = l != null ? dem.m6258c(a.mo4105l()) : uri;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        Cursor query;
        Uri uri = null;
        if (this.f5819b == null) {
            return null;
        }
        this.f5821d = null;
        Context context = getContext();
        try {
            query = context.getContentResolver().query(this.f5819b, ddw.f8350a, null, null, null);
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
                        C0509su e = this.f5818a.mo5950e();
                        e.mo5939a(uri);
                        C0509su a = e.mo202b(agj.m344b(C0594vy.f10649a));
                        agp agp = new agp(dimensionPixelSize, dimensionPixelSize);
                        Drawable drawable = (Drawable) ((agl) a.mo5935a(agp, agp, a, ahx.f388b)).get();
                        if (drawable != null) {
                            this.f5821d = new ddw(drawable, string2, string3);
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
            dhr.m6455a(th, th);
        }
        return this.f5821d;
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        cancelLoad();
        this.f5821d = null;
        if (this.f5820c != null) {
            getContext().getContentResolver().unregisterContentObserver(this.f5820c);
            this.f5820c = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        if (this.f5819b != null) {
            ddw ddw = this.f5821d;
            if (ddw != null) {
                deliverResult(ddw);
            }
            if (this.f5820c == null) {
                this.f5820c = new ckk(this, new Handler());
                try {
                    getContext().getContentResolver().registerContentObserver(this.f5819b, true, this.f5820c);
                } catch (SecurityException e) {
                    String.format("Failed to register content observer for URI: %s.\nReason: %s", this.f5819b, e.getMessage());
                    this.f5820c = null;
                }
            }
            if (takeContentChanged() || this.f5821d == null) {
                forceLoad();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onStopLoading() {
        cancelLoad();
    }
}
