package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: bew */
/* compiled from: PG */
final class bew implements bdl {

    /* renamed from: a */
    private final bdj[] f3604a;

    /* renamed from: b */
    private final long[] f3605b;

    public bew(bdj[] bdjArr, long[] jArr) {
        this.f3604a = bdjArr;
        this.f3605b = jArr;
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
    public final List mo1783b(long j) {
        int a = blm.m3628a(this.f3605b, j, false);
        if (a == -1 || this.f3604a[a] == bdj.f3406a) {
            return Collections.emptyList();
        }
        return Collections.singletonList(this.f3604a[a]);
    }

    /* renamed from: a */
    public final long mo1781a(int i) {
        boolean z = true;
        bks.m3510a(i >= 0);
        if (i >= this.f3605b.length) {
            z = false;
        }
        bks.m3510a(z);
        return this.f3605b[i];
    }

    /* renamed from: b */
    public final int mo1782b() {
        return this.f3605b.length;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blm.a(long[], long, boolean, boolean):int
     arg types: [long[], long, int, int]
     candidates:
      blm.a(long, alb, long, long):long
      blm.a(long[], long, boolean, boolean):int */
    /* renamed from: a */
    public final int mo1780a(long j) {
        int a = blm.m3629a(this.f3605b, j, false, false);
        if (a >= this.f3605b.length) {
            return -1;
        }
        return a;
    }
}
