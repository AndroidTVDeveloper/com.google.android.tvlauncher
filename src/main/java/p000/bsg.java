package p000;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: bsg */
/* compiled from: PG */
public final class bsg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buh.m4209b(parcel);
        int i = 0;
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = buh.m4195a(readInt);
            if (a == 1) {
                strArr = buh.m4225l(parcel, readInt);
            } else if (a == 2) {
                cursorWindowArr = (CursorWindow[]) buh.m4214b(parcel, readInt, CursorWindow.CREATOR);
            } else if (a == 3) {
                i3 = buh.m4217d(parcel, readInt);
            } else if (a == 4) {
                bundle = buh.m4221h(parcel, readInt);
            } else if (a != 1000) {
                buh.m4210b(parcel, readInt);
            } else {
                i2 = buh.m4217d(parcel, readInt);
            }
        }
        buh.m4227n(parcel, b);
        DataHolder dataHolder = new DataHolder(i2, strArr, cursorWindowArr, i3, bundle);
        dataHolder.f6290b = new Bundle();
        int i4 = 0;
        while (true) {
            String[] strArr2 = dataHolder.f6289a;
            if (i4 >= strArr2.length) {
                break;
            }
            dataHolder.f6290b.putInt(strArr2[i4], i4);
            i4++;
        }
        dataHolder.f6292d = new int[dataHolder.f6291c.length];
        int i5 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr2 = dataHolder.f6291c;
            if (i >= cursorWindowArr2.length) {
                return dataHolder;
            }
            dataHolder.f6292d[i] = i5;
            i5 += dataHolder.f6291c[i].getNumRows() - (i5 - cursorWindowArr2[i].getStartPosition());
            i++;
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DataHolder[i];
    }
}
