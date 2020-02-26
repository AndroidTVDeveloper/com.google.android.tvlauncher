package p000;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: bzm */
/* compiled from: PG */
final class bzm implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final Thread.UncaughtExceptionHandler f5052a;

    /* renamed from: b */
    private final /* synthetic */ bzn f5053b;

    public bzm(bzn bzn, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f5053b = bzn;
        this.f5052a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        try {
            if (this.f5053b.mo2547b()) {
                bzn bzn = this.f5053b;
                String name = thread.getName();
                dja l = dof.f9037i.mo4516l();
                String a = cah.m4439a(bzn.f5055e);
                int i = 4;
                if (a != null) {
                    if (l.f8673b) {
                        l.mo4505b();
                        l.f8673b = false;
                    }
                    dof dof = (dof) l.f8672a;
                    a.getClass();
                    dof.f9038a |= 4;
                    dof.f9041d = a;
                }
                if (l.f8673b) {
                    l.mo4505b();
                    l.f8673b = false;
                }
                dof dof2 = (dof) l.f8672a;
                int i2 = dof2.f9038a | 1;
                dof2.f9038a = i2;
                dof2.f9039b = true;
                name.getClass();
                dof2.f9038a = i2 | 8;
                dof2.f9042e = name;
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
                if (l.f8673b) {
                    l.mo4505b();
                    l.f8673b = false;
                }
                dof dof3 = (dof) l.f8672a;
                dof3.f9043f = i - 1;
                dof3.f9038a |= 16;
                String name2 = th.getClass().getName();
                if (l.f8673b) {
                    l.mo4505b();
                    l.f8673b = false;
                }
                dof dof4 = (dof) l.f8672a;
                name2.getClass();
                dof4.f9038a |= 64;
                dof4.f9045h = name2;
                try {
                    StringWriter stringWriter = new StringWriter();
                    dhr.f8536a.mo4360a(th, new PrintWriter(stringWriter));
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
                    Long a2 = bzo.m4422a(sb.toString());
                    if (a2 != null) {
                        long longValue = a2.longValue();
                        if (l.f8673b) {
                            l.mo4505b();
                            l.f8673b = false;
                        }
                        dof dof5 = (dof) l.f8672a;
                        dof5.f9038a |= 32;
                        dof5.f9044g = longValue;
                    }
                } catch (Exception e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 38);
                    sb2.append("Failed to generate hashed stack trace.");
                    sb2.append(valueOf);
                    bog.m3837c("CrashMetricService", sb2.toString(), new Object[0]);
                }
                try {
                    dja l2 = doa.f9022c.mo4516l();
                    dnz a3 = ccy.m4553a(bzn.f5025a);
                    if (l2.f8673b) {
                        l2.mo4505b();
                        l2.f8673b = false;
                    }
                    doa doa = (doa) l2.f8672a;
                    a3.getClass();
                    doa.f9024b = a3;
                    doa.f9023a |= 1;
                    if (l.f8673b) {
                        l.mo4505b();
                        l.f8673b = false;
                    }
                    dof dof6 = (dof) l.f8672a;
                    doa doa2 = (doa) l2.mo4509g();
                    doa2.getClass();
                    dof6.f9040c = doa2;
                    dof6.f9038a |= 2;
                } catch (Exception e2) {
                    bog.m3834b("CrashMetricService", "Failed to get process stats.", e2, new Object[0]);
                }
                dof dof7 = (dof) l.mo4509g();
                dja l3 = dom.f9077q.mo4516l();
                if (l3.f8673b) {
                    l3.mo4505b();
                    l3.f8673b = false;
                }
                dom dom = (dom) l3.f8672a;
                dof7.getClass();
                dom.f9085h = dof7;
                dom.f9078a |= 64;
                this.f5053b.mo2585e();
                this.f5053b.mo2544a((dom) l3.mo4509g());
                boolean z = this.f5053b.f5027c;
            }
            uncaughtExceptionHandler = this.f5052a;
            if (uncaughtExceptionHandler == null) {
                return;
            }
        } catch (Exception e3) {
            bog.m3834b("CrashMetricService", "Failed to record crash.", e3, new Object[0]);
            uncaughtExceptionHandler = this.f5052a;
            if (uncaughtExceptionHandler == null) {
                return;
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f5052a;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
            throw th2;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }
}
