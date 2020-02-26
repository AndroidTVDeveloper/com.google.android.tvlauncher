package p000;

import android.support.p002v7.widget.ActionMenuView;
import android.support.p002v7.widget.Toolbar;

/* renamed from: lb */
/* compiled from: PG */
public final class C0301lb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Toolbar f9836a;

    public C0301lb(Toolbar toolbar) {
        this.f9836a = toolbar;
    }

    public final void run() {
        C0180gp gpVar;
        ActionMenuView actionMenuView = this.f9836a.f1139a;
        if (actionMenuView != null && (gpVar = actionMenuView.f1009d) != null) {
            gpVar.mo5073e();
        }
    }
}
