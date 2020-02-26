package p000;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: bya */
/* compiled from: PG */
public final class bya extends aio implements byb {
    public bya(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.usagereporting.internal.IUsageReportingService");
    }

    /* renamed from: a */
    public final void mo2537a(bxx bxx) {
        Parcel a = mo321a();
        aiq.m586a(a, bxx);
        mo324b(2, a);
    }

    /* renamed from: a */
    public final void mo2538a(bxz bxz, bxx bxx) {
        Parcel a = mo321a();
        aiq.m586a(a, bxz);
        aiq.m586a(a, bxx);
        mo324b(5, a);
    }
}
