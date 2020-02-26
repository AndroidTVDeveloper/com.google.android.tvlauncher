package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bgc */
/* compiled from: PG */
public final class bgc extends bgp {
    public static final Parcelable.Creator CREATOR = new bgb();

    /* renamed from: a */
    public static final bgc f3762a;

    /* renamed from: B */
    private final SparseBooleanArray f3763B;

    /* renamed from: b */
    public final int f3764b;

    /* renamed from: c */
    public final int f3765c;

    /* renamed from: d */
    public final int f3766d;

    /* renamed from: e */
    public final int f3767e;

    /* renamed from: f */
    public final boolean f3768f;

    /* renamed from: g */
    public final boolean f3769g;

    /* renamed from: h */
    public final boolean f3770h;

    /* renamed from: i */
    public final int f3771i;

    /* renamed from: j */
    public final int f3772j;

    /* renamed from: k */
    public final boolean f3773k;

    /* renamed from: l */
    public final int f3774l;

    /* renamed from: m */
    public final int f3775m;

    /* renamed from: n */
    public final boolean f3776n;

    /* renamed from: o */
    public final boolean f3777o;

    /* renamed from: p */
    public final boolean f3778p;

    /* renamed from: q */
    public final boolean f3779q;

    /* renamed from: r */
    public final boolean f3780r;

    /* renamed from: s */
    public final boolean f3781s;

    /* renamed from: t */
    public final boolean f3782t;

    /* renamed from: u */
    public final int f3783u;

    /* renamed from: v */
    public final SparseArray f3784v;

    static {
        bgo bgo = new bgo((byte) 0);
        f3762a = new bgc(bgo.f3812a, bgo.f3813b, bgo.f3814c, bgo.f3815d, bgo.f3816e, bgo.f3817f, bgo.f3818g, bgo.f3819h, bgo.f3820i, bgo.f3821j, bgo.f3822k, bgo.f3823l, bgo.f3824m, bgo.f3825n, bgo.f3826o);
    }

    public final int describeContents() {
        return 0;
    }

    private bgc(int i, int i2, int i3, int i4, boolean z, boolean z2, int i5, int i6, boolean z3, int i7, int i8, boolean z4, boolean z5, SparseArray sparseArray, SparseBooleanArray sparseBooleanArray) {
        this.f3764b = i;
        this.f3765c = i2;
        this.f3766d = i3;
        this.f3767e = i4;
        this.f3768f = z;
        this.f3769g = false;
        this.f3770h = z2;
        this.f3771i = i5;
        this.f3772j = i6;
        this.f3773k = z3;
        this.f3774l = i7;
        this.f3775m = i8;
        this.f3776n = z4;
        this.f3777o = false;
        this.f3778p = false;
        this.f3779q = false;
        this.f3780r = false;
        this.f3781s = false;
        this.f3782t = z5;
        this.f3783u = 0;
        this.f3784v = sparseArray;
        this.f3763B = sparseBooleanArray;
    }

