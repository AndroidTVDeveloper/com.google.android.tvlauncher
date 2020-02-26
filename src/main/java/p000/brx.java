package p000;

import android.util.Log;
import java.util.Set;

/* renamed from: brx */
/* compiled from: PG */
final class brx implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ bwt f4710a;

    /* renamed from: b */
    private final /* synthetic */ brz f4711b;

    public brx(brz brz, bwt bwt) {
        this.f4711b = brz;
        this.f4710a = bwt;
    }

    public final void run() {
        brz brz = this.f4711b;
        bwt bwt = this.f4710a;
        bno bno = bwt.f4959a;
        if (bno.mo2195b()) {
            buc buc = bwt.f4960b;
            bno bno2 = buc.f4840a;
            if (!bno2.mo2195b()) {
                String valueOf = String.valueOf(bno2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
                brz.f4718f.mo2354b(bno2);
                brz.f4717e.mo2228d();
                return;
            }
            bry bry = brz.f4718f;
            btp a = buc.mo2445a();
            Set set = brz.f4715c;
            if (a == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                ((brh) bry).mo2354b(new bno(4));
            } else {
                brh brh = (brh) bry;
                brh.f4681c = a;
                brh.f4682d = set;
                brh.mo2353a();
            }
        } else {
            brz.f4718f.mo2354b(bno);
        }
        brz.f4717e.mo2228d();
    }
}
