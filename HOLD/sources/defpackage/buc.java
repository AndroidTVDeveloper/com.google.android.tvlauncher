package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: buc  reason: default package */
/* compiled from: PG */
public final class buc extends buf {
    public static final Parcelable.Creator CREATOR = new bud();
    public final bno a;
    public final boolean b;
    public final boolean c;
    private final int d;
    private final IBinder e;

    public buc(int i, IBinder iBinder, bno bno, boolean z, boolean z2) {
        this.d = i;
        this.e = iBinder;
        this.a = bno;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof buc) {
            buc buc = (buc) obj;
            return this.a.equals(buc.a) && a().equals(buc.a());
        }
    }

    public final btp a() {
        IBinder iBinder = this.e;
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
        int a2 = buj.a(parcel);
        buj.b(parcel, 1, this.d);
        buj.a(parcel, 2, this.e);
        buj.a(parcel, 3, this.a, i);
        buj.a(parcel, 4, this.b);
        buj.a(parcel, 5, this.c);
        buj.b(parcel, a2);
    }
}
