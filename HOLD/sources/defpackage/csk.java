package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.tvlauncher.R;

/* renamed from: csk  reason: default package */
/* compiled from: PG */
final class csk extends ViewOutlineProvider {
    private final /* synthetic */ csl a;

    public csk(csl csl) {
        this.a = csl;
    }

    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) this.a.b.getResources().getDimensionPixelSize(R.dimen.watch_next_logo_rounded_corner_radius));
    }
}
