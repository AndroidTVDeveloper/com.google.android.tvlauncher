package p000;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: cjw */
/* compiled from: PG */
public abstract class cjw extends AsyncTaskLoader {

    /* renamed from: a */
    public Object f5762a;

    /* renamed from: b */
    private final Uri f5763b;

    /* renamed from: c */
    private ContentObserver f5764c;

    public cjw(Context context, Uri uri) {
        super(context);
        this.f5763b = uri;
    }

    /* renamed from: a */
    public abstract Object mo2936a();

    public final Object loadInBackground() {
        return mo2936a();
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        cancelLoad();
        this.f5762a = null;
        if (this.f5764c != null) {
            getContext().getContentResolver().unregisterContentObserver(this.f5764c);
            this.f5764c = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        Object obj = this.f5762a;
        if (obj != null) {
            deliverResult(obj);
        }
        if (this.f5764c == null && this.f5763b != null) {
            this.f5764c = new cjv(this, new Handler());
            try {
                getContext().getContentResolver().registerContentObserver(this.f5763b, true, this.f5764c);
            } catch (SecurityException e) {
                String valueOf = String.valueOf(this.f5763b);
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55 + String.valueOf(message).length());
                sb.append("Failed to register content observer for URI: ");
                sb.append(valueOf);
                sb.append(".\nReason: ");
                sb.append(message);
                sb.toString();
                this.f5764c = null;
            }
        }
        if (takeContentChanged() || this.f5762a == null) {
            forceLoad();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStopLoading() {
        cancelLoad();
    }
}
