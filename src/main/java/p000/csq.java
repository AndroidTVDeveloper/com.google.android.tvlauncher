package p000;

import android.support.p002v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.tvlauncher.home.view.WatchNextInfoView;

/* renamed from: csq */
/* compiled from: PG */
final class csq extends C0285km implements C0360ng {

    /* renamed from: p */
    public final csj f7267p;

    /* renamed from: q */
    public final Runnable f7268q = new csn(this);

    /* renamed from: r */
    public final /* synthetic */ cst f7269r;

    /* renamed from: s */
    private final ctq f7270s;

    /* renamed from: t */
    private final C0377nx f7271t;

    /* renamed from: u */
    private final C0378ny f7272u;

    /* renamed from: v */
    private final View.OnFocusChangeListener f7273v = new cso(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public csq(cst cst, WatchNextInfoView watchNextInfoView) {
        super(watchNextInfoView);
        this.f7269r = cst;
        this.f7270s = dhz.m6485b(watchNextInfoView.getContext());
        this.f7267p = new csj(watchNextInfoView, this.f7270s);
        if (dcy.m6195d(watchNextInfoView.getContext())) {
            watchNextInfoView.setOnFocusChangeListener(this.f7273v);
        }
        watchNextInfoView.setOnClickListener(new csp(this));
        C0377nx nxVar = new C0377nx();
        this.f7271t = nxVar;
        nxVar.mo5689a(-1.0f);
        C0378ny nyVar = new C0378ny();
        this.f7272u = nyVar;
        nyVar.f10066a = new C0377nx[]{this.f7271t};
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo3713v() {
        csj csj = this.f7267p;
        int i = this.f7269r.f7281d;
        csj.f7236y = i;
        dhz.m6480a(csj.f7212a, i, 1.0d, csj.f7235x);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) csj.f7212a.getLayoutParams();
        int i2 = 0;
        if (dej.m6248a(csj.f7236y)) {
            marginLayoutParams.width = 0;
            marginLayoutParams.setMarginEnd(0);
        } else {
            marginLayoutParams.width = -2;
        }
        csj.f7212a.setLayoutParams(marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) csj.f7213b.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) csj.f7214c.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) csj.f7215d.getLayoutParams();
        int i3 = csj.f7236y;
        switch (i3) {
            case 0:
            case 4:
            case 5:
            case 13:
                marginLayoutParams2.width = csj.f7223l;
                marginLayoutParams3.setMarginStart(csj.f7224m);
                marginLayoutParams3.width = csj.f7225n;
                csj.f7214c.setTextSize(0, csj.f7226o);
                marginLayoutParams4.topMargin = csj.f7227p;
                i2 = csj.f7228q;
                break;
            case 1:
            case 2:
            case 3:
                marginLayoutParams2.width = csj.f7217f;
                marginLayoutParams3.setMarginStart(csj.f7218g);
                marginLayoutParams3.width = csj.f7219h;
                csj.f7214c.setTextSize(0, csj.f7220i);
                marginLayoutParams4.topMargin = csj.f7221j;
                i2 = csj.f7222k;
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 11:
                marginLayoutParams2.width = csj.f7229r;
                marginLayoutParams3.setMarginStart(csj.f7230s);
                marginLayoutParams3.width = csj.f7231t;
                csj.f7214c.setTextSize(0, csj.f7232u);
                marginLayoutParams4.topMargin = csj.f7233v;
                i2 = csj.f7234w;
                break;
            case 10:
            case 12:
                String valueOf = String.valueOf(dej.m6253b(i3));
                throw new IllegalStateException(valueOf.length() == 0 ? new String("Unsupported Watch Next program state: ") : "Unsupported Watch Next program state: ".concat(valueOf));
        }
        marginLayoutParams2.height = marginLayoutParams2.width;
        csj.f7213b.setLayoutParams(marginLayoutParams2);
        csj.f7214c.setLayoutParams(marginLayoutParams3);
        csj.f7215d.setLayoutParams(marginLayoutParams4);
        float f = ((float) i2) / ((float) csj.f7228q);
        csj.f7215d.setScaleX(f);
        csj.f7215d.setScaleY(f);
        if (dcy.m6191a(csj.f7212a.getContext())) {
            csj.f7215d.setPivotX((float) csj.f7228q);
            csj.f7214c.setPivotX((float) marginLayoutParams3.width);
        } else {
            csj.f7215d.setPivotX(0.0f);
            csj.f7214c.setPivotX(0.0f);
        }
        csj.f7215d.setPivotY(0.0f);
        csj.f7214c.setPivotY(0.0f);
    }

    /* renamed from: a */
    public final Object mo2791a() {
        int i;
        if (mo5436d() == -1) {
            return null;
        }
        int i2 = 0;
        if (this.f7269r.f7279b.mo3076j() <= 0) {
            this.f7271t.f10064b = 0;
        } else {
            double f = this.f7269r.mo3719f();
            int i3 = this.f7269r.f7281d;
            switch (i3) {
                case 0:
                    ctq ctq = this.f7270s;
                    i2 = ctq.f7400a;
                    i = ctq.f7403d;
                    break;
                case 1:
                case 2:
                case 3:
                    ctq ctq2 = this.f7270s;
                    i2 = ctq2.f7404e;
                    i = ctq2.f7403d;
                    break;
                case 4:
                case 5:
                case 13:
                    ctq ctq3 = this.f7270s;
                    i2 = ctq3.f7408i;
                    i = ctq3.f7403d;
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                case 11:
                    ctq ctq4 = this.f7270s;
                    i2 = ctq4.f7410k;
                    i = ctq4.f7412m;
                    break;
                case 10:
                case 12:
                    String valueOf = String.valueOf(dej.m6253b(i3));
                    throw new IllegalStateException(valueOf.length() == 0 ? new String("Unsupported Watch Next program state: ") : "Unsupported Watch Next program state: ".concat(valueOf));
                default:
                    i = 0;
                    break;
            }
            C0377nx nxVar = this.f7271t;
            double d = (double) i2;
            Double.isNaN(d);
            nxVar.f10064b = (-((int) (d * f))) - i;
        }
        return this.f7272u;
    }

    /* renamed from: u */
    public final void mo3712u() {
        RecyclerView recyclerView = this.f7269r.f7288k;
        if (recyclerView != null && !recyclerView.mo892l()) {
            this.f7268q.run();
            return;
        }
        Log.w("WatchNextItemsAdapter", "list is still computing layout => schedule card selection change");
        this.f7269r.f7289l.post(this.f7268q);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo3714w() {
        if (this.f7269r.f7279b.mo3076j() > 0) {
            int i = this.f7270s.f7408i;
            double f = this.f7269r.mo3719f();
            ctq ctq = this.f7270s;
            float f2 = ctq.f7414o;
            int i2 = ctq.f7403d;
            csj csj = this.f7267p;
            double d = (double) i;
            Double.isNaN(d);
            double d2 = (double) (f2 - 4.0f);
            Double.isNaN(d2);
            double d3 = d * f * d2;
            double d4 = (double) i2;
            Double.isNaN(d4);
            csj.mo3705a((float) (d3 - d4));
            return;
        }
        this.f7267p.mo3705a(0.0f);
    }
}
