package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: bxk */
/* compiled from: PG */
public final class bxk extends buf {
    public static final Parcelable.Creator CREATOR = new bxl();

    /* renamed from: a */
    private final List f4985a;

    /* renamed from: b */
    private final boolean f4986b;

    static {
        new bxk(null, false);
    }

    public bxk(List list, boolean z) {
        this.f4985a = list == null ? new ArrayList(0) : new ArrayList(list);
        this.f4986b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bxk) {
            bxk bxk = (bxk) obj;
            return bty.m4184a(this.f4985a, bxk.f4985a) && bty.m4184a(Boolean.valueOf(this.f4986b), Boolean.valueOf(bxk.f4986b));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4985a, Boolean.valueOf(this.f4986b)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = buj.m4230a(parcel);
        buj.m4252b(parcel, 1, new ArrayList(this.f4985a));
        buj.m4241a(parcel, 2, this.f4986b);
        buj.m4250b(parcel, a);
    }
}
