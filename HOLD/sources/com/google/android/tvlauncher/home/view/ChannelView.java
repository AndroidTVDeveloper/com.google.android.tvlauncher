package com.google.android.tvlauncher.home.view;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.leanback.widget.HorizontalGridView;
import com.google.android.tvlauncher.R;
import java.util.ArrayList;

/* compiled from: PG */
public class ChannelView extends FrameLayout {
    public int A = 1;
    public boolean B = true;
    public boolean C = true;
    public boolean D = true;
    public boolean E = true;
    public SparseArray F;
    public boolean G;
    public boolean H = true;
    public boolean I;
    public cuo J;
    public cun K;
    public cum L;
    public cup M;
    public cul N;
    public cuq O;
    private ChannelViewMainLinearLayout P;
    private FadingEdgeContainer Q;
    private float R;
    private float S;
    private View T;
    private View U;
    private View V;
    private View W;
    public ChannelViewMainContent a;
    private int aA;
    private int aB;
    private Drawable aC;
    private Drawable aD;
    private Drawable aE;
    private int aF;
    private int aG;
    private TextView aH;
    private Animator aI;
    private int aJ;
    private boolean aK = true;
    private ViewTreeObserver.OnGlobalFocusChangeListener aL;
    private boolean aM = true;
    private boolean aN = false;
    private boolean aO;
    private final AnimatorListenerAdapter aP = new cue(this);
    private final Runnable aQ = new cug(this);
    private ImageView aa;
    private ImageView ab;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    private int ag;
    private int ah;
    private int ai;
    private int aj;
    private int ak;
    private int al;
    private int am;
    private int an;
    private int ao;
    private int ap;
    private int aq;
    private int ar;
    private int as;
    private int at;
    private int au;
    private int av;
    private int aw;
    private int ax;
    private int ay;
    private int az;
    public HorizontalGridView b;
    public TextView c;
    public int d;
    public TextView e;
    public int f;
    public TextView g;
    public ImageView h;
    public float i;
    public TextView j;
    public View k;
    public int l;
    public int m;
    public View n;
    public int o;
    public View p;
    public int q;
    public View r;
    public int s;
    public float t;
    public float u;
    public int v;
    public int w;
    public int x;
    public ObjectAnimator y;
    public boolean z;

    public ChannelView(Context context) {
        super(context);
    }

    private static boolean c(int i2) {
        return i2 == 8 || i2 == 9;
    }

    private final int d(int i2) {
        if (!this.aN) {
            return i2;
        }
        if (i2 == 17) {
            return 66;
        }
        if (i2 == 66) {
            return 17;
        }
        return i2;
    }

    public ChannelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ChannelView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public final void addFocusables(ArrayList arrayList, int i2, int i3) {
        if (this.A == 0 && dcy.b(getContext()) && d(i2) == 17 && b(findFocus())) {
            this.h.addFocusables(arrayList, i2, i3);
            return;
        }
        int i4 = this.A;
        if (i4 == 11 || i4 == 12 || i4 == 28 || i4 == 29) {
            this.h.addFocusables(arrayList, i2, i3);
        } else if (i4 == 0 || i4 == 1 || i4 == 2 || i4 == 3 || i4 == 4 || i4 == 5 || i4 == 6 || i4 == 7 || i4 == 17 || i4 == 8 || i4 == 9) {
            this.b.addFocusables(arrayList, i2, i3);
        } else if (i4 == 18 || i4 == 19 || i4 == 20 || i4 == 21 || i4 == 22 || i4 == 23 || i4 == 24 || i4 == 32 || i4 == 25 || i4 == 26) {
            this.j.addFocusables(arrayList, i2, i3);
        } else {
            super.addFocusables(arrayList, i2, i3);
        }
    }

