package defpackage;

import android.view.View;
import com.google.android.tvlauncher.view.HomeTopRowView;

/* renamed from: ddg  reason: default package */
/* compiled from: PG */
public final /* synthetic */ class ddg implements View.OnClickListener {
    private final HomeTopRowView a;

    public ddg(HomeTopRowView homeTopRowView) {
        this.a = homeTopRowView;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dbj.a(java.lang.String, boolean):boolean
     arg types: [java.lang.String, int]
     candidates:
      dbj.a(java.lang.String, java.lang.String):java.lang.String
      dbj.a(java.lang.String, boolean):boolean */
    public final void onClick(View view) {
        HomeTopRowView homeTopRowView = this.a;
        ddw ddw = homeTopRowView.m;
        if (ddw != null && ddw.a()) {
            homeTopRowView.b.a(homeTopRowView.m.d, false);
        }
    }
}
