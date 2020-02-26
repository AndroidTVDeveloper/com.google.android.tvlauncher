package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: bie  reason: default package */
/* compiled from: PG */
public final class bie implements bhv {
    private final Context a;
    private final List b = new ArrayList();
    private final bhv c;
    private bhv d;
    private bhv e;
    private bhv f;
    private bhv g;
    private bhv h;
    private bhv i;
    private bhv j;
    private bhv k;

    public bie(Context context, bhv bhv) {
        this.a = context.getApplicationContext();
        this.c = (bhv) bks.a(bhv);
    }

    private final void a(bhv bhv) {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            bhv.a((bjf) this.b.get(i2));
        }
    }

    public final void a(bjf bjf) {
        this.c.a(bjf);
        this.b.add(bjf);
        a(this.d, bjf);
        a(this.e, bjf);
        a(this.f, bjf);
        a(this.g, bjf);
        a(this.h, bjf);
        a(this.i, bjf);
        a(this.j, bjf);
    }

    public final void c() {
        bhv bhv = this.k;
        if (bhv != null) {
            try {
                bhv.c();
            } finally {
                this.k = null;
            }
        }
    }

    private final bhv d() {
        if (this.e == null) {
            bhm bhm = new bhm(this.a);
            this.e = bhm;
            a(bhm);
        }
        return this.e;
    }

    public final Map b() {
        bhv bhv = this.k;
        return bhv == null ? Collections.emptyMap() : bhv.b();
    }

    public final Uri a() {
        bhv bhv = this.k;
        if (bhv != null) {
            return bhv.a();
        }
        return null;
    }

    private static final void a(bhv bhv, bjf bjf) {
        if (bhv != null) {
            bhv.a(bjf);
        }
    }

    public final long a(bhy bhy) {
        bks.b(this.k == null);
        String scheme = bhy.a.getScheme();
        if (blm.a(bhy.a)) {
            String path = bhy.a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.d == null) {
                    bij bij = new bij();
                    this.d = bij;
                    a(bij);
                }
                this.k = this.d;
            } else {
                this.k = d();
            }
        } else if ("asset".equals(scheme)) {
            this.k = d();
        } else if ("content".equals(scheme)) {
            if (this.f == null) {
                bhq bhq = new bhq(this.a);
                this.f = bhq;
                a(bhq);
            }
            this.k = this.f;
        } else if ("rtmp".equals(scheme)) {
            if (this.g == null) {
                try {
                    bhv bhv = (bhv) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.g = bhv;
                    a(bhv);
                } catch (ClassNotFoundException e2) {
                    Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e3) {
                    throw new RuntimeException("Error instantiating RTMP extension", e3);
                }
                if (this.g == null) {
                    this.g = this.c;
                }
            }
            this.k = this.g;
        } else if ("udp".equals(scheme)) {
            if (this.h == null) {
                bjh bjh = new bjh();
                this.h = bjh;
                a(bjh);
            }
            this.k = this.h;
        } else if ("data".equals(scheme)) {
            if (this.i == null) {
                bhr bhr = new bhr();
                this.i = bhr;
                a(bhr);
            }
            this.k = this.i;
        } else if (!"rawresource".equals(scheme)) {
            this.k = this.c;
        } else {
            if (this.j == null) {
                bjc bjc = new bjc(this.a);
                this.j = bjc;
                a(bjc);
            }
            this.k = this.j;
        }
        return this.k.a(bhy);
    }

    public final int a(byte[] bArr, int i2, int i3) {
        return ((bhv) bks.a(this.k)).a(bArr, i2, i3);
    }
}
