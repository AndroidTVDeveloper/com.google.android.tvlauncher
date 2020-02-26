package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: bua  reason: default package */
/* compiled from: PG */
public final class bua extends buf {
    public static final Parcelable.Creator CREATOR = new bub();
    private final int a;
    private final Account b;
    private final int c;
    private final GoogleSignInAccount d;

    public bua(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.a = i;
        this.b = account;
        this.c = i2;
        this.d = googleSignInAccount;
    }

    public bua(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = buj.a(parcel);
        buj.b(parcel, 1, this.a);
        buj.a(parcel, 2, this.b, i);
        buj.b(parcel, 3, this.c);
        buj.a(parcel, 4, this.d, i);
        buj.b(parcel, a2);
    }
}
