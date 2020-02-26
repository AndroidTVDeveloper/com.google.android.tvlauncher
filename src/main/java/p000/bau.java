package p000;

import java.util.Locale;

/* renamed from: bau */
/* compiled from: PG */
public final class bau {

    /* renamed from: a */
    private final String[] f3033a;

    /* renamed from: b */
    private final int[] f3034b;

    /* renamed from: c */
    private final String[] f3035c;

    /* renamed from: d */
    private final int f3036d;

    public bau(String[] strArr, int[] iArr, String[] strArr2, int i) {
        this.f3033a = strArr;
        this.f3034b = iArr;
        this.f3035c = strArr2;
        this.f3036d = i;
    }

    /* renamed from: a */
    public final String mo1701a(String str, long j, int i, long j2) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int i3 = this.f3036d;
            if (i2 < i3) {
                sb.append(this.f3033a[i2]);
                int i4 = this.f3034b[i2];
                if (i4 == 1) {
                    sb.append(str);
                } else if (i4 == 2) {
                    sb.append(String.format(Locale.US, this.f3035c[i2], Long.valueOf(j)));
                } else if (i4 == 3) {
                    sb.append(String.format(Locale.US, this.f3035c[i2], Integer.valueOf(i)));
                } else if (i4 == 4) {
                    sb.append(String.format(Locale.US, this.f3035c[i2], Long.valueOf(j2)));
                }
                i2++;
            } else {
                sb.append(this.f3033a[i3]);
                return sb.toString();
            }
        }
    }
}
