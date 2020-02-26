package defpackage;

import android.os.Looper;

/* renamed from: t  reason: default package */
/* compiled from: PG */
public class t extends s {
    public void a(Object obj) {
        if (a.a == null) {
            synchronized (a.class) {
                if (a.a == null) {
                    a.a = new a();
                }
            }
            a aVar = a.a;
        } else {
            a aVar2 = a.a;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            this.f++;
            this.d = obj;
            if (!this.g) {
                this.g = true;
                do {
                    this.h = false;
                    g a = this.c.a();
                    while (a.hasNext()) {
                        el elVar = (el) a.next().getValue();
                        if (this.h) {
                            break;
                        }
                    }
                } while (this.h);
                this.g = false;
                return;
            }
            this.h = true;
            return;
        }
        throw new IllegalStateException("Cannot invoke setValue on a background thread");
    }
}
