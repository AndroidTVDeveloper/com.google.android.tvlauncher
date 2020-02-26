package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: o  reason: default package */
/* compiled from: PG */
public final class o extends hc {
    public final c a = new c();
    public j b;
    public final WeakReference c;
    public int d = 0;
    public boolean e = false;
    private boolean f = false;
    private final ArrayList g = new ArrayList();

    public o(m mVar) {
        this.c = new WeakReference(mVar);
        this.b = j.INITIALIZED;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: j} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.j a(defpackage.l r4) {
        /*
            r3 = this;
            c r0 = r3.a
            boolean r1 = r0.a(r4)
            r2 = 0
            if (r1 == 0) goto L_0x0014
            java.util.HashMap r0 = r0.a
            java.lang.Object r4 = r0.get(r4)
            f r4 = (defpackage.f) r4
            f r4 = r4.c
            goto L_0x0015
        L_0x0014:
            r4 = r2
        L_0x0015:
            if (r4 == 0) goto L_0x001e
            java.lang.Object r4 = r4.a
            n r4 = (defpackage.n) r4
            j r4 = r4.a
            goto L_0x0020
        L_0x001e:
            r4 = r2
        L_0x0020:
            java.util.ArrayList r0 = r3.g
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0038
            java.util.ArrayList r0 = r3.g
            int r1 = r0.size()
            int r1 = r1 + -1
            java.lang.Object r0 = r0.get(r1)
            r2 = r0
            j r2 = (defpackage.j) r2
            goto L_0x003a
        L_0x0038:
        L_0x003a:
            j r0 = r3.b
            j r4 = a(r0, r4)
            j r4 = a(r4, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o.a(l):j");
    }

    static j b(int i) {
        String str;
        int i2 = i - 1;
        j jVar = j.DESTROYED;
        if (i != 0) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        return j.RESUMED;
                    }
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                return j.DESTROYED;
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append("Unexpected event value ");
                            switch (i) {
                                case 1:
                                    str = "ON_CREATE";
                                    break;
                                case 2:
                                    str = "ON_START";
                                    break;
                                case 3:
                                    str = "ON_RESUME";
                                    break;
                                case 4:
                                    str = "ON_PAUSE";
                                    break;
                                case 5:
                                    str = "ON_STOP";
                                    break;
                                case 6:
                                    str = "ON_DESTROY";
                                    break;
                                case 7:
                                    str = "ON_ANY";
                                    break;
                                default:
                                    str = "null";
                                    break;
                            }
                            sb.append((Object) str);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                }
                return j.STARTED;
            }
            return j.CREATED;
        }
        throw null;
    }

    public final void a(int i) {
        j b2 = b(i);
        if (this.b != b2) {
            this.b = b2;
            if (this.e || this.d != 0) {
                this.f = true;
                return;
            }
            this.e = true;
            b();
            this.e = false;
        }
    }

    static j a(j jVar, j jVar2) {
        return (jVar2 == null || jVar2.compareTo(jVar) >= 0) ? jVar : jVar2;
    }

    public final void a() {
        ArrayList arrayList = this.g;
        arrayList.remove(arrayList.size() - 1);
    }

    public final void a(j jVar) {
        this.g.add(jVar);
    }

    public final void b() {
        j jVar;
        j jVar2;
        if (((m) this.c.get()) != null) {
            while (true) {
                c cVar = this.a;
                if (cVar.e == 0 || ((jVar = ((n) cVar.b.a).a) == (jVar2 = ((n) cVar.c.a).a) && this.b == jVar2)) {
                    this.f = false;
                } else {
                    this.f = false;
                    if (this.b.compareTo((Enum) jVar) < 0) {
                        c cVar2 = this.a;
                        e eVar = new e(cVar2.c, cVar2.b);
                        cVar2.d.put(eVar, false);
                        while (eVar.hasNext() && !this.f) {
                            Map.Entry entry = (Map.Entry) eVar.next();
                            n nVar = (n) entry.getValue();
                            while (nVar.a.compareTo((Enum) this.b) > 0 && !this.f && this.a.a(entry.getKey())) {
                                j jVar3 = nVar.a;
                                j jVar4 = j.DESTROYED;
                                int ordinal = jVar3.ordinal();
                                if (ordinal == 0) {
                                    throw new IllegalArgumentException();
                                } else if (ordinal != 1) {
                                    int i = 4;
                                    if (ordinal == 2) {
                                        i = 6;
                                    } else if (ordinal == 3) {
                                        i = 5;
                                    } else if (ordinal != 4) {
                                        throw new IllegalArgumentException("Unexpected state value " + jVar3);
                                    }
                                    a(b(i));
                                    nVar.a(i);
                                    a();
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                    f fVar = this.a.c;
                    if (!this.f && fVar != null && this.b.compareTo((Enum) ((n) fVar.a).a) > 0) {
                        g a2 = this.a.a();
                        while (a2.hasNext() && !this.f) {
                            Map.Entry a3 = a2.next();
                            n nVar2 = (n) a3.getValue();
                            while (nVar2.a.compareTo((Enum) this.b) < 0 && !this.f && this.a.a(a3.getKey())) {
                                a(nVar2.a);
                                nVar2.a(b(nVar2.a));
                                a();
                            }
                        }
                    }
                }
            }
            this.f = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    public static int b(j jVar) {
        j jVar2 = j.DESTROYED;
        int ordinal = jVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return 1;
        }
        int i = 2;
        if (ordinal != 2) {
            i = 3;
            if (ordinal != 3) {
                if (ordinal != 4) {
                    throw new IllegalArgumentException("Unexpected state value " + jVar);
                }
                throw new IllegalArgumentException();
            }
        }
        return i;
    }
}
