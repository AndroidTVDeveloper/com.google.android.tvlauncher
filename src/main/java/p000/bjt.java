package p000;

import java.io.File;

/* renamed from: bjt */
/* compiled from: PG */
final class bjt implements bju {

    /* renamed from: a */
    public final bke f4171a;

    /* renamed from: b */
    public boolean f4172b;

    /* renamed from: c */
    public bla f4173c;

    public bjt(File file) {
        bks.m3510a(true);
        this.f4171a = new bke(file);
    }

    /* renamed from: a */
    public static final int m3439a(bjs bjs, int i) {
        int hashCode = (bjs.f4166a * 31) + bjs.f4167b.hashCode();
        if (i >= 2) {
            return (hashCode * 31) + bjs.f4169d.hashCode();
        }
        long a = cbp.m4508a(bjs.f4169d);
        return (hashCode * 31) + ((int) (a ^ (a >>> 32)));
    }

    /* renamed from: a */
    public final void mo2011a() {
        this.f4172b = true;
    }
}
