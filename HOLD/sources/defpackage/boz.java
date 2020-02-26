package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* renamed from: boz  reason: default package */
/* compiled from: PG */
public final class boz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buh.b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = buh.a(readInt);
            if (a == 1) {
                i = buh.d(parcel, readInt);
            } else if (a != 2) {
                buh.b(parcel, readInt);
            } else {
                str = buh.f(parcel, readInt);
            }
        }
        buh.n(parcel, b);
        return new Scope(i, str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Scope[i];
    }
}
