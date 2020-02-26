package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: byc */
/* compiled from: PG */
public final class byc implements bxs {

    /* renamed from: a */
    private final Status f5000a;

    /* renamed from: b */
    private final bxu f5001b;

    public byc(Status status, bxu bxu) {
        this.f5000a = status;
        this.f5001b = bxu;
    }

    /* renamed from: a */
    public final Status mo2253a() {
        return this.f5000a;
    }

    /* renamed from: b */
    public final boolean mo2530b() {
        buh.m4199a(this.f5001b);
        return this.f5001b.f4993a == 1;
    }

    public final String toString() {
        boolean z = true;
        Object[] objArr = new Object[1];
        if (this.f5001b.f4993a != 1) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        return String.format("OptInOptionsResultImpl[%s]", objArr);
    }
}
