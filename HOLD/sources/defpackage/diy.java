package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: diy  reason: default package */
/* compiled from: PG */
abstract class diy {
    private static final Logger a = Logger.getLogger(din.class.getName());
    private static final String b = "dia";

    /* access modifiers changed from: protected */
    public abstract dis a();

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.util.ServiceConfigurationError]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    static dis a(Class cls) {
        String str;
        Class<diy> cls2 = diy.class;
        ClassLoader classLoader = cls2.getClassLoader();
        if (cls.equals(dis.class)) {
            str = b;
        } else if (cls.getPackage().equals(cls2.getPackage())) {
            str = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            return (dis) cls.cast(((diy) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).a());
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException(e3);
        } catch (InvocationTargetException e4) {
            throw new IllegalStateException(e4);
        } catch (ClassNotFoundException e5) {
            Iterator it = ServiceLoader.load(cls2, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((diy) it.next()).a()));
                } catch (ServiceConfigurationError e6) {
                    ServiceConfigurationError serviceConfigurationError = e6;
                    Logger logger = a;
                    Level level = Level.SEVERE;
                    String valueOf = String.valueOf(cls.getSimpleName());
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", valueOf.length() == 0 ? new String("Unable to load ") : "Unable to load ".concat(valueOf), (Throwable) serviceConfigurationError);
                }
            }
            if (arrayList.size() == 1) {
                return (dis) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (dis) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException(e7);
            } catch (IllegalAccessException e8) {
                throw new IllegalStateException(e8);
            } catch (InvocationTargetException e9) {
                throw new IllegalStateException(e9);
            }
        }
    }
}
