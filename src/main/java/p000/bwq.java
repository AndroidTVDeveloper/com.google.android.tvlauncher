package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.json.JSONException;

/* renamed from: bwq */
/* compiled from: PG */
public final class bwq extends bte implements bwi {

    /* renamed from: r */
    private final boolean f4953r;

    /* renamed from: s */
    private final bsv f4954s;

    /* renamed from: t */
    private final Bundle f4955t;

    /* renamed from: u */
    private final Integer f4956u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bwq(Context context, Looper looper, bsv bsv, boq boq, bor bor) {
        super(context, looper, 44, bsv, boq, bor);
        bsv bsv2 = bsv;
        bwj bwj = bsv2.f4774f;
        Integer num = bsv2.f4775g;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        if (bwj != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
            bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        }
        this.f4953r = true;
        this.f4954s = bsv2;
        this.f4955t = bundle;
        this.f4956u = bsv2.f4775g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo2181a() {
        return "com.google.android.gms.signin.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo2182b() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* renamed from: c */
    public final int mo2183c() {
        return 12451000;
    }

    /* renamed from: g */
    public final boolean mo2394g() {
        return this.f4953r;
    }

    /* renamed from: m */
    public final void mo2491m() {
        try {
            ((bwp) mo2400p()).mo2498a(this.f4956u.intValue());
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    /* renamed from: n */
    public final void mo2492n() {
        mo2386a(new bsp(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo2180a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (!(queryLocalInterface instanceof bwp)) {
            return new bwo(iBinder);
        }
        return (bwp) queryLocalInterface;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final Bundle mo2399o() {
        if (!this.f4742c.getPackageName().equals(this.f4954s.f4772d)) {
            this.f4955t.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f4954s.f4772d);
        }
        return this.f4955t;
    }

    /* renamed from: a */
    public final void mo2489a(btp btp, boolean z) {
        try {
            ((bwp) mo2400p()).mo2499a(btp, this.f4956u.intValue(), z);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    /* renamed from: a */
    public final void mo2490a(bwn bwn) {
        buh.m4200a(bwn, "Expecting a valid ISignInCallbacks");
        try {
            Account account = new Account("<<default account>>", "com.google");
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(account.name)) {
                bmt a = bmt.m3775a(this.f4742c);
                String a2 = a.mo2160a("defaultGoogleSignInAccount");
                if (!TextUtils.isEmpty(a2)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 20);
                    sb.append("googleSignInAccount");
                    sb.append(":");
                    sb.append(a2);
                    String a3 = a.mo2160a(sb.toString());
                    if (a3 != null) {
                        try {
                            googleSignInAccount = GoogleSignInAccount.m5221a(a3);
                        } catch (JSONException e) {
                        }
                    }
                }
            }
            ((bwp) mo2400p()).mo2500a(new bwr(new bua(account, this.f4956u.intValue(), googleSignInAccount)), bwn);
        } catch (RemoteException e2) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                bwn.mo2316a(new bwt());
            } catch (RemoteException e3) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e2);
            }
        }
    }
}
