package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.leanback.preference.internal.OutlineOnlyWithChildrenFrameLayout;

/* renamed from: mk  reason: default package */
/* compiled from: PG */
public final class mk extends ViewOutlineProvider {
    private final /* synthetic */ OutlineOnlyWithChildrenFrameLayout a;

    public mk(OutlineOnlyWithChildrenFrameLayout outlineOnlyWithChildrenFrameLayout) {
        this.a = outlineOnlyWithChildrenFrameLayout;
    }

    public final void getOutline(View view, Outline outline) {
        if (this.a.getChildCount() > 0) {
            this.a.a.getOutline(view, outline);
        } else {
            ViewOutlineProvider.BACKGROUND.getOutline(view, outline);
        }
    }
}
