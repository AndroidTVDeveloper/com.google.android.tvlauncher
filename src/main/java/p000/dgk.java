package p000;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: dgk */
/* compiled from: PG */
class dgk implements PrivilegedExceptionAction {
    public final /* bridge */ /* synthetic */ Object run() {
        return m6361a();
    }

    /* renamed from: a */
    private static final Unsafe m6361a() {
        Class<Unsafe> cls = Unsafe.class;
        for (Field field : cls.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (cls.isInstance(obj)) {
                return cls.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }
}
