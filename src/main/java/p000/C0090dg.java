package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: dg */
/* compiled from: PG */
final class C0090dg implements Parcelable.ClassLoaderCreator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m6345a(parcel, null);
    }

    /* renamed from: a */
    private static final C0091dh m6345a(Parcel parcel, ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) == null) {
            return C0091dh.f8520a;
        }
        throw new IllegalStateException("superState must be null");
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return m6345a(parcel, classLoader);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C0091dh[i];
    }
}
