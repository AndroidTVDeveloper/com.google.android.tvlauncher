package p000;

import android.os.Handler;
import androidx.leanback.widget.HorizontalGridView;
import androidx.leanback.widget.VerticalGridView;

/* renamed from: cse */
/* compiled from: PG */
public final class cse {

    /* renamed from: a */
    public int f7167a = 450;

    /* renamed from: b */
    public boolean f7168b;

    /* renamed from: c */
    public boolean f7169c = true;

    /* renamed from: d */
    public final C0359nf f7170d;

    /* renamed from: e */
    public final int f7171e;

    /* renamed from: f */
    public final int f7172f;

    /* renamed from: g */
    public csd f7173g;

    /* renamed from: h */
    public final Handler f7174h = new Handler();

    /* renamed from: i */
    public final Runnable f7175i = new csb(this);

    /* renamed from: j */
    private boolean f7176j;

    /* renamed from: k */
    private boolean f7177k;

    /* renamed from: l */
    private boolean f7178l;

    /* renamed from: m */
    private boolean f7179m;

    /* renamed from: n */
    private final C0266ju f7180n;

    /* renamed from: o */
    private final C0358ne f7181o = new csc(this);

    public cse(C0359nf nfVar, C0266ju juVar) {
        this.f7180n = juVar;
        this.f7170d = nfVar;
        if (nfVar instanceof HorizontalGridView) {
            this.f7171e = 21;
            this.f7172f = 22;
        } else if (nfVar instanceof VerticalGridView) {
            this.f7171e = 20;
            this.f7172f = 19;
        } else {
            throw new IllegalArgumentException("Provided list must be a HorizontalGridView or a VerticalGridView");
        }
        this.f7170d.f9986M = this.f7181o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo3697b(boolean z) {
        if (!dcy.m6195d(this.f7170d.getContext())) {
            z = false;
        }
        if (this.f7176j != z || !this.f7178l) {
            this.f7176j = z;
            this.f7178l = true;
            if (z) {
                this.f7170d.mo832a(this.f7180n);
            } else {
                this.f7170d.mo832a((C0266ju) null);
            }
        }
    }

    /* renamed from: a */
    public final void mo3696a(boolean z) {
        this.f7168b = z;
        mo3697b(!z);
        boolean z2 = false;
        if (this.f7169c && this.f7168b) {
            z2 = true;
        }
        mo3698c(z2);
        csd csd = this.f7173g;
        if (csd != null) {
            csd.mo3519b(this.f7168b);
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
    /* renamed from: c */
    public final void mo3698c(boolean z) {
        int i;
        if (!dcy.m6195d(this.f7170d.getContext())) {
            z = true;
        }
        if (this.f7177k != z || !this.f7179m) {
            this.f7177k = z;
            this.f7179m = true;
            C0373nt ntVar = this.f7170d.f9985L;
            int i2 = ntVar.f10047p;
            int i3 = 0;
            if (((i2 & 131072) != 0) != z) {
                int i4 = i2 & -131073;
                if (z) {
                    i3 = 131072;
                }
                int i5 = i4 | i3;
                ntVar.f10047p = i5;
                if ((i5 & 131072) != 0 && (i = ntVar.f10049r) != -1) {
                    int i6 = ntVar.f10050s;
                    ntVar.mo5664b(i, true);
                }
            }
        }
    }
}
