package p000;

import android.text.TextUtils;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: yr */
/* compiled from: PG */
public final class C0668yr {

    /* renamed from: a */
    public String f10829a;

    /* renamed from: b */
    private final boolean f10830b;

    /* renamed from: c */
    private int f10831c;

    /* renamed from: d */
    private int f10832d;

    public C0668yr(boolean z) {
        this.f10830b = z;
    }

    /* renamed from: a */
    public final C0671yu mo6135a() {
        if (!TextUtils.isEmpty(this.f10829a)) {
            return new C0671yu(new ThreadPoolExecutor(this.f10831c, this.f10832d, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C0670yt(this.f10829a, this.f10830b)));
        }
        String valueOf = String.valueOf(this.f10829a);
        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Name must be non-null and non-empty, but given: ") : "Name must be non-null and non-empty, but given: ".concat(valueOf));
    }

    /* renamed from: a */
    public final void mo6136a(int i) {
        this.f10831c = i;
        this.f10832d = i;
    }
}
