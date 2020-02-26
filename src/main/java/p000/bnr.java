package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: bnr */
/* compiled from: PG */
public final class bnr extends buf {
    public static final Parcelable.Creator CREATOR = new bns();

    /* renamed from: a */
    public final String f4488a;
    @Deprecated

    /* renamed from: b */
    private final int f4489b;

    /* renamed from: c */
    private final long f4490c;

    /* renamed from: a */
    public final long mo2204a() {
        long j = this.f4490c;
        return j == -1 ? (long) this.f4489b : j;
    }

    public bnr(String str, int i, long j) {
        this.f4488a = str;
        this.f4489b = i;
        this.f4490c = j;
    }

    public bnr(String str) {
        this.f4488a = str;
        this.f4490c = 1;
        this.f4489b = -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bnr) {
            bnr bnr = (bnr) obj;
            String str = this.f4488a;
            if (((str == null || !str.equals(bnr.f4488a)) && (this.f4488a != null || bnr.f4488a != null)) || mo2204a() != bnr.mo2204a()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4488a, Long.valueOf(mo2204a())});
    }

    public final String toString() {
        btx a = bty.m4182a(this);
        a.mo2440a("name", this.f4488a);
        a.mo2440a("version", Long.valueOf(mo2204a()));
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = buj.m4230a(parcel);
        buj.m4239a(parcel, 1, this.f4488a);
        buj.m4251b(parcel, 2, this.f4489b);
        buj.m4235a(parcel, 3, mo2204a());
        buj.m4250b(parcel, a);
    }
}
