package defpackage;

import android.graphics.Typeface;

/* renamed from: ba  reason: default package */
/* compiled from: PG */
final class ba implements Runnable {
    private final /* synthetic */ Typeface a;
    private final /* synthetic */ bc b;

    public ba(bc bcVar, Typeface typeface) {
        this.b = bcVar;
        this.a = typeface;
    }

    public final void run() {
        this.b.a(this.a);
    }
}
