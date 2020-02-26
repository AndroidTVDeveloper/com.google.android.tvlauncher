package defpackage;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: bto  reason: default package */
/* compiled from: PG */
public final class bto extends aio implements btp {
    public bto(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    public final Account b() {
        Parcel a = a(2, a());
        Account account = (Account) aiq.a(a, Account.CREATOR);
        a.recycle();
        return account;
    }
}
