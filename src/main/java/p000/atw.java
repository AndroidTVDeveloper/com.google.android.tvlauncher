package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* renamed from: atw */
/* compiled from: PG */
public final class atw implements Parcelable {
    public static final Parcelable.Creator CREATOR = new atu();

    /* renamed from: a */
    private final atv[] f2412a;

    public final int describeContents() {
        return 0;
    }

    public atw(Parcel parcel) {
        this.f2412a = new atv[parcel.readInt()];
        int i = 0;
        while (true) {
            atv[] atvArr = this.f2412a;
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
        this.f2412a = atvArr;
        list.toArray(atvArr);
    }

    public atw(atv... atvArr) {
        this.f2412a = atvArr == null ? new atv[0] : atvArr;
    }

    /* renamed from: a */
    public final atw mo1347a(atv... atvArr) {
        atv[] atvArr2 = this.f2412a;
        int length = atvArr2.length;
        int length2 = atvArr.length;
        atv[] atvArr3 = (atv[]) Arrays.copyOf(atvArr2, length + length2);
        System.arraycopy(atvArr, 0, atvArr3, this.f2412a.length, length2);
        return new atw((atv[]) blm.m3656a((Object[]) atvArr3));
    }

    /* renamed from: a */
    public final atw mo1346a(atw atw) {
        return atw != null ? mo1347a(atw.f2412a) : this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f2412a, ((atw) obj).f2412a);
    }

    /* renamed from: a */
    public final atv mo1345a(int i) {
        return this.f2412a[i];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2412a);
    }

    /* renamed from: a */
    public final int mo1344a() {
        return this.f2412a.length;
    }

    public final String toString() {
        String valueOf = String.valueOf(Arrays.toString(this.f2412a));
        return valueOf.length() == 0 ? new String("entries=") : "entries=".concat(valueOf);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2412a.length);
        for (atv writeParcelable : this.f2412a) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
