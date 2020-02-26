package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bgc  reason: default package */
/* compiled from: PG */
public final class bgc extends bgp {
    public static final Parcelable.Creator CREATOR = new bgb();
    public static final bgc a;
    private final SparseBooleanArray B;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int j;
    public final boolean k;
    public final int l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final int u;
    public final SparseArray v;

    static {
        bgo bgo = new bgo((byte) 0);
        a = new bgc(bgo.a, bgo.b, bgo.c, bgo.d, bgo.e, bgo.f, bgo.g, bgo.h, bgo.i, bgo.j, bgo.k, bgo.l, bgo.m, bgo.n, bgo.o);
    }

    public final int describeContents() {
        return 0;
    }

    private bgc(int i2, int i3, int i4, int i5, boolean z, boolean z2, int i6, int i7, boolean z3, int i8, int i9, boolean z4, boolean z5, SparseArray sparseArray, SparseBooleanArray sparseBooleanArray) {
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = z;
        this.g = false;
        this.h = z2;
        this.i = i6;
        this.j = i7;
        this.k = z3;
        this.l = i8;
        this.m = i9;
        this.n = z4;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = z5;
        this.u = 0;
        this.v = sparseArray;
        this.B = sparseBooleanArray;
    }

    public bgc(Parcel parcel) {
        super(parcel);
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = blm.a(parcel);
        this.g = blm.a(parcel);
        this.h = blm.a(parcel);
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.k = blm.a(parcel);
        this.l = parcel.readInt();
        this.m = parcel.readInt();
        this.n = blm.a(parcel);
        this.o = blm.a(parcel);
        this.p = blm.a(parcel);
        this.q = blm.a(parcel);
        this.r = blm.a(parcel);
        this.s = blm.a(parcel);
        this.t = blm.a(parcel);
        this.u = parcel.readInt();
        int readInt = parcel.readInt();
        SparseArray sparseArray = new SparseArray(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            HashMap hashMap = new HashMap(readInt3);
            for (int i3 = 0; i3 < readInt3; i3++) {
                hashMap.put((aye) parcel.readParcelable(aye.class.getClassLoader()), (bge) parcel.readParcelable(bge.class.getClassLoader()));
            }
            sparseArray.put(readInt2, hashMap);
        }
        this.v = sparseArray;
        this.B = (SparseBooleanArray) blm.a(parcel.readSparseBooleanArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bgc bgc = (bgc) obj;
        if (super.equals(obj) && this.b == bgc.b && this.c == bgc.c && this.d == bgc.d && this.e == bgc.e && this.f == bgc.f && this.g == bgc.g && this.h == bgc.h && this.k == bgc.k && this.i == bgc.i && this.j == bgc.j && this.l == bgc.l && this.m == bgc.m && this.n == bgc.n && this.o == bgc.o && this.p == bgc.p && this.q == bgc.q && this.r == bgc.r && this.s == bgc.s && this.t == bgc.t && this.u == bgc.u) {
            SparseBooleanArray sparseBooleanArray = this.B;
            SparseBooleanArray sparseBooleanArray2 = bgc.B;
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() == size) {
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i2)) < 0) {
                            break;
                        }
                        i2++;
                    } else {
                        SparseArray sparseArray = this.v;
                        SparseArray sparseArray2 = bgc.v;
                        int size2 = sparseArray.size();
                        if (sparseArray2.size() == size2) {
                            int i3 = 0;
                            while (i3 < size2) {
                                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i3));
                                if (indexOfKey >= 0) {
                                    Map map = (Map) sparseArray.valueAt(i3);
                                    Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                    if (map2.size() == map.size()) {
                                        for (Map.Entry entry : map.entrySet()) {
                                            aye aye = (aye) entry.getKey();
                                            if (map2.containsKey(aye)) {
                                                if (!blm.a(entry.getValue(), map2.get(aye))) {
                                                }
                                            }
                                        }
                                        i3++;
                                    }
                                }
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean a(int i2) {
        return this.B.get(i2);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((super.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31) + this.i) * 31) + this.j) * 31) + this.l) * 31) + this.m) * 31) + (this.n ? 1 : 0)) * 31) + (this.o ? 1 : 0)) * 31) + (this.p ? 1 : 0)) * 31) + (this.q ? 1 : 0)) * 31) + (this.r ? 1 : 0)) * 31) + (this.s ? 1 : 0)) * 31) + (this.t ? 1 : 0)) * 31) + this.u;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        blm.a(parcel, this.f);
        blm.a(parcel, this.g);
        blm.a(parcel, this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        blm.a(parcel, this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        blm.a(parcel, this.n);
        blm.a(parcel, this.o);
        blm.a(parcel, this.p);
        blm.a(parcel, this.q);
        blm.a(parcel, this.r);
        blm.a(parcel, this.s);
        blm.a(parcel, this.t);
        parcel.writeInt(this.u);
        SparseArray sparseArray = this.v;
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            int keyAt = sparseArray.keyAt(i3);
            Map map = (Map) sparseArray.valueAt(i3);
            int size2 = map.size();
            parcel.writeInt(keyAt);
            parcel.writeInt(size2);
            for (Map.Entry entry : map.entrySet()) {
                parcel.writeParcelable((Parcelable) entry.getKey(), 0);
                parcel.writeParcelable((Parcelable) entry.getValue(), 0);
            }
        }
        parcel.writeSparseBooleanArray(this.B);
    }
}
