package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: avt */
/* compiled from: PG */
public final class avt extends avp {
    public static final Parcelable.Creator CREATOR = new avr();

    /* renamed from: a */
    private final long f2507a;

    /* renamed from: b */
    private final boolean f2508b;

    /* renamed from: c */
    private final boolean f2509c;

    /* renamed from: d */
    private final boolean f2510d;

    /* renamed from: e */
    private final boolean f2511e;

    /* renamed from: f */
    private final long f2512f;

    /* renamed from: g */
    private final long f2513g;

    /* renamed from: h */
    private final List f2514h;

    /* renamed from: i */
    private final boolean f2515i;

    /* renamed from: j */
    private final long f2516j;

    /* renamed from: k */
    private final int f2517k;

    /* renamed from: l */
    private final int f2518l;

    /* renamed from: m */
    private final int f2519m;

    private avt(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List list, boolean z5, long j4, int i, int i2, int i3) {
        this.f2507a = j;
        this.f2508b = z;
        this.f2509c = z2;
        this.f2510d = z3;
        this.f2511e = z4;
        this.f2512f = j2;
        this.f2513g = j3;
        this.f2514h = Collections.unmodifiableList(list);
        this.f2515i = z5;
        this.f2516j = j4;
        this.f2517k = i;
        this.f2518l = i2;
        this.f2519m = i3;
    }

    public /* synthetic */ avt(Parcel parcel) {
        this.f2507a = parcel.readLong();
        boolean z = false;
        this.f2508b = parcel.readByte() == 1;
        this.f2509c = parcel.readByte() == 1;
        this.f2510d = parcel.readByte() == 1;
        this.f2511e = parcel.readByte() == 1;
        this.f2512f = parcel.readLong();
        this.f2513g = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new avs(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f2514h = Collections.unmodifiableList(arrayList);
        this.f2515i = parcel.readByte() == 1 ? true : z;
        this.f2516j = parcel.readLong();
        this.f2517k = parcel.readInt();
        this.f2518l = parcel.readInt();
        this.f2519m = parcel.readInt();
    }

    /* renamed from: a */
    static avt m2192a(bky bky, long j, blj blj) {
        int i;
        int i2;
        int i3;
        long j2;
        boolean z;
        long j3;
        List list;
        boolean z2;
        boolean z3;
        boolean z4;
        List list2;
        long j4;
        blj blj2 = blj;
        long h = bky.mo2081h();
        boolean z5 = (bky.mo2074d() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (z5) {
            list = emptyList;
            z4 = false;
            z3 = false;
            z2 = false;
            j3 = -9223372036854775807L;
            z = false;
            j2 = -9223372036854775807L;
            i3 = 0;
            i2 = 0;
            i = 0;
        } else {
            int d = bky.mo2074d();
            boolean z6 = (d & 128) != 0;
            boolean z7 = (d & 64) != 0;
            int i4 = d & 32;
            z2 = (d & 16) != 0;
            if (z7 && !z2) {
                j3 = awb.m2194a(bky, j);
            } else {
                j3 = -9223372036854775807L;
            }
            if (!z7) {
                int d2 = bky.mo2074d();
                list2 = new ArrayList(d2);
                for (int i5 = 0; i5 < d2; i5++) {
                    int d3 = bky.mo2074d();
                    long a = !z2 ? awb.m2194a(bky, j) : -9223372036854775807L;
                    list2.add(new avs(d3, a, blj2.mo2115b(a), (byte) 0));
                }
            } else {
                list2 = emptyList;
            }
            if (i4 != 0) {
                long d4 = (long) bky.mo2074d();
                if ((128 & d4) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                j4 = ((((d4 & 1) << 32) | bky.mo2081h()) * 1000) / 90;
            } else {
                j4 = -9223372036854775807L;
                z = false;
            }
            i3 = bky.mo2076e();
            i2 = bky.mo2074d();
            i = bky.mo2074d();
            j2 = j4;
            z4 = z6;
            z3 = z7;
            list = list2;
        }
        return new avt(h, z5, z4, z3, z2, j3, blj2.mo2115b(j3), list, z, j2, i3, i2, i);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f2507a);
        parcel.writeByte(this.f2508b ? (byte) 1 : 0);
        parcel.writeByte(this.f2509c ? (byte) 1 : 0);
        parcel.writeByte(this.f2510d ? (byte) 1 : 0);
        parcel.writeByte(this.f2511e ? (byte) 1 : 0);
        parcel.writeLong(this.f2512f);
        parcel.writeLong(this.f2513g);
        int size = this.f2514h.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            avs avs = (avs) this.f2514h.get(i2);
            parcel.writeInt(avs.f2504a);
            parcel.writeLong(avs.f2505b);
            parcel.writeLong(avs.f2506c);
        }
        parcel.writeByte(this.f2515i ? (byte) 1 : 0);
        parcel.writeLong(this.f2516j);
        parcel.writeInt(this.f2517k);
        parcel.writeInt(this.f2518l);
        parcel.writeInt(this.f2519m);
    }
}
