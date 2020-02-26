package p000;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: bie */
/* compiled from: PG */
public final class bie implements bhv {

    /* renamed from: a */
    private final Context f4041a;

    /* renamed from: b */
    private final List f4042b = new ArrayList();

    /* renamed from: c */
    private final bhv f4043c;

    /* renamed from: d */
    private bhv f4044d;

    /* renamed from: e */
    private bhv f4045e;

    /* renamed from: f */
    private bhv f4046f;

    /* renamed from: g */
    private bhv f4047g;

    /* renamed from: h */
    private bhv f4048h;

    /* renamed from: i */
    private bhv f4049i;

    /* renamed from: j */
    private bhv f4050j;

    /* renamed from: k */
    private bhv f4051k;

    public bie(Context context, bhv bhv) {
        this.f4041a = context.getApplicationContext();
        this.f4043c = (bhv) bks.m3507a(bhv);
    }

    /* renamed from: a */
    private final void m3319a(bhv bhv) {
        for (int i = 0; i < this.f4042b.size(); i++) {
            bhv.mo1501a((bjf) this.f4042b.get(i));
        }
    }

    /* renamed from: a */
    public final void mo1501a(bjf bjf) {
        this.f4043c.mo1501a(bjf);
        this.f4042b.add(bjf);
        m3320a(this.f4044d, bjf);
        m3320a(this.f4045e, bjf);
        m3320a(this.f4046f, bjf);
        m3320a(this.f4047g, bjf);
        m3320a(this.f4048h, bjf);
        m3320a(this.f4049i, bjf);
        m3320a(this.f4050j, bjf);
    }

    /* renamed from: c */
    public final void mo1503c() {
        bhv bhv = this.f4051k;
        if (bhv != null) {
            try {
                bhv.mo1503c();
            } finally {
                this.f4051k = null;
            }
        }
    }

    /* renamed from: d */
    private final bhv m3321d() {
        if (this.f4045e == null) {
            bhm bhm = new bhm(this.f4041a);
            this.f4045e = bhm;
            m3319a(bhm);
        }
        return this.f4045e;
    }

    /* renamed from: b */
    public final Map mo1502b() {
        bhv bhv = this.f4051k;
        return bhv == null ? Collections.emptyMap() : bhv.mo1502b();
    }

    /* renamed from: a */
    public final Uri mo1500a() {
        bhv bhv = this.f4051k;
        if (bhv != null) {
            return bhv.mo1500a();
        }
        return null;
    }

    /* renamed from: a */
    private static final void m3320a(bhv bhv, bjf bjf) {
        if (bhv != null) {
            bhv.mo1501a(bjf);
        }
    }

    /* renamed from: a */
    public final long mo1499a(bhy bhy) {
        bks.m3512b(this.f4051k == null);
        String scheme = bhy.f3998a.getScheme();
        if (blm.m3649a(bhy.f3998a)) {
            String path = bhy.f3998a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f4044d == null) {
                    bij bij = new bij();
                    this.f4044d = bij;
                    m3319a(bij);
                }
                this.f4051k = this.f4044d;
            } else {
                this.f4051k = m3321d();
            }
        } else if ("asset".equals(scheme)) {
            this.f4051k = m3321d();
        } else if ("content".equals(scheme)) {
            if (this.f4046f == null) {
                bhq bhq = new bhq(this.f4041a);
                this.f4046f = bhq;
                m3319a(bhq);
            }
            this.f4051k = this.f4046f;
        } else if ("rtmp".equals(scheme)) {
            if (this.f4047g == null) {
                try {
                    bhv bhv = (bhv) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.f4047g = bhv;
                    m3319a(bhv);
                } catch (ClassNotFoundException e) {
                    Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e2) {
                    throw new RuntimeException("Error instantiating RTMP extension", e2);
                }
                if (this.f4047g == null) {
                    this.f4047g = this.f4043c;
                }
            }
            this.f4051k = this.f4047g;
        } else if ("udp".equals(scheme)) {
            if (this.f4048h == null) {
                bjh bjh = new bjh();
                this.f4048h = bjh;
                m3319a(bjh);
            }
            this.f4051k = this.f4048h;
        } else if ("data".equals(scheme)) {
            if (this.f4049i == null) {
                bhr bhr = new bhr();
                this.f4049i = bhr;
                m3319a(bhr);
            }
            this.f4051k = this.f4049i;
        } else if (!"rawresource".equals(scheme)) {
            this.f4051k = this.f4043c;
        } else {
            if (this.f4050j == null) {
                bjc bjc = new bjc(this.f4041a);
                this.f4050j = bjc;
                m3319a(bjc);
            }
            this.f4051k = this.f4050j;
        }
        return this.f4051k.mo1499a(bhy);
    }

    /* renamed from: a */
    public final int mo1498a(byte[] bArr, int i, int i2) {
        return ((bhv) bks.m3507a(this.f4051k)).mo1498a(bArr, i, i2);
    }
}
