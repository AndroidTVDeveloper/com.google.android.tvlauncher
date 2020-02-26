package defpackage;

/* renamed from: anl  reason: default package */
/* compiled from: PG */
final class anl extends Thread {
    private final /* synthetic */ anm a;

    public anl(anm anm) {
        this.a = anm;
    }

    public final void run() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (this.a.f());
    }
}
