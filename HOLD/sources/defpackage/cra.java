package defpackage;

import android.view.View;
import com.google.android.tvlauncher.home.HomeTopRowButton;

/* renamed from: cra  reason: default package */
/* compiled from: PG */
public final class cra implements View.OnFocusChangeListener {
    private final /* synthetic */ HomeTopRowButton a;

    public cra(HomeTopRowButton homeTopRowButton) {
        this.a = homeTopRowButton;
    }

    public final void onFocusChange(View view, boolean z) {
        if (!z) {
            HomeTopRowButton homeTopRowButton = this.a;
            homeTopRowButton.c.cancel();
            homeTopRowButton.d.start();
            homeTopRowButton.g.setVisibility(8);
            homeTopRowButton.g.setSelected(false);
            return;
        }
        HomeTopRowButton homeTopRowButton2 = this.a;
        homeTopRowButton2.d.cancel();
        homeTopRowButton2.c.start();
        homeTopRowButton2.g.setSelected(true);
    }
}
