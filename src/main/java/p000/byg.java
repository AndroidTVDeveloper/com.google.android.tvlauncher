package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: byg */
/* compiled from: PG */
public final class byg extends bte {

    /* renamed from: r */
    private final AtomicReference f5003r = new AtomicReference();

    public byg(Context context, Looper looper, bsv bsv, boq boq, bor bor) {
        super(context, looper, 41, bsv, boq, bor);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo2181a() {
        return "com.google.android.gms.usagereporting.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo2182b() {
        return "com.google.android.gms.usagereporting.internal.IUsageReportingService";
    }

    /* renamed from: c */
    public final int mo2183c() {
        return 12600000;
    }

    /* renamed from: t */
    public final bnr[] mo2403t() {
        return bxm.f4987a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo2180a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingService");
        if (!(queryLocalInterface instanceof byb)) {
            return new bya(iBinder);
        }
        return (byb) queryLocalInterface;
    }

    /* renamed from: d */
    public final void mo2391d() {
        try {
            bxy bxy = (bxy) this.f5003r.getAndSet(null);
            if (bxy != null) {
                ((byb) mo2400p()).mo2538a(bxy, new bye((byte) 0));
            }
        } catch (RemoteException e) {
            Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener from remote:", e);
        }
        super.mo2391d();
    }
}
