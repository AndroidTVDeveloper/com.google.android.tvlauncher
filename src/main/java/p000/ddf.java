package p000;

import android.view.View;
import com.google.android.tvlauncher.view.HomeTopRowView;

/* renamed from: ddf */
/* compiled from: PG */
public final /* synthetic */ class ddf implements View.OnClickListener {

    /* renamed from: a */
    private final HomeTopRowView f8334a;

    public ddf(HomeTopRowView homeTopRowView) {
        this.f8334a = homeTopRowView;
    }

    public final void onClick(View view) {
        ddm ddm = this.f8334a.f6705h;
        if (ddm != null) {
            cqp cqp = (cqp) ddm;
            cqp.mo3586a(50, dhs.f8550n);
            cvm.m5752b(cqp.f7010b);
        }
    }
}
