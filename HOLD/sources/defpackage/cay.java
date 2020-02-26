package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: cay  reason: default package */
/* compiled from: PG */
final class cay implements bza, ccl {
    private final bze a;
    private final dff b;
    private final ArrayList c = new ArrayList();
    private boolean d;

    public cay(bze bze, dff dff) {
        this.a = bze;
        this.b = dff;
        bze.a(this);
    }

    public final void b(Activity activity) {
        synchronized (this.c) {
            if (!this.d) {
                this.d = true;
                this.a.b(this);
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    ((dhe) this.b.a()).a((Runnable) it.next());
                }
                this.c.clear();
            }
        }
    }

    public final void a() {
        this.a.b(this);
    }
}
