package defpackage;

import android.view.View;

/* renamed from: kt  reason: default package */
/* compiled from: PG */
public abstract class kt extends ju {
    public boolean j = true;

    public abstract boolean a(km kmVar);

    public abstract boolean a(km kmVar, int i, int i2, int i3, int i4);

    public abstract boolean a(km kmVar, km kmVar2, int i, int i2, int i3, int i4);

    public abstract boolean b(km kmVar);

    public boolean b(km kmVar, jt jtVar, jt jtVar2) {
        int i;
        int i2;
        if (jtVar == null || ((i = jtVar.a) == (i2 = jtVar2.a) && jtVar.b == jtVar2.b)) {
            return b(kmVar);
        }
        return a(kmVar, i, jtVar.b, i2, jtVar2.b);
    }

    public boolean a(km kmVar, km kmVar2, jt jtVar, jt jtVar2) {
        int i;
        int i2;
        int i3 = jtVar.a;
        int i4 = jtVar.b;
        if (kmVar2.b()) {
            int i5 = jtVar.a;
            i = jtVar.b;
            i2 = i5;
        } else {
            i2 = jtVar2.a;
            i = jtVar2.b;
        }
        return a(kmVar, kmVar2, i3, i4, i2, i);
    }

    public boolean a(km kmVar, jt jtVar, jt jtVar2) {
        int i;
        int i2;
        int i3 = jtVar.a;
        int i4 = jtVar.b;
        View view = kmVar.a;
        if (jtVar2 != null) {
            i = jtVar2.a;
        } else {
            i = view.getLeft();
        }
        if (jtVar2 != null) {
            i2 = jtVar2.b;
        } else {
            i2 = view.getTop();
        }
        if (kmVar.m() || (i3 == i && i4 == i2)) {
            return a(kmVar);
        }
        view.layout(i, i2, view.getWidth() + i, view.getHeight() + i2);
        return a(kmVar, i3, i4, i, i2);
    }

    public boolean c(km kmVar, jt jtVar, jt jtVar2) {
        int i = jtVar.a;
        int i2 = jtVar2.a;
        if (i == i2 && jtVar.b == jtVar2.b) {
            e(kmVar);
            return false;
        }
        return a(kmVar, i, jtVar.b, i2, jtVar2.b);
    }

    public final boolean f(km kmVar) {
        return !this.j || kmVar.j();
    }
}
