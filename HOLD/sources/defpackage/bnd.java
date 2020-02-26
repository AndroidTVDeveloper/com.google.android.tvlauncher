package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bnd  reason: default package */
/* compiled from: PG */
public final class bnd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buh.b(parcel);
        bnl bnl = null;
        byte[] bArr = null;
        int[] iArr = null;
        String[] strArr = null;
        int[] iArr2 = null;
        byte[][] bArr2 = null;
        bvo[] bvoArr = null;
        bvr[] bvrArr = null;
        boolean z = true;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (buh.a(readInt)) {
                case 2:
                    bnl = (bnl) buh.a(parcel, readInt, bnl.CREATOR);
                    break;
                case 3:
                    bArr = buh.i(parcel, readInt);
                    break;
                case 4:
                    iArr = buh.k(parcel, readInt);
                    break;
                case 5:
                    strArr = buh.l(parcel, readInt);
                    break;
                case 6:
                    iArr2 = buh.k(parcel, readInt);
                    break;
                case 7:
                    bArr2 = buh.j(parcel, readInt);
                    break;
                case 8:
                    z = buh.c(parcel, readInt);
                    break;
                case 9:
                    bvoArr = (bvo[]) buh.b(parcel, readInt, bvo.CREATOR);
                    break;
                case 10:
                    bvrArr = (bvr[]) buh.b(parcel, readInt, bvr.CREATOR);
                    break;
                default:
                    buh.b(parcel, readInt);
                    break;
            }
        }
        buh.n(parcel, b);
        return new bnc(bnl, bArr, iArr, strArr, iArr2, bArr2, z, bvoArr, bvrArr);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new bnc[i];
    }
}
