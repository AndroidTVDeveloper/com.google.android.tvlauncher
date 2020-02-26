package p000;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: avy */
/* compiled from: PG */
public final class avy {

    /* renamed from: a */
    public final long f2522a;

    /* renamed from: b */
    public final boolean f2523b;

    /* renamed from: c */
    public final boolean f2524c;

    /* renamed from: d */
    public final boolean f2525d;

    /* renamed from: e */
    public final long f2526e;

    /* renamed from: f */
    public final List f2527f;

    /* renamed from: g */
    public final boolean f2528g;

    /* renamed from: h */
    public final long f2529h;

    /* renamed from: i */
    public final int f2530i;

    /* renamed from: j */
    public final int f2531j;

    /* renamed from: k */
    public final int f2532k;

    public avy(long j, boolean z, boolean z2, boolean z3, List list, long j2, boolean z4, long j3, int i, int i2, int i3) {
        this.f2522a = j;
        this.f2523b = z;
        this.f2524c = z2;
        this.f2525d = z3;
        this.f2527f = Collections.unmodifiableList(list);
        this.f2526e = j2;
        this.f2528g = z4;
        this.f2529h = j3;
        this.f2530i = i;
        this.f2531j = i2;
        this.f2532k = i3;
    }

    public avy(Parcel parcel) {
        this.f2522a = parcel.readLong();
        boolean z = false;
        this.f2523b = parcel.readByte() == 1;
        this.f2524c = parcel.readByte() == 1;
        this.f2525d = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new avx(parcel.readInt(), parcel.readLong()));
        }
        this.f2527f = Collections.unmodifiableList(arrayList);
        this.f2526e = parcel.readLong();
        this.f2528g = parcel.readByte() == 1 ? true : z;
        this.f2529h = parcel.readLong();
        this.f2530i = parcel.readInt();
        this.f2531j = parcel.readInt();
        this.f2532k = parcel.readInt();
    }
}
