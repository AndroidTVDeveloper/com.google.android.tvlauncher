package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: bnr  reason: default package */
/* compiled from: PG */
public final class bnr extends buf {
    public static final Parcelable.Creator CREATOR = new bns();
    public final String a;
    @Deprecated
    private final int b;
    private final long c;

    public final long a() {
        long j = this.c;
        return j == -1 ? (long) this.b : j;
    }

    public bnr(String str, int i, long j) {
        this.a = str;
        this.b = i;
        this.c = j;
    }

    public bnr(String str) {
        this.a = str;
        this.c = 1;
        this.b = -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bnr) {
            bnr bnr = (bnr) obj;
            String str = this.a;
            if (((str == null || !str.equals(bnr.a)) && (this.a != null || bnr.a != null)) || a() != bnr.a()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(a())});
    }

    public final String toString() {
        btx a2 = bty.a(this);
        a2.a("name", this.a);
        a2.a("version", Long.valueOf(a()));
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = buj.a(parcel);
        buj.a(parcel, 1, this.a);
        buj.b(parcel, 2, this.b);
        buj.a(parcel, 3, a());
        buj.b(parcel, a2);
    }
}
