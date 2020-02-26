package defpackage;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: dho  reason: default package */
/* compiled from: PG */
final class dho extends dhl {
    private final dhn a = new dhn();

    public final void a(Throwable th, Throwable th2) {
        if (th2 != th) {
            this.a.a(th, true).add(th2);
            return;
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", th2);
    }

    public final void a(Throwable th) {
        th.printStackTrace();
        List<Throwable> a2 = this.a.a(th, false);
        if (a2 != null) {
            synchronized (a2) {
                for (Throwable printStackTrace : a2) {
                    System.err.print("Suppressed: ");
                    printStackTrace.printStackTrace();
                }
            }
        }
    }

    public final void a(Throwable th, PrintStream printStream) {
        ((wq) th).a(printStream);
        List<Throwable> a2 = this.a.a(th, false);
        if (a2 != null) {
            synchronized (a2) {
                for (Throwable printStackTrace : a2) {
                    printStream.print("Suppressed: ");
                    printStackTrace.printStackTrace(printStream);
                }
            }
        }
    }

    public final void a(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
        List<Throwable> a2 = this.a.a(th, false);
        if (a2 != null) {
            synchronized (a2) {
                for (Throwable printStackTrace : a2) {
                    printWriter.print("Suppressed: ");
                    printStackTrace.printStackTrace(printWriter);
                }
            }
        }
    }
}
