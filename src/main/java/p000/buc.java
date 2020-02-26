package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: buc */
/* compiled from: PG */
public final class buc extends buf {
    public static final Parcelable.Creator CREATOR = new bud();

    /* renamed from: a */
    public final bno f4840a;

    /* renamed from: b */
    public final boolean f4841b;

    /* renamed from: c */
    public final boolean f4842c;

    /* renamed from: d */
    private final int f4843d;

    /* renamed from: e */
    private final IBinder f4844e;

    public buc(int i, IBinder iBinder, bno bno, boolean z, boolean z2) {
        this.f4843d = i;
        this.f4844e = iBinder;
        this.f4840a = bno;
        this.f4841b = z;
        this.f4842c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof buc) {
            buc buc = (buc) obj;
            return this.f4840a.equals(buc.f4840a) && mo2445a().equals(buc.mo2445a());
        }
    }

    /* renamed from: a */
    public final btp mo2445a() {
        IBinder iBinder = this.f4844e;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        if (!(queryLocalInterface instanceof btp)) {
            return new bto(iBinder);
        }
        return (btp) queryLocalInterface;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = buj.m4230a(parcel);
        buj.m4251b(parcel, 1, this.f4843d);
        buj.m4237a(parcel, 2, this.f4844e);
        buj.m4238a(parcel, 3, this.f4840a, i);
        buj.m4241a(parcel, 4, this.f4841b);
        buj.m4241a(parcel, 5, this.f4842c);
        buj.m4250b(parcel, a);
    }
}
