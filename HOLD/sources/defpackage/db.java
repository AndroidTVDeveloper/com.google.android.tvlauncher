package defpackage;

/* renamed from: db  reason: default package */
/* compiled from: PG */
public final class db extends da {
    private final Object a = new Object();

    public db(int i) {
        super(i);
    }

    public final Object a() {
        Object a2;
        synchronized (this.a) {
            a2 = super.a();
        }
        return a2;
    }

    public final boolean a(Object obj) {
        boolean a2;
        synchronized (this.a) {
            a2 = super.a(obj);
        }
        return a2;
    }
}
