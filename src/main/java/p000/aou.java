package p000;

import java.util.Arrays;

/* renamed from: aou */
/* compiled from: PG */
public final class aou {

    /* renamed from: a */
    public final int f1522a;

    /* renamed from: b */
    public final byte[] f1523b;

    /* renamed from: c */
    public final int f1524c;

    /* renamed from: d */
    public final int f1525d;

    public aou(int i, byte[] bArr, int i2, int i3) {
        this.f1522a = i;
        this.f1523b = bArr;
        this.f1524c = i2;
        this.f1525d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aou aou = (aou) obj;
        return this.f1522a == aou.f1522a && this.f1524c == aou.f1524c && this.f1525d == aou.f1525d && Arrays.equals(this.f1523b, aou.f1523b);
    }

    public final int hashCode() {
        return (((((this.f1522a * 31) + Arrays.hashCode(this.f1523b)) * 31) + this.f1524c) * 31) + this.f1525d;
    }
}
