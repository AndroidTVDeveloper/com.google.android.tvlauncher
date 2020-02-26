package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: dis  reason: default package */
/* compiled from: PG */
public class dis {
    private static volatile boolean a = false;
    private static volatile dis b;
    private static volatile dis c;
    private static final dis d = new dis((byte) 0);
    private final Map e;

    dis() {
        this.e = new HashMap();
    }

    public dis(byte b2) {
        this.e = Collections.emptyMap();
    }

    public diq a(dkk dkk, int i) {
        return (diq) this.e.get(new dir(dkk, i));
    }

    public static dis a() {
        dis dis = b;
        if (dis == null) {
            synchronized (dis.class) {
                dis = b;
                if (dis == null) {
                    dis = d;
                    b = dis;
                }
            }
        }
        return dis;
    }

    public static dis b() {
        Class<dis> cls = dis.class;
        dis dis = c;
        if (dis != null) {
            return dis;
        }
        synchronized (cls) {
            dis dis2 = c;
            if (dis2 != null) {
                return dis2;
            }
            dis a2 = diy.a(cls);
            c = a2;
            return a2;
        }
    }
}
