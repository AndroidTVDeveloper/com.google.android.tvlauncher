package p000;

import com.google.android.tvlauncher.doubleclick.proto.VideoCreative$VastTracking$Builder;

/* renamed from: cmx */
/* compiled from: PG */
public final class cmx extends dje implements dkl {

    /* renamed from: d */
    public static final cmx f6059d;

    /* renamed from: a */
    public int f6060a;

    /* renamed from: b */
    public String f6061b = "";

    /* renamed from: c */
    public String f6062c = "";

    /* renamed from: e */
    private byte f6063e = 2;

    static {
        cmx cmx = new cmx();
        f6059d = cmx;
        dje.m6693a(cmx.class, cmx);
    }

    private cmx() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3114a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f6063e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f6063e = b;
            return null;
        } else if (i2 == 2) {
            return m6691a(f6059d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001Ԉ\u0000\u0002Ԉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cmx();
        } else {
            if (i2 != 4) {
                return f6059d;
            }
            return new VideoCreative$VastTracking$Builder((byte) 0);
        }
    }
}
