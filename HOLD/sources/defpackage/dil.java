package defpackage;

/* renamed from: dil  reason: default package */
/* compiled from: PG */
public final class dil {
    public int a;
    public int b;
    public int c;

    public /* synthetic */ dil(int i) {
        this.c = Integer.MAX_VALUE;
        this.a = i;
    }

    public static int a(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    private dil() {
    }
}
