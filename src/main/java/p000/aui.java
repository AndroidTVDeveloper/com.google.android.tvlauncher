package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: aui */
/* compiled from: PG */
public final class aui implements atv {
    public static final Parcelable.Creator CREATOR = new auh();

    /* renamed from: a */
    public final int f2439a;

    /* renamed from: b */
    public final byte[] f2440b;

    /* renamed from: c */
    private final String f2441c;

    /* renamed from: d */
    private final String f2442d;

    /* renamed from: e */
    private final int f2443e;

    /* renamed from: f */
    private final int f2444f;

    /* renamed from: g */
    private final int f2445g;

    /* renamed from: h */
    private final int f2446h;

    /* renamed from: a */
    public final akh mo1253a() {
        return null;
    }

    /* renamed from: b */
    public final byte[] mo1254b() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public aui(Parcel parcel) {
        this.f2439a = parcel.readInt();
        this.f2441c = (String) blm.m3636a((Object) parcel.readString());
        this.f2442d = (String) blm.m3636a((Object) parcel.readString());
        this.f2443e = parcel.readInt();
        this.f2444f = parcel.readInt();
        this.f2445g = parcel.readInt();
        this.f2446h = parcel.readInt();
        this.f2440b = (byte[]) blm.m3636a((Object) parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aui aui = (aui) obj;
        return this.f2439a == aui.f2439a && this.f2441c.equals(aui.f2441c) && this.f2442d.equals(aui.f2442d) && this.f2443e == aui.f2443e && this.f2444f == aui.f2444f && this.f2445g == aui.f2445g && this.f2446h == aui.f2446h && Arrays.equals(this.f2440b, aui.f2440b);
    }

    public final int hashCode() {
        return ((((((((((((((this.f2439a + 527) * 31) + this.f2441c.hashCode()) * 31) + this.f2442d.hashCode()) * 31) + this.f2443e) * 31) + this.f2444f) * 31) + this.f2445g) * 31) + this.f2446h) * 31) + Arrays.hashCode(this.f2440b);
    }

    public final String toString() {
        String str = this.f2441c;
        String str2 = this.f2442d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(str2).length());
        sb.append("Picture: mimeType=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2439a);
        parcel.writeString(this.f2441c);
        parcel.writeString(this.f2442d);
        parcel.writeInt(this.f2443e);
        parcel.writeInt(this.f2444f);
        parcel.writeInt(this.f2445g);
        parcel.writeInt(this.f2446h);
        parcel.writeByteArray(this.f2440b);
    }
}
