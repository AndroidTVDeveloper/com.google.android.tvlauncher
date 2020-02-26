package p000;

import com.google.android.tvlauncher.doubleclick.proto.VideoCreative$VastMedia$Builder;

/* renamed from: cmv */
/* compiled from: PG */
public final class cmv extends dje implements dkl {

    /* renamed from: k */
    public static final cmv f6031k;

    /* renamed from: a */
    public int f6032a;

    /* renamed from: b */
    public String f6033b = "";

    /* renamed from: c */
    public String f6034c = "";

    /* renamed from: d */
    public String f6035d = "";

    /* renamed from: e */
    public int f6036e;

    /* renamed from: f */
    public int f6037f;

    /* renamed from: g */
    public int f6038g;

    /* renamed from: h */
    public boolean f6039h;

    /* renamed from: i */
    public boolean f6040i;

    /* renamed from: j */
    public String f6041j = "";

    /* renamed from: l */
    private byte f6042l = 2;

    static {
        cmv cmv = new cmv();
        f6031k = cmv;
        dje.m6693a(cmv.class, cmv);
    }

    private cmv() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3114a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f6042l);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f6042l = b;
            return null;
        } else if (i2 == 2) {
            return m6691a(f6031k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0003\u0001Ԉ\u0000\u0002Ԉ\u0001\u0003Ԉ\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u0004\u0005\u0007\u0007\u0006\b\u0007\u0007\t\b\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new cmv();
        } else {
            if (i2 != 4) {
                return f6031k;
            }
            return new VideoCreative$VastMedia$Builder((byte) 0);
        }
    }
}
