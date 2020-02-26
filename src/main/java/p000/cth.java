package p000;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.SystemClock;

/* renamed from: cth */
/* compiled from: PG */
public final class cth extends ahe {

    /* renamed from: a */
    private final /* synthetic */ cti f7352a;

    public cth(cti cti) {
        this.f7352a = cti;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo114a(Object obj) {
        ctg ctg = this.f7352a.f7357e;
        ctg.f7349d = (Bitmap) obj;
        ctg.f7347b = SystemClock.uptimeMillis();
        ctg.f7348c = 600;
        ctg.f7346a = true;
        ctg.f7350e = new Paint();
    }
}
