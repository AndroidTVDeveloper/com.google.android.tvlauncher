package p000;

import android.os.Handler;
import android.view.Surface;

/* renamed from: bmj */
/* compiled from: PG */
public final class bmj {

    /* renamed from: a */
    public final Handler f4410a;

    /* renamed from: b */
    public final bmk f4411b;

    public bmj(Handler handler, bmk bmk) {
        Handler handler2;
        if (bmk != null) {
            handler2 = (Handler) bks.m3507a(handler);
        } else {
            handler2 = null;
        }
        this.f4410a = handler2;
        this.f4411b = bmk;
    }

    /* renamed from: a */
    public final void mo2149a(ani ani) {
        if (this.f4411b != null) {
            this.f4410a.post(new bmi(this, ani));
        }
    }

    /* renamed from: a */
    public final void mo2148a(Surface surface) {
        if (this.f4411b != null) {
            this.f4410a.post(new bmh(this, surface));
        }
    }

    /* renamed from: a */
    public final void mo2147a(int i, int i2, int i3, float f) {
        if (this.f4411b != null) {
            this.f4410a.post(new bmg(this, i, i2, i3, f));
        }
    }
}
