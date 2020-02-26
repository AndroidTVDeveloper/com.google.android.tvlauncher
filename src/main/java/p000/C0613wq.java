package p000;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: wq */
/* compiled from: PG */
public final class C0613wq extends Exception {

    /* renamed from: a */
    private static final StackTraceElement[] f10721a = new StackTraceElement[0];
    public static final long serialVersionUID = 1;

    /* renamed from: b */
    private final List f10722b;

    /* renamed from: c */
    private C0534ts f10723c;

    /* renamed from: d */
    private Class f10724d;

    /* renamed from: e */
    private String f10725e;

    /* renamed from: f */
    private int f10726f;

    public final Throwable fillInStackTrace() {
        return this;
    }

    public C0613wq(String str) {
        this(str, Collections.emptyList());
    }

    public C0613wq(String str, Throwable th) {
        this(str, Collections.singletonList(th));
    }

    public C0613wq(String str, List list) {
        this.f10725e = str;
        setStackTrace(f10721a);
        this.f10722b = list;
    }

    /* renamed from: a */
    private final void m8567a(Throwable th, List list) {
        if (th instanceof C0613wq) {
            for (Throwable a : ((C0613wq) th).f10722b) {
                m8567a(a, list);
            }
            return;
        }
        list.add(th);
    }

    /* renamed from: a */
    private static void m8566a(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException e) {
            throw new RuntimeException(th);
        }
    }

    public final String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f10725e);
        Class cls = this.f10724d;
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
        int i = this.f10726f;
        if (i == 0) {
            str2 = str3;
        } else {
            String a = boc.m3817a(i);
            StringBuilder sb3 = new StringBuilder(String.valueOf(a).length() + 2);
            sb3.append(", ");
            sb3.append(a);
            str2 = sb3.toString();
        }
        sb.append(str2);
        C0534ts tsVar = this.f10723c;
        if (tsVar != null) {
            String valueOf2 = String.valueOf(tsVar);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 2);
            sb4.append(", ");
            sb4.append(valueOf2);
            str3 = sb4.toString();
        }
        sb.append(str3);
        List<Throwable> a2 = mo6079a();
        if (a2.isEmpty()) {
            return sb.toString();
        }
        if (a2.size() == 1) {
            sb.append("\nThere was 1 cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(a2.size());
            sb.append(" causes:");
        }
        for (Throwable th : a2) {
            sb.append(10);
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    /* renamed from: a */
    public final List mo6079a() {
        ArrayList arrayList = new ArrayList();
        m8567a(this, arrayList);
        return arrayList;
    }

    public final void printStackTrace() {
        dhr.f8536a.mo4359a(this, System.err);
    }

    public final void printStackTrace(PrintStream printStream) {
        mo6080a(printStream);
    }

    public final void printStackTrace(PrintWriter printWriter) {
        mo6080a(printWriter);
    }

    /* renamed from: a */
    public final void mo6080a(Appendable appendable) {
        m8566a(this, appendable);
        List list = this.f10722b;
        C0612wp wpVar = new C0612wp(appendable);
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
                if (th instanceof C0613wq) {
                    ((C0613wq) th).mo6080a(wpVar);
                } else {
                    m8566a(th, wpVar);
                }
                i = i2;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo6081a(C0534ts tsVar, int i, Class cls) {
        this.f10723c = tsVar;
        this.f10726f = i;
        this.f10724d = cls;
    }
}
