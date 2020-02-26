package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.ErrorReport;

/* renamed from: buu */
/* compiled from: PG */
final class buu extends bpn {

    /* renamed from: h */
    private final /* synthetic */ bux f4861h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public buu(bos bos, bux bux) {
        super(buv.f4862a, bos);
        this.f4861h = bux;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ box mo2178a(Status status) {
        return status == null ? Status.f6262c : status;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2179a(boi boi) {
        bvf bvf = (bvf) boi;
        bux bux = this.f4861h;
        if (((Boolean) bvi.f4904c.mo2541a()).booleanValue() && bux != null) {
            Parcel obtain = Parcel.obtain();
            buy.m4269a(bux, obtain, 0);
            int dataSize = obtain.dataSize();
            obtain.recycle();
            if (dataSize > ((Integer) bvi.f4903b.mo2541a()).intValue()) {
                String valueOf = String.valueOf(bvi.f4903b.mo2541a());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 104);
                sb.append("Max allowed feedback options size of ");
                sb.append(valueOf);
                sb.append(" exceeded, you are passing in feedback options of ");
                sb.append(dataSize);
                sb.append(" size.");
                throw new IllegalStateException(sb.toString());
            }
        }
        ((bvh) bvf.mo2400p()).mo2471a(new ErrorReport(bux, bvf.f4901r.getCacheDir()));
        mo3195a((box) Status.f6260a);
    }
}
