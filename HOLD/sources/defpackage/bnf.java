package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: bnf  reason: default package */
/* compiled from: PG */
public final class bnf extends bte {
    public bnf(Context context, Looper looper, bsv bsv, boq boq, bor bor) {
        super(context, looper, 40, bsv, boq, bor);
    }

    /* access modifiers changed from: protected */
    public final String a() {
        return "com.google.android.gms.clearcut.service.START";
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    public final int c() {
        return 11925000;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
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
