package defpackage;

import java.io.File;

/* renamed from: bjt  reason: default package */
/* compiled from: PG */
final class bjt implements bju {
    public final bke a;
    public boolean b;
    public bla c;

    public bjt(File file) {
        bks.a(true);
        this.a = new bke(file);
    }

    public static final int a(bjs bjs, int i) {
        int hashCode = (bjs.a * 31) + bjs.b.hashCode();
        if (i >= 2) {
            return (hashCode * 31) + bjs.d.hashCode();
        }
        long a2 = cbp.a(bjs.d);
        return (hashCode * 31) + ((int) (a2 ^ (a2 >>> 32)));
    }

    public final void a() {
        this.b = true;
    }
}
