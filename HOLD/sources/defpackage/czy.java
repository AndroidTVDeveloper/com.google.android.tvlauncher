package defpackage;

import android.widget.PopupWindow;

/* renamed from: czy  reason: default package */
/* compiled from: PG */
final class czy implements PopupWindow.OnDismissListener {
    private final /* synthetic */ dad a;

    public czy(dad dad) {
        this.a = dad;
    }

    public final void onDismiss() {
        dad dad = this.a;
        dad.h = false;
        dau dau = dad.g;
        if (dau != null) {
            dau.a();
        }
    }
}
