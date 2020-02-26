package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: bic  reason: default package */
/* compiled from: PG */
final class bic extends BroadcastReceiver {
    private static bic a;
    private final Handler b = new Handler(Looper.getMainLooper());
    private final ArrayList c = new ArrayList();

    private bic() {
    }

    public static synchronized bic a(Context context) {
        bic bic;
        synchronized (bic.class) {
            if (a == null) {
                a = new bic();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(a, intentFilter);
            }
            bic = a;
        }
        return bic;
    }

    public final synchronized void onReceive(Context context, Intent intent) {
        if (!isInitialStickyBroadcast()) {
            a();
            for (int i = 0; i < this.c.size(); i++) {
                bid bid = (bid) ((WeakReference) this.c.get(i)).get();
                if (bid != null) {
                    bid.b();
                }
            }
        }
    }

    public final synchronized void a(bid bid) {
        a();
        this.c.add(new WeakReference(bid));
        this.b.post(new bib(bid));
    }

    private final void a() {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            if (((bid) ((WeakReference) this.c.get(size)).get()) == null) {
                this.c.remove(size);
            }
        }
    }
}
