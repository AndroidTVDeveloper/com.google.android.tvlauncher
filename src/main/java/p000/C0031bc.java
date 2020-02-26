package p000;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;

/* renamed from: bc */
/* compiled from: PG */
public final class C0031bc {

    /* renamed from: a */
    private final WeakReference f3205a;

    /* renamed from: b */
    private final int f3206b;

    /* renamed from: c */
    private final int f3207c;

    public C0031bc() {
    }

    /* renamed from: a */
    public static final void m2781a() {
        new Handler(Looper.getMainLooper()).post(new C0030bb());
    }

    /* renamed from: b */
    public final void mo1752b(Typeface typeface) {
        new Handler(Looper.getMainLooper()).post(new C0029ba(this, typeface));
    }

    public C0031bc(C0201hj hjVar, int i, int i2) {
        this.f3205a = new WeakReference(hjVar);
        this.f3206b = i;
        this.f3207c = i2;
    }

    /* renamed from: a */
    public final void mo1751a(Typeface typeface) {
        int i;
        boolean z;
        C0201hj hjVar = (C0201hj) this.f3205a.get();
        if (hjVar != null) {
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f3206b) != -1) {
                if ((this.f3207c & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                typeface = Typeface.create(typeface, i, z);
            }
            hjVar.f9462a.post(new C0200hi(this.f3205a, typeface));
        }
    }
}
