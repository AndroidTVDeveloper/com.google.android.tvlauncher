package p000;

import com.google.android.tvlauncher.doubleclick.proto.VideoCreative$VastImpression$Builder;

/* renamed from: cmu */
/* compiled from: PG */
public final class cmu extends dje implements dkl {

    /* renamed from: d */
    public static final cmu f6027d;

    /* renamed from: a */
    public int f6028a;

    /* renamed from: b */
    public String f6029b = "";

    /* renamed from: c */
    public String f6030c = "";

    static {
        cmu cmu = new cmu();
        f6027d = cmu;
        dje.m6693a(cmu.class, cmu);
    }

    private cmu() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3114a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return m6691a(f6027d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 != 3) {
            return i2 != 4 ? f6027d : new VideoCreative$VastImpression$Builder((byte) 0);
        } else {
            return new cmu();
        }
    }
}
