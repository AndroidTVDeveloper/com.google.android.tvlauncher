package p000;

import java.net.URL;
import java.security.MessageDigest;

/* renamed from: zv */
/* compiled from: PG */
public final class C0699zv implements C0534ts {

    /* renamed from: b */
    public final C0700zw f10861b;

    /* renamed from: c */
    public final URL f10862c;

    /* renamed from: d */
    public final String f10863d;

    /* renamed from: e */
    public String f10864e;

    /* renamed from: f */
    public URL f10865f;

    /* renamed from: g */
    private volatile byte[] f10866g;

    /* renamed from: h */
    private int f10867h;

    public C0699zv(String str) {
        C0700zw zwVar = C0700zw.f10868a;
        this.f10862c = null;
        this.f10863d = aic.m544a(str);
        this.f10861b = (C0700zw) aic.m542a(zwVar);
    }

    public C0699zv(URL url) {
        C0700zw zwVar = C0700zw.f10868a;
        this.f10862c = (URL) aic.m542a(url);
        this.f10863d = null;
        this.f10861b = (C0700zw) aic.m542a(zwVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0699zv) {
            C0699zv zvVar = (C0699zv) obj;
            if (!m8744a().equals(zvVar.m8744a()) || !this.f10861b.equals(zvVar.f10861b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final String m8744a() {
        String str = this.f10863d;
        return str == null ? ((URL) aic.m542a(this.f10862c)).toString() : str;
    }

    public final int hashCode() {
        int i = this.f10867h;
        if (i != 0) {
            return i;
        }
        int hashCode = m8744a().hashCode();
        this.f10867h = hashCode;
        int hashCode2 = (hashCode * 31) + this.f10861b.hashCode();
        this.f10867h = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        return m8744a();
    }

    /* renamed from: a */
    public final void mo37a(MessageDigest messageDigest) {
        if (this.f10866g == null) {
            this.f10866g = m8744a().getBytes(f10521a);
        }
        messageDigest.update(this.f10866g);
    }
}
