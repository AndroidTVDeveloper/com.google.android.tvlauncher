package defpackage;

import android.view.View;

/* renamed from: dak  reason: default package */
/* compiled from: PG */
final class dak implements View.OnAttachStateChangeListener {
    private final /* synthetic */ daw a;

    public dak(daw daw) {
        this.a = daw;
    }

    public final void onViewDetachedFromWindow(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        this.a.c();
    }
}
