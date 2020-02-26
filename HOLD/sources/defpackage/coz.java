package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: coz  reason: default package */
/* compiled from: PG */
final class coz extends ViewOutlineProvider {
    private final /* synthetic */ int a;

    public coz(int i) {
        this.a = i;
    }

    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) this.a);
    }
}
