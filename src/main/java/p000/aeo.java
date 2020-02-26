package p000;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aeo */
/* compiled from: PG */
final class aeo {

    /* renamed from: a */
    public final C0525tj f191a;

    /* renamed from: b */
    public final List f192b = new ArrayList();

    /* renamed from: c */
    public final C0512sx f193c;

    /* renamed from: d */
    public boolean f194d;

    /* renamed from: e */
    public ael f195e;

    /* renamed from: f */
    public boolean f196f;

    /* renamed from: g */
    public ael f197g;

    /* renamed from: h */
    public Bitmap f198h;

    /* renamed from: i */
    public ael f199i;

    /* renamed from: j */
    public int f200j;

    /* renamed from: k */
    public int f201k;

    /* renamed from: l */
    public int f202l;

    /* renamed from: m */
    private final Handler f203m;

    /* renamed from: n */
    private final C0630xg f204n;

    /* renamed from: o */
    private boolean f205o;

    /* renamed from: p */
    private C0509su f206p;

    public aeo(C0497si siVar, C0525tj tjVar, int i, int i2, C0544ub ubVar, Bitmap bitmap) {
        C0630xg xgVar = siVar.f10362a;
        C0512sx c = C0497si.m8296c(siVar.mo5919a());
        C0509su a = C0497si.m8296c(siVar.mo5919a()).mo5949d().mo202b(agj.m344b(C0594vy.f10649a).mo212h().mo211g().mo192a(i, i2));
        this.f193c = c;
        Handler handler = new Handler(Looper.getMainLooper(), new aen(this));
        this.f204n = xgVar;
        this.f203m = handler;
        this.f206p = a;
        this.f191a = tjVar;
        mo118a(ubVar, bitmap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo116a() {
        return ((C0529tn) this.f191a).f10503g.f10482c;
    }

    /* renamed from: c */
    public final void mo120c() {
        int i;
        int i2;
        if (this.f194d && !this.f205o) {
            ael ael = this.f199i;
            if (ael == null) {
                this.f205o = true;
                C0529tn tnVar = (C0529tn) this.f191a;
                C0527tl tlVar = tnVar.f10503g;
                int i3 = tlVar.f10482c;
                if (i3 <= 0 || (i2 = tnVar.f10502f) < 0) {
                    i = 0;
                } else {
                    i = i2 < i3 ? ((C0526tk) tlVar.f10484e.get(i2)).f10477i : -1;
                }
                long uptimeMillis = SystemClock.uptimeMillis();
                this.f191a.mo5976a();
                this.f197g = new ael(this.f203m, ((C0529tn) this.f191a).f10502f, uptimeMillis + ((long) i));
                C0509su a = this.f206p.mo202b(new agj((byte) 0).mo197a(new aho(Double.valueOf(Math.random()))));
                a.mo5939a(this.f191a);
                a.mo5937a((ahg) this.f197g);
                return;
            }
            this.f199i = null;
            mo117a(ael);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo117a(ael ael) {
        this.f205o = false;
        if (this.f196f) {
            this.f203m.obtainMessage(2, ael).sendToTarget();
        } else if (this.f194d) {
            if (ael.f187b != null) {
                mo121d();
                ael ael2 = this.f195e;
                this.f195e = ael;
                for (int size = this.f192b.size() - 1; size >= 0; size--) {
                    ((aem) this.f192b.get(size)).mo100c();
                }
                if (ael2 != null) {
                    this.f203m.obtainMessage(2, ael2).sendToTarget();
                }
            }
            mo120c();
        } else {
            this.f199i = ael;
        }
    }

    /* renamed from: d */
    public final void mo121d() {
        Bitmap bitmap = this.f198h;
        if (bitmap != null) {
            this.f204n.mo60a(bitmap);
            this.f198h = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo118a(C0544ub ubVar, Bitmap bitmap) {
        C0544ub ubVar2 = (C0544ub) aic.m542a(ubVar);
        this.f198h = (Bitmap) aic.m542a(bitmap);
        this.f206p = this.f206p.mo202b(new agj((byte) 0).mo198a(ubVar));
        this.f200j = aie.m555a(bitmap);
        this.f201k = bitmap.getWidth();
        this.f202l = bitmap.getHeight();
    }

    /* renamed from: b */
    public final void mo119b() {
        this.f194d = false;
    }
}
