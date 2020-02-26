package p000;

import android.content.Context;
import android.view.View;

/* renamed from: gj */
/* compiled from: PG */
public final class C0174gj extends C0157ft {

    /* renamed from: d */
    private final /* synthetic */ C0180gp f9397d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0174gj(C0180gp gpVar, Context context, C0167gc gcVar, View view) {
        super(context, gcVar, view, false);
        this.f9397d = gpVar;
        if (!gcVar.f9389i.mo4918e()) {
            Object obj = gpVar.f9404g;
            this.f9353a = (View) (obj == null ? gpVar.f9260f : obj);
        }
        mo5030a(gpVar.f9411n);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo5034d() {
        C0180gp gpVar = this.f9397d;
        gpVar.f9409l = null;
        gpVar.f9412o = 0;
        super.mo5034d();
    }
}
