package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: cyd  reason: default package */
/* compiled from: PG */
public final class cyd extends ViewOutlineProvider {
    public final void getOutline(View view, Outline outline) {
        outline.setOval(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }
}
