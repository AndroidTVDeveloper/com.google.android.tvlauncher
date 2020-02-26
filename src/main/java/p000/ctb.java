package p000;

import java.util.List;

/* renamed from: ctb */
/* compiled from: PG */
public final class ctb {

    /* renamed from: a */
    public final String f7331a;

    /* renamed from: b */
    public final String f7332b;

    /* renamed from: c */
    public final List f7333c;

    public /* synthetic */ ctb(String str, String str2, List list) {
        this.f7331a = str;
        this.f7332b = str2;
        this.f7333c = list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ctb) {
            ctb ctb = (ctb) obj;
            if (!this.f7331a.equals(ctb.f7331a) || !this.f7332b.equals(ctb.f7332b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f7331a.hashCode() * 31) + this.f7332b.hashCode();
    }
}
