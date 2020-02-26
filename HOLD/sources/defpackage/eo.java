package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: eo  reason: default package */
/* compiled from: PG */
public final class eo extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new en();
    public int a;

    public eo(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
    }

    public eo(Parcelable parcelable) {
        super(parcelable);
    }

    public final String toString() {
        return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.a + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
    }
}
