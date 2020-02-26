package p000;

import android.view.View;
import com.google.android.tvlauncher.home.HomeTopRowButton;

/* renamed from: cra */
/* compiled from: PG */
public final class cra implements View.OnFocusChangeListener {

    /* renamed from: a */
    private final /* synthetic */ HomeTopRowButton f7065a;

    public cra(HomeTopRowButton homeTopRowButton) {
        this.f7065a = homeTopRowButton;
    }

    public final void onFocusChange(View view, boolean z) {
        if (!z) {
            HomeTopRowButton homeTopRowButton = this.f7065a;
            homeTopRowButton.f6437c.cancel();
            homeTopRowButton.f6438d.start();
            homeTopRowButton.f6441g.setVisibility(8);
            homeTopRowButton.f6441g.setSelected(false);
            return;
        }
        HomeTopRowButton homeTopRowButton2 = this.f7065a;
        homeTopRowButton2.f6438d.cancel();
        homeTopRowButton2.f6437c.start();
        homeTopRowButton2.f6441g.setSelected(true);
    }
}
