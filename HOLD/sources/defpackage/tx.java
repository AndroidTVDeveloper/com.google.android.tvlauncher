package defpackage;

import java.security.MessageDigest;

/* renamed from: tx  reason: default package */
/* compiled from: PG */
public final class tx implements ts {
    private final cl b = new ahs();

    public final boolean equals(Object obj) {
        if (obj instanceof tx) {
            return this.b.equals(((tx) obj).b);
        }
        return false;
    }

    public final Object a(tw twVar) {
        return this.b.containsKey(twVar) ? this.b.get(twVar) : twVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final void a(tx txVar) {
        cl clVar = this.b;
        cl clVar2 = txVar.b;
        ((ahs) clVar).d = 0;
        int i = clVar2.c;
        clVar.a(clVar.c + i);
        if (clVar.c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                clVar.put(clVar2.b(i2), clVar2.c(i2));
            }
        } else if (i > 0) {
            System.arraycopy(clVar2.a, 0, clVar.a, 0, i);
            System.arraycopy(clVar2.b, 0, clVar.b, 0, i + i);
            clVar.c = i;
        }
    }

    public final void a(tw twVar, Object obj) {
        this.b.put(twVar, obj);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
        sb.append("Options{values=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }

    public final void a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            cl clVar = this.b;
            if (i < clVar.c) {
                tw twVar = (tw) clVar.b(i);
                Object c = this.b.c(i);
                tv tvVar = twVar.c;
                if (twVar.e == null) {
                    twVar.e = twVar.d.getBytes(ts.a);
                }
                tvVar.a(twVar.e, c, messageDigest);
                i++;
            } else {
                return;
            }
        }
    }
}
