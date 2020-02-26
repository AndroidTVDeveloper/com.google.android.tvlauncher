package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: dfj */
/* compiled from: PG */
public final class dfj {

    /* renamed from: a */
    private static final Object f8452a;

    static {
        Object a = m6302a();
        f8452a = a;
        if (a != null) {
            m6303a("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (f8452a != null) {
            m6305b();
        }
    }

    /* renamed from: a */
    private static Object m6302a() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: a */
    private static Method m6303a(String str, Class... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: b */
    private static void m6305b() {
        try {
            Method a = m6303a("getStackTraceDepth", Throwable.class);
            if (a != null) {
                a.invoke(m6302a(), new Throwable());
            }
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException e) {
        }
    }

    /* renamed from: a */
    public static void m6304a(Throwable th) {
        dgx.m6401a(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        }
    }
}
