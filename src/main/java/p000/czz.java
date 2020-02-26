package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: czz */
/* compiled from: PG */
final class czz extends ViewOutlineProvider {

    /* renamed from: a */
    private final /* synthetic */ dad f8010a;

    public czz(dad dad) {
        this.f8010a = dad;
    }

    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) this.f8010a.f8019c);
    }
}
