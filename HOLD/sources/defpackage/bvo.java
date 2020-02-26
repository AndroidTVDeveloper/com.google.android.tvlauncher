package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: bvo  reason: default package */
/* compiled from: PG */
public final class bvo extends buf {
    public static final Parcelable.Creator CREATOR = new bvp();
    private static final byte[][] a = new byte[0][];
    private final String b;
    private final byte[] c;
    private final byte[][] d;
    private final byte[][] e;
    private final byte[][] f;
    private final byte[][] g;
    private final int[] h;
    private final byte[][] i;
    private final int[] j;

    static {
        byte[][] bArr = a;
        new bvo("", null, bArr, bArr, bArr, bArr, null, null, null);
    }

    public bvo(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2) {
        this.b = str;
        this.c = bArr;
        this.d = bArr2;
        this.e = bArr3;
        this.f = bArr4;
        this.g = bArr5;
        this.h = iArr;
        this.i = bArr6;
        this.j = iArr2;
    }

    private static List a(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(r0);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static List a(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(r0);
        for (byte[] encodeToString : bArr) {
            arrayList.add(Base64.encodeToString(encodeToString, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bvo) {
            bvo bvo = (bvo) obj;
            if (!cbd.a(this.b, bvo.b) || !Arrays.equals(this.c, bvo.c) || !cbd.a(a(this.d), a(bvo.d)) || !cbd.a(a(this.e), a(bvo.e)) || !cbd.a(a(this.f), a(bvo.f)) || !cbd.a(a(this.g), a(bvo.g)) || !cbd.a(a(this.h), a(bvo.h)) || !cbd.a(a(this.i), a(bvo.i)) || !cbd.a(b(this.j), b(bvo.j))) {
                return false;
            }
            return true;
        }
        return false;
    }

    private static List b(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i2 = 0; i2 < iArr.length; i2 += 2) {
            arrayList.add(new bvr(iArr[i2], iArr[i2 + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        String str2 = this.b;
        if (str2 != null) {
            StringBuilder sb2 = new StringBuilder(str2.length() + 2);
            sb2.append("'");
            sb2.append(str2);
            sb2.append("'");
            str = sb2.toString();
        } else {
            str = "null";
        }
        sb.append(str);
        byte[] bArr = this.c;
        sb.append(", direct==");
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        a(sb, "GAIA=", this.d);
        sb.append(", ");
        a(sb, "PSEUDO=", this.e);
        sb.append(", ");
        a(sb, "ALWAYS=", this.f);
        sb.append(", ");
        a(sb, "OTHER=", this.g);
        sb.append(", weak=");
        sb.append(Arrays.toString(this.h));
        sb.append(", ");
        a(sb, "directs=", this.i);
        sb.append(", genDims=");
        sb.append(Arrays.toString(b(this.j).toArray()));
        sb.append(")");
        return sb.toString();
    }

    private static void a(StringBuilder sb, String str, byte[][] bArr) {
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            sb.append("null");
            return;
        }
        sb.append("(");
        int length = bArr.length;
        int i2 = 0;
        boolean z = true;
        while (i2 < length) {
            byte[] bArr2 = bArr[i2];
            if (!z) {
                sb.append(", ");
            }
            sb.append("'");
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append("'");
            i2++;
            z = false;
        }
        sb.append(")");
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = buj.a(parcel);
        buj.a(parcel, 2, this.b);
        buj.a(parcel, 3, this.c);
        buj.a(parcel, 4, this.d);
        buj.a(parcel, 5, this.e);
        buj.a(parcel, 6, this.f);
        buj.a(parcel, 7, this.g);
        buj.a(parcel, 8, this.h);
        buj.a(parcel, 9, this.i);
        buj.a(parcel, 10, this.j);
        buj.b(parcel, a2);
    }
}
