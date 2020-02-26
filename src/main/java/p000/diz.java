package p000;

/* renamed from: diz */
/* compiled from: PG */
final class diz implements dki {

    /* renamed from: a */
    public static final diz f8668a = new diz();

    private diz() {
    }

    /* renamed from: a */
    public final boolean mo4491a(Class cls) {
        return dje.class.isAssignableFrom(cls);
    }

    /* renamed from: b */
    public final dkh mo4492b(Class cls) {
        if (!dje.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unsupported message type: ") : "Unsupported message type: ".concat(valueOf));
        }
        try {
            Class asSubclass = cls.asSubclass(dje.class);
            dje dje = (dje) dje.f8676B.get(asSubclass);
            if (dje == null) {
                Class.forName(asSubclass.getName(), true, asSubclass.getClassLoader());
                dje = (dje) dje.f8676B.get(asSubclass);
            }
            if (dje == null) {
                dje = (dje) ((dje) dlv.m7025a(asSubclass)).mo4513b(6);
                if (dje != null) {
                    dje.f8676B.put(asSubclass, dje);
                } else {
                    throw new IllegalStateException();
                }
            }
            return (dkh) dje.mo4513b(3);
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Class initialization cannot fail.", e);
        } catch (Exception e2) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() == 0 ? new String("Unable to get message info for ") : "Unable to get message info for ".concat(valueOf2), e2);
        }
    }
}
