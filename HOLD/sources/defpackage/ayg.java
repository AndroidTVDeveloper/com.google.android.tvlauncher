package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: ayg  reason: default package */
/* compiled from: PG */
public final class ayg {
    public final int[] a = new int[0];
    private final Uri[] b = new Uri[0];
    private final long[] c = new long[0];

    public ayg() {
        bks.a(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ayg ayg = (ayg) obj;
        return Arrays.equals(this.b, ayg.b) && Arrays.equals(this.a, ayg.a) && Arrays.equals(this.c, ayg.c);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) - 31) * 31) + Arrays.hashCode(this.a)) * 31) + Arrays.hashCode(this.c);
    }
}
