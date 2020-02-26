package defpackage;

/* renamed from: asq  reason: default package */
/* compiled from: PG */
final class asq implements ask {
    private final bkx a = new bkx(new byte[4]);
    private final /* synthetic */ ass b;

    public asq(ass ass) {
        this.b = ass;
    }

    public final void a(blj blj, aok aok, asw asw) {
    }

    public final void a(bky bky) {
        if (bky.d() == 0) {
            bky.d(7);
            int b2 = bky.b() / 4;
            for (int i = 0; i < b2; i++) {
                bky.a(this.a, 4);
                int c = this.a.c(16);
                this.a.b(3);
                if (c == 0) {
                    this.a.b(13);
                } else {
                    int c2 = this.a.c(13);
                    ass ass = this.b;
                    ass.d.put(c2, new asl(new asr(ass, c2)));
                    this.b.h++;
                }
            }
            ass ass2 = this.b;
            if (ass2.a != 2) {
                ass2.d.remove(0);
            }
        }
    }
}
