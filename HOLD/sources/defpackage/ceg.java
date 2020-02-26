package defpackage;

import android.net.Uri;

/* renamed from: ceg  reason: default package */
/* compiled from: PG */
public final class ceg {
    public final String a;
    public final Uri b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public ceg(Uri uri) {
        this(null, uri, "", "", false, false);
    }

    public ceg(String str) {
        this(str, null, "", "", false, false);
    }

    public ceg(String str, Uri uri, String str2, String str3, boolean z, boolean z2) {
        this.a = str;
        this.b = uri;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
    }

    public final ceg a(String str) {
        return new ceg(this.a, this.b, str, this.d, this.e, this.f);
    }

    public final ceg b(String str) {
        return new ceg(this.a, this.b, this.c, str, this.e, this.f);
    }
}
