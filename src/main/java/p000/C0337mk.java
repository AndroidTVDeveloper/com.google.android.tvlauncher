package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.leanback.preference.internal.OutlineOnlyWithChildrenFrameLayout;

/* renamed from: mk */
/* compiled from: PG */
public final class C0337mk extends ViewOutlineProvider {

    /* renamed from: a */
    private final /* synthetic */ OutlineOnlyWithChildrenFrameLayout f9965a;

    public C0337mk(OutlineOnlyWithChildrenFrameLayout outlineOnlyWithChildrenFrameLayout) {
        this.f9965a = outlineOnlyWithChildrenFrameLayout;
    }

    public final void getOutline(View view, Outline outline) {
        if (this.f9965a.getChildCount() > 0) {
            this.f9965a.f1169a.getOutline(view, outline);
        } else {
            ViewOutlineProvider.BACKGROUND.getOutline(view, outline);
        }
    }
}
