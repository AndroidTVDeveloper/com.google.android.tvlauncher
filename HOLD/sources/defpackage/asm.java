package defpackage;

import java.util.List;

/* renamed from: asm  reason: default package */
/* compiled from: PG */
public final class asm {
    private final List a;
    private final aov[] b;

    public asm(List list) {
        this.a = list;
        this.b = new aov[list.size()];
    }

    public final void a(long j, bky bky) {
        buk.a(j, bky, this.b);
    }

    public final void a(aok aok, asw asw) {
        for (int i = 0; i < this.b.length; i++) {
            asw.a();
            aov a2 = aok.a(asw.b(), 3);
            akh akh = (akh) this.a.get(i);
            String str = akh.i;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            String valueOf = String.valueOf(str);
            bks.a(z, valueOf.length() == 0 ? new String("Invalid closed caption mime type provided: ") : "Invalid closed caption mime type provided: ".concat(valueOf));
            String str2 = akh.a;
            if (str2 == null) {
                str2 = asw.c();
            }
            a2.a(akh.a(str2, str, akh.c, akh.A, akh.B, (anq) null, Long.MAX_VALUE, akh.k));
            this.b[i] = a2;
        }
    }
}
