package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: bic */
/* compiled from: PG */
final class bic extends BroadcastReceiver {

    /* renamed from: a */
    private static bic f4020a;

    /* renamed from: b */
    private final Handler f4021b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private final ArrayList f4022c = new ArrayList();

    private bic() {
    }

    /* renamed from: a */
    public static synchronized bic m3307a(Context context) {
        bic bic;
        synchronized (bic.class) {
            if (f4020a == null) {
                f4020a = new bic();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(f4020a, intentFilter);
            }
            bic = f4020a;
        }
        return bic;
    }

    public final synchronized void onReceive(Context context, Intent intent) {
        if (!isInitialStickyBroadcast()) {
            m3308a();
            for (int i = 0; i < this.f4022c.size(); i++) {
                bid bid = (bid) ((WeakReference) this.f4022c.get(i)).get();
                if (bid != null) {
                    bid.mo1969b();
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo1965a(bid bid) {
        m3308a();
        this.f4022c.add(new WeakReference(bid));
        this.f4021b.post(new bib(bid));
    }

    /* renamed from: a */
    private final void m3308a() {
        for (int size = this.f4022c.size() - 1; size >= 0; size--) {
            if (((bid) ((WeakReference) this.f4022c.get(size)).get()) == null) {
                this.f4022c.remove(size);
            }
        }
    }
}
