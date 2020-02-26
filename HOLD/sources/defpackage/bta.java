package defpackage;

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

/* renamed from: bta  reason: default package */
/* compiled from: PG */
public final class bta extends buf {
    public static final Parcelable.Creator CREATOR = new btb();
    public final int a;
    public final int b;
    public final int c;
    public String d;
    public IBinder e;
    public Scope[] f;
    public Bundle g;
    public Account h;
    public bnr[] i;
    public bnr[] j;
    public final boolean k;
    public int l;

    public bta(int i2) {
        this.a = 4;
        this.c = bnv.b;
        this.b = i2;
        this.k = true;
    }

    public bta(int i2, int i3, int i4, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, bnr[] bnrArr, bnr[] bnrArr2, boolean z, int i5) {
        btp btp;
        this.a = i2;
        this.b = i3;
        this.c = i4;
        if ("com.google.android.gms".equals(str)) {
            this.d = "com.google.android.gms";
        } else {
            this.d = str;
        }
        if (i2 >= 2) {
            this.e = iBinder;
            this.h = account;
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
                        account2 = btp.b();
                    } catch (RemoteException e2) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th;
                    }
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
            this.h = account2;
        }
        this.f = scopeArr;
        this.g = bundle;
        this.i = bnrArr;
        this.j = bnrArr2;
        this.k = z;
        this.l = i5;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        btb.a(this, parcel, i2);
    }
}
