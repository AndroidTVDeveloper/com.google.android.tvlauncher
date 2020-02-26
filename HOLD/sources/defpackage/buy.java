package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import java.util.ArrayList;

/* renamed from: buy  reason: default package */
/* compiled from: PG */
public final class buy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = buh.b(parcel);
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
            switch (buh.a(readInt)) {
                case 2:
                    str = buh.f(parcel2, readInt);
                    break;
                case 3:
                    bundle = buh.h(parcel2, readInt);
                    break;
                case 4:
                default:
                    buh.b(parcel2, readInt);
                    break;
                case 5:
                    str2 = buh.f(parcel2, readInt);
                    break;
                case 6:
                    applicationErrorReport = (ApplicationErrorReport) buh.a(parcel2, readInt, ApplicationErrorReport.CREATOR);
                    break;
                case 7:
                    str3 = buh.f(parcel2, readInt);
                    break;
                case 8:
                    bitmapTeleporter = (BitmapTeleporter) buh.a(parcel2, readInt, BitmapTeleporter.CREATOR);
                    break;
                case 9:
                    str4 = buh.f(parcel2, readInt);
                    break;
                case 10:
                    arrayList = buh.c(parcel2, readInt, buz.CREATOR);
                    break;
                case 11:
                    z = buh.c(parcel2, readInt);
                    break;
                case 12:
                    bvd = (bvd) buh.a(parcel2, readInt, bvd.CREATOR);
                    break;
                case 13:
                    bvb = (bvb) buh.a(parcel2, readInt, bvb.CREATOR);
                    break;
                case 14:
                    z2 = buh.c(parcel2, readInt);
                    break;
                case 15:
                    bitmap = (Bitmap) buh.a(parcel2, readInt, Bitmap.CREATOR);
                    break;
                case 16:
                    str5 = buh.f(parcel2, readInt);
                    break;
                case 17:
                    z3 = buh.c(parcel2, readInt);
                    break;
                case 18:
                    j = buh.e(parcel2, readInt);
                    break;
            }
        }
        buh.n(parcel2, b);
        return new bux(str, bundle, str2, applicationErrorReport, str3, bitmapTeleporter, str4, arrayList, z, bvd, bvb, z2, bitmap, str5, z3, j);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new bux[i];
    }

    public static void a(bux bux, Parcel parcel, int i) {
        int a = buj.a(parcel);
        buj.a(parcel, 2, bux.a);
        buj.a(parcel, 3, bux.b);
        buj.a(parcel, 5, bux.c);
        buj.a(parcel, 6, bux.d, i);
        buj.a(parcel, 7, bux.e);
        buj.a(parcel, 8, bux.f, i);
        buj.a(parcel, 9, bux.g);
        buj.b(parcel, 10, bux.h);
        buj.a(parcel, 11, bux.i);
        buj.a(parcel, 12, bux.j, i);
        buj.a(parcel, 13, bux.k, i);
        buj.a(parcel, 14, bux.l);
        buj.a(parcel, 15, bux.m, i);
        buj.a(parcel, 16, bux.n);
        buj.a(parcel, 17, bux.o);
        buj.a(parcel, 18, bux.p);
        buj.b(parcel, a);
    }
}
