package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* renamed from: boz */
/* compiled from: PG */
public final class boz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buh.m4209b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = buh.m4195a(readInt);
            if (a == 1) {
                i = buh.m4217d(parcel, readInt);
            } else if (a != 2) {
                buh.m4210b(parcel, readInt);
            } else {
                str = buh.m4219f(parcel, readInt);
            }
        }
        buh.m4227n(parcel, b);
        return new Scope(i, str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Scope[i];
    }
}
