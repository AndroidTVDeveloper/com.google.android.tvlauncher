package defpackage;

import java.util.Arrays;

/* renamed from: bpk  reason: default package */
/* compiled from: PG */
public final class bpk {
    public final bok a;
    private final int b;

    public bpk(bok bok) {
        this.a = bok;
        this.b = Arrays.hashCode(new Object[]{bok, null});
    }

    public final int hashCode() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof bpk) && bty.a(this.a, ((bpk) obj).a) && bty.a(null, null);
        }
        return true;
    }
}
