package p000;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: dkt */
/* compiled from: PG */
final class dkt {

    /* renamed from: a */
    public static final dkt f8733a = new dkt();

    /* renamed from: b */
    private final dkx f8734b = new dkb();

    /* renamed from: c */
    private final ConcurrentMap f8735c = new ConcurrentHashMap();

    private dkt() {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: djl.a(java.lang.Object, java.lang.String):java.lang.Object
     arg types: [java.lang.Class, java.lang.String]
     candidates:
      djl.a(java.lang.Object, java.lang.Object):java.lang.Object
      djl.a(java.lang.Object, java.lang.String):java.lang.Object */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: djl.a(java.lang.Object, java.lang.String):java.lang.Object
     arg types: [dkw, java.lang.String]
     candidates:
      djl.a(java.lang.Object, java.lang.Object):java.lang.Object
      djl.a(java.lang.Object, java.lang.String):java.lang.Object */
    /* renamed from: a */
    public final dkw mo4586a(Class cls) {
        djl.m6725a((Object) cls, "messageType");
        dkw dkw = (dkw) this.f8735c.get(cls);
        if (dkw == null) {
            dkx dkx = this.f8734b;
            dky.m6903a(cls);
            dkh b = ((dkb) dkx).f8708a.mo4492b(cls);
            if (b.mo4571a()) {
                if (dje.class.isAssignableFrom(cls)) {
                    dkw = dkn.m6862a(dky.f8745c, dit.f8604a, b.mo4572b());
                } else {
                    dkw = dkn.m6862a(dky.f8743a, dit.m6619a(), b.mo4572b());
                }
            } else if (dje.class.isAssignableFrom(cls)) {
                if (dkb.m6769a(b)) {
                    dkw = dkm.m6815a(b, dkr.f8732b, djx.f8702b, dky.f8745c, dit.f8604a, dkg.f8712b);
                } else {
                    dkw = dkm.m6815a(b, dkr.f8732b, djx.f8702b, dky.f8745c, (dkc) null, dkg.f8712b);
                }
            } else if (dkb.m6769a(b)) {
                dkw = dkm.m6815a(b, dkr.f8731a, djx.f8701a, dky.f8743a, dit.m6619a(), dkg.f8711a);
            } else {
                dkw = dkm.m6815a(b, dkr.f8731a, djx.f8701a, dky.f8744b, (dkc) null, dkg.f8711a);
            }
            djl.m6725a((Object) cls, "messageType");
            djl.m6725a((Object) dkw, "schema");
            dkw dkw2 = (dkw) this.f8735c.putIfAbsent(cls, dkw);
            return dkw2 == null ? dkw : dkw2;
        }
    }

    /* renamed from: a */
    public final dkw mo4587a(Object obj) {
        return mo4586a((Class) obj.getClass());
    }
}
