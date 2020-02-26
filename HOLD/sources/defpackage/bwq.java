package defpackage;

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

/* renamed from: bwq  reason: default package */
/* compiled from: PG */
public final class bwq extends bte implements bwi {
    private final boolean r;
    private final bsv s;
    private final Bundle t;
    private final Integer u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bwq(Context context, Looper looper, bsv bsv, boq boq, bor bor) {
        super(context, looper, 44, bsv, boq, bor);
        bsv bsv2 = bsv;
        bwj bwj = bsv2.f;
        Integer num = bsv2.g;
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
        this.r = true;
        this.s = bsv2;
        this.t = bundle;
        this.u = bsv2.g;
    }

    /* access modifiers changed from: protected */
    public final String a() {
        return "com.google.android.gms.signin.service.START";
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public final int c() {
        return 12451000;
    }

    public final boolean g() {
        return this.r;
    }

    public final void m() {
        try {
            ((bwp) p()).a(this.u.intValue());
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    public final void n() {
        a(new bsp(this));
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
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
    public final Bundle o() {
        if (!this.c.getPackageName().equals(this.s.d)) {
            this.t.putString("com.google.android.gms.signin.internal.realClientPackageName", this.s.d);
        }
        return this.t;
    }

    public final void a(btp btp, boolean z) {
        try {
            ((bwp) p()).a(btp, this.u.intValue(), z);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    public final void a(bwn bwn) {
        buh.a(bwn, "Expecting a valid ISignInCallbacks");
        try {
            Account account = new Account("<<default account>>", "com.google");
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(account.name)) {
                bmt a = bmt.a(this.c);
                String a2 = a.a("defaultGoogleSignInAccount");
                if (!TextUtils.isEmpty(a2)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 20);
                    sb.append("googleSignInAccount");
                    sb.append(":");
                    sb.append(a2);
                    String a3 = a.a(sb.toString());
                    if (a3 != null) {
                        try {
                            googleSignInAccount = GoogleSignInAccount.a(a3);
                        } catch (JSONException e) {
                        }
                    }
                }
            }
            ((bwp) p()).a(new bwr(new bua(account, this.u.intValue(), googleSignInAccount)), bwn);
        } catch (RemoteException e2) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                bwn.a(new bwt());
            } catch (RemoteException e3) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e2);
            }
        }
    }
}
