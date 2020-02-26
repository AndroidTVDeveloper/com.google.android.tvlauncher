package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* renamed from: atw  reason: default package */
/* compiled from: PG */
public final class atw implements Parcelable {
    public static final Parcelable.Creator CREATOR = new atu();
    private final atv[] a;

    public final int describeContents() {
        return 0;
    }

    public atw(Parcel parcel) {
        this.a = new atv[parcel.readInt()];
        int i = 0;
        while (true) {
            atv[] atvArr = this.a;
            if (i < atvArr.length) {
                atvArr[i] = (atv) parcel.readParcelable(atv.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }

    public atw(List list) {
        atv[] atvArr = new atv[list.size()];
        this.a = atvArr;
        list.toArray(atvArr);
    }

    public atw(atv... atvArr) {
        this.a = atvArr == null ? new atv[0] : atvArr;
    }

    public final atw a(atv... atvArr) {
        atv[] atvArr2 = this.a;
        int length = atvArr2.length;
        int length2 = atvArr.length;
        atv[] atvArr3 = (atv[]) Arrays.copyOf(atvArr2, length + length2);
        System.arraycopy(atvArr, 0, atvArr3, this.a.length, length2);
        return new atw((atv[]) blm.a((Object[]) atvArr3));
    }

    public final atw a(atw atw) {
        return atw != null ? a(atw.a) : this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((atw) obj).a);
    }

    public final atv a(int i) {
        return this.a[i];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final int a() {
        return this.a.length;
    }

    public final String toString() {
        String valueOf = String.valueOf(Arrays.toString(this.a));
        return valueOf.length() == 0 ? new String("entries=") : "entries=".concat(valueOf);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.length);
        for (atv writeParcelable : this.a) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
