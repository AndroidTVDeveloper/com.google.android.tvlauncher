package defpackage;

import android.view.View;
import com.google.android.tvlauncher.view.HomeTopRowView;

/* renamed from: ddf  reason: default package */
/* compiled from: PG */
public final /* synthetic */ class ddf implements View.OnClickListener {
    private final HomeTopRowView a;

    public ddf(HomeTopRowView homeTopRowView) {
        this.a = homeTopRowView;
    }

    public final void onClick(View view) {
        ddm ddm = this.a.h;
        if (ddm != null) {
            cqp cqp = (cqp) ddm;
            cqp.a(50, dhs.n);
            cvm.b(cqp.b);
        }
    }
}
