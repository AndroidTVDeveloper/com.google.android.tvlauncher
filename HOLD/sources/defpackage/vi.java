package defpackage;

import java.security.MessageDigest;

/* renamed from: vi  reason: default package */
/* compiled from: PG */
final class vi implements ts {
    private final ts b;
    private final ts c;

    public vi(ts tsVar, ts tsVar2) {
        this.b = tsVar;
        this.c = tsVar2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vi) {
            vi viVar = (vi) obj;
            if (!this.b.equals(viVar.b) || !this.c.equals(viVar.c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36 + String.valueOf(valueOf2).length());
        sb.append("DataCacheKey{sourceKey=");
        sb.append(valueOf);
        sb.append(", signature=");
        sb.append(valueOf2);
        sb.append('}');
        return sb.toString();
    }

    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.c.a(messageDigest);
    }
}
