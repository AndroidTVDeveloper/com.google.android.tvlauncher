package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: anp */
/* compiled from: PG */
public final class anp implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ano();

    /* renamed from: a */
    public final UUID f1445a;

    /* renamed from: b */
    public final String f1446b;

    /* renamed from: c */
    public final String f1447c;

    /* renamed from: d */
    private int f1448d;

    /* renamed from: e */
    private final byte[] f1449e;

    /* renamed from: a */
    public final boolean mo1163a() {
        return this.f1449e != null;
    }

    public final int describeContents() {
        return 0;
    }

    public anp(Parcel parcel) {
        this.f1445a = new UUID(parcel.readLong(), parcel.readLong());
        this.f1446b = parcel.readString();
        this.f1447c = (String) blm.m3636a((Object) parcel.readString());
        this.f1449e = parcel.createByteArray();
    }

    public anp(UUID uuid, String str, String str2, byte[] bArr) {
        this.f1445a = (UUID) bks.m3507a(uuid);
        this.f1446b = str;
        this.f1447c = (String) bks.m3507a((Object) str2);
        this.f1449e = bArr;
    }

    public anp(UUID uuid, String str, byte[] bArr) {
        this(uuid, null, str, bArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof anp)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        anp anp = (anp) obj;
        return blm.m3652a(this.f1446b, anp.f1446b) && blm.m3652a(this.f1447c, anp.f1447c) && blm.m3652a(this.f1445a, anp.f1445a) && Arrays.equals(this.f1449e, anp.f1449e);
    }

    public final int hashCode() {
        int i;
        int i2 = this.f1448d;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = this.f1445a.hashCode() * 31;
        String str = this.f1446b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = ((((hashCode + i) * 31) + this.f1447c.hashCode()) * 31) + Arrays.hashCode(this.f1449e);
        this.f1448d = hashCode2;
        return hashCode2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f1445a.getMostSignificantBits());
        parcel.writeLong(this.f1445a.getLeastSignificantBits());
        parcel.writeString(this.f1446b);
        parcel.writeString(this.f1447c);
        parcel.writeByteArray(this.f1449e);
    }
}
