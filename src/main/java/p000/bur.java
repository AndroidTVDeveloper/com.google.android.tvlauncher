package p000;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.ErrorReport;
import java.util.ArrayList;

/* renamed from: bur */
/* compiled from: PG */
public final class bur implements Parcelable.Creator {
    /* renamed from: a */
    private static final ErrorReport m4262a(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = buh.m4209b(parcel);
        ApplicationErrorReport applicationErrorReport = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        String str14 = null;
        String str15 = null;
        byte[] bArr = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        Bundle bundle = null;
        String str19 = null;
        String str20 = null;
        String str21 = null;
        String str22 = null;
        String str23 = null;
        String str24 = null;
        String str25 = null;
        String str26 = null;
        String str27 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String str28 = null;
        buz[] buzArr = null;
        String[] strArr4 = null;
        String str29 = null;
        bvd bvd = null;
        bvb bvb = null;
        String str30 = null;
        Bundle bundle2 = null;
        ArrayList arrayList = null;
        Bitmap bitmap = null;
        String str31 = null;
        ArrayList arrayList2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        boolean z2 = false;
        int i9 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i10 = 0;
        while (parcel.dataPosition() < b) {
            int a = buh.m4196a(parcel);
            switch (buh.m4195a(a)) {
                case 2:
                    applicationErrorReport = (ApplicationErrorReport) buh.m4198a(parcel2, a, ApplicationErrorReport.CREATOR);
                    break;
                case 3:
                    str = buh.m4219f(parcel2, a);
                    break;
                case 4:
                    i = buh.m4217d(parcel2, a);
                    break;
                case 5:
                    str2 = buh.m4219f(parcel2, a);
                    break;
                case 6:
                    str3 = buh.m4219f(parcel2, a);
                    break;
                case 7:
                    str4 = buh.m4219f(parcel2, a);
                    break;
                case 8:
                    str5 = buh.m4219f(parcel2, a);
                    break;
                case 9:
                    str6 = buh.m4219f(parcel2, a);
                    break;
                case 10:
                    str7 = buh.m4219f(parcel2, a);
                    break;
                case 11:
                    str8 = buh.m4219f(parcel2, a);
                    break;
                case 12:
                    i2 = buh.m4217d(parcel2, a);
                    break;
                case 13:
                    str9 = buh.m4219f(parcel2, a);
                    break;
                case 14:
                    str10 = buh.m4219f(parcel2, a);
                    break;
                case 15:
                    str11 = buh.m4219f(parcel2, a);
                    break;
                case 16:
                    str12 = buh.m4219f(parcel2, a);
                    break;
                case 17:
                    str13 = buh.m4219f(parcel2, a);
                    break;
                case 18:
                    strArr = buh.m4225l(parcel2, a);
                    break;
                case 19:
                    strArr2 = buh.m4225l(parcel2, a);
                    break;
                case 20:
                    strArr3 = buh.m4225l(parcel2, a);
                    break;
                case 21:
                    str14 = buh.m4219f(parcel2, a);
                    break;
                case 22:
                    str15 = buh.m4219f(parcel2, a);
                    break;
                case 23:
                    bArr = buh.m4222i(parcel2, a);
                    break;
                case 24:
                    i3 = buh.m4217d(parcel2, a);
                    break;
                case 25:
                    i4 = buh.m4217d(parcel2, a);
                    break;
                case 26:
                    i5 = buh.m4217d(parcel2, a);
                    break;
                case 27:
                    i6 = buh.m4217d(parcel2, a);
                    break;
                case 28:
                    str16 = buh.m4219f(parcel2, a);
                    break;
                case 29:
                    str17 = buh.m4219f(parcel2, a);
                    break;
                case 30:
                    str18 = buh.m4219f(parcel2, a);
                    break;
                case 31:
                    bundle = buh.m4221h(parcel2, a);
                    break;
                case 32:
                    z = buh.m4216c(parcel2, a);
                    break;
                case 33:
                    i7 = buh.m4217d(parcel2, a);
                    break;
                case 34:
                    i8 = buh.m4217d(parcel2, a);
                    break;
                case 35:
                    z2 = buh.m4216c(parcel2, a);
                    break;
                case 36:
                    str19 = buh.m4219f(parcel2, a);
                    break;
                case 37:
                    str20 = buh.m4219f(parcel2, a);
                    break;
                case 38:
                    i9 = buh.m4217d(parcel2, a);
                    break;
                case 39:
                    str21 = buh.m4219f(parcel2, a);
                    break;
                case 40:
                    str22 = buh.m4219f(parcel2, a);
                    break;
                case 41:
                    str23 = buh.m4219f(parcel2, a);
                    break;
                case 42:
                    str24 = buh.m4219f(parcel2, a);
                    break;
                case 43:
                    str25 = buh.m4219f(parcel2, a);
                    break;
                case 44:
                    str26 = buh.m4219f(parcel2, a);
                    break;
                case 45:
                    str27 = buh.m4219f(parcel2, a);
                    break;
                case 46:
                    bitmapTeleporter = (BitmapTeleporter) buh.m4198a(parcel2, a, BitmapTeleporter.CREATOR);
                    break;
                case 47:
                    str28 = buh.m4219f(parcel2, a);
                    break;
                case 48:
                    buzArr = (buz[]) buh.m4214b(parcel2, a, buz.CREATOR);
                    break;
                case 49:
                    strArr4 = buh.m4225l(parcel2, a);
                    break;
                case 50:
                    z3 = buh.m4216c(parcel2, a);
                    break;
                case 51:
                    str29 = buh.m4219f(parcel2, a);
                    break;
                case 52:
                    bvd = (bvd) buh.m4198a(parcel2, a, bvd.CREATOR);
                    break;
                case 53:
                    bvb = (bvb) buh.m4198a(parcel2, a, bvb.CREATOR);
                    break;
                case 54:
                    str30 = buh.m4219f(parcel2, a);
                    break;
                case 55:
                    z4 = buh.m4216c(parcel2, a);
                    break;
                case 56:
                    bundle2 = buh.m4221h(parcel2, a);
                    break;
                case 57:
                    arrayList = buh.m4215c(parcel2, a, RectF.CREATOR);
                    break;
                case 58:
                    z5 = buh.m4216c(parcel2, a);
                    break;
                case 59:
                    bitmap = (Bitmap) buh.m4198a(parcel2, a, Bitmap.CREATOR);
                    break;
                case 60:
                    str31 = buh.m4219f(parcel2, a);
                    break;
                case 61:
                    arrayList2 = buh.m4226m(parcel2, a);
                    break;
                case 62:
                    i10 = buh.m4217d(parcel2, a);
                    break;
                default:
                    buh.m4210b(parcel2, a);
                    break;
            }
        }
        buh.m4227n(parcel2, b);
        return new ErrorReport(applicationErrorReport, str, i, str2, str3, str4, str5, str6, str7, str8, i2, str9, str10, str11, str12, str13, strArr, strArr2, strArr3, str14, str15, bArr, i3, i4, i5, i6, str16, str17, str18, bundle, z, i7, i8, z2, str19, str20, i9, str21, str22, str23, str24, str25, str26, str27, bitmapTeleporter, str28, buzArr, strArr4, z3, str29, bvd, bvb, str30, z4, bundle2, arrayList, z5, bitmap, str31, arrayList2, i10);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m4262a(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ErrorReport[i];
    }
}
