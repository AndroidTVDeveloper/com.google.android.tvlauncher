package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.application.TvLauncherApplication;
import com.google.android.tvlauncher.home.view.ProgramView;
import com.google.android.tvlauncher.instantvideo.widget.InstantVideoView;

/* renamed from: csi  reason: default package */
/* compiled from: PG */
public final class csi {
    public final ProgramView a;
    public long b;
    public int c;
    public String d;
    public boolean e;
    public clv f;
    public final cll g;
    public final Handler h;
    public final dbj i;
    public final clf j;
    public final clz k;
    public String l;
    public final Runnable m;
    public final dcy n;
    private final InstantVideoView o;
    private final Runnable p;

    public csi(ProgramView programView) {
        cll a2 = ((TvLauncherApplication) programView.getContext().getApplicationContext()).a();
        dcy c2 = ((TvLauncherApplication) programView.getContext().getApplicationContext()).c();
        ((TvLauncherApplication) programView.getContext().getApplicationContext()).b();
        TvLauncherApplication tvLauncherApplication = (TvLauncherApplication) programView.getContext().getApplicationContext();
        if (tvLauncherApplication.f == null) {
            synchronized (tvLauncherApplication.c) {
                if (tvLauncherApplication.f == null) {
                    tvLauncherApplication.f = new dcr();
                }
            }
        }
        Handler handler = new Handler();
        dbj e2 = ((TvLauncherApplication) programView.getContext().getApplicationContext()).e();
        TvLauncherApplication tvLauncherApplication2 = (TvLauncherApplication) programView.getContext().getApplicationContext();
        if (tvLauncherApplication2.e == null) {
            synchronized (tvLauncherApplication2.d) {
                if (tvLauncherApplication2.e == null) {
                    tvLauncherApplication2.e = new dbq();
                }
            }
        }
        this.p = new csg(this);
        this.m = new csh(this);
        this.a = programView;
        this.o = (InstantVideoView) programView.findViewById(R.id.preview_video_view);
        this.h = handler;
        this.g = a2;
        this.n = c2;
        this.i = e2;
        this.k = new clz(this.o);
        this.j = new clf(programView.getContext());
    }

    public final boolean d() {
        clv clv;
        return this.e && (clv = this.f) != null && clv.a();
    }

    public final void b() {
        this.h.removeCallbacks(this.p);
        this.h.removeCallbacks(this.m);
        c();
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        long currentTimeMillis = System.currentTimeMillis();
        clv clv = this.f;
        if (clv != null) {
            String str = this.d;
            cmc cmc = clv.l;
            String str2 = null;
            if (cmc != null && cmc.b == 2) {
                str2 = ((cmj) cmc.c).d;
            }
            if (TextUtils.equals(str, str2) && this.f.b() > currentTimeMillis) {
                this.h.removeCallbacks(this.p);
                this.h.postDelayed(this.p, this.f.b() - currentTimeMillis);
                return true;
            }
        }
        cll cll = this.g;
        cll.c.a(new clg(cll.a, this.b, this.d, cll.b));
        return false;
    }

    public final void c() {
        if (d()) {
            this.k.a();
            clz clz = this.k;
            clz.e.remove(this.j);
        }
    }
}
