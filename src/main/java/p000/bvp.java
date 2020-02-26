package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bvp */
/* compiled from: PG */
public final class bvp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buh.m4209b(parcel);
        String str = null;
        byte[] bArr = null;
        byte[][] bArr2 = null;
        byte[][] bArr3 = null;
        byte[][] bArr4 = null;
        byte[][] bArr5 = null;
        int[] iArr = null;
        byte[][] bArr6 = null;
        int[] iArr2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (buh.m4195a(readInt)) {
                case 2:
                    str = buh.m4219f(parcel, readInt);
                    break;
                case 3:
                    bArr = buh.m4222i(parcel, readInt);
                    break;
                case 4:
                    bArr2 = buh.m4223j(parcel, readInt);
                    break;
                case 5:
                    bArr3 = buh.m4223j(parcel, readInt);
                    break;
                case 6:
                    bArr4 = buh.m4223j(parcel, readInt);
                    break;
                case 7:
                    bArr5 = buh.m4223j(parcel, readInt);
                    break;
                case 8:
                    iArr = buh.m4224k(parcel, readInt);
                    break;
                case 9:
                    bArr6 = buh.m4223j(parcel, readInt);
                    break;
                case 10:
                    iArr2 = buh.m4224k(parcel, readInt);
                    break;
                default:
                    buh.m4210b(parcel, readInt);
                    break;
            }
        }
        buh.m4227n(parcel, b);
        return new bvo(str, bArr, bArr2, bArr3, bArr4, bArr5, iArr, bArr6, iArr2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new bvo[i];
    }
}
