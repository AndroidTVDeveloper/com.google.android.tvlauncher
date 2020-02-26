package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: dg  reason: default package */
/* compiled from: PG */
final class dg implements Parcelable.ClassLoaderCreator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }

    private static final dh a(Parcel parcel, ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) == null) {
            return dh.a;
        }
        throw new IllegalStateException("superState must be null");
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new dh[i];
    }
}
