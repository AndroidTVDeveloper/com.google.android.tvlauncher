package defpackage;

import android.util.Log;

/* renamed from: asb  reason: default package */
/* compiled from: PG */
public final class asb implements art {
    private final bky a = new bky(10);
    private aov b;
    private boolean c;
    private long d;
    private int e;
    private int f;

    public final void a(bky bky) {
        if (this.c) {
            int b2 = bky.b();
            int i = this.f;
            if (i < 10) {
                int min = Math.min(b2, 10 - i);
                System.arraycopy(bky.a, bky.b, this.a.a, this.f, min);
                if (this.f + min == 10) {
                    this.a.c(0);
                    if (this.a.d() == 73 && this.a.d() == 68 && this.a.d() == 51) {
                        this.a.d(3);
                        this.e = this.a.m() + 10;
                    } else {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(b2, this.e - this.f);
            this.b.a(bky, min2);
            this.f += min2;
        }
    }

    public final void a(aok aok, asw asw) {
        asw.a();
        aov a2 = aok.a(asw.b(), 4);
        this.b = a2;
        a2.a(akh.a(asw.c(), "application/id3"));
    }

    public final void b() {
        int i;
        if (this.c && (i = this.e) != 0 && this.f == i) {
            this.b.a(this.d, 1, i, 0, null);
            this.c = false;
        }
    }

    public final void a(long j, int i) {
        if ((i & 4) != 0) {
            this.c = true;
            this.d = j;
            this.e = 0;
            this.f = 0;
        }
    }

    public final void a() {
        this.c = false;
    }
}
