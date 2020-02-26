package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: xk  reason: default package */
/* compiled from: PG */
final class xk {
    private final xj a = new xj();
    private final Map b = new HashMap();

    public final Object a(xr xrVar) {
        xj xjVar = (xj) this.b.get(xrVar);
        if (xjVar == null) {
            xjVar = new xj(xrVar);
            this.b.put(xrVar, xjVar);
        } else {
            xrVar.a();
        }
        b(xjVar);
        xj xjVar2 = this.a;
        xjVar.d = xjVar2;
        xjVar.c = xjVar2.c;
        a(xjVar);
        return xjVar.a();
    }

    public final void a(xr xrVar, Object obj) {
        xj xjVar = (xj) this.b.get(xrVar);
        if (xjVar == null) {
            xjVar = new xj(xrVar);
            b(xjVar);
            xj xjVar2 = this.a;
            xjVar.d = xjVar2.d;
            xjVar.c = xjVar2;
            a(xjVar);
            this.b.put(xrVar, xjVar);
        } else {
            xrVar.a();
        }
        if (xjVar.b == null) {
            xjVar.b = new ArrayList();
        }
        xjVar.b.add(obj);
    }

    private static void b(xj xjVar) {
        xj xjVar2 = xjVar.d;
        xjVar2.c = xjVar.c;
        xjVar.c.d = xjVar2;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, xr] */
    public final Object a() {
        for (xj xjVar = this.a.d; !xjVar.equals(this.a); xjVar = xjVar.d) {
            Object a2 = xjVar.a();
            if (a2 != null) {
                return a2;
            }
            b(xjVar);
            this.b.remove(xjVar.a);
            xjVar.a.a();
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        xj xjVar = this.a.c;
        boolean z = false;
        while (!xjVar.equals(this.a)) {
            sb.append('{');
            sb.append(xjVar.a);
            sb.append(':');
            sb.append(xjVar.b());
            sb.append("}, ");
            xjVar = xjVar.c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }

    private static void a(xj xjVar) {
        xjVar.c.d = xjVar;
        xjVar.d.c = xjVar;
    }
}
