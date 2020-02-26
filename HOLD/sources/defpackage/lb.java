package defpackage;

import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;

/* renamed from: lb  reason: default package */
/* compiled from: PG */
public final class lb implements Runnable {
    private final /* synthetic */ Toolbar a;

    public lb(Toolbar toolbar) {
        this.a = toolbar;
    }

    public final void run() {
        gp gpVar;
        ActionMenuView actionMenuView = this.a.a;
        if (actionMenuView != null && (gpVar = actionMenuView.d) != null) {
            gpVar.e();
        }
    }
}
