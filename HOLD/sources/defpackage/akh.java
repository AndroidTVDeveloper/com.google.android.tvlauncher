package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: akh  reason: default package */
/* compiled from: PG */
public final class akh implements Parcelable {
    public static final Parcelable.Creator CREATOR = new akg();
    public final String A;
    public final int B;
    public final Class C;
    private int D;
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public final atw g;
    public final String h;
    public final String i;
    public final int j;
    public final List k;
    public final anq l;
    public final long m;
    public final int n;
    public final int o;
    public final float p;
    public final int q;
    public final float r;
    public final int s;
    public final byte[] t;
    public final blp u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public final int a() {
        int i2;
        int i3 = this.n;
        if (i3 == -1 || (i2 = this.o) == -1) {
            return -1;
        }
        return i3 * i2;
    }

    public final int describeContents() {
        return 0;
    }

    public akh(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = (atw) parcel.readParcelable(atw.class.getClassLoader());
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.j = parcel.readInt();
        int readInt = parcel.readInt();
        this.k = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            this.k.add(parcel.createByteArray());
        }
        this.l = (anq) parcel.readParcelable(anq.class.getClassLoader());
        this.m = parcel.readLong();
        this.n = parcel.readInt();
        this.o = parcel.readInt();
        this.p = parcel.readFloat();
        this.q = parcel.readInt();
        this.r = parcel.readFloat();
        this.t = blm.a(parcel) ? parcel.createByteArray() : null;
        this.s = parcel.readInt();
        this.u = (blp) parcel.readParcelable(blp.class.getClassLoader());
        this.v = parcel.readInt();
        this.w = parcel.readInt();
        this.x = parcel.readInt();
        this.y = parcel.readInt();
        this.z = parcel.readInt();
        this.A = parcel.readString();
        this.B = parcel.readInt();
        this.C = null;
    }

    public akh(String str, String str2, int i2, int i3, int i4, String str3, atw atw, String str4, String str5, int i5, List list, anq anq, long j2, int i6, int i7, float f2, int i8, float f3, byte[] bArr, int i9, blp blp, int i10, int i11, int i12, int i13, int i14, String str6, int i15) {
        this.a = str;
        this.b = str2;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = str3;
        this.g = atw;
        this.h = str4;
        this.i = str5;
        this.j = i5;
        this.k = list == null ? Collections.emptyList() : list;
        this.l = anq;
        this.m = j2;
        this.n = i6;
        this.o = i7;
        this.p = f2;
        int i16 = i8;
        this.q = i16 == -1 ? 0 : i16;
        this.r = f3 == -1.0f ? 1.0f : f3;
        this.t = bArr;
        this.s = i9;
        this.u = blp;
        this.v = i10;
        this.w = i11;
        this.x = i12;
        int i17 = i13;
        this.y = i17 == -1 ? 0 : i17;
        int i18 = i14;
        this.z = i18 == -1 ? 0 : i18;
        this.A = blm.b(str6);
        this.B = i15;
        this.C = null;
    }

    public final akh a(anq anq, atw atw) {
        if (anq == this.l) {
            if (atw == this.g) {
                return this;
            }
        }
        return new akh(this.a, this.b, this.c, this.d, this.e, this.f, atw, this.h, this.i, this.j, this.k, anq, this.m, this.n, this.o, this.p, this.q, this.r, this.t, this.s, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B);
    }

    public final akh a(anq anq) {
        return a(anq, this.g);
    }

    public final akh b() {
        return new akh(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.t, this.s, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B);
    }

    public final akh a(float f2) {
        return new akh(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, f2, this.q, this.r, this.t, this.s, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B);
    }

    public final akh a(int i2, int i3) {
        return new akh(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.t, this.s, this.u, this.v, this.w, this.x, i2, i3, this.A, this.B);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.akh a(defpackage.akh r34) {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
            if (r0 == r1) goto L_0x00c4
            java.lang.String r2 = r0.i
            int r2 = defpackage.bkt.g(r2)
            java.lang.String r4 = r1.a
            java.lang.String r3 = r1.b
            if (r3 == 0) goto L_0x0014
            r5 = r3
            goto L_0x0017
        L_0x0014:
            java.lang.String r3 = r0.b
            r5 = r3
        L_0x0017:
            java.lang.String r3 = r0.A
            r6 = 3
            r7 = 1
            if (r2 == r6) goto L_0x0020
            if (r2 == r7) goto L_0x0020
            goto L_0x0027
        L_0x0020:
            java.lang.String r6 = r1.A
            if (r6 == 0) goto L_0x0027
            r31 = r6
            goto L_0x0029
        L_0x0027:
            r31 = r3
        L_0x0029:
            int r3 = r0.e
            r6 = -1
            if (r3 == r6) goto L_0x0030
            r8 = r3
            goto L_0x0033
        L_0x0030:
            int r3 = r1.e
            r8 = r3
        L_0x0033:
            java.lang.String r3 = r0.f
            if (r3 != 0) goto L_0x0047
            java.lang.String r6 = r1.f
            java.lang.String r6 = defpackage.blm.a(r6, r2)
            java.lang.String[] r9 = defpackage.blm.h(r6)
            int r9 = r9.length
            if (r9 == r7) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r9 = r6
            goto L_0x0048
        L_0x0047:
            r9 = r3
        L_0x0048:
            atw r3 = r0.g
            if (r3 == 0) goto L_0x0054
            atw r6 = r1.g
            atw r3 = r3.a(r6)
            r10 = r3
            goto L_0x0057
        L_0x0054:
            atw r3 = r1.g
            r10 = r3
        L_0x0057:
            float r3 = r0.p
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x0067
            r6 = 2
            if (r2 != r6) goto L_0x0067
            float r2 = r1.p
            r20 = r2
            goto L_0x0069
        L_0x0067:
            r20 = r3
        L_0x0069:
            int r2 = r0.c
            int r6 = r1.c
            int r7 = r0.d
            int r11 = r1.d
            anq r1 = r1.l
            anq r3 = r0.l
            anq r15 = defpackage.anq.a(r1, r3)
            akh r1 = new akh
            r3 = r1
            r6 = r6 | r2
            r7 = r7 | r11
            java.lang.String r11 = r0.h
            java.lang.String r12 = r0.i
            int r13 = r0.j
            java.util.List r14 = r0.k
            r34 = r1
            long r1 = r0.m
            r16 = r1
            int r1 = r0.n
            r18 = r1
            int r1 = r0.o
            r19 = r1
            int r1 = r0.q
            r21 = r1
            float r1 = r0.r
            r22 = r1
            byte[] r1 = r0.t
            r23 = r1
            int r1 = r0.s
            r24 = r1
            blp r1 = r0.u
            r25 = r1
            int r1 = r0.v
            r26 = r1
            int r1 = r0.w
            r27 = r1
            int r1 = r0.x
            r28 = r1
            int r1 = r0.y
            r29 = r1
            int r1 = r0.z
            r30 = r1
            int r1 = r0.B
            r32 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return r34
        L_0x00c4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akh.a(akh):akh");
    }

    public final akh a(atw atw) {
        return a(this.l, atw);
    }

    public final akh a(long j2) {
        return new akh(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, j2, this.n, this.o, this.p, this.q, this.r, this.t, this.s, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B);
    }

    public static akh a(String str, String str2, String str3, String str4, String str5, int i2, int i3, int i4, List list, int i5, int i6, String str6) {
        return new akh(str, str2, i5, i6, i2, str5, null, str3, str4, -1, list, null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, -1, -1, -1, str6, -1);
    }

    public static akh a(String str, String str2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, List list, anq anq, int i9, String str3, atw atw) {
        return new akh(str, null, i9, 0, i2, null, atw, null, str2, i3, list, anq, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i4, i5, i6, i7, i8, str3, -1);
    }

    public static akh a(String str, String str2, int i2, int i3, int i4, int i5, int i6, List list, anq anq, int i7, String str3) {
        return a(str, str2, i2, i3, i4, i5, i6, -1, -1, list, anq, i7, str3, null);
    }

    public static akh a(String str, String str2, int i2, int i3, int i4, int i5, List list, anq anq, String str3) {
        return a(str, str2, i2, i3, i4, i5, -1, list, anq, 0, str3);
    }

    public static akh a(String str, String str2, String str3, String str4, String str5, int i2, int i3, int i4, String str6) {
        return new akh(str, str2, i3, i4, i2, str5, null, str3, str4, -1, null, null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str6, -1);
    }

    public static akh a(String str, String str2, int i2, List list, String str3, anq anq) {
        return new akh(str, null, i2, 0, -1, null, null, null, str2, -1, list, anq, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str3, -1);
    }

    public static akh a(String str, String str2, long j2) {
        return new akh(str, null, 0, 0, -1, null, null, null, str2, -1, null, null, j2, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, null, -1);
    }

    public static akh a(String str, String str2) {
        return new akh(str, null, 0, 0, -1, null, null, null, str2, -1, null, null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, null, -1);
    }

    public static akh a(String str, String str2, String str3, String str4, int i2, int i3, int i4, String str5) {
        return a(str, str2, str3, str4, null, i2, i3, i4, str5, -1);
    }

    public static akh a(String str, String str2, String str3, String str4, String str5, int i2, int i3, int i4, String str6, int i5) {
        return new akh(str, str2, i3, i4, i2, str5, null, str3, str4, -1, null, null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str6, i5);
    }

    public static akh a(String str) {
        return a(null, str, 0, null, null);
    }

    public static akh a(String str, String str2, int i2, String str3, anq anq) {
        return a(str, str2, i2, str3, -1, anq, Long.MAX_VALUE, Collections.emptyList());
    }

    public static akh a(String str, String str2, int i2, String str3, int i3, anq anq, long j2, List list) {
        return new akh(str, null, i2, 0, -1, null, null, null, str2, -1, list, anq, j2, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str3, i3);
    }

    public static akh b(String str, String str2, long j2) {
        return a((String) null, str, 0, str2, -1, (anq) null, j2, Collections.emptyList());
    }

    public static akh a(String str, String str2, String str3, String str4, String str5, int i2, int i3, int i4, float f2, List list, int i5, int i6) {
        return new akh(str, str2, i5, i6, i2, str5, null, str3, str4, -1, list, null, Long.MAX_VALUE, i3, i4, f2, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, null, -1);
    }

    public static akh a(String str, String str2, String str3, int i2, int i3, List list, float f2) {
        return a(str, str2, str3, -1, i2, i3, list, -1, f2, null, -1, null, null);
    }

    public static akh a(String str, String str2, String str3, int i2, int i3, int i4, List list, int i5, float f2, byte[] bArr, int i6, blp blp, anq anq) {
        return new akh(str, null, 0, 0, -1, str3, null, null, str2, i2, list, anq, Long.MAX_VALUE, i3, i4, -1.0f, i5, f2, bArr, i6, blp, -1, -1, -1, -1, -1, null, -1);
    }

    public final boolean equals(Object obj) {
        int i2;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        akh akh = (akh) obj;
        int i3 = this.D;
        return (i3 == 0 || (i2 = akh.D) == 0 || i3 == i2) && this.c == akh.c && this.d == akh.d && this.e == akh.e && this.j == akh.j && this.m == akh.m && this.n == akh.n && this.o == akh.o && this.q == akh.q && this.s == akh.s && this.v == akh.v && this.w == akh.w && this.x == akh.x && this.y == akh.y && this.z == akh.z && this.B == akh.B && Float.compare(this.p, akh.p) == 0 && Float.compare(this.r, akh.r) == 0 && blm.a(null, null) && blm.a(this.a, akh.a) && blm.a(this.b, akh.b) && blm.a(this.f, akh.f) && blm.a(this.h, akh.h) && blm.a(this.i, akh.i) && blm.a(this.A, akh.A) && Arrays.equals(this.t, akh.t) && blm.a(this.g, akh.g) && blm.a(this.u, akh.u) && blm.a(this.l, akh.l) && b(akh);
    }

    public final int hashCode() {
        int i2 = this.D;
        if (i2 != 0) {
            return i2;
        }
        String str = this.a;
        int i3 = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.b;
        int hashCode2 = (((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31;
        String str3 = this.f;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        atw atw = this.g;
        int hashCode4 = (hashCode3 + (atw != null ? atw.hashCode() : 0)) * 31;
        String str4 = this.h;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.i;
        int hashCode6 = (((((((((((((((((((((((((((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.j) * 31) + ((int) this.m)) * 31) + this.n) * 31) + this.o) * 31) + Float.floatToIntBits(this.p)) * 31) + this.q) * 31) + Float.floatToIntBits(this.r)) * 31) + this.s) * 31) + this.v) * 31) + this.w) * 31) + this.x) * 31) + this.y) * 31) + this.z) * 31;
        String str6 = this.A;
        if (str6 != null) {
            i3 = str6.hashCode();
        }
        int i4 = (((hashCode6 + i3) * 31) + this.B) * 31;
        this.D = i4;
        return i4;
    }

    public final boolean b(akh akh) {
        if (this.k.size() != akh.k.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            if (!Arrays.equals((byte[]) this.k.get(i2), (byte[]) akh.k.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.h;
        String str4 = this.i;
        String str5 = this.f;
        int i2 = this.e;
        String str6 = this.A;
        int i3 = this.n;
        int i4 = this.o;
        float f2 = this.p;
        int i5 = this.v;
        int i6 = this.w;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        StringBuilder sb = new StringBuilder(length + 104 + length2 + length3 + length4 + String.valueOf(str5).length() + String.valueOf(str6).length());
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str4);
        sb.append(", ");
        sb.append(str5);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(str6);
        sb.append(", [");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(", ");
        sb.append(f2);
        sb.append("], [");
        sb.append(i5);
        sb.append(", ");
        sb.append(i6);
        sb.append("])");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        boolean z2 = false;
        parcel.writeParcelable(this.g, 0);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeInt(this.j);
        int size = this.k.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeByteArray((byte[]) this.k.get(i3));
        }
        parcel.writeParcelable(this.l, 0);
        parcel.writeLong(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.o);
        parcel.writeFloat(this.p);
        parcel.writeInt(this.q);
        parcel.writeFloat(this.r);
        if (this.t != null) {
            z2 = true;
        }
        blm.a(parcel, z2);
        byte[] bArr = this.t;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.s);
        parcel.writeParcelable(this.u, i2);
        parcel.writeInt(this.v);
        parcel.writeInt(this.w);
        parcel.writeInt(this.x);
        parcel.writeInt(this.y);
        parcel.writeInt(this.z);
        parcel.writeString(this.A);
        parcel.writeInt(this.B);
    }
}
