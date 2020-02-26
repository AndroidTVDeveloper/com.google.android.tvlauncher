package p000;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import java.util.ArrayList;

/* renamed from: buy */
/* compiled from: PG */
public final class buy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = buh.m4209b(parcel);
        String str = null;
        Bundle bundle = null;
        String str2 = null;
        ApplicationErrorReport applicationErrorReport = null;
        String str3 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String str4 = null;
        ArrayList arrayList = null;
        bvd bvd = null;
        bvb bvb = null;
        Bitmap bitmap = null;
        String str5 = null;
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (buh.m4195a(readInt)) {
                case 2:
                    str = buh.m4219f(parcel2, readInt);
                    break;
                case 3:
                    bundle = buh.m4221h(parcel2, readInt);
                    break;
                case 4:
                default:
                    buh.m4210b(parcel2, readInt);
                    break;
                case 5:
                    str2 = buh.m4219f(parcel2, readInt);
                    break;
                case 6:
                    applicationErrorReport = (ApplicationErrorReport) buh.m4198a(parcel2, readInt, ApplicationErrorReport.CREATOR);
                    break;
                case 7:
                    str3 = buh.m4219f(parcel2, readInt);
                    break;
                case 8:
                    bitmapTeleporter = (BitmapTeleporter) buh.m4198a(parcel2, readInt, BitmapTeleporter.CREATOR);
                    break;
                case 9:
                    str4 = buh.m4219f(parcel2, readInt);
                    break;
                case 10:
                    arrayList = buh.m4215c(parcel2, readInt, buz.CREATOR);
                    break;
                case 11:
                    z = buh.m4216c(parcel2, readInt);
                    break;
                case 12:
                    bvd = (bvd) buh.m4198a(parcel2, readInt, bvd.CREATOR);
                    break;
                case 13:
                    bvb = (bvb) buh.m4198a(parcel2, readInt, bvb.CREATOR);
                    break;
                case 14:
                    z2 = buh.m4216c(parcel2, readInt);
                    break;
                case 15:
                    bitmap = (Bitmap) buh.m4198a(parcel2, readInt, Bitmap.CREATOR);
                    break;
                case 16:
                    str5 = buh.m4219f(parcel2, readInt);
                    break;
                case 17:
                    z3 = buh.m4216c(parcel2, readInt);
                    break;
                case 18:
                    j = buh.m4218e(parcel2, readInt);
                    break;
            }
        }
        buh.m4227n(parcel2, b);
        return new bux(str, bundle, str2, applicationErrorReport, str3, bitmapTeleporter, str4, arrayList, z, bvd, bvb, z2, bitmap, str5, z3, j);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new bux[i];
    }

    /* renamed from: a */
    public static void m4269a(bux bux, Parcel parcel, int i) {
        int a = buj.m4230a(parcel);
        buj.m4239a(parcel, 2, bux.f4872a);
        buj.m4236a(parcel, 3, bux.f4873b);
        buj.m4239a(parcel, 5, bux.f4874c);
        buj.m4238a(parcel, 6, bux.f4875d, i);
        buj.m4239a(parcel, 7, bux.f4876e);
        buj.m4238a(parcel, 8, bux.f4877f, i);
        buj.m4239a(parcel, 9, bux.f4878g);
        buj.m4252b(parcel, 10, bux.f4879h);
        buj.m4241a(parcel, 11, bux.f4880i);
        buj.m4238a(parcel, 12, bux.f4881j, i);
        buj.m4238a(parcel, 13, bux.f4882k, i);
        buj.m4241a(parcel, 14, bux.f4883l);
        buj.m4238a(parcel, 15, bux.f4884m, i);
        buj.m4239a(parcel, 16, bux.f4885n);
        buj.m4241a(parcel, 17, bux.f4886o);
        buj.m4235a(parcel, 18, bux.f4887p);
        buj.m4250b(parcel, a);
    }
}
