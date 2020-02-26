package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: bnf */
/* compiled from: PG */
public final class bnf extends bte {
    public bnf(Context context, Looper looper, bsv bsv, boq boq, bor bor) {
        super(context, looper, 40, bsv, boq, bor);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo2181a() {
        return "com.google.android.gms.clearcut.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo2182b() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    /* renamed from: c */
    public final int mo2183c() {
        return 11925000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo2180a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        if (!(queryLocalInterface instanceof bnj)) {
            return new bni(iBinder);
        }
        return (bnj) queryLocalInterface;
    }
}
