package p000;

import java.util.Arrays;

/* renamed from: bpk */
/* compiled from: PG */
public final class bpk {

    /* renamed from: a */
    public final bok f4542a;

    /* renamed from: b */
    private final int f4543b;

    public bpk(bok bok) {
        this.f4542a = bok;
        this.f4543b = Arrays.hashCode(new Object[]{bok, null});
    }

    public final int hashCode() {
        return this.f4543b;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof bpk) && bty.m4184a(this.f4542a, ((bpk) obj).f4542a) && bty.m4184a(null, null);
        }
        return true;
    }
}
