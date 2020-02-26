package defpackage;

import android.os.Handler;
import androidx.leanback.widget.HorizontalGridView;
import androidx.leanback.widget.VerticalGridView;

/* renamed from: cse  reason: default package */
/* compiled from: PG */
public final class cse {
    public int a = 450;
    public boolean b;
    public boolean c = true;
    public final nf d;
    public final int e;
    public final int f;
    public csd g;
    public final Handler h = new Handler();
    public final Runnable i = new csb(this);
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private final ju n;
    private final ne o = new csc(this);

    public cse(nf nfVar, ju juVar) {
        this.n = juVar;
        this.d = nfVar;
        if (nfVar instanceof HorizontalGridView) {
            this.e = 21;
            this.f = 22;
        } else if (nfVar instanceof VerticalGridView) {
            this.e = 20;
            this.f = 19;
        } else {
            throw new IllegalArgumentException("Provided list must be a HorizontalGridView or a VerticalGridView");
        }
        this.d.M = this.o;
    }

    /* access modifiers changed from: package-private */
    public final void b(boolean z) {
        if (!dcy.d(this.d.getContext())) {
            z = false;
        }
        if (this.j != z || !this.l) {
            this.j = z;
            this.l = true;
            if (z) {
                this.d.a(this.n);
            } else {
                this.d.a((ju) null);
            }
        }
    }

    public final void a(boolean z) {
        this.b = z;
        b(!z);
        boolean z2 = false;
        if (this.c && this.b) {
            z2 = true;
        }
        c(z2);
        csd csd = this.g;
        if (csd != null) {
            csd.b(this.b);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nt.b(int, boolean):void
     arg types: [int, int]
     candidates:
      nt.b(android.view.View, android.view.View):void
      nt.b(kc, kk):void
      nt.b(int, int):void
      jx.b(int, int):void
      jx.b(android.view.View, int):void
      jx.b(android.view.View, android.graphics.Rect):void
      jx.b(android.view.View, kc):void
      nt.b(int, boolean):void */
    /* access modifiers changed from: package-private */
    public final void c(boolean z) {
        int i2;
        if (!dcy.d(this.d.getContext())) {
            z = true;
        }
        if (this.k != z || !this.m) {
            this.k = z;
            this.m = true;
            nt ntVar = this.d.L;
            int i3 = ntVar.p;
            int i4 = 0;
            if (((i3 & 131072) != 0) != z) {
                int i5 = i3 & -131073;
                if (z) {
                    i4 = 131072;
                }
                int i6 = i5 | i4;
                ntVar.p = i6;
                if ((i6 & 131072) != 0 && (i2 = ntVar.r) != -1) {
                    int i7 = ntVar.s;
                    ntVar.b(i2, true);
                }
            }
        }
    }
}
