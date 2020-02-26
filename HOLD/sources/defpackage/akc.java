package defpackage;

/* renamed from: akc  reason: default package */
/* compiled from: PG */
final class akc {
    public akp a;
    public int b;
    public boolean c;
    public int d;

    private akc() {
    }

    public /* synthetic */ akc(byte b2) {
    }

    public final void a(int i) {
        this.b += i;
    }

    public final void b(int i) {
        boolean z = true;
        if (!this.c || this.d == 4) {
            this.c = true;
            this.d = i;
            return;
        }
        if (i != 4) {
            z = false;
        }
        bks.a(z);
    }
}
