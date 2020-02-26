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

    /* renamed from: A */
    private String f6298A;

    /* renamed from: B */
    private String f6299B;

    /* renamed from: C */
    private String f6300C;

    /* renamed from: D */
    private Bundle f6301D;

    /* renamed from: E */
    private boolean f6302E;

    /* renamed from: F */
    private int f6303F;

    /* renamed from: G */
    private int f6304G;

    /* renamed from: H */
    private boolean f6305H;

    /* renamed from: I */
    private String f6306I;

    /* renamed from: J */
    private String f6307J;

    /* renamed from: K */
    private int f6308K;

    /* renamed from: L */
    private String f6309L;

    /* renamed from: M */
    private String f6310M;

    /* renamed from: N */
    private String f6311N;

    /* renamed from: O */
    private String f6312O;

    /* renamed from: P */
    private String f6313P;
    @Deprecated

    /* renamed from: Q */
    private String f6314Q;

    /* renamed from: R */
    private String f6315R;

    /* renamed from: S */
    private BitmapTeleporter f6316S;

    /* renamed from: T */
    private String f6317T;

    /* renamed from: U */
    private buz[] f6318U;

    /* renamed from: V */
    private String[] f6319V;

    /* renamed from: W */
    private boolean f6320W;

    /* renamed from: X */
    private String f6321X;

    /* renamed from: Y */
    private bvd f6322Y;

    /* renamed from: Z */
    private bvb f6323Z;

    /* renamed from: a */
    private ApplicationErrorReport f6324a;
    @Deprecated

    /* renamed from: aa */
    private String f6325aa;

    /* renamed from: ab */
    private boolean f6326ab;

    /* renamed from: ac */
    private Bundle f6327ac;

    /* renamed from: ad */
    private List f6328ad;

    /* renamed from: ae */
    private boolean f6329ae;

    /* renamed from: af */
    private Bitmap f6330af;

    /* renamed from: ag */
    private String f6331ag;

    /* renamed from: ah */
    private List f6332ah;

    /* renamed from: ai */
    private int f6333ai;

    /* renamed from: b */
    private String f6334b;

    /* renamed from: c */
    private int f6335c;

    /* renamed from: d */
    private String f6336d;

    /* renamed from: e */
    private String f6337e;

    /* renamed from: f */
    private String f6338f;

    /* renamed from: g */
    private String f6339g;

    /* renamed from: h */
    private String f6340h;

    /* renamed from: i */
    private String f6341i;

    /* renamed from: j */
    private String f6342j;

    /* renamed from: k */
    private int f6343k;

    /* renamed from: l */
    private String f6344l;

    /* renamed from: m */
    private String f6345m;

    /* renamed from: n */
    private String f6346n;

    /* renamed from: o */
    private String f6347o;

    /* renamed from: p */
    private String f6348p;

    /* renamed from: q */
    private String[] f6349q;

    /* renamed from: r */
    private String[] f6350r;

    /* renamed from: s */
    private String[] f6351s;

    /* renamed from: t */
    private String f6352t;

    /* renamed from: u */
    private String f6353u;

    /* renamed from: v */
    private byte[] f6354v;

    /* renamed from: w */
    private int f6355w;

    /* renamed from: x */
    private int f6356x;

    /* renamed from: y */
    private int f6357y;

    /* renamed from: z */
    private int f6358z;

    public ErrorReport() {
        this.f6324a = new ApplicationErrorReport();
    }

    public ErrorReport(ApplicationErrorReport applicationErrorReport, String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, String str10, String str11, String str12, String str13, String[] strArr, String[] strArr2, String[] strArr3, String str14, String str15, byte[] bArr, int i3, int i4, int i5, int i6, String str16, String str17, String str18, Bundle bundle, boolean z, int i7, int i8, boolean z2, String str19, String str20, int i9, String str21, String str22, String str23, String str24, String str25, String str26, String str27, BitmapTeleporter bitmapTeleporter, String str28, buz[] buzArr, String[] strArr4, boolean z3, String str29, bvd bvd, bvb bvb, String str30, boolean z4, Bundle bundle2, List list, boolean z5, Bitmap bitmap, String str31, List list2, int i10) {
        new ApplicationErrorReport();
        this.f6324a = applicationErrorReport;
        this.f6334b = str;
        this.f6335c = i;
        this.f6336d = str2;
        this.f6337e = str3;
        this.f6338f = str4;
        this.f6339g = str5;
        this.f6340h = str6;
        this.f6341i = str7;
        this.f6342j = str8;
        this.f6343k = i2;
        this.f6344l = str9;
        this.f6345m = str10;
        this.f6346n = str11;
        this.f6347o = str12;
        this.f6348p = str13;
        this.f6349q = strArr;
        this.f6350r = strArr2;
        this.f6351s = strArr3;
        this.f6352t = str14;
        this.f6353u = str15;
        this.f6354v = bArr;
        this.f6355w = i3;
        this.f6356x = i4;
        this.f6357y = i5;
        this.f6358z = i6;
        this.f6298A = str16;
        this.f6299B = str17;
        this.f6300C = str18;
        this.f6301D = bundle;
        this.f6302E = z;
        this.f6303F = i7;
        this.f6304G = i8;
        this.f6305H = z2;
        this.f6306I = str19;
        this.f6307J = str20;
        this.f6308K = i9;
        this.f6309L = str21;
        this.f6310M = str22;
        this.f6311N = str23;
        this.f6312O = str24;
        this.f6313P = str25;
        this.f6314Q = str26;
        this.f6315R = str27;
        this.f6316S = bitmapTeleporter;
        this.f6317T = str28;
        this.f6318U = buzArr;
        this.f6319V = strArr4;
        this.f6320W = z3;
        this.f6321X = str29;
        this.f6322Y = bvd;
        this.f6323Z = bvb;
        this.f6325aa = str30;
        this.f6326ab = z4;
        this.f6327ac = bundle2;
        this.f6328ad = list;
        this.f6329ae = z5;
        this.f6330af = bitmap;
        this.f6331ag = str31;
        this.f6332ah = list2;
        this.f6333ai = i10;
    }

    public ErrorReport(bux bux, File file) {
        ApplicationErrorReport.CrashInfo crashInfo;
        this.f6324a = new ApplicationErrorReport();
        if (bux != null) {
            Bundle bundle = bux.f4873b;
            if (bundle != null && bundle.size() > 0) {
                this.f6301D = bux.f4873b;
            }
            if (!TextUtils.isEmpty(bux.f4872a)) {
                this.f6299B = bux.f4872a;
            }
            if (!TextUtils.isEmpty(bux.f4874c)) {
                this.f6334b = bux.f4874c;
            }
            ApplicationErrorReport applicationErrorReport = bux.f4875d;
            if (applicationErrorReport != null) {
                crashInfo = applicationErrorReport.crashInfo;
            } else {
                crashInfo = null;
            }
            if (crashInfo != null) {
                this.f6310M = crashInfo.throwMethodName;
                this.f6308K = crashInfo.throwLineNumber;
                this.f6309L = crashInfo.throwClassName;
                this.f6311N = crashInfo.stackTrace;
                this.f6306I = crashInfo.exceptionClassName;
                this.f6312O = crashInfo.exceptionMessage;
                this.f6307J = crashInfo.throwFileName;
            }
            bvd bvd = bux.f4881j;
            if (bvd != null) {
                this.f6322Y = bvd;
            }
            if (!TextUtils.isEmpty(bux.f4876e)) {
                this.f6313P = bux.f4876e;
            }
            if (!TextUtils.isEmpty(bux.f4878g)) {
                this.f6324a.packageName = bux.f4878g;
            }
            if (!TextUtils.isEmpty(bux.f4885n)) {
                this.f6331ag = bux.f4885n;
            }
            Bitmap bitmap = bux.f4884m;
            if (bitmap != null) {
                this.f6330af = bitmap;
            }
            if (file != null) {
                BitmapTeleporter bitmapTeleporter = bux.f4877f;
                if (bitmapTeleporter != null) {
                    this.f6316S = bitmapTeleporter;
                    bitmapTeleporter.f6285a = file;
                }
                List list = bux.f4879h;
                if (list != null && !list.isEmpty()) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((buz) list.get(i)).f4888a = file;
                    }
                    this.f6318U = (buz[]) list.toArray(new buz[bux.f4879h.size()]);
                }
            }
            bvb bvb = bux.f4882k;
            if (bvb != null) {
                this.f6323Z = bvb;
            }
            this.f6320W = bux.f4880i;
            this.f6329ae = bux.f4883l;
            this.f6302E = bux.f4886o;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = buj.m4230a(parcel);
        buj.m4238a(parcel, 2, this.f6324a, i);
        buj.m4239a(parcel, 3, this.f6334b);
        buj.m4251b(parcel, 4, this.f6335c);
        buj.m4239a(parcel, 5, this.f6336d);
        buj.m4239a(parcel, 6, this.f6337e);
        buj.m4239a(parcel, 7, this.f6338f);
        buj.m4239a(parcel, 8, this.f6339g);
        buj.m4239a(parcel, 9, this.f6340h);
        buj.m4239a(parcel, 10, this.f6341i);
        buj.m4239a(parcel, 11, this.f6342j);
        buj.m4251b(parcel, 12, this.f6343k);
        buj.m4239a(parcel, 13, this.f6344l);
        buj.m4239a(parcel, 14, this.f6345m);
        buj.m4239a(parcel, 15, this.f6346n);
        buj.m4239a(parcel, 16, this.f6347o);
        buj.m4239a(parcel, 17, this.f6348p);
        buj.m4245a(parcel, 18, this.f6349q);
        buj.m4245a(parcel, 19, this.f6350r);
        buj.m4245a(parcel, 20, this.f6351s);
        buj.m4239a(parcel, 21, this.f6352t);
        buj.m4239a(parcel, 22, this.f6353u);
        buj.m4242a(parcel, 23, this.f6354v);
        buj.m4251b(parcel, 24, this.f6355w);
        buj.m4251b(parcel, 25, this.f6356x);
        buj.m4251b(parcel, 26, this.f6357y);
        buj.m4251b(parcel, 27, this.f6358z);
        buj.m4239a(parcel, 28, this.f6298A);
        buj.m4239a(parcel, 29, this.f6299B);
        buj.m4239a(parcel, 30, this.f6300C);
        buj.m4236a(parcel, 31, this.f6301D);
        buj.m4241a(parcel, 32, this.f6302E);
        buj.m4251b(parcel, 33, this.f6303F);
        buj.m4251b(parcel, 34, this.f6304G);
        buj.m4241a(parcel, 35, this.f6305H);
        buj.m4239a(parcel, 36, this.f6306I);
        buj.m4239a(parcel, 37, this.f6307J);
        buj.m4251b(parcel, 38, this.f6308K);
        buj.m4239a(parcel, 39, this.f6309L);
        buj.m4239a(parcel, 40, this.f6310M);
        buj.m4239a(parcel, 41, this.f6311N);
        buj.m4239a(parcel, 42, this.f6312O);
        buj.m4239a(parcel, 43, this.f6313P);
        buj.m4239a(parcel, 44, this.f6314Q);
        buj.m4239a(parcel, 45, this.f6315R);
        buj.m4238a(parcel, 46, this.f6316S, i);
        buj.m4239a(parcel, 47, this.f6317T);
        buj.m4244a(parcel, 48, this.f6318U, i);
        buj.m4245a(parcel, 49, this.f6319V);
        buj.m4241a(parcel, 50, this.f6320W);
        buj.m4239a(parcel, 51, this.f6321X);
        buj.m4238a(parcel, 52, this.f6322Y, i);
        buj.m4238a(parcel, 53, this.f6323Z, i);
        buj.m4239a(parcel, 54, this.f6325aa);
        buj.m4241a(parcel, 55, this.f6326ab);
        buj.m4236a(parcel, 56, this.f6327ac);
        buj.m4252b(parcel, 57, this.f6328ad);
        buj.m4241a(parcel, 58, this.f6329ae);
        buj.m4238a(parcel, 59, this.f6330af, i);
        buj.m4239a(parcel, 60, this.f6331ag);
        buj.m4240a(parcel, 61, this.f6332ah);
        buj.m4251b(parcel, 62, this.f6333ai);
        buj.m4250b(parcel, a);
    }
}
