package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: avz */
/* compiled from: PG */
public final class avz extends avp {
    public static final Parcelable.Creator CREATOR = new avw();

    /* renamed from: a */
    private final List f2533a;

    public /* synthetic */ avz(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new avy(parcel));
        }
        this.f2533a = Collections.unmodifiableList(arrayList);
    }

    private avz(List list) {
        this.f2533a = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    static avz m2193a(bky bky) {
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
        int d = bky.mo2074d();
        ArrayList arrayList3 = new ArrayList(d);
        int i6 = 0;
        while (i6 < d) {
            long h = bky.mo2081h();
            boolean z5 = (bky.mo2074d() & 128) != 0;
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
                int d2 = bky.mo2074d();
                boolean z6 = (d2 & 128) != 0;
                boolean z7 = (d2 & 64) != 0;
                int i7 = d2 & 32;
                long h2 = z7 ? bky.mo2081h() : -9223372036854775807L;
                if (!z7) {
                    int d3 = bky.mo2074d();
                    ArrayList arrayList5 = new ArrayList(d3);
                    int i8 = 0;
                    while (i8 < d3) {
                        arrayList5.add(new avx(bky.mo2074d(), bky.mo2081h(), (byte) 0));
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
                    long d4 = (long) bky.mo2074d();
                    boolean z8 = (128 & d4) != 0;
                    j3 = ((((d4 & 1) << 32) | bky.mo2081h()) * 1000) / 90;
                    z4 = z8;
                } else {
                    z4 = false;
                    j3 = -9223372036854775807L;
                }
                i5 = bky.mo2076e();
                arrayList2 = arrayList4;
                z2 = z7;
                z = z4;
                z3 = z6;
                j2 = h2;
                j = j3;
                i4 = bky.mo2074d();
                i3 = bky.mo2074d();
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
        int size = this.f2533a.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            avy avy = (avy) this.f2533a.get(i2);
            parcel.writeLong(avy.f2522a);
            parcel.writeByte(avy.f2523b ? (byte) 1 : 0);
            parcel.writeByte(avy.f2524c ? (byte) 1 : 0);
            parcel.writeByte(avy.f2525d ? (byte) 1 : 0);
            int size2 = avy.f2527f.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                avx avx = (avx) avy.f2527f.get(i3);
                parcel.writeInt(avx.f2520a);
                parcel.writeLong(avx.f2521b);
            }
            parcel.writeLong(avy.f2526e);
            parcel.writeByte(avy.f2528g ? (byte) 1 : 0);
            parcel.writeLong(avy.f2529h);
            parcel.writeInt(avy.f2530i);
            parcel.writeInt(avy.f2531j);
            parcel.writeInt(avy.f2532k);
        }
    }
}
