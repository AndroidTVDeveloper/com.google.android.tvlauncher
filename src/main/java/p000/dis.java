package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: dis */
/* compiled from: PG */
public class dis {

    /* renamed from: a */
    private static volatile boolean f8599a = false;

    /* renamed from: b */
    private static volatile dis f8600b;

    /* renamed from: c */
    private static volatile dis f8601c;

    /* renamed from: d */
    private static final dis f8602d = new dis((byte) 0);

    /* renamed from: e */
    private final Map f8603e;

    dis() {
        this.f8603e = new HashMap();
    }

    public dis(byte b) {
        this.f8603e = Collections.emptyMap();
    }

    /* renamed from: a */
    public diq mo4468a(dkk dkk, int i) {
        return (diq) this.f8603e.get(new dir(dkk, i));
    }

    /* renamed from: a */
    public static dis m6616a() {
        dis dis = f8600b;
        if (dis == null) {
            synchronized (dis.class) {
                dis = f8600b;
                if (dis == null) {
                    dis = f8602d;
                    f8600b = dis;
                }
            }
        }
        return dis;
    }

    /* renamed from: b */
    public static dis m6617b() {
        Class<dis> cls = dis.class;
        dis dis = f8601c;
        if (dis != null) {
            return dis;
        }
        synchronized (cls) {
            dis dis2 = f8601c;
            if (dis2 != null) {
                return dis2;
            }
            dis a = diy.m6647a(cls);
            f8601c = a;
            return a;
        }
    }
}
