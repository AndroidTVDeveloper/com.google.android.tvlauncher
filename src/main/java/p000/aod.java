package p000;

import java.util.Arrays;

/* renamed from: aod */
/* compiled from: PG */
public final class aod implements aos {

    /* renamed from: a */
    public final int f1476a;

    /* renamed from: b */
    public final int[] f1477b;

    /* renamed from: c */
    public final long[] f1478c;

    /* renamed from: d */
    public final long[] f1479d;

    /* renamed from: e */
    public final long[] f1480e;

    /* renamed from: f */
    private final long f1481f;

    public aod(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f1477b = iArr;
        this.f1478c = jArr;
        this.f1479d = jArr2;
        this.f1480e = jArr3;
        int length = iArr.length;
        this.f1476a = length;
        if (length > 0) {
            int i = length - 1;
            this.f1481f = jArr2[i] + jArr3[i];
            return;
        }
        this.f1481f = 0;
    }

    /* renamed from: b */
    public final long mo1175b() {
        return this.f1481f;
    }

    /* renamed from: d */
    public final boolean mo1177d() {
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blm.a(long[], long, boolean):int
     arg types: [long[], long, int]
     candidates:
      blm.a(float, float, float):float
      blm.a(int, int, int):int
      blm.a(java.util.List, java.lang.Comparable, boolean):int
      blm.a(long, long, long):long
      blm.a(java.lang.StringBuilder, java.util.Formatter, long):java.lang.String
      blm.a(byte[], int, int):java.lang.String
      blm.a(java.util.List, int, int):void
      blm.a(bky, bky, java.util.zip.Inflater):boolean
      blm.a(long[], long, boolean):int */
    /* renamed from: b */
    public final int mo1185b(long j) {
        return blm.m3628a(this.f1480e, j, true);
    }

    /* renamed from: d */
    public final aoq mo1176d(long j) {
        int b = mo1185b(j);
        aot aot = new aot(this.f1480e[b], this.f1478c[b]);
        if (aot.f1520b >= j || b == this.f1476a - 1) {
            return new aoq(aot);
        }
        int i = b + 1;
        return new aoq(aot, new aot(this.f1480e[i], this.f1478c[i]));
    }

    public final String toString() {
        int i = this.f1476a;
        String arrays = Arrays.toString(this.f1477b);
        String arrays2 = Arrays.toString(this.f1478c);
        String arrays3 = Arrays.toString(this.f1480e);
        String arrays4 = Arrays.toString(this.f1479d);
        int length = String.valueOf(arrays).length();
        int length2 = String.valueOf(arrays2).length();
        StringBuilder sb = new StringBuilder(length + 71 + length2 + String.valueOf(arrays3).length() + String.valueOf(arrays4).length());
        sb.append("ChunkIndex(length=");
        sb.append(i);
        sb.append(", sizes=");
        sb.append(arrays);
        sb.append(", offsets=");
        sb.append(arrays2);
        sb.append(", timeUs=");
        sb.append(arrays3);
        sb.append(", durationsUs=");
        sb.append(arrays4);
        sb.append(")");
        return sb.toString();
    }
}
