package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: bwo  reason: default package */
/* compiled from: PG */
public final class bwo extends aio implements bwp {
    public bwo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void a(int i) {
        Parcel a = a();
        a.writeInt(i);
        b(7, a);
    }

    public final void a(btp btp, int i, boolean z) {
        Parcel a = a();
        aiq.a(a, btp);
        a.writeInt(i);
        aiq.a(a, z);
        b(9, a);
    }

    public final void a(bwr bwr, bwn bwn) {
        Parcel a = a();
        aiq.a(a, bwr);
        aiq.a(a, bwn);
        b(12, a);
    }
}
