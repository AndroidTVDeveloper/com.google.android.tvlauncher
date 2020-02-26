package p000;

import java.io.PrintStream;
import java.io.PrintWriter;

/* renamed from: dhq */
/* compiled from: PG */
final class dhq extends dhl {
    /* renamed from: a */
    public final void mo4361a(Throwable th, Throwable th2) {
        th.addSuppressed(th2);
    }

    /* renamed from: a */
    public final void mo4358a(Throwable th) {
        th.printStackTrace();
    }

    /* renamed from: a */
    public final void mo4359a(Throwable th, PrintStream printStream) {
        ((C0613wq) th).mo6080a(printStream);
    }

    /* renamed from: a */
    public final void mo4360a(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
    }
}
