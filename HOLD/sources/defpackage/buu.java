package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.ErrorReport;

/* renamed from: buu  reason: default package */
/* compiled from: PG */
final class buu extends bpn {
    private final /* synthetic */ bux h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public buu(bos bos, bux bux) {
        super(buv.a, bos);
        this.h = bux;
    }

    public final /* bridge */ /* synthetic */ box a(Status status) {
        return status == null ? Status.c : status;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(boi boi) {
        bvf bvf = (bvf) boi;
        bux bux = this.h;
        if (((Boolean) bvi.c.a()).booleanValue() && bux != null) {
            Parcel obtain = Parcel.obtain();
            buy.a(bux, obtain, 0);
            int dataSize = obtain.dataSize();
            obtain.recycle();
            if (dataSize > ((Integer) bvi.b.a()).intValue()) {
                String valueOf = String.valueOf(bvi.b.a());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 104);
                sb.append("Max allowed feedback options size of ");
                sb.append(valueOf);
                sb.append(" exceeded, you are passing in feedback options of ");
                sb.append(dataSize);
                sb.append(" size.");
                throw new IllegalStateException(sb.toString());
            }
        }
        ((bvh) bvf.p()).a(new ErrorReport(bux, bvf.r.getCacheDir()));
        a((box) Status.a);
    }
}
