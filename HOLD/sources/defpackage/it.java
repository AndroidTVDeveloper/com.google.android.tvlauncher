package defpackage;

import android.view.View;

/* renamed from: it  reason: default package */
/* compiled from: PG */
final class it implements Runnable {
    private final /* synthetic */ ja a;

    public it(ja jaVar) {
        this.a = jaVar;
    }

    public final void run() {
        View view = this.a.i;
        if (view != null && view.getWindowToken() != null) {
            this.a.c();
        }
    }
}
