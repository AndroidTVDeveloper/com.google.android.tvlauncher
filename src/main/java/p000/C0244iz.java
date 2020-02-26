package p000;

/* renamed from: iz */
/* compiled from: PG */
final class C0244iz implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C0246ja f9651a;

    public C0244iz(C0246ja jaVar) {
        this.f9651a = jaVar;
    }

    public final void run() {
        C0223ie ieVar = this.f9651a.f9661a;
        if (ieVar != null && C0107dx.m7218o(ieVar) && this.f9651a.f9661a.getCount() > this.f9651a.f9661a.getChildCount()) {
            int childCount = this.f9651a.f9661a.getChildCount();
            C0246ja jaVar = this.f9651a;
            if (childCount <= jaVar.f9668h) {
                jaVar.f9674n.setInputMethodMode(2);
                this.f9651a.mo4847c();
            }
        }
    }
}
