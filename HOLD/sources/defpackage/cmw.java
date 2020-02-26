package defpackage;

import com.google.android.tvlauncher.doubleclick.proto.VideoCreative$VastNonLinear$Builder;

/* renamed from: cmw  reason: default package */
/* compiled from: PG */
public final class cmw extends dje implements dkl {
    public static final cmw p;
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
    public boolean l;
    public boolean m;
    public int n;
    public String o = "";

    static {
        cmw cmw = new cmw();
        p = cmw;
        dje.a(cmw.class, cmw);
    }

    private cmw() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 1) {
            return null;
        }
        if (i3 == 2) {
            return a(p, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\u0004\u0005\u0007\u0004\u0006\b\u0004\u0007\t\u0004\b\n\b\t\u000b\u0007\n\f\u0007\u000b\r\u0004\f\u000e\b\r", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
        } else if (i3 != 3) {
            return i3 != 4 ? p : new VideoCreative$VastNonLinear$Builder((byte) 0);
        } else {
            return new cmw();
        }
    }
}
