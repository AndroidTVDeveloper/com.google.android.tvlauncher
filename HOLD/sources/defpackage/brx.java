package defpackage;

import android.util.Log;
import java.util.Set;

/* renamed from: brx  reason: default package */
/* compiled from: PG */
final class brx implements Runnable {
    private final /* synthetic */ bwt a;
    private final /* synthetic */ brz b;

    public brx(brz brz, bwt bwt) {
        this.b = brz;
        this.a = bwt;
    }

    public final void run() {
        brz brz = this.b;
        bwt bwt = this.a;
        bno bno = bwt.a;
        if (bno.b()) {
            buc buc = bwt.b;
            bno bno2 = buc.a;
            if (!bno2.b()) {
                String valueOf = String.valueOf(bno2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
                brz.f.b(bno2);
                brz.e.d();
                return;
            }
            bry bry = brz.f;
            btp a2 = buc.a();
            Set set = brz.c;
            if (a2 == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                ((brh) bry).b(new bno(4));
            } else {
                brh brh = (brh) bry;
                brh.c = a2;
                brh.d = set;
                brh.a();
            }
        } else {
            brz.f.b(bno);
        }
        brz.e.d();
    }
}
