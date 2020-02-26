package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: cuh  reason: default package */
/* compiled from: PG */
public final class cuh extends ViewOutlineProvider {
    private final /* synthetic */ int a;

    public cuh(int i) {
        this.a = i;
    }

    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth() + this.a, view.getHeight(), (float) this.a);
    }
}
