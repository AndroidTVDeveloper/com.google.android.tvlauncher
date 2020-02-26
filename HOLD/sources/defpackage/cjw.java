package defpackage;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: cjw  reason: default package */
/* compiled from: PG */
public abstract class cjw extends AsyncTaskLoader {
    public Object a;
    private final Uri b;
    private ContentObserver c;

    public cjw(Context context, Uri uri) {
        super(context);
        this.b = uri;
    }

    public abstract Object a();

    public final Object loadInBackground() {
        return a();
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        cancelLoad();
        this.a = null;
        if (this.c != null) {
            getContext().getContentResolver().unregisterContentObserver(this.c);
            this.c = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        Object obj = this.a;
        if (obj != null) {
            deliverResult(obj);
        }
        if (this.c == null && this.b != null) {
            this.c = new cjv(this, new Handler());
            try {
                getContext().getContentResolver().registerContentObserver(this.b, true, this.c);
            } catch (SecurityException e) {
                String valueOf = String.valueOf(this.b);
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55 + String.valueOf(message).length());
                sb.append("Failed to register content observer for URI: ");
                sb.append(valueOf);
                sb.append(".\nReason: ");
                sb.append(message);
                sb.toString();
                this.c = null;
            }
        }
        if (takeContentChanged() || this.a == null) {
            forceLoad();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStopLoading() {
        cancelLoad();
    }
}
