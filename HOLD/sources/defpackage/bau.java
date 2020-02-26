package defpackage;

import java.util.Locale;

/* renamed from: bau  reason: default package */
/* compiled from: PG */
public final class bau {
    private final String[] a;
    private final int[] b;
    private final String[] c;
    private final int d;

    public bau(String[] strArr, int[] iArr, String[] strArr2, int i) {
        this.a = strArr;
        this.b = iArr;
        this.c = strArr2;
        this.d = i;
    }

    public final String a(String str, long j, int i, long j2) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int i3 = this.d;
            if (i2 < i3) {
                sb.append(this.a[i2]);
                int i4 = this.b[i2];
                if (i4 == 1) {
                    sb.append(str);
                } else if (i4 == 2) {
                    sb.append(String.format(Locale.US, this.c[i2], Long.valueOf(j)));
                } else if (i4 == 3) {
                    sb.append(String.format(Locale.US, this.c[i2], Integer.valueOf(i)));
                } else if (i4 == 4) {
                    sb.append(String.format(Locale.US, this.c[i2], Long.valueOf(j2)));
                }
                i2++;
            } else {
                sb.append(this.a[i3]);
                return sb.toString();
            }
        }
    }
}
