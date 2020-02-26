package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bnm  reason: default package */
/* compiled from: PG */
public final class bnm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Integer num;
        Parcel parcel2 = parcel;
        int b = buh.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Integer num2 = null;
        int i = 0;
        int i2 = 0;
        boolean z = true;
        boolean z2 = false;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (buh.a(readInt)) {
                case 2:
                    str = buh.f(parcel2, readInt);
                    break;
                case 3:
                    i = buh.d(parcel2, readInt);
                    break;
                case 4:
                    i2 = buh.d(parcel2, readInt);
                    break;
                case 5:
                    str2 = buh.f(parcel2, readInt);
                    break;
                case 6:
                    str3 = buh.f(parcel2, readInt);
                    break;
                case 7:
                    z = buh.c(parcel2, readInt);
                    break;
                case 8:
                    str4 = buh.f(parcel2, readInt);
                    break;
                case 9:
                    z2 = buh.c(parcel2, readInt);
                    break;
                case 10:
                    i3 = buh.d(parcel2, readInt);
                    break;
                case 11:
                    int a = buh.a(parcel2, readInt);
                    if (a == 0) {
                        num = null;
                    } else if (a == 4) {
                        num = Integer.valueOf(parcel.readInt());
                    } else {
                        String hexString = Integer.toHexString(a);
                        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
                        sb.append("Expected size 4 got ");
                        sb.append(a);
                        sb.append(" (0x");
                        sb.append(hexString);
                        sb.append(")");
                        throw new bug(sb.toString(), parcel2);
                    }
                    num2 = num;
                    break;
                default:
                    buh.b(parcel2, readInt);
                    break;
            }
        }
        buh.n(parcel2, b);
        return new bnl(str, i, i2, str2, str3, z, str4, z2, i3, num2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new bnl[i];
    }
}
