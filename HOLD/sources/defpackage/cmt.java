package defpackage;

import com.google.android.tvlauncher.doubleclick.proto.VideoCreative$VastCompanion$Builder;

/* renamed from: cmt  reason: default package */
/* compiled from: PG */
public final class cmt extends dje implements dkl {
    public static final cmt m;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public int g;
    public int h;
    public int i;
    public int j;
    public String k = "";
    public djk l = dku.b;
    private byte n = 2;

    static {
        cmt cmt = new cmt();
        m = cmt;
        dje.a(cmt.class, cmt);
    }

    private cmt() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.n);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.n = b2;
            return null;
        } else if (i3 == 2) {
            return a(m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0001\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\u0004\u0005\u0007\u0004\u0006\b\u0004\u0007\t\u0004\b\n\b\t\u000bЛ", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", cmx.class});
        } else if (i3 == 3) {
            return new cmt();
        } else {
            if (i3 != 4) {
                return m;
            }
            return new VideoCreative$VastCompanion$Builder((byte) 0);
        }
    }

    public final void a() {
        if (!this.l.a()) {
            this.l = dje.a(this.l);
        }
    }
}
