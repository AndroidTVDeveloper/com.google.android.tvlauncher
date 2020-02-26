package p000;

import com.google.android.tvlauncher.doubleclick.proto.VideoCreative$VastCompanion$Builder;

/* renamed from: cmt */
/* compiled from: PG */
public final class cmt extends dje implements dkl {

    /* renamed from: m */
    public static final cmt f6013m;

    /* renamed from: a */
    public int f6014a;

    /* renamed from: b */
    public String f6015b = "";

    /* renamed from: c */
    public String f6016c = "";

    /* renamed from: d */
    public String f6017d = "";

    /* renamed from: e */
    public String f6018e = "";

    /* renamed from: f */
    public String f6019f = "";

    /* renamed from: g */
    public int f6020g;

    /* renamed from: h */
    public int f6021h;

    /* renamed from: i */
    public int f6022i;

    /* renamed from: j */
    public int f6023j;

    /* renamed from: k */
    public String f6024k = "";

    /* renamed from: l */
    public djk f6025l = dku.f8736b;

    /* renamed from: n */
    private byte f6026n = 2;

    static {
        cmt cmt = new cmt();
        f6013m = cmt;
        dje.m6693a(cmt.class, cmt);
    }

    private cmt() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3114a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f6026n);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f6026n = b;
            return null;
        } else if (i2 == 2) {
            return m6691a(f6013m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0001\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\u0004\u0005\u0007\u0004\u0006\b\u0004\u0007\t\u0004\b\n\b\t\u000bЛ", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", cmx.class});
        } else if (i2 == 3) {
            return new cmt();
        } else {
            if (i2 != 4) {
                return f6013m;
            }
            return new VideoCreative$VastCompanion$Builder((byte) 0);
        }
    }

    /* renamed from: a */
    public final void mo3116a() {
        if (!this.f6025l.mo4374a()) {
            this.f6025l = dje.m6690a(this.f6025l);
        }
    }
}
