package p000;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: bto */
/* compiled from: PG */
public final class bto extends aio implements btp {
    public bto(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    /* renamed from: b */
    public final Account mo2437b() {
        Parcel a = mo322a(2, mo321a());
        Account account = (Account) aiq.m585a(a, Account.CREATOR);
        a.recycle();
        return account;
    }
}
