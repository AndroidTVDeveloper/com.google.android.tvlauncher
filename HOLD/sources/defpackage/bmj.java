package defpackage;

import android.os.Handler;
import android.view.Surface;

/* renamed from: bmj  reason: default package */
/* compiled from: PG */
public final class bmj {
    public final Handler a;
    public final bmk b;

    public bmj(Handler handler, bmk bmk) {
        Handler handler2;
        if (bmk != null) {
            handler2 = (Handler) bks.a(handler);
        } else {
            handler2 = null;
        }
        this.a = handler2;
        this.b = bmk;
    }

    public final void a(ani ani) {
        if (this.b != null) {
            this.a.post(new bmi(this, ani));
        }
    }

    public final void a(Surface surface) {
        if (this.b != null) {
            this.a.post(new bmh(this, surface));
        }
    }

    public final void a(int i, int i2, int i3, float f) {
        if (this.b != null) {
            this.a.post(new bmg(this, i, i2, i3, f));
        }
    }
}
