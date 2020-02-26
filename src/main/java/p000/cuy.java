package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.tvlauncher.R;

/* renamed from: cuy */
/* compiled from: PG */
public final class cuy extends ViewOutlineProvider {
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) view.getResources().getDimensionPixelSize(R.dimen.program_badge_background_corner_radius));
    }
}
