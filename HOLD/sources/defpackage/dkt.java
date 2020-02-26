package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: dkt  reason: default package */
/* compiled from: PG */
final class dkt {
    public static final dkt a = new dkt();
    private final dkx b = new dkb();
    private final ConcurrentMap c = new ConcurrentHashMap();

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
    public final dkw a(Class cls) {
        djl.a((Object) cls, "messageType");
        dkw dkw = (dkw) this.c.get(cls);
        if (dkw == null) {
            dkx dkx = this.b;
            dky.a(cls);
            dkh b2 = ((dkb) dkx).a.b(cls);
            if (b2.a()) {
                if (dje.class.isAssignableFrom(cls)) {
                    dkw = dkn.a(dky.c, dit.a, b2.b());
                } else {
                    dkw = dkn.a(dky.a, dit.a(), b2.b());
                }
            } else if (dje.class.isAssignableFrom(cls)) {
                if (dkb.a(b2)) {
                    dkw = dkm.a(b2, dkr.b, djx.b, dky.c, dit.a, dkg.b);
                } else {
                    dkw = dkm.a(b2, dkr.b, djx.b, dky.c, (dkc) null, dkg.b);
                }
            } else if (dkb.a(b2)) {
                dkw = dkm.a(b2, dkr.a, djx.a, dky.a, dit.a(), dkg.a);
            } else {
                dkw = dkm.a(b2, dkr.a, djx.a, dky.b, (dkc) null, dkg.a);
            }
            djl.a((Object) cls, "messageType");
            djl.a((Object) dkw, "schema");
            dkw dkw2 = (dkw) this.c.putIfAbsent(cls, dkw);
            return dkw2 == null ? dkw : dkw2;
        }
    }

    public final dkw a(Object obj) {
        return a((Class) obj.getClass());
    }
}
