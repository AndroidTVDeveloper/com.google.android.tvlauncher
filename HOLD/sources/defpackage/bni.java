package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: bni  reason: default package */
/* compiled from: PG */
public final class bni extends aio implements bnj {
    public bni(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    }

    public final void a(bnh bnh, bnc bnc) {
        Parcel a = a();
        aiq.a(a, bnh);
        aiq.a(a, bnc);
        c(1, a);
    }
}
