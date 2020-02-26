package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: jo  reason: default package */
/* compiled from: PG */
public final class jo implements gu {
    public final /* synthetic */ RecyclerView a;

    public jo(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    /* access modifiers changed from: package-private */
    public final void a(gv gvVar) {
        int i = gvVar.a;
        if (i == 1) {
            this.a.h.b(gvVar.b, gvVar.d);
        } else if (i == 2) {
            this.a.h.d(gvVar.b, gvVar.d);
        } else if (i == 8) {
            this.a.h.c(gvVar.b, gvVar.d);
        }
    }

    public final km a(int i) {
        RecyclerView recyclerView = this.a;
        int b = recyclerView.c.b();
        int i2 = 0;
        km kmVar = null;
        while (true) {
            if (i2 >= b) {
                break;
            }
            km c = RecyclerView.c(recyclerView.c.c(i2));
            if (c != null && !c.m() && c.c == i) {
                if (!recyclerView.c.c(c.a)) {
                    kmVar = c;
                    break;
                }
                kmVar = c;
            }
            i2++;
        }
        if (kmVar == null || this.a.c.c(kmVar.a)) {
            return null;
        }
        return kmVar;
    }

    public final void a(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.a;
        int b = recyclerView.c.b();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < b; i6++) {
            View c = recyclerView.c.c(i6);
            km c2 = RecyclerView.c(c);
            if (c2 != null && !c2.b() && (i4 = c2.c) >= i && i4 < i5) {
                c2.b(2);
                c2.a(obj);
                ((jy) c.getLayoutParams()).c = true;
            }
        }
        kc kcVar = recyclerView.a;
        for (int size = kcVar.c.size() - 1; size >= 0; size--) {
            km kmVar = (km) kcVar.c.get(size);
            if (kmVar != null && (i3 = kmVar.c) >= i && i3 < i5) {
                kmVar.b(2);
                kcVar.b(size);
            }
        }
        this.a.G = true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: km.a(int, boolean):void
     arg types: [int, int]
     candidates:
      km.a(int, int):void
      km.a(kc, boolean):void
      km.a(int, boolean):void */
    public final void b(int i, int i2) {
        RecyclerView recyclerView = this.a;
        int b = recyclerView.c.b();
        for (int i3 = 0; i3 < b; i3++) {
            km c = RecyclerView.c(recyclerView.c.c(i3));
            if (c != null && !c.b() && c.c >= i) {
                c.a(i2, false);
                recyclerView.D.f = true;
            }
        }
        kc kcVar = recyclerView.a;
        int size = kcVar.c.size();
        for (int i4 = 0; i4 < size; i4++) {
            km kmVar = (km) kcVar.c.get(i4);
            if (kmVar != null && kmVar.c >= i) {
                kmVar.a(i2, true);
            }
        }
        recyclerView.requestLayout();
        this.a.F = true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: km.a(int, boolean):void
     arg types: [int, int]
     candidates:
      km.a(int, int):void
      km.a(kc, boolean):void
      km.a(int, boolean):void */
    public final void c(int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.a;
        int b = recyclerView.c.b();
        int i5 = i < i2 ? -1 : 1;
        int i6 = i < i2 ? i2 : i;
        int i7 = i < i2 ? i : i2;
        for (int i8 = 0; i8 < b; i8++) {
            km c = RecyclerView.c(recyclerView.c.c(i8));
            if (c != null && (i4 = c.c) >= i7 && i4 <= i6) {
                if (i4 == i) {
                    c.a(i2 - i, false);
                } else {
                    c.a(i5, false);
                }
                recyclerView.D.f = true;
            }
        }
        kc kcVar = recyclerView.a;
        int size = kcVar.c.size();
        for (int i9 = 0; i9 < size; i9++) {
            km kmVar = (km) kcVar.c.get(i9);
            if (kmVar != null && (i3 = kmVar.c) >= i7 && i3 <= i6) {
                if (i3 == i) {
                    kmVar.a(i2 - i, false);
                } else {
                    kmVar.a(i5, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.a.F = true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: android.support.v7.widget.RecyclerView.a(int, int, boolean):void
     arg types: [int, int, int]
     candidates:
      android.support.v7.widget.RecyclerView.a(android.support.v7.widget.RecyclerView, int, int):void
      android.support.v7.widget.RecyclerView.a(int, int, android.view.MotionEvent):boolean
      android.support.v7.widget.RecyclerView.a(int, int, int[]):void
      android.support.v7.widget.RecyclerView.a(int, int, boolean):void */
    public final void a(int i, int i2) {
        this.a.a(i, i2, true);
        RecyclerView recyclerView = this.a;
        recyclerView.F = true;
        recyclerView.D.c += i2;
    }
}
