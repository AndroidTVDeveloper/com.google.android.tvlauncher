package defpackage;

import android.content.Context;

/* renamed from: buo  reason: default package */
/* compiled from: PG */
public final class buo {
    private static final buo b = new buo();
    private bun a = null;

    private final synchronized bun b(Context context) {
        if (this.a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.a = new bun(context);
        }
        return this.a;
    }

    public static bun a(Context context) {
        return b.b(context);
    }
}
