package p000;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: ald */
/* compiled from: PG */
public final class ald extends aiy implements akt {

    /* renamed from: b */
    public final ajy f644b;

    /* renamed from: c */
    public final Handler f645c;

    /* renamed from: d */
    public final CopyOnWriteArraySet f646d = new CopyOnWriteArraySet();

    /* renamed from: e */
    public final CopyOnWriteArraySet f647e = new CopyOnWriteArraySet();

    /* renamed from: f */
    public final CopyOnWriteArraySet f648f = new CopyOnWriteArraySet();

    /* renamed from: g */
    public final CopyOnWriteArraySet f649g = new CopyOnWriteArraySet();

    /* renamed from: h */
    public final CopyOnWriteArraySet f650h = new CopyOnWriteArraySet();

    /* renamed from: i */
    public final CopyOnWriteArraySet f651i = new CopyOnWriteArraySet();

    /* renamed from: j */
    public final bhn f652j;

    /* renamed from: k */
    public final alk f653k;

    /* renamed from: l */
    public final aiv f654l;

    /* renamed from: m */
    public Surface f655m;

    /* renamed from: n */
    public boolean f656n;

    /* renamed from: o */
    public SurfaceHolder f657o;

    /* renamed from: p */
    public int f658p;

    /* renamed from: q */
    public float f659q;

    /* renamed from: r */
    public awv f660r;

    /* renamed from: s */
    public List f661s;

    /* renamed from: t */
    private final akx[] f662t;

    /* renamed from: u */
    private final alc f663u = new alc(this);

    /* renamed from: v */
    private int f664v;

    /* renamed from: w */
    private int f665w;

    /* renamed from: x */
    private boolean f666x;

    @Deprecated
    public ald(Context context, ala ala, bgq bgq, akk akk, bhn bhn, alk alk, bkf bkf, Looper looper) {
        Context context2 = context;
        bhn bhn2 = bhn;
        alk alk2 = alk;
        this.f652j = bhn2;
        this.f653k = alk2;
        Handler handler = new Handler(looper);
        this.f645c = handler;
        alc alc = this.f663u;
        ArrayList arrayList = new ArrayList();
        ajg ajg = (ajg) ala;
        arrayList.add(new blx(ajg.f449a, ajg.f450b, handler, alc));
        Context context3 = ajg.f449a;
        boolean z = false;
        arrayList.add(new amy(context3, ajg.f450b, handler, alc, new amu(alr.m1041a(context3), new alu[0])));
        arrayList.add(new bdt(alc, handler.getLooper()));
        arrayList.add(new auc(alc, handler.getLooper()));
        arrayList.add(new bml());
        this.f662t = (akx[]) arrayList.toArray(new akx[0]);
        this.f659q = 1.0f;
        this.f658p = 0;
        alq alq = alq.f716a;
        this.f661s = Collections.emptyList();
        ajy ajy = new ajy(this.f662t, bgq, akk, bhn, bkf, looper);
        this.f644b = ajy;
        bks.m3512b(alk2.f698c == null || alk2.f697b.f688a.isEmpty());
        alk2.f698c = (akt) bks.m3507a(ajy);
        mo388a((aks) alk2);
        mo388a((aks) this.f663u);
        this.f650h.add(alk2);
        this.f646d.add(alk2);
        this.f651i.add(alk2);
        this.f647e.add(alk2);
        this.f649g.add(alk2);
        Handler handler2 = this.f645c;
        bkn bkn = ((bid) bhn2).f4029f;
        bks.m3510a(handler2 != null ? true : z);
        bkn.mo2040a(alk2);
        bkn.f4226a.add(new bkm(handler2, alk2));
        new akr(context2, this.f645c);
        this.f654l = new aiv(context2, this.f645c, this.f663u);
        new bsh(context2);
    }

    /* renamed from: a */
    public final void mo388a(aks aks) {
        mo523u();
        this.f644b.f480e.addIfAbsent(new aiw(aks));
    }

    /* renamed from: e */
    public final Looper mo391e() {
        return this.f644b.f478c.getLooper();
    }

    /* renamed from: q */
    public final long mo403q() {
        mo523u();
        return this.f644b.mo403q();
    }

    /* renamed from: o */
    public final int mo401o() {
        mo523u();
        return this.f644b.mo401o();
    }

    /* renamed from: p */
    public final int mo402p() {
        mo523u();
        return this.f644b.mo402p();
    }

    /* renamed from: l */
    public final long mo398l() {
        mo523u();
        return this.f644b.mo398l();
    }

    /* renamed from: r */
    public final alh mo404r() {
        mo523u();
        return this.f644b.mo404r();
    }

    /* renamed from: k */
    public final int mo397k() {
        mo523u();
        return this.f644b.mo397k();
    }

    /* renamed from: h */
    public final boolean mo394h() {
        mo523u();
        return this.f644b.f482g;
    }

    /* renamed from: f */
    public final int mo392f() {
        mo523u();
        return this.f644b.mo392f();
    }

    /* renamed from: g */
    public final int mo393g() {
        mo523u();
        return this.f644b.f483h;
    }

    /* renamed from: i */
    public final int mo395i() {
        mo523u();
        return this.f644b.f484i;
    }

    /* renamed from: j */
    public final boolean mo396j() {
        mo523u();
        return this.f644b.f485j;
    }

