package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: awb */
/* compiled from: PG */
public final class awb extends avp {
    public static final Parcelable.Creator CREATOR = new awa();

    /* renamed from: a */
    private final long f2535a;

    /* renamed from: b */
    private final long f2536b;

    public awb(long j, long j2) {
        this.f2535a = j;
        this.f2536b = j2;
    }

    public /* synthetic */ awb(long j, long j2, byte b) {
        this(j, j2);
    }

    /* renamed from: a */
    static long m2194a(bky bky, long j) {
        long d = (long) bky.mo2074d();
        if ((128 & d) != 0) {
            return 8589934591L & ((((d & 1) << 32) | bky.mo2081h()) + j);
        }
        return -9223372036854775807L;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f2535a);
        parcel.writeLong(this.f2536b);
    }
}
