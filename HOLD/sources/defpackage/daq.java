package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.tvlauncher.R;

/* renamed from: daq  reason: default package */
/* compiled from: PG */
final class daq extends ViewOutlineProvider {
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) view.getResources().getDimensionPixelSize(R.dimen.card_rounded_corner_radius));
    }
}
