package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: bxj  reason: default package */
/* compiled from: PG */
public final class bxj extends buf {
    public static final Parcelable.Creator CREATOR = new bxi();
    private final String a;
    private final byte[] b;
    private final List c;

    public bxj(String str, byte[] bArr, List list) {
        this.a = str;
        this.b = bArr;
        this.c = list == null ? new ArrayList(0) : new ArrayList(list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bxj) {
            bxj bxj = (bxj) obj;
            return bty.a(this.a, bxj.a) && bty.a(this.b, bxj.b) && bty.a(this.c, bxj.c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = buj.a(parcel);
        buj.a(parcel, 1, this.a);
        buj.a(parcel, 2, this.b);
        ArrayList arrayList = new ArrayList(this.c);
        int a3 = buj.a(parcel, 3);
        int size = arrayList.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(((Integer) arrayList.get(i2)).intValue());
        }
        buj.b(parcel, a3);
        buj.b(parcel, a2);
    }
}
