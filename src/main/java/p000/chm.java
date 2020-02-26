package p000;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.appsview.BannerView;

/* renamed from: chm */
/* compiled from: PG */
public final class chm {

    /* renamed from: A */
    private final int f5533A;

    /* renamed from: B */
    private final int f5534B;

    /* renamed from: a */
    public final View f5535a;

    /* renamed from: b */
    public final ProgressBar f5536b;

    /* renamed from: c */
    public final ImageView f5537c = ((ImageView) this.f5535a.findViewById(R.id.app_install_banner));

    /* renamed from: d */
    public final ImageView f5538d;

    /* renamed from: e */
    public final TextView f5539e;

    /* renamed from: f */
    public final FrameLayout f5540f;

    /* renamed from: g */
    public final int f5541g;

    /* renamed from: h */
    public final Drawable f5542h;

    /* renamed from: i */
    public final String f5543i;

    /* renamed from: j */
    public final String f5544j;

    /* renamed from: k */
    public final String f5545k;

    /* renamed from: l */
    public final String f5546l;

    /* renamed from: m */
    public final String f5547m;

    /* renamed from: n */
    public Animator f5548n;

    /* renamed from: o */
    public final cux f5549o;

    /* renamed from: p */
    public boolean f5550p;

    /* renamed from: q */
    public String f5551q;

    /* renamed from: r */
    private final int f5552r;

    /* renamed from: s */
    private final int f5553s;

    /* renamed from: t */
    private final int f5554t;

    /* renamed from: u */
    private final int f5555u;

    /* renamed from: v */
    private final float f5556v;

    /* renamed from: w */
    private final float f5557w;

    /* renamed from: x */
    private final float f5558x;

    /* renamed from: y */
    private final Drawable f5559y;

    /* renamed from: z */
    private final int f5560z;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.tvlauncher.appsview.BannerView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public chm(BannerView bannerView) {
        Context context = bannerView.getContext();
        View inflate = LayoutInflater.from(context).inflate((int) R.layout.install_state_overlay, (ViewGroup) bannerView, false);
        this.f5535a = inflate;
        this.f5536b = (ProgressBar) inflate.findViewById(R.id.progress_bar);
        Resources resources = context.getResources();
        this.f5552r = resources.getDimensionPixelSize(R.dimen.app_banner_image_max_width);
        this.f5553s = resources.getDimensionPixelSize(R.dimen.app_banner_image_max_height);
        this.f5549o = new cux(this.f5537c, dcy.m6184a(resources, (int) R.dimen.unfocused_channel_dimming_factor1), dcy.m6184a(resources, (int) R.dimen.unfocused_channel_dimming_factor2));
        this.f5541g = resources.getInteger(R.integer.banner_install_anim_duration);
        this.f5554t = context.getColor(R.color.app_banner_background_color_gray_scale);
        float fraction = resources.getFraction(R.fraction.home_app_banner_focused_scale, 1, 1);
        this.f5555u = resources.getDimensionPixelSize(R.dimen.app_banner_installing_icon_max_size);
        this.f5556v = ((float) resources.getDimensionPixelSize(R.dimen.card_rounded_corner_radius)) * fraction;
        this.f5557w = dcy.m6184a(resources, (int) R.dimen.gray_scale_saturation);
        this.f5558x = dcy.m6184a(resources, (int) R.dimen.install_icon_darken_factor);
        this.f5540f = bannerView.f6399h;
        this.f5539e = bannerView.f6396e;
        this.f5538d = (ImageView) this.f5540f.findViewById(R.id.banner_image);
        this.f5542h = new ColorDrawable(C0035bg.m3116b(context, R.color.app_banner_background_color));
        this.f5559y = context.getDrawable(R.drawable.system_default_app_icon_banner);
        this.f5543i = resources.getString(R.string.downloading);
        this.f5544j = resources.getString(R.string.installing);
        this.f5545k = resources.getString(R.string.install_pending);
        this.f5546l = resources.getString(R.string.update_pending);
        this.f5547m = resources.getString(R.string.restore_pending);
        this.f5560z = resources.getDimensionPixelSize(R.dimen.install_progress_bar_height);
        this.f5534B = resources.getDimensionPixelSize(R.dimen.install_progress_bar_indeterminate_height);
        this.f5533A = resources.getDimensionPixelSize(R.dimen.install_progress_bar_indeterminate_bottom_margin);
    }

    /* renamed from: a */
    public static final void m4736a(View view, Animation animation) {
        if (view.getAnimation() != null) {
            view.getAnimation().cancel();
        }
        view.startAnimation(animation);
    }

    /* renamed from: a */
    public final C0509su mo2809a(chn chn, Context context) {
        agj agj = new agj((byte) 0);
        int i = this.f5555u;
        agj a = agj.mo192a(i, i).mo203b(this.f5559y).mo199a(C0594vy.f10649a).mo198a((C0544ub) new cjm(this.f5554t, this.f5558x, this.f5557w, this.f5552r, this.f5553s, this.f5556v));
        C0509su a2 = C0497si.m8296c(context).mo5943a(cjj.class);
        a2.mo5939a(chn.f5564d);
        return a2.mo202b(a);
    }

    /* renamed from: a */
    public final FrameLayout.LayoutParams mo2808a() {
        if (this.f5536b.isIndeterminate()) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.f5534B);
            layoutParams.gravity = 80;
            layoutParams.setMargins(0, 0, 0, this.f5533A);
            return layoutParams;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, this.f5560z);
        layoutParams2.gravity = 80;
        return layoutParams2;
    }

    /* renamed from: b */
    public final void mo2810b() {
        if (this.f5535a.getParent() == null) {
            return;
        }
        if (this.f5550p && this.f5538d.isAttachedToWindow()) {
            Animator animator = this.f5548n;
            if (animator != null && animator.isStarted()) {
                this.f5548n.end();
            }
            int width = (this.f5538d.getWidth() * 3) / 4;
            int height = (this.f5538d.getHeight() * 3) / 4;
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.f5538d, width, height, 0.0f, (float) Math.hypot((double) width, (double) height));
            this.f5548n = createCircularReveal;
            createCircularReveal.setDuration((long) this.f5541g);
            this.f5548n.addListener(new chk(this));
            this.f5538d.setVisibility(0);
            if (this.f5538d.getAnimation() != null) {
                this.f5538d.getAnimation().cancel();
            }
            this.f5548n.start();
        } else if (!this.f5550p && this.f5538d.isAttachedToWindow()) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration((long) this.f5541g);
            alphaAnimation.setFillAfter(true);
            alphaAnimation.setAnimationListener(new chl(this));
            m4736a(this.f5535a, alphaAnimation);
        } else {
            this.f5540f.removeView(this.f5535a);
            this.f5551q = null;
        }
    }
}
