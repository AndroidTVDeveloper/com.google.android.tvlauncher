package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: bvf  reason: default package */
/* compiled from: PG */
public final class bvf extends bte {
    public final Context r;

    public bvf(Context context, Looper looper, boq boq, bor bor, bsv bsv) {
        super(context, looper, 29, bsv, boq, bor);
        this.r = context;
        byl.a(context);
    }

    /* access modifiers changed from: protected */
    public final String a() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    public final int c() {
        return 11925000;
    }

    public final bnr[] t() {
        return bus.b;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.feedback.internal.IFeedbackService");
        if (!(queryLocalInterface instanceof bvh)) {
            return new bvg(iBinder);
        }
        return (bvh) queryLocalInterface;
    }
}
