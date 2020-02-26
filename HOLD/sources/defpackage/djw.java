package defpackage;

/* renamed from: djw  reason: default package */
/* compiled from: PG */
final class djw extends djx {
    private djw() {
    }

    public /* synthetic */ djw(byte b) {
    }

    private static djk b(Object obj, long j) {
        return (djk) dlv.f(obj, j);
    }

    public final void a(Object obj, long j) {
        b(obj, j).b();
    }

    public final void a(Object obj, Object obj2, long j) {
        djk b = b(obj, j);
        djk b2 = b(obj2, j);
        int size = b.size();
        int size2 = b2.size();
        if (size > 0 && size2 > 0) {
            if (!b.a()) {
                b = b.a(size2 + size);
            }
            b.addAll(b2);
        }
        if (size > 0) {
            b2 = b;
        }
        dlv.a(obj, j, b2);
    }
}
