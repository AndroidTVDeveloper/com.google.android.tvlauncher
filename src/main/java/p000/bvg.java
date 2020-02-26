package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.feedback.ErrorReport;

/* renamed from: bvg */
/* compiled from: PG */
public final class bvg extends aio implements bvh {
    public bvg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.feedback.internal.IFeedbackService");
    }

    /* renamed from: a */
    public final void mo2470a(bux bux) {
        Parcel a = mo321a();
        aiq.m587a(a, bux);
        Parcel a2 = mo322a(7, a);
        aiq.m589a(a2);
        a2.recycle();
    }

    /* renamed from: a */
    public final void mo2471a(ErrorReport errorReport) {
        Parcel a = mo321a();
        aiq.m587a(a, errorReport);
        Parcel a2 = mo322a(3, a);
        aiq.m589a(a2);
        a2.recycle();
    }
}
