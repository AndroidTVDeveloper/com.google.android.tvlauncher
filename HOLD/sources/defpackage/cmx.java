package defpackage;

import com.google.android.tvlauncher.doubleclick.proto.VideoCreative$VastTracking$Builder;

/* renamed from: cmx  reason: default package */
/* compiled from: PG */
public final class cmx extends dje implements dkl {
    public static final cmx d;
    public int a;
    public String b = "";
    public String c = "";
    private byte e = 2;

    static {
        cmx cmx = new cmx();
        d = cmx;
        dje.a(cmx.class, cmx);
    }

    private cmx() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.e = b2;
            return null;
        } else if (i2 == 2) {
            return a(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001Ԉ\u0000\u0002Ԉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cmx();
        } else {
            if (i2 != 4) {
                return d;
            }
            return new VideoCreative$VastTracking$Builder((byte) 0);
        }
    }
}
