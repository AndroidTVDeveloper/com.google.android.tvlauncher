package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: dfj  reason: default package */
/* compiled from: PG */
public final class dfj {
    private static final Object a;

    static {
        Object a2 = a();
        a = a2;
        if (a2 != null) {
            a("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (a != null) {
            b();
        }
    }

    private static Object a() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable th) {
            return null;
        }
    }

    private static Method a(String str, Class... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable th) {
            return null;
        }
    }

    private static void b() {
        try {
            Method a2 = a("getStackTraceDepth", Throwable.class);
            if (a2 != null) {
                a2.invoke(a(), new Throwable());
            }
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException e) {
        }
    }

    public static void a(Throwable th) {
        dgx.a(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        }
    }
}
