package defpackage;

import android.os.Handler;

/* renamed from: amb  reason: default package */
/* compiled from: PG */
public final class amb {
    public final Handler a;
    public final amc b;

    public amb(Handler handler, amc amc) {
        Handler handler2;
        if (amc != null) {
            handler2 = (Handler) bks.a(handler);
        } else {
            handler2 = null;
        }
        this.a = handler2;
        this.b = amc;
    }

    public final void a(ani ani) {
        if (this.b != null) {
            this.a.post(new alz(this, ani));
        }
    }
}
