package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: qf */
/* compiled from: PG */
public final class C0440qf extends C0445qk {
    public static final Parcelable.Creator CREATOR = new C0439qe();

    /* renamed from: a */
    public Set f10201a;

    public C0440qf(Parcel parcel) {
        super(parcel);
        int readInt = parcel.readInt();
        this.f10201a = new HashSet();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Collections.addAll(this.f10201a, strArr);
    }

    public C0440qf(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f10201a.size());
        Set set = this.f10201a;
        parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
    }
}
