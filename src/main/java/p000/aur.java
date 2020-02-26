package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: aur */
/* compiled from: PG */
public final class aur extends avc {
    public static final Parcelable.Creator CREATOR = new auq();

    /* renamed from: a */
    private final byte[] f2461a;

    public aur(Parcel parcel) {
        super((String) blm.m3636a((Object) parcel.readString()));
        this.f2461a = (byte[]) blm.m3636a((Object) parcel.createByteArray());
    }

    public aur(String str, byte[] bArr) {
        super(str);
        this.f2461a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aur aur = (aur) obj;
        return this.f2483c.equals(aur.f2483c) && Arrays.equals(this.f2461a, aur.f2461a);
    }

    public final int hashCode() {
        return ((this.f2483c.hashCode() + 527) * 31) + Arrays.hashCode(this.f2461a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2483c);
        parcel.writeByteArray(this.f2461a);
    }
}
