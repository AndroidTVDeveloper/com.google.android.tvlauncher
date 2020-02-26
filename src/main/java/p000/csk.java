package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.tvlauncher.R;

/* renamed from: csk */
/* compiled from: PG */
final class csk extends ViewOutlineProvider {

    /* renamed from: a */
    private final /* synthetic */ csl f7238a;

    public csk(csl csl) {
        this.f7238a = csl;
    }

    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) this.f7238a.f7240b.getResources().getDimensionPixelSize(R.dimen.watch_next_logo_rounded_corner_radius));
    }
}
