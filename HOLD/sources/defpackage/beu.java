package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: beu  reason: default package */
/* compiled from: PG */
final class beu implements bdl {
    private final bdj[] a;
    private final long[] b;

    public beu(bdj[] bdjArr, long[] jArr) {
        this.a = bdjArr;
        this.b = jArr;
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
    public final List b(long j) {
        int a2 = blm.a(this.b, j, false);
        if (a2 == -1 || this.a[a2] == bdj.a) {
            return Collections.emptyList();
        }
        return Collections.singletonList(this.a[a2]);
    }

    public final long a(int i) {
        boolean z = true;
        bks.a(i >= 0);
        if (i >= this.b.length) {
            z = false;
        }
        bks.a(z);
        return this.b[i];
    }

    public final int b() {
        return this.b.length;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blm.a(long[], long, boolean, boolean):int
     arg types: [long[], long, int, int]
     candidates:
      blm.a(long, alb, long, long):long
      blm.a(long[], long, boolean, boolean):int */
    public final int a(long j) {
        int a2 = blm.a(this.b, j, false, false);
        if (a2 >= this.b.length) {
            return -1;
        }
        return a2;
    }
}
