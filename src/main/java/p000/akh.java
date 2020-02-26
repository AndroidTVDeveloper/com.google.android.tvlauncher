package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: akh */
/* compiled from: PG */
public final class akh implements Parcelable {
    public static final Parcelable.Creator CREATOR = new akg();

    /* renamed from: A */
    public final String f544A;

    /* renamed from: B */
    public final int f545B;

    /* renamed from: C */
    public final Class f546C;

    /* renamed from: D */
    private int f547D;

    /* renamed from: a */
    public final String f548a;

    /* renamed from: b */
    public final String f549b;

    /* renamed from: c */
    public final int f550c;

    /* renamed from: d */
    public final int f551d;

    /* renamed from: e */
    public final int f552e;

    /* renamed from: f */
    public final String f553f;

    /* renamed from: g */
    public final atw f554g;

    /* renamed from: h */
    public final String f555h;

    /* renamed from: i */
    public final String f556i;

    /* renamed from: j */
    public final int f557j;

    /* renamed from: k */
    public final List f558k;

    /* renamed from: l */
    public final anq f559l;

    /* renamed from: m */
    public final long f560m;

    /* renamed from: n */
    public final int f561n;

    /* renamed from: o */
    public final int f562o;

    /* renamed from: p */
    public final float f563p;

    /* renamed from: q */
    public final int f564q;

    /* renamed from: r */
    public final float f565r;

    /* renamed from: s */
    public final int f566s;

    /* renamed from: t */
    public final byte[] f567t;

    /* renamed from: u */
    public final blp f568u;

    /* renamed from: v */
    public final int f569v;

    /* renamed from: w */
    public final int f570w;

    /* renamed from: x */
    public final int f571x;

    /* renamed from: y */
    public final int f572y;

    /* renamed from: z */
    public final int f573z;

