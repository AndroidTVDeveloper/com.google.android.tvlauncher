package p000;

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

/* renamed from: cxk */
/* compiled from: PG */
public final class cxk extends cxi {

    /* renamed from: a */
    private static final bid f7836a = new bid();

    /* renamed from: b */
    private static bkb f7837b;

    /* renamed from: c */
    private final Context f7838c;

    /* renamed from: d */
    private final HandlerThread f7839d;

    /* renamed from: e */
    private final bjp f7840e;

    /* renamed from: f */
    private final Deque f7841f = new ArrayDeque();

    public cxk(Context context) {
        new HashSet();
        new Handler(Looper.getMainLooper());
        this.f7838c = context.getApplicationContext();
        if (f7837b == null) {
            f7837b = new bkb(this.f7838c.getCacheDir(), new bjz());
        }
        this.f7840e = new bjp(f7837b, new bif(context, f7836a, new bik("ExoPlayerPreloaderManager", f7836a)));
        HandlerThread handlerThread = new HandlerThread("ExoPlayerPreloaderManager");
        this.f7839d = handlerThread;
        handlerThread.start();
    }

    /* renamed from: b */
    public final int mo3934b(Uri uri) {
        if (uri != null) {
            return uri.toString().endsWith(".mp4") ? 100 : 10;
        }
        return 0;
    }

    /* renamed from: a */
    public final cwi mo3932a(Uri uri) {
        bhd bhd = (bhd) this.f7841f.pollFirst();
        if (bhd == null) {
            bhd = new bhd(this.f7838c);
            ((SurfaceView) bhd.f3919c).getHolder().setFormat(-2);
            boolean z = true;
            bks.m3512b(true);
            if (bhd.f3922f) {
                bhd.f3922f = false;
                bgz bgz = bhd.f3921e;
                if (bgz != null) {
                    bgz.mo1897a();
                    bhd.f3921e.mo1898a((akt) null);
                }
                bhd.mo1927e();
            }
            if (bhd.f3917a == null) {
                z = false;
            }
            bks.m3512b(z);
            bhd.f3917a.mo3174a(3);
        }
        bgg bgg = new bgg(new bfv(f7836a));
        Context context = this.f7838c;
        ajg ajg = new ajg(context);
        ajd ajd = new ajd();
        Looper a = blm.m3635a();
        Context context2 = context;
        cwl cwl = new cwl(context, new ald(context2, ajg, bgg, ajd, bid.m3311a(context), new alk(bkf.f4206a), bkf.f4206a, a), bhd, this.f7840e);
        cwl.f7767b = uri;
        return cwl;
    }

    /* renamed from: a */
    public final void mo3933a(cwi cwi) {
        cwl cwl = (cwl) cwi;
        ald ald = cwl.f7766a;
        ald.mo523u();
        ald.f654l.mo335b();
        ajy ajy = ald.f644b;
        String hexString = Integer.toHexString(System.identityHashCode(ajy));
        String str = blm.f4297e;
        String a = akf.m725a();
        int length = String.valueOf(hexString).length();
        StringBuilder sb = new StringBuilder(length + 36 + String.valueOf(str).length() + String.valueOf(a).length());
        sb.append("Release ");
        sb.append(hexString);
        sb.append(" [ExoPlayerLib/2.10.7] [");
        sb.append(str);
        sb.append("] [");
        sb.append(a);
        sb.append("]");
        sb.toString();
        ajy.f479d.mo410a();
        ajy.f478c.removeCallbacksAndMessages(null);
        ajy.f491p = ajy.mo384a(false, false, false, 1);
        ald.mo405s();
        Surface surface = ald.f655m;
        if (surface != null) {
            if (ald.f656n) {
                surface.release();
            }
            ald.f655m = null;
        }
        awv awv = ald.f660r;
        if (awv != null) {
            awv.mo1470a(ald.f653k);
            ald.f660r = null;
        }
        bhn bhn = ald.f652j;
        ((bid) bhn).f4029f.mo2040a(ald.f653k);
        ald.f661s = Collections.emptyList();
        if (this.f7841f.size() < 2) {
            this.f7841f.addFirst(cwl.f7768c);
        }
    }
}
