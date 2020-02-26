package p000;

/* renamed from: azw */
/* compiled from: PG */
final class azw implements axx {

    /* renamed from: a */
    public bag f2938a;

    /* renamed from: b */
    private final akh f2939b;

    /* renamed from: c */
    private final aug f2940c = new aug();

    /* renamed from: d */
    private long[] f2941d;

    /* renamed from: e */
    private boolean f2942e;

    /* renamed from: f */
    private boolean f2943f;

    /* renamed from: g */
    private int f2944g;

    /* renamed from: h */
    private long f2945h = -9223372036854775807L;

    public azw(bag bag, akh akh, boolean z) {
        this.f2939b = akh;
        this.f2938a = bag;
        this.f2941d = bag.f2994b;
        mo1672a(bag, z);
    }

    /* renamed from: a */
    public final boolean mo1478a() {
        return true;
    }

    /* renamed from: b */
    public final void mo1479b() {
    }

    /* renamed from: a */
    public final int mo1477a(aki aki, anj anj, boolean z) {
        if (!z && this.f2943f) {
            int i = this.f2944g;
            if (i != this.f2941d.length) {
                this.f2944g = i + 1;
                byte[] a = this.f2940c.mo1368a(this.f2938a.f2993a[i]);
                if (a == null) {
                    return -3;
                }
                anj.mo1149c(a.length);
                anj.f1425c.put(a);
                anj.f1426d = this.f2941d[i];
                anj.f1407a = 1;
                return -4;
            } else if (this.f2942e) {
                return -3;
            } else {
                anj.f1407a = 4;
                return -4;
            }
        } else {
            aki.f576c = this.f2939b;
            this.f2943f = true;
            return -5;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blm.a(long[], long, boolean, boolean):int
     arg types: [long[], long, int, int]
     candidates:
      blm.a(long, alb, long, long):long
      blm.a(long[], long, boolean, boolean):int */
    /* renamed from: b */
    public final void mo1673b(long j) {
        boolean z = false;
        int a = blm.m3629a(this.f2941d, j, true, false);
        this.f2944g = a;
        if (this.f2942e && a == this.f2941d.length) {
            z = true;
        }
        if (!z) {
            j = -9223372036854775807L;
        }
        this.f2945h = j;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blm.a(long[], long, boolean, boolean):int
     arg types: [long[], long, int, int]
     candidates:
      blm.a(long, alb, long, long):long
      blm.a(long[], long, boolean, boolean):int */
    /* renamed from: a */
    public final int mo1476a(long j) {
        int max = Math.max(this.f2944g, blm.m3629a(this.f2941d, j, true, false));
        int i = this.f2944g;
        this.f2944g = max;
        return max - i;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blm.a(long[], long, boolean, boolean):int
     arg types: [long[], long, int, int]
     candidates:
      blm.a(long, alb, long, long):long
      blm.a(long[], long, boolean, boolean):int */
    /* renamed from: a */
    public final void mo1672a(bag bag, boolean z) {
        int i = this.f2944g;
        long j = i != 0 ? this.f2941d[i - 1] : -9223372036854775807L;
        this.f2942e = z;
        this.f2938a = bag;
        long[] jArr = bag.f2994b;
        this.f2941d = jArr;
        long j2 = this.f2945h;
        if (j2 != -9223372036854775807L) {
            mo1673b(j2);
        } else if (j != -9223372036854775807L) {
            this.f2944g = blm.m3629a(jArr, j, false, false);
        }
    }
}
