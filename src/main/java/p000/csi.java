package p000;

import android.os.Handler;
import android.text.TextUtils;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.application.TvLauncherApplication;
import com.google.android.tvlauncher.home.view.ProgramView;
import com.google.android.tvlauncher.instantvideo.widget.InstantVideoView;

/* renamed from: csi */
/* compiled from: PG */
public final class csi {

    /* renamed from: a */
    public final ProgramView f7184a;

    /* renamed from: b */
    public long f7185b;

    /* renamed from: c */
    public int f7186c;

    /* renamed from: d */
    public String f7187d;

    /* renamed from: e */
    public boolean f7188e;

    /* renamed from: f */
    public clv f7189f;

    /* renamed from: g */
    public final cll f7190g;

    /* renamed from: h */
    public final Handler f7191h;

    /* renamed from: i */
    public final dbj f7192i;

    /* renamed from: j */
    public final clf f7193j;

    /* renamed from: k */
    public final clz f7194k;

    /* renamed from: l */
    public String f7195l;

    /* renamed from: m */
    public final Runnable f7196m;

    /* renamed from: n */
    public final dcy f7197n;

    /* renamed from: o */
    private final InstantVideoView f7198o;

    /* renamed from: p */
    private final Runnable f7199p;

    public csi(ProgramView programView) {
        cll a = ((TvLauncherApplication) programView.getContext().getApplicationContext()).mo3214a();
        dcy c = ((TvLauncherApplication) programView.getContext().getApplicationContext()).mo3216c();
        ((TvLauncherApplication) programView.getContext().getApplicationContext()).mo3215b();
        TvLauncherApplication tvLauncherApplication = (TvLauncherApplication) programView.getContext().getApplicationContext();
        if (tvLauncherApplication.f6371f == null) {
            synchronized (tvLauncherApplication.f6368c) {
                if (tvLauncherApplication.f6371f == null) {
                    tvLauncherApplication.f6371f = new dcr();
                }
            }
        }
        Handler handler = new Handler();
        dbj e = ((TvLauncherApplication) programView.getContext().getApplicationContext()).mo2750e();
        TvLauncherApplication tvLauncherApplication2 = (TvLauncherApplication) programView.getContext().getApplicationContext();
        if (tvLauncherApplication2.f6370e == null) {
            synchronized (tvLauncherApplication2.f6369d) {
                if (tvLauncherApplication2.f6370e == null) {
                    tvLauncherApplication2.f6370e = new dbq();
                }
            }
        }
        this.f7199p = new csg(this);
        this.f7196m = new csh(this);
        this.f7184a = programView;
        this.f7198o = (InstantVideoView) programView.findViewById(R.id.preview_video_view);
        this.f7191h = handler;
        this.f7190g = a;
        this.f7197n = c;
        this.f7192i = e;
        this.f7194k = new clz(this.f7198o);
        this.f7193j = new clf(programView.getContext());
    }

    /* renamed from: d */
    public final boolean mo3704d() {
        clv clv;
        return this.f7188e && (clv = this.f7189f) != null && clv.mo3101a();
    }

    /* renamed from: b */
    public final void mo3702b() {
        this.f7191h.removeCallbacks(this.f7199p);
        this.f7191h.removeCallbacks(this.f7196m);
        mo3703c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo3701a() {
        long currentTimeMillis = System.currentTimeMillis();
        clv clv = this.f7189f;
        if (clv != null) {
            String str = this.f7187d;
            cmc cmc = clv.f5952l;
            String str2 = null;
            if (cmc != null && cmc.f5968b == 2) {
                str2 = ((cmj) cmc.f5969c).f6003d;
            }
            if (TextUtils.equals(str, str2) && this.f7189f.mo3107b() > currentTimeMillis) {
                this.f7191h.removeCallbacks(this.f7199p);
                this.f7191h.postDelayed(this.f7199p, this.f7189f.mo3107b() - currentTimeMillis);
                return true;
            }
        }
        cll cll = this.f7190g;
        cll.f5918c.mo3105a(new clg(cll.f5916a, this.f7185b, this.f7187d, cll.f5917b));
        return false;
    }

    /* renamed from: c */
    public final void mo3703c() {
        if (mo3704d()) {
            this.f7194k.mo3112a();
            clz clz = this.f7194k;
            clz.f5959e.remove(this.f7193j);
        }
    }
}
