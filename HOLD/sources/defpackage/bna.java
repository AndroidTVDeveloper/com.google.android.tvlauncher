package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: bna  reason: default package */
/* compiled from: PG */
public final class bna extends buf {
    public static final Parcelable.Creator CREATOR = new bnb();
    private final boolean a;
    private final long b;
    private final long c;

    public bna(boolean z, long j, long j2) {
        this.a = z;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bna) {
            bna bna = (bna) obj;
            return this.a == bna.a && this.b == bna.b && this.c == bna.c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c)});
    }

    public final String toString() {
        return "CollectForDebugParcelable[" + "skipPersistentStorage: " + this.a + ",collectForDebugStartTimeMillis: " + this.b + ",collectForDebugExpiryTimeMillis: " + this.c + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = buj.a(parcel);
        buj.a(parcel, 1, this.a);
        buj.a(parcel, 2, this.c);
        buj.a(parcel, 3, this.b);
        buj.b(parcel, a2);
    }
}
