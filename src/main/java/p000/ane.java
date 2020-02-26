package p000;

/* renamed from: ane */
/* compiled from: PG */
public class ane {

    /* renamed from: a */
    public int f1407a;

    /* renamed from: b */
    public final boolean mo1140b(int i) {
        return (this.f1407a & i) == i;
    }

    /* renamed from: n */
    public final void mo1143n(int i) {
        this.f1407a = i | this.f1407a;
    }

    /* renamed from: a */
    public void mo1139a() {
        this.f1407a = 0;
    }

    /* renamed from: d */
    public final boolean mo1142d() {
        return mo1140b(268435456);
    }

    /* renamed from: T */
    public final boolean mo1138T() {
        return mo1140b(Integer.MIN_VALUE);
    }

    /* renamed from: c */
    public final boolean mo1141c() {
        return mo1140b(4);
    }
}
