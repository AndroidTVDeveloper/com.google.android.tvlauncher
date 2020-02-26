package defpackage;

import android.os.Looper;

/* renamed from: bom  reason: default package */
/* compiled from: PG */
public final class bom {
    public bsa a;
    private Looper b;

    public final bon a() {
        if (this.a == null) {
            this.a = new bpj();
        }
        if (this.b == null) {
            this.b = Looper.getMainLooper();
        }
        return new bon(this.a, this.b);
    }
}
