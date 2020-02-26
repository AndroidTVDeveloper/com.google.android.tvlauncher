package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;

/* renamed from: ahd  reason: default package */
/* compiled from: PG */
public final class ahd extends agw {
    private static final Handler b = new Handler(Looper.getMainLooper(), new ahc());
    public final sx a;

    public final void a(Drawable drawable) {
    }

    public ahd(sx sxVar) {
        super((byte) 0);
        this.a = sxVar;
    }

    public final void a(Object obj) {
        b.obtainMessage(1, this).sendToTarget();
    }
}
