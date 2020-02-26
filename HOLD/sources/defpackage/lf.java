package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: lf  reason: default package */
/* compiled from: PG */
final class lf implements Parcelable.ClassLoaderCreator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new lg(parcel, null);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new lg(parcel, classLoader);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new lg[i];
    }
}
