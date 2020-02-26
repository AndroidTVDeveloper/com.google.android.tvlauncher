package p000;

import android.content.Context;
import android.view.View;

/* renamed from: gn */
/* compiled from: PG */
final class C0178gn extends C0157ft {

    /* renamed from: d */
    private final /* synthetic */ C0180gp f9402d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0178gn(C0180gp gpVar, Context context, C0152fo foVar, View view) {
        super(context, foVar, view, true);
        this.f9402d = gpVar;
        this.f9354b = 8388613;
        mo5030a(gpVar.f9411n);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo5034d() {
        C0152fo foVar = this.f9402d.f9257c;
        if (foVar != null) {
            foVar.close();
        }
        this.f9402d.f9408k = null;
        super.mo5034d();
    }
}
