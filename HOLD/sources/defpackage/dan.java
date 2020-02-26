package defpackage;

import android.widget.PopupWindow;

/* renamed from: dan  reason: default package */
/* compiled from: PG */
final class dan implements PopupWindow.OnDismissListener {
    private final /* synthetic */ daw a;

    public dan(daw daw) {
        this.a = daw;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: daw.a(float, int):void
     arg types: [int, int]
     candidates:
      daw.a(android.view.View, float[]):void
      daw.a(int, int):boolean
      daw.a(float, int):void */
    public final void onDismiss() {
        daw daw = this.a;
        daw.a(0.0f, daw.a);
        daw.k.addListener(new dao(daw));
        daw daw2 = this.a;
        daw2.e.removeOnAttachStateChangeListener(daw2.l);
        this.a.e.getViewTreeObserver().removeOnScrollChangedListener(this.a.m);
        this.a.e.getRootView().removeOnLayoutChangeListener(this.a.n);
        this.a.o = false;
    }
}
