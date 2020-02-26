package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import java.util.List;

/* renamed from: bux  reason: default package */
/* compiled from: PG */
public final class bux extends buf {
    public static final Parcelable.Creator CREATOR = new buy();
    public String a;
    public Bundle b;
    public String c;
    public ApplicationErrorReport d;
    public String e;
    public BitmapTeleporter f;
    public String g;
    public List h;
    public boolean i;
    public bvd j;
    public bvb k;
    public boolean l;
    public Bitmap m;
    public String n;
    public boolean o;
    public long p;

    public /* synthetic */ bux(ApplicationErrorReport applicationErrorReport) {
        this(null, null, null, applicationErrorReport, null, null, null, null, true, null, null, false, null, null, false, 0);
    }

    public bux(String str, Bundle bundle, String str2, ApplicationErrorReport applicationErrorReport, String str3, BitmapTeleporter bitmapTeleporter, String str4, List list, boolean z, bvd bvd, bvb bvb, boolean z2, Bitmap bitmap, String str5, boolean z3, long j2) {
        this.a = str;
        this.b = bundle;
        this.c = str2;
        this.d = applicationErrorReport;
        this.e = str3;
        this.f = bitmapTeleporter;
        this.g = str4;
        this.h = list;
        this.i = z;
        this.j = bvd;
        this.k = bvb;
        this.l = z2;
        this.m = bitmap;
        this.n = str5;
        this.o = z3;
        this.p = j2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        buy.a(this, parcel, i2);
    }
}
