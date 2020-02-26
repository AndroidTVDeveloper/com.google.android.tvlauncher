package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: cuh */
/* compiled from: PG */
public final class cuh extends ViewOutlineProvider {

    /* renamed from: a */
    private final /* synthetic */ int f7515a;

    public cuh(int i) {
        this.f7515a = i;
    }

    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth() + this.f7515a, view.getHeight(), (float) this.f7515a);
    }
}
