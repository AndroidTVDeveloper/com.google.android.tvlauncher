package p000;

import android.support.p002v7.view.menu.ActionMenuItemView;

/* renamed from: fd */
/* compiled from: PG */
public final class C0141fd extends C0231im {

    /* renamed from: c */
    private final /* synthetic */ ActionMenuItemView f9253c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0141fd(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f9253c = actionMenuItemView;
    }

    /* renamed from: a */
    public final C0162fy mo4824a() {
        C0174gj gjVar;
        C0142fe feVar = this.f9253c.f953d;
        if (feVar == null || (gjVar = feVar.f9254a.f9409l) == null) {
            return null;
        }
        return gjVar.mo5028a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo4825b() {
        C0162fy a;
        ActionMenuItemView actionMenuItemView = this.f9253c;
        C0151fn fnVar = actionMenuItemView.f952c;
        if (fnVar == null || !fnVar.mo759a(actionMenuItemView.f951b) || (a = mo4824a()) == null || !a.mo4850e()) {
            return false;
        }
        return true;
    }
}
