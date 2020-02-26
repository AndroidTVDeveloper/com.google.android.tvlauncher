package p000;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.appsview.BannerView;
import com.google.android.tvlauncher.home.view.ChannelView;

/* renamed from: cpi */
/* compiled from: PG */
public final class cpi extends cpn implements View.OnClickListener, View.OnLongClickListener, chs, cgx, cez, cex {

    /* renamed from: x */
    public static /* synthetic */ int f6873x;

    /* renamed from: D */
    private boolean f6874D;

    /* renamed from: E */
    private daw f6875E;

    /* renamed from: p */
    public final BannerView f6876p;

    /* renamed from: q */
    public dad f6877q;

    /* renamed from: r */
    public cey f6878r;

    /* renamed from: s */
    public cew f6879s;

    /* renamed from: t */
    public int f6880t;

    /* renamed from: u */
    public int f6881u;

    /* renamed from: v */
    public final Runnable f6882v = new cpg(this);

    /* renamed from: w */
    public final /* synthetic */ cpo f6883w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cpi(cpo cpo, View view) {
        super(cpo, view);
        this.f6883w = cpo;
        this.f6876p = (BannerView) view;
        if (!dcy.m6195d(this.f6894y)) {
            this.f6890B.f8308e = new cph(this);
        }
        this.f6876p.setOnClickListener(this);
        this.f6876p.setOnLongClickListener(this);
        BannerView bannerView = this.f6876p;
        bannerView.f6404m = this;
        bannerView.f6405n = this;
        bannerView.f6403l = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo3551b(boolean z) {
        super.mo3551b(z);
        if (this.f6876p.f6402k && !z) {
            mo3554v();
        }
        daw daw = this.f6875E;
        if (daw != null && daw.f8105o) {
            daw.mo4051a();
        }
    }

    /* renamed from: z */
    private final boolean m5462z() {
        if (!this.f6876p.f6402k) {
            daw daw = this.f6875E;
            if (daw == null || !daw.f8105o) {
                return false;
            }
            daw.mo4051a();
            return true;
        }
        mo3554v();
        return true;
    }

    /* renamed from: b */
    public final void mo2703b(Context context) {
        cew cew;
        if (!m5462z() && (cew = this.f6879s) != null) {
            cew.mo2702a(context);
        }
    }

    public final void onClick(View view) {
        if (!dcy.m6193b(this.f6894y)) {
            BannerView bannerView = this.f6876p;
            if (!bannerView.f6402k) {
                mo3550a(bannerView.f6394c, view);
            } else {
                mo3554v();
            }
        } else {
            m5461a(this.f6876p);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo3554v() {
        cpr cpr = this.f6883w.f6913s;
        if (cpr != null) {
            cpp cpp = (cpp) cpr;
            ChannelView channelView = cpp.f6921a.f6922a;
            channelView.f6453D = true;
            if (!dcy.m6195d(channelView.getContext())) {
                cpp.f6921a.f6923b.mo832a((C0266ju) null);
            }
        }
        this.f6876p.mo3228b(false);
        dad dad = this.f6877q;
        if (dad != null) {
            dad.mo4031b();
        }
        cip cip = this.f6883w.f6896b.f5689k;
        cip.mo2867a(cip.mo2869b());
    }

    /* renamed from: d */
    public final void mo2705d(Context context) {
        cey cey;
        if (!m5462z() && (cey = this.f6878r) != null) {
            cey.mo2704c(context);
        }
    }

    public final boolean onLongClick(View view) {
        BannerView bannerView = this.f6876p;
        if (bannerView.f6402k) {
            return true;
        }
        m5461a(bannerView);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3550a(chn chn, View view) {
        try {
            String a = cgb.m4698a(chn.f5561a);
            if (a == null) {
                a = chn.f5563c;
            }
            cfs cfs = new cfs(25, (byte) 0);
            cfs.mo2729b(dhs.f8553q);
            cfs.mo2724a(mo5436d());
            dja g = cfs.mo2734g();
            if (g.f8673b) {
                g.mo4505b();
                g.f8673b = false;
            }
            dmj dmj = (dmj) g.f8672a;
            dmj dmj2 = dmj.f8832f;
            a.getClass();
            dmj.f8833a |= 1;
            dmj.f8834b = a;
            this.f6883w.mo2714a(cfs);
            dbq.m6096a(chn.f5561a, view);
        } catch (ActivityNotFoundException | SecurityException e) {
            Toast.makeText(this.f6894y, (int) R.string.failed_launch, 0).show();
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Cannot start activity : ");
            sb.append(valueOf);
            Log.e("FavLaunchItemsAdapter", sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo2781a(int i) {
        daw daw;
        if ((i == 4 || i == 8) && (daw = this.f6875E) != null && daw.f8105o) {
            daw.mo4051a();
        }
    }

    /* renamed from: a */
    public final void mo3546a(chn chn) {
        this.f6874D = this.f6883w.f6896b.mo2894c(chn);
        this.f6876p.mo3225a(chn);
        chp chp = new chp(this.f6876p.getContext());
        chp.f5574a = new cir(chn, cjd.BANNER, dbq.m6093a(this.f6894y).mo2902h());
        chp.f5575b = this.f6876p.f6395d;
        cpo cpo = this.f6883w;
        chp.f5576c = cpo.f6910p;
        chp.f5577d = cpo.f6908n;
        chp.f5578e = cpo.f6909o;
        chp.mo2819a();
    }

    /* renamed from: a */
    private final void m5461a(BannerView bannerView) {
        if (bannerView.hasFocus()) {
            csf csf = this.f6883w.f6916v;
            if (csf == null || !csf.mo3527g()) {
                csf csf2 = this.f6883w.f6917w;
                if (csf2 == null || !csf2.mo3527g()) {
                    chn chn = bannerView.f6394c;
                    this.f6875E = new daw((Activity) this.f6894y, bannerView.f6399h, bannerView.f6392a, bannerView.getScaleX(), bannerView.getScaleY());
                    boolean z = false;
                    day day = new day(0, this.f6894y.getString(R.string.context_menu_primary_action_text), this.f6894y.getDrawable(R.drawable.ic_context_menu_open_black));
                    day.mo4056a();
                    this.f6875E.mo4053a(day);
                    if (this.f6874D) {
                        day day2 = new day(1, this.f6894y.getString(R.string.context_menu_can_not_move_text), this.f6894y.getDrawable(R.drawable.ic_context_menu_move_left_right_black));
                        day2.mo4058a(false);
                        day day3 = new day(2, this.f6894y.getString(R.string.context_menu_can_not_remove_text), this.f6894y.getDrawable(R.drawable.ic_context_menu_unfavorite_black));
                        day3.mo4058a(false);
                        this.f6875E.mo4053a(day2);
                        this.f6875E.mo4053a(day3);
                    } else {
                        this.f6875E.mo4053a(new day(1, this.f6894y.getString(R.string.context_menu_move_text), this.f6894y.getDrawable(R.drawable.ic_context_menu_move_left_right_black)));
                        this.f6875E.mo4053a(new day(2, this.f6894y.getString(R.string.context_menu_unfavorite_text), this.f6894y.getDrawable(R.drawable.ic_context_menu_unfavorite_black)));
                        day a = this.f6875E.mo4050a(1);
                        cip cip = this.f6883w.f6896b.f5689k;
                        if (cip.f5652a.size() == 1 && cip.f5652a.containsKey(chn)) {
                            z = true;
                        }
                        a.mo4058a(!z);
                    }
                    this.f6875E.f8096f = new cpd(this, chn, bannerView);
                    this.f6875E.mo4054b();
                }
            }
        }
    }

    /* renamed from: w */
    public final void mo3555w() {
        boolean z = true;
        if (dcy.m6191a(this.f6894y)) {
            this.f6877q.mo4028a(0).mo4058a(mo5436d() < this.f6883w.mo2794a() + -2);
            day a = this.f6877q.mo4028a(1);
            if (mo5436d() <= 0) {
                z = false;
            }
            a.mo4058a(z);
            return;
        }
        this.f6877q.mo4028a(0).mo4058a(mo5436d() > 0);
        day a2 = this.f6877q.mo4028a(1);
        if (mo5436d() >= this.f6883w.mo2794a() - 2) {
            z = false;
        }
        a2.mo4058a(z);
    }

    /* renamed from: x */
    public final void mo3556x() {
        dad dad = this.f6877q;
        if (dad != null && dad.f8024h) {
            mo3555w();
        }
    }

    /* renamed from: u */
    public final void mo3548u() {
        int i;
        super.mo3548u();
        View view = this.f9783a;
        BannerView bannerView = (BannerView) view;
        if (!view.isFocused()) {
            i = 4;
        } else {
            i = 0;
        }
        bannerView.f6397f = i;
        bannerView.f6396e.setVisibility(i);
    }
}
