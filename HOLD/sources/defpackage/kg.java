package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: kg  reason: default package */
/* compiled from: PG */
public final class kg extends dh {
    public static final Parcelable.Creator CREATOR = new kf();
    public Parcelable c;

    public kg(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readParcelable(classLoader == null ? jx.class.getClassLoader() : classLoader);
    }

    public kg(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.c, 0);
    }
}
