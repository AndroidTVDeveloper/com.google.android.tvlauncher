package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.tvlauncher.home.view.WatchNextInfoView;

/* renamed from: csq  reason: default package */
/* compiled from: PG */
final class csq extends km implements ng {
    public final csj p;
    public final Runnable q = new csn(this);
    public final /* synthetic */ cst r;
    private final ctq s;
    private final nx t;
    private final ny u;
    private final View.OnFocusChangeListener v = new cso(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public csq(cst cst, WatchNextInfoView watchNextInfoView) {
        super(watchNextInfoView);
        this.r = cst;
        this.s = dhz.b(watchNextInfoView.getContext());
        this.p = new csj(watchNextInfoView, this.s);
        if (dcy.d(watchNextInfoView.getContext())) {
            watchNextInfoView.setOnFocusChangeListener(this.v);
        }
        watchNextInfoView.setOnClickListener(new csp(this));
        nx nxVar = new nx();
        this.t = nxVar;
        nxVar.a(-1.0f);
        ny nyVar = new ny();
        this.u = nyVar;
        nyVar.a = new nx[]{this.t};
    }

    /* access modifiers changed from: package-private */
    public final void v() {
        csj csj = this.p;
        int i = this.r.d;
        csj.y = i;
        dhz.a(csj.a, i, 1.0d, csj.x);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) csj.a.getLayoutParams();
        int i2 = 0;
        if (dej.a(csj.y)) {
            marginLayoutParams.width = 0;
            marginLayoutParams.setMarginEnd(0);
        } else {
            marginLayoutParams.width = -2;
        }
        csj.a.setLayoutParams(marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) csj.b.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) csj.c.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) csj.d.getLayoutParams();
        int i3 = csj.y;
        switch (i3) {
            case 0:
            case 4:
            case 5:
            case 13:
                marginLayoutParams2.width = csj.l;
                marginLayoutParams3.setMarginStart(csj.m);
                marginLayoutParams3.width = csj.n;
                csj.c.setTextSize(0, csj.o);
                marginLayoutParams4.topMargin = csj.p;
                i2 = csj.q;
                break;
            case 1:
            case 2:
            case 3:
                marginLayoutParams2.width = csj.f;
                marginLayoutParams3.setMarginStart(csj.g);
                marginLayoutParams3.width = csj.h;
                csj.c.setTextSize(0, csj.i);
                marginLayoutParams4.topMargin = csj.j;
                i2 = csj.k;
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 11:
                marginLayoutParams2.width = csj.r;
                marginLayoutParams3.setMarginStart(csj.s);
                marginLayoutParams3.width = csj.t;
                csj.c.setTextSize(0, csj.u);
                marginLayoutParams4.topMargin = csj.v;
                i2 = csj.w;
                break;
            case 10:
            case 12:
                String valueOf = String.valueOf(dej.b(i3));
                throw new IllegalStateException(valueOf.length() == 0 ? new String("Unsupported Watch Next program state: ") : "Unsupported Watch Next program state: ".concat(valueOf));
        }
        marginLayoutParams2.height = marginLayoutParams2.width;
        csj.b.setLayoutParams(marginLayoutParams2);
        csj.c.setLayoutParams(marginLayoutParams3);
        csj.d.setLayoutParams(marginLayoutParams4);
        float f = ((float) i2) / ((float) csj.q);
        csj.d.setScaleX(f);
        csj.d.setScaleY(f);
        if (dcy.a(csj.a.getContext())) {
            csj.d.setPivotX((float) csj.q);
            csj.c.setPivotX((float) marginLayoutParams3.width);
        } else {
            csj.d.setPivotX(0.0f);
            csj.c.setPivotX(0.0f);
        }
        csj.d.setPivotY(0.0f);
        csj.c.setPivotY(0.0f);
    }

    public final Object a() {
        int i;
        if (d() == -1) {
            return null;
        }
        int i2 = 0;
        if (this.r.b.j() <= 0) {
            this.t.b = 0;
        } else {
            double f = this.r.f();
            int i3 = this.r.d;
            switch (i3) {
                case 0:
                    ctq ctq = this.s;
                    i2 = ctq.a;
                    i = ctq.d;
                    break;
                case 1:
                case 2:
                case 3:
                    ctq ctq2 = this.s;
                    i2 = ctq2.e;
                    i = ctq2.d;
                    break;
                case 4:
                case 5:
                case 13:
                    ctq ctq3 = this.s;
                    i2 = ctq3.i;
                    i = ctq3.d;
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                case 11:
                    ctq ctq4 = this.s;
                    i2 = ctq4.k;
                    i = ctq4.m;
                    break;
                case 10:
                case 12:
                    String valueOf = String.valueOf(dej.b(i3));
                    throw new IllegalStateException(valueOf.length() == 0 ? new String("Unsupported Watch Next program state: ") : "Unsupported Watch Next program state: ".concat(valueOf));
                default:
                    i = 0;
                    break;
            }
            nx nxVar = this.t;
            double d = (double) i2;
            Double.isNaN(d);
            nxVar.b = (-((int) (d * f))) - i;
        }
        return this.u;
    }

    public final void u() {
        RecyclerView recyclerView = this.r.k;
        if (recyclerView != null && !recyclerView.l()) {
            this.q.run();
            return;
        }
        Log.w("WatchNextItemsAdapter", "list is still computing layout => schedule card selection change");
        this.r.l.post(this.q);
    }

    /* access modifiers changed from: package-private */
    public final void w() {
        if (this.r.b.j() > 0) {
            int i = this.s.i;
            double f = this.r.f();
            ctq ctq = this.s;
            float f2 = ctq.o;
            int i2 = ctq.d;
            csj csj = this.p;
            double d = (double) i;
            Double.isNaN(d);
            double d2 = (double) (f2 - 4.0f);
            Double.isNaN(d2);
            double d3 = d * f * d2;
            double d4 = (double) i2;
            Double.isNaN(d4);
            csj.a((float) (d3 - d4));
            return;
        }
        this.p.a(0.0f);
    }
}
