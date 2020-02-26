package p000;

import android.os.Looper;

/* renamed from: t */
/* compiled from: PG */
public class C0515t extends C0488s {
    /* renamed from: a */
    public void mo627a(Object obj) {
        if (PG.f0a == null) {
            synchronized (PG.class) {
                if (PG.f0a == null) {
                    PG.f0a = new PG();
                }
            }
            PG aVar = PG.f0a;
        } else {
            PG aVar2 = PG.f0a;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            this.f10294f++;
            this.f10292d = obj;
            if (!this.f10295g) {
                this.f10295g = true;
                do {
                    this.f10296h = false;
                    C0164g a = this.f10291c.mo5225a();
                    while (a.hasNext()) {
                        C0122el elVar = (C0122el) a.next().getValue();
                        if (this.f10296h) {
                            break;
                        }
                    }
                } while (this.f10296h);
                this.f10295g = false;
                return;
            }
            this.f10296h = true;
            return;
        }
        throw new IllegalStateException("Cannot invoke setValue on a background thread");
    }
}
