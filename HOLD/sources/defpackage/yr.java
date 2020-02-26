package defpackage;

import android.text.TextUtils;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: yr  reason: default package */
/* compiled from: PG */
public final class yr {
    public String a;
    private final boolean b;
    private int c;
    private int d;

    public yr(boolean z) {
        this.b = z;
    }

    public final yu a() {
        if (!TextUtils.isEmpty(this.a)) {
            return new yu(new ThreadPoolExecutor(this.c, this.d, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new yt(this.a, this.b)));
        }
        String valueOf = String.valueOf(this.a);
        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Name must be non-null and non-empty, but given: ") : "Name must be non-null and non-empty, but given: ".concat(valueOf));
    }

    public final void a(int i) {
        this.c = i;
        this.d = i;
    }
}
