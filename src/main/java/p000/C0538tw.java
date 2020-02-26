package p000;

/* renamed from: tw */
/* compiled from: PG */
public final class C0538tw {

    /* renamed from: a */
    public static final C0537tv f10523a = new C0536tu();

    /* renamed from: b */
    public final Object f10524b;

    /* renamed from: c */
    public final C0537tv f10525c;

    /* renamed from: d */
    public final String f10526d;

    /* renamed from: e */
    public volatile byte[] f10527e;

    public C0538tw(String str, Object obj, C0537tv tvVar) {
        this.f10526d = aic.m544a(str);
        this.f10524b = obj;
        this.f10525c = (C0537tv) aic.m542a(tvVar);
    }

    /* renamed from: a */
    public static C0538tw m8391a(String str, Object obj, C0537tv tvVar) {
        return new C0538tw(str, obj, tvVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0538tw) {
            return this.f10526d.equals(((C0538tw) obj).f10526d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10526d.hashCode();
    }

    /* renamed from: a */
    public static C0538tw m8390a(String str, Object obj) {
        return new C0538tw(str, obj, f10523a);
    }

    public final String toString() {
        String str = this.f10526d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 14);
        sb.append("Option{key='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }
}
