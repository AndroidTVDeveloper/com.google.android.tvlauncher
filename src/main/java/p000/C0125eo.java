package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: eo */
/* compiled from: PG */
public final class C0125eo extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C0124en();

    /* renamed from: a */
    public int f9155a;

    public C0125eo(Parcel parcel) {
        super(parcel);
        this.f9155a = parcel.readInt();
    }

    public C0125eo(Parcelable parcelable) {
        super(parcelable);
    }

    public final String toString() {
        return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f9155a + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f9155a);
    }
}
