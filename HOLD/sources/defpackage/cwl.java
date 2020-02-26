package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: cwl  reason: default package */
/* compiled from: PG */
public final class cwl implements cwi {
    public final ald a;
    public Uri b;
    public final bhd c;
    public cwh d;
    private final Context e;
    private final bhu f;

    static {
        new bid();
    }

    public final void a(int i, int i2) {
    }

    public final Uri b() {
        return this.b;
    }

    public final View f() {
        return this.c;
    }

    public cwl(Context context, ald ald, bhd bhd, bhu bhu) {
        this.e = context;
        this.a = ald;
        this.f = bhu;
        this.c = bhd;
    }

    private static bif a(Context context) {
        return new bif(context, null, new bik("ExoPlayerImpl", null));
    }

    public final int e() {
        return (int) this.a.l();
    }

    public final int a() {
        return this.a.f();
    }

    public final void c() {
        String str;
        awv awv;
        int i;
        Uri uri = this.b;
        if (!TextUtils.isEmpty(null)) {
            String valueOf = String.valueOf((Object) null);
            str = valueOf.length() == 0 ? new String(".") : ".".concat(valueOf);
        } else {
            str = uri.getLastPathSegment();
        }
        char c2 = 3;
        if (str != null) {
            if (str.endsWith(".mpd")) {
                c2 = 0;
            } else if (str.endsWith(".ism") || str.endsWith(".isml")) {
                c2 = 1;
            } else if (str.endsWith(".m3u8")) {
                c2 = 2;
            }
        }
        if (c2 == 0) {
            awv = new azq(uri, a(this.e), new azt(this.f));
        } else if (c2 == 1) {
            awv = new bcx(uri, a(this.e), new bcr(this.f));
        } else if (c2 != 2) {
            awv = new awo(uri, this.f, new aog());
        } else {
            HlsMediaSource$Factory hlsMediaSource$Factory = new HlsMediaSource$Factory(this.f);
            bbf bbf = hlsMediaSource$Factory.a;
            bbh bbh = hlsMediaSource$Factory.b;
            awl awl = hlsMediaSource$Factory.c;
            anu anu = hlsMediaSource$Factory.d;
            bip bip = hlsMediaSource$Factory.e;
            awv = new bbk(uri, bbf, bbh, awl, anu, bip, new bcc(bbf, bip), hlsMediaSource$Factory.f);
        }
        ald ald = this.a;
        ald.u();
        awv awv2 = ald.r;
        if (awv2 != null) {
            awv2.a(ald.k);
            ald.k.l();
        }
        ald.r = awv;
        awv.a(ald.c, ald.k);
        aiv aiv = ald.l;
        if (ald.h()) {
            i = aiv.a();
        } else {
            i = -1;
        }
        ald.a(ald.h(), i);
        ajy ajy = ald.b;
        akp a2 = ajy.a(true, true, true, 2);
        ajy.l = true;
        ajy.k++;
        ajy.d.a.a(0, 1, 1, awv).sendToTarget();
        ajy.a(a2, false, 4, 1, false);
        this.c.a(this.a);
        this.a.a(new cwj(this));
        this.a.a(new cwk(this));
    }

    public final void a(boolean z) {
        this.a.a(true);
    }

    public final void a(cwh cwh) {
        this.d = cwh;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blm.a(float, float, float):float
     arg types: [float, int, int]
     candidates:
      blm.a(int, int, int):int
      blm.a(java.util.List, java.lang.Comparable, boolean):int
      blm.a(long[], long, boolean):int
      blm.a(long, long, long):long
      blm.a(java.lang.StringBuilder, java.util.Formatter, long):java.lang.String
      blm.a(byte[], int, int):java.lang.String
      blm.a(java.util.List, int, int):void
      blm.a(bky, bky, java.util.zip.Inflater):boolean
      blm.a(float, float, float):float */
    public final void a(float f2) {
        ald ald = this.a;
        ald.u();
        float a2 = blm.a(f2, 0.0f, 1.0f);
        if (ald.q != a2) {
            ald.q = a2;
            ald.t();
            Iterator it = ald.e.iterator();
            while (it.hasNext()) {
                ((als) it.next()).p();
            }
        }
    }

    public final void d() {
        ald ald = this.a;
        ald.u();
        ajy ajy = ald.b;
        akp a2 = ajy.a(false, false, false, 1);
        ajy.k++;
        ajy.d.a.a(6, 0).sendToTarget();
        ajy.a(a2, false, 4, 1, false);
        awv awv = ald.r;
        if (awv != null) {
            awv.a(ald.k);
            ald.k.l();
        }
        ald.l.b();
        ald.s = Collections.emptyList();
        this.a.a((bmk) null);
        this.c.a((akt) null);
    }
}
