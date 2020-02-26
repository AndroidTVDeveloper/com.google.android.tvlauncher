package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Process;
import java.util.Arrays;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: cjz  reason: default package */
/* compiled from: PG */
public final class cjz implements Runnable {
    public static /* synthetic */ int j;
    private static final int k;
    private static final int l;
    private static final int m = Math.max(k - 1, 1);
    private static final Object n = new Object();
    private static final BlockingQueue o = new LinkedBlockingQueue(256);
    private static final Executor p;
    private static final Executor q;
    private static final cjy r = new cjy();
    private static cjz s;
    private static int t = 0;
    public volatile boolean a;
    public volatile long b;
    public volatile cjx c;
    public volatile String[] d;
    public volatile String e;
    public volatile String f;
    public volatile Object g;
    public volatile Cursor h;
    public volatile Object i;
    private cjz u;
    private boolean v;
    private volatile ContentResolver w;
    private volatile Uri x;
    private volatile String[] y;
    private volatile String[] z;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        k = availableProcessors;
        l = Math.min(availableProcessors - 1, 2);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(l, m, 5, TimeUnit.SECONDS, o);
        p = threadPoolExecutor;
        q = threadPoolExecutor;
    }

    private cjz(Context context) {
        this.w = context.getContentResolver();
    }

    public final void c() {
        this.a = true;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (this.v) {
            throw new IllegalStateException("Can't execute after been recycled. Use DataLoadingBackgroundTask.obtain(Context) to get a new task");
        } else if (this.c == null) {
            throw new IllegalArgumentException("Callbacks must not be null");
        } else if (this.x != null) {
            try {
                q.execute(this);
            } catch (RejectedExecutionException e2) {
                this.c.a(this, e2);
                a();
            }
        } else {
            throw new IllegalArgumentException("Uri must not be null");
        }
    }

    static cjz a(Context context) {
        synchronized (n) {
            if (s == null) {
                return new cjz(context.getApplicationContext());
            }
            cjz cjz = s;
            s = cjz.u;
            cjz.u = null;
            cjz.v = false;
            t--;
            return cjz;
        }
    }

    private final void d() {
        r.obtainMessage(0, this).sendToTarget();
    }

    public final void a() {
        synchronized (n) {
            if (t < 15 && s != this && this.u == null) {
                this.a = false;
                this.b = 0;
                this.c = null;
                this.x = null;
                this.d = null;
                this.e = null;
                this.y = null;
                this.f = null;
                this.g = null;
                this.h = null;
                this.i = null;
                this.u = s;
                s = this;
                t++;
            }
            this.v = true;
        }
    }

    public final void run() {
        Process.setThreadPriority(10);
        if (!this.a) {
            try {
                this.h = this.w.query(this.x, this.d, this.e, this.y, this.f);
                if (this.h != null) {
                    this.h.getCount();
                }
                Binder.flushPendingCommands();
                if (!this.a) {
                    this.c.a(this);
                    d();
                    return;
                }
                d();
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing ContentResolver query", th);
            }
        } else {
            d();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(cjx cjx) {
        if (cjx != null) {
            this.c = cjx;
            return;
        }
        throw new IllegalArgumentException("Callbacks must not be null");
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        if (this.z == null) {
            this.z = new String[1];
        }
        this.z[0] = str;
        this.y = this.z;
    }

    /* access modifiers changed from: package-private */
    public final void a(Uri uri) {
        if (uri != null) {
            this.x = uri;
            return;
        }
        throw new IllegalArgumentException("Uri must not be null");
    }

    public final String toString() {
        long j2 = this.b;
        String valueOf = String.valueOf(this.x);
        String str = this.e;
        String arrays = Arrays.toString(this.y);
        String str2 = this.f;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 101 + length2 + String.valueOf(arrays).length() + String.valueOf(str2).length());
        sb.append("DataLoadingBackgroundTask{tag=");
        sb.append(j2);
        sb.append(", uri=");
        sb.append(valueOf);
        sb.append(", selection='");
        sb.append(str);
        sb.append("', selectionArgs=");
        sb.append(arrays);
        sb.append(", sortOrder='");
        sb.append(str2);
        sb.append("'}");
        return sb.toString();
    }
}
