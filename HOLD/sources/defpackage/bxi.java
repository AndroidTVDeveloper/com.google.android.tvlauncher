package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: bxi  reason: default package */
/* compiled from: PG */
public final class bxi implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        int b = buh.b(parcel);
        String str = null;
        byte[] bArr = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = buh.a(readInt);
            if (a == 1) {
                str = buh.f(parcel, readInt);
            } else if (a == 2) {
                bArr = buh.i(parcel, readInt);
            } else if (a != 3) {
                buh.b(parcel, readInt);
            } else {
                int a2 = buh.a(parcel, readInt);
                int dataPosition = parcel.dataPosition();
                if (a2 != 0) {
                    arrayList = new ArrayList();
                    int readInt2 = parcel.readInt();
                    for (int i = 0; i < readInt2; i++) {
                        arrayList.add(Integer.valueOf(parcel.readInt()));
                    }
                    parcel.setDataPosition(dataPosition + a2);
                } else {
                    arrayList = null;
                }
                arrayList2 = arrayList;
            }
        }
        buh.n(parcel, b);
        return new bxj(str, bArr, arrayList2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new bxj[i];
    }
}
