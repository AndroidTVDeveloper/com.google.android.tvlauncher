package p000;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: wy */
/* compiled from: PG */
final class C0621wy implements C0534ts {

    /* renamed from: b */
    private static final ahz f10746b = new ahz(50);

    /* renamed from: c */
    private final C0628xe f10747c;

    /* renamed from: d */
    private final C0534ts f10748d;

    /* renamed from: e */
    private final C0534ts f10749e;

    /* renamed from: f */
    private final int f10750f;

    /* renamed from: g */
    private final int f10751g;

    /* renamed from: h */
    private final Class f10752h;

    /* renamed from: i */
    private final C0539tx f10753i;

    /* renamed from: j */
    private final C0544ub f10754j;

    public C0621wy(C0628xe xeVar, C0534ts tsVar, C0534ts tsVar2, int i, int i2, C0544ub ubVar, Class cls, C0539tx txVar) {
        this.f10747c = xeVar;
        this.f10748d = tsVar;
        this.f10749e = tsVar2;
        this.f10750f = i;
        this.f10751g = i2;
        this.f10754j = ubVar;
        this.f10752h = cls;
        this.f10753i = txVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0621wy) {
            C0621wy wyVar = (C0621wy) obj;
            if (this.f10751g != wyVar.f10751g || this.f10750f != wyVar.f10750f || !aie.m561a(this.f10754j, wyVar.f10754j) || !this.f10752h.equals(wyVar.f10752h) || !this.f10748d.equals(wyVar.f10748d) || !this.f10749e.equals(wyVar.f10749e) || !this.f10753i.equals(wyVar.f10753i)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.f10748d.hashCode() * 31) + this.f10749e.hashCode()) * 31) + this.f10750f) * 31) + this.f10751g;
        C0544ub ubVar = this.f10754j;
        if (ubVar != null) {
            hashCode = (hashCode * 31) + ubVar.hashCode();
        }
        return (((hashCode * 31) + this.f10752h.hashCode()) * 31) + this.f10753i.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f10748d);
        String valueOf2 = String.valueOf(this.f10749e);
        int i = this.f10750f;
        int i2 = this.f10751g;
        String valueOf3 = String.valueOf(this.f10752h);
        String valueOf4 = String.valueOf(this.f10754j);
        String valueOf5 = String.valueOf(this.f10753i);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 131 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("ResourceCacheKey{sourceKey=");
        sb.append(valueOf);
        sb.append(", signature=");
        sb.append(valueOf2);
        sb.append(", width=");
        sb.append(i);
        sb.append(", height=");
        sb.append(i2);
        sb.append(", decodedResourceClass=");
        sb.append(valueOf3);
        sb.append(", transformation='");
        sb.append(valueOf4);
        sb.append("', options=");
        sb.append(valueOf5);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo37a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f10747c.mo6099a(byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f10750f).putInt(this.f10751g).array();
        this.f10749e.mo37a(messageDigest);
        this.f10748d.mo37a(messageDigest);
        messageDigest.update(bArr);
        C0544ub ubVar = this.f10754j;
        if (ubVar != null) {
            ubVar.mo37a(messageDigest);
        }
        this.f10753i.mo37a(messageDigest);
        byte[] bArr2 = (byte[]) f10746b.mo296b(this.f10752h);
        if (bArr2 == null) {
            bArr2 = this.f10752h.getName().getBytes(f10521a);
            f10746b.mo297b(this.f10752h, bArr2);
        }
        messageDigest.update(bArr2);
        this.f10747c.mo6102a(bArr);
    }
}
