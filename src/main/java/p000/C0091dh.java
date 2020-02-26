package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: dh */
/* compiled from: PG */
public class C0091dh implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0090dg();

    /* renamed from: a */
    public static final C0091dh f8520a = new C0089df();

    /* renamed from: b */
    public final Parcelable f8521b;

    public final int describeContents() {
        return 0;
    }

    private C0091dh() {
        this.f8521b = null;
    }

    protected C0091dh(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f8521b = readParcelable == null ? f8520a : readParcelable;
    }

    protected C0091dh(Parcelable parcelable) {
        if (parcelable != null) {
            this.f8521b = parcelable == f8520a ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public /* synthetic */ C0091dh(byte b) {
        this.f8521b = null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f8521b, i);
    }
}
