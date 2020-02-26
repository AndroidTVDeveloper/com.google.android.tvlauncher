package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: cuk */
/* compiled from: PG */
public final class cuk extends ViewOutlineProvider {

    /* renamed from: a */
    private final /* synthetic */ int f7517a;

    public cuk(int i) {
        this.f7517a = i;
    }

    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) this.f7517a);
    }
}
