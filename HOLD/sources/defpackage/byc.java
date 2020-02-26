package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: byc  reason: default package */
/* compiled from: PG */
public final class byc implements bxs {
    private final Status a;
    private final bxu b;

    public byc(Status status, bxu bxu) {
        this.a = status;
        this.b = bxu;
    }

    public final Status a() {
        return this.a;
    }

    public final boolean b() {
        buh.a(this.b);
        return this.b.a == 1;
    }

    public final String toString() {
        boolean z = true;
        Object[] objArr = new Object[1];
        if (this.b.a != 1) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        return String.format("OptInOptionsResultImpl[%s]", objArr);
    }
}
