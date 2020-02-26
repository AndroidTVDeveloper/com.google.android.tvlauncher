package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: bvf */
/* compiled from: PG */
public final class bvf extends bte {

    /* renamed from: r */
    public final Context f4901r;

    public bvf(Context context, Looper looper, boq boq, bor bor, bsv bsv) {
        super(context, looper, 29, bsv, boq, bor);
        this.f4901r = context;
        byl.m4378a(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo2181a() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo2182b() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    /* renamed from: c */
    public final int mo2183c() {
        return 11925000;
    }

    /* renamed from: t */
    public final bnr[] mo2403t() {
        return bus.f4859b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo2180a(IBinder iBinder) {
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
