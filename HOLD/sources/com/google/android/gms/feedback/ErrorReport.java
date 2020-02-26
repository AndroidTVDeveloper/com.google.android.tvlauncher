package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.io.File;
import java.util.List;

/* compiled from: PG */
public class ErrorReport extends buf implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bur();
    private String A;
    private String B;
    private String C;
    private Bundle D;
    private boolean E;
    private int F;
    private int G;
    private boolean H;
    private String I;
    private String J;
    private int K;
    private String L;
    private String M;
    private String N;
    private String O;
    private String P;
    @Deprecated
    private String Q;
    private String R;
    private BitmapTeleporter S;
    private String T;
    private buz[] U;
    private String[] V;
    private boolean W;
    private String X;
    private bvd Y;
    private bvb Z;
    private ApplicationErrorReport a;
    @Deprecated
    private String aa;
    private boolean ab;
    private Bundle ac;
    private List ad;
    private boolean ae;
    private Bitmap af;
    private String ag;
    private List ah;
    private int ai;
    private String b;
    private int c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private int k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String[] q;
    private String[] r;
    private String[] s;
    private String t;
    private String u;
    private byte[] v;
    private int w;
    private int x;
    private int y;
    private int z;

    public ErrorReport() {
        this.a = new ApplicationErrorReport();
    }

    public ErrorReport(ApplicationErrorReport applicationErrorReport, String str, int i2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i3, String str9, String str10, String str11, String str12, String str13, String[] strArr, String[] strArr2, String[] strArr3, String str14, String str15, byte[] bArr, int i4, int i5, int i6, int i7, String str16, String str17, String str18, Bundle bundle, boolean z2, int i8, int i9, boolean z3, String str19, String str20, int i10, String str21, String str22, String str23, String str24, String str25, String str26, String str27, BitmapTeleporter bitmapTeleporter, String str28, buz[] buzArr, String[] strArr4, boolean z4, String str29, bvd bvd, bvb bvb, String str30, boolean z5, Bundle bundle2, List list, boolean z6, Bitmap bitmap, String str31, List list2, int i11) {
        new ApplicationErrorReport();
        this.a = applicationErrorReport;
        this.b = str;
        this.c = i2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = i3;
        this.l = str9;
        this.m = str10;
        this.n = str11;
        this.o = str12;
        this.p = str13;
        this.q = strArr;
        this.r = strArr2;
        this.s = strArr3;
        this.t = str14;
        this.u = str15;
        this.v = bArr;
        this.w = i4;
        this.x = i5;
        this.y = i6;
        this.z = i7;
        this.A = str16;
        this.B = str17;
        this.C = str18;
        this.D = bundle;
        this.E = z2;
        this.F = i8;
        this.G = i9;
        this.H = z3;
        this.I = str19;
        this.J = str20;
        this.K = i10;
        this.L = str21;
        this.M = str22;
        this.N = str23;
        this.O = str24;
        this.P = str25;
        this.Q = str26;
        this.R = str27;
        this.S = bitmapTeleporter;
        this.T = str28;
        this.U = buzArr;
        this.V = strArr4;
        this.W = z4;
        this.X = str29;
        this.Y = bvd;
        this.Z = bvb;
        this.aa = str30;
        this.ab = z5;
        this.ac = bundle2;
        this.ad = list;
        this.ae = z6;
        this.af = bitmap;
        this.ag = str31;
        this.ah = list2;
        this.ai = i11;
    }

    public ErrorReport(bux bux, File file) {
        ApplicationErrorReport.CrashInfo crashInfo;
        this.a = new ApplicationErrorReport();
        if (bux != null) {
            Bundle bundle = bux.b;
            if (bundle != null && bundle.size() > 0) {
                this.D = bux.b;
            }
            if (!TextUtils.isEmpty(bux.a)) {
                this.B = bux.a;
            }
            if (!TextUtils.isEmpty(bux.c)) {
                this.b = bux.c;
            }
            ApplicationErrorReport applicationErrorReport = bux.d;
            if (applicationErrorReport != null) {
                crashInfo = applicationErrorReport.crashInfo;
            } else {
                crashInfo = null;
            }
            if (crashInfo != null) {
                this.M = crashInfo.throwMethodName;
                this.K = crashInfo.throwLineNumber;
                this.L = crashInfo.throwClassName;
                this.N = crashInfo.stackTrace;
                this.I = crashInfo.exceptionClassName;
                this.O = crashInfo.exceptionMessage;
                this.J = crashInfo.throwFileName;
            }
            bvd bvd = bux.j;
            if (bvd != null) {
                this.Y = bvd;
            }
            if (!TextUtils.isEmpty(bux.e)) {
                this.P = bux.e;
            }
            if (!TextUtils.isEmpty(bux.g)) {
                this.a.packageName = bux.g;
            }
            if (!TextUtils.isEmpty(bux.n)) {
                this.ag = bux.n;
            }
            Bitmap bitmap = bux.m;
            if (bitmap != null) {
                this.af = bitmap;
            }
            if (file != null) {
                BitmapTeleporter bitmapTeleporter = bux.f;
                if (bitmapTeleporter != null) {
                    this.S = bitmapTeleporter;
                    bitmapTeleporter.a = file;
                }
                List list = bux.h;
                if (list != null && !list.isEmpty()) {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((buz) list.get(i2)).a = file;
                    }
                    this.U = (buz[]) list.toArray(new buz[bux.h.size()]);
                }
            }
            bvb bvb = bux.k;
            if (bvb != null) {
                this.Z = bvb;
            }
            this.W = bux.i;
            this.ae = bux.l;
            this.E = bux.o;
        }
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = buj.a(parcel);
        buj.a(parcel, 2, this.a, i2);
        buj.a(parcel, 3, this.b);
        buj.b(parcel, 4, this.c);
        buj.a(parcel, 5, this.d);
        buj.a(parcel, 6, this.e);
        buj.a(parcel, 7, this.f);
        buj.a(parcel, 8, this.g);
        buj.a(parcel, 9, this.h);
        buj.a(parcel, 10, this.i);
        buj.a(parcel, 11, this.j);
        buj.b(parcel, 12, this.k);
        buj.a(parcel, 13, this.l);
        buj.a(parcel, 14, this.m);
        buj.a(parcel, 15, this.n);
        buj.a(parcel, 16, this.o);
        buj.a(parcel, 17, this.p);
        buj.a(parcel, 18, this.q);
        buj.a(parcel, 19, this.r);
        buj.a(parcel, 20, this.s);
        buj.a(parcel, 21, this.t);
        buj.a(parcel, 22, this.u);
        buj.a(parcel, 23, this.v);
        buj.b(parcel, 24, this.w);
        buj.b(parcel, 25, this.x);
        buj.b(parcel, 26, this.y);
        buj.b(parcel, 27, this.z);
        buj.a(parcel, 28, this.A);
        buj.a(parcel, 29, this.B);
        buj.a(parcel, 30, this.C);
        buj.a(parcel, 31, this.D);
        buj.a(parcel, 32, this.E);
        buj.b(parcel, 33, this.F);
        buj.b(parcel, 34, this.G);
        buj.a(parcel, 35, this.H);
        buj.a(parcel, 36, this.I);
        buj.a(parcel, 37, this.J);
        buj.b(parcel, 38, this.K);
        buj.a(parcel, 39, this.L);
        buj.a(parcel, 40, this.M);
        buj.a(parcel, 41, this.N);
        buj.a(parcel, 42, this.O);
        buj.a(parcel, 43, this.P);
        buj.a(parcel, 44, this.Q);
        buj.a(parcel, 45, this.R);
        buj.a(parcel, 46, this.S, i2);
        buj.a(parcel, 47, this.T);
        buj.a(parcel, 48, this.U, i2);
        buj.a(parcel, 49, this.V);
        buj.a(parcel, 50, this.W);
        buj.a(parcel, 51, this.X);
        buj.a(parcel, 52, this.Y, i2);
        buj.a(parcel, 53, this.Z, i2);
        buj.a(parcel, 54, this.aa);
        buj.a(parcel, 55, this.ab);
        buj.a(parcel, 56, this.ac);
        buj.b(parcel, 57, this.ad);
        buj.a(parcel, 58, this.ae);
        buj.a(parcel, 59, this.af, i2);
        buj.a(parcel, 60, this.ag);
        buj.a(parcel, 61, this.ah);
        buj.b(parcel, 62, this.ai);
        buj.b(parcel, a2);
    }
}
