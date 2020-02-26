package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* renamed from: ael */
/* compiled from: PG */
final class ael extends agw {

    /* renamed from: a */
    public final int f186a;

    /* renamed from: b */
    public Bitmap f187b;

    /* renamed from: c */
    private final Handler f188c;

    /* renamed from: d */
    private final long f189d;

    public ael(Handler handler, int i, long j) {
        this.f188c = handler;
        this.f186a = i;
        this.f189d = j;
    }

    /* renamed from: a */
    public final void mo113a(Drawable drawable) {
        this.f187b = null;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo114a(Object obj) {
        this.f187b = (Bitmap) obj;
        this.f188c.sendMessageAtTime(this.f188c.obtainMessage(1, this), this.f189d);
    }
}
