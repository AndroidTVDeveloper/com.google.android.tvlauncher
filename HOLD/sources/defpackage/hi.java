package defpackage;

import android.graphics.Typeface;
import java.lang.ref.WeakReference;

/* renamed from: hi  reason: default package */
/* compiled from: PG */
public final class hi implements Runnable {
    private final WeakReference a;
    private final Typeface b;

    public hi(WeakReference weakReference, Typeface typeface) {
        this.a = weakReference;
        this.b = typeface;
    }

    public final void run() {
        hj hjVar = (hj) this.a.get();
        if (hjVar != null) {
            Typeface typeface = this.b;
            if (hjVar.d) {
                hjVar.a.setTypeface(typeface);
                hjVar.c = typeface;
            }
        }
    }
}
