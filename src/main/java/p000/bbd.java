package p000;

import android.os.SystemClock;

/* renamed from: bbd */
/* compiled from: PG */
final class bbd extends bfy {

    /* renamed from: a */
    private int f3051a;

    public bbd(ayc ayc, int[] iArr) {
        super(ayc, iArr);
        this.f3051a = mo1827a(ayc.mo1604a(0));
    }

    /* renamed from: a */
    public final int mo1709a() {
        return this.f3051a;
    }

    /* renamed from: b */
    public final int mo1711b() {
        return 0;
    }

    /* renamed from: c */
    public final Object mo1712c() {
        return null;
    }

    /* renamed from: a */
    public final void mo1710a(long j, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (mo1831b(this.f3051a, elapsedRealtime)) {
            int i = this.f3743b - 1;
            while (i >= 0) {
                if (mo1831b(i, elapsedRealtime)) {
                    i--;
                } else {
                    this.f3051a = i;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }
}
