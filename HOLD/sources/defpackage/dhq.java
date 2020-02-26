package defpackage;

import java.io.PrintStream;
import java.io.PrintWriter;

/* renamed from: dhq  reason: default package */
/* compiled from: PG */
final class dhq extends dhl {
    public final void a(Throwable th, Throwable th2) {
        th.addSuppressed(th2);
    }

    public final void a(Throwable th) {
        th.printStackTrace();
    }

    public final void a(Throwable th, PrintStream printStream) {
        ((wq) th).a(printStream);
    }

    public final void a(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
    }
}
