package p000;

import java.lang.reflect.InvocationTargetException;

/* renamed from: ag */
/* compiled from: PG */
public class C0006ag {

    /* renamed from: a */
    private static final C0087dd f253a = new C0087dd();

    /* renamed from: b */
    public C0003ad mo179b(ClassLoader classLoader, String str) {
        try {
            return (C0003ad) m323c(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e) {
            throw new C0002ac("Unable to instantiate fragment " + str + ": make sure class name exists", e);
        } catch (ClassCastException e2) {
            throw new C0002ac("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e2);
        } catch (InstantiationException e3) {
            throw new C0002ac("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (IllegalAccessException e4) {
            throw new C0002ac("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e4);
        } catch (NoSuchMethodException e5) {
            throw new C0002ac("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e5);
        } catch (InvocationTargetException e6) {
            throw new C0002ac("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e6);
        }
    }

    /* renamed from: a */
    static boolean m322a(ClassLoader classLoader, String str) {
        try {
            return C0003ad.class.isAssignableFrom(m323c(classLoader, str));
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    /* renamed from: c */
    private static Class m323c(ClassLoader classLoader, String str) {
        Class cls = (Class) f253a.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        f253a.put(str, cls2);
        return cls2;
    }
}
