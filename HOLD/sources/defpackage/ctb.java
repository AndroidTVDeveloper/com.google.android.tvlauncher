package defpackage;

import java.util.List;

/* renamed from: ctb  reason: default package */
/* compiled from: PG */
public final class ctb {
    public final String a;
    public final String b;
    public final List c;

    public /* synthetic */ ctb(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ctb) {
            ctb ctb = (ctb) obj;
            if (!this.a.equals(ctb.a) || !this.b.equals(ctb.b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
