package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* renamed from: bms */
/* compiled from: PG */
public final class bms implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = buh.m4209b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (buh.m4195a(readInt)) {
                case 1:
                    i = buh.m4217d(parcel2, readInt);
                    break;
                case 2:
                    str = buh.m4219f(parcel2, readInt);
                    break;
                case 3:
                    str2 = buh.m4219f(parcel2, readInt);
                    break;
                case 4:
                    str3 = buh.m4219f(parcel2, readInt);
                    break;
                case 5:
                    str4 = buh.m4219f(parcel2, readInt);
                    break;
                case 6:
                    uri = (Uri) buh.m4198a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 7:
                    str5 = buh.m4219f(parcel2, readInt);
                    break;
                case 8:
                    j = buh.m4218e(parcel2, readInt);
                    break;
                case 9:
                    str6 = buh.m4219f(parcel2, readInt);
                    break;
                case 10:
                    arrayList = buh.m4215c(parcel2, readInt, Scope.CREATOR);
                    break;
                case 11:
                    str7 = buh.m4219f(parcel2, readInt);
                    break;
                case 12:
                    str8 = buh.m4219f(parcel2, readInt);
                    break;
                default:
                    buh.m4210b(parcel2, readInt);
                    break;
            }
        }
        buh.m4227n(parcel2, b);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
