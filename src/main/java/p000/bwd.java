package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: bwd */
/* compiled from: PG */
public final class bwd extends bte {
    public bwd(Context context, Looper looper, bsv bsv, boq boq, bor bor) {
        super(context, looper, 51, bsv, boq, bor);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo2181a() {
        return "com.google.android.gms.phenotype.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo2182b() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    /* renamed from: c */
    public final int mo2183c() {
        return 9410000;
    }

    /* renamed from: t */
    public final bnr[] mo2403t() {
        return bvq.f4916a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo2180a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        if (!(queryLocalInterface instanceof bwc)) {
            return new bwb(iBinder);
        }
        return (bwc) queryLocalInterface;
    }
}
