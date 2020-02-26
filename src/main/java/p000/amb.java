package p000;

import android.os.Handler;

/* renamed from: amb */
/* compiled from: PG */
public final class amb {

    /* renamed from: a */
    public final Handler f741a;

    /* renamed from: b */
    public final amc f742b;

    public amb(Handler handler, amc amc) {
        Handler handler2;
        if (amc != null) {
            handler2 = (Handler) bks.m3507a(handler);
        } else {
            handler2 = null;
        }
        this.f741a = handler2;
        this.f742b = amc;
    }

    /* renamed from: a */
    public final void mo630a(ani ani) {
        if (this.f742b != null) {
            this.f741a.post(new alz(this, ani));
        }
    }
}