    public final void b() {
        removeCallbacks(this.aQ);
        postDelayed(this.aQ, 100);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        if (keyEvent.getKeyCode() == 21 || keyEvent.getKeyCode() == 22) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() > 0) {
                this.aO = true;
            } else if (this.aO && keyEvent.getAction() == 1) {
                this.aO = false;
            }
        }
        return dispatchKeyEvent;
    }

    public final View focusSearch(int i2) {
        cum cum;
        if (i2 == 33) {
            cun cun = this.K;
            if (cun != null) {
                cun.b(this);
            }
        } else if (i2 == 130 && (cum = this.L) != null) {
            cum.c(this);
        }
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006f, code lost:
        if (r0 != 66) goto L_0x0072;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View focusSearch(android.view.View r9, int r10) {
        /*
            r8 = this;
            int r0 = r8.d(r10)
            boolean r1 = r8.aO
            if (r1 != 0) goto L_0x008f
            android.widget.TextView r1 = r8.j
            r2 = 0
            r3 = 66
            r4 = 17
            r5 = 0
            r6 = 1
            if (r9 == r1) goto L_0x006d
            boolean r1 = r8.D
            r7 = 10
            if (r1 == 0) goto L_0x002f
            androidx.leanback.widget.HorizontalGridView r1 = r8.b
            if (r9 == r1) goto L_0x0024
            boolean r1 = r8.b(r9)
            if (r1 != 0) goto L_0x0024
            goto L_0x002f
        L_0x0024:
            if (r0 == r4) goto L_0x0027
            goto L_0x0071
        L_0x0027:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r6 = 0
            goto L_0x0072
        L_0x002f:
            android.widget.ImageView r1 = r8.h
            if (r9 == r1) goto L_0x0049
            android.widget.ImageView r1 = r8.ab
            if (r9 == r1) goto L_0x0040
            android.widget.ImageView r1 = r8.aa
            if (r9 == r1) goto L_0x003c
            goto L_0x0071
        L_0x003c:
            boolean r1 = r8.B
            if (r1 != 0) goto L_0x0071
        L_0x0040:
            if (r0 == r3) goto L_0x0043
            goto L_0x004d
        L_0x0043:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            goto L_0x0072
        L_0x0049:
            if (r0 == r4) goto L_0x0056
            if (r0 == r3) goto L_0x004e
        L_0x004d:
            goto L_0x0071
        L_0x004e:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r6 = 0
            goto L_0x0072
        L_0x0056:
            int r1 = r8.A
            if (r1 != r7) goto L_0x006c
            boolean r1 = r8.B
            if (r1 == 0) goto L_0x005f
            goto L_0x0064
        L_0x005f:
            boolean r1 = r8.C
            if (r1 != 0) goto L_0x0064
            goto L_0x006c
        L_0x0064:
            r1 = 13
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            goto L_0x0072
        L_0x006c:
            return r9
        L_0x006d:
            if (r0 == r4) goto L_0x008f
            if (r0 == r3) goto L_0x008f
        L_0x0071:
        L_0x0072:
            if (r5 == 0) goto L_0x008a
            cuq r1 = r8.O
            if (r1 != 0) goto L_0x0079
            goto L_0x008a
        L_0x0079:
            int r2 = r5.intValue()
            r1.c(r2)
            if (r6 == 0) goto L_0x008a
            int r10 = android.view.SoundEffectConstants.getContantForFocusDirection(r0)
            r8.playSoundEffect(r10)
            return r9
        L_0x008a:
            android.view.View r9 = super.focusSearch(r9, r10)
            return r9
        L_0x008f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.tvlauncher.home.view.ChannelView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void a() {
        this.A = -1;
    }

    private final boolean b(View view) {
        HorizontalGridView horizontalGridView;
        if (view != null && view.getParent() == (horizontalGridView = this.b) && horizontalGridView.d(view) == 0) {
            return true;
        }
        return false;
    }

    public final boolean a(View view) {
        if (view == null) {
            return false;
        }
        ViewParent parent = view.getParent();
        if (view == this.j || parent == this.b || parent == this.h.getParent() || parent == this) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.aL);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.aL);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.aN = dcy.a(getContext());
        Resources resources = getResources();
        this.ak = getContext().getColor(R.color.channel_logo_title_color);
        this.al = getContext().getColor(R.color.channel_logo_title_dimmed_color);
        this.ac = resources.getDimensionPixelOffset(R.dimen.channel_logo_zoomed_out_margin);
        this.ad = resources.getDimensionPixelOffset(R.dimen.channel_logo_zoomed_out_selected_margin);
        this.ae = resources.getDimensionPixelOffset(R.dimen.channel_items_list_margin_start);
        this.af = resources.getDimensionPixelOffset(R.dimen.channel_items_list_zoomed_out_margin_start);
        this.ag = resources.getDimensionPixelOffset(R.dimen.channel_items_title_default_margin_start);
        this.ah = resources.getDimensionPixelOffset(R.dimen.channel_items_title_zoomed_out_margin_start);
        this.ai = getContext().getColor(R.color.channel_items_title_default_color);
        this.aj = getContext().getColor(R.color.channel_items_title_selected_color);
        this.aq = resources.getDimensionPixelOffset(R.dimen.program_meta_container_default_margin_top);
        this.ar = resources.getDimensionPixelOffset(R.dimen.program_meta_container_selected_margin_top);
        this.as = resources.getDimensionPixelSize(R.dimen.program_meta_container_invisible_margin_bottom);
        this.at = resources.getDimensionPixelOffset(R.dimen.program_meta_container_default_margin_start);
        this.au = resources.getDimensionPixelOffset(R.dimen.program_meta_container_zoomed_out_margin_start);
        this.av = resources.getDimensionPixelSize(R.dimen.sponsored_channel_background_height);
        this.aw = resources.getDimensionPixelSize(R.dimen.sponsored_channel_background_zoomed_out_height);
        this.ax = resources.getDimensionPixelSize(R.dimen.sponsored_channel_background_default_selected_height);
        this.ay = resources.getDimensionPixelSize(R.dimen.sponsored_channel_background_above_selected_last_row_height);
        this.az = resources.getDimensionPixelSize(R.dimen.sponsored_channel_background_unbranded_below_selected_height);
        this.aA = getContext().getColor(R.color.sponsored_channel_background_default_color);
        this.aB = getContext().getColor(R.color.sponsored_channel_background_zoomed_out_selected_color);
        this.am = resources.getDimensionPixelOffset(R.dimen.empty_channel_message_default_margin_start);
        this.an = resources.getDimensionPixelOffset(R.dimen.empty_channel_message_zoomed_out_margin_start);
        this.ao = resources.getDimensionPixelOffset(R.dimen.empty_channel_message_action_not_selected_margin_start);
        this.ap = resources.getDimensionPixelOffset(R.dimen.empty_channel_message_move_not_selected_margin_start);
        setOnClickListener(new ctx(this));
        setFocusable(false);
        this.a = (ChannelViewMainContent) findViewById(R.id.main_content);
        this.P = (ChannelViewMainLinearLayout) findViewById(R.id.main_linear_layout);
        TextView textView = (TextView) findViewById(R.id.logo_title);
        this.c = textView;
        this.d = textView.getVisibility();
        TextView textView2 = (TextView) findViewById(R.id.logo_title_zoomed_out);
        this.e = textView2;
        this.f = textView2.getVisibility();
        this.x = this.e.getCurrentTextColor();
        TextView textView3 = (TextView) findViewById(R.id.items_title);
        this.g = textView3;
        this.v = textView3.getCurrentTextColor();
        View findViewById = findViewById(R.id.actions_hint);
        this.k = findViewById;
        this.l = findViewById.getVisibility();
        this.T = findViewById(R.id.zoomed_out_padding);
        this.U = findViewById(R.id.channel_actions_padding);
        this.V = findViewById(R.id.move_channel_padding);
        this.W = findViewById(R.id.no_move_action_padding);
        this.p = findViewById(R.id.sponsored_channel_background);
        this.n = findViewById(R.id.moving_channel_background);
        this.n.setOutlineProvider(new cuh(getResources().getDimensionPixelSize(R.dimen.moving_channel_background_corner_radius)));
        this.n.setClipToOutline(true);
        this.o = this.n.getVisibility();
        this.h = (ImageView) findViewById(R.id.channel_logo);
        TextView textView4 = (TextView) findViewById(R.id.channel_empty_message);
        this.j = textView4;
        this.m = textView4.getVisibility();
        this.h.setSoundEffectsEnabled(false);
        this.h.setOnClickListener(new cty(this));
        this.h.setOutlineProvider(new cui());
        this.h.setClipToOutline(true);
        this.t = resources.getFraction(R.fraction.channel_logo_focused_scale, 1, 1);
        this.u = resources.getDimension(R.dimen.channel_logo_focused_elevation);
        if (isInEditMode() || dcy.d(getContext())) {
            this.h.setOnFocusChangeListener(new ctz(this));
        } else {
            ((ViewGroup.MarginLayoutParams) this.k.getLayoutParams()).setMarginEnd(resources.getDimensionPixelOffset(R.dimen.channel_actions_hint_margin_end_no_animations));
            new cuj(this, resources.getInteger(R.integer.channel_logo_focused_animation_duration_ms), this.t, this.u).a(this.h);
        }
        float a2 = dcy.a(getResources(), (int) R.dimen.unfocused_channel_dimming_factor1);
        this.S = a2;
        this.i = a2;
        this.h.setColorFilter(dej.b(-16777216, a2));
        this.w = this.c.getCurrentTextColor();
        this.i = this.h.getAlpha();
        ImageView imageView = (ImageView) findViewById(R.id.remove);
        this.aa = imageView;
        imageView.setOnClickListener(new cua(this));
        ImageView imageView2 = this.aa;
        if (this.aN) {
            int nextFocusLeftId = imageView2.getNextFocusLeftId();
            imageView2.setNextFocusLeftId(imageView2.getNextFocusRightId());
            imageView2.setNextFocusRightId(nextFocusLeftId);
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.move);
        this.ab = imageView3;
        imageView3.setOnClickListener(new cub(this));
        this.b = (HorizontalGridView) findViewById(R.id.items_list);
        FadingEdgeContainer fadingEdgeContainer = (FadingEdgeContainer) findViewById(R.id.items_list_container);
        this.Q = fadingEdgeContainer;
        fadingEdgeContainer.a = false;
        View findViewById2 = findViewById(R.id.item_meta_container);
        this.r = findViewById2;
        this.s = findViewById2.getVisibility();
        this.aF = resources.getDimensionPixelOffset(R.dimen.watch_next_info_acknowledged_button_base_margin_start);
        this.aG = getResources().getDimensionPixelSize(R.dimen.watch_next_info_card_container_default_margin_horizontal);
        this.aH = (TextView) findViewById(R.id.watch_next_info_acknowledged_button);
        this.aH.setOutlineProvider(new cuk(getResources().getDimensionPixelSize(R.dimen.watch_next_info_acknowledged_button_corner_radius)));
        this.aH.setClipToOutline(true);
        this.aL = new cuc(this);
        this.aC = getContext().getDrawable(R.drawable.ic_action_move_up_down_black);
        this.aD = getContext().getDrawable(R.drawable.ic_action_move_up_black);
        this.aE = getContext().getDrawable(R.drawable.ic_action_move_down_black);
        ObjectAnimator objectAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(getContext(), R.animator.watch_next_info_acknowledged_button_blink);
        this.y = objectAnimator;
        objectAnimator.setTarget(this.aH);
        this.aJ = getResources().getInteger(R.integer.watch_next_info_acknowledged_button_fade_in_duration_ms);
    }

    /* access modifiers changed from: protected */
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3 = this.A;
        if (i3 == 11 || i3 == 12 || i3 == 10 || i3 == 28 || i3 == 29 || i3 == 27) {
            this.h.requestFocus();
            return true;
        } else if (dcy.a(i3)) {
            this.j.requestFocus();
            return true;
        } else {
            this.b.requestFocus();
            return true;
        }
    }

    public final void c() {
        if (this.z) {
            km e2 = this.b.e(1);
            if (e2 != null) {
                this.aK = true;
                View view = e2.a;
                if (getLayoutDirection() == 0) {
                    int i2 = this.aF;
                    int left = view.getLeft();
                    this.aH.setTranslationX((float) (i2 + left + this.aG));
                } else {
                    int i3 = this.aF;
                    int width = this.b.getWidth();
                    int right = view.getRight();
                    this.aH.setTranslationX((float) (-(((i3 + width) - right) + this.aG)));
                }
                Animator e3 = dei.e(this.aH, 8, 0, 0.0f, null);
                this.aI = e3;
                e3.setDuration((long) this.aJ);
                this.aI.addListener(this.aP);
                this.aI.start();
            } else if (this.aK) {
                Log.w("ChannelView", "Change watch next info button visibility to true when the horizontal grid view data is dirty. Schedule a refresh.");
                b();
                this.aK = false;
            } else {
                Log.w("ChannelView", "Change watch next info button visibility to true when the horizontal grid view data is dirty. Don't schedule a refresh because the only one attempt has been used.");
            }
        } else {
            this.aH.setVisibility(8);
            Animator animator = this.aI;
            if (animator != null && animator.isRunning()) {
                this.aI.cancel();
            }
            if (this.y.isRunning()) {
                this.y.cancel();
            }
        }
    }

    private final void g(int i2) {
        this.k.setVisibility(i2);
        this.l = i2;
    }

    private final void h(int i2) {
        this.j.setVisibility(i2);
        this.m = i2;
    }

    private final void k(int i2) {
        this.r.setVisibility(i2);
        this.s = i2;
    }

    public final void b(String str) {
        this.h.setContentDescription(str);
    }

    public final void a(String str) {
        this.c.setText(str);
    }

    private final void e(int i2) {
        if (!this.G || !this.H) {
            this.c.setVisibility(i2);
            this.d = i2;
        }
    }

    private final void j(int i2) {
        this.n.setVisibility(i2);
        this.o = i2;
    }

    public final void a(cuo cuo) {
        boolean z2;
        this.J = cuo;
        ImageView imageView = this.h;
        if (cuo != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        imageView.setSoundEffectsEnabled(z2);
    }

    public final void d() {
        this.aM = false;
    }

    private final void i(int i2) {
        this.p.setVisibility(i2);
        this.q = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:311:0x064e  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x0657  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x065a  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0666  */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x0669  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x0675 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x0683  */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x0695  */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x06a1  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x06af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(int r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r0.A
            if (r1 == r2) goto L_0x06cd
            r0.A = r1
            if (r1 != r2) goto L_0x000d
            goto L_0x001a
        L_0x000d:
            boolean r2 = c(r2)
            if (r2 == 0) goto L_0x001b
            boolean r2 = c(r17)
            if (r2 != 0) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            return
        L_0x001b:
            r2 = 5
            r3 = 23
            r4 = 22
            r5 = 21
            r6 = 7
            r7 = 24
            r8 = 32
            r9 = 3
            r10 = 27
            r12 = 1
            r13 = 4
            r14 = 0
            r15 = 8
            switch(r1) {
                case 0: goto L_0x032d;
                case 1: goto L_0x02b3;
                case 2: goto L_0x02b3;
                case 3: goto L_0x02b3;
                case 4: goto L_0x02b3;
                case 5: goto L_0x02b3;
                case 6: goto L_0x02b3;
                case 7: goto L_0x02b3;
                case 8: goto L_0x02b3;
                case 9: goto L_0x02b3;
                case 10: goto L_0x024a;
                case 11: goto L_0x01f9;
                case 12: goto L_0x01f9;
                case 13: goto L_0x0186;
                case 14: goto L_0x0135;
                case 15: goto L_0x00ea;
                case 16: goto L_0x0099;
                case 17: goto L_0x0034;
                case 18: goto L_0x032d;
                case 19: goto L_0x02b3;
                case 20: goto L_0x02b3;
                case 21: goto L_0x02b3;
                case 22: goto L_0x02b3;
                case 23: goto L_0x02b3;
                case 24: goto L_0x02b3;
                case 25: goto L_0x02b3;
                case 26: goto L_0x02b3;
                case 27: goto L_0x024a;
                case 28: goto L_0x01f9;
                case 29: goto L_0x01f9;
                case 30: goto L_0x0135;
                case 31: goto L_0x0099;
                case 32: goto L_0x0034;
                default: goto L_0x0032;
            }
        L_0x0032:
            goto L_0x03b1
        L_0x0034:
            r0.e(r14)
            r0.f(r13)
            int r11 = r0.A
            if (r11 == r8) goto L_0x004e
            android.widget.TextView r11 = r0.g
            boolean r8 = r0.E
            if (r8 != 0) goto L_0x0048
            r8 = 8
            goto L_0x004a
        L_0x0048:
            r8 = 0
        L_0x004a:
            r11.setVisibility(r8)
            goto L_0x0053
        L_0x004e:
            android.widget.TextView r8 = r0.g
            r8.setVisibility(r15)
        L_0x0053:
            r0.g(r13)
            android.widget.ImageView r8 = r0.aa
            r8.setVisibility(r15)
            android.widget.ImageView r8 = r0.ab
            r8.setVisibility(r15)
            android.view.View r8 = r0.T
            r8.setVisibility(r15)
            android.view.View r8 = r0.U
            r8.setVisibility(r15)
            android.view.View r8 = r0.V
            r8.setVisibility(r15)
            android.view.View r8 = r0.W
            r8.setVisibility(r15)
            boolean r8 = r0.aM
            if (r8 != 0) goto L_0x007c
            r8 = 8
            goto L_0x007e
        L_0x007c:
            r8 = 4
        L_0x007e:
            r0.k(r8)
            r0.j(r15)
            boolean r8 = r0.G
            if (r8 != 0) goto L_0x008b
            r8 = 8
            goto L_0x008d
        L_0x008b:
            r8 = 0
        L_0x008d:
            r0.i(r8)
            com.google.android.tvlauncher.home.view.FadingEdgeContainer r8 = r0.Q
            r8.a = r12
            r0.setFocusable(r14)
            goto L_0x03b1
        L_0x0099:
            r0.e(r13)
            r0.f(r14)
            android.widget.TextView r8 = r0.g
            boolean r11 = r0.E
            if (r11 != 0) goto L_0x00a9
            r11 = 8
            goto L_0x00ab
        L_0x00a9:
            r11 = 4
        L_0x00ab:
            r8.setVisibility(r11)
            r0.g(r13)
            android.widget.ImageView r8 = r0.aa
            r8.setVisibility(r15)
            android.widget.ImageView r8 = r0.ab
            r8.setVisibility(r15)
            android.view.View r8 = r0.T
            r8.setVisibility(r15)
            android.view.View r8 = r0.U
            r8.setVisibility(r15)
            android.view.View r8 = r0.V
            r8.setVisibility(r14)
            android.view.View r8 = r0.W
            r8.setVisibility(r15)
            r0.k(r13)
            r0.j(r15)
            boolean r8 = r0.G
            if (r8 != 0) goto L_0x00dc
            r8 = 8
            goto L_0x00de
        L_0x00dc:
            r8 = 0
        L_0x00de:
            r0.i(r8)
            com.google.android.tvlauncher.home.view.FadingEdgeContainer r8 = r0.Q
            r8.a = r14
            r0.setFocusable(r14)
            goto L_0x03b1
        L_0x00ea:
            r0.e(r13)
            r0.f(r14)
            android.widget.TextView r8 = r0.g
            boolean r11 = r0.E
            if (r11 != 0) goto L_0x00fa
            r11 = 8
            goto L_0x00fc
        L_0x00fa:
            r11 = 4
        L_0x00fc:
            r8.setVisibility(r11)
            r0.g(r13)
            android.widget.ImageView r8 = r0.aa
            r8.setVisibility(r13)
            android.widget.ImageView r8 = r0.ab
            r8.setVisibility(r14)
            android.view.View r8 = r0.T
            r8.setVisibility(r15)
            android.view.View r8 = r0.U
            r8.setVisibility(r15)
            android.view.View r8 = r0.V
            r8.setVisibility(r15)
            android.view.View r8 = r0.W
            r8.setVisibility(r15)
            r0.k(r13)
            r0.j(r14)
            r0.i(r15)
            com.google.android.tvlauncher.home.view.FadingEdgeContainer r8 = r0.Q
            r8.a = r14
            r0.setFocusable(r12)
            r16.requestFocus()
            goto L_0x03b1
        L_0x0135:
            r0.e(r13)
            r0.f(r14)
            android.widget.TextView r8 = r0.g
            boolean r11 = r0.E
            if (r11 != 0) goto L_0x0145
            r11 = 8
            goto L_0x0147
        L_0x0145:
            r11 = 4
        L_0x0147:
            r8.setVisibility(r11)
            r0.g(r13)
            android.widget.ImageView r8 = r0.aa
            r8.setVisibility(r15)
            android.widget.ImageView r8 = r0.ab
            r8.setVisibility(r15)
            android.view.View r8 = r0.T
            r8.setVisibility(r15)
            android.view.View r8 = r0.U
            r8.setVisibility(r14)
            android.view.View r8 = r0.V
            r8.setVisibility(r15)
            android.view.View r8 = r0.W
            r8.setVisibility(r15)
            r0.k(r13)
            r0.j(r15)
            boolean r8 = r0.G
            if (r8 != 0) goto L_0x0178
            r8 = 8
            goto L_0x017a
        L_0x0178:
            r8 = 0
        L_0x017a:
            r0.i(r8)
            com.google.android.tvlauncher.home.view.FadingEdgeContainer r8 = r0.Q
            r8.a = r14
            r0.setFocusable(r14)
            goto L_0x03b1
        L_0x0186:
            r0.e(r13)
            r0.f(r14)
            android.widget.TextView r8 = r0.g
            boolean r11 = r0.E
            if (r11 != 0) goto L_0x0196
            r11 = 8
            goto L_0x0198
        L_0x0196:
            r11 = 4
        L_0x0198:
            r8.setVisibility(r11)
            r0.g(r13)
            android.widget.ImageView r8 = r0.aa
            r8.setVisibility(r14)
            android.widget.ImageView r8 = r0.ab
            boolean r11 = r0.B
            if (r11 != 0) goto L_0x01ac
            r11 = 8
            goto L_0x01ae
        L_0x01ac:
            r11 = 0
        L_0x01ae:
            r8.setVisibility(r11)
            android.view.View r8 = r0.T
            r8.setVisibility(r15)
            android.view.View r8 = r0.U
            r8.setVisibility(r15)
            android.view.View r8 = r0.V
            r8.setVisibility(r15)
            android.view.View r8 = r0.W
            boolean r11 = r0.B
            if (r11 != 0) goto L_0x01c8
            r11 = 0
            goto L_0x01cb
        L_0x01c8:
            r11 = 8
        L_0x01cb:
            r8.setVisibility(r11)
            r0.k(r13)
            r0.j(r15)
            boolean r8 = r0.G
            if (r8 != 0) goto L_0x01db
            r8 = 8
            goto L_0x01dd
        L_0x01db:
            r8 = 0
        L_0x01dd:
            r0.i(r8)
            com.google.android.tvlauncher.home.view.FadingEdgeContainer r8 = r0.Q
            r8.a = r14
            r0.setFocusable(r14)
            boolean r8 = r0.B
            if (r8 == 0) goto L_0x01f2
            android.widget.ImageView r8 = r0.ab
            r8.requestFocus()
            goto L_0x03b1
        L_0x01f2:
            android.widget.ImageView r8 = r0.aa
            r8.requestFocus()
            goto L_0x03b1
        L_0x01f9:
            r0.e(r13)
            r0.f(r14)
            android.widget.TextView r8 = r0.g
            boolean r11 = r0.E
            if (r11 != 0) goto L_0x0209
            r11 = 8
            goto L_0x020b
        L_0x0209:
            r11 = 4
        L_0x020b:
            r8.setVisibility(r11)
            r0.g(r13)
            android.widget.ImageView r8 = r0.aa
            r8.setVisibility(r15)
            android.widget.ImageView r8 = r0.ab
            r8.setVisibility(r15)
            android.view.View r8 = r0.T
            r8.setVisibility(r14)
            android.view.View r8 = r0.U
            r8.setVisibility(r15)
            android.view.View r8 = r0.V
            r8.setVisibility(r15)
            android.view.View r8 = r0.W
            r8.setVisibility(r15)
            r0.k(r13)
            r0.j(r15)
            boolean r8 = r0.G
            if (r8 != 0) goto L_0x023c
            r8 = 8
            goto L_0x023e
        L_0x023c:
            r8 = 0
        L_0x023e:
            r0.i(r8)
            com.google.android.tvlauncher.home.view.FadingEdgeContainer r8 = r0.Q
            r8.a = r14
            r0.setFocusable(r14)
            goto L_0x03b1
        L_0x024a:
            r0.e(r13)
            r0.f(r14)
            android.widget.TextView r8 = r0.g
            boolean r11 = r0.E
            if (r11 != 0) goto L_0x025a
            r11 = 8
            goto L_0x025c
        L_0x025a:
            r11 = 4
        L_0x025c:
            r8.setVisibility(r11)
            if (r1 == r10) goto L_0x0272
            boolean r8 = r0.B
            if (r8 != 0) goto L_0x026d
            boolean r8 = r0.C
            if (r8 != 0) goto L_0x026b
            r8 = 4
            goto L_0x026e
        L_0x026b:
        L_0x026d:
            r8 = 0
        L_0x026e:
            r0.g(r8)
            goto L_0x0275
        L_0x0272:
            r0.g(r13)
        L_0x0275:
            android.widget.ImageView r8 = r0.aa
            r8.setVisibility(r15)
            android.widget.ImageView r8 = r0.ab
            r8.setVisibility(r15)
            android.view.View r8 = r0.T
            r8.setVisibility(r14)
            android.view.View r8 = r0.U
            r8.setVisibility(r15)
            android.view.View r8 = r0.V
            r8.setVisibility(r15)
            android.view.View r8 = r0.W
            r8.setVisibility(r15)
            r0.k(r13)
            r0.j(r15)
            boolean r8 = r0.G
            if (r8 != 0) goto L_0x02a0
            r8 = 8
            goto L_0x02a2
        L_0x02a0:
            r8 = 0
        L_0x02a2:
            r0.i(r8)
            com.google.android.tvlauncher.home.view.FadingEdgeContainer r8 = r0.Q
            r8.a = r14
            r0.setFocusable(r14)
            android.widget.ImageView r8 = r0.h
            r8.requestFocus()
            goto L_0x03b1
        L_0x02b3:
            boolean r8 = r0.G
            if (r8 == 0) goto L_0x02bd
            boolean r8 = r0.H
            if (r8 != 0) goto L_0x02bd
            r8 = 1
            goto L_0x02be
        L_0x02bd:
            r8 = 0
        L_0x02be:
            if (r1 != r12) goto L_0x02c2
        L_0x02c0:
            r8 = 0
            goto L_0x02d5
        L_0x02c2:
            if (r1 == r7) goto L_0x02c0
            if (r1 == r6) goto L_0x02c0
            if (r1 == r4) goto L_0x02c0
            if (r1 == r13) goto L_0x02c0
            if (r1 == r3) goto L_0x02c0
            if (r1 == r2) goto L_0x02c0
            if (r1 == r9) goto L_0x02d2
            if (r1 != r5) goto L_0x02d4
        L_0x02d2:
            if (r8 != 0) goto L_0x02c0
        L_0x02d4:
            r8 = 4
        L_0x02d5:
            r0.e(r8)
            r0.f(r13)
            boolean r8 = r0.E
            if (r8 == 0) goto L_0x02eb
            android.widget.TextView r8 = r0.g
            if (r1 != r9) goto L_0x02e5
            r11 = 0
            goto L_0x02e7
        L_0x02e5:
            r11 = 4
        L_0x02e7:
            r8.setVisibility(r11)
            goto L_0x02f0
        L_0x02eb:
            android.widget.TextView r8 = r0.g
            r8.setVisibility(r15)
        L_0x02f0:
            r0.g(r13)
            android.widget.ImageView r8 = r0.aa
            r8.setVisibility(r15)
            android.widget.ImageView r8 = r0.ab
            r8.setVisibility(r15)
            android.view.View r8 = r0.T
            r8.setVisibility(r15)
            android.view.View r8 = r0.U
            r8.setVisibility(r15)
            android.view.View r8 = r0.V
            r8.setVisibility(r15)
            android.view.View r8 = r0.W
            r8.setVisibility(r15)
            r0.k(r13)
            r0.j(r15)
            boolean r8 = r0.G
            if (r8 != 0) goto L_0x031f
            r8 = 8
            goto L_0x0321
        L_0x031f:
            r8 = 0
        L_0x0321:
            r0.i(r8)
            com.google.android.tvlauncher.home.view.FadingEdgeContainer r8 = r0.Q
            r8.a = r14
            r0.setFocusable(r14)
            goto L_0x03b1
        L_0x032d:
            r0.e(r14)
            r0.f(r13)
            boolean r8 = r0.E
            if (r8 == 0) goto L_0x0346
            android.widget.TextView r8 = r0.g
            r11 = 18
            if (r1 != r11) goto L_0x0340
            r11 = 4
            goto L_0x0342
        L_0x0340:
            r11 = 0
        L_0x0342:
            r8.setVisibility(r11)
            goto L_0x034b
        L_0x0346:
            android.widget.TextView r8 = r0.g
            r8.setVisibility(r15)
        L_0x034b:
            r0.g(r13)
            android.widget.ImageView r8 = r0.aa
            r8.setVisibility(r15)
            android.widget.ImageView r8 = r0.ab
            r8.setVisibility(r15)
            android.view.View r8 = r0.T
            r8.setVisibility(r15)
            android.view.View r8 = r0.U
            r8.setVisibility(r15)
            android.view.View r8 = r0.V
            r8.setVisibility(r15)
            android.view.View r8 = r0.W
            r8.setVisibility(r15)
            boolean r8 = r0.aM
            if (r8 != 0) goto L_0x0375
            r0.k(r15)
            goto L_0x0381
        L_0x0375:
            r8 = 18
            if (r1 != r8) goto L_0x037c
            r8 = 4
            goto L_0x037e
        L_0x037c:
            r8 = 0
        L_0x037e:
            r0.k(r8)
        L_0x0381:
            r0.j(r15)
            boolean r8 = r0.G
            if (r8 != 0) goto L_0x038c
            r8 = 8
            goto L_0x038e
        L_0x038c:
            r8 = 0
        L_0x038e:
            r0.i(r8)
            com.google.android.tvlauncher.home.view.FadingEdgeContainer r8 = r0.Q
            r8.a = r12
            r0.setFocusable(r14)
            android.content.Context r8 = r16.getContext()
            boolean r8 = defpackage.dcy.b(r8)
            if (r8 != 0) goto L_0x03b1
            r8 = 18
            if (r1 == r8) goto L_0x03ac
            androidx.leanback.widget.HorizontalGridView r8 = r0.b
            r8.requestFocus()
            goto L_0x03b1
        L_0x03ac:
            android.widget.TextView r8 = r0.j
            r8.requestFocus()
        L_0x03b1:
            if (r1 == 0) goto L_0x03b6
            r0.a(r14)
        L_0x03b6:
            boolean r8 = defpackage.dcy.a(r17)
            if (r8 == 0) goto L_0x03c5
            r0.h(r14)
            androidx.leanback.widget.HorizontalGridView r8 = r0.b
            r8.setFocusable(r14)
            goto L_0x03ce
        L_0x03c5:
            r0.h(r13)
            androidx.leanback.widget.HorizontalGridView r8 = r0.b
            r8.setFocusable(r12)
        L_0x03ce:
            switch(r1) {
                case 10: goto L_0x03d7;
                case 11: goto L_0x03d7;
                case 12: goto L_0x03d7;
                case 13: goto L_0x03d7;
                case 14: goto L_0x03d7;
                case 15: goto L_0x03d7;
                case 16: goto L_0x03d7;
                default: goto L_0x03d1;
            }
        L_0x03d1:
            switch(r1) {
                case 27: goto L_0x03d7;
                case 28: goto L_0x03d7;
                case 29: goto L_0x03d7;
                case 30: goto L_0x03d7;
                case 31: goto L_0x03d7;
                default: goto L_0x03d4;
            }
        L_0x03d4:
            r8 = 0
            goto L_0x03d8
        L_0x03d7:
            r8 = 1
        L_0x03d8:
            com.google.android.tvlauncher.home.view.ChannelViewMainLinearLayout r11 = r0.P
            r11.a = r8
            android.widget.TextView r11 = r0.c
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r11 = (android.view.ViewGroup.MarginLayoutParams) r11
            android.widget.TextView r3 = r0.g
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            android.util.SparseArray r4 = r0.F
            r2 = 10
            if (r4 == 0) goto L_0x051f
            java.lang.Object r4 = r4.get(r1)
            ctl r4 = (defpackage.ctl) r4
            boolean r13 = r0.G
            if (r13 == 0) goto L_0x0406
            int r13 = r4.k
            com.google.android.tvlauncher.home.view.ChannelViewMainLinearLayout r12 = r0.P
            r12.b = r13
            com.google.android.tvlauncher.home.view.ChannelViewMainContent r12 = r0.a
            r12.c = r13
        L_0x0406:
            android.view.ViewGroup$LayoutParams r12 = r16.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r12 = (android.view.ViewGroup.MarginLayoutParams) r12
            int r13 = r4.d
            int r15 = r4.e
            r12.setMargins(r14, r13, r14, r15)
            r0.setLayoutParams(r12)
            com.google.android.tvlauncher.home.view.FadingEdgeContainer r12 = r0.Q
            android.view.ViewGroup$LayoutParams r12 = r12.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r12 = (android.view.ViewGroup.MarginLayoutParams) r12
            if (r8 != 0) goto L_0x0423
            int r13 = r0.ae
            goto L_0x0425
        L_0x0423:
            int r13 = r0.af
        L_0x0425:
            r12.setMarginStart(r13)
            com.google.android.tvlauncher.home.view.FadingEdgeContainer r13 = r0.Q
            r13.setLayoutParams(r12)
            androidx.leanback.widget.HorizontalGridView r12 = r0.b
            android.view.ViewGroup$LayoutParams r12 = r12.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r12 = (android.view.ViewGroup.MarginLayoutParams) r12
            int r13 = r4.a
            int r15 = r4.b
            int r13 = r13 + r15
            int r15 = r4.c
            int r13 = r13 + r15
            r12.height = r13
            androidx.leanback.widget.HorizontalGridView r13 = r0.b
            r13.setLayoutParams(r12)
            android.widget.ImageView r12 = r0.h
            android.view.ViewGroup$LayoutParams r12 = r12.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r12 = (android.widget.LinearLayout.LayoutParams) r12
            int r13 = r4.f
            android.content.Context r15 = r16.getContext()
            boolean r15 = defpackage.dcy.d(r15)
            if (r15 == 0) goto L_0x0459
        L_0x0458:
            goto L_0x0465
        L_0x0459:
            if (r1 != r2) goto L_0x0458
            android.util.SparseArray r4 = r0.F
            r15 = 11
            java.lang.Object r4 = r4.get(r15)
            ctl r4 = (defpackage.ctl) r4
        L_0x0465:
            int r15 = r4.h
            r12.height = r15
            int r15 = r4.g
            r12.width = r15
            int r15 = r4.i
            r12.setMarginStart(r15)
            int r15 = r4.j
            r12.setMarginEnd(r15)
            android.widget.TextView r15 = r0.j
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r15 = (android.widget.FrameLayout.LayoutParams) r15
            if (r8 == 0) goto L_0x049d
            int r7 = r0.A
            r6 = 30
            if (r7 != r6) goto L_0x048d
            int r6 = r0.ao
            r15.setMarginStart(r6)
            goto L_0x04a2
        L_0x048d:
            r6 = 31
            if (r7 == r6) goto L_0x0497
            int r6 = r0.an
            r15.setMarginStart(r6)
            goto L_0x04a2
        L_0x0497:
            int r6 = r0.ap
            r15.setMarginStart(r6)
            goto L_0x04a2
        L_0x049d:
            int r6 = r0.am
            r15.setMarginStart(r6)
        L_0x04a2:
            int r6 = r4.o
            r15.topMargin = r6
            android.widget.TextView r6 = r0.j
            r6.setLayoutParams(r15)
            boolean r6 = r0.G
            r7 = 80
            r15 = 48
            if (r6 != 0) goto L_0x04f3
            android.content.Context r6 = r16.getContext()
            boolean r6 = defpackage.dcy.d(r6)
            if (r6 == 0) goto L_0x04bf
            if (r1 == r2) goto L_0x04e6
        L_0x04bf:
            if (r1 == r10) goto L_0x04e6
            if (r8 == 0) goto L_0x04cf
            r12.gravity = r15
            int r6 = r0.ac
            int r13 = r13 + r6
            r12.topMargin = r13
            int r6 = r0.ac
            r12.bottomMargin = r6
            goto L_0x050e
        L_0x04cf:
            r6 = 2
            if (r1 == r6) goto L_0x04de
            r6 = 20
            if (r1 != r6) goto L_0x04d7
            goto L_0x04de
        L_0x04d7:
            r12.gravity = r15
            r12.topMargin = r13
            r12.bottomMargin = r14
            goto L_0x050e
        L_0x04de:
            r12.gravity = r7
            r12.topMargin = r14
            r12.bottomMargin = r13
            goto L_0x050e
        L_0x04e6:
            r12.gravity = r15
            int r6 = r0.ad
            int r13 = r13 + r6
            r12.topMargin = r13
            int r6 = r0.ad
            r12.bottomMargin = r6
            goto L_0x050e
        L_0x04f3:
            if (r1 != r9) goto L_0x04f7
            goto L_0x04fa
        L_0x04f7:
            if (r1 != r5) goto L_0x0507
        L_0x04fa:
            boolean r6 = r0.H
            if (r6 == 0) goto L_0x04ff
            goto L_0x0507
        L_0x04ff:
            r12.gravity = r7
            r12.bottomMargin = r13
            r12.topMargin = r14
            goto L_0x050e
        L_0x0507:
            r12.gravity = r15
            r12.topMargin = r13
            r12.bottomMargin = r14
        L_0x050e:
            android.widget.ImageView r6 = r0.h
            r6.setLayoutParams(r12)
            int r6 = r4.l
            r11.bottomMargin = r6
            int r6 = r4.m
            r3.topMargin = r6
            int r4 = r4.n
            r3.bottomMargin = r4
        L_0x051f:
            boolean r4 = r0.G
            r6 = 17
            if (r4 == 0) goto L_0x0573
            android.view.View r4 = r0.p
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r4 = (android.widget.FrameLayout.LayoutParams) r4
            r4.setMarginStart(r14)
            if (r1 != 0) goto L_0x0537
            int r5 = r0.ax
            r4.height = r5
            goto L_0x0567
        L_0x0537:
            if (r1 != r9) goto L_0x053b
            goto L_0x053d
        L_0x053b:
            if (r1 != r5) goto L_0x0546
        L_0x053d:
            boolean r5 = r0.H
            if (r5 != 0) goto L_0x0546
            int r5 = r0.az
            r4.height = r5
            goto L_0x055d
        L_0x0546:
            if (r8 == 0) goto L_0x054d
            int r5 = r0.aw
            r4.height = r5
            goto L_0x055d
        L_0x054d:
            if (r1 != r6) goto L_0x0550
            goto L_0x0559
        L_0x0550:
            r5 = 32
            if (r1 == r5) goto L_0x0559
            int r5 = r0.av
            r4.height = r5
            goto L_0x055d
        L_0x0559:
            int r5 = r0.ay
            r4.height = r5
        L_0x055d:
            if (r1 != r2) goto L_0x0567
            android.view.View r5 = r0.p
            int r7 = r0.aB
            r5.setBackgroundColor(r7)
            goto L_0x056e
        L_0x0567:
            android.view.View r5 = r0.p
            int r7 = r0.aA
            r5.setBackgroundColor(r7)
        L_0x056e:
            android.view.View r5 = r0.p
            r5.setLayoutParams(r4)
        L_0x0573:
            android.widget.TextView r4 = r0.c
            r4.setLayoutParams(r11)
            android.content.Context r4 = r16.getContext()
            boolean r4 = defpackage.dcy.d(r4)
            r5 = 0
            if (r4 == 0) goto L_0x058f
            android.widget.ImageView r4 = r0.h
            if (r1 != r2) goto L_0x058a
            float r7 = r0.u
            goto L_0x058c
        L_0x058a:
            r7 = 0
        L_0x058c:
            r4.setElevation(r7)
        L_0x058f:
            r4 = 6
            r7 = 15
            if (r1 != 0) goto L_0x0595
        L_0x0594:
            goto L_0x05be
        L_0x0595:
            r11 = 7
            if (r1 == r11) goto L_0x0594
            if (r1 == r2) goto L_0x0594
            r11 = 13
            if (r1 == r11) goto L_0x0594
            if (r1 == r7) goto L_0x0594
            r11 = 18
            if (r1 == r11) goto L_0x0594
            r11 = 24
            if (r1 == r11) goto L_0x0594
            if (r1 == r10) goto L_0x0594
            r11 = 8
            if (r1 == r11) goto L_0x0594
            r11 = 9
            if (r1 == r11) goto L_0x0594
            r11 = 25
            if (r1 == r11) goto L_0x0594
            r11 = 26
            if (r1 == r11) goto L_0x0594
            if (r1 == r4) goto L_0x0594
            float r5 = r0.S
        L_0x05be:
            float r11 = r0.i
            float r11 = r5 - r11
            float r11 = java.lang.Math.abs(r11)
            r12 = 981668463(0x3a83126f, float:0.001)
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x05e5
            r0.i = r5
            int r11 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r11 >= 0) goto L_0x05da
            android.widget.ImageView r5 = r0.h
            r11 = 0
            r5.setColorFilter(r11)
            goto L_0x05e5
        L_0x05da:
            android.widget.ImageView r11 = r0.h
            r13 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.graphics.ColorFilter r5 = defpackage.dej.b(r13, r5)
            r11.setColorFilter(r5)
        L_0x05e5:
            if (r1 == r4) goto L_0x05ea
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L_0x05ee
        L_0x05ea:
            r4 = 1036831949(0x3dcccccd, float:0.1)
        L_0x05ee:
            float r5 = r0.R
            float r5 = r4 - r5
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x0601
            r0.R = r4
            android.widget.ImageView r5 = r0.h
            r5.setAlpha(r4)
        L_0x0601:
            boolean r4 = r0.G
            if (r4 == 0) goto L_0x0629
            if (r1 != r2) goto L_0x0608
            goto L_0x0626
        L_0x0608:
            if (r1 == r10) goto L_0x0626
            if (r1 == r7) goto L_0x0626
            if (r1 == 0) goto L_0x0626
            r4 = 18
            if (r1 == r4) goto L_0x0626
            r4 = 7
            if (r1 == r4) goto L_0x0626
            r4 = 24
            if (r1 == r4) goto L_0x0626
            r4 = 1
            if (r1 != r4) goto L_0x061d
        L_0x061c:
            goto L_0x0623
        L_0x061d:
            r4 = 2
            if (r1 == r4) goto L_0x061c
            if (r1 == r9) goto L_0x061c
            goto L_0x0648
        L_0x0623:
            int r4 = r0.ai
            goto L_0x064a
        L_0x0626:
            int r4 = r0.ak
            goto L_0x064a
        L_0x0629:
            r4 = 1
            if (r1 != r4) goto L_0x062d
        L_0x062c:
            goto L_0x0648
        L_0x062d:
            r4 = 4
            if (r1 == r4) goto L_0x062c
            r4 = 5
            if (r1 == r4) goto L_0x062c
            if (r1 == r6) goto L_0x062c
            r4 = 22
            if (r1 == r4) goto L_0x062c
            r4 = 23
            if (r1 == r4) goto L_0x062c
            r4 = 32
            if (r1 == r4) goto L_0x062c
            r4 = 19
            if (r1 == r4) goto L_0x062c
            int r4 = r0.ak
            goto L_0x064a
        L_0x0648:
            int r4 = r0.al
        L_0x064a:
            int r5 = r0.w
            if (r4 == r5) goto L_0x0655
            r0.w = r4
            android.widget.TextView r5 = r0.c
            r5.setTextColor(r4)
        L_0x0655:
            if (r8 != 0) goto L_0x065a
            int r4 = r0.ag
            goto L_0x065c
        L_0x065a:
            int r4 = r0.ah
        L_0x065c:
            r3.setMarginStart(r4)
            android.widget.TextView r4 = r0.g
            r4.setLayoutParams(r3)
            if (r1 == 0) goto L_0x0669
            int r3 = r0.ai
            goto L_0x066b
        L_0x0669:
            int r3 = r0.aj
        L_0x066b:
            r0.v = r3
            android.widget.TextView r4 = r0.g
            r4.setTextColor(r3)
            if (r1 != r2) goto L_0x0675
            goto L_0x067c
        L_0x0675:
            if (r1 == r10) goto L_0x067c
            if (r1 == r7) goto L_0x067c
            int r2 = r0.al
            goto L_0x067e
        L_0x067c:
            int r2 = r0.ak
        L_0x067e:
            int r3 = r0.x
            if (r2 != r3) goto L_0x0683
            goto L_0x068a
        L_0x0683:
            r0.x = r2
            android.widget.TextView r3 = r0.e
            r3.setTextColor(r2)
        L_0x068a:
            android.view.View r2 = r0.r
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            if (r1 != 0) goto L_0x0695
            goto L_0x06bc
        L_0x0695:
            r3 = 18
            if (r1 == r3) goto L_0x06bc
            if (r1 == r6) goto L_0x06bc
            r3 = 32
            if (r1 == r3) goto L_0x06bc
            if (r8 != 0) goto L_0x06af
            int r1 = r0.aq
            r2.topMargin = r1
            int r1 = r0.as
            r2.bottomMargin = r1
            int r1 = r0.at
            r2.setMarginStart(r1)
            goto L_0x06c7
        L_0x06af:
            r2.topMargin = r14
            int r1 = r0.as
            r2.bottomMargin = r1
            int r1 = r0.au
            r2.setMarginStart(r1)
            goto L_0x06c7
        L_0x06bc:
            int r1 = r0.ar
            r2.topMargin = r1
            r2.bottomMargin = r14
            int r1 = r0.at
            r2.setMarginStart(r1)
        L_0x06c7:
            android.view.View r1 = r0.r
            r1.setLayoutParams(r2)
            return
        L_0x06cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.tvlauncher.home.view.ChannelView.b(int):void");
    }

    public final void a(boolean z2) {
        this.z = z2;
        if (!z2) {
            c();
        } else if (this.I) {
        } else {
            if (this.b.o()) {
                this.b.x.a(new cud(this));
            } else {
                b();
            }
        }
    }

    public final void c(String str) {
        this.e.setText(str);
    }

    private final void f(int i2) {
        this.e.setVisibility(i2);
        this.f = i2;
    }

    public static String a(int i2) {
        String str;
        switch (i2) {
            case 0:
                str = "STATE_DEFAULT_SELECTED";
                break;
            case 1:
                str = "STATE_DEFAULT_NOT_SELECTED";
                break;
            case 2:
                str = "STATE_DEFAULT_ABOVE_SELECTED";
                break;
            case 3:
                str = "STATE_DEFAULT_BELOW_SELECTED";
                break;
            case 4:
                str = "STATE_DEFAULT_TOP_ROW_SELECTED";
                break;
            case 5:
                str = "STATE_DEFAULT_SYSTEM_BAR_SELECTED";
                break;
            case 6:
                str = "STATE_DEFAULT_FEATURED_CAROUSEL_MEDIA";
                break;
            case 7:
                str = "STATE_DEFAULT_APPS_ROW_SELECTED";
                break;
            case 8:
                str = "STATE_DEFAULT_FAST_SCROLLING_SELECTED";
                break;
            case 9:
                str = "STATE_DEFAULT_FAST_SCROLLING_NOT_SELECTED";
                break;
            case 10:
                str = "STATE_ZOOMED_OUT_SELECTED";
                break;
            case 11:
                str = "STATE_ZOOMED_OUT_NOT_SELECTED";
                break;
            case 12:
                str = "STATE_ZOOMED_OUT_TOP_ROW_SELECTED";
                break;
            case 13:
                str = "STATE_ACTIONS_SELECTED";
                break;
            case 14:
                str = "STATE_ACTIONS_NOT_SELECTED";
                break;
            case 15:
                str = "STATE_MOVE_SELECTED";
                break;
            case 16:
                str = "STATE_MOVE_NOT_SELECTED";
                break;
            case 17:
                str = "STATE_DEFAULT_ABOVE_SELECTED_LAST_ROW";
                break;
            case 18:
                str = "STATE_EMPTY_DEFAULT_SELECTED";
                break;
            case 19:
                str = "STATE_EMPTY_DEFAULT_NOT_SELECTED";
                break;
            case 20:
                str = "STATE_EMPTY_DEFAULT_ABOVE_SELECTED";
                break;
            case 21:
                str = "STATE_EMPTY_DEFAULT_BELOW_SELECTED";
                break;
            case 22:
                str = "STATE_EMPTY_DEFAULT_TOP_ROW_SELECTED";
                break;
            case 23:
                str = "STATE_EMPTY_DEFAULT_SYSTEM_BAR_SELECTED";
                break;
            case 24:
                str = "STATE_EMPTY_DEFAULT_APPS_ROW_SELECTED";
                break;
            case 25:
                str = "STATE_EMPTY_DEFAULT_FAST_SCROLLING_SELECTED";
                break;
            case 26:
                str = "STATE_EMPTY_DEFAULT_FAST_SCROLLING_NOT_SELECTED";
                break;
            case 27:
                str = "STATE_EMPTY_ZOOMED_OUT_SELECTED";
                break;
            case 28:
                str = "STATE_EMPTY_ZOOMED_OUT_NOT_SELECTED";
                break;
            case 29:
                str = "STATE_EMPTY_ZOOMED_OUT_TOP_ROW_SELECTED";
                break;
            case 30:
                str = "STATE_EMPTY_ACTIONS_NOT_SELECTED";
                break;
            case 31:
                str = "STATE_EMPTY_MOVE_NOT_SELECTED";
                break;
            case 32:
                str = "STATE_EMPTY_DEFAULT_ABOVE_SELECTED_LAST_ROW";
                break;
            default:
                str = "STATE_UNKNOWN";
                break;
        }
        StringBuilder sb = new StringBuilder(str.length() + 14);
        sb.append(str);
        sb.append(" (");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }

    public final String toString() {
        String frameLayout = super.toString();
        String valueOf = String.valueOf(this.e.getText());
        StringBuilder sb = new StringBuilder(String.valueOf(frameLayout).length() + 12 + String.valueOf(valueOf).length());
        sb.append('{');
        sb.append(frameLayout);
        sb.append(", title='");
        sb.append(valueOf);
        sb.append("'}");
        return sb.toString();
    }

    public final void a(boolean z2, boolean z3) {
        this.B = true;
        if (z2 && z3) {
            this.ab.setImageDrawable(this.aC);
        } else if (z2) {
            this.ab.setImageDrawable(this.aD);
        } else if (z3) {
            this.ab.setImageDrawable(this.aE);
        } else {
            this.B = false;
        }
    }
}
