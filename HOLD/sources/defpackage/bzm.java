package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: bzm  reason: default package */
/* compiled from: PG */
final class bzm implements Thread.UncaughtExceptionHandler {
    public final Thread.UncaughtExceptionHandler a;
    private final /* synthetic */ bzn b;

    public bzm(bzn bzn, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.b = bzn;
        this.a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        try {
            if (this.b.b()) {
                bzn bzn = this.b;
                String name = thread.getName();
                dja l = dof.i.l();
                String a2 = cah.a(bzn.e);
                int i = 4;
                if (a2 != null) {
                    if (l.b) {
                        l.b();
                        l.b = false;
                    }
                    dof dof = (dof) l.a;
                    a2.getClass();
                    dof.a |= 4;
                    dof.d = a2;
                }
                if (l.b) {
                    l.b();
                    l.b = false;
                }
                dof dof2 = (dof) l.a;
                int i2 = dof2.a | 1;
                dof2.a = i2;
                dof2.b = true;
                name.getClass();
                dof2.a = i2 | 8;
                dof2.e = name;
                Class<?> cls = th.getClass();
                if (cls == OutOfMemoryError.class) {
                    i = 3;
                } else if (NullPointerException.class.isAssignableFrom(cls)) {
                    i = 2;
                } else if (!RuntimeException.class.isAssignableFrom(cls)) {
                    if (!Error.class.isAssignableFrom(cls)) {
                        i = 1;
                    } else {
                        i = 5;
                    }
                }
                if (l.b) {
                    l.b();
                    l.b = false;
                }
                dof dof3 = (dof) l.a;
                dof3.f = i - 1;
                dof3.a |= 16;
                String name2 = th.getClass().getName();
                if (l.b) {
                    l.b();
                    l.b = false;
                }
                dof dof4 = (dof) l.a;
                name2.getClass();
                dof4.a |= 64;
                dof4.h = name2;
                try {
                    StringWriter stringWriter = new StringWriter();
                    dhr.a.a(th, new PrintWriter(stringWriter));
                    String stringWriter2 = stringWriter.toString();
                    StringBuilder sb = new StringBuilder();
                    Matcher matcher = Pattern.compile("([^:^\n]+).*((?:\n\\s*at [^:~\n]*:?~?[0-9]*[^\n]*)+)(?:(\nCaused by: )([^:^\n]+).*((?:\n\\s*at [^:~\n]*:?~?[0-9]*[^\n]*)+))?(?:(\nCaused by: )([^:^\n]+).*((?:\n\\s*at [^:~\n]*:?~?[0-9]*[^\n]*)+))?").matcher(stringWriter2);
                    if (matcher.find()) {
                        int i3 = 1;
                        while (i3 <= matcher.groupCount() && matcher.group(i3) != null) {
                            sb.append(matcher.group(i3));
                            i3++;
                        }
                    }
                    Long a3 = bzo.a(sb.toString());
                    if (a3 != null) {
                        long longValue = a3.longValue();
                        if (l.b) {
                            l.b();
                            l.b = false;
                        }
                        dof dof5 = (dof) l.a;
                        dof5.a |= 32;
                        dof5.g = longValue;
                    }
                } catch (Exception e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 38);
                    sb2.append("Failed to generate hashed stack trace.");
                    sb2.append(valueOf);
                    bog.c("CrashMetricService", sb2.toString(), new Object[0]);
                }
                try {
                    dja l2 = doa.c.l();
                    dnz a4 = ccy.a(bzn.a);
                    if (l2.b) {
                        l2.b();
                        l2.b = false;
                    }
                    doa doa = (doa) l2.a;
                    a4.getClass();
                    doa.b = a4;
                    doa.a |= 1;
                    if (l.b) {
                        l.b();
                        l.b = false;
                    }
                    dof dof6 = (dof) l.a;
                    doa doa2 = (doa) l2.g();
                    doa2.getClass();
                    dof6.c = doa2;
                    dof6.a |= 2;
                } catch (Exception e2) {
                    bog.b("CrashMetricService", "Failed to get process stats.", e2, new Object[0]);
                }
                dof dof7 = (dof) l.g();
                dja l3 = dom.q.l();
                if (l3.b) {
                    l3.b();
                    l3.b = false;
                }
                dom dom = (dom) l3.a;
                dof7.getClass();
                dom.h = dof7;
                dom.a |= 64;
                this.b.e();
                this.b.a((dom) l3.g());
                boolean z = this.b.c;
            }
            uncaughtExceptionHandler = this.a;
            if (uncaughtExceptionHandler == null) {
                return;
            }
        } catch (Exception e3) {
            bog.b("CrashMetricService", "Failed to record crash.", e3, new Object[0]);
            uncaughtExceptionHandler = this.a;
            if (uncaughtExceptionHandler == null) {
                return;
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.a;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
            throw th2;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }
}
