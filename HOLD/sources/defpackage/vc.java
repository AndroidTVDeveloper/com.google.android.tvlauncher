package defpackage;

/* renamed from: vc  reason: default package */
/* compiled from: PG */
final class vc implements Runnable {
    private final /* synthetic */ vf a;

    public vc(vf vfVar) {
        this.a = vfVar;
    }

    public final void run() {
        vf vfVar = this.a;
        while (true) {
            boolean z = vfVar.b;
            try {
                vfVar.a((ve) vfVar.a.remove());
                vd vdVar = vfVar.c;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
