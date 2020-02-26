package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* renamed from: ael  reason: default package */
/* compiled from: PG */
final class ael extends agw {
    public final int a;
    public Bitmap b;
    private final Handler c;
    private final long d;

    public ael(Handler handler, int i, long j) {
        this.c = handler;
        this.a = i;
        this.d = j;
    }

    public final void a(Drawable drawable) {
        this.b = null;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        this.b = (Bitmap) obj;
        this.c.sendMessageAtTime(this.c.obtainMessage(1, this), this.d);
    }
}
