package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.feedback.ErrorReport;

/* renamed from: bvg  reason: default package */
/* compiled from: PG */
public final class bvg extends aio implements bvh {
    public bvg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.feedback.internal.IFeedbackService");
    }

    public final void a(bux bux) {
        Parcel a = a();
        aiq.a(a, bux);
        Parcel a2 = a(7, a);
        aiq.a(a2);
        a2.recycle();
    }

    public final void a(ErrorReport errorReport) {
        Parcel a = a();
        aiq.a(a, errorReport);
        Parcel a2 = a(3, a);
        aiq.a(a2);
        a2.recycle();
    }
}
