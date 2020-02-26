package p000;

import java.security.MessageDigest;

/* renamed from: tx */
/* compiled from: PG */
public final class C0539tx implements C0534ts {

    /* renamed from: b */
    private final C0067cl f10528b = new ahs();

    public final boolean equals(Object obj) {
        if (obj instanceof C0539tx) {
            return this.f10528b.equals(((C0539tx) obj).f10528b);
        }
        return false;
    }

    /* renamed from: a */
    public final Object mo5987a(C0538tw twVar) {
        return this.f10528b.containsKey(twVar) ? this.f10528b.get(twVar) : twVar.f10524b;
    }

    public final int hashCode() {
        return this.f10528b.hashCode();
    }

    /* renamed from: a */
    public final void mo5989a(C0539tx txVar) {
        C0067cl clVar = this.f10528b;
        C0067cl clVar2 = txVar.f10528b;
        ((ahs) clVar).f380d = 0;
        int i = clVar2.f8324c;
        clVar.mo4136a(clVar.f8324c + i);
        if (clVar.f8324c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                clVar.put(clVar2.mo4138b(i2), clVar2.mo4139c(i2));
            }
        } else if (i > 0) {
            System.arraycopy(clVar2.f8322a, 0, clVar.f8322a, 0, i);
            System.arraycopy(clVar2.f8323b, 0, clVar.f8323b, 0, i + i);
            clVar.f8324c = i;
        }
    }

    /* renamed from: a */
    public final void mo5988a(C0538tw twVar, Object obj) {
        this.f10528b.put(twVar, obj);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f10528b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
        sb.append("Options{values=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo37a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            C0067cl clVar = this.f10528b;
            if (i < clVar.f8324c) {
                C0538tw twVar = (C0538tw) clVar.mo4138b(i);
                Object c = this.f10528b.mo4139c(i);
                C0537tv tvVar = twVar.f10525c;
                if (twVar.f10527e == null) {
                    twVar.f10527e = twVar.f10526d.getBytes(C0534ts.f10521a);
                }
                tvVar.mo83a(twVar.f10527e, c, messageDigest);
                i++;
            } else {
                return;
            }
        }
    }
}
