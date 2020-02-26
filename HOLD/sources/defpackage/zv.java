package defpackage;

import java.net.URL;
import java.security.MessageDigest;

/* renamed from: zv  reason: default package */
/* compiled from: PG */
public final class zv implements ts {
    public final zw b;
    public final URL c;
    public final String d;
    public String e;
    public URL f;
    private volatile byte[] g;
    private int h;

    public zv(String str) {
        zw zwVar = zw.a;
        this.c = null;
        this.d = aic.a(str);
        this.b = (zw) aic.a(zwVar);
    }

    public zv(URL url) {
        zw zwVar = zw.a;
        this.c = (URL) aic.a(url);
        this.d = null;
        this.b = (zw) aic.a(zwVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zv) {
            zv zvVar = (zv) obj;
            if (!a().equals(zvVar.a()) || !this.b.equals(zvVar.b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    private final String a() {
        String str = this.d;
        return str == null ? ((URL) aic.a(this.c)).toString() : str;
    }

    public final int hashCode() {
        int i = this.h;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode();
        this.h = hashCode;
        int hashCode2 = (hashCode * 31) + this.b.hashCode();
        this.h = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        return a();
    }

    public final void a(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = a().getBytes(a);
        }
        messageDigest.update(this.g);
    }
}
