package p000;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

/* renamed from: bta */
/* compiled from: PG */
public final class bta extends buf {
    public static final Parcelable.Creator CREATOR = new btb();

    /* renamed from: a */
    public final int f4782a;

    /* renamed from: b */
    public final int f4783b;

    /* renamed from: c */
    public final int f4784c;

    /* renamed from: d */
    public String f4785d;

    /* renamed from: e */
    public IBinder f4786e;

    /* renamed from: f */
    public Scope[] f4787f;

    /* renamed from: g */
    public Bundle f4788g;

    /* renamed from: h */
    public Account f4789h;

    /* renamed from: i */
    public bnr[] f4790i;

    /* renamed from: j */
    public bnr[] f4791j;

    /* renamed from: k */
    public final boolean f4792k;

    /* renamed from: l */
    public int f4793l;

    public bta(int i) {
        this.f4782a = 4;
        this.f4784c = bnv.f4495b;
        this.f4783b = i;
        this.f4792k = true;
    }

    public bta(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, bnr[] bnrArr, bnr[] bnrArr2, boolean z, int i4) {
        btp btp;
        this.f4782a = i;
        this.f4783b = i2;
        this.f4784c = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f4785d = "com.google.android.gms";
        } else {
            this.f4785d = str;
        }
        if (i >= 2) {
            this.f4786e = iBinder;
            this.f4789h = account;
        } else {
            Account account2 = null;
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof btp) {
                    btp = (btp) queryLocalInterface;
                } else {
                    btp = new bto(iBinder);
                }
                if (btp != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        account2 = btp.mo2437b();
                    } catch (RemoteException e) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th;
                    }
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
            this.f4789h = account2;
        }
        this.f4787f = scopeArr;
        this.f4788g = bundle;
        this.f4790i = bnrArr;
        this.f4791j = bnrArr2;
        this.f4792k = z;
        this.f4793l = i4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        btb.m4152a(this, parcel, i);
    }
}
