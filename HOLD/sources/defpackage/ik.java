package defpackage;

import android.view.ViewParent;

/* renamed from: ik  reason: default package */
/* compiled from: PG */
final class ik implements Runnable {
    private final /* synthetic */ im a;

    public ik(im imVar) {
        this.a = imVar;
    }

    public final void run() {
        ViewParent parent = this.a.a.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}
