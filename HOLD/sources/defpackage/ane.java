package defpackage;

/* renamed from: ane  reason: default package */
/* compiled from: PG */
public class ane {
    public int a;

    public final boolean b(int i) {
        return (this.a & i) == i;
    }

    public final void n(int i) {
        this.a = i | this.a;
    }

    public void a() {
        this.a = 0;
    }

    public final boolean d() {
        return b(268435456);
    }

    public final boolean T() {
        return b(Integer.MIN_VALUE);
    }

    public final boolean c() {
        return b(4);
    }
}
