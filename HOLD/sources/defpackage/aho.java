package defpackage;

import java.security.MessageDigest;

/* renamed from: aho  reason: default package */
/* compiled from: PG */
public final class aho implements ts {
    private final Object b;

    public aho(Object obj) {
        this.b = aic.a(obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aho) {
            return this.b.equals(((aho) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("ObjectKey{object=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(a));
    }
}
