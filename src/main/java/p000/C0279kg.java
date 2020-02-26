package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: kg */
/* compiled from: PG */
public final class C0279kg extends C0091dh {
    public static final Parcelable.Creator CREATOR = new C0278kf();

    /* renamed from: c */
    public Parcelable f9735c;

    public C0279kg(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f9735c = parcel.readParcelable(classLoader == null ? C0269jx.class.getClassLoader() : classLoader);
    }

    public C0279kg(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f9735c, 0);
    }
}
