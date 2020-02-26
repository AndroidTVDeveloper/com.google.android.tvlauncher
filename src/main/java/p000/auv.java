package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: auv */
/* compiled from: PG */
public final class auv extends avc {
    public static final Parcelable.Creator CREATOR = new auu();

    /* renamed from: a */
    private final String f2468a;

    /* renamed from: b */
    private final boolean f2469b;

    /* renamed from: d */
    private final boolean f2470d;

    /* renamed from: e */
    private final String[] f2471e;

    /* renamed from: f */
    private final avc[] f2472f;

    public auv(Parcel parcel) {
        super("CTOC");
        this.f2468a = (String) blm.m3636a((Object) parcel.readString());
        boolean z = true;
        this.f2469b = parcel.readByte() != 0;
        this.f2470d = parcel.readByte() == 0 ? false : z;
        this.f2471e = (String[]) blm.m3636a((Object) parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f2472f = new avc[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f2472f[i] = (avc) parcel.readParcelable(avc.class.getClassLoader());
        }
    }

    public auv(String str, boolean z, boolean z2, String[] strArr, avc[] avcArr) {
        super("CTOC");
        this.f2468a = str;
        this.f2469b = z;
        this.f2470d = z2;
        this.f2471e = strArr;
        this.f2472f = avcArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        auv auv = (auv) obj;
        return this.f2469b == auv.f2469b && this.f2470d == auv.f2470d && blm.m3652a(this.f2468a, auv.f2468a) && Arrays.equals(this.f2471e, auv.f2471e) && Arrays.equals(this.f2472f, auv.f2472f);
    }

    public final int hashCode() {
        int i = ((((this.f2469b ? 1 : 0) + true) * 31) + (this.f2470d ? 1 : 0)) * 31;
        String str = this.f2468a;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2468a);
        parcel.writeByte(this.f2469b ? (byte) 1 : 0);
        parcel.writeByte(this.f2470d ? (byte) 1 : 0);
        parcel.writeStringArray(this.f2471e);
        parcel.writeInt(this.f2472f.length);
        for (avc writeParcelable : this.f2472f) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
