package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: kf  reason: default package */
/* compiled from: PG */
final class kf implements Parcelable.ClassLoaderCreator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new kg(parcel, null);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new kg(parcel, classLoader);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new kg[i];
    }
}
