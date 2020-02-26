package defpackage;

/* renamed from: azw  reason: default package */
/* compiled from: PG */
final class azw implements axx {
    public bag a;
    private final akh b;
    private final aug c = new aug();
    private long[] d;
    private boolean e;
    private boolean f;
    private int g;
    private long h = -9223372036854775807L;

    public azw(bag bag, akh akh, boolean z) {
        this.b = akh;
        this.a = bag;
        this.d = bag.b;
        a(bag, z);
    }

    public final boolean a() {
        return true;
    }

    public final void b() {
    }

    public final int a(aki aki, anj anj, boolean z) {
        if (!z && this.f) {
            int i = this.g;
            if (i != this.d.length) {
                this.g = i + 1;
                byte[] a2 = this.c.a(this.a.a[i]);
                if (a2 == null) {
                    return -3;
                }
                anj.c(a2.length);
                anj.c.put(a2);
                anj.d = this.d[i];
                anj.a = 1;
                return -4;
            } else if (this.e) {
                return -3;
            } else {
                anj.a = 4;
                return -4;
            }
        } else {
            aki.c = this.b;
            this.f = true;
            return -5;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blm.a(long[], long, boolean, boolean):int
     arg types: [long[], long, int, int]
     candidates:
      blm.a(long, alb, long, long):long
      blm.a(long[], long, boolean, boolean):int */
    public final void b(long j) {
        boolean z = false;
        int a2 = blm.a(this.d, j, true, false);
        this.g = a2;
        if (this.e && a2 == this.d.length) {
            z = true;
        }
        if (!z) {
            j = -9223372036854775807L;
        }
        this.h = j;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blm.a(long[], long, boolean, boolean):int
     arg types: [long[], long, int, int]
     candidates:
      blm.a(long, alb, long, long):long
      blm.a(long[], long, boolean, boolean):int */
    public final int a(long j) {
        int max = Math.max(this.g, blm.a(this.d, j, true, false));
        int i = this.g;
        this.g = max;
        return max - i;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blm.a(long[], long, boolean, boolean):int
     arg types: [long[], long, int, int]
     candidates:
      blm.a(long, alb, long, long):long
      blm.a(long[], long, boolean, boolean):int */
    public final void a(bag bag, boolean z) {
        int i = this.g;
        long j = i != 0 ? this.d[i - 1] : -9223372036854775807L;
        this.e = z;
        this.a = bag;
        long[] jArr = bag.b;
        this.d = jArr;
        long j2 = this.h;
        if (j2 != -9223372036854775807L) {
            b(j2);
        } else if (j != -9223372036854775807L) {
            this.g = blm.a(jArr, j, false, false);
        }
    }
}
