package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: ha  reason: default package */
/* compiled from: PG */
public final class ha {
    public static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static ha b;
    private kq c;

    public static synchronized ha a() {
        ha haVar;
        synchronized (ha.class) {
            if (b == null) {
                b();
            }
            haVar = b;
        }
        return haVar;
    }

    public final synchronized Drawable a(Context context, int i) {
        return this.c.a(context, i);
    }

    public static synchronized PorterDuffColorFilter a(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter a2;
        synchronized (ha.class) {
            a2 = kq.a(i, mode);
        }
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final synchronized ColorStateList b(Context context, int i) {
        return this.c.b(context, i);
    }

    private static synchronized void b() {
        synchronized (ha.class) {
            if (b == null) {
                ha haVar = new ha();
                b = haVar;
                haVar.c = kq.a();
                b.c.a(new gz());
            }
        }
    }

    static void a(Drawable drawable, kx kxVar, int[] iArr) {
        kq.a(drawable, kxVar, iArr);
    }
}
