package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: avz  reason: default package */
/* compiled from: PG */
public final class avz extends avp {
    public static final Parcelable.Creator CREATOR = new avw();
    private final List a;

    public /* synthetic */ avz(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new avy(parcel));
        }
        this.a = Collections.unmodifiableList(arrayList);
    }

    private avz(List list) {
        this.a = Collections.unmodifiableList(list);
    }

    static avz a(bky bky) {
        ArrayList arrayList;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        boolean z;
        long j2;
        ArrayList arrayList2;
        boolean z2;
        boolean z3;
        long j3;
        boolean z4;
        int d = bky.d();
        ArrayList arrayList3 = new ArrayList(d);
        int i6 = 0;
        while (i6 < d) {
            long h = bky.h();
            boolean z5 = (bky.d() & 128) != 0;
            ArrayList arrayList4 = new ArrayList();
            if (z5) {
                i = d;
                arrayList = arrayList3;
                i2 = i6;
                arrayList2 = arrayList4;
                z3 = false;
                z2 = false;
                j2 = -9223372036854775807L;
                z = false;
                j = -9223372036854775807L;
                i5 = 0;
                i4 = 0;
                i3 = 0;
            } else {
                int d2 = bky.d();
                boolean z6 = (d2 & 128) != 0;
                boolean z7 = (d2 & 64) != 0;
                int i7 = d2 & 32;
                long h2 = z7 ? bky.h() : -9223372036854775807L;
                if (!z7) {
                    int d3 = bky.d();
                    ArrayList arrayList5 = new ArrayList(d3);
                    int i8 = 0;
                    while (i8 < d3) {
                        arrayList5.add(new avx(bky.d(), bky.h(), (byte) 0));
                        i8++;
                        i6 = i6;
                        d = d;
                        arrayList3 = arrayList3;
                    }
                    i = d;
                    arrayList = arrayList3;
                    i2 = i6;
                    arrayList4 = arrayList5;
                } else {
                    i = d;
                    arrayList = arrayList3;
                    i2 = i6;
                }
                if (i7 != 0) {
                    long d4 = (long) bky.d();
                    boolean z8 = (128 & d4) != 0;
                    j3 = ((((d4 & 1) << 32) | bky.h()) * 1000) / 90;
                    z4 = z8;
                } else {
                    z4 = false;
                    j3 = -9223372036854775807L;
                }
                i5 = bky.e();
                arrayList2 = arrayList4;
                z2 = z7;
                z = z4;
                z3 = z6;
                j2 = h2;
                j = j3;
                i4 = bky.d();
                i3 = bky.d();
            }
            ArrayList arrayList6 = arrayList;
            arrayList6.add(new avy(h, z5, z3, z2, arrayList2, j2, z, j, i5, i4, i3));
            i6 = i2 + 1;
            arrayList3 = arrayList6;
            d = i;
        }
        return new avz(arrayList3);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int size = this.a.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            avy avy = (avy) this.a.get(i2);
            parcel.writeLong(avy.a);
            parcel.writeByte(avy.b ? (byte) 1 : 0);
            parcel.writeByte(avy.c ? (byte) 1 : 0);
            parcel.writeByte(avy.d ? (byte) 1 : 0);
            int size2 = avy.f.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                avx avx = (avx) avy.f.get(i3);
                parcel.writeInt(avx.a);
                parcel.writeLong(avx.b);
            }
            parcel.writeLong(avy.e);
            parcel.writeByte(avy.g ? (byte) 1 : 0);
            parcel.writeLong(avy.h);
            parcel.writeInt(avy.i);
            parcel.writeInt(avy.j);
            parcel.writeInt(avy.k);
        }
    }
}
