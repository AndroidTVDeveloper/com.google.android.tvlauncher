package p000;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: cwl */
/* compiled from: PG */
public final class cwl implements cwi {

    /* renamed from: a */
    public final ald f7766a;

    /* renamed from: b */
    public Uri f7767b;

    /* renamed from: c */
    public final bhd f7768c;

    /* renamed from: d */
    public cwh f7769d;

    /* renamed from: e */
    private final Context f7770e;

    /* renamed from: f */
    private final bhu f7771f;

    static {
        new bid();
    }

    /* renamed from: a */
    public final void mo3883a(int i, int i2) {
    }

    /* renamed from: b */
    public final Uri mo3886b() {
        return this.f7767b;
    }

    /* renamed from: f */
    public final View mo3890f() {
        return this.f7768c;
    }

    public cwl(Context context, ald ald, bhd bhd, bhu bhu) {
        this.f7770e = context;
        this.f7766a = ald;
        this.f7771f = bhu;
        this.f7768c = bhd;
    }

    /* renamed from: a */
    private static bif m5839a(Context context) {
        return new bif(context, null, new bik("ExoPlayerImpl", null));
    }

    /* renamed from: e */
    public final int mo3889e() {
        return (int) this.f7766a.mo398l();
    }

    /* renamed from: a */
    public final int mo3881a() {
        return this.f7766a.mo392f();
    }

    /* renamed from: c */
    public final void mo3887c() {
        String str;
        awv awv;
        int i;
        Uri uri = this.f7767b;
        if (!TextUtils.isEmpty(null)) {
            String valueOf = String.valueOf((Object) null);
            str = valueOf.length() == 0 ? new String(".") : ".".concat(valueOf);
        } else {
            str = uri.getLastPathSegment();
        }
        char c = 3;
        if (str != null) {
            if (str.endsWith(".mpd")) {
                c = 0;
            } else if (str.endsWith(".ism") || str.endsWith(".isml")) {
                c = 1;
            } else if (str.endsWith(".m3u8")) {
                c = 2;
            }
        }
        if (c == 0) {
            awv = new azq(uri, m5839a(this.f7770e), new azt(this.f7771f));
        } else if (c == 1) {
            awv = new bcx(uri, m5839a(this.f7770e), new bcr(this.f7771f));
        } else if (c != 2) {
            awv = new awo(uri, this.f7771f, new aog());
        } else {
            HlsMediaSource$Factory hlsMediaSource$Factory = new HlsMediaSource$Factory(this.f7771f);
            bbf bbf = hlsMediaSource$Factory.f6220a;
            bbh bbh = hlsMediaSource$Factory.f6221b;
            awl awl = hlsMediaSource$Factory.f6222c;
            anu anu = hlsMediaSource$Factory.f6223d;
            bip bip = hlsMediaSource$Factory.f6224e;
            awv = new bbk(uri, bbf, bbh, awl, anu, bip, new bcc(bbf, bip), hlsMediaSource$Factory.f6225f);
        }
        ald ald = this.f7766a;
        ald.mo523u();
        awv awv2 = ald.f660r;
        if (awv2 != null) {
            awv2.mo1470a(ald.f653k);
            ald.f653k.mo566l();
        }
        ald.f660r = awv;
        awv.mo1467a(ald.f645c, ald.f653k);
        aiv aiv = ald.f654l;
        if (ald.mo394h()) {
            i = aiv.mo334a();
        } else {
            i = -1;
        }
        ald.mo521a(ald.mo394h(), i);
        ajy ajy = ald.f644b;
        akp a = ajy.mo384a(true, true, true, 2);
        ajy.f487l = true;
        ajy.f486k++;
        ajy.f479d.f516a.mo2042a(0, 1, 1, awv).sendToTarget();
        ajy.mo387a(a, false, 4, 1, false);
        this.f7768c.mo1920a(this.f7766a);
        this.f7766a.mo520a(new cwj(this));
        this.f7766a.mo388a(new cwk(this));
    }

    /* renamed from: a */
    public final void mo3885a(boolean z) {
        this.f7766a.mo389a(true);
    }

    /* renamed from: a */
    public final void mo3884a(cwh cwh) {
        this.f7769d = cwh;
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
    /* renamed from: a */
    public final void mo3882a(float f) {
        ald ald = this.f7766a;
        ald.mo523u();
        float a = blm.m3622a(f, 0.0f, 1.0f);
        if (ald.f659q != a) {
            ald.f659q = a;
            ald.mo522t();
            Iterator it = ald.f647e.iterator();
            while (it.hasNext()) {
                ((als) it.next()).mo570p();
            }
        }
    }

    /* renamed from: d */
    public final void mo3888d() {
        ald ald = this.f7766a;
        ald.mo523u();
        ajy ajy = ald.f644b;
        akp a = ajy.mo384a(false, false, false, 1);
        ajy.f486k++;
        ajy.f479d.f516a.mo2041a(6, 0).sendToTarget();
        ajy.mo387a(a, false, 4, 1, false);
        awv awv = ald.f660r;
        if (awv != null) {
            awv.mo1470a(ald.f653k);
            ald.f653k.mo566l();
        }
        ald.f654l.mo335b();
        ald.f661s = Collections.emptyList();
        this.f7766a.mo520a((bmk) null);
        this.f7768c.mo1920a((akt) null);
    }
}
