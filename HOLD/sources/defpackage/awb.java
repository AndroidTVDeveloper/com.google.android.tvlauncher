package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: awb  reason: default package */
/* compiled from: PG */
public final class awb extends avp {
    public static final Parcelable.Creator CREATOR = new awa();
    private final long a;
    private final long b;

    public awb(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public /* synthetic */ awb(long j, long j2, byte b2) {
        this(j, j2);
    }

    static long a(bky bky, long j) {
        long d = (long) bky.d();
        if ((128 & d) != 0) {
            return 8589934591L & ((((d & 1) << 32) | bky.h()) + j);
        }
        return -9223372036854775807L;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
