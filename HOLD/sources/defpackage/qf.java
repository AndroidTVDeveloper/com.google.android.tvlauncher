package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: qf  reason: default package */
/* compiled from: PG */
public final class qf extends qk {
    public static final Parcelable.Creator CREATOR = new qe();
    public Set a;

    public qf(Parcel parcel) {
        super(parcel);
        int readInt = parcel.readInt();
        this.a = new HashSet();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Collections.addAll(this.a, strArr);
    }

    public qf(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a.size());
        Set set = this.a;
        parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
    }
}
