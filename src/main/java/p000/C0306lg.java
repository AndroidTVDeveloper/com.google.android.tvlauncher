package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: lg */
/* compiled from: PG */
public final class C0306lg extends C0091dh {
    public static final Parcelable.Creator CREATOR = new C0305lf();

    /* renamed from: c */
    public int f9842c;

    /* renamed from: d */
    public boolean f9843d;

    public C0306lg(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f9842c = parcel.readInt();
        this.f9843d = parcel.readInt() != 0;
    }

    public C0306lg(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f9842c);
        parcel.writeInt(this.f9843d ? 1 : 0);
    }
}
