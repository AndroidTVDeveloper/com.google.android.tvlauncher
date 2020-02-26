package defpackage;

/* renamed from: apu  reason: default package */
/* compiled from: PG */
public class apu {
    public final int d;

    public apu(int i) {
        this.d = i;
    }

    public static int c(int i) {
        return i >>> 24;
    }

    public static int d(int i) {
        return i & 16777215;
    }

    public static String e(int i) {
        StringBuilder sb = new StringBuilder(4);
        sb.append((char) (i >>> 24));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        return sb.toString();
    }

    public String toString() {
        return e(this.d);
    }
}
