package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: xk */
/* compiled from: PG */
final class C0634xk {

    /* renamed from: a */
    private final C0633xj f10772a = new C0633xj();

    /* renamed from: b */
    private final Map f10773b = new HashMap();

    /* renamed from: a */
    public final Object mo6113a(C0641xr xrVar) {
        C0633xj xjVar = (C0633xj) this.f10773b.get(xrVar);
        if (xjVar == null) {
            xjVar = new C0633xj(xrVar);
            this.f10773b.put(xrVar, xjVar);
        } else {
            xrVar.mo6116a();
        }
        m8629b(xjVar);
        C0633xj xjVar2 = this.f10772a;
        xjVar.f10771d = xjVar2;
        xjVar.f10770c = xjVar2.f10770c;
        m8628a(xjVar);
        return xjVar.mo6110a();
    }

    /* renamed from: a */
    public final void mo6114a(C0641xr xrVar, Object obj) {
        C0633xj xjVar = (C0633xj) this.f10773b.get(xrVar);
        if (xjVar == null) {
            xjVar = new C0633xj(xrVar);
            m8629b(xjVar);
            C0633xj xjVar2 = this.f10772a;
            xjVar.f10771d = xjVar2.f10771d;
            xjVar.f10770c = xjVar2;
            m8628a(xjVar);
            this.f10773b.put(xrVar, xjVar);
        } else {
            xrVar.mo6116a();
        }
        if (xjVar.f10769b == null) {
            xjVar.f10769b = new ArrayList();
        }
        xjVar.f10769b.add(obj);
    }

    /* renamed from: b */
    private static void m8629b(C0633xj xjVar) {
        C0633xj xjVar2 = xjVar.f10771d;
        xjVar2.f10770c = xjVar.f10770c;
        xjVar.f10770c.f10771d = xjVar2;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, xr] */
    /* renamed from: a */
    public final Object mo6112a() {
        for (C0633xj xjVar = this.f10772a.f10771d; !xjVar.equals(this.f10772a); xjVar = xjVar.f10771d) {
            Object a = xjVar.mo6110a();
            if (a != null) {
                return a;
            }
            m8629b(xjVar);
            this.f10773b.remove(xjVar.f10768a);
            xjVar.f10768a.mo6116a();
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        C0633xj xjVar = this.f10772a.f10770c;
        boolean z = false;
        while (!xjVar.equals(this.f10772a)) {
            sb.append('{');
            sb.append(xjVar.f10768a);
            sb.append(':');
            sb.append(xjVar.mo6111b());
            sb.append("}, ");
            xjVar = xjVar.f10770c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }

    /* renamed from: a */
    private static void m8628a(C0633xj xjVar) {
        xjVar.f10770c.f10771d = xjVar;
        xjVar.f10771d.f10770c = xjVar;
    }
}
