package defpackage;

import java.util.Arrays;

/* renamed from: aou  reason: default package */
/* compiled from: PG */
public final class aou {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public aou(int i, byte[] bArr, int i2, int i3) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aou aou = (aou) obj;
        return this.a == aou.a && this.c == aou.c && this.d == aou.d && Arrays.equals(this.b, aou.b);
    }

    public final int hashCode() {
        return (((((this.a * 31) + Arrays.hashCode(this.b)) * 31) + this.c) * 31) + this.d;
    }
}
