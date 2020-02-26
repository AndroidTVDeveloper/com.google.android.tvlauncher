package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: bya  reason: default package */
/* compiled from: PG */
public final class bya extends aio implements byb {
    public bya(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.usagereporting.internal.IUsageReportingService");
    }

    public final void a(bxx bxx) {
        Parcel a = a();
        aiq.a(a, bxx);
        b(2, a);
    }

    public final void a(bxz bxz, bxx bxx) {
        Parcel a = a();
        aiq.a(a, bxz);
        aiq.a(a, bxx);
        b(5, a);
    }
}
