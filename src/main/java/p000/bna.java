package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: bna */
/* compiled from: PG */
public final class bna extends buf {
    public static final Parcelable.Creator CREATOR = new bnb();

    /* renamed from: a */
    private final boolean f4448a;

    /* renamed from: b */
    private final long f4449b;

    /* renamed from: c */
    private final long f4450c;

    public bna(boolean z, long j, long j2) {
        this.f4448a = z;
        this.f4449b = j;
        this.f4450c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bna) {
            bna bna = (bna) obj;
            return this.f4448a == bna.f4448a && this.f4449b == bna.f4449b && this.f4450c == bna.f4450c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f4448a), Long.valueOf(this.f4449b), Long.valueOf(this.f4450c)});
    }

    public final String toString() {
        return "CollectForDebugParcelable[" + "skipPersistentStorage: " + this.f4448a + ",collectForDebugStartTimeMillis: " + this.f4449b + ",collectForDebugExpiryTimeMillis: " + this.f4450c + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = buj.m4230a(parcel);
        buj.m4241a(parcel, 1, this.f4448a);
        buj.m4235a(parcel, 2, this.f4450c);
        buj.m4235a(parcel, 3, this.f4449b);
        buj.m4250b(parcel, a);
    }
}
