package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* renamed from: btb  reason: default package */
/* compiled from: PG */
public final class btb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = buh.b(parcel);
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
            switch (buh.a(readInt)) {
                case 1:
                    i = buh.d(parcel2, readInt);
                    break;
                case 2:
                    i2 = buh.d(parcel2, readInt);
                    break;
                case 3:
                    i3 = buh.d(parcel2, readInt);
                    break;
                case 4:
                    str = buh.f(parcel2, readInt);
                    break;
                case 5:
                    iBinder = buh.g(parcel2, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) buh.b(parcel2, readInt, Scope.CREATOR);
                    break;
                case 7:
                    bundle = buh.h(parcel2, readInt);
                    break;
                case 8:
                    account = (Account) buh.a(parcel2, readInt, Account.CREATOR);
                    break;
                case 9:
                default:
                    buh.b(parcel2, readInt);
                    break;
                case 10:
                    bnrArr = (bnr[]) buh.b(parcel2, readInt, bnr.CREATOR);
                    break;
                case 11:
                    bnrArr2 = (bnr[]) buh.b(parcel2, readInt, bnr.CREATOR);
                    break;
                case 12:
                    z = buh.c(parcel2, readInt);
                    break;
                case 13:
                    i4 = buh.d(parcel2, readInt);
                    break;
            }
        }
        buh.n(parcel2, b);
        return new bta(i, i2, i3, str, iBinder, scopeArr, bundle, account, bnrArr, bnrArr2, z, i4);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new bta[i];
    }

    static void a(bta bta, Parcel parcel, int i) {
        int a = buj.a(parcel);
        buj.b(parcel, 1, bta.a);
        buj.b(parcel, 2, bta.b);
        buj.b(parcel, 3, bta.c);
        buj.a(parcel, 4, bta.d);
        buj.a(parcel, 5, bta.e);
        buj.a(parcel, 6, bta.f, i);
        buj.a(parcel, 7, bta.g);
        buj.a(parcel, 8, bta.h, i);
        buj.a(parcel, 10, bta.i, i);
        buj.a(parcel, 11, bta.j, i);
        buj.a(parcel, 12, bta.k);
        buj.b(parcel, 13, bta.l);
        buj.b(parcel, a);
    }
}
