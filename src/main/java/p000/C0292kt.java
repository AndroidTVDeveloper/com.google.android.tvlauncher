package p000;

import android.view.View;

/* renamed from: kt */
/* compiled from: PG */
public abstract class C0292kt extends C0266ju {

    /* renamed from: j */
    public boolean f9821j = true;

    /* renamed from: a */
    public abstract boolean mo4215a(C0285km kmVar);

    /* renamed from: a */
    public abstract boolean mo4188a(C0285km kmVar, int i, int i2, int i3, int i4);

    /* renamed from: a */
    public abstract boolean mo4217a(C0285km kmVar, C0285km kmVar2, int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract boolean mo4218b(C0285km kmVar);

    /* renamed from: b */
    public boolean mo4192b(C0285km kmVar, C0265jt jtVar, C0265jt jtVar2) {
        int i;
        int i2;
        if (jtVar == null || ((i = jtVar.f9700a) == (i2 = jtVar2.f9700a) && jtVar.f9701b == jtVar2.f9701b)) {
            return mo4218b(kmVar);
        }
        return mo4188a(kmVar, i, jtVar.f9701b, i2, jtVar2.f9701b);
    }

    /* renamed from: a */
    public boolean mo4190a(C0285km kmVar, C0285km kmVar2, C0265jt jtVar, C0265jt jtVar2) {
        int i;
        int i2;
        int i3 = jtVar.f9700a;
        int i4 = jtVar.f9701b;
        if (kmVar2.mo5434b()) {
            int i5 = jtVar.f9700a;
            i = jtVar.f9701b;
            i2 = i5;
        } else {
            i2 = jtVar2.f9700a;
            i = jtVar2.f9701b;
        }
        return mo4217a(kmVar, kmVar2, i3, i4, i2, i);
    }

    /* renamed from: a */
    public boolean mo4189a(C0285km kmVar, C0265jt jtVar, C0265jt jtVar2) {
        int i;
        int i2;
        int i3 = jtVar.f9700a;
        int i4 = jtVar.f9701b;
        View view = kmVar.f9783a;
        if (jtVar2 != null) {
            i = jtVar2.f9700a;
        } else {
            i = view.getLeft();
        }
        if (jtVar2 != null) {
            i2 = jtVar2.f9701b;
        } else {
            i2 = view.getTop();
        }
        if (kmVar.mo5445m() || (i3 == i && i4 == i2)) {
            return mo4215a(kmVar);
        }
        view.layout(i, i2, view.getWidth() + i, view.getHeight() + i2);
        return mo4188a(kmVar, i3, i4, i, i2);
    }

    /* renamed from: c */
    public boolean mo4195c(C0285km kmVar, C0265jt jtVar, C0265jt jtVar2) {
        int i = jtVar.f9700a;
        int i2 = jtVar2.f9700a;
        if (i == i2 && jtVar.f9701b == jtVar2.f9701b) {
            mo5324e(kmVar);
            return false;
        }
        return mo4188a(kmVar, i, jtVar.f9701b, i2, jtVar2.f9701b);
    }

    /* renamed from: f */
    public final boolean mo5325f(C0285km kmVar) {
        return !this.f9821j || kmVar.mo5442j();
    }
}
