package defpackage;

/* renamed from: diz  reason: default package */
/* compiled from: PG */
final class diz implements dki {
    public static final diz a = new diz();

    private diz() {
    }

    public final boolean a(Class cls) {
        return dje.class.isAssignableFrom(cls);
    }

    public final dkh b(Class cls) {
        if (!dje.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unsupported message type: ") : "Unsupported message type: ".concat(valueOf));
        }
        try {
            Class asSubclass = cls.asSubclass(dje.class);
            dje dje = (dje) dje.B.get(asSubclass);
            if (dje == null) {
                Class.forName(asSubclass.getName(), true, asSubclass.getClassLoader());
                dje = (dje) dje.B.get(asSubclass);
            }
            if (dje == null) {
                dje = (dje) ((dje) dlv.a(asSubclass)).b(6);
                if (dje != null) {
                    dje.B.put(asSubclass, dje);
                } else {
                    throw new IllegalStateException();
                }
            }
            return (dkh) dje.b(3);
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Class initialization cannot fail.", e);
        } catch (Exception e2) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() == 0 ? new String("Unable to get message info for ") : "Unable to get message info for ".concat(valueOf2), e2);
        }
    }
}
