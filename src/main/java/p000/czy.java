package p000;

import android.widget.PopupWindow;

/* renamed from: czy */
/* compiled from: PG */
final class czy implements PopupWindow.OnDismissListener {

    /* renamed from: a */
    private final /* synthetic */ dad f8009a;

    public czy(dad dad) {
        this.f8009a = dad;
    }

    public final void onDismiss() {
        dad dad = this.f8009a;
        dad.f8024h = false;
        dau dau = dad.f8023g;
        if (dau != null) {
            dau.mo2803a();
        }
    }
}
