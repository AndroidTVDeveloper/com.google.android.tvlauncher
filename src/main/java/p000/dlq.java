package p000;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: dlq */
/* compiled from: PG */
final class dlq implements PrivilegedExceptionAction {
    public final /* bridge */ /* synthetic */ Object run() {
        return m6981a();
    }

    /* renamed from: a */
    private static final Unsafe m6981a() {
        Class<Unsafe> cls = Unsafe.class;
        for (Field field : cls.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (cls.isInstance(obj)) {
                return cls.cast(obj);
            }
        }
        return null;
    }
}
