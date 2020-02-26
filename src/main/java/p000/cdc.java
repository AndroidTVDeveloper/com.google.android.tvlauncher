package p000;

import android.os.SystemClock;
import java.util.Collections;
import java.util.List;

/* renamed from: cdc */
/* compiled from: PG */
public final class cdc {

    /* renamed from: a */
    public final String f5305a;

    /* renamed from: b */
    public final long f5306b;

    /* renamed from: c */
    public final long f5307c;

    /* renamed from: d */
    public final long f5308d;

    /* renamed from: e */
    public volatile List f5309e;

    /* renamed from: f */
    public final int f5310f = 1;

    /* renamed from: g */
    public final int f5311g;

    static {
        new cdc("", SystemClock.elapsedRealtime(), -1, Thread.currentThread().getId(), 3);
    }

    private cdc(String str, long j, long j2, long j3, int i) {
        this.f5305a = str;
        this.f5306b = j;
        this.f5307c = j2;
        this.f5308d = j3;
        this.f5311g = i;
        this.f5309e = Collections.emptyList();
    }

    /* renamed from: a */
    public static cdc m4560a(ccj ccj, String str, long j, long j2, long j3, int i) {
        cev.m4629a(ccj);
        return new cdc(str, j, j2, j3, i);
    }
}
