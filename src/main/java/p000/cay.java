package p000;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: cay */
/* compiled from: PG */
final class cay implements bza, ccl {

    /* renamed from: a */
    private final bze f5158a;

    /* renamed from: b */
    private final dff f5159b;

    /* renamed from: c */
    private final ArrayList f5160c = new ArrayList();

    /* renamed from: d */
    private boolean f5161d;

    public cay(bze bze, dff dff) {
        this.f5158a = bze;
        this.f5159b = dff;
        bze.mo2564a(this);
    }

    /* renamed from: b */
    public final void mo2561b(Activity activity) {
        synchronized (this.f5160c) {
            if (!this.f5161d) {
                this.f5161d = true;
                this.f5158a.mo2565b(this);
                Iterator it = this.f5160c.iterator();
                while (it.hasNext()) {
                    ((dhe) this.f5159b.mo2551a()).mo2629a((Runnable) it.next());
                }
                this.f5160c.clear();
            }
        }
    }

    /* renamed from: a */
    public final void mo2543a() {
        this.f5158a.mo2565b(this);
    }
}
