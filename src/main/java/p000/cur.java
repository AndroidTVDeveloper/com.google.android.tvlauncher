package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: cur */
/* compiled from: PG */
public final class cur extends ViewOutlineProvider {

    /* renamed from: a */
    private final /* synthetic */ int f7518a;

    public cur(int i) {
        this.f7518a = i;
    }

    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) this.f7518a);
    }
}
