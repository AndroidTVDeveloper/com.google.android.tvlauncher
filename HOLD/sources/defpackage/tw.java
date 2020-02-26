package defpackage;

/* renamed from: tw  reason: default package */
/* compiled from: PG */
public final class tw {
    public static final tv a = new tu();
    public final Object b;
    public final tv c;
    public final String d;
    public volatile byte[] e;

    public tw(String str, Object obj, tv tvVar) {
        this.d = aic.a(str);
        this.b = obj;
        this.c = (tv) aic.a(tvVar);
    }

    public static tw a(String str, Object obj, tv tvVar) {
        return new tw(str, obj, tvVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tw) {
            return this.d.equals(((tw) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public static tw a(String str, Object obj) {
        return new tw(str, obj, a);
    }

    public final String toString() {
        String str = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 14);
        sb.append("Option{key='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }
}
