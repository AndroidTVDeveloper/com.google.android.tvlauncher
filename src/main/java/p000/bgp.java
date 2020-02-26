package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: bgp */
/* compiled from: PG */
public class bgp implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bgn();

    /* renamed from: A */
    public final int f3827A;

    /* renamed from: w */
    public final String f3828w;

    /* renamed from: x */
    public final String f3829x;

    /* renamed from: y */
    public final int f3830y;

    /* renamed from: z */
    public final boolean f3831z;

    static {
        new bgp();
    }

    public int describeContents() {
        return 0;
    }

    public bgp(Parcel parcel) {
        this.f3828w = parcel.readString();
        this.f3829x = parcel.readString();
        this.f3830y = parcel.readInt();
        this.f3831z = blm.m3650a(parcel);
        this.f3827A = parcel.readInt();
    }

    public bgp() {
        this.f3828w = blm.m3665b((String) null);
        this.f3829x = blm.m3665b((String) null);
        this.f3830y = 0;
        this.f3831z = false;
        this.f3827A = 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bgp bgp = (bgp) obj;
        return TextUtils.equals(this.f3828w, bgp.f3828w) && TextUtils.equals(this.f3829x, bgp.f3829x) && this.f3830y == bgp.f3830y && this.f3831z == bgp.f3831z && this.f3827A == bgp.f3827A;
    }

    public int hashCode() {
        String str = this.f3828w;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 31) * 31;
        String str2 = this.f3829x;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((((hashCode + i) * 31) + this.f3830y) * 31) + (this.f3831z ? 1 : 0)) * 31) + this.f3827A;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3828w);
        parcel.writeString(this.f3829x);
        parcel.writeInt(this.f3830y);
        blm.m3643a(parcel, this.f3831z);
        parcel.writeInt(this.f3827A);
    }
}
