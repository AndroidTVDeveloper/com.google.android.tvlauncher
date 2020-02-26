package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: aun */
/* compiled from: PG */
public final class aun implements atv {
    public static final Parcelable.Creator CREATOR = new aum();

    /* renamed from: a */
    private final String f2454a;

    /* renamed from: b */
    private final String f2455b;

    /* renamed from: c */
    private final String f2456c;

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

    public aun(Parcel parcel) {
        this.f2454a = (String) bks.m3507a((Object) parcel.readString());
        this.f2455b = parcel.readString();
        this.f2456c = parcel.readString();
    }

    public aun(String str, String str2, String str3) {
        this.f2454a = str;
        this.f2455b = str2;
        this.f2456c = str3;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blm.a(java.lang.Object, java.lang.Object):boolean
     arg types: [java.lang.String, java.lang.String]
     candidates:
      blm.a(int, int):int
      blm.a(byte[], int):int
      blm.a(long, float):long
      blm.a(long, long):long
      blm.a(android.os.Looper, android.os.Handler$Callback):android.os.Handler
      blm.a(java.lang.String, int):java.lang.String
      blm.a(java.lang.String, java.lang.Object[]):java.lang.String
      blm.a(android.os.Parcel, boolean):void
      blm.a(long[], long):void
      blm.a(java.lang.Object[], java.lang.Object):boolean
      blm.a(java.util.List, long):long[]
      blm.a(java.lang.Object[], int):java.lang.Object[]
      blm.a(java.lang.String, java.lang.String):java.lang.String[]
      blm.a(java.lang.Object, java.lang.Object):boolean */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return blm.m3652a((Object) this.f2454a, (Object) ((aun) obj).f2454a);
    }

    public final int hashCode() {
        return this.f2454a.hashCode();
    }

    public final String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata=\"%s\"", this.f2455b, this.f2456c, this.f2454a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2454a);
        parcel.writeString(this.f2455b);
        parcel.writeString(this.f2456c);
    }
}
