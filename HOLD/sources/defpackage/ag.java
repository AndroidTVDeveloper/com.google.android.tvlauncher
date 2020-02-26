package defpackage;

import java.lang.reflect.InvocationTargetException;

/* renamed from: ag  reason: default package */
/* compiled from: PG */
public class ag {
    private static final dd a = new dd();

    public ad b(ClassLoader classLoader, String str) {
        try {
            return (ad) c(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e) {
            throw new ac("Unable to instantiate fragment " + str + ": make sure class name exists", e);
        } catch (ClassCastException e2) {
            throw new ac("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e2);
        } catch (InstantiationException e3) {
            throw new ac("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (IllegalAccessException e4) {
            throw new ac("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e4);
        } catch (NoSuchMethodException e5) {
            throw new ac("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e5);
        } catch (InvocationTargetException e6) {
            throw new ac("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e6);
        }
    }

    static boolean a(ClassLoader classLoader, String str) {
        try {
            return ad.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    private static Class c(ClassLoader classLoader, String str) {
        Class cls = (Class) a.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        a.put(str, cls2);
        return cls2;
    }
}
