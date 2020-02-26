package p000;

import java.security.MessageDigest;

/* renamed from: vi */
/* compiled from: PG */
final class C0578vi implements C0534ts {

    /* renamed from: b */
    private final C0534ts f10584b;

    /* renamed from: c */
    private final C0534ts f10585c;

    public C0578vi(C0534ts tsVar, C0534ts tsVar2) {
        this.f10584b = tsVar;
        this.f10585c = tsVar2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0578vi) {
            C0578vi viVar = (C0578vi) obj;
            if (!this.f10584b.equals(viVar.f10584b) || !this.f10585c.equals(viVar.f10585c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f10584b.hashCode() * 31) + this.f10585c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f10584b);
        String valueOf2 = String.valueOf(this.f10585c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36 + String.valueOf(valueOf2).length());
        sb.append("DataCacheKey{sourceKey=");
        sb.append(valueOf);
        sb.append(", signature=");
        sb.append(valueOf2);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo37a(MessageDigest messageDigest) {
        this.f10584b.mo37a(messageDigest);
        this.f10585c.mo37a(messageDigest);
    }
}
