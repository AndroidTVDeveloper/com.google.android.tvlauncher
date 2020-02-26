package p000;

/* renamed from: lm */
/* compiled from: PG */
public final class C0312lm {

    /* renamed from: a */
    public final C0087dd f9860a = new C0087dd();

    /* renamed from: b */
    public final C0074cr f9861b = new C0074cr();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo5536b(C0285km kmVar) {
        C0310lk lkVar = (C0310lk) this.f9860a.get(kmVar);
        if (lkVar == null) {
            lkVar = C0310lk.m7891a();
            this.f9860a.put(kmVar, lkVar);
        }
        lkVar.f9857a |= 1;
    }

    /* renamed from: a */
    public final void mo5533a(long j, C0285km kmVar) {
        this.f9861b.mo3643a(j, kmVar);
    }

    /* renamed from: b */
    public final void mo5537b(C0285km kmVar, C0265jt jtVar) {
        C0310lk lkVar = (C0310lk) this.f9860a.get(kmVar);
        if (lkVar == null) {
            lkVar = C0310lk.m7891a();
            this.f9860a.put(kmVar, lkVar);
        }
        lkVar.f9859c = jtVar;
        lkVar.f9857a |= 8;
    }

    /* renamed from: a */
    public final void mo5534a(C0285km kmVar, C0265jt jtVar) {
        C0310lk lkVar = (C0310lk) this.f9860a.get(kmVar);
        if (lkVar == null) {
            lkVar = C0310lk.m7891a();
            this.f9860a.put(kmVar, lkVar);
        }
        lkVar.f9858b = jtVar;
        lkVar.f9857a |= 4;
    }

    /* renamed from: a */
    public final void mo5532a() {
        this.f9860a.clear();
        C0074cr crVar = this.f9861b;
        int i = crVar.f7064e;
        Object[] objArr = crVar.f7063d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        crVar.f7064e = 0;
        crVar.f7061b = false;
    }

    /* renamed from: a */
    public final boolean mo5535a(C0285km kmVar) {
        C0310lk lkVar = (C0310lk) this.f9860a.get(kmVar);
        return (lkVar == null || (lkVar.f9857a & 1) == 0) ? false : true;
    }

    /* renamed from: a */
    public final C0265jt mo5531a(C0285km kmVar, int i) {
        C0310lk lkVar;
        C0265jt jtVar;
        int a = this.f9860a.mo4135a(kmVar);
        if (a >= 0 && (lkVar = (C0310lk) this.f9860a.mo4139c(a)) != null) {
            int i2 = lkVar.f9857a;
            if ((i2 & i) != 0) {
                int i3 = (i ^ -1) & i2;
                lkVar.f9857a = i3;
                if (i == 4) {
                    jtVar = lkVar.f9858b;
                } else if (i == 8) {
                    jtVar = lkVar.f9859c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.f9860a.mo273d(a);
                    C0310lk.m7892a(lkVar);
                }
                return jtVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo5538c(C0285km kmVar) {
        C0310lk lkVar = (C0310lk) this.f9860a.get(kmVar);
        if (lkVar != null) {
            lkVar.f9857a &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo5539d(C0285km kmVar) {
        int a = this.f9861b.mo3640a() - 1;
        while (true) {
            if (a < 0) {
                break;
            } else if (kmVar == this.f9861b.mo3641a(a)) {
                C0074cr crVar = this.f9861b;
                if (crVar.f7063d[a] != C0074cr.f7060a) {
                    crVar.f7063d[a] = C0074cr.f7060a;
                    crVar.f7061b = true;
                }
            } else {
                a--;
            }
        }
        C0310lk lkVar = (C0310lk) this.f9860a.remove(kmVar);
        if (lkVar != null) {
            C0310lk.m7892a(lkVar);
        }
    }
}
