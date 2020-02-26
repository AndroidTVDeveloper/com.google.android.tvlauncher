package p000;

/* renamed from: djw */
/* compiled from: PG */
final class djw extends djx {
    private djw() {
    }

    public /* synthetic */ djw(byte b) {
    }

    /* renamed from: b */
    private static djk m6753b(Object obj, long j) {
        return (djk) dlv.m7045f(obj, j);
    }

    /* renamed from: a */
    public final void mo4547a(Object obj, long j) {
        m6753b(obj, j).mo4379b();
    }

    /* renamed from: a */
    public final void mo4548a(Object obj, Object obj2, long j) {
        djk b = m6753b(obj, j);
        djk b2 = m6753b(obj2, j);
        int size = b.size();
        int size2 = b2.size();
        if (size > 0 && size2 > 0) {
            if (!b.mo4374a()) {
                b = b.mo4398a(size2 + size);
            }
            b.addAll(b2);
        }
        if (size > 0) {
            b2 = b;
        }
        dlv.m7033a(obj, j, b2);
    }
}
