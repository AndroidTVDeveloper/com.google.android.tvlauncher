package p000;

/* renamed from: akc */
/* compiled from: PG */
final class akc {

    /* renamed from: a */
    public akp f503a;

    /* renamed from: b */
    public int f504b;

    /* renamed from: c */
    public boolean f505c;

    /* renamed from: d */
    public int f506d;

    private akc() {
    }

    public /* synthetic */ akc(byte b) {
    }

    /* renamed from: a */
    public final void mo408a(int i) {
        this.f504b += i;
    }

    /* renamed from: b */
    public final void mo409b(int i) {
        boolean z = true;
        if (!this.f505c || this.f506d == 4) {
            this.f505c = true;
            this.f506d = i;
            return;
        }
        if (i != 4) {
            z = false;
        }
        bks.m3510a(z);
    }
}
