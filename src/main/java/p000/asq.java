package p000;

/* renamed from: asq */
/* compiled from: PG */
final class asq implements ask {

    /* renamed from: a */
    private final bkx f2275a = new bkx(new byte[4]);

    /* renamed from: b */
    private final /* synthetic */ ass f2276b;

    public asq(ass ass) {
        this.f2276b = ass;
    }

    /* renamed from: a */
    public final void mo1304a(blj blj, aok aok, asw asw) {
    }

    /* renamed from: a */
    public final void mo1303a(bky bky) {
        if (bky.mo2074d() == 0) {
            bky.mo2075d(7);
            int b = bky.mo2070b() / 4;
            for (int i = 0; i < b; i++) {
                bky.mo2066a(this.f2275a, 4);
                int c = this.f2275a.mo2057c(16);
                this.f2275a.mo2054b(3);
                if (c == 0) {
                    this.f2275a.mo2054b(13);
                } else {
                    int c2 = this.f2275a.mo2057c(13);
                    ass ass = this.f2276b;
                    ass.f2285d.put(c2, new asl(new asr(ass, c2)));
                    this.f2276b.f2289h++;
                }
            }
            ass ass2 = this.f2276b;
            if (ass2.f2282a != 2) {
                ass2.f2285d.remove(0);
            }
        }
    }
}
