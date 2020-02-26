package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: bwd  reason: default package */
/* compiled from: PG */
public final class bwd extends bte {
    public bwd(Context context, Looper looper, bsv bsv, boq boq, bor bor) {
        super(context, looper, 51, bsv, boq, bor);
    }

    /* access modifiers changed from: protected */
    public final String a() {
        return "com.google.android.gms.phenotype.service.START";
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    public final int c() {
        return 9410000;
    }

    public final bnr[] t() {
        return bvq.a;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
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
