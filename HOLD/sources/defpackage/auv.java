package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: auv  reason: default package */
/* compiled from: PG */
public final class auv extends avc {
    public static final Parcelable.Creator CREATOR = new auu();
    private final String a;
    private final boolean b;
    private final boolean d;
    private final String[] e;
    private final avc[] f;

    public auv(Parcel parcel) {
        super("CTOC");
        this.a = (String) blm.a((Object) parcel.readString());
        boolean z = true;
        this.b = parcel.readByte() != 0;
        this.d = parcel.readByte() == 0 ? false : z;
        this.e = (String[]) blm.a((Object) parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f = new avc[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f[i] = (avc) parcel.readParcelable(avc.class.getClassLoader());
        }
    }

    public auv(String str, boolean z, boolean z2, String[] strArr, avc[] avcArr) {
        super("CTOC");
        this.a = str;
        this.b = z;
        this.d = z2;
        this.e = strArr;
        this.f = avcArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        auv auv = (auv) obj;
        return this.b == auv.b && this.d == auv.d && blm.a(this.a, auv.a) && Arrays.equals(this.e, auv.e) && Arrays.equals(this.f, auv.f);
    }

    public final int hashCode() {
        int i = ((((this.b ? 1 : 0) + true) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.a;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByte(this.b ? (byte) 1 : 0);
        parcel.writeByte(this.d ? (byte) 1 : 0);
        parcel.writeStringArray(this.e);
        parcel.writeInt(this.f.length);
        for (avc writeParcelable : this.f) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
