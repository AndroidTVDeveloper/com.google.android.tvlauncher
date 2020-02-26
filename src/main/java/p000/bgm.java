package p000;

import java.util.Arrays;

/* renamed from: bgm */
/* compiled from: PG */
public final class bgm {

    /* renamed from: a */
    public final int f3809a;

    /* renamed from: b */
    private final bgl[] f3810b;

    /* renamed from: c */
    private int f3811c;

    public bgm(bgl... bglArr) {
        this.f3810b = bglArr;
        this.f3809a = bglArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f3810b, ((bgm) obj).f3810b);
    }

    /* renamed from: a */
    public final bgl mo1861a(int i) {
        return this.f3810b[i];
    }

    /* renamed from: a */
    public final bgl[] mo1862a() {
        return (bgl[]) this.f3810b.clone();
    }

    public final int hashCode() {
        int i = this.f3811c;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f3810b) + 527;
        this.f3811c = hashCode;
        return hashCode;
    }
}
