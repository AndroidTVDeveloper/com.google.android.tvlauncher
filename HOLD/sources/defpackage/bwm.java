package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: bwm  reason: default package */
/* compiled from: PG */
public class bwm extends aip implements bwn {
    public bwm() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    public void a(bwt bwt) {
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 3) {
            bno bno = (bno) aiq.a(parcel, bno.CREATOR);
            bwk bwk = (bwk) aiq.a(parcel, bwk.CREATOR);
        } else if (i == 4) {
            Status status = (Status) aiq.a(parcel, Status.CREATOR);
        } else if (i == 6) {
            Status status2 = (Status) aiq.a(parcel, Status.CREATOR);
        } else if (i == 7) {
            Status status3 = (Status) aiq.a(parcel, Status.CREATOR);
            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) aiq.a(parcel, GoogleSignInAccount.CREATOR);
        } else if (i != 8) {
            return false;
        } else {
            a((bwt) aiq.a(parcel, bwt.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
