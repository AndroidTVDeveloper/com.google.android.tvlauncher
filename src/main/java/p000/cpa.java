package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.tvlauncher.R;

/* renamed from: cpa */
/* compiled from: PG */
final class cpa extends ViewOutlineProvider {

    /* renamed from: a */
    private final /* synthetic */ int f6863a;

    public cpa(int i) {
        this.f6863a = i;
    }

    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getResources().getDimensionPixelSize(R.dimen.home_app_banner_width), view.getResources().getDimensionPixelSize(R.dimen.home_app_banner_image_height), (float) this.f6863a);
    }
}
