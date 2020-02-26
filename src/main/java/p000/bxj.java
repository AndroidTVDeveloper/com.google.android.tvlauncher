package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: bxj */
/* compiled from: PG */
public final class bxj extends buf {
    public static final Parcelable.Creator CREATOR = new bxi();

    /* renamed from: a */
    private final String f4982a;

    /* renamed from: b */
    private final byte[] f4983b;

    /* renamed from: c */
    private final List f4984c;

    public bxj(String str, byte[] bArr, List list) {
        this.f4982a = str;
        this.f4983b = bArr;
        this.f4984c = list == null ? new ArrayList(0) : new ArrayList(list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bxj) {
            bxj bxj = (bxj) obj;
            return bty.m4184a(this.f4982a, bxj.f4982a) && bty.m4184a(this.f4983b, bxj.f4983b) && bty.m4184a(this.f4984c, bxj.f4984c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4982a, this.f4983b, this.f4984c});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = buj.m4230a(parcel);
        buj.m4239a(parcel, 1, this.f4982a);
        buj.m4242a(parcel, 2, this.f4983b);
        ArrayList arrayList = new ArrayList(this.f4984c);
        int a2 = buj.m4231a(parcel, 3);
        int size = arrayList.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(((Integer) arrayList.get(i2)).intValue());
        }
        buj.m4250b(parcel, a2);
        buj.m4250b(parcel, a);
    }
}
