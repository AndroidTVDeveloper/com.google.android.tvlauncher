package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: czz  reason: default package */
/* compiled from: PG */
final class czz extends ViewOutlineProvider {
    private final /* synthetic */ dad a;

    public czz(dad dad) {
        this.a = dad;
    }

    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) this.a.c);
    }
}
