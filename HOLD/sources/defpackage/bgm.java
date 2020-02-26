package defpackage;

import java.util.Arrays;

/* renamed from: bgm  reason: default package */
/* compiled from: PG */
public final class bgm {
    public final int a;
    private final bgl[] b;
    private int c;

    public bgm(bgl... bglArr) {
        this.b = bglArr;
        this.a = bglArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.b, ((bgm) obj).b);
    }

    public final bgl a(int i) {
        return this.b[i];
    }

    public final bgl[] a() {
        return (bgl[]) this.b.clone();
    }

    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.b) + 527;
        this.c = hashCode;
        return hashCode;
    }
}
