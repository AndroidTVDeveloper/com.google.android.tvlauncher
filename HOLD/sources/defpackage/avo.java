package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: avo  reason: default package */
/* compiled from: PG */
public final class avo extends avp {
    public static final Parcelable.Creator CREATOR = new avn();
    private final long a;
    private final long b;
    private final byte[] c;

    private avo(long j, byte[] bArr, long j2) {
        this.a = j2;
        this.b = j;
        this.c = bArr;
    }

    public /* synthetic */ avo(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        byte[] bArr = new byte[parcel.readInt()];
        this.c = bArr;
        parcel.readByteArray(bArr);
    }

    static avo a(bky bky, int i, long j) {
        long h = bky.h();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        bky.a(bArr, 0, i2);
        return new avo(h, bArr, j);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c.length);
        parcel.writeByteArray(this.c);
    }
}
