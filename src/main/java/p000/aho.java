package p000;

import java.security.MessageDigest;

/* renamed from: aho */
/* compiled from: PG */
public final class aho implements C0534ts {

    /* renamed from: b */
    private final Object f373b;

    public aho(Object obj) {
        this.f373b = aic.m542a(obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aho) {
            return this.f373b.equals(((aho) obj).f373b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f373b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f373b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("ObjectKey{object=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo37a(MessageDigest messageDigest) {
        messageDigest.update(this.f373b.toString().getBytes(f10521a));
    }
}
