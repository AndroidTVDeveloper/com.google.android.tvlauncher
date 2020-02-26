package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: gj  reason: default package */
/* compiled from: PG */
public final class gj extends ft {
    private final /* synthetic */ gp d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gj(gp gpVar, Context context, gc gcVar, View view) {
        super(context, gcVar, view, false);
        this.d = gpVar;
        if (!gcVar.i.e()) {
            Object obj = gpVar.g;
            this.a = (View) (obj == null ? gpVar.f : obj);
        }
        a(gpVar.n);
    }

    /* access modifiers changed from: protected */
    public final void d() {
        gp gpVar = this.d;
        gpVar.l = null;
        gpVar.o = 0;
        super.d();
    }
}
