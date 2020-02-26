package defpackage;

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

/* renamed from: chm  reason: default package */
/* compiled from: PG */
public final class chm {
    private final int A;
    private final int B;
    public final View a;
    public final ProgressBar b;
    public final ImageView c = ((ImageView) this.a.findViewById(R.id.app_install_banner));
    public final ImageView d;
    public final TextView e;
    public final FrameLayout f;
    public final int g;
    public final Drawable h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public Animator n;
    public final cux o;
    public boolean p;
    public String q;
    private final int r;
    private final int s;
    private final int t;
    private final int u;
    private final float v;
    private final float w;
    private final float x;
    private final Drawable y;
    private final int z;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.tvlauncher.appsview.BannerView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public chm(BannerView bannerView) {
        Context context = bannerView.getContext();
        View inflate = LayoutInflater.from(context).inflate((int) R.layout.install_state_overlay, (ViewGroup) bannerView, false);
        this.a = inflate;
        this.b = (ProgressBar) inflate.findViewById(R.id.progress_bar);
        Resources resources = context.getResources();
        this.r = resources.getDimensionPixelSize(R.dimen.app_banner_image_max_width);
        this.s = resources.getDimensionPixelSize(R.dimen.app_banner_image_max_height);
        this.o = new cux(this.c, dcy.a(resources, (int) R.dimen.unfocused_channel_dimming_factor1), dcy.a(resources, (int) R.dimen.unfocused_channel_dimming_factor2));
        this.g = resources.getInteger(R.integer.banner_install_anim_duration);
        this.t = context.getColor(R.color.app_banner_background_color_gray_scale);
        float fraction = resources.getFraction(R.fraction.home_app_banner_focused_scale, 1, 1);
        this.u = resources.getDimensionPixelSize(R.dimen.app_banner_installing_icon_max_size);
        this.v = ((float) resources.getDimensionPixelSize(R.dimen.card_rounded_corner_radius)) * fraction;
        this.w = dcy.a(resources, (int) R.dimen.gray_scale_saturation);
        this.x = dcy.a(resources, (int) R.dimen.install_icon_darken_factor);
        this.f = bannerView.h;
        this.e = bannerView.e;
        this.d = (ImageView) this.f.findViewById(R.id.banner_image);
        this.h = new ColorDrawable(bg.b(context, R.color.app_banner_background_color));
        this.y = context.getDrawable(R.drawable.system_default_app_icon_banner);
        this.i = resources.getString(R.string.downloading);
        this.j = resources.getString(R.string.installing);
        this.k = resources.getString(R.string.install_pending);
        this.l = resources.getString(R.string.update_pending);
        this.m = resources.getString(R.string.restore_pending);
        this.z = resources.getDimensionPixelSize(R.dimen.install_progress_bar_height);
        this.B = resources.getDimensionPixelSize(R.dimen.install_progress_bar_indeterminate_height);
        this.A = resources.getDimensionPixelSize(R.dimen.install_progress_bar_indeterminate_bottom_margin);
    }

    public static final void a(View view, Animation animation) {
        if (view.getAnimation() != null) {
            view.getAnimation().cancel();
        }
        view.startAnimation(animation);
    }

    public final su a(chn chn, Context context) {
        agj agj = new agj((byte) 0);
        int i2 = this.u;
        agj a2 = agj.a(i2, i2).b(this.y).a(vy.a).a((ub) new cjm(this.t, this.x, this.w, this.r, this.s, this.v));
        su a3 = si.c(context).a(cjj.class);
        a3.a(chn.d);
        return a3.b(a2);
    }

    public final FrameLayout.LayoutParams a() {
        if (this.b.isIndeterminate()) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.B);
            layoutParams.gravity = 80;
            layoutParams.setMargins(0, 0, 0, this.A);
            return layoutParams;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, this.z);
        layoutParams2.gravity = 80;
        return layoutParams2;
    }

    public final void b() {
        if (this.a.getParent() == null) {
            return;
        }
        if (this.p && this.d.isAttachedToWindow()) {
            Animator animator = this.n;
            if (animator != null && animator.isStarted()) {
                this.n.end();
            }
            int width = (this.d.getWidth() * 3) / 4;
            int height = (this.d.getHeight() * 3) / 4;
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.d, width, height, 0.0f, (float) Math.hypot((double) width, (double) height));
            this.n = createCircularReveal;
            createCircularReveal.setDuration((long) this.g);
            this.n.addListener(new chk(this));
            this.d.setVisibility(0);
            if (this.d.getAnimation() != null) {
                this.d.getAnimation().cancel();
            }
            this.n.start();
        } else if (!this.p && this.d.isAttachedToWindow()) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration((long) this.g);
            alphaAnimation.setFillAfter(true);
            alphaAnimation.setAnimationListener(new chl(this));
            a(this.a, alphaAnimation);
        } else {
            this.f.removeView(this.a);
            this.q = null;
        }
    }
}