    /* renamed from: m */
    public final long mo399m() {
        mo523u();
        return this.f644b.mo399m();
    }

    /* renamed from: n */
    public final boolean mo400n() {
        mo523u();
        return this.f644b.mo400n();
    }

    /* renamed from: a */
    public final void mo517a(int i, int i2) {
        if (i != this.f664v || i2 != this.f665w) {
            this.f664v = i;
            this.f665w = i2;
            Iterator it = this.f646d.iterator();
            while (it.hasNext()) {
                ((bmb) it.next()).mo569o();
            }
        }
    }

    /* renamed from: b */
    public final void mo390b(aks aks) {
        mo523u();
        ajy ajy = this.f644b;
        Iterator it = ajy.f480e.iterator();
        while (it.hasNext()) {
            aiw aiw = (aiw) it.next();
            if (aiw.f417a.equals(aks)) {
                aiw.f418b = true;
                ajy.f480e.remove(aiw);
            }
        }
    }

    /* renamed from: s */
    public final void mo405s() {
        SurfaceHolder surfaceHolder = this.f657o;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f663u);
            this.f657o = null;
        }
    }

    /* renamed from: t */
    public final void mo522t() {
        float f = this.f659q * this.f654l.f414c;
        for (akx akx : this.f662t) {
            if (akx.mo344a() == 1) {
                akw a = this.f644b.mo385a(akx);
                a.mo480a(2);
                a.mo481a(Float.valueOf(f));
                a.mo483b();
            }
        }
    }

    /* renamed from: a */
    public final void mo389a(boolean z) {
        mo523u();
        aiv aiv = this.f654l;
        int f = mo392f();
        int i = 1;
        if (!z) {
            aiv.mo335b();
            i = -1;
        } else if (f != 1) {
            i = aiv.mo334a();
        }
        mo521a(z, i);
    }

    @Deprecated
    /* renamed from: a */
    public final void mo520a(bmk bmk) {
        this.f650h.retainAll(Collections.singleton(this.f653k));
        if (bmk != null) {
            this.f650h.add(bmk);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ald.a(android.view.Surface, boolean):void
     arg types: [?[OBJECT, ARRAY], int]
     candidates:
      ald.a(int, int):void
      ald.a(boolean, int):void
      ald.a(android.view.Surface, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ald.a(android.view.Surface, boolean):void
     arg types: [android.view.Surface, int]
     candidates:
      ald.a(int, int):void
      ald.a(boolean, int):void
      ald.a(android.view.Surface, boolean):void */
    /* renamed from: a */
    public final void mo519a(SurfaceHolder surfaceHolder) {
        mo523u();
        mo405s();
        this.f657o = surfaceHolder;
        if (surfaceHolder == null) {
            mo518a((Surface) null, false);
            mo517a(0, 0);
            return;
        }
        surfaceHolder.addCallback(this.f663u);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            mo518a((Surface) null, false);
            mo517a(0, 0);
            return;
        }
        mo518a(surface, false);
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        mo517a(surfaceFrame.width(), surfaceFrame.height());
    }

    /* renamed from: a */
    public final void mo518a(Surface surface, boolean z) {
        ArrayList<akw> arrayList = new ArrayList<>();
        for (akx akx : this.f662t) {
            if (akx.mo344a() == 2) {
                akw a = this.f644b.mo385a(akx);
                a.mo480a(1);
                a.mo481a(surface);
                a.mo483b();
                arrayList.add(a);
            }
        }
        Surface surface2 = this.f655m;
        if (!(surface2 == null || surface2 == surface)) {
            try {
                for (akw a2 : arrayList) {
                    a2.mo479a();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            if (this.f656n) {
                this.f655m.release();
            }
        }
        this.f655m = surface;
        this.f656n = z;
    }

    /* renamed from: a */
    public final void mo521a(boolean z, int i) {
        boolean z2;
        int i2;
        boolean z3 = true;
        if (z) {
            z2 = i != -1;
        } else {
            z2 = false;
        }
        if (!z2) {
            i2 = 0;
        } else {
            i2 = i != 1 ? 1 : 0;
        }
        ajy ajy = this.f644b;
        boolean a = ajy.mo339a();
        int i3 = (!ajy.f482g || ajy.f483h != 0) ? 0 : 1;
        int i4 = (z2 && i2 == 0) ? 1 : 0;
        if (i3 != i4) {
            ajy.f479d.f516a.mo2041a(1, i4).sendToTarget();
        }
        boolean z4 = ajy.f482g != z2;
        boolean z5 = ajy.f483h != i2;
        ajy.f482g = z2;
        ajy.f483h = i2;
        if (a == ajy.mo339a()) {
            z3 = false;
        }
        if (z4 || z5 || z3) {
            ajy.mo386a(new aji(z4, ajy.f491p.f615e, z5, z3));
        }
    }

    /* renamed from: u */
    public final void mo523u() {
        IllegalStateException illegalStateException;
        if (Looper.myLooper() != mo391e()) {
            if (!this.f666x) {
                illegalStateException = new IllegalStateException();
            } else {
                illegalStateException = null;
            }
            Log.w("SimpleExoPlayer", "Player is accessed on the wrong thread. See https://exoplayer.dev/issues/player-accessed-on-wrong-thread", illegalStateException);
            this.f666x = true;
        }
    }
}
