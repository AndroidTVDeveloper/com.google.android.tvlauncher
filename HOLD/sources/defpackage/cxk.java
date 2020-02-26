package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceView;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;

/* renamed from: cxk  reason: default package */
/* compiled from: PG */
public final class cxk extends cxi {
    private static final bid a = new bid();
    private static bkb b;
    private final Context c;
    private final HandlerThread d;
    private final bjp e;
    private final Deque f = new ArrayDeque();

    public cxk(Context context) {
        new HashSet();
        new Handler(Looper.getMainLooper());
        this.c = context.getApplicationContext();
        if (b == null) {
            b = new bkb(this.c.getCacheDir(), new bjz());
        }
        this.e = new bjp(b, new bif(context, a, new bik("ExoPlayerPreloaderManager", a)));
        HandlerThread handlerThread = new HandlerThread("ExoPlayerPreloaderManager");
        this.d = handlerThread;
        handlerThread.start();
    }

    public final int b(Uri uri) {
        if (uri != null) {
            return uri.toString().endsWith(".mp4") ? 100 : 10;
        }
        return 0;
    }

    public final cwi a(Uri uri) {
        bhd bhd = (bhd) this.f.pollFirst();
        if (bhd == null) {
            bhd = new bhd(this.c);
            ((SurfaceView) bhd.c).getHolder().setFormat(-2);
            boolean z = true;
            bks.b(true);
            if (bhd.f) {
                bhd.f = false;
                bgz bgz = bhd.e;
                if (bgz != null) {
                    bgz.a();
                    bhd.e.a((akt) null);
                }
                bhd.e();
            }
            if (bhd.a == null) {
                z = false;
            }
            bks.b(z);
            bhd.a.a(3);
        }
        bgg bgg = new bgg(new bfv(a));
        Context context = this.c;
        ajg ajg = new ajg(context);
        ajd ajd = new ajd();
        Looper a2 = blm.a();
        Context context2 = context;
        cwl cwl = new cwl(context, new ald(context2, ajg, bgg, ajd, bid.a(context), new alk(bkf.a), bkf.a, a2), bhd, this.e);
        cwl.b = uri;
        return cwl;
    }

    public final void a(cwi cwi) {
        cwl cwl = (cwl) cwi;
        ald ald = cwl.a;
        ald.u();
        ald.l.b();
        ajy ajy = ald.b;
        String hexString = Integer.toHexString(System.identityHashCode(ajy));
        String str = blm.e;
        String a2 = akf.a();
        int length = String.valueOf(hexString).length();
        StringBuilder sb = new StringBuilder(length + 36 + String.valueOf(str).length() + String.valueOf(a2).length());
        sb.append("Release ");
        sb.append(hexString);
        sb.append(" [ExoPlayerLib/2.10.7] [");
        sb.append(str);
        sb.append("] [");
        sb.append(a2);
        sb.append("]");
        sb.toString();
        ajy.d.a();
        ajy.c.removeCallbacksAndMessages(null);
        ajy.p = ajy.a(false, false, false, 1);
        ald.s();
        Surface surface = ald.m;
        if (surface != null) {
            if (ald.n) {
                surface.release();
            }
            ald.m = null;
        }
        awv awv = ald.r;
        if (awv != null) {
            awv.a(ald.k);
            ald.r = null;
        }
        bhn bhn = ald.j;
        ((bid) bhn).f.a(ald.k);
        ald.s = Collections.emptyList();
        if (this.f.size() < 2) {
            this.f.addFirst(cwl.c);
        }
    }
}
