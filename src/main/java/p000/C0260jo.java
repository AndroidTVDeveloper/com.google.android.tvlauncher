package p000;

import android.support.p002v7.widget.RecyclerView;
import android.view.View;

/* renamed from: jo */
/* compiled from: PG */
public final class C0260jo implements C0185gu {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView f9697a;

    public C0260jo(RecyclerView recyclerView) {
        this.f9697a = recyclerView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5302a(C0186gv gvVar) {
        int i = gvVar.f9424a;
        if (i == 1) {
            this.f9697a.f1068h.mo5356b(gvVar.f9425b, gvVar.f9427d);
        } else if (i == 2) {
            this.f9697a.f1068h.mo5369d(gvVar.f9425b, gvVar.f9427d);
        } else if (i == 8) {
            this.f9697a.f1068h.mo5365c(gvVar.f9425b, gvVar.f9427d);
        }
    }

    /* renamed from: a */
    public final C0285km mo5075a(int i) {
        RecyclerView recyclerView = this.f9697a;
        int b = recyclerView.f1063c.mo5201b();
        int i2 = 0;
        C0285km kmVar = null;
        while (true) {
            if (i2 >= b) {
                break;
            }
            C0285km c = RecyclerView.m1301c(recyclerView.f1063c.mo5204c(i2));
            if (c != null && !c.mo5445m() && c.f9785c == i) {
                if (!recyclerView.f1063c.mo5205c(c.f9783a)) {
                    kmVar = c;
                    break;
                }
                kmVar = c;
            }
            i2++;
        }
        if (kmVar == null || this.f9697a.f1063c.mo5205c(kmVar.f9783a)) {
            return null;
        }
        return kmVar;
    }

    /* renamed from: a */
    public final void mo5077a(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f9697a;
        int b = recyclerView.f1063c.mo5201b();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < b; i6++) {
            View c = recyclerView.f1063c.mo5204c(i6);
            C0285km c2 = RecyclerView.m1301c(c);
            if (c2 != null && !c2.mo5434b() && (i4 = c2.f9785c) >= i && i4 < i5) {
                c2.mo5433b(2);
                c2.mo5430a(obj);
                ((C0270jy) c.getLayoutParams()).f9719c = true;
            }
        }
        C0275kc kcVar = recyclerView.f1041a;
        for (int size = kcVar.f9728c.size() - 1; size >= 0; size--) {
            C0285km kmVar = (C0285km) kcVar.f9728c.get(size);
            if (kmVar != null && (i3 = kmVar.f9785c) >= i && i3 < i5) {
                kmVar.mo5433b(2);
                kcVar.mo5398b(size);
            }
        }
        this.f9697a.f1027G = true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: km.a(int, boolean):void
     arg types: [int, int]
     candidates:
      km.a(int, int):void
      km.a(kc, boolean):void
      km.a(int, boolean):void */
    /* renamed from: b */
    public final void mo5078b(int i, int i2) {
        RecyclerView recyclerView = this.f9697a;
        int b = recyclerView.f1063c.mo5201b();
        for (int i3 = 0; i3 < b; i3++) {
            C0285km c = RecyclerView.m1301c(recyclerView.f1063c.mo5204c(i3));
            if (c != null && !c.mo5434b() && c.f9785c >= i) {
                c.mo5429a(i2, false);
                recyclerView.f1024D.f9764f = true;
            }
        }
        C0275kc kcVar = recyclerView.f1041a;
        int size = kcVar.f9728c.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0285km kmVar = (C0285km) kcVar.f9728c.get(i4);
            if (kmVar != null && kmVar.f9785c >= i) {
                kmVar.mo5429a(i2, true);
            }
        }
        recyclerView.requestLayout();
        this.f9697a.f1026F = true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: km.a(int, boolean):void
     arg types: [int, int]
     candidates:
      km.a(int, int):void
      km.a(kc, boolean):void
      km.a(int, boolean):void */
    /* renamed from: c */
    public final void mo5079c(int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f9697a;
        int b = recyclerView.f1063c.mo5201b();
        int i5 = i < i2 ? -1 : 1;
        int i6 = i < i2 ? i2 : i;
        int i7 = i < i2 ? i : i2;
        for (int i8 = 0; i8 < b; i8++) {
            C0285km c = RecyclerView.m1301c(recyclerView.f1063c.mo5204c(i8));
            if (c != null && (i4 = c.f9785c) >= i7 && i4 <= i6) {
                if (i4 == i) {
                    c.mo5429a(i2 - i, false);
                } else {
                    c.mo5429a(i5, false);
                }
                recyclerView.f1024D.f9764f = true;
            }
        }
        C0275kc kcVar = recyclerView.f1041a;
        int size = kcVar.f9728c.size();
        for (int i9 = 0; i9 < size; i9++) {
            C0285km kmVar = (C0285km) kcVar.f9728c.get(i9);
            if (kmVar != null && (i3 = kmVar.f9785c) >= i7 && i3 <= i6) {
                if (i3 == i) {
                    kmVar.mo5429a(i2 - i, false);
                } else {
                    kmVar.mo5429a(i5, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.f9697a.f1026F = true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: android.support.v7.widget.RecyclerView.a(int, int, boolean):void
     arg types: [int, int, int]
     candidates:
      android.support.v7.widget.RecyclerView.a(android.support.v7.widget.RecyclerView, int, int):void
      android.support.v7.widget.RecyclerView.a(int, int, android.view.MotionEvent):boolean
      android.support.v7.widget.RecyclerView.a(int, int, int[]):void
      android.support.v7.widget.RecyclerView.a(int, int, boolean):void */
    /* renamed from: a */
    public final void mo5076a(int i, int i2) {
        this.f9697a.mo827a(i, i2, true);
        RecyclerView recyclerView = this.f9697a;
        recyclerView.f1026F = true;
        recyclerView.f1024D.f9761c += i2;
    }
}
