package p000;

/* renamed from: vc */
/* compiled from: PG */
final class C0572vc implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C0575vf f10569a;

    public C0572vc(C0575vf vfVar) {
        this.f10569a = vfVar;
    }

    public final void run() {
        C0575vf vfVar = this.f10569a;
        while (true) {
            boolean z = vfVar.f10572b;
            try {
                vfVar.mo6020a((C0574ve) vfVar.f10571a.remove());
                C0573vd vdVar = vfVar.f10573c;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
