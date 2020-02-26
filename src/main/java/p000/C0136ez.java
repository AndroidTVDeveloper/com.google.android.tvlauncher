package p000;

import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;

/* renamed from: ez */
/* compiled from: PG */
final class C0136ez implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    private static final Class[] f9192a = {MenuItem.class};

    /* renamed from: b */
    private final Object f9193b;

    /* renamed from: c */
    private final Method f9194c;

    public C0136ez(Object obj, String str) {
        this.f9193b = obj;
        Class<?> cls = obj.getClass();
        try {
            this.f9194c = cls.getMethod(str, f9192a);
        } catch (Exception e) {
            InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
            inflateException.initCause(e);
            throw inflateException;
        }
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        try {
            if (this.f9194c.getReturnType() == Boolean.TYPE) {
                return ((Boolean) this.f9194c.invoke(this.f9193b, menuItem)).booleanValue();
            }
            this.f9194c.invoke(this.f9193b, menuItem);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
