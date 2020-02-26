package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: avo */
/* compiled from: PG */
public final class avo extends avp {
    public static final Parcelable.Creator CREATOR = new avn();

    /* renamed from: a */
    private final long f2498a;

    /* renamed from: b */
    private final long f2499b;

    /* renamed from: c */
    private final byte[] f2500c;

    private avo(long j, byte[] bArr, long j2) {
        this.f2498a = j2;
        this.f2499b = j;
        this.f2500c = bArr;
    }

    public /* synthetic */ avo(Parcel parcel) {
        this.f2498a = parcel.readLong();
        this.f2499b = parcel.readLong();
        byte[] bArr = new byte[parcel.readInt()];
        this.f2500c = bArr;
        parcel.readByteArray(bArr);
    }

    /* renamed from: a */
    static avo m2188a(bky bky, int i, long j) {
        long h = bky.mo2081h();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        bky.mo2069a(bArr, 0, i2);
        return new avo(h, bArr, j);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f2498a);
        parcel.writeLong(this.f2499b);
        parcel.writeInt(this.f2500c.length);
        parcel.writeByteArray(this.f2500c);
    }
}
