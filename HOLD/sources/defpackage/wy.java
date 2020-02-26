package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: wy  reason: default package */
/* compiled from: PG */
final class wy implements ts {
    private static final ahz b = new ahz(50);
    private final xe c;
    private final ts d;
    private final ts e;
    private final int f;
    private final int g;
    private final Class h;
    private final tx i;
    private final ub j;

    public wy(xe xeVar, ts tsVar, ts tsVar2, int i2, int i3, ub ubVar, Class cls, tx txVar) {
        this.c = xeVar;
        this.d = tsVar;
        this.e = tsVar2;
        this.f = i2;
        this.g = i3;
        this.j = ubVar;
        this.h = cls;
        this.i = txVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wy) {
            wy wyVar = (wy) obj;
            if (this.g != wyVar.g || this.f != wyVar.f || !aie.a(this.j, wyVar.j) || !this.h.equals(wyVar.h) || !this.d.equals(wyVar.d) || !this.e.equals(wyVar.e) || !this.i.equals(wyVar.i)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.d.hashCode() * 31) + this.e.hashCode()) * 31) + this.f) * 31) + this.g;
        ub ubVar = this.j;
        if (ubVar != null) {
            hashCode = (hashCode * 31) + ubVar.hashCode();
        }
        return (((hashCode * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        int i2 = this.f;
        int i3 = this.g;
        String valueOf3 = String.valueOf(this.h);
        String valueOf4 = String.valueOf(this.j);
        String valueOf5 = String.valueOf(this.i);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 131 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("ResourceCacheKey{sourceKey=");
        sb.append(valueOf);
        sb.append(", signature=");
        sb.append(valueOf2);
        sb.append(", width=");
        sb.append(i2);
        sb.append(", height=");
        sb.append(i3);
        sb.append(", decodedResourceClass=");
        sb.append(valueOf3);
        sb.append(", transformation='");
        sb.append(valueOf4);
        sb.append("', options=");
        sb.append(valueOf5);
        sb.append('}');
        return sb.toString();
    }

    public final void a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.c.a(byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f).putInt(this.g).array();
        this.e.a(messageDigest);
        this.d.a(messageDigest);
        messageDigest.update(bArr);
        ub ubVar = this.j;
        if (ubVar != null) {
            ubVar.a(messageDigest);
        }
        this.i.a(messageDigest);
        byte[] bArr2 = (byte[]) b.b(this.h);
        if (bArr2 == null) {
            bArr2 = this.h.getName().getBytes(a);
            b.b(this.h, bArr2);
        }
        messageDigest.update(bArr2);
        this.c.a(bArr);
    }
}
