package p000;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: dho */
/* compiled from: PG */
final class dho extends dhl {

    /* renamed from: a */
    private final dhn f8535a = new dhn();

    /* renamed from: a */
    public final void mo4361a(Throwable th, Throwable th2) {
        if (th2 != th) {
            this.f8535a.mo4364a(th, true).add(th2);
            return;
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", th2);
    }

    /* renamed from: a */
    public final void mo4358a(Throwable th) {
        th.printStackTrace();
        List<Throwable> a = this.f8535a.mo4364a(th, false);
        if (a != null) {
            synchronized (a) {
                for (Throwable printStackTrace : a) {
                    System.err.print("Suppressed: ");
                    printStackTrace.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo4359a(Throwable th, PrintStream printStream) {
        ((C0613wq) th).mo6080a(printStream);
        List<Throwable> a = this.f8535a.mo4364a(th, false);
        if (a != null) {
            synchronized (a) {
                for (Throwable printStackTrace : a) {
                    printStream.print("Suppressed: ");
                    printStackTrace.printStackTrace(printStream);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo4360a(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
        List<Throwable> a = this.f8535a.mo4364a(th, false);
        if (a != null) {
            synchronized (a) {
                for (Throwable printStackTrace : a) {
                    printWriter.print("Suppressed: ");
                    printStackTrace.printStackTrace(printWriter);
                }
            }
        }
    }
}
