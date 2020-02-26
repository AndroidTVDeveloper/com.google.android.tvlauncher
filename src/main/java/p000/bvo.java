package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: bvo */
/* compiled from: PG */
public final class bvo extends buf {
    public static final Parcelable.Creator CREATOR = new bvp();

    /* renamed from: a */
    private static final byte[][] f4906a = new byte[0][];

    /* renamed from: b */
    private final String f4907b;

    /* renamed from: c */
    private final byte[] f4908c;

    /* renamed from: d */
    private final byte[][] f4909d;

    /* renamed from: e */
    private final byte[][] f4910e;

    /* renamed from: f */
    private final byte[][] f4911f;

    /* renamed from: g */
    private final byte[][] f4912g;

    /* renamed from: h */
    private final int[] f4913h;

    /* renamed from: i */
    private final byte[][] f4914i;

    /* renamed from: j */
    private final int[] f4915j;

    static {
        byte[][] bArr = f4906a;
        new bvo("", null, bArr, bArr, bArr, bArr, null, null, null);
    }

    public bvo(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2) {
        this.f4907b = str;
        this.f4908c = bArr;
        this.f4909d = bArr2;
        this.f4910e = bArr3;
        this.f4911f = bArr4;
        this.f4912g = bArr5;
        this.f4913h = iArr;
        this.f4914i = bArr6;
        this.f4915j = iArr2;
    }

    /* renamed from: a */
    private static List m4280a(int[] iArr) {
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

    /* renamed from: a */
    private static List m4281a(byte[][] bArr) {
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
            if (!cbd.m4473a(this.f4907b, bvo.f4907b) || !Arrays.equals(this.f4908c, bvo.f4908c) || !cbd.m4473a(m4281a(this.f4909d), m4281a(bvo.f4909d)) || !cbd.m4473a(m4281a(this.f4910e), m4281a(bvo.f4910e)) || !cbd.m4473a(m4281a(this.f4911f), m4281a(bvo.f4911f)) || !cbd.m4473a(m4281a(this.f4912g), m4281a(bvo.f4912g)) || !cbd.m4473a(m4280a(this.f4913h), m4280a(bvo.f4913h)) || !cbd.m4473a(m4281a(this.f4914i), m4281a(bvo.f4914i)) || !cbd.m4473a(m4283b(this.f4915j), m4283b(bvo.f4915j))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static List m4283b(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i = 0; i < iArr.length; i += 2) {
            arrayList.add(new bvr(iArr[i], iArr[i + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        String str2 = this.f4907b;
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
        byte[] bArr = this.f4908c;
        sb.append(", direct==");
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        m4282a(sb, "GAIA=", this.f4909d);
        sb.append(", ");
        m4282a(sb, "PSEUDO=", this.f4910e);
        sb.append(", ");
        m4282a(sb, "ALWAYS=", this.f4911f);
        sb.append(", ");
        m4282a(sb, "OTHER=", this.f4912g);
        sb.append(", weak=");
        sb.append(Arrays.toString(this.f4913h));
        sb.append(", ");
        m4282a(sb, "directs=", this.f4914i);
        sb.append(", genDims=");
        sb.append(Arrays.toString(m4283b(this.f4915j).toArray()));
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    private static void m4282a(StringBuilder sb, String str, byte[][] bArr) {
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            sb.append("null");
            return;
        }
        sb.append("(");
        int length = bArr.length;
        int i = 0;
        boolean z = true;
        while (i < length) {
            byte[] bArr2 = bArr[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append("'");
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append("'");
            i++;
            z = false;
        }
        sb.append(")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = buj.m4230a(parcel);
        buj.m4239a(parcel, 2, this.f4907b);
        buj.m4242a(parcel, 3, this.f4908c);
        buj.m4246a(parcel, 4, this.f4909d);
        buj.m4246a(parcel, 5, this.f4910e);
        buj.m4246a(parcel, 6, this.f4911f);
        buj.m4246a(parcel, 7, this.f4912g);
        buj.m4243a(parcel, 8, this.f4913h);
        buj.m4246a(parcel, 9, this.f4914i);
        buj.m4243a(parcel, 10, this.f4915j);
        buj.m4250b(parcel, a);
    }
}
