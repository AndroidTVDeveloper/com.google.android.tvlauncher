package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: bnc  reason: default package */
/* compiled from: PG */
public final class bnc extends buf {
    public static final Parcelable.Creator CREATOR = new bnd();
    public byte[] a;
    public dng b;
    private final bnl c;
    private final int[] d;
    private final String[] e;
    private final int[] f;
    private final byte[][] g;
    private final bvo[] h;
    private final boolean i;
    private final bvr[] j;

    public bnc(bnl bnl, dng dng) {
        this.c = bnl;
        this.b = dng;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = true;
        this.j = null;
    }

    public bnc(bnl bnl, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, bvo[] bvoArr, bvr[] bvrArr) {
        this.c = bnl;
        this.a = bArr;
        this.d = iArr;
        this.e = strArr;
        this.b = null;
        this.f = iArr2;
        this.g = bArr2;
        this.h = bvoArr;
        this.i = z;
        this.j = bvrArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bnc) {
            bnc bnc = (bnc) obj;
            return bty.a(this.c, bnc.c) && Arrays.equals(this.a, bnc.a) && Arrays.equals(this.d, bnc.d) && Arrays.equals(this.e, bnc.e) && bty.a(this.b, bnc.b) && bty.a(null, null) && bty.a(null, null) && Arrays.equals(this.f, bnc.f) && Arrays.deepEquals(this.g, bnc.g) && Arrays.equals(this.h, bnc.h) && this.i == bnc.i && Arrays.equals(this.j, bnc.j);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.a, this.d, this.e, this.b, null, null, this.f, this.g, this.h, Boolean.valueOf(this.i), this.j});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.c);
        sb.append(", LogEventBytes: ");
        byte[] bArr = this.a;
        sb.append(bArr != null ? new String(bArr) : null);
        sb.append(", TestCodes: ");
        sb.append(Arrays.toString(this.d));
        sb.append(", MendelPackages: ");
        sb.append(Arrays.toString(this.e));
        sb.append(", LogEvent: ");
        sb.append(this.b);
        sb.append(", ExtensionProducer: ");
        sb.append((Object) null);
        sb.append(", VeProducer: ");
        sb.append((Object) null);
        sb.append(", ExperimentIDs: ");
        sb.append(Arrays.toString(this.f));
        sb.append(", ExperimentTokens: ");
        sb.append(Arrays.toString(this.g));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.h));
        sb.append(", AddPhenotypeExperimentTokens: ");
        sb.append(this.i);
        sb.append("GenericDimensions: ");
        sb.append(Arrays.toString(this.j));
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = buj.a(parcel);
        buj.a(parcel, 2, this.c, i2);
        buj.a(parcel, 3, this.a);
        buj.a(parcel, 4, this.d);
        buj.a(parcel, 5, this.e);
        buj.a(parcel, 6, this.f);
        buj.a(parcel, 7, this.g);
        buj.a(parcel, 8, this.i);
        buj.a(parcel, 9, this.h, i2);
        buj.a(parcel, 10, this.j, i2);
        buj.b(parcel, a2);
    }
}
