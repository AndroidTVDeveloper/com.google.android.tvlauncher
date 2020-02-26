package defpackage;

import android.view.View;

/* renamed from: gk  reason: default package */
/* compiled from: PG */
final class gk implements Runnable {
    private final gn a;
    private final /* synthetic */ gp b;

    public gk(gp gpVar, gn gnVar) {
        this.b = gpVar;
        this.a = gnVar;
    }

    public final void run() {
        fx fxVar = this.b.f;
        if (!(fxVar == null || ((View) fxVar).getWindowToken() == null || !this.a.b())) {
            this.b.k = this.a;
        }
        this.b.m = null;
    }
}
