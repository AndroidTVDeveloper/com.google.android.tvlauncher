package p000;

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

/* renamed from: cjz */
/* compiled from: PG */
public final class cjz implements Runnable {

    /* renamed from: j */
    public static /* synthetic */ int f5765j;

    /* renamed from: k */
    private static final int f5766k;

    /* renamed from: l */
    private static final int f5767l;

    /* renamed from: m */
    private static final int f5768m = Math.max(f5766k - 1, 1);

    /* renamed from: n */
    private static final Object f5769n = new Object();

    /* renamed from: o */
    private static final BlockingQueue f5770o = new LinkedBlockingQueue(256);

    /* renamed from: p */
    private static final Executor f5771p;

    /* renamed from: q */
    private static final Executor f5772q;

    /* renamed from: r */
    private static final cjy f5773r = new cjy();

    /* renamed from: s */
    private static cjz f5774s;

    /* renamed from: t */
    private static int f5775t = 0;

    /* renamed from: a */
    public volatile boolean f5776a;

    /* renamed from: b */
    public volatile long f5777b;

    /* renamed from: c */
    public volatile cjx f5778c;

    /* renamed from: d */
    public volatile String[] f5779d;

    /* renamed from: e */
    public volatile String f5780e;

    /* renamed from: f */
    public volatile String f5781f;

    /* renamed from: g */
    public volatile Object f5782g;

    /* renamed from: h */
    public volatile Cursor f5783h;

    /* renamed from: i */
    public volatile Object f5784i;

    /* renamed from: u */
    private cjz f5785u;

    /* renamed from: v */
    private boolean f5786v;

    /* renamed from: w */
    private volatile ContentResolver f5787w;

    /* renamed from: x */
    private volatile Uri f5788x;

    /* renamed from: y */
    private volatile String[] f5789y;

    /* renamed from: z */
    private volatile String[] f5790z;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f5766k = availableProcessors;
        f5767l = Math.min(availableProcessors - 1, 2);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f5767l, f5768m, 5, TimeUnit.SECONDS, f5770o);
        f5771p = threadPoolExecutor;
        f5772q = threadPoolExecutor;
    }

    private cjz(Context context) {
        this.f5787w = context.getContentResolver();
    }

    /* renamed from: c */
    public final void mo2951c() {
        this.f5776a = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo2950b() {
        if (this.f5786v) {
            throw new IllegalStateException("Can't execute after been recycled. Use DataLoadingBackgroundTask.obtain(Context) to get a new task");
        } else if (this.f5778c == null) {
            throw new IllegalArgumentException("Callbacks must not be null");
        } else if (this.f5788x != null) {
            try {
                f5772q.execute(this);
            } catch (RejectedExecutionException e) {
                this.f5778c.mo2942a(this, e);
                mo2946a();
            }
        } else {
            throw new IllegalArgumentException("Uri must not be null");
        }
    }

    /* renamed from: a */
    static cjz m4941a(Context context) {
        synchronized (f5769n) {
            if (f5774s == null) {
                return new cjz(context.getApplicationContext());
            }
            cjz cjz = f5774s;
            f5774s = cjz.f5785u;
            cjz.f5785u = null;
            cjz.f5786v = false;
            f5775t--;
            return cjz;
        }
    }

    /* renamed from: d */
    private final void m4942d() {
        f5773r.obtainMessage(0, this).sendToTarget();
    }

    /* renamed from: a */
    public final void mo2946a() {
        synchronized (f5769n) {
            if (f5775t < 15 && f5774s != this && this.f5785u == null) {
                this.f5776a = false;
                this.f5777b = 0;
                this.f5778c = null;
                this.f5788x = null;
                this.f5779d = null;
                this.f5780e = null;
                this.f5789y = null;
                this.f5781f = null;
                this.f5782g = null;
                this.f5783h = null;
                this.f5784i = null;
                this.f5785u = f5774s;
                f5774s = this;
                f5775t++;
            }
            this.f5786v = true;
        }
    }

    public final void run() {
        Process.setThreadPriority(10);
        if (!this.f5776a) {
            try {
                this.f5783h = this.f5787w.query(this.f5788x, this.f5779d, this.f5780e, this.f5789y, this.f5781f);
                if (this.f5783h != null) {
                    this.f5783h.getCount();
                }
                Binder.flushPendingCommands();
                if (!this.f5776a) {
                    this.f5778c.mo2941a(this);
                    m4942d();
                    return;
                }
                m4942d();
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing ContentResolver query", th);
            }
        } else {
            m4942d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2948a(cjx cjx) {
        if (cjx != null) {
            this.f5778c = cjx;
            return;
        }
        throw new IllegalArgumentException("Callbacks must not be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2949a(String str) {
        if (this.f5790z == null) {
            this.f5790z = new String[1];
        }
        this.f5790z[0] = str;
        this.f5789y = this.f5790z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2947a(Uri uri) {
        if (uri != null) {
            this.f5788x = uri;
            return;
        }
        throw new IllegalArgumentException("Uri must not be null");
    }

    public final String toString() {
        long j = this.f5777b;
        String valueOf = String.valueOf(this.f5788x);
        String str = this.f5780e;
        String arrays = Arrays.toString(this.f5789y);
        String str2 = this.f5781f;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 101 + length2 + String.valueOf(arrays).length() + String.valueOf(str2).length());
        sb.append("DataLoadingBackgroundTask{tag=");
        sb.append(j);
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
