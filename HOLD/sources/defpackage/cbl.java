package defpackage;

/* renamed from: cbl  reason: default package */
/* compiled from: PG */
public final class cbl implements cbs, dgu {
    public static final cbl a = new cbl();

    private cbl() {
    }

    public final void a(Throwable th) {
        bog.b("PrimesExecutors", "Background task failed", th, new Object[0]);
    }
}
