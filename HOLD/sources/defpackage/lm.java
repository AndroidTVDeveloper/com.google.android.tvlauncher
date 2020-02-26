package defpackage;

/* renamed from: lm  reason: default package */
/* compiled from: PG */
public final class lm {
    public final dd a = new dd();
    public final cr b = new cr();

    /* access modifiers changed from: package-private */
    public final void b(km kmVar) {
        lk lkVar = (lk) this.a.get(kmVar);
        if (lkVar == null) {
            lkVar = lk.a();
            this.a.put(kmVar, lkVar);
        }
        lkVar.a |= 1;
    }

    public final void a(long j, km kmVar) {
        this.b.a(j, kmVar);
    }

    public final void b(km kmVar, jt jtVar) {
        lk lkVar = (lk) this.a.get(kmVar);
        if (lkVar == null) {
            lkVar = lk.a();
            this.a.put(kmVar, lkVar);
        }
        lkVar.c = jtVar;
        lkVar.a |= 8;
    }

    public final void a(km kmVar, jt jtVar) {
        lk lkVar = (lk) this.a.get(kmVar);
        if (lkVar == null) {
            lkVar = lk.a();
            this.a.put(kmVar, lkVar);
        }
        lkVar.b = jtVar;
        lkVar.a |= 4;
    }

    public final void a() {
        this.a.clear();
        cr crVar = this.b;
        int i = crVar.e;
        Object[] objArr = crVar.d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        crVar.e = 0;
        crVar.b = false;
    }

    public final boolean a(km kmVar) {
        lk lkVar = (lk) this.a.get(kmVar);
        return (lkVar == null || (lkVar.a & 1) == 0) ? false : true;
    }

    public final jt a(km kmVar, int i) {
        lk lkVar;
        jt jtVar;
        int a2 = this.a.a(kmVar);
        if (a2 >= 0 && (lkVar = (lk) this.a.c(a2)) != null) {
            int i2 = lkVar.a;
            if ((i2 & i) != 0) {
                int i3 = (i ^ -1) & i2;
                lkVar.a = i3;
                if (i == 4) {
                    jtVar = lkVar.b;
                } else if (i == 8) {
                    jtVar = lkVar.c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.a.d(a2);
                    lk.a(lkVar);
                }
                return jtVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void c(km kmVar) {
        lk lkVar = (lk) this.a.get(kmVar);
        if (lkVar != null) {
            lkVar.a &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    public final void d(km kmVar) {
        int a2 = this.b.a() - 1;
        while (true) {
            if (a2 < 0) {
                break;
            } else if (kmVar == this.b.a(a2)) {
                cr crVar = this.b;
                if (crVar.d[a2] != cr.a) {
                    crVar.d[a2] = cr.a;
                    crVar.b = true;
                }
            } else {
                a2--;
            }
        }
        lk lkVar = (lk) this.a.remove(kmVar);
        if (lkVar != null) {
            lk.a(lkVar);
        }
    }
}
