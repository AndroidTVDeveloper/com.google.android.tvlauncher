package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: ha */
/* compiled from: PG */
public final class C0192ha {

    /* renamed from: a */
    public static final PorterDuff.Mode f9450a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private static C0192ha f9451b;

    /* renamed from: c */
    private C0289kq f9452c;

    /* renamed from: a */
    public static synchronized C0192ha m7478a() {
        C0192ha haVar;
        synchronized (C0192ha.class) {
            if (f9451b == null) {
                m7480b();
            }
            haVar = f9451b;
        }
        return haVar;
    }

    /* renamed from: a */
    public final synchronized Drawable mo5105a(Context context, int i) {
        return this.f9452c.mo5457a(context, i);
    }

    /* renamed from: a */
    public static synchronized PorterDuffColorFilter m7477a(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter a;
        synchronized (C0192ha.class) {
            a = C0289kq.m7840a(i, mode);
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized ColorStateList mo5106b(Context context, int i) {
        return this.f9452c.mo5459b(context, i);
    }

    /* renamed from: b */
    private static synchronized void m7480b() {
        synchronized (C0192ha.class) {
            if (f9451b == null) {
                C0192ha haVar = new C0192ha();
                f9451b = haVar;
                haVar.f9452c = C0289kq.m7842a();
                f9451b.f9452c.mo5458a(new C0190gz());
            }
        }
    }

    /* renamed from: a */
    static void m7479a(Drawable drawable, C0296kx kxVar, int[] iArr) {
        C0289kq.m7844a(drawable, kxVar, iArr);
    }
}
