package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: bnc */
/* compiled from: PG */
public final class bnc extends buf {
    public static final Parcelable.Creator CREATOR = new bnd();

    /* renamed from: a */
    public byte[] f4451a;

    /* renamed from: b */
    public dng f4452b;

    /* renamed from: c */
    private final bnl f4453c;

    /* renamed from: d */
    private final int[] f4454d;

    /* renamed from: e */
    private final String[] f4455e;

    /* renamed from: f */
    private final int[] f4456f;

    /* renamed from: g */
    private final byte[][] f4457g;

    /* renamed from: h */
    private final bvo[] f4458h;

    /* renamed from: i */
    private final boolean f4459i;

    /* renamed from: j */
    private final bvr[] f4460j;

    public bnc(bnl bnl, dng dng) {
        this.f4453c = bnl;
        this.f4452b = dng;
        this.f4454d = null;
        this.f4455e = null;
        this.f4456f = null;
        this.f4457g = null;
        this.f4458h = null;
        this.f4459i = true;
        this.f4460j = null;
    }

    public bnc(bnl bnl, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, bvo[] bvoArr, bvr[] bvrArr) {
        this.f4453c = bnl;
        this.f4451a = bArr;
        this.f4454d = iArr;
        this.f4455e = strArr;
        this.f4452b = null;
        this.f4456f = iArr2;
        this.f4457g = bArr2;
        this.f4458h = bvoArr;
        this.f4459i = z;
        this.f4460j = bvrArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bnc) {
            bnc bnc = (bnc) obj;
            return bty.m4184a(this.f4453c, bnc.f4453c) && Arrays.equals(this.f4451a, bnc.f4451a) && Arrays.equals(this.f4454d, bnc.f4454d) && Arrays.equals(this.f4455e, bnc.f4455e) && bty.m4184a(this.f4452b, bnc.f4452b) && bty.m4184a(null, null) && bty.m4184a(null, null) && Arrays.equals(this.f4456f, bnc.f4456f) && Arrays.deepEquals(this.f4457g, bnc.f4457g) && Arrays.equals(this.f4458h, bnc.f4458h) && this.f4459i == bnc.f4459i && Arrays.equals(this.f4460j, bnc.f4460j);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4453c, this.f4451a, this.f4454d, this.f4455e, this.f4452b, null, null, this.f4456f, this.f4457g, this.f4458h, Boolean.valueOf(this.f4459i), this.f4460j});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.f4453c);
        sb.append(", LogEventBytes: ");
        byte[] bArr = this.f4451a;
        sb.append(bArr != null ? new String(bArr) : null);
        sb.append(", TestCodes: ");
        sb.append(Arrays.toString(this.f4454d));
        sb.append(", MendelPackages: ");
        sb.append(Arrays.toString(this.f4455e));
        sb.append(", LogEvent: ");
        sb.append(this.f4452b);
        sb.append(", ExtensionProducer: ");
        sb.append((Object) null);
        sb.append(", VeProducer: ");
        sb.append((Object) null);
        sb.append(", ExperimentIDs: ");
        sb.append(Arrays.toString(this.f4456f));
        sb.append(", ExperimentTokens: ");
        sb.append(Arrays.toString(this.f4457g));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.f4458h));
        sb.append(", AddPhenotypeExperimentTokens: ");
        sb.append(this.f4459i);
        sb.append("GenericDimensions: ");
        sb.append(Arrays.toString(this.f4460j));
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = buj.m4230a(parcel);
        buj.m4238a(parcel, 2, this.f4453c, i);
        buj.m4242a(parcel, 3, this.f4451a);
        buj.m4243a(parcel, 4, this.f4454d);
        buj.m4245a(parcel, 5, this.f4455e);
        buj.m4243a(parcel, 6, this.f4456f);
        buj.m4246a(parcel, 7, this.f4457g);
        buj.m4241a(parcel, 8, this.f4459i);
        buj.m4244a(parcel, 9, this.f4458h, i);
        buj.m4244a(parcel, 10, this.f4460j, i);
        buj.m4250b(parcel, a);
    }
}
