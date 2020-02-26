package p000;

import java.security.MessageDigest;
import java.util.Map;

/* renamed from: wm */
/* compiled from: PG */
public final class C0609wm implements C0534ts {

    /* renamed from: b */
    private final Object f10704b;

    /* renamed from: c */
    private final int f10705c;

    /* renamed from: d */
    private final int f10706d;

    /* renamed from: e */
    private final Class f10707e;

    /* renamed from: f */
    private final Class f10708f;

    /* renamed from: g */
    private final C0534ts f10709g;

    /* renamed from: h */
    private final Map f10710h;

    /* renamed from: i */
    private final C0539tx f10711i;

    /* renamed from: j */
    private int f10712j;

    public C0609wm(Object obj, C0534ts tsVar, int i, int i2, Map map, Class cls, Class cls2, C0539tx txVar) {
        this.f10704b = aic.m542a(obj);
        this.f10709g = (C0534ts) aic.m543a(tsVar, "Signature must not be null");
        this.f10705c = i;
        this.f10706d = i2;
        this.f10710h = (Map) aic.m542a(map);
        this.f10707e = (Class) aic.m543a(cls, "Resource class must not be null");
        this.f10708f = (Class) aic.m543a(cls2, "Transcode class must not be null");
        this.f10711i = (C0539tx) aic.m542a(txVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0609wm) {
            C0609wm wmVar = (C0609wm) obj;
            if (!this.f10704b.equals(wmVar.f10704b) || !this.f10709g.equals(wmVar.f10709g) || this.f10706d != wmVar.f10706d || this.f10705c != wmVar.f10705c || !this.f10710h.equals(wmVar.f10710h) || !this.f10707e.equals(wmVar.f10707e) || !this.f10708f.equals(wmVar.f10708f) || !this.f10711i.equals(wmVar.f10711i)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f10712j;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f10704b.hashCode();
        this.f10712j = hashCode;
        int hashCode2 = (((((hashCode * 31) + this.f10709g.hashCode()) * 31) + this.f10705c) * 31) + this.f10706d;
        this.f10712j = hashCode2;
        int hashCode3 = (hashCode2 * 31) + this.f10710h.hashCode();
        this.f10712j = hashCode3;
        int hashCode4 = (hashCode3 * 31) + this.f10707e.hashCode();
        this.f10712j = hashCode4;
        int hashCode5 = (hashCode4 * 31) + this.f10708f.hashCode();
        this.f10712j = hashCode5;
        int hashCode6 = (hashCode5 * 31) + this.f10711i.hashCode();
        this.f10712j = hashCode6;
        return hashCode6;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f10704b);
        int i = this.f10705c;
        int i2 = this.f10706d;
        String valueOf2 = String.valueOf(this.f10707e);
        String valueOf3 = String.valueOf(this.f10708f);
        String valueOf4 = String.valueOf(this.f10709g);
        int i3 = this.f10712j;
        String valueOf5 = String.valueOf(this.f10710h);
        String valueOf6 = String.valueOf(this.f10711i);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 151 + length2 + length3 + length4 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("EngineKey{model=");
        sb.append(valueOf);
        sb.append(", width=");
        sb.append(i);
        sb.append(", height=");
        sb.append(i2);
        sb.append(", resourceClass=");
        sb.append(valueOf2);
        sb.append(", transcodeClass=");
        sb.append(valueOf3);
        sb.append(", signature=");
        sb.append(valueOf4);
        sb.append(", hashCode=");
        sb.append(i3);
        sb.append(", transformations=");
        sb.append(valueOf5);
        sb.append(", options=");
        sb.append(valueOf6);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo37a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
