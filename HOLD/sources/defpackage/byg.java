package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: byg  reason: default package */
/* compiled from: PG */
public final class byg extends bte {
    private final AtomicReference r = new AtomicReference();

    public byg(Context context, Looper looper, bsv bsv, boq boq, bor bor) {
        super(context, looper, 41, bsv, boq, bor);
    }

    /* access modifiers changed from: protected */
    public final String a() {
        return "com.google.android.gms.usagereporting.service.START";
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.usagereporting.internal.IUsageReportingService";
    }

    public final int c() {
        return 12600000;
    }

    public final bnr[] t() {
        return bxm.a;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingService");
        if (!(queryLocalInterface instanceof byb)) {
            return new bya(iBinder);
        }
        return (byb) queryLocalInterface;
    }

    public final void d() {
        try {
            bxy bxy = (bxy) this.r.getAndSet(null);
            if (bxy != null) {
                ((byb) p()).a(bxy, new bye((byte) 0));
            }
        } catch (RemoteException e) {
            Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener from remote:", e);
        }
        super.d();
    }
}
