package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: coz */
/* compiled from: PG */
final class coz extends ViewOutlineProvider {

    /* renamed from: a */
    private final /* synthetic */ int f6859a;

    public coz(int i) {
        this.f6859a = i;
    }

    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) this.f6859a);
    }
}
