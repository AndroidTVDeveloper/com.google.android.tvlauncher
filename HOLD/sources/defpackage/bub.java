package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: bub  reason: default package */
/* compiled from: PG */
public final class bub implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buh.b(parcel);
        Account account = null;
        int i = 0;
        GoogleSignInAccount googleSignInAccount = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = buh.a(readInt);
            if (a == 1) {
                i = buh.d(parcel, readInt);
            } else if (a == 2) {
                account = (Account) buh.a(parcel, readInt, Account.CREATOR);
            } else if (a == 3) {
                i2 = buh.d(parcel, readInt);
            } else if (a != 4) {
                buh.b(parcel, readInt);
            } else {
                googleSignInAccount = (GoogleSignInAccount) buh.a(parcel, readInt, GoogleSignInAccount.CREATOR);
            }
        }
        buh.n(parcel, b);
        return new bua(i, account, i2, googleSignInAccount);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new bua[i];
    }
}
