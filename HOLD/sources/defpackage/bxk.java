package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: bxk  reason: default package */
/* compiled from: PG */
public final class bxk extends buf {
    public static final Parcelable.Creator CREATOR = new bxl();
    private final List a;
    private final boolean b;

    static {
        new bxk(null, false);
    }

    public bxk(List list, boolean z) {
        this.a = list == null ? new ArrayList(0) : new ArrayList(list);
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bxk) {
            bxk bxk = (bxk) obj;
            return bty.a(this.a, bxk.a) && bty.a(Boolean.valueOf(this.b), Boolean.valueOf(bxk.b));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = buj.a(parcel);
        buj.b(parcel, 1, new ArrayList(this.a));
        buj.a(parcel, 2, this.b);
        buj.b(parcel, a2);
    }
}
