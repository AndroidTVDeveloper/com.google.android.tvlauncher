package p000;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: ayg */
/* compiled from: PG */
public final class ayg {

    /* renamed from: a */
    public final int[] f2754a = new int[0];

    /* renamed from: b */
    private final Uri[] f2755b = new Uri[0];

    /* renamed from: c */
    private final long[] f2756c = new long[0];

    public ayg() {
        bks.m3510a(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ayg ayg = (ayg) obj;
        return Arrays.equals(this.f2755b, ayg.f2755b) && Arrays.equals(this.f2754a, ayg.f2754a) && Arrays.equals(this.f2756c, ayg.f2756c);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f2755b) - 31) * 31) + Arrays.hashCode(this.f2754a)) * 31) + Arrays.hashCode(this.f2756c);
    }
}
