package defpackage;

/* renamed from: lk  reason: default package */
/* compiled from: PG */
public final class lk {
    private static final cz d = new da(20);
    public int a;
    public jt b;
    public jt c;

    private lk() {
    }

    public static void b() {
        do {
        } while (d.a() != null);
    }

    public static lk a() {
        lk lkVar = (lk) d.a();
        return lkVar == null ? new lk() : lkVar;
    }

    public static void a(lk lkVar) {
        lkVar.a = 0;
        lkVar.b = null;
        lkVar.c = null;
        d.a(lkVar);
    }
}
