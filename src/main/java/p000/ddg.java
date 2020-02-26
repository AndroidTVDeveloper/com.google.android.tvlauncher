package p000;

import android.view.View;
import com.google.android.tvlauncher.view.HomeTopRowView;

/* renamed from: ddg */
/* compiled from: PG */
public final /* synthetic */ class ddg implements View.OnClickListener {

    /* renamed from: a */
    private final HomeTopRowView f8335a;

    public ddg(HomeTopRowView homeTopRowView) {
        this.f8335a = homeTopRowView;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dbj.a(java.lang.String, boolean):boolean
     arg types: [java.lang.String, int]
     candidates:
      dbj.a(java.lang.String, java.lang.String):java.lang.String
      dbj.a(java.lang.String, boolean):boolean */
    public final void onClick(View view) {
        HomeTopRowView homeTopRowView = this.f8335a;
        ddw ddw = homeTopRowView.f6710m;
        if (ddw != null && ddw.mo4167a()) {
            homeTopRowView.f6699b.mo4069a(homeTopRowView.f6710m.f8353d, false);
        }
    }
}
