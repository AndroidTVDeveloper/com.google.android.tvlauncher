package p000;

import android.content.Context;

/* renamed from: buo */
/* compiled from: PG */
public final class buo {

    /* renamed from: b */
    private static final buo f4855b = new buo();

    /* renamed from: a */
    private bun f4856a = null;

    /* renamed from: b */
    private final synchronized bun m4261b(Context context) {
        if (this.f4856a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f4856a = new bun(context);
        }
        return this.f4856a;
    }

    /* renamed from: a */
    public static bun m4260a(Context context) {
        return f4855b.m4261b(context);
    }
}
