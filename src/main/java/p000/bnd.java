package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bnd */
/* compiled from: PG */
public final class bnd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buh.m4209b(parcel);
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
            switch (buh.m4195a(readInt)) {
                case 2:
                    bnl = (bnl) buh.m4198a(parcel, readInt, bnl.CREATOR);
                    break;
                case 3:
                    bArr = buh.m4222i(parcel, readInt);
                    break;
                case 4:
                    iArr = buh.m4224k(parcel, readInt);
                    break;
                case 5:
                    strArr = buh.m4225l(parcel, readInt);
                    break;
                case 6:
                    iArr2 = buh.m4224k(parcel, readInt);
                    break;
                case 7:
                    bArr2 = buh.m4223j(parcel, readInt);
                    break;
                case 8:
                    z = buh.m4216c(parcel, readInt);
                    break;
                case 9:
                    bvoArr = (bvo[]) buh.m4214b(parcel, readInt, bvo.CREATOR);
                    break;
                case 10:
                    bvrArr = (bvr[]) buh.m4214b(parcel, readInt, bvr.CREATOR);
                    break;
                default:
                    buh.m4210b(parcel, readInt);
                    break;
            }
        }
        buh.m4227n(parcel, b);
        return new bnc(bnl, bArr, iArr, strArr, iArr2, bArr2, z, bvoArr, bvrArr);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new bnc[i];
    }
}
