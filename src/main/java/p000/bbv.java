package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: bbv */
/* compiled from: PG */
public final class bbv implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bbu();

    /* renamed from: a */
    private final long f3188a;

    /* renamed from: b */
    private final String f3189b;

    /* renamed from: c */
    private final String f3190c;

    /* renamed from: d */
    private final String f3191d;

    /* renamed from: e */
    private final String f3192e;

    public final int describeContents() {
        return 0;
    }

    public bbv(long j, String str, String str2, String str3, String str4) {
        this.f3188a = j;
        this.f3189b = str;
        this.f3190c = str2;
        this.f3191d = str3;
        this.f3192e = str4;
    }

    public bbv(Parcel parcel) {
        this.f3188a = parcel.readLong();
        this.f3189b = parcel.readString();
        this.f3190c = parcel.readString();
        this.f3191d = parcel.readString();
        this.f3192e = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bbv bbv = (bbv) obj;
        return this.f3188a == bbv.f3188a && TextUtils.equals(this.f3189b, bbv.f3189b) && TextUtils.equals(this.f3190c, bbv.f3190c) && TextUtils.equals(this.f3191d, bbv.f3191d) && TextUtils.equals(this.f3192e, bbv.f3192e);
    }

    public final int hashCode() {
        long j = this.f3188a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f3189b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f3190c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f3191d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f3192e;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f3188a);
        parcel.writeString(this.f3189b);
        parcel.writeString(this.f3190c);
        parcel.writeString(this.f3191d);
        parcel.writeString(this.f3192e);
    }
}
