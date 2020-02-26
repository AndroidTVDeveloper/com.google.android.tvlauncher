package defpackage;

import com.google.android.tvlauncher.doubleclick.proto.VideoCreative$VastImpression$Builder;

/* renamed from: cmu  reason: default package */
/* compiled from: PG */
public final class cmu extends dje implements dkl {
    public static final cmu d;
    public int a;
    public String b = "";
    public String c = "";

    static {
        cmu cmu = new cmu();
        d = cmu;
        dje.a(cmu.class, cmu);
    }

    private cmu() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return a(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 != 3) {
            return i2 != 4 ? d : new VideoCreative$VastImpression$Builder((byte) 0);
        } else {
            return new cmu();
        }
    }
}
