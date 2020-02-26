package com.google.android.tvlauncher.appsview;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.support.p002v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.tvlauncher.R;
import java.util.List;

/* compiled from: PG */
public class BannerView extends LinearLayout implements cus {

    /* renamed from: a */
    public final int f6392a;

    /* renamed from: b */
    public int f6393b;

    /* renamed from: c */
    public chn f6394c;

    /* renamed from: d */
    public ImageView f6395d;

    /* renamed from: e */
    public TextView f6396e;

    /* renamed from: f */
    public int f6397f;

    /* renamed from: g */
    public chm f6398g;

    /* renamed from: h */
    public FrameLayout f6399h;

    /* renamed from: i */
    public float f6400i;

    /* renamed from: j */
    public float f6401j;

    /* renamed from: k */
    public boolean f6402k;

    /* renamed from: l */
    public boolean f6403l;

    /* renamed from: m */
    public chs f6404m;

    /* renamed from: n */
    public cgx f6405n;

    /* renamed from: o */
    private cux f6406o;

    /* renamed from: p */
    private View f6407p;

    /* renamed from: q */
    private ObjectAnimator f6408q;

    /* renamed from: r */
    private int f6409r;

    /* renamed from: s */
    private int f6410s;

    public BannerView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final ImageView mo3223a() {
        return this.f6395d;
    }

    /* renamed from: b */
    public final float mo3227b() {
        return this.f6406o.f7612a;
    }

    /* renamed from: d */
    public final TextView mo3230d() {
        return this.f6396e;
    }

    /* renamed from: e */
    public final int mo3231e() {
        return this.f6397f;
    }

