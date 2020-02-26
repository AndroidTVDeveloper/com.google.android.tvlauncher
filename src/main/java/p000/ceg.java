package p000;

import android.net.Uri;

/* renamed from: ceg */
/* compiled from: PG */
public final class ceg {

    /* renamed from: a */
    public final String f5353a;

    /* renamed from: b */
    public final Uri f5354b;

    /* renamed from: c */
    public final String f5355c;

    /* renamed from: d */
    public final String f5356d;

    /* renamed from: e */
    public final boolean f5357e;

    /* renamed from: f */
    public final boolean f5358f;

    public ceg(Uri uri) {
        this(null, uri, "", "", false, false);
    }

    public ceg(String str) {
        this(str, null, "", "", false, false);
    }

    public ceg(String str, Uri uri, String str2, String str3, boolean z, boolean z2) {
        this.f5353a = str;
        this.f5354b = uri;
        this.f5355c = str2;
        this.f5356d = str3;
        this.f5357e = z;
        this.f5358f = z2;
    }

    /* renamed from: a */
    public final ceg mo2691a(String str) {
        return new ceg(this.f5353a, this.f5354b, str, this.f5356d, this.f5357e, this.f5358f);
    }

    /* renamed from: b */
    public final ceg mo2692b(String str) {
        return new ceg(this.f5353a, this.f5354b, this.f5355c, str, this.f5357e, this.f5358f);
    }
}