    public bgc(Parcel parcel) {
        super(parcel);
        this.f3764b = parcel.readInt();
        this.f3765c = parcel.readInt();
        this.f3766d = parcel.readInt();
        this.f3767e = parcel.readInt();
        this.f3768f = blm.m3650a(parcel);
        this.f3769g = blm.m3650a(parcel);
        this.f3770h = blm.m3650a(parcel);
        this.f3771i = parcel.readInt();
        this.f3772j = parcel.readInt();
        this.f3773k = blm.m3650a(parcel);
        this.f3774l = parcel.readInt();
        this.f3775m = parcel.readInt();
        this.f3776n = blm.m3650a(parcel);
        this.f3777o = blm.m3650a(parcel);
        this.f3778p = blm.m3650a(parcel);
        this.f3779q = blm.m3650a(parcel);
        this.f3780r = blm.m3650a(parcel);
        this.f3781s = blm.m3650a(parcel);
        this.f3782t = blm.m3650a(parcel);
        this.f3783u = parcel.readInt();
        int readInt = parcel.readInt();
        SparseArray sparseArray = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            HashMap hashMap = new HashMap(readInt3);
            for (int i2 = 0; i2 < readInt3; i2++) {
                hashMap.put((aye) parcel.readParcelable(aye.class.getClassLoader()), (bge) parcel.readParcelable(bge.class.getClassLoader()));
            }
            sparseArray.put(readInt2, hashMap);
        }
        this.f3784v = sparseArray;
        this.f3763B = (SparseBooleanArray) blm.m3636a(parcel.readSparseBooleanArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bgc bgc = (bgc) obj;
        if (super.equals(obj) && this.f3764b == bgc.f3764b && this.f3765c == bgc.f3765c && this.f3766d == bgc.f3766d && this.f3767e == bgc.f3767e && this.f3768f == bgc.f3768f && this.f3769g == bgc.f3769g && this.f3770h == bgc.f3770h && this.f3773k == bgc.f3773k && this.f3771i == bgc.f3771i && this.f3772j == bgc.f3772j && this.f3774l == bgc.f3774l && this.f3775m == bgc.f3775m && this.f3776n == bgc.f3776n && this.f3777o == bgc.f3777o && this.f3778p == bgc.f3778p && this.f3779q == bgc.f3779q && this.f3780r == bgc.f3780r && this.f3781s == bgc.f3781s && this.f3782t == bgc.f3782t && this.f3783u == bgc.f3783u) {
            SparseBooleanArray sparseBooleanArray = this.f3763B;
            SparseBooleanArray sparseBooleanArray2 = bgc.f3763B;
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() == size) {
                int i = 0;
                while (true) {
                    if (i < size) {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                            break;
                        }
                        i++;
                    } else {
                        SparseArray sparseArray = this.f3784v;
                        SparseArray sparseArray2 = bgc.f3784v;
                        int size2 = sparseArray.size();
                        if (sparseArray2.size() == size2) {
                            int i2 = 0;
                            while (i2 < size2) {
                                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                if (indexOfKey >= 0) {
                                    Map map = (Map) sparseArray.valueAt(i2);
                                    Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                    if (map2.size() == map.size()) {
                                        for (Map.Entry entry : map.entrySet()) {
                                            aye aye = (aye) entry.getKey();
                                            if (map2.containsKey(aye)) {
                                                if (!blm.m3652a(entry.getValue(), map2.get(aye))) {
                                                }
                                            }
                                        }
                                        i2++;
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

    /* renamed from: a */
    public final boolean mo1846a(int i) {
        return this.f3763B.get(i);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((super.hashCode() * 31) + this.f3764b) * 31) + this.f3765c) * 31) + this.f3766d) * 31) + this.f3767e) * 31) + (this.f3768f ? 1 : 0)) * 31) + (this.f3769g ? 1 : 0)) * 31) + (this.f3770h ? 1 : 0)) * 31) + (this.f3773k ? 1 : 0)) * 31) + this.f3771i) * 31) + this.f3772j) * 31) + this.f3774l) * 31) + this.f3775m) * 31) + (this.f3776n ? 1 : 0)) * 31) + (this.f3777o ? 1 : 0)) * 31) + (this.f3778p ? 1 : 0)) * 31) + (this.f3779q ? 1 : 0)) * 31) + (this.f3780r ? 1 : 0)) * 31) + (this.f3781s ? 1 : 0)) * 31) + (this.f3782t ? 1 : 0)) * 31) + this.f3783u;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3764b);
        parcel.writeInt(this.f3765c);
        parcel.writeInt(this.f3766d);
        parcel.writeInt(this.f3767e);
        blm.m3643a(parcel, this.f3768f);
        blm.m3643a(parcel, this.f3769g);
        blm.m3643a(parcel, this.f3770h);
        parcel.writeInt(this.f3771i);
        parcel.writeInt(this.f3772j);
        blm.m3643a(parcel, this.f3773k);
        parcel.writeInt(this.f3774l);
        parcel.writeInt(this.f3775m);
        blm.m3643a(parcel, this.f3776n);
        blm.m3643a(parcel, this.f3777o);
        blm.m3643a(parcel, this.f3778p);
        blm.m3643a(parcel, this.f3779q);
        blm.m3643a(parcel, this.f3780r);
        blm.m3643a(parcel, this.f3781s);
        blm.m3643a(parcel, this.f3782t);
        parcel.writeInt(this.f3783u);
        SparseArray sparseArray = this.f3784v;
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            int keyAt = sparseArray.keyAt(i2);
            Map map = (Map) sparseArray.valueAt(i2);
            int size2 = map.size();
            parcel.writeInt(keyAt);
            parcel.writeInt(size2);
            for (Map.Entry entry : map.entrySet()) {
                parcel.writeParcelable((Parcelable) entry.getKey(), 0);
                parcel.writeParcelable((Parcelable) entry.getValue(), 0);
            }
        }
        parcel.writeSparseBooleanArray(this.f3763B);
    }
}