    /* renamed from: a */
    public final int mo418a() {
        int i;
        int i2 = this.f561n;
        if (i2 == -1 || (i = this.f562o) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final int describeContents() {
        return 0;
    }

    public akh(Parcel parcel) {
        this.f548a = parcel.readString();
        this.f549b = parcel.readString();
        this.f550c = parcel.readInt();
        this.f551d = parcel.readInt();
        this.f552e = parcel.readInt();
        this.f553f = parcel.readString();
        this.f554g = (atw) parcel.readParcelable(atw.class.getClassLoader());
        this.f555h = parcel.readString();
        this.f556i = parcel.readString();
        this.f557j = parcel.readInt();
        int readInt = parcel.readInt();
        this.f558k = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f558k.add(parcel.createByteArray());
        }
        this.f559l = (anq) parcel.readParcelable(anq.class.getClassLoader());
        this.f560m = parcel.readLong();
        this.f561n = parcel.readInt();
        this.f562o = parcel.readInt();
        this.f563p = parcel.readFloat();
        this.f564q = parcel.readInt();
        this.f565r = parcel.readFloat();
        this.f567t = blm.m3650a(parcel) ? parcel.createByteArray() : null;
        this.f566s = parcel.readInt();
        this.f568u = (blp) parcel.readParcelable(blp.class.getClassLoader());
        this.f569v = parcel.readInt();
        this.f570w = parcel.readInt();
        this.f571x = parcel.readInt();
        this.f572y = parcel.readInt();
        this.f573z = parcel.readInt();
        this.f544A = parcel.readString();
        this.f545B = parcel.readInt();
        this.f546C = null;
    }

    public akh(String str, String str2, int i, int i2, int i3, String str3, atw atw, String str4, String str5, int i4, List list, anq anq, long j, int i5, int i6, float f, int i7, float f2, byte[] bArr, int i8, blp blp, int i9, int i10, int i11, int i12, int i13, String str6, int i14) {
        this.f548a = str;
        this.f549b = str2;
        this.f550c = i;
        this.f551d = i2;
        this.f552e = i3;
        this.f553f = str3;
        this.f554g = atw;
        this.f555h = str4;
        this.f556i = str5;
        this.f557j = i4;
        this.f558k = list == null ? Collections.emptyList() : list;
        this.f559l = anq;
        this.f560m = j;
        this.f561n = i5;
        this.f562o = i6;
        this.f563p = f;
        int i15 = i7;
        this.f564q = i15 == -1 ? 0 : i15;
        this.f565r = f2 == -1.0f ? 1.0f : f2;
        this.f567t = bArr;
        this.f566s = i8;
        this.f568u = blp;
        this.f569v = i9;
        this.f570w = i10;
        this.f571x = i11;
        int i16 = i12;
        this.f572y = i16 == -1 ? 0 : i16;
        int i17 = i13;
        this.f573z = i17 == -1 ? 0 : i17;
        this.f544A = blm.m3665b(str6);
        this.f545B = i14;
        this.f546C = null;
    }

    /* renamed from: a */
    public final akh mo424a(anq anq, atw atw) {
        if (anq == this.f559l) {
            if (atw == this.f554g) {
                return this;
            }
        }
        return new akh(this.f548a, this.f549b, this.f550c, this.f551d, this.f552e, this.f553f, atw, this.f555h, this.f556i, this.f557j, this.f558k, anq, this.f560m, this.f561n, this.f562o, this.f563p, this.f564q, this.f565r, this.f567t, this.f566s, this.f568u, this.f569v, this.f570w, this.f571x, this.f572y, this.f573z, this.f544A, this.f545B);
    }

    /* renamed from: a */
    public final akh mo423a(anq anq) {
        return mo424a(anq, this.f554g);
    }

    /* renamed from: b */
    public final akh mo426b() {
        return new akh(this.f548a, this.f549b, this.f550c, this.f551d, this.f552e, this.f553f, this.f554g, this.f555h, this.f556i, this.f557j, this.f558k, this.f559l, this.f560m, this.f561n, this.f562o, this.f563p, this.f564q, this.f565r, this.f567t, this.f566s, this.f568u, this.f569v, this.f570w, this.f571x, this.f572y, this.f573z, this.f544A, this.f545B);
    }

    /* renamed from: a */
    public final akh mo419a(float f) {
        return new akh(this.f548a, this.f549b, this.f550c, this.f551d, this.f552e, this.f553f, this.f554g, this.f555h, this.f556i, this.f557j, this.f558k, this.f559l, this.f560m, this.f561n, this.f562o, f, this.f564q, this.f565r, this.f567t, this.f566s, this.f568u, this.f569v, this.f570w, this.f571x, this.f572y, this.f573z, this.f544A, this.f545B);
    }

    /* renamed from: a */
    public final akh mo420a(int i, int i2) {
        return new akh(this.f548a, this.f549b, this.f550c, this.f551d, this.f552e, this.f553f, this.f554g, this.f555h, this.f556i, this.f557j, this.f558k, this.f559l, this.f560m, this.f561n, this.f562o, this.f563p, this.f564q, this.f565r, this.f567t, this.f566s, this.f568u, this.f569v, this.f570w, this.f571x, i, i2, this.f544A, this.f545B);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0054  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.akh mo422a(p000.akh r34) {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
            if (r0 == r1) goto L_0x00c4
            java.lang.String r2 = r0.f556i
            int r2 = p000.bkt.m3521g(r2)
            java.lang.String r4 = r1.f548a
            java.lang.String r3 = r1.f549b
            if (r3 == 0) goto L_0x0014
            r5 = r3
            goto L_0x0017
        L_0x0014:
            java.lang.String r3 = r0.f549b
            r5 = r3
        L_0x0017:
            java.lang.String r3 = r0.f544A
            r6 = 3
            r7 = 1
            if (r2 == r6) goto L_0x0020
            if (r2 == r7) goto L_0x0020
            goto L_0x0027
        L_0x0020:
            java.lang.String r6 = r1.f544A
            if (r6 == 0) goto L_0x0027
            r31 = r6
            goto L_0x0029
        L_0x0027:
            r31 = r3
        L_0x0029:
            int r3 = r0.f552e
            r6 = -1
            if (r3 == r6) goto L_0x0030
            r8 = r3
            goto L_0x0033
        L_0x0030:
            int r3 = r1.f552e
            r8 = r3
        L_0x0033:
            java.lang.String r3 = r0.f553f
            if (r3 != 0) goto L_0x0047
            java.lang.String r6 = r1.f553f
            java.lang.String r6 = p000.blm.m3637a(r6, r2)
            java.lang.String[] r9 = p000.blm.m3681h(r6)
            int r9 = r9.length
            if (r9 == r7) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r9 = r6
            goto L_0x0048
        L_0x0047:
            r9 = r3
        L_0x0048:
            atw r3 = r0.f554g
            if (r3 == 0) goto L_0x0054
            atw r6 = r1.f554g
            atw r3 = r3.mo1346a(r6)
            r10 = r3
            goto L_0x0057
        L_0x0054:
            atw r3 = r1.f554g
            r10 = r3
        L_0x0057:
            float r3 = r0.f563p
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x0067
            r6 = 2
            if (r2 != r6) goto L_0x0067
            float r2 = r1.f563p
            r20 = r2
            goto L_0x0069
        L_0x0067:
            r20 = r3
        L_0x0069:
            int r2 = r0.f550c
            int r6 = r1.f550c
            int r7 = r0.f551d
            int r11 = r1.f551d
            anq r1 = r1.f559l
            anq r3 = r0.f559l
            anq r15 = p000.anq.m1597a(r1, r3)
            akh r1 = new akh
            r3 = r1
            r6 = r6 | r2
            r7 = r7 | r11
            java.lang.String r11 = r0.f555h
            java.lang.String r12 = r0.f556i
            int r13 = r0.f557j
            java.util.List r14 = r0.f558k
            r34 = r1
            long r1 = r0.f560m
            r16 = r1
            int r1 = r0.f561n
            r18 = r1
            int r1 = r0.f562o
            r19 = r1
            int r1 = r0.f564q
            r21 = r1
            float r1 = r0.f565r
            r22 = r1
            byte[] r1 = r0.f567t
            r23 = r1
            int r1 = r0.f566s
            r24 = r1
            blp r1 = r0.f568u
            r25 = r1
            int r1 = r0.f569v
            r26 = r1
            int r1 = r0.f570w
            r27 = r1
            int r1 = r0.f571x
            r28 = r1
            int r1 = r0.f572y
            r29 = r1
            int r1 = r0.f573z
            r30 = r1
            int r1 = r0.f545B
            r32 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return r34
        L_0x00c4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.akh.mo422a(akh):akh");
    }

    /* renamed from: a */
    public final akh mo425a(atw atw) {
        return mo424a(this.f559l, atw);
    }

    /* renamed from: a */
    public final akh mo421a(long j) {
        return new akh(this.f548a, this.f549b, this.f550c, this.f551d, this.f552e, this.f553f, this.f554g, this.f555h, this.f556i, this.f557j, this.f558k, this.f559l, j, this.f561n, this.f562o, this.f563p, this.f564q, this.f565r, this.f567t, this.f566s, this.f568u, this.f569v, this.f570w, this.f571x, this.f572y, this.f573z, this.f544A, this.f545B);
    }

    /* renamed from: a */
    public static akh m742a(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, List list, int i4, int i5, String str6) {
        return new akh(str, str2, i4, i5, i, str5, null, str3, str4, -1, list, null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i2, i3, -1, -1, -1, str6, -1);
    }

    /* renamed from: a */
    public static akh m729a(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, List list, anq anq, int i8, String str3, atw atw) {
        return new akh(str, null, i8, 0, i, null, atw, null, str2, i2, list, anq, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, i5, i6, i7, str3, -1);
    }

    /* renamed from: a */
    public static akh m730a(String str, String str2, int i, int i2, int i3, int i4, int i5, List list, anq anq, int i6, String str3) {
        return m729a(str, str2, i, i2, i3, i4, i5, -1, -1, list, anq, i6, str3, null);
    }

    /* renamed from: a */
    public static akh m731a(String str, String str2, int i, int i2, int i3, int i4, List list, anq anq, String str3) {
        return m730a(str, str2, i, i2, i3, i4, -1, list, anq, 0, str3);
    }

    /* renamed from: a */
    public static akh m740a(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, String str6) {
        return new akh(str, str2, i2, i3, i, str5, null, str3, str4, -1, null, null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str6, -1);
    }

    /* renamed from: a */
    public static akh m734a(String str, String str2, int i, List list, String str3, anq anq) {
        return new akh(str, null, i, 0, -1, null, null, null, str2, -1, list, anq, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str3, -1);
    }

    /* renamed from: a */
    public static akh m735a(String str, String str2, long j) {
        return new akh(str, null, 0, 0, -1, null, null, null, str2, -1, null, null, j, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, null, -1);
    }

    /* renamed from: a */
    public static akh m728a(String str, String str2) {
        return new akh(str, null, 0, 0, -1, null, null, null, str2, -1, null, null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, null, -1);
    }

    /* renamed from: a */
    public static akh m738a(String str, String str2, String str3, String str4, int i, int i2, int i3, String str5) {
        return m741a(str, str2, str3, str4, null, i, i2, i3, str5, -1);
    }

    /* renamed from: a */
    public static akh m741a(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, String str6, int i4) {
        return new akh(str, str2, i2, i3, i, str5, null, str3, str4, -1, null, null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str6, i4);
    }

    /* renamed from: a */
    public static akh m727a(String str) {
        return m733a(null, str, 0, null, null);
    }

    /* renamed from: a */
    public static akh m733a(String str, String str2, int i, String str3, anq anq) {
        return m732a(str, str2, i, str3, -1, anq, Long.MAX_VALUE, Collections.emptyList());
    }

    /* renamed from: a */
    public static akh m732a(String str, String str2, int i, String str3, int i2, anq anq, long j, List list) {
        return new akh(str, null, i, 0, -1, null, null, null, str2, -1, list, anq, j, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str3, i2);
    }

    /* renamed from: b */
    public static akh m743b(String str, String str2, long j) {
        return m732a((String) null, str, 0, str2, -1, (anq) null, j, Collections.emptyList());
    }

    /* renamed from: a */
    public static akh m739a(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, float f, List list, int i4, int i5) {
        return new akh(str, str2, i4, i5, i, str5, null, str3, str4, -1, list, null, Long.MAX_VALUE, i2, i3, f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, null, -1);
    }

    /* renamed from: a */
    public static akh m737a(String str, String str2, String str3, int i, int i2, List list, float f) {
        return m736a(str, str2, str3, -1, i, i2, list, -1, f, null, -1, null, null);
    }

    /* renamed from: a */
    public static akh m736a(String str, String str2, String str3, int i, int i2, int i3, List list, int i4, float f, byte[] bArr, int i5, blp blp, anq anq) {
        return new akh(str, null, 0, 0, -1, str3, null, null, str2, i, list, anq, Long.MAX_VALUE, i2, i3, -1.0f, i4, f, bArr, i5, blp, -1, -1, -1, -1, -1, null, -1);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        akh akh = (akh) obj;
        int i2 = this.f547D;
        return (i2 == 0 || (i = akh.f547D) == 0 || i2 == i) && this.f550c == akh.f550c && this.f551d == akh.f551d && this.f552e == akh.f552e && this.f557j == akh.f557j && this.f560m == akh.f560m && this.f561n == akh.f561n && this.f562o == akh.f562o && this.f564q == akh.f564q && this.f566s == akh.f566s && this.f569v == akh.f569v && this.f570w == akh.f570w && this.f571x == akh.f571x && this.f572y == akh.f572y && this.f573z == akh.f573z && this.f545B == akh.f545B && Float.compare(this.f563p, akh.f563p) == 0 && Float.compare(this.f565r, akh.f565r) == 0 && blm.m3652a(null, null) && blm.m3652a(this.f548a, akh.f548a) && blm.m3652a(this.f549b, akh.f549b) && blm.m3652a(this.f553f, akh.f553f) && blm.m3652a(this.f555h, akh.f555h) && blm.m3652a(this.f556i, akh.f556i) && blm.m3652a(this.f544A, akh.f544A) && Arrays.equals(this.f567t, akh.f567t) && blm.m3652a(this.f554g, akh.f554g) && blm.m3652a(this.f568u, akh.f568u) && blm.m3652a(this.f559l, akh.f559l) && mo427b(akh);
    }

    public final int hashCode() {
        int i = this.f547D;
        if (i != 0) {
            return i;
        }
        String str = this.f548a;
        int i2 = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f549b;
        int hashCode2 = (((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f550c) * 31) + this.f551d) * 31) + this.f552e) * 31;
        String str3 = this.f553f;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        atw atw = this.f554g;
        int hashCode4 = (hashCode3 + (atw != null ? atw.hashCode() : 0)) * 31;
        String str4 = this.f555h;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f556i;
        int hashCode6 = (((((((((((((((((((((((((((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.f557j) * 31) + ((int) this.f560m)) * 31) + this.f561n) * 31) + this.f562o) * 31) + Float.floatToIntBits(this.f563p)) * 31) + this.f564q) * 31) + Float.floatToIntBits(this.f565r)) * 31) + this.f566s) * 31) + this.f569v) * 31) + this.f570w) * 31) + this.f571x) * 31) + this.f572y) * 31) + this.f573z) * 31;
        String str6 = this.f544A;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        int i3 = (((hashCode6 + i2) * 31) + this.f545B) * 31;
        this.f547D = i3;
        return i3;
    }

    /* renamed from: b */
    public final boolean mo427b(akh akh) {
        if (this.f558k.size() != akh.f558k.size()) {
            return false;
        }
        for (int i = 0; i < this.f558k.size(); i++) {
            if (!Arrays.equals((byte[]) this.f558k.get(i), (byte[]) akh.f558k.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        String str = this.f548a;
        String str2 = this.f549b;
        String str3 = this.f555h;
        String str4 = this.f556i;
        String str5 = this.f553f;
        int i = this.f552e;
        String str6 = this.f544A;
        int i2 = this.f561n;
        int i3 = this.f562o;
        float f = this.f563p;
        int i4 = this.f569v;
        int i5 = this.f570w;
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
        sb.append(i);
        sb.append(", ");
        sb.append(str6);
        sb.append(", [");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(f);
        sb.append("], [");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append("])");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f548a);
        parcel.writeString(this.f549b);
        parcel.writeInt(this.f550c);
        parcel.writeInt(this.f551d);
        parcel.writeInt(this.f552e);
        parcel.writeString(this.f553f);
        boolean z = false;
        parcel.writeParcelable(this.f554g, 0);
        parcel.writeString(this.f555h);
        parcel.writeString(this.f556i);
        parcel.writeInt(this.f557j);
        int size = this.f558k.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray((byte[]) this.f558k.get(i2));
        }
        parcel.writeParcelable(this.f559l, 0);
        parcel.writeLong(this.f560m);
        parcel.writeInt(this.f561n);
        parcel.writeInt(this.f562o);
        parcel.writeFloat(this.f563p);
        parcel.writeInt(this.f564q);
        parcel.writeFloat(this.f565r);
        if (this.f567t != null) {
            z = true;
        }
        blm.m3643a(parcel, z);
        byte[] bArr = this.f567t;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f566s);
        parcel.writeParcelable(this.f568u, i);
        parcel.writeInt(this.f569v);
        parcel.writeInt(this.f570w);
        parcel.writeInt(this.f571x);
        parcel.writeInt(this.f572y);
        parcel.writeInt(this.f573z);
        parcel.writeString(this.f544A);
        parcel.writeInt(this.f545B);
    }
}
