package defpackage;

import java.security.MessageDigest;
import java.util.Map;

/* renamed from: wm  reason: default package */
/* compiled from: PG */
public final class wm implements ts {
    private final Object b;
    private final int c;
    private final int d;
    private final Class e;
    private final Class f;
    private final ts g;
    private final Map h;
    private final tx i;
    private int j;

    public wm(Object obj, ts tsVar, int i2, int i3, Map map, Class cls, Class cls2, tx txVar) {
        this.b = aic.a(obj);
        this.g = (ts) aic.a(tsVar, "Signature must not be null");
        this.c = i2;
        this.d = i3;
        this.h = (Map) aic.a(map);
        this.e = (Class) aic.a(cls, "Resource class must not be null");
        this.f = (Class) aic.a(cls2, "Transcode class must not be null");
        this.i = (tx) aic.a(txVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wm) {
            wm wmVar = (wm) obj;
            if (!this.b.equals(wmVar.b) || !this.g.equals(wmVar.g) || this.d != wmVar.d || this.c != wmVar.c || !this.h.equals(wmVar.h) || !this.e.equals(wmVar.e) || !this.f.equals(wmVar.f) || !this.i.equals(wmVar.i)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.j;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = this.b.hashCode();
        this.j = hashCode;
        int hashCode2 = (((((hashCode * 31) + this.g.hashCode()) * 31) + this.c) * 31) + this.d;
        this.j = hashCode2;
        int hashCode3 = (hashCode2 * 31) + this.h.hashCode();
        this.j = hashCode3;
        int hashCode4 = (hashCode3 * 31) + this.e.hashCode();
        this.j = hashCode4;
        int hashCode5 = (hashCode4 * 31) + this.f.hashCode();
        this.j = hashCode5;
        int hashCode6 = (hashCode5 * 31) + this.i.hashCode();
        this.j = hashCode6;
        return hashCode6;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        int i2 = this.c;
        int i3 = this.d;
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.g);
        int i4 = this.j;
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.i);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 151 + length2 + length3 + length4 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("EngineKey{model=");
        sb.append(valueOf);
        sb.append(", width=");
        sb.append(i2);
        sb.append(", height=");
        sb.append(i3);
        sb.append(", resourceClass=");
        sb.append(valueOf2);
        sb.append(", transcodeClass=");
        sb.append(valueOf3);
        sb.append(", signature=");
        sb.append(valueOf4);
        sb.append(", hashCode=");
        sb.append(i4);
        sb.append(", transformations=");
        sb.append(valueOf5);
        sb.append(", options=");
        sb.append(valueOf6);
        sb.append('}');
        return sb.toString();
    }

    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
