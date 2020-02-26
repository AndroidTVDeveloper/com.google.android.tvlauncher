package p000;

/* renamed from: apu */
/* compiled from: PG */
public class apu {

    /* renamed from: d */
    public final int f1735d;

    public apu(int i) {
        this.f1735d = i;
    }

    /* renamed from: c */
    public static int m1767c(int i) {
        return i >>> 24;
    }

    /* renamed from: d */
    public static int m1768d(int i) {
        return i & 16777215;
    }

    /* renamed from: e */
    public static String m1769e(int i) {
        StringBuilder sb = new StringBuilder(4);
        sb.append((char) (i >>> 24));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        return sb.toString();
    }

    public String toString() {
        return m1769e(this.f1735d);
    }
}
