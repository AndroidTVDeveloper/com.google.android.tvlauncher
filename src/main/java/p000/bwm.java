package p000;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: bwm */
/* compiled from: PG */
public class bwm extends aip implements bwn {
    public bwm() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* renamed from: a */
    public void mo2316a(bwt bwt) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo326a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 3) {
            bno bno = (bno) aiq.m585a(parcel, bno.CREATOR);
            bwk bwk = (bwk) aiq.m585a(parcel, bwk.CREATOR);
        } else if (i == 4) {
            Status status = (Status) aiq.m585a(parcel, Status.CREATOR);
        } else if (i == 6) {
            Status status2 = (Status) aiq.m585a(parcel, Status.CREATOR);
        } else if (i == 7) {
            Status status3 = (Status) aiq.m585a(parcel, Status.CREATOR);
            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) aiq.m585a(parcel, GoogleSignInAccount.CREATOR);
        } else if (i != 8) {
            return false;
        } else {
            mo2316a((bwt) aiq.m585a(parcel, bwt.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
