package defpackage;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: bsg  reason: default package */
/* compiled from: PG */
public final class bsg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buh.b(parcel);
        int i = 0;
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = buh.a(readInt);
            if (a == 1) {
                strArr = buh.l(parcel, readInt);
            } else if (a == 2) {
                cursorWindowArr = (CursorWindow[]) buh.b(parcel, readInt, CursorWindow.CREATOR);
            } else if (a == 3) {
                i3 = buh.d(parcel, readInt);
            } else if (a == 4) {
                bundle = buh.h(parcel, readInt);
            } else if (a != 1000) {
                buh.b(parcel, readInt);
            } else {
                i2 = buh.d(parcel, readInt);
            }
        }
        buh.n(parcel, b);
        DataHolder dataHolder = new DataHolder(i2, strArr, cursorWindowArr, i3, bundle);
        dataHolder.b = new Bundle();
        int i4 = 0;
        while (true) {
            String[] strArr2 = dataHolder.a;
            if (i4 >= strArr2.length) {
                break;
            }
            dataHolder.b.putInt(strArr2[i4], i4);
            i4++;
        }
        dataHolder.d = new int[dataHolder.c.length];
        int i5 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr2 = dataHolder.c;
            if (i >= cursorWindowArr2.length) {
                return dataHolder;
            }
            dataHolder.d[i] = i5;
            i5 += dataHolder.c[i].getNumRows() - (i5 - cursorWindowArr2[i].getStartPosition());
            i++;
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DataHolder[i];
    }
}
