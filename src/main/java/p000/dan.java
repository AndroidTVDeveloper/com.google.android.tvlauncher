package p000;

import android.widget.PopupWindow;

/* renamed from: dan */
/* compiled from: PG */
final class dan implements PopupWindow.OnDismissListener {

    /* renamed from: a */
    private final /* synthetic */ daw f8060a;

    public dan(daw daw) {
        this.f8060a = daw;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: daw.a(float, int):void
     arg types: [int, int]
     candidates:
      daw.a(android.view.View, float[]):void
      daw.a(int, int):boolean
      daw.a(float, int):void */
    public final void onDismiss() {
        daw daw = this.f8060a;
        daw.mo4052a(0.0f, daw.f8091a);
        daw.f8101k.addListener(new dao(daw));
        daw daw2 = this.f8060a;
        daw2.f8095e.removeOnAttachStateChangeListener(daw2.f8102l);
        this.f8060a.f8095e.getViewTreeObserver().removeOnScrollChangedListener(this.f8060a.f8103m);
        this.f8060a.f8095e.getRootView().removeOnLayoutChangeListener(this.f8060a.f8104n);
        this.f8060a.f8105o = false;
    }
}
