package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: bua */
/* compiled from: PG */
public final class bua extends buf {
    public static final Parcelable.Creator CREATOR = new bub();

    /* renamed from: a */
    private final int f4836a;

    /* renamed from: b */
    private final Account f4837b;

    /* renamed from: c */
    private final int f4838c;

    /* renamed from: d */
    private final GoogleSignInAccount f4839d;

    public bua(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f4836a = i;
        this.f4837b = account;
        this.f4838c = i2;
        this.f4839d = googleSignInAccount;
    }

    public bua(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = buj.m4230a(parcel);
        buj.m4251b(parcel, 1, this.f4836a);
        buj.m4238a(parcel, 2, this.f4837b, i);
        buj.m4251b(parcel, 3, this.f4838c);
        buj.m4238a(parcel, 4, this.f4839d, i);
        buj.m4250b(parcel, a);
    }
}
