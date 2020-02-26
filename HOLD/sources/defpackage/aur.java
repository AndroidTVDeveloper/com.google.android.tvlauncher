package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: aur  reason: default package */
/* compiled from: PG */
public final class aur extends avc {
    public static final Parcelable.Creator CREATOR = new auq();
    private final byte[] a;

    public aur(Parcel parcel) {
        super((String) blm.a((Object) parcel.readString()));
        this.a = (byte[]) blm.a((Object) parcel.createByteArray());
    }

    public aur(String str, byte[] bArr) {
        super(str);
        this.a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aur aur = (aur) obj;
        return this.c.equals(aur.c) && Arrays.equals(this.a, aur.a);
    }

    public final int hashCode() {
        return ((this.c.hashCode() + 527) * 31) + Arrays.hashCode(this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeByteArray(this.a);
    }
}
