package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.SystemClock;

/* renamed from: cth  reason: default package */
/* compiled from: PG */
public final class cth extends ahe {
    private final /* synthetic */ cti a;

    public cth(cti cti) {
        this.a = cti;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ctg ctg = this.a.e;
        ctg.d = (Bitmap) obj;
        ctg.b = SystemClock.uptimeMillis();
        ctg.c = 600;
        ctg.a = true;
        ctg.e = new Paint();
    }
}
