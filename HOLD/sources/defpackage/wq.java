package defpackage;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: wq  reason: default package */
/* compiled from: PG */
public final class wq extends Exception {
    private static final StackTraceElement[] a = new StackTraceElement[0];
    public static final long serialVersionUID = 1;
    private final List b;
    private ts c;
    private Class d;
    private String e;
    private int f;

    public final Throwable fillInStackTrace() {
        return this;
    }

    public wq(String str) {
        this(str, Collections.emptyList());
    }

    public wq(String str, Throwable th) {
        this(str, Collections.singletonList(th));
    }

    public wq(String str, List list) {
        this.e = str;
        setStackTrace(a);
        this.b = list;
    }

    private final void a(Throwable th, List list) {
        if (th instanceof wq) {
            for (Throwable a2 : ((wq) th).b) {
                a(a2, list);
            }
            return;
        }
        list.add(th);
    }

    private static void a(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException e2) {
            throw new RuntimeException(th);
        }
    }

    public final String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.e);
        Class cls = this.d;
        String str3 = "";
        if (cls != null) {
            String valueOf = String.valueOf(cls);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 2);
            sb2.append(", ");
            sb2.append(valueOf);
            str = sb2.toString();
        } else {
            str = str3;
        }
        sb.append(str);
        int i = this.f;
        if (i == 0) {
            str2 = str3;
        } else {
            String a2 = boc.a(i);
            StringBuilder sb3 = new StringBuilder(String.valueOf(a2).length() + 2);
            sb3.append(", ");
            sb3.append(a2);
            str2 = sb3.toString();
        }
        sb.append(str2);
        ts tsVar = this.c;
        if (tsVar != null) {
            String valueOf2 = String.valueOf(tsVar);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 2);
            sb4.append(", ");
            sb4.append(valueOf2);
            str3 = sb4.toString();
        }
        sb.append(str3);
        List<Throwable> a3 = a();
        if (a3.isEmpty()) {
            return sb.toString();
        }
        if (a3.size() == 1) {
            sb.append("\nThere was 1 cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(a3.size());
            sb.append(" causes:");
        }
        for (Throwable th : a3) {
            sb.append(10);
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    public final List a() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    public final void printStackTrace() {
        dhr.a.a(this, System.err);
    }

    public final void printStackTrace(PrintStream printStream) {
        a(printStream);
    }

    public final void printStackTrace(PrintWriter printWriter) {
        a(printWriter);
    }

    public final void a(Appendable appendable) {
        a(this, appendable);
        List list = this.b;
        wp wpVar = new wp(appendable);
        try {
            int size = list.size();
            int i = 0;
            while (i < size) {
                wpVar.append("Cause (");
                int i2 = i + 1;
                wpVar.append(String.valueOf(i2));
                wpVar.append(" of ");
                wpVar.append(String.valueOf(size));
                wpVar.append("): ");
                Throwable th = (Throwable) list.get(i);
                if (th instanceof wq) {
                    ((wq) th).a(wpVar);
                } else {
                    a(th, wpVar);
                }
                i = i2;
            }
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(ts tsVar, int i, Class cls) {
        this.c = tsVar;
        this.f = i;
        this.d = cls;
    }
}
