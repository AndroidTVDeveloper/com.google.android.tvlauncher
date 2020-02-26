package defpackage;

import com.google.android.tvlauncher.doubleclick.proto.VideoCreative$VastXml$Builder;

/* renamed from: cmy  reason: default package */
/* compiled from: PG */
public final class cmy extends dje implements dkl {
    public static final cmy y;
    private byte C = 2;
    public int a;
    public String b = "";
    public int c;
    public String d = "";
    public djk e = dku.b;
    public djk f = dku.b;
    public String g = "";
    public djk h = dku.b;
    public djk i = dku.b;
    public djk j = dku.b;
    public djk k = dku.b;
    public djk l = dku.b;
    public String m = "";
    public int n;
    public boolean o;
    public String p = "";
    public String q = "";
    public djk r = dku.b;
    public String s = "";
    public String t = "";
    public int u;
    public boolean v;
    public int w;
    public cmx x;

    static {
        cmy cmy = new cmy();
        y = cmy;
        dje.a(cmy.class, cmy);
    }

    private cmy() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.C);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.C = b2;
            return null;
        } else if (i3 == 2) {
            return a(y, "\u0001\u0017\u0000\u0001\u0001\u0017\u0017\u0000\b\u0007\u0001\b\u0000\u0002\u0004\u0001\u0003\b\u0002\u0004Л\u0005Л\u0006\b\u0003\u0007Л\bЛ\tЛ\n\u001b\u000bЛ\f\b\u0004\r\u0004\u0005\u000e\u0007\u0006\u000f\b\u0007\u0010\b\b\u0011\u001b\u0012\b\t\u0013\b\n\u0014\u0004\u000b\u0015\u0007\f\u0016\u0004\r\u0017Љ\u000e", new Object[]{"a", "b", "c", "d", "e", cmv.class, "f", cmt.class, "g", "h", cmx.class, "i", cmx.class, "j", cmx.class, "k", cmw.class, "l", cmx.class, "m", "n", "o", "p", "q", "r", cmu.class, "s", "t", "u", "v", "w", "x"});
        } else if (i3 == 3) {
            return new cmy();
        } else {
            if (i3 != 4) {
                return y;
            }
            return new VideoCreative$VastXml$Builder((byte) 0);
        }
    }

    public final void d() {
        if (!this.i.a()) {
            this.i = dje.a(this.i);
        }
    }

    public final void b() {
        if (!this.f.a()) {
            this.f = dje.a(this.f);
        }
    }

    public final void e() {
        if (!this.j.a()) {
            this.j = dje.a(this.j);
        }
    }

    public final void c() {
        if (!this.h.a()) {
            this.h = dje.a(this.h);
        }
    }

    public final void h() {
        if (!this.r.a()) {
            this.r = dje.a(this.r);
        }
    }

    public final void a() {
        if (!this.e.a()) {
            this.e = dje.a(this.e);
        }
    }

    public final void f() {
        if (!this.k.a()) {
            this.k = dje.a(this.k);
        }
    }

    public final void g() {
        if (!this.l.a()) {
            this.l = dje.a(this.l);
        }
    }
}
