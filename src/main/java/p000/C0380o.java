package p000;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: o */
/* compiled from: PG */
public final class C0380o extends C0194hc {

    /* renamed from: a */
    public final C0055c f10068a = new C0055c();

    /* renamed from: b */
    public C0245j f10069b;

    /* renamed from: c */
    public final WeakReference f10070c;

    /* renamed from: d */
    public int f10071d = 0;

    /* renamed from: e */
    public boolean f10072e = false;

    /* renamed from: f */
    private boolean f10073f = false;

    /* renamed from: g */
    private final ArrayList f10074g = new ArrayList();

    public C0380o(C0326m mVar) {
        this.f10070c = new WeakReference(mVar);
        this.f10069b = C0245j.INITIALIZED;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: j} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.C0245j mo5690a(p000.C0299l r4) {
        /*
            r3 = this;
            c r0 = r3.f10068a
            boolean r1 = r0.mo2595a(r4)
            r2 = 0
            if (r1 == 0) goto L_0x0014
            java.util.HashMap r0 = r0.f5095a
            java.lang.Object r4 = r0.get(r4)
            f r4 = (p000.C0137f) r4
            f r4 = r4.f9197c
            goto L_0x0015
        L_0x0014:
            r4 = r2
        L_0x0015:
            if (r4 == 0) goto L_0x001e
            java.lang.Object r4 = r4.f9195a
            n r4 = (p000.C0353n) r4
            j r4 = r4.f9967a
            goto L_0x0020
        L_0x001e:
            r4 = r2
        L_0x0020:
            java.util.ArrayList r0 = r3.f10074g
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0038
            java.util.ArrayList r0 = r3.f10074g
            int r1 = r0.size()
            int r1 = r1 + -1
            java.lang.Object r0 = r0.get(r1)
            r2 = r0
            j r2 = (p000.C0245j) r2
            goto L_0x003a
        L_0x0038:
        L_0x003a:
            j r0 = r3.f10069b
            j r4 = m8129a(r0, r4)
            j r4 = m8129a(r4, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0380o.mo5690a(l):j");
    }

    /* renamed from: b */
    static C0245j m8131b(int i) {
        String str;
        int i2 = i - 1;
        C0245j jVar = C0245j.DESTROYED;
        if (i != 0) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        return C0245j.RESUMED;
                    }
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                return C0245j.DESTROYED;
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
                return C0245j.STARTED;
            }
            return C0245j.CREATED;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo5692a(int i) {
        C0245j b = m8131b(i);
        if (this.f10069b != b) {
            this.f10069b = b;
            if (this.f10072e || this.f10071d != 0) {
                this.f10073f = true;
                return;
            }
            this.f10072e = true;
            mo5694b();
            this.f10072e = false;
        }
    }

    /* renamed from: a */
    static C0245j m8129a(C0245j jVar, C0245j jVar2) {
        return (jVar2 == null || jVar2.compareTo(jVar) >= 0) ? jVar : jVar2;
    }

    /* renamed from: a */
    public final void mo5691a() {
        ArrayList arrayList = this.f10074g;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: a */
    public final void mo5693a(C0245j jVar) {
        this.f10074g.add(jVar);
    }

    /* renamed from: b */
    public final void mo5694b() {
        C0245j jVar;
        C0245j jVar2;
        if (((C0326m) this.f10070c.get()) != null) {
            while (true) {
                C0055c cVar = this.f10068a;
                if (cVar.f9536e == 0 || ((jVar = ((C0353n) cVar.f9533b.f9195a).f9967a) == (jVar2 = ((C0353n) cVar.f9534c.f9195a).f9967a) && this.f10069b == jVar2)) {
                    this.f10073f = false;
                } else {
                    this.f10073f = false;
                    if (this.f10069b.compareTo((Enum) jVar) < 0) {
                        C0055c cVar2 = this.f10068a;
                        C0110e eVar = new C0110e(cVar2.f9534c, cVar2.f9533b);
                        cVar2.f9535d.put(eVar, false);
                        while (eVar.hasNext() && !this.f10073f) {
                            Map.Entry entry = (Map.Entry) eVar.next();
                            C0353n nVar = (C0353n) entry.getValue();
                            while (nVar.f9967a.compareTo((Enum) this.f10069b) > 0 && !this.f10073f && this.f10068a.mo2595a(entry.getKey())) {
                                C0245j jVar3 = nVar.f9967a;
                                C0245j jVar4 = C0245j.DESTROYED;
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
                                    mo5693a(m8131b(i));
                                    nVar.mo5595a(i);
                                    mo5691a();
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                    C0137f fVar = this.f10068a.f9534c;
                    if (!this.f10073f && fVar != null && this.f10069b.compareTo((Enum) ((C0353n) fVar.f9195a).f9967a) > 0) {
                        C0164g a = this.f10068a.mo5225a();
                        while (a.hasNext() && !this.f10073f) {
                            Map.Entry a2 = a.next();
                            C0353n nVar2 = (C0353n) a2.getValue();
                            while (nVar2.f9967a.compareTo((Enum) this.f10069b) < 0 && !this.f10073f && this.f10068a.mo2595a(a2.getKey())) {
                                mo5693a(nVar2.f9967a);
                                nVar2.mo5595a(m8130b(nVar2.f9967a));
                                mo5691a();
                            }
                        }
                    }
                }
            }
            this.f10073f = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    /* renamed from: b */
    public static int m8130b(C0245j jVar) {
        C0245j jVar2 = C0245j.DESTROYED;
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
