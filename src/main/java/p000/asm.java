package p000;

import java.util.List;

/* renamed from: asm */
/* compiled from: PG */
public final class asm {

    /* renamed from: a */
    private final List f2259a;

    /* renamed from: b */
    private final aov[] f2260b;

    public asm(List list) {
        this.f2259a = list;
        this.f2260b = new aov[list.size()];
    }

    /* renamed from: a */
    public final void mo1305a(long j, bky bky) {
        buk.m4255a(j, bky, this.f2260b);
    }

    /* renamed from: a */
    public final void mo1306a(aok aok, asw asw) {
        for (int i = 0; i < this.f2260b.length; i++) {
            asw.mo1308a();
            aov a = aok.mo1211a(asw.mo1309b(), 3);
            akh akh = (akh) this.f2259a.get(i);
            String str = akh.f556i;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            String valueOf = String.valueOf(str);
            bks.m3511a(z, valueOf.length() == 0 ? new String("Invalid closed caption mime type provided: ") : "Invalid closed caption mime type provided: ".concat(valueOf));
            String str2 = akh.f548a;
            if (str2 == null) {
                str2 = asw.mo1310c();
            }
            a.mo1204a(akh.m732a(str2, str, akh.f550c, akh.f544A, akh.f545B, (anq) null, Long.MAX_VALUE, akh.f558k));
            this.f2260b[i] = a;
        }
    }
}
