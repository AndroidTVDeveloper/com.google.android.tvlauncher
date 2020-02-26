package p000;

import android.graphics.Typeface;
import java.lang.ref.WeakReference;

/* renamed from: hi */
/* compiled from: PG */
public final class C0200hi implements Runnable {

    /* renamed from: a */
    private final WeakReference f9460a;

    /* renamed from: b */
    private final Typeface f9461b;

    public C0200hi(WeakReference weakReference, Typeface typeface) {
        this.f9460a = weakReference;
        this.f9461b = typeface;
    }

    public final void run() {
        C0201hj hjVar = (C0201hj) this.f9460a.get();
        if (hjVar != null) {
            Typeface typeface = this.f9461b;
            if (hjVar.f9465d) {
                hjVar.f9462a.setTypeface(typeface);
                hjVar.f9464c = typeface;
            }
        }
    }
}
