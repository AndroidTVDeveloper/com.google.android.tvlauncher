package defpackage;

import android.os.SystemClock;

/* renamed from: bbd  reason: default package */
/* compiled from: PG */
final class bbd extends bfy {
    private int a;

    public bbd(ayc ayc, int[] iArr) {
        super(ayc, iArr);
        this.a = a(ayc.a(0));
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return 0;
    }

    public final Object c() {
        return null;
    }

    public final void a(long j, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (b(this.a, elapsedRealtime)) {
            int i = this.b - 1;
            while (i >= 0) {
                if (b(i, elapsedRealtime)) {
                    i--;
                } else {
                    this.a = i;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }
}
