package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: bbv  reason: default package */
/* compiled from: PG */
public final class bbv implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bbu();
    private final long a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;

    public final int describeContents() {
        return 0;
    }

    public bbv(long j, String str, String str2, String str3, String str4) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public bbv(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bbv bbv = (bbv) obj;
        return this.a == bbv.a && TextUtils.equals(this.b, bbv.b) && TextUtils.equals(this.c, bbv.c) && TextUtils.equals(this.d, bbv.d) && TextUtils.equals(this.e, bbv.e);
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.e;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
