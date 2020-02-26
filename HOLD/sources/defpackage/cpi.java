package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.appsview.BannerView;
import com.google.android.tvlauncher.home.view.ChannelView;

/* renamed from: cpi  reason: default package */
/* compiled from: PG */
public final class cpi extends cpn implements View.OnClickListener, View.OnLongClickListener, chs, cgx, cez, cex {
    public static /* synthetic */ int x;
    private boolean D;
    private daw E;
    public final BannerView p;
    public dad q;
    public cey r;
    public cew s;
    public int t;
    public int u;
    public final Runnable v = new cpg(this);
    public final /* synthetic */ cpo w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cpi(cpo cpo, View view) {
        super(cpo, view);
        this.w = cpo;
        this.p = (BannerView) view;
        if (!dcy.d(this.y)) {
            this.B.e = new cph(this);
        }
        this.p.setOnClickListener(this);
        this.p.setOnLongClickListener(this);
        BannerView bannerView = this.p;
        bannerView.m = this;
        bannerView.n = this;
        bannerView.l = false;
    }

    /* access modifiers changed from: protected */
    public final void b(boolean z) {
        super.b(z);
        if (this.p.k && !z) {
            v();
        }
        daw daw = this.E;
        if (daw != null && daw.o) {
            daw.a();
        }
    }

    private final boolean z() {
        if (!this.p.k) {
            daw daw = this.E;
            if (daw == null || !daw.o) {
                return false;
            }
            daw.a();
            return true;
        }
        v();
        return true;
    }

    public final void b(Context context) {
        cew cew;
        if (!z() && (cew = this.s) != null) {
            cew.a(context);
        }
    }

    public final void onClick(View view) {
        if (!dcy.b(this.y)) {
            BannerView bannerView = this.p;
            if (!bannerView.k) {
                a(bannerView.c, view);
            } else {
                v();
            }
        } else {
            a(this.p);
        }
    }

    /* access modifiers changed from: package-private */
    public final void v() {
        cpr cpr = this.w.s;
        if (cpr != null) {
            cpp cpp = (cpp) cpr;
            ChannelView channelView = cpp.a.a;
            channelView.D = true;
            if (!dcy.d(channelView.getContext())) {
                cpp.a.b.a((ju) null);
            }
        }
        this.p.b(false);
        dad dad = this.q;
        if (dad != null) {
            dad.b();
        }
        cip cip = this.w.b.k;
        cip.a(cip.b());
    }

    public final void d(Context context) {
        cey cey;
        if (!z() && (cey = this.r) != null) {
            cey.c(context);
        }
    }

    public final boolean onLongClick(View view) {
        BannerView bannerView = this.p;
        if (bannerView.k) {
            return true;
        }
        a(bannerView);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void a(chn chn, View view) {
        try {
            String a = cgb.a(chn.a);
            if (a == null) {
                a = chn.c;
            }
            cfs cfs = new cfs(25, (byte) 0);
            cfs.b(dhs.q);
            cfs.a(d());
            dja g = cfs.g();
            if (g.b) {
                g.b();
                g.b = false;
            }
            dmj dmj = (dmj) g.a;
            dmj dmj2 = dmj.f;
            a.getClass();
            dmj.a |= 1;
            dmj.b = a;
            this.w.a(cfs);
            dbq.a(chn.a, view);
        } catch (ActivityNotFoundException | SecurityException e) {
            Toast.makeText(this.y, (int) R.string.failed_launch, 0).show();
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Cannot start activity : ");
            sb.append(valueOf);
            Log.e("FavLaunchItemsAdapter", sb.toString());
        }
    }

    public final void a(int i) {
        daw daw;
        if ((i == 4 || i == 8) && (daw = this.E) != null && daw.o) {
            daw.a();
        }
    }

    public final void a(chn chn) {
        this.D = this.w.b.c(chn);
        this.p.a(chn);
        chp chp = new chp(this.p.getContext());
        chp.a = new cir(chn, cjd.BANNER, dbq.a(this.y).h());
        chp.b = this.p.d;
        cpo cpo = this.w;
        chp.c = cpo.p;
        chp.d = cpo.n;
        chp.e = cpo.o;
        chp.a();
    }

    private final void a(BannerView bannerView) {
        if (bannerView.hasFocus()) {
            csf csf = this.w.v;
            if (csf == null || !csf.g()) {
                csf csf2 = this.w.w;
                if (csf2 == null || !csf2.g()) {
                    chn chn = bannerView.c;
                    this.E = new daw((Activity) this.y, bannerView.h, bannerView.a, bannerView.getScaleX(), bannerView.getScaleY());
                    boolean z = false;
                    day day = new day(0, this.y.getString(R.string.context_menu_primary_action_text), this.y.getDrawable(R.drawable.ic_context_menu_open_black));
                    day.a();
                    this.E.a(day);
                    if (this.D) {
                        day day2 = new day(1, this.y.getString(R.string.context_menu_can_not_move_text), this.y.getDrawable(R.drawable.ic_context_menu_move_left_right_black));
                        day2.a(false);
                        day day3 = new day(2, this.y.getString(R.string.context_menu_can_not_remove_text), this.y.getDrawable(R.drawable.ic_context_menu_unfavorite_black));
                        day3.a(false);
                        this.E.a(day2);
                        this.E.a(day3);
                    } else {
                        this.E.a(new day(1, this.y.getString(R.string.context_menu_move_text), this.y.getDrawable(R.drawable.ic_context_menu_move_left_right_black)));
                        this.E.a(new day(2, this.y.getString(R.string.context_menu_unfavorite_text), this.y.getDrawable(R.drawable.ic_context_menu_unfavorite_black)));
                        day a = this.E.a(1);
                        cip cip = this.w.b.k;
                        if (cip.a.size() == 1 && cip.a.containsKey(chn)) {
                            z = true;
                        }
                        a.a(!z);
                    }
                    this.E.f = new cpd(this, chn, bannerView);
                    this.E.b();
                }
            }
        }
    }

    public final void w() {
        boolean z = true;
        if (dcy.a(this.y)) {
            this.q.a(0).a(d() < this.w.a() + -2);
            day a = this.q.a(1);
            if (d() <= 0) {
                z = false;
            }
            a.a(z);
            return;
        }
        this.q.a(0).a(d() > 0);
        day a2 = this.q.a(1);
        if (d() >= this.w.a() - 2) {
            z = false;
        }
        a2.a(z);
    }

    public final void x() {
        dad dad = this.q;
        if (dad != null && dad.h) {
            w();
        }
    }

    public final void u() {
        int i;
        super.u();
        View view = this.a;
        BannerView bannerView = (BannerView) view;
        if (!view.isFocused()) {
            i = 4;
        } else {
            i = 0;
        }
        bannerView.f = i;
        bannerView.e.setVisibility(i);
    }
}
