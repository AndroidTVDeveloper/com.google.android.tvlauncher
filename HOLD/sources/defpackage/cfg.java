package defpackage;

import android.content.Context;

/* renamed from: cfg  reason: default package */
/* compiled from: PG */
public final class cfg implements cez, cex, cew {
    private static cfg c = null;
    public cez a;
    public cex b;

    public final void a(Context context) {
    }

    public static cfg a() {
        if (c == null) {
            c = new cfg();
        }
        return c;
    }

    public final void b(Context context) {
        cex cex = this.b;
        if (cex != null) {
            cex.b(context);
        }
    }

    public final void d(Context context) {
        cez cez = this.a;
        if (cez != null) {
            cez.d(context);
        }
    }
}