    public BannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BannerView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public BannerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f6403l = true;
        Resources resources = getResources();
        this.f6392a = resources.getDimensionPixelSize(R.dimen.card_rounded_corner_radius);
        this.f6409r = C0035bg.m3116b(getContext(), R.color.app_banner_image_unselected_tint);
        this.f6400i = resources.getDimension(R.dimen.app_banner_selected_item_z_delta);
        this.f6401j = resources.getFraction(R.fraction.app_banner_focused_scale, 1, 1);
        this.f6410s = resources.getInteger(R.integer.banner_scale_anim_duration);
    }

    public final View focusSearch(int i) {
        int i2;
        chs chs = this.f6404m;
        if (chs == null) {
            return super.focusSearch(i);
        }
        View focusSearch = super.focusSearch(i);
        cpi cpi = (cpi) chs;
        if (!cpi.f6876p.f6402k) {
            return focusSearch;
        }
        if (focusSearch instanceof BannerView) {
            BannerView bannerView = (BannerView) focusSearch;
            if (!cpi.f6883w.f6896b.mo2894c(bannerView.f6394c)) {
                chn chn = cpi.f6876p.f6394c;
                chn chn2 = bannerView.f6394c;
                cpi.f6880t = cpi.mo5436d();
                cip cip = cpi.f6883w.f6896b.f5689k;
                cip.mo2870c();
                List a = cip.mo2865a();
                int intValue = ((Integer) cip.f5652a.get(chn)).intValue();
                int intValue2 = ((Integer) cip.f5652a.get(chn2)).intValue();
                cip.f5652a.put(chn, Integer.valueOf(intValue2));
                cip.f5652a.put(chn2, Integer.valueOf(intValue));
                SharedPreferences.Editor edit = cip.f5654c.edit();
                edit.putInt(chn.f5563c, intValue2);
                edit.putInt(chn2.f5563c, intValue);
                edit.apply();
                int indexOf = a.indexOf(chn);
                int indexOf2 = a.indexOf(chn2);
                civ civ = cip.f5656e;
                int i3 = -1;
                if (civ != null) {
                    cpo cpo = ((coy) civ).f6858a;
                    cpo.f6898d = -1;
                    cpo.mo5309b(indexOf, indexOf2);
                }
                cpi.f6881u = cpi.mo5436d();
                if (!dcy.m6195d(cpi.f6894y)) {
                    cpi.f6890B.mo4133a(true);
                } else if (cpi.f6880t <= 1 && cpi.f6881u <= 1) {
                    cpi.f6883w.f6919y.removeCallbacks(cpi.f6882v);
                    RecyclerView recyclerView = cpi.f6883w.f6918x;
                    if (recyclerView != null && !recyclerView.mo892l()) {
                        cpi.f6882v.run();
                    } else {
                        cpi.f6883w.f6919y.post(cpi.f6882v);
                    }
                }
                cpi.mo3556x();
                int i4 = (i == 66 || i == 17) ? i : cpi.f6881u > cpi.f6880t ? 66 : 17;
                if (i4 == 17) {
                    i2 = 45;
                } else if (i4 == 66) {
                    i2 = 46;
                } else {
                    StringBuilder sb = new StringBuilder(30);
                    sb.append("Invalid direction: ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
                }
                cfs cfs = new cfs(i2);
                cfs.mo2729b(dhs.f8553q);
                cip cip2 = cpi.f6883w.f6896b.f5689k;
                if (cip2.f5652a.containsKey(chn)) {
                    i3 = ((Integer) cip2.f5652a.get(chn)).intValue();
                }
                cfs.mo2724a(i3);
                dja g = cfs.mo2734g();
                String str = chn.f5563c;
                if (g.f8673b) {
                    g.mo4505b();
                    g.f8673b = false;
                }
                dmj dmj = (dmj) g.f8672a;
                dmj dmj2 = dmj.f8832f;
                str.getClass();
                dmj.f8833a = 1 | dmj.f8833a;
                dmj.f8834b = str;
                cpi.f6883w.mo2714a(cfs);
                return cpi.f6876p;
            }
        }
        return cpi.f6876p;
    }

    /* renamed from: c */
    public final ImageView mo3229c() {
        if (this.f6398g == null || !this.f6394c.mo2812a()) {
            return null;
        }
        return this.f6398g.f5537c;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f6395d = (ImageView) findViewById(R.id.banner_image);
        this.f6399h = (FrameLayout) findViewById(R.id.banner_container);
        TextView textView = (TextView) findViewById(R.id.app_title);
        this.f6396e = textView;
        this.f6397f = textView.getVisibility();
        this.f6393b = this.f6399h.getLayoutParams().height;
        this.f6399h.setOutlineProvider(new cgu(this));
        this.f6399h.setClipToOutline(true);
        setOutlineProvider(new cgv(this));
        this.f6407p = findViewById(R.id.edit_focused_frame);
        ObjectAnimator objectAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(getContext(), R.animator.edit_focused_frame_blink);
        this.f6408q = objectAnimator;
        objectAnimator.setTarget(this.f6407p);
        this.f6406o = new cux(this.f6395d, dcy.m6184a(getResources(), (int) R.dimen.unfocused_channel_dimming_factor1), dcy.m6184a(getResources(), (int) R.dimen.unfocused_channel_dimming_factor2));
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        cgx cgx = this.f6405n;
        if (cgx != null) {
            cgx.mo2781a(i);
        }
    }

    /* renamed from: a */
    public final void mo3224a(int i) {
        if (this.f6398g != null && this.f6394c.mo2812a()) {
            this.f6398g.f5549o.mo3780a(i);
        }
        this.f6406o.mo3780a(i);
    }

    /* renamed from: a */
    public final void mo3226a(boolean z) {
        if (this.f6403l) {
            float f = 1.0f;
            float f2 = z ? this.f6401j : 1.0f;
            float f3 = z ? this.f6400i : 0.0f;
            if (!z) {
                f = 0.0f;
            }
            this.f6396e.setSelected(z);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, View.SCALE_X, f2);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, View.SCALE_Y, f2);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, View.TRANSLATION_Z, f3);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f6396e, View.ALPHA, f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
            animatorSet.setDuration((long) this.f6410s);
            animatorSet.addListener(new cgw(this));
            animatorSet.start();
        }
    }

    /* renamed from: b */
    public final void mo3228b(boolean z) {
        if (!z) {
            this.f6408q.cancel();
            this.f6407p.setVisibility(8);
        } else {
            this.f6408q.start();
            this.f6407p.setVisibility(0);
        }
        this.f6402k = z;
    }

    /* renamed from: a */
    public final void mo3225a(chn chn) {
        this.f6394c = chn;
        CharSequence charSequence = chn.f5562b;
        if (!TextUtils.equals(charSequence, this.f6396e.getText())) {
            this.f6396e.setText(charSequence);
        }
        this.f6395d.setContentDescription(chn.f5562b);
        if (!chn.mo2812a()) {
            chm chm = this.f6398g;
            if (chm != null) {
                chm.mo2810b();
                this.f6395d.setVisibility(0);
                return;
            }
            return;
        }
        if (this.f6398g == null) {
            this.f6398g = new chm(this);
        }
        chm chm2 = this.f6398g;
        Context context = chm2.f5540f.getContext();
        int i = chn.f5571k;
        int i2 = chn.f5573m;
        int i3 = i2 - 1;
        if (i2 != 0) {
            if (i3 == 0) {
                chm2.f5536b.setIndeterminate(true);
                chm2.f5536b.setProgress(0);
                chm2.f5536b.setRotation(0.0f);
                chm2.f5536b.setLayoutParams(chm2.mo2808a());
            } else if (i3 == 1) {
                chm2.f5536b.setIndeterminate(true);
                chm2.f5536b.setProgress(0);
                chm2.f5536b.setRotation(0.0f);
                chm2.f5536b.setLayoutParams(chm2.mo2808a());
                chm2.f5539e.setText(chm2.f5545k);
            } else if (i3 == 2) {
                chm2.f5536b.setIndeterminate(true);
                chm2.f5536b.setProgress(0);
                chm2.f5536b.setRotation(0.0f);
                chm2.f5536b.setLayoutParams(chm2.mo2808a());
                chm2.f5539e.setText(chm2.f5546l);
            } else if (i3 == 3) {
                chm2.f5536b.setIndeterminate(true);
                chm2.f5536b.setProgress(0);
                chm2.f5536b.setRotation(0.0f);
                chm2.f5536b.setLayoutParams(chm2.mo2808a());
                chm2.f5539e.setText(chm2.f5547m);
            } else if (i3 == 4) {
                chm2.f5536b.setIndeterminate(false);
                chm2.f5536b.setProgress(i);
                chm2.f5536b.setRotation(0.0f);
                chm2.f5536b.setLayoutParams(chm2.mo2808a());
                chm2.f5539e.setText(chm2.f5543i);
            } else if (i3 == 5) {
                chm2.f5536b.setIndeterminate(true);
                chm2.f5536b.setProgress(0);
                chm2.f5536b.setRotation(180.0f);
                chm2.f5536b.setLayoutParams(chm2.mo2808a());
                chm2.f5539e.setText(chm2.f5544j);
            } else {
                throw new IllegalStateException("Invalid install state.");
            }
            if (chm2.f5535a.getParent() == null) {
                chm2.f5540f.addView(chm2.f5535a, 0);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration((long) chm2.f5541g);
                alphaAnimation.setFillAfter(true);
                chm.m4736a(chm2.f5535a, alphaAnimation);
            }
            if (!chn.f5563c.equals(chm2.f5551q)) {
                chm2.f5551q = chn.f5563c;
                if (chn.f5565e != null) {
                    chm2.f5550p = true;
                    agj a = new agj((byte) 0).mo199a(C0594vy.f10649a).mo195a(chm2.f5542h).mo198a((C0544ub) new dae(context.getColor(R.color.app_banner_background_color_gray_scale), true));
                    C0509su a2 = C0497si.m8296c(context).mo5943a(cjj.class);
                    a2.f10414b = chm2.mo2809a(chn, context);
                    a2.mo5939a(chn.f5565e);
                    a2.mo202b(a).mo5937a((ahg) new chi(chm2, chm2.f5537c));
                } else {
                    chm2.f5550p = false;
                    chm2.mo2809a(chn, context).mo5937a((ahg) new chj(chm2, chm2.f5537c));
                }
            }
            this.f6395d.setVisibility(4);
            this.f6407p.bringToFront();
            return;
        }
        throw null;
    }

    public final void setSelected(boolean z) {
        float f;
        super.setSelected(z);
        if (this.f6403l) {
            float f2 = z ? this.f6401j : 1.0f;
            if (z) {
                f = this.f6400i;
            } else {
                f = 0.0f;
            }
            if (!z) {
                this.f6395d.setColorFilter(this.f6409r);
            } else {
                this.f6395d.clearColorFilter();
            }
            animate().z(f).scaleX(f2).scaleY(f2).setDuration((long) this.f6410s);
        }
    }
}
