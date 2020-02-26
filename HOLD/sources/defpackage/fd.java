package defpackage;

import android.support.v7.view.menu.ActionMenuItemView;

/* renamed from: fd  reason: default package */
/* compiled from: PG */
public final class fd extends im {
    private final /* synthetic */ ActionMenuItemView c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fd(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.c = actionMenuItemView;
    }

    public final fy a() {
        gj gjVar;
        fe feVar = this.c.d;
        if (feVar == null || (gjVar = feVar.a.l) == null) {
            return null;
        }
        return gjVar.a();
    }

    /* access modifiers changed from: protected */
    public final boolean b() {
        fy a;
        ActionMenuItemView actionMenuItemView = this.c;
        fn fnVar = actionMenuItemView.c;
        if (fnVar == null || !fnVar.a(actionMenuItemView.b) || (a = a()) == null || !a.e()) {
            return false;
        }
        return true;
    }
}
