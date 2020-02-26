package p000;

import android.os.Looper;

/* renamed from: bom */
/* compiled from: PG */
public final class bom {

    /* renamed from: a */
    public bsa f4510a;

    /* renamed from: b */
    private Looper f4511b;

    /* renamed from: a */
    public final bon mo2239a() {
        if (this.f4510a == null) {
            this.f4510a = new bpj();
        }
        if (this.f4511b == null) {
            this.f4511b = Looper.getMainLooper();
        }
        return new bon(this.f4510a, this.f4511b);
    }
}
