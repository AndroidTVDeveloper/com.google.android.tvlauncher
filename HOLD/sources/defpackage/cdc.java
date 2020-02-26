package defpackage;

import android.os.SystemClock;
import java.util.Collections;
import java.util.List;

/* renamed from: cdc  reason: default package */
/* compiled from: PG */
public final class cdc {
    public final String a;
    public final long b;
    public final long c;
    public final long d;
    public volatile List e;
    public final int f = 1;
    public final int g;

    static {
        new cdc("", SystemClock.elapsedRealtime(), -1, Thread.currentThread().getId(), 3);
    }

    private cdc(String str, long j, long j2, long j3, int i) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.g = i;
        this.e = Collections.emptyList();
    }

    public static cdc a(ccj ccj, String str, long j, long j2, long j3, int i) {
        cev.a(ccj);
        return new cdc(str, j, j2, j3, i);
    }
}
