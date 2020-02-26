package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.List;

/* renamed from: fg  reason: default package */
/* compiled from: PG */
final class fg implements ViewTreeObserver.OnGlobalLayoutListener {
    private final /* synthetic */ fl a;

    public fg(fl flVar) {
        this.a = flVar;
    }

    public final void onGlobalLayout() {
        if (this.a.e() && this.a.b.size() > 0) {
            if (!((fk) this.a.b.get(0)).a.m) {
                View view = this.a.d;
                if (view != null && view.isShown()) {
                    List list = this.a.b;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((fk) list.get(i)).a.c();
                    }
                    return;
                }
                this.a.d();
            }
        }
    }
}
