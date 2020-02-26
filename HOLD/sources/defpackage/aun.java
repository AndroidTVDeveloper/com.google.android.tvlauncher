package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: aun  reason: default package */
/* compiled from: PG */
public final class aun implements atv {
    public static final Parcelable.Creator CREATOR = new aum();
    private final String a;
    private final String b;
    private final String c;

    public final akh a() {
        return null;
    }

    public final byte[] b() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public aun(Parcel parcel) {
        this.a = (String) bks.a((Object) parcel.readString());
        this.b = parcel.readString();
        this.c = parcel.readString();
    }

    public aun(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
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
        return blm.a((Object) this.a, (Object) ((aun) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata=\"%s\"", this.b, this.c, this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
