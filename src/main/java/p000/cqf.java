package p000;

/* renamed from: cqf */
/* compiled from: PG */
final class cqf implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ cqp f6963a;

    public cqf(cqp cqp) {
        this.f6963a = cqp;
    }

    public final void run() {
        cqp cqp = this.f6963a;
        if (cqp.f7028t) {
            cla cla = cqp.f7011c;
            cld cld = cla.f5890r;
            if (cld != null) {
                int i = cld.f5896b;
                cld.mo3082d();
                if (i != cld.f5896b) {
                    cla.mo3072f();
                }
            }
            this.f6963a.mo3598e();
        }
        cqp cqp2 = this.f6963a;
        cqp2.f6982H.postDelayed(cqp2.f6983I, 600000);
    }
}
