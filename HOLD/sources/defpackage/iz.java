package defpackage;

/* renamed from: iz  reason: default package */
/* compiled from: PG */
final class iz implements Runnable {
    private final /* synthetic */ ja a;

    public iz(ja jaVar) {
        this.a = jaVar;
    }

    public final void run() {
        ie ieVar = this.a.a;
        if (ieVar != null && dx.o(ieVar) && this.a.a.getCount() > this.a.a.getChildCount()) {
            int childCount = this.a.a.getChildCount();
            ja jaVar = this.a;
            if (childCount <= jaVar.h) {
                jaVar.n.setInputMethodMode(2);
                this.a.c();
            }
        }
    }
}
