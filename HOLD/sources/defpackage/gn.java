package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: gn  reason: default package */
/* compiled from: PG */
final class gn extends ft {
    private final /* synthetic */ gp d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gn(gp gpVar, Context context, fo foVar, View view) {
        super(context, foVar, view, true);
        this.d = gpVar;
        this.b = 8388613;
        a(gpVar.n);
    }

    /* access modifiers changed from: protected */
    public final void d() {
        fo foVar = this.d.c;
        if (foVar != null) {
            foVar.close();
        }
        this.d.k = null;
        super.d();
    }
}
