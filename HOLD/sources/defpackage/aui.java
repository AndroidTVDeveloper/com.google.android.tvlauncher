package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: aui  reason: default package */
/* compiled from: PG */
public final class aui implements atv {
    public static final Parcelable.Creator CREATOR = new auh();
    public final int a;
    public final byte[] b;
    private final String c;
    private final String d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;

    public final akh a() {
        return null;
    }

    public final byte[] b() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public aui(Parcel parcel) {
        this.a = parcel.readInt();
        this.c = (String) blm.a((Object) parcel.readString());
        this.d = (String) blm.a((Object) parcel.readString());
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.b = (byte[]) blm.a((Object) parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aui aui = (aui) obj;
        return this.a == aui.a && this.c.equals(aui.c) && this.d.equals(aui.d) && this.e == aui.e && this.f == aui.f && this.g == aui.g && this.h == aui.h && Arrays.equals(this.b, aui.b);
    }

    public final int hashCode() {
        return ((((((((((((((this.a + 527) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + Arrays.hashCode(this.b);
    }

    public final String toString() {
        String str = this.c;
        String str2 = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(str2).length());
        sb.append("Picture: mimeType=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeByteArray(this.b);
    }
}
