package com.google.android.tvlauncher.appsview;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
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
    public final int a;
    public int b;
    public chn c;
    public ImageView d;
    public TextView e;
    public int f;
    public chm g;
    public FrameLayout h;
    public float i;
    public float j;
    public boolean k;
    public boolean l;
    public chs m;
    public cgx n;
    private cux o;
    private View p;
    private ObjectAnimator q;
    private int r;
    private int s;

    public BannerView(Context context) {
        this(context, null);
    }

    public final ImageView a() {
        return this.d;
    }

    public final float b() {
        return this.o.a;
    }

    public final TextView d() {
        return this.e;
    }

    public final int e() {
        return this.f;
    }

    public BannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BannerView(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public BannerView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.l = true;
        Resources resources = getResources();
        this.a = resources.getDimensionPixelSize(R.dimen.card_rounded_corner_radius);
        this.r = bg.b(getContext(), R.color.app_banner_image_unselected_tint);
        this.i = resources.getDimension(R.dimen.app_banner_selected_item_z_delta);
        this.j = resources.getFraction(R.fraction.app_banner_focused_scale, 1, 1);
        this.s = resources.getInteger(R.integer.banner_scale_anim_duration);
    }

    public final View focusSearch(int i2) {
        int i3;
        chs chs = this.m;
        if (chs == null) {
            return super.focusSearch(i2);
        }
        View focusSearch = super.focusSearch(i2);
        cpi cpi = (cpi) chs;
        if (!cpi.p.k) {
            return focusSearch;
        }
        if (focusSearch instanceof BannerView) {
            BannerView bannerView = (BannerView) focusSearch;
            if (!cpi.w.b.c(bannerView.c)) {
                chn chn = cpi.p.c;
                chn chn2 = bannerView.c;
                cpi.t = cpi.d();
                cip cip = cpi.w.b.k;
                cip.c();
                List a2 = cip.a();
                int intValue = ((Integer) cip.a.get(chn)).intValue();
                int intValue2 = ((Integer) cip.a.get(chn2)).intValue();
                cip.a.put(chn, Integer.valueOf(intValue2));
                cip.a.put(chn2, Integer.valueOf(intValue));
                SharedPreferences.Editor edit = cip.c.edit();
                edit.putInt(chn.c, intValue2);
                edit.putInt(chn2.c, intValue);
                edit.apply();
                int indexOf = a2.indexOf(chn);
                int indexOf2 = a2.indexOf(chn2);
                civ civ = cip.e;
                int i4 = -1;
                if (civ != null) {
                    cpo cpo = ((coy) civ).a;
                    cpo.d = -1;
                    cpo.b(indexOf, indexOf2);
                }
                cpi.u = cpi.d();
                if (!dcy.d(cpi.y)) {
                    cpi.B.a(true);
                } else if (cpi.t <= 1 && cpi.u <= 1) {
                    cpi.w.y.removeCallbacks(cpi.v);
                    RecyclerView recyclerView = cpi.w.x;
                    if (recyclerView != null && !recyclerView.l()) {
                        cpi.v.run();
                    } else {
                        cpi.w.y.post(cpi.v);
                    }
                }
                cpi.x();
                int i5 = (i2 == 66 || i2 == 17) ? i2 : cpi.u > cpi.t ? 66 : 17;
                if (i5 == 17) {
                    i3 = 45;
                } else if (i5 == 66) {
                    i3 = 46;
                } else {
                    StringBuilder sb = new StringBuilder(30);
                    sb.append("Invalid direction: ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
                }
                cfs cfs = new cfs(i3);
                cfs.b(dhs.q);
                cip cip2 = cpi.w.b.k;
                if (cip2.a.containsKey(chn)) {
                    i4 = ((Integer) cip2.a.get(chn)).intValue();
                }
                cfs.a(i4);
                dja g2 = cfs.g();
                String str = chn.c;
                if (g2.b) {
                    g2.b();
                    g2.b = false;
                }
                dmj dmj = (dmj) g2.a;
                dmj dmj2 = dmj.f;
                str.getClass();
                dmj.a = 1 | dmj.a;
                dmj.b = str;
                cpi.w.a(cfs);
                return cpi.p;
            }
        }
        return cpi.p;
    }

    public final ImageView c() {
        if (this.g == null || !this.c.a()) {
            return null;
        }
        return this.g.c;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.d = (ImageView) findViewById(R.id.banner_image);
        this.h = (FrameLayout) findViewById(R.id.banner_container);
        TextView textView = (TextView) findViewById(R.id.app_title);
        this.e = textView;
        this.f = textView.getVisibility();
        this.b = this.h.getLayoutParams().height;
        this.h.setOutlineProvider(new cgu(this));
        this.h.setClipToOutline(true);
        setOutlineProvider(new cgv(this));
        this.p = findViewById(R.id.edit_focused_frame);
        ObjectAnimator objectAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(getContext(), R.animator.edit_focused_frame_blink);
        this.q = objectAnimator;
        objectAnimator.setTarget(this.p);
        this.o = new cux(this.d, dcy.a(getResources(), (int) R.dimen.unfocused_channel_dimming_factor1), dcy.a(getResources(), (int) R.dimen.unfocused_channel_dimming_factor2));
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        cgx cgx = this.n;
        if (cgx != null) {
            cgx.a(i2);
        }
    }

    public final void a(int i2) {
        if (this.g != null && this.c.a()) {
            this.g.o.a(i2);
        }
        this.o.a(i2);
    }

    public final void a(boolean z) {
        if (this.l) {
            float f2 = 1.0f;
            float f3 = z ? this.j : 1.0f;
            float f4 = z ? this.i : 0.0f;
            if (!z) {
                f2 = 0.0f;
            }
            this.e.setSelected(z);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, View.SCALE_X, f3);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, View.SCALE_Y, f3);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, View.TRANSLATION_Z, f4);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.e, View.ALPHA, f2);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
            animatorSet.setDuration((long) this.s);
            animatorSet.addListener(new cgw(this));
            animatorSet.start();
        }
    }

    public final void b(boolean z) {
        if (!z) {
            this.q.cancel();
            this.p.setVisibility(8);
        } else {
            this.q.start();
            this.p.setVisibility(0);
        }
        this.k = z;
    }

    public final void a(chn chn) {
        this.c = chn;
        CharSequence charSequence = chn.b;
        if (!TextUtils.equals(charSequence, this.e.getText())) {
            this.e.setText(charSequence);
        }
        this.d.setContentDescription(chn.b);
        if (!chn.a()) {
            chm chm = this.g;
            if (chm != null) {
                chm.b();
                this.d.setVisibility(0);
                return;
            }
            return;
        }
        if (this.g == null) {
            this.g = new chm(this);
        }
        chm chm2 = this.g;
        Context context = chm2.f.getContext();
        int i2 = chn.k;
        int i3 = chn.m;
        int i4 = i3 - 1;
        if (i3 != 0) {
            if (i4 == 0) {
                chm2.b.setIndeterminate(true);
                chm2.b.setProgress(0);
                chm2.b.setRotation(0.0f);
                chm2.b.setLayoutParams(chm2.a());
            } else if (i4 == 1) {
                chm2.b.setIndeterminate(true);
                chm2.b.setProgress(0);
                chm2.b.setRotation(0.0f);
                chm2.b.setLayoutParams(chm2.a());
                chm2.e.setText(chm2.k);
            } else if (i4 == 2) {
                chm2.b.setIndeterminate(true);
                chm2.b.setProgress(0);
                chm2.b.setRotation(0.0f);
                chm2.b.setLayoutParams(chm2.a());
                chm2.e.setText(chm2.l);
            } else if (i4 == 3) {
                chm2.b.setIndeterminate(true);
                chm2.b.setProgress(0);
                chm2.b.setRotation(0.0f);
                chm2.b.setLayoutParams(chm2.a());
                chm2.e.setText(chm2.m);
            } else if (i4 == 4) {
                chm2.b.setIndeterminate(false);
                chm2.b.setProgress(i2);
                chm2.b.setRotation(0.0f);
                chm2.b.setLayoutParams(chm2.a());
                chm2.e.setText(chm2.i);
            } else if (i4 == 5) {
                chm2.b.setIndeterminate(true);
                chm2.b.setProgress(0);
                chm2.b.setRotation(180.0f);
                chm2.b.setLayoutParams(chm2.a());
                chm2.e.setText(chm2.j);
            } else {
                throw new IllegalStateException("Invalid install state.");
            }
            if (chm2.a.getParent() == null) {
                chm2.f.addView(chm2.a, 0);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration((long) chm2.g);
                alphaAnimation.setFillAfter(true);
                chm.a(chm2.a, alphaAnimation);
            }
            if (!chn.c.equals(chm2.q)) {
                chm2.q = chn.c;
                if (chn.e != null) {
                    chm2.p = true;
                    agj a2 = new agj((byte) 0).a(vy.a).a(chm2.h).a((ub) new dae(context.getColor(R.color.app_banner_background_color_gray_scale), true));
                    su a3 = si.c(context).a(cjj.class);
                    a3.b = chm2.a(chn, context);
                    a3.a(chn.e);
                    a3.b(a2).a((ahg) new chi(chm2, chm2.c));
                } else {
                    chm2.p = false;
                    chm2.a(chn, context).a((ahg) new chj(chm2, chm2.c));
                }
            }
            this.d.setVisibility(4);
            this.p.bringToFront();
            return;
        }
        throw null;
    }

    public final void setSelected(boolean z) {
        float f2;
        super.setSelected(z);
        if (this.l) {
            float f3 = z ? this.j : 1.0f;
            if (z) {
                f2 = this.i;
            } else {
                f2 = 0.0f;
            }
            if (!z) {
                this.d.setColorFilter(this.r);
            } else {
                this.d.clearColorFilter();
            }
            animate().z(f2).scaleX(f3).scaleY(f3).setDuration((long) this.s);
        }
    }
}
