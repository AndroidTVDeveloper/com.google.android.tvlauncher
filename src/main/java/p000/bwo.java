package p000;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: bwo */
/* compiled from: PG */
public final class bwo extends aio implements bwp {
    public bwo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    /* renamed from: a */
    public final void mo2498a(int i) {
        Parcel a = mo321a();
        a.writeInt(i);
        mo324b(7, a);
    }

    /* renamed from: a */
    public final void mo2499a(btp btp, int i, boolean z) {
        Parcel a = mo321a();
        aiq.m586a(a, btp);
        a.writeInt(i);
        aiq.m588a(a, z);
        mo324b(9, a);
    }

    /* renamed from: a */
    public final void mo2500a(bwr bwr, bwn bwn) {
        Parcel a = mo321a();
        aiq.m587a(a, bwr);
        aiq.m586a(a, bwn);
        mo324b(12, a);
    }
}
