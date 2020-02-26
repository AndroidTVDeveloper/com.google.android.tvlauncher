package p000;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;

/* renamed from: ahd */
/* compiled from: PG */
public final class ahd extends agw {

    /* renamed from: b */
    private static final Handler f360b = new Handler(Looper.getMainLooper(), new ahc());

    /* renamed from: a */
    public final C0512sx f361a;

    /* renamed from: a */
    public final void mo113a(Drawable drawable) {
    }

    public ahd(C0512sx sxVar) {
        super((byte) 0);
        this.f361a = sxVar;
    }

    /* renamed from: a */
    public final void mo114a(Object obj) {
        f360b.obtainMessage(1, this).sendToTarget();
    }
}
