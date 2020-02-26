package defpackage;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;

@Deprecated
/* renamed from: afy  reason: default package */
/* compiled from: PG */
public final class afy {
    public final Context a;

    public afy(Context context) {
        this.a = context;
    }

    public static afw a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Object obj = null;
            try {
                obj = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (InstantiationException e) {
                a(cls, e);
            } catch (IllegalAccessException e2) {
                a(cls, e2);
            } catch (NoSuchMethodException e3) {
                a(cls, e3);
            } catch (InvocationTargetException e4) {
                a(cls, e4);
            }
            if (obj instanceof afw) {
                return (afw) obj;
            }
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
            sb.append("Expected instanceof GlideModule, but found: ");
            sb.append(valueOf);
            throw new RuntimeException(sb.toString());
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    private static void a(Class cls, Exception exc) {
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
        sb.append("Unable to instantiate GlideModule implementation for ");
        sb.append(valueOf);
        throw new RuntimeException(sb.toString(), exc);
    }
}
