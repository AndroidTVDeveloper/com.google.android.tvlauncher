package p000;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import java.util.List;

/* renamed from: bux */
/* compiled from: PG */
public final class bux extends buf {
    public static final Parcelable.Creator CREATOR = new buy();

    /* renamed from: a */
    public String f4872a;

    /* renamed from: b */
    public Bundle f4873b;

    /* renamed from: c */
    public String f4874c;

    /* renamed from: d */
    public ApplicationErrorReport f4875d;

    /* renamed from: e */
    public String f4876e;

    /* renamed from: f */
    public BitmapTeleporter f4877f;

    /* renamed from: g */
    public String f4878g;

    /* renamed from: h */
    public List f4879h;

    /* renamed from: i */
    public boolean f4880i;

    /* renamed from: j */
    public bvd f4881j;

    /* renamed from: k */
    public bvb f4882k;

    /* renamed from: l */
    public boolean f4883l;

    /* renamed from: m */
    public Bitmap f4884m;

    /* renamed from: n */
    public String f4885n;

    /* renamed from: o */
    public boolean f4886o;

    /* renamed from: p */
    public long f4887p;

    public /* synthetic */ bux(ApplicationErrorReport applicationErrorReport) {
        this(null, null, null, applicationErrorReport, null, null, null, null, true, null, null, false, null, null, false, 0);
    }

    public bux(String str, Bundle bundle, String str2, ApplicationErrorReport applicationErrorReport, String str3, BitmapTeleporter bitmapTeleporter, String str4, List list, boolean z, bvd bvd, bvb bvb, boolean z2, Bitmap bitmap, String str5, boolean z3, long j) {
        this.f4872a = str;
        this.f4873b = bundle;
        this.f4874c = str2;
        this.f4875d = applicationErrorReport;
        this.f4876e = str3;
        this.f4877f = bitmapTeleporter;
        this.f4878g = str4;
        this.f4879h = list;
        this.f4880i = z;
        this.f4881j = bvd;
        this.f4882k = bvb;
        this.f4883l = z2;
        this.f4884m = bitmap;
        this.f4885n = str5;
        this.f4886o = z3;
        this.f4887p = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        buy.m4269a(this, parcel, i);
    }
}
