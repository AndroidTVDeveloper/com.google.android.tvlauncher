package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: avt  reason: default package */
/* compiled from: PG */
public final class avt extends avp {
    public static final Parcelable.Creator CREATOR = new avr();
    private final long a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final long f;
    private final long g;
    private final List h;
    private final boolean i;
    private final long j;
    private final int k;
    private final int l;
    private final int m;

    private avt(long j2, boolean z, boolean z2, boolean z3, boolean z4, long j3, long j4, List list, boolean z5, long j5, int i2, int i3, int i4) {
        this.a = j2;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = j3;
        this.g = j4;
        this.h = Collections.unmodifiableList(list);
        this.i = z5;
        this.j = j5;
        this.k = i2;
        this.l = i3;
        this.m = i4;
    }

    public /* synthetic */ avt(Parcel parcel) {
        this.a = parcel.readLong();
        boolean z = false;
        this.b = parcel.readByte() == 1;
        this.c = parcel.readByte() == 1;
        this.d = parcel.readByte() == 1;
        this.e = parcel.readByte() == 1;
        this.f = parcel.readLong();
        this.g = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(new avs(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.h = Collections.unmodifiableList(arrayList);
        this.i = parcel.readByte() == 1 ? true : z;
        this.j = parcel.readLong();
        this.k = parcel.readInt();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
    }

    static avt a(bky bky, long j2, blj blj) {
        int i2;
        int i3;
        int i4;
        long j3;
        boolean z;
        long j4;
        List list;
        boolean z2;
        boolean z3;
        boolean z4;
        List list2;
        long j5;
        blj blj2 = blj;
        long h2 = bky.h();
        boolean z5 = (bky.d() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (z5) {
            list = emptyList;
            z4 = false;
            z3 = false;
            z2 = false;
            j4 = -9223372036854775807L;
            z = false;
            j3 = -9223372036854775807L;
            i4 = 0;
            i3 = 0;
            i2 = 0;
        } else {
            int d2 = bky.d();
            boolean z6 = (d2 & 128) != 0;
            boolean z7 = (d2 & 64) != 0;
            int i5 = d2 & 32;
            z2 = (d2 & 16) != 0;
            if (z7 && !z2) {
                j4 = awb.a(bky, j2);
            } else {
                j4 = -9223372036854775807L;
            }
            if (!z7) {
                int d3 = bky.d();
                list2 = new ArrayList(d3);
                for (int i6 = 0; i6 < d3; i6++) {
                    int d4 = bky.d();
                    long a2 = !z2 ? awb.a(bky, j2) : -9223372036854775807L;
                    list2.add(new avs(d4, a2, blj2.b(a2), (byte) 0));
                }
            } else {
                list2 = emptyList;
            }
            if (i5 != 0) {
                long d5 = (long) bky.d();
                if ((128 & d5) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                j5 = ((((d5 & 1) << 32) | bky.h()) * 1000) / 90;
            } else {
                j5 = -9223372036854775807L;
                z = false;
            }
            i4 = bky.e();
            i3 = bky.d();
            i2 = bky.d();
            j3 = j5;
            z4 = z6;
            z3 = z7;
            list = list2;
        }
        return new avt(h2, z5, z4, z3, z2, j4, blj2.b(j4), list, z, j3, i4, i3, i2);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.a);
        parcel.writeByte(this.b ? (byte) 1 : 0);
        parcel.writeByte(this.c ? (byte) 1 : 0);
        parcel.writeByte(this.d ? (byte) 1 : 0);
        parcel.writeByte(this.e ? (byte) 1 : 0);
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        int size = this.h.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            avs avs = (avs) this.h.get(i3);
            parcel.writeInt(avs.a);
            parcel.writeLong(avs.b);
            parcel.writeLong(avs.c);
        }
        parcel.writeByte(this.i ? (byte) 1 : 0);
        parcel.writeLong(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
    }
}
