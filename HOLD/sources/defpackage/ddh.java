package defpackage;

import android.view.View;
import com.google.android.tvlauncher.view.HomeTopRowView;

/* renamed from: ddh  reason: default package */
/* compiled from: PG */
public final /* synthetic */ class ddh implements View.OnClickListener {
    private final HomeTopRowView a;

    public ddh(HomeTopRowView homeTopRowView) {
        this.a = homeTopRowView;
    }

    public final void onClick(View view) {
        ddm ddm = this.a.h;
        if (ddm != null) {
            ddm.j();
        }
    }
}
