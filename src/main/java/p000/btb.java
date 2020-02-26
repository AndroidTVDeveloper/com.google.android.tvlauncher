package p000;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* renamed from: btb */
/* compiled from: PG */
public final class btb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = buh.m4209b(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        bnr[] bnrArr = null;
        bnr[] bnrArr2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (buh.m4195a(readInt)) {
                case 1:
                    i = buh.m4217d(parcel2, readInt);
                    break;
                case 2:
                    i2 = buh.m4217d(parcel2, readInt);
                    break;
                case 3:
                    i3 = buh.m4217d(parcel2, readInt);
                    break;
                case 4:
                    str = buh.m4219f(parcel2, readInt);
                    break;
                case 5:
                    iBinder = buh.m4220g(parcel2, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) buh.m4214b(parcel2, readInt, Scope.CREATOR);
                    break;
                case 7:
                    bundle = buh.m4221h(parcel2, readInt);
                    break;
                case 8:
                    account = (Account) buh.m4198a(parcel2, readInt, Account.CREATOR);
                    break;
                case 9:
                default:
                    buh.m4210b(parcel2, readInt);
                    break;
                case 10:
                    bnrArr = (bnr[]) buh.m4214b(parcel2, readInt, bnr.CREATOR);
                    break;
                case 11:
                    bnrArr2 = (bnr[]) buh.m4214b(parcel2, readInt, bnr.CREATOR);
                    break;
                case 12:
                    z = buh.m4216c(parcel2, readInt);
                    break;
                case 13:
                    i4 = buh.m4217d(parcel2, readInt);
                    break;
            }
        }
        buh.m4227n(parcel2, b);
        return new bta(i, i2, i3, str, iBinder, scopeArr, bundle, account, bnrArr, bnrArr2, z, i4);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new bta[i];
    }

    /* renamed from: a */
    static void m4152a(bta bta, Parcel parcel, int i) {
        int a = buj.m4230a(parcel);
        buj.m4251b(parcel, 1, bta.f4782a);
        buj.m4251b(parcel, 2, bta.f4783b);
        buj.m4251b(parcel, 3, bta.f4784c);
        buj.m4239a(parcel, 4, bta.f4785d);
        buj.m4237a(parcel, 5, bta.f4786e);
        buj.m4244a(parcel, 6, bta.f4787f, i);
        buj.m4236a(parcel, 7, bta.f4788g);
        buj.m4238a(parcel, 8, bta.f4789h, i);
        buj.m4244a(parcel, 10, bta.f4790i, i);
        buj.m4244a(parcel, 11, bta.f4791j, i);
        buj.m4241a(parcel, 12, bta.f4792k);
        buj.m4251b(parcel, 13, bta.f4793l);
        buj.m4250b(parcel, a);
    }
}
