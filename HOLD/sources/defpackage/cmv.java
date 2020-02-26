package defpackage;

import com.google.android.tvlauncher.doubleclick.proto.VideoCreative$VastMedia$Builder;

/* renamed from: cmv  reason: default package */
/* compiled from: PG */
public final class cmv extends dje implements dkl {
    public static final cmv k;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public int e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public String j = "";
    private byte l = 2;

    static {
        cmv cmv = new cmv();
        k = cmv;
        dje.a(cmv.class, cmv);
    }

    private cmv() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.l);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.l = b2;
            return null;
        } else if (i3 == 2) {
            return a(k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0003\u0001Ԉ\u0000\u0002Ԉ\u0001\u0003Ԉ\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u0004\u0005\u0007\u0007\u0006\b\u0007\u0007\t\b\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i3 == 3) {
            return new cmv();
        } else {
            if (i3 != 4) {
                return k;
            }
            return new VideoCreative$VastMedia$Builder((byte) 0);
        }
    }
}
