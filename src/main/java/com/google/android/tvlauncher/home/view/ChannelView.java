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

    /* renamed from: A */
    public int f6450A = 1;

    /* renamed from: B */
    public boolean f6451B = true;

    /* renamed from: C */
    public boolean f6452C = true;

    /* renamed from: D */
    public boolean f6453D = true;

    /* renamed from: E */
    public boolean f6454E = true;

    /* renamed from: F */
    public SparseArray f6455F;

    /* renamed from: G */
    public boolean f6456G;

    /* renamed from: H */
    public boolean f6457H = true;

    /* renamed from: I */
    public boolean f6458I;

    /* renamed from: J */
    public cuo f6459J;

    /* renamed from: K */
    public cun f6460K;

    /* renamed from: L */
    public cum f6461L;

    /* renamed from: M */
    public cup f6462M;

    /* renamed from: N */
    public cul f6463N;

    /* renamed from: O */
    public cuq f6464O;

    /* renamed from: P */
    private ChannelViewMainLinearLayout f6465P;

    /* renamed from: Q */
    private FadingEdgeContainer f6466Q;

    /* renamed from: R */
    private float f6467R;

    /* renamed from: S */
    private float f6468S;

    /* renamed from: T */
    private View f6469T;

    /* renamed from: U */
    private View f6470U;

    /* renamed from: V */
    private View f6471V;

    /* renamed from: W */
    private View f6472W;

    /* renamed from: a */
    public ChannelViewMainContent f6473a;

    /* renamed from: aA */
    private int f6474aA;

    /* renamed from: aB */
    private int f6475aB;

    /* renamed from: aC */
    private Drawable f6476aC;

    /* renamed from: aD */
    private Drawable f6477aD;

    /* renamed from: aE */
    private Drawable f6478aE;

    /* renamed from: aF */
    private int f6479aF;

    /* renamed from: aG */
    private int f6480aG;

    /* renamed from: aH */
    private TextView f6481aH;

    /* renamed from: aI */
    private Animator f6482aI;

    /* renamed from: aJ */
    private int f6483aJ;

    /* renamed from: aK */
    private boolean f6484aK = true;

    /* renamed from: aL */
    private ViewTreeObserver.OnGlobalFocusChangeListener f6485aL;

    /* renamed from: aM */
    private boolean f6486aM = true;

    /* renamed from: aN */
    private boolean f6487aN = false;

    /* renamed from: aO */
    private boolean f6488aO;

    /* renamed from: aP */
    private final AnimatorListenerAdapter f6489aP = new cue(this);

    /* renamed from: aQ */
    private final Runnable f6490aQ = new cug(this);

    /* renamed from: aa */
    private ImageView f6491aa;

    /* renamed from: ab */
    private ImageView f6492ab;

    /* renamed from: ac */
    private int f6493ac;

    /* renamed from: ad */
    private int f6494ad;

    /* renamed from: ae */
    private int f6495ae;

    /* renamed from: af */
    private int f6496af;

    /* renamed from: ag */
    private int f6497ag;

    /* renamed from: ah */
    private int f6498ah;

    /* renamed from: ai */
    private int f6499ai;

    /* renamed from: aj */
    private int f6500aj;

    /* renamed from: ak */
    private int f6501ak;

    /* renamed from: al */
    private int f6502al;

    /* renamed from: am */
    private int f6503am;

    /* renamed from: an */
    private int f6504an;

    /* renamed from: ao */
    private int f6505ao;

    /* renamed from: ap */
    private int f6506ap;

    /* renamed from: aq */
    private int f6507aq;

    /* renamed from: ar */
    private int f6508ar;

    /* renamed from: as */
    private int f6509as;

    /* renamed from: at */
    private int f6510at;

    /* renamed from: au */
    private int f6511au;

    /* renamed from: av */
    private int f6512av;

    /* renamed from: aw */
    private int f6513aw;

    /* renamed from: ax */
    private int f6514ax;

    /* renamed from: ay */
    private int f6515ay;

    /* renamed from: az */
    private int f6516az;

    /* renamed from: b */
    public HorizontalGridView f6517b;

    /* renamed from: c */
    public TextView f6518c;

    /* renamed from: d */
    public int f6519d;

    /* renamed from: e */
    public TextView f6520e;

    /* renamed from: f */
    public int f6521f;

    /* renamed from: g */
    public TextView f6522g;

    /* renamed from: h */
    public ImageView f6523h;

    /* renamed from: i */
    public float f6524i;

    /* renamed from: j */
    public TextView f6525j;

    /* renamed from: k */
    public View f6526k;

    /* renamed from: l */
    public int f6527l;

    /* renamed from: m */
    public int f6528m;

    /* renamed from: n */
    public View f6529n;

    /* renamed from: o */
    public int f6530o;

    /* renamed from: p */
    public View f6531p;

    /* renamed from: q */
    public int f6532q;

    /* renamed from: r */
    public View f6533r;

    /* renamed from: s */
    public int f6534s;

    /* renamed from: t */
    public float f6535t;

    /* renamed from: u */
    public float f6536u;

    /* renamed from: v */
    public int f6537v;

    /* renamed from: w */
    public int f6538w;

    /* renamed from: x */
    public int f6539x;

    /* renamed from: y */
    public ObjectAnimator f6540y;

    /* renamed from: z */
    public boolean f6541z;

    public ChannelView(Context context) {
        super(context);
    }

    /* renamed from: c */
    private static boolean m5293c(int i) {
        return i == 8 || i == 9;
    }

    /* renamed from: d */
    private final int m5294d(int i) {
        if (!this.f6487aN) {
            return i;
        }
        if (i == 17) {
            return 66;
        }
        if (i == 66) {
            return 17;
        }
        return i;
    }

    public ChannelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ChannelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        if (this.f6450A == 0 && dcy.m6193b(getContext()) && m5294d(i) == 17 && m5292b(findFocus())) {
            this.f6523h.addFocusables(arrayList, i, i2);
            return;
        }
        int i3 = this.f6450A;
        if (i3 == 11 || i3 == 12 || i3 == 28 || i3 == 29) {
            this.f6523h.addFocusables(arrayList, i, i2);
        } else if (i3 == 0 || i3 == 1 || i3 == 2 || i3 == 3 || i3 == 4 || i3 == 5 || i3 == 6 || i3 == 7 || i3 == 17 || i3 == 8 || i3 == 9) {
            this.f6517b.addFocusables(arrayList, i, i2);
        } else if (i3 == 18 || i3 == 19 || i3 == 20 || i3 == 21 || i3 == 22 || i3 == 23 || i3 == 24 || i3 == 32 || i3 == 25 || i3 == 26) {
            this.f6525j.addFocusables(arrayList, i, i2);
        } else {
            super.addFocusables(arrayList, i, i2);
        }
    }

    /* renamed from: b */
    public final void mo3382b() {
        removeCallbacks(this.f6490aQ);
        postDelayed(this.f6490aQ, 100);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        if (keyEvent.getKeyCode() == 21 || keyEvent.getKeyCode() == 22) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() > 0) {
                this.f6488aO = true;
            } else if (this.f6488aO && keyEvent.getAction() == 1) {
                this.f6488aO = false;
            }
        }
        return dispatchKeyEvent;
    }

    public final View focusSearch(int i) {
        cum cum;
        if (i == 33) {
            cun cun = this.f6460K;
            if (cun != null) {
                cun.mo3518b(this);
            }
        } else if (i == 130 && (cum = this.f6461L) != null) {
            cum.mo3522c(this);
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
            int r0 = r8.m5294d(r10)
            boolean r1 = r8.f6488aO
            if (r1 != 0) goto L_0x008f
            android.widget.TextView r1 = r8.f6525j
            r2 = 0
            r3 = 66
            r4 = 17
            r5 = 0
            r6 = 1
            if (r9 == r1) goto L_0x006d
            boolean r1 = r8.f6453D
            r7 = 10
            if (r1 == 0) goto L_0x002f
            androidx.leanback.widget.HorizontalGridView r1 = r8.f6517b
            if (r9 == r1) goto L_0x0024
            boolean r1 = r8.m5292b(r9)
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
            android.widget.ImageView r1 = r8.f6523h
            if (r9 == r1) goto L_0x0049
            android.widget.ImageView r1 = r8.f6492ab
            if (r9 == r1) goto L_0x0040
            android.widget.ImageView r1 = r8.f6491aa
            if (r9 == r1) goto L_0x003c
            goto L_0x0071
        L_0x003c:
            boolean r1 = r8.f6451B
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
            int r1 = r8.f6450A
            if (r1 != r7) goto L_0x006c
            boolean r1 = r8.f6451B
            if (r1 == 0) goto L_0x005f
            goto L_0x0064
        L_0x005f:
            boolean r1 = r8.f6452C
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
            cuq r1 = r8.f6464O
            if (r1 != 0) goto L_0x0079
            goto L_0x008a
        L_0x0079:
            int r2 = r5.intValue()
            r1.mo3521c(r2)
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

    /* renamed from: a */
    public final void mo3375a() {
        this.f6450A = -1;
    }

    /* renamed from: b */
    private final boolean m5292b(View view) {
        HorizontalGridView horizontalGridView;
        if (view != null && view.getParent() == (horizontalGridView = this.f6517b) && horizontalGridView.mo858d(view) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo3380a(View view) {
        if (view == null) {
            return false;
        }
        ViewParent parent = view.getParent();
        if (view == this.f6525j || parent == this.f6517b || parent == this.f6523h.getParent() || parent == this) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.f6485aL);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.f6485aL);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f6487aN = dcy.m6191a(getContext());
        Resources resources = getResources();
        this.f6501ak = getContext().getColor(R.color.channel_logo_title_color);
        this.f6502al = getContext().getColor(R.color.channel_logo_title_dimmed_color);
        this.f6493ac = resources.getDimensionPixelOffset(R.dimen.channel_logo_zoomed_out_margin);
        this.f6494ad = resources.getDimensionPixelOffset(R.dimen.channel_logo_zoomed_out_selected_margin);
        this.f6495ae = resources.getDimensionPixelOffset(R.dimen.channel_items_list_margin_start);
        this.f6496af = resources.getDimensionPixelOffset(R.dimen.channel_items_list_zoomed_out_margin_start);
        this.f6497ag = resources.getDimensionPixelOffset(R.dimen.channel_items_title_default_margin_start);
        this.f6498ah = resources.getDimensionPixelOffset(R.dimen.channel_items_title_zoomed_out_margin_start);
        this.f6499ai = getContext().getColor(R.color.channel_items_title_default_color);
        this.f6500aj = getContext().getColor(R.color.channel_items_title_selected_color);
        this.f6507aq = resources.getDimensionPixelOffset(R.dimen.program_meta_container_default_margin_top);
        this.f6508ar = resources.getDimensionPixelOffset(R.dimen.program_meta_container_selected_margin_top);
        this.f6509as = resources.getDimensionPixelSize(R.dimen.program_meta_container_invisible_margin_bottom);
        this.f6510at = resources.getDimensionPixelOffset(R.dimen.program_meta_container_default_margin_start);
        this.f6511au = resources.getDimensionPixelOffset(R.dimen.program_meta_container_zoomed_out_margin_start);
        this.f6512av = resources.getDimensionPixelSize(R.dimen.sponsored_channel_background_height);
        this.f6513aw = resources.getDimensionPixelSize(R.dimen.sponsored_channel_background_zoomed_out_height);
        this.f6514ax = resources.getDimensionPixelSize(R.dimen.sponsored_channel_background_default_selected_height);
        this.f6515ay = resources.getDimensionPixelSize(R.dimen.sponsored_channel_background_above_selected_last_row_height);
        this.f6516az = resources.getDimensionPixelSize(R.dimen.sponsored_channel_background_unbranded_below_selected_height);
        this.f6474aA = getContext().getColor(R.color.sponsored_channel_background_default_color);
        this.f6475aB = getContext().getColor(R.color.sponsored_channel_background_zoomed_out_selected_color);
        this.f6503am = resources.getDimensionPixelOffset(R.dimen.empty_channel_message_default_margin_start);
        this.f6504an = resources.getDimensionPixelOffset(R.dimen.empty_channel_message_zoomed_out_margin_start);
        this.f6505ao = resources.getDimensionPixelOffset(R.dimen.empty_channel_message_action_not_selected_margin_start);
        this.f6506ap = resources.getDimensionPixelOffset(R.dimen.empty_channel_message_move_not_selected_margin_start);
        setOnClickListener(new ctx(this));
        setFocusable(false);
        this.f6473a = (ChannelViewMainContent) findViewById(R.id.main_content);
        this.f6465P = (ChannelViewMainLinearLayout) findViewById(R.id.main_linear_layout);
        TextView textView = (TextView) findViewById(R.id.logo_title);
        this.f6518c = textView;
        this.f6519d = textView.getVisibility();
        TextView textView2 = (TextView) findViewById(R.id.logo_title_zoomed_out);
        this.f6520e = textView2;
        this.f6521f = textView2.getVisibility();
        this.f6539x = this.f6520e.getCurrentTextColor();
        TextView textView3 = (TextView) findViewById(R.id.items_title);
        this.f6522g = textView3;
        this.f6537v = textView3.getCurrentTextColor();
        View findViewById = findViewById(R.id.actions_hint);
        this.f6526k = findViewById;
        this.f6527l = findViewById.getVisibility();
        this.f6469T = findViewById(R.id.zoomed_out_padding);
        this.f6470U = findViewById(R.id.channel_actions_padding);
        this.f6471V = findViewById(R.id.move_channel_padding);
        this.f6472W = findViewById(R.id.no_move_action_padding);
        this.f6531p = findViewById(R.id.sponsored_channel_background);
        this.f6529n = findViewById(R.id.moving_channel_background);
        this.f6529n.setOutlineProvider(new cuh(getResources().getDimensionPixelSize(R.dimen.moving_channel_background_corner_radius)));
        this.f6529n.setClipToOutline(true);
        this.f6530o = this.f6529n.getVisibility();
        this.f6523h = (ImageView) findViewById(R.id.channel_logo);
        TextView textView4 = (TextView) findViewById(R.id.channel_empty_message);
        this.f6525j = textView4;
        this.f6528m = textView4.getVisibility();
        this.f6523h.setSoundEffectsEnabled(false);
        this.f6523h.setOnClickListener(new cty(this));
        this.f6523h.setOutlineProvider(new cui());
        this.f6523h.setClipToOutline(true);
        this.f6535t = resources.getFraction(R.fraction.channel_logo_focused_scale, 1, 1);
        this.f6536u = resources.getDimension(R.dimen.channel_logo_focused_elevation);
        if (isInEditMode() || dcy.m6195d(getContext())) {
            this.f6523h.setOnFocusChangeListener(new ctz(this));
        } else {
            ((ViewGroup.MarginLayoutParams) this.f6526k.getLayoutParams()).setMarginEnd(resources.getDimensionPixelOffset(R.dimen.channel_actions_hint_margin_end_no_animations));
            new cuj(this, resources.getInteger(R.integer.channel_logo_focused_animation_duration_ms), this.f6535t, this.f6536u).mo4132a(this.f6523h);
        }
        float a = dcy.m6184a(getResources(), (int) R.dimen.unfocused_channel_dimming_factor1);
        this.f6468S = a;
        this.f6524i = a;
        this.f6523h.setColorFilter(dej.m6252b(-16777216, a));
        this.f6538w = this.f6518c.getCurrentTextColor();
        this.f6524i = this.f6523h.getAlpha();
        ImageView imageView = (ImageView) findViewById(R.id.remove);
        this.f6491aa = imageView;
        imageView.setOnClickListener(new cua(this));
        ImageView imageView2 = this.f6491aa;
        if (this.f6487aN) {
            int nextFocusLeftId = imageView2.getNextFocusLeftId();
            imageView2.setNextFocusLeftId(imageView2.getNextFocusRightId());
            imageView2.setNextFocusRightId(nextFocusLeftId);
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.move);
        this.f6492ab = imageView3;
        imageView3.setOnClickListener(new cub(this));
        this.f6517b = (HorizontalGridView) findViewById(R.id.items_list);
        FadingEdgeContainer fadingEdgeContainer = (FadingEdgeContainer) findViewById(R.id.items_list_container);
        this.f6466Q = fadingEdgeContainer;
        fadingEdgeContainer.f6560a = false;
        View findViewById2 = findViewById(R.id.item_meta_container);
        this.f6533r = findViewById2;
        this.f6534s = findViewById2.getVisibility();
        this.f6479aF = resources.getDimensionPixelOffset(R.dimen.watch_next_info_acknowledged_button_base_margin_start);
        this.f6480aG = getResources().getDimensionPixelSize(R.dimen.watch_next_info_card_container_default_margin_horizontal);
        this.f6481aH = (TextView) findViewById(R.id.watch_next_info_acknowledged_button);
        this.f6481aH.setOutlineProvider(new cuk(getResources().getDimensionPixelSize(R.dimen.watch_next_info_acknowledged_button_corner_radius)));
        this.f6481aH.setClipToOutline(true);
        this.f6485aL = new cuc(this);
        this.f6476aC = getContext().getDrawable(R.drawable.ic_action_move_up_down_black);
        this.f6477aD = getContext().getDrawable(R.drawable.ic_action_move_up_black);
        this.f6478aE = getContext().getDrawable(R.drawable.ic_action_move_down_black);
        ObjectAnimator objectAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(getContext(), R.animator.watch_next_info_acknowledged_button_blink);
        this.f6540y = objectAnimator;
        objectAnimator.setTarget(this.f6481aH);
        this.f6483aJ = getResources().getInteger(R.integer.watch_next_info_acknowledged_button_fade_in_duration_ms);
    }

    /* access modifiers changed from: protected */
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2 = this.f6450A;
        if (i2 == 11 || i2 == 12 || i2 == 10 || i2 == 28 || i2 == 29 || i2 == 27) {
            this.f6523h.requestFocus();
            return true;
        } else if (dcy.m6190a(i2)) {
            this.f6525j.requestFocus();
            return true;
        } else {
            this.f6517b.requestFocus();
            return true;
        }
    }

    /* renamed from: c */
    public final void mo3385c() {
        if (this.f6541z) {
            C0285km e = this.f6517b.mo871e(1);
            if (e != null) {
                this.f6484aK = true;
                View view = e.f9783a;
                if (getLayoutDirection() == 0) {
                    int i = this.f6479aF;
                    int left = view.getLeft();
                    this.f6481aH.setTranslationX((float) (i + left + this.f6480aG));
                } else {
                    int i2 = this.f6479aF;
                    int width = this.f6517b.getWidth();
                    int right = view.getRight();
                    this.f6481aH.setTranslationX((float) (-(((i2 + width) - right) + this.f6480aG)));
                }
                Animator e2 = dei.m6246e(this.f6481aH, 8, 0, 0.0f, null);
                this.f6482aI = e2;
                e2.setDuration((long) this.f6483aJ);
                this.f6482aI.addListener(this.f6489aP);
                this.f6482aI.start();
            } else if (this.f6484aK) {
                Log.w("ChannelView", "Change watch next info button visibility to true when the horizontal grid view data is dirty. Schedule a refresh.");
                mo3382b();
                this.f6484aK = false;
            } else {
                Log.w("ChannelView", "Change watch next info button visibility to true when the horizontal grid view data is dirty. Don't schedule a refresh because the only one attempt has been used.");
            }
        } else {
            this.f6481aH.setVisibility(8);
            Animator animator = this.f6482aI;
            if (animator != null && animator.isRunning()) {
                this.f6482aI.cancel();
            }
            if (this.f6540y.isRunning()) {
                this.f6540y.cancel();
            }
        }
    }

    /* renamed from: g */
    private final void m5297g(int i) {
        this.f6526k.setVisibility(i);
        this.f6527l = i;
    }

    /* renamed from: h */
    private final void m5298h(int i) {
        this.f6525j.setVisibility(i);
        this.f6528m = i;
    }

    /* renamed from: k */
    private final void m5301k(int i) {
        this.f6533r.setVisibility(i);
        this.f6534s = i;
    }

    /* renamed from: b */
    public final void mo3384b(String str) {
        this.f6523h.setContentDescription(str);
    }

    /* renamed from: a */
    public final void mo3377a(String str) {
        this.f6518c.setText(str);
    }

    /* renamed from: e */
    private final void m5295e(int i) {
        if (!this.f6456G || !this.f6457H) {
            this.f6518c.setVisibility(i);
            this.f6519d = i;
        }
    }

    /* renamed from: j */
    private final void m5300j(int i) {
        this.f6529n.setVisibility(i);
        this.f6530o = i;
    }

    /* renamed from: a */
    public final void mo3376a(cuo cuo) {
        boolean z;
        this.f6459J = cuo;
        ImageView imageView = this.f6523h;
        if (cuo != null) {
            z = true;
        } else {
            z = false;
        }
        imageView.setSoundEffectsEnabled(z);
    }

    /* renamed from: d */
    public final void mo3387d() {
        this.f6486aM = false;
    }

    /* renamed from: i */
    private final void m5299i(int i) {
        this.f6531p.setVisibility(i);
        this.f6532q = i;
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
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3383b(int r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r0.f6450A
            if (r1 == r2) goto L_0x06cd
            r0.f6450A = r1
            if (r1 != r2) goto L_0x000d
            goto L_0x001a
        L_0x000d:
            boolean r2 = m5293c(r2)
            if (r2 == 0) goto L_0x001b
            boolean r2 = m5293c(r17)
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
            r0.m5295e(r14)
            r0.m5296f(r13)
            int r11 = r0.f6450A
            if (r11 == r8) goto L_0x004e
            android.widget.TextView r11 = r0.f6522g
            boolean r8 = r0.f6454E
            if (r8 != 0) goto L_0x0048
            r8 = 8
            goto L_0x004a
        L_0x0048:
            r8 = 0
        L_0x004a:
            r11.setVisibility(r8)
            goto L_0x0053
        L_0x004e:
            android.widget.TextView r8 = r0.f6522g
            r8.setVisibility(r15)
        L_0x0053:
            r0.m5297g(r13)
            android.widget.ImageView r8 = r0.f6491aa
            r8.setVisibility(r15)
            android.widget.ImageView r8 = r0.f6492ab
            r8.setVisibility(r15)
            android.view.View r8 = r0.f6469T
            r8.setVisibility(r15)
            android.view.View r8 = r0.f6470U
            r8.setVisibility(r15)
            android.view.View r8 = r0.f6471V
            r8.setVisibility(r15)
            android.view.View r8 = r0.f6472W
            r8.setVisibility(r15)
            boolean r8 = r0.f6486aM
            if (r8 != 0) goto L_0x007c
            r8 = 8
            goto L_0x007e
        L_0x007c:
            r8 = 4
        L_0x007e:
            r0.m5301k(r8)
            r0.m5300j(r15)
            boolean r8 = r0.f6456G
            if (r8 != 0) goto L_0x008b
            r8 = 8
            goto L_0x008d
        L_0x008b:
            r8 = 0
        L_0x008d:
            r0.m5299i(r8)
            com.google.android.tvlauncher.home.view.FadingEdgeContainer r8 = r0.f6466Q
            r8.f6560a = r12
            r0.setFocusable(r14)
            goto L_0x03b1
        L_0x0099:
            r0.m5295e(r13)
            r0.m5296f(r14)
            android.widget.TextView r8 = r0.f6522g
            boolean r11 = r0.f6454E
            if (r11 != 0) goto L_0x00a9
            r11 = 8
            goto L_0x00ab
        L_0x00a9:
            r11 = 4
        L_0x00ab:
            r8.setVisibility(r11)
            r0.m5297g(r13)
            android.widget.ImageView r8 = r0.f6491aa
            r8.setVisibility(r15)
            android.widget.ImageView r8 = r0.f6492ab
            r8.setVisibility(r15)
            android.view.View r8 = r0.f6469T
            r8.setVisibility(r15)
            android.view.View r8 = r0.f6470U
            r8.setVisibility(r15)
            android.view.View r8 = r0.f6471V
            r8.setVisibility(r14)
            android.view.View r8 = r0.f6472W
            r8.setVisibility(r15)
            r0.m5301k(r13)
            r0.m5300j(r15)
            boolean r8 = r0.f6456G
            if (r8 != 0) goto L_0x00dc
            r8 = 8
            goto L_0x00de
        L_0x00dc:
            r8 = 0
        L_0x00de:
            r0.m5299i(r8)
            com.google.android.tvlauncher.home.view.FadingEdgeContainer r8 = r0.f6466Q
            r8.f6560a = r14
            r0.setFocusable(r14)
            goto L_0x03b1
        L_0x00ea:
            r0.m5295e(r13)
            r0.m5296f(r14)
            android.widget.TextView r8 = r0.f6522g
            boolean r11 = r0.f6454E
            if (r11 != 0) goto L_0x00fa
            r11 = 8
            goto L_0x00fc
        L_0x00fa:
            r11 = 4
        L_0x00fc:
            r8.setVisibility(r11)
            r0.m5297g(r13)
            android.widget.ImageView r8 = r0.f6491aa
            r8.setVisibility(r13)
            android.widget.ImageView r8 = r0.f6492ab
            r8.setVisibility(r14)
            android.view.View r8 = r0.f6469T
            r8.setVisibility(r15)
            android.view.View r8 = r0.f6470U
            r8.setVisibility(r15)
            android.view.View r8 = r0.f6471V
            r8.setVisibility(r15)
            android.view.View r8 = r0.f6472W
            r8.setVisibility(r15)
            r0.m5301k(r13)
            r0.m5300j(r14)
            r0.m5299i(r15)
            com.google.android.tvlauncher.home.view.FadingEdgeContainer r8 = r0.f6466Q
            r8.f6560a = r14
            r0.setFocusable(r12)
            r16.requestFocus()
            goto L_0x03b1
        L_0x0135:
            r0.m5295e(r13)
            r0.m5296f(r14)
            android.widget.TextView r8 = r0.f6522g
            boolean r11 = r0.f6454E
            if (r11 != 0) goto L_0x0145
            r11 = 8
            goto L_0x0147
        L_0x0145:
            r11 = 4
        L_0x0147:
            r8.setVisibility(r11)
            r0.m5297g(r13)
            android.widget.ImageView r8 = r0.f6491aa
            r8.setVisibility(r15)
            android.widget.ImageView r8 = r0.f6492ab
            r8.setVisibility(r15)
            android.view.View r8 = r0.f6469T
            r8.setVisibility(r15)
            android.view.View r8 = r0.f6470U
            r8.setVisibility(r14)
            android.view.View r8 = r0.f6471V
            r8.setVisibility(r15)
            android.view.View r8 = r0.f6472W
            r8.setVisibility(r15)
            r0.m5301k(r13)
            r0.m5300j(r15)
            boolean r8 = r0.f6456G
            if (r8 != 0) goto L_0x0178
            r8 = 8
            goto L_0x017a
        L_0x0178:
            r8 = 0
        L_0x017a:
            r0.m5299i(r8)
            com.google.android.tvlauncher.home.view.FadingEdgeContainer r8 = r0.f6466Q
            r8.f6560a = r14
            r0.setFocusable(r14)
            goto L_0x03b1
        L_0x0186:
            r0.m5295e(r13)
            r0.m5296f(r14)
            android.widget.TextView r8 = r0.f6522g
            boolean r11 = r0.f6454E
            if (r11 != 0) goto L_0x0196
            r11 = 8
            goto L_0x0198
        L_0x0196:
            r11 = 4
        L_0x0198:
            r8.setVisibility(r11)
            r0.m5297g(r13)
            android.widget.ImageView r8 = r0.f6491aa
            r8.setVisibility(r14)
            android.widget.ImageView r8 = r0.f6492ab
            boolean r11 = r0.f6451B
            if (r11 != 0) goto L_0x01ac
            r11 = 8
            goto L_0x01ae
        L_0x01ac:
            r11 = 0
        L_0x01ae:
            r8.setVisibility(r11)
            android.view.View r8 = r0.f6469T
            r8.setVisibility(r15)
            android.view.View r8 = r0.f6470U
            r8.setVisibility(r15)
            android.view.View r8 = r0.f6471V
            r8.setVisibility(r15)
            android.view.View r8 = r0.f6472W
            boolean r11 = r0.f6451B
            if (r11 != 0) goto L_0x01c8
            r11 = 0
            goto L_0x01cb
        L_0x01c8:
            r11 = 8
        L_0x01cb:
            r8.setVisibility(r11)
            r0.m5301k(r13)
            r0.m5300j(r15)
            boolean r8 = r0.f6456G
            if (r8 != 0) goto L_0x01db
            r8 = 8
            goto L_0x01dd
        L_0x01db:
            r8 = 0
        L_0x01dd:
            r0.m5299i(r8)
            com.google.android.tvlauncher.home.view.FadingEdgeContainer r8 = r0.f6466Q
            r8.f6560a = r14
            r0.setFocusable(r14)
            boolean r8 = r0.f6451B
            if (r8 == 0) goto L_0x01f2
            android.widget.ImageView r8 = r0.f6492ab
            r8.requestFocus()
            goto L_0x03b1
        L_0x01f2:
            android.widget.ImageView r8 = r0.f6491aa
            r8.requestFocus()
            goto L_0x03b1
        L_0x01f9:
            r0.m5295e(r13)
            r0.m5296f(r14)
            android.widget.TextView r8 = r0.f6522g
            boolean r11 = r0.f6454E
            if (r11 != 0) goto L_0x0209
            r11 = 8
            goto L_0x020b
        L_0x0209:
            r11 = 4
        L_0x020b:
            r8.setVisibility(r11)
            r0.m5297g(r13)
            android.widget.ImageView r8 = r0.f6491aa
            r8.setVisibility(r15)
            android.widget.ImageView r8 = r0.f6492ab
            r8.setVisibility(r15)
            android.view.View r8 = r0.f6469T
            r8.setVisibility(r14)
            android.view.View r8 = r0.f6470U
            r8.setVisibility(r15)
            android.view.View r8 = r0.f6471V
            r8.setVisibility(r15)
            android.view.View r8 = r0.f6472W
            r8.setVisibility(r15)
            r0.m5301k(r13)
            r0.m5300j(r15)
            boolean r8 = r0.f6456G
            if (r8 != 0) goto L_0x023c
            r8 = 8
            goto L_0x023e
        L_0x023c:
            r8 = 0
        L_0x023e:
            r0.m5299i(r8)
            com.google.android.tvlauncher.home.view.FadingEdgeContainer r8 = r0.f6466Q
            r8.f6560a = r14
            r0.setFocusable(r14)
            goto L_0x03b1
        L_0x024a:
            r0.m5295e(r13)
            r0.m5296f(r14)
            android.widget.TextView r8 = r0.f6522g
            boolean r11 = r0.f6454E
            if (r11 != 0) goto L_0x025a
            r11 = 8
            goto L_0x025c
        L_0x025a:
            r11 = 4
        L_0x025c:
            r8.setVisibility(r11)
            if (r1 == r10) goto L_0x0272
            boolean r8 = r0.f6451B
            if (r8 != 0) goto L_0x026d
            boolean r8 = r0.f6452C
            if (r8 != 0) goto L_0x026b
            r8 = 4
            goto L_0x026e
        L_0x026b:
        L_0x026d:
            r8 = 0
        L_0x026e:
            r0.m5297g(r8)
            goto L_0x0275
        L_0x0272:
            r0.m5297g(r13)
        L_0x0275:
            android.widget.ImageView r8 = r0.f6491aa
            r8.setVisibility(r15)
            android.widget.ImageView r8 = r0.f6492ab
            r8.setVisibility(r15)
            android.view.View r8 = r0.f6469T
            r8.setVisibility(r14)
            android.view.View r8 = r0.f6470U
            r8.setVisibility(r15)
            android.view.View r8 = r0.f6471V
            r8.setVisibility(r15)
            android.view.View r8 = r0.f6472W
            r8.setVisibility(r15)
            r0.m5301k(r13)
            r0.m5300j(r15)
            boolean r8 = r0.f6456G
            if (r8 != 0) goto L_0x02a0
            r8 = 8
            goto L_0x02a2
        L_0x02a0:
            r8 = 0
        L_0x02a2:
            r0.m5299i(r8)
            com.google.android.tvlauncher.home.view.FadingEdgeContainer r8 = r0.f6466Q
            r8.f6560a = r14
            r0.setFocusable(r14)
            android.widget.ImageView r8 = r0.f6523h
            r8.requestFocus()
            goto L_0x03b1
        L_0x02b3:
            boolean r8 = r0.f6456G
            if (r8 == 0) goto L_0x02bd
            boolean r8 = r0.f6457H
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
            r0.m5295e(r8)
            r0.m5296f(r13)
            boolean r8 = r0.f6454E
            if (r8 == 0) goto L_0x02eb
            android.widget.TextView r8 = r0.f6522g
            if (r1 != r9) goto L_0x02e5
            r11 = 0
            goto L_0x02e7
        L_0x02e5:
            r11 = 4
        L_0x02e7:
            r8.setVisibility(r11)
            goto L_0x02f0
        L_0x02eb:
            android.widget.TextView r8 = r0.f6522g
            r8.setVisibility(r15)
        L_0x02f0:
            r0.m5297g(r13)
            android.widget.ImageView r8 = r0.f6491aa
            r8.setVisibility(r15)
            android.widget.ImageView r8 = r0.f6492ab
            r8.setVisibility(r15)
            android.view.View r8 = r0.f6469T
            r8.setVisibility(r15)
            android.view.View r8 = r0.f6470U
            r8.setVisibility(r15)
            android.view.View r8 = r0.f6471V
            r8.setVisibility(r15)
            android.view.View r8 = r0.f6472W
            r8.setVisibility(r15)
            r0.m5301k(r13)
            r0.m5300j(r15)
            boolean r8 = r0.f6456G
            if (r8 != 0) goto L_0x031f
            r8 = 8
            goto L_0x0321
        L_0x031f:
            r8 = 0
        L_0x0321:
            r0.m5299i(r8)
            com.google.android.tvlauncher.home.view.FadingEdgeContainer r8 = r0.f6466Q
            r8.f6560a = r14
            r0.setFocusable(r14)
            goto L_0x03b1
        L_0x032d:
            r0.m5295e(r14)
            r0.m5296f(r13)
            boolean r8 = r0.f6454E
            if (r8 == 0) goto L_0x0346
            android.widget.TextView r8 = r0.f6522g
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
            android.widget.TextView r8 = r0.f6522g
            r8.setVisibility(r15)
        L_0x034b:
            r0.m5297g(r13)
            android.widget.ImageView r8 = r0.f6491aa
            r8.setVisibility(r15)
            android.widget.ImageView r8 = r0.f6492ab
            r8.setVisibility(r15)
            android.view.View r8 = r0.f6469T
            r8.setVisibility(r15)
            android.view.View r8 = r0.f6470U
            r8.setVisibility(r15)
            android.view.View r8 = r0.f6471V
            r8.setVisibility(r15)
            android.view.View r8 = r0.f6472W
            r8.setVisibility(r15)
            boolean r8 = r0.f6486aM
            if (r8 != 0) goto L_0x0375
            r0.m5301k(r15)
            goto L_0x0381
        L_0x0375:
            r8 = 18
            if (r1 != r8) goto L_0x037c
            r8 = 4
            goto L_0x037e
        L_0x037c:
            r8 = 0
        L_0x037e:
            r0.m5301k(r8)
        L_0x0381:
            r0.m5300j(r15)
            boolean r8 = r0.f6456G
            if (r8 != 0) goto L_0x038c
            r8 = 8
            goto L_0x038e
        L_0x038c:
            r8 = 0
        L_0x038e:
            r0.m5299i(r8)
            com.google.android.tvlauncher.home.view.FadingEdgeContainer r8 = r0.f6466Q
            r8.f6560a = r12
            r0.setFocusable(r14)
            android.content.Context r8 = r16.getContext()
            boolean r8 = p000.dcy.m6193b(r8)
            if (r8 != 0) goto L_0x03b1
            r8 = 18
            if (r1 == r8) goto L_0x03ac
            androidx.leanback.widget.HorizontalGridView r8 = r0.f6517b
            r8.requestFocus()
            goto L_0x03b1
        L_0x03ac:
            android.widget.TextView r8 = r0.f6525j
            r8.requestFocus()
        L_0x03b1:
            if (r1 == 0) goto L_0x03b6
            r0.mo3378a(r14)
        L_0x03b6:
            boolean r8 = p000.dcy.m6190a(r17)
            if (r8 == 0) goto L_0x03c5
            r0.m5298h(r14)
            androidx.leanback.widget.HorizontalGridView r8 = r0.f6517b
            r8.setFocusable(r14)
            goto L_0x03ce
        L_0x03c5:
            r0.m5298h(r13)
            androidx.leanback.widget.HorizontalGridView r8 = r0.f6517b
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
            com.google.android.tvlauncher.home.view.ChannelViewMainLinearLayout r11 = r0.f6465P
            r11.f6550a = r8
            android.widget.TextView r11 = r0.f6518c
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r11 = (android.view.ViewGroup.MarginLayoutParams) r11
            android.widget.TextView r3 = r0.f6522g
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            android.util.SparseArray r4 = r0.f6455F
            r2 = 10
            if (r4 == 0) goto L_0x051f
            java.lang.Object r4 = r4.get(r1)
            ctl r4 = (p000.ctl) r4
            boolean r13 = r0.f6456G
            if (r13 == 0) goto L_0x0406
            int r13 = r4.f7386k
            com.google.android.tvlauncher.home.view.ChannelViewMainLinearLayout r12 = r0.f6465P
            r12.f6551b = r13
            com.google.android.tvlauncher.home.view.ChannelViewMainContent r12 = r0.f6473a
            r12.f6544c = r13
        L_0x0406:
            android.view.ViewGroup$LayoutParams r12 = r16.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r12 = (android.view.ViewGroup.MarginLayoutParams) r12
            int r13 = r4.f7379d
            int r15 = r4.f7380e
            r12.setMargins(r14, r13, r14, r15)
            r0.setLayoutParams(r12)
            com.google.android.tvlauncher.home.view.FadingEdgeContainer r12 = r0.f6466Q
            android.view.ViewGroup$LayoutParams r12 = r12.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r12 = (android.view.ViewGroup.MarginLayoutParams) r12
            if (r8 != 0) goto L_0x0423
            int r13 = r0.f6495ae
            goto L_0x0425
        L_0x0423:
            int r13 = r0.f6496af
        L_0x0425:
            r12.setMarginStart(r13)
            com.google.android.tvlauncher.home.view.FadingEdgeContainer r13 = r0.f6466Q
            r13.setLayoutParams(r12)
            androidx.leanback.widget.HorizontalGridView r12 = r0.f6517b
            android.view.ViewGroup$LayoutParams r12 = r12.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r12 = (android.view.ViewGroup.MarginLayoutParams) r12
            int r13 = r4.f7376a
            int r15 = r4.f7377b
            int r13 = r13 + r15
            int r15 = r4.f7378c
            int r13 = r13 + r15
            r12.height = r13
            androidx.leanback.widget.HorizontalGridView r13 = r0.f6517b
            r13.setLayoutParams(r12)
            android.widget.ImageView r12 = r0.f6523h
            android.view.ViewGroup$LayoutParams r12 = r12.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r12 = (android.widget.LinearLayout.LayoutParams) r12
            int r13 = r4.f7381f
            android.content.Context r15 = r16.getContext()
            boolean r15 = p000.dcy.m6195d(r15)
            if (r15 == 0) goto L_0x0459
        L_0x0458:
            goto L_0x0465
        L_0x0459:
            if (r1 != r2) goto L_0x0458
            android.util.SparseArray r4 = r0.f6455F
            r15 = 11
            java.lang.Object r4 = r4.get(r15)
            ctl r4 = (p000.ctl) r4
        L_0x0465:
            int r15 = r4.f7383h
            r12.height = r15
            int r15 = r4.f7382g
            r12.width = r15
            int r15 = r4.f7384i
            r12.setMarginStart(r15)
            int r15 = r4.f7385j
            r12.setMarginEnd(r15)
            android.widget.TextView r15 = r0.f6525j
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r15 = (android.widget.FrameLayout.LayoutParams) r15
            if (r8 == 0) goto L_0x049d
            int r7 = r0.f6450A
            r6 = 30
            if (r7 != r6) goto L_0x048d
            int r6 = r0.f6505ao
            r15.setMarginStart(r6)
            goto L_0x04a2
        L_0x048d:
            r6 = 31
            if (r7 == r6) goto L_0x0497
            int r6 = r0.f6504an
            r15.setMarginStart(r6)
            goto L_0x04a2
        L_0x0497:
            int r6 = r0.f6506ap
            r15.setMarginStart(r6)
            goto L_0x04a2
        L_0x049d:
            int r6 = r0.f6503am
            r15.setMarginStart(r6)
        L_0x04a2:
            int r6 = r4.f7390o
            r15.topMargin = r6
            android.widget.TextView r6 = r0.f6525j
            r6.setLayoutParams(r15)
            boolean r6 = r0.f6456G
            r7 = 80
            r15 = 48
            if (r6 != 0) goto L_0x04f3
            android.content.Context r6 = r16.getContext()
            boolean r6 = p000.dcy.m6195d(r6)
            if (r6 == 0) goto L_0x04bf
            if (r1 == r2) goto L_0x04e6
        L_0x04bf:
            if (r1 == r10) goto L_0x04e6
            if (r8 == 0) goto L_0x04cf
            r12.gravity = r15
            int r6 = r0.f6493ac
            int r13 = r13 + r6
            r12.topMargin = r13
            int r6 = r0.f6493ac
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
            int r6 = r0.f6494ad
            int r13 = r13 + r6
            r12.topMargin = r13
            int r6 = r0.f6494ad
            r12.bottomMargin = r6
            goto L_0x050e
        L_0x04f3:
            if (r1 != r9) goto L_0x04f7
            goto L_0x04fa
        L_0x04f7:
            if (r1 != r5) goto L_0x0507
        L_0x04fa:
            boolean r6 = r0.f6457H
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
            android.widget.ImageView r6 = r0.f6523h
            r6.setLayoutParams(r12)
            int r6 = r4.f7387l
            r11.bottomMargin = r6
            int r6 = r4.f7388m
            r3.topMargin = r6
            int r4 = r4.f7389n
            r3.bottomMargin = r4
        L_0x051f:
            boolean r4 = r0.f6456G
            r6 = 17
            if (r4 == 0) goto L_0x0573
            android.view.View r4 = r0.f6531p
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r4 = (android.widget.FrameLayout.LayoutParams) r4
            r4.setMarginStart(r14)
            if (r1 != 0) goto L_0x0537
            int r5 = r0.f6514ax
            r4.height = r5
            goto L_0x0567
        L_0x0537:
            if (r1 != r9) goto L_0x053b
            goto L_0x053d
        L_0x053b:
            if (r1 != r5) goto L_0x0546
        L_0x053d:
            boolean r5 = r0.f6457H
            if (r5 != 0) goto L_0x0546
            int r5 = r0.f6516az
            r4.height = r5
            goto L_0x055d
        L_0x0546:
            if (r8 == 0) goto L_0x054d
            int r5 = r0.f6513aw
            r4.height = r5
            goto L_0x055d
        L_0x054d:
            if (r1 != r6) goto L_0x0550
            goto L_0x0559
        L_0x0550:
            r5 = 32
            if (r1 == r5) goto L_0x0559
            int r5 = r0.f6512av
            r4.height = r5
            goto L_0x055d
        L_0x0559:
            int r5 = r0.f6515ay
            r4.height = r5
        L_0x055d:
            if (r1 != r2) goto L_0x0567
            android.view.View r5 = r0.f6531p
            int r7 = r0.f6475aB
            r5.setBackgroundColor(r7)
            goto L_0x056e
        L_0x0567:
            android.view.View r5 = r0.f6531p
            int r7 = r0.f6474aA
            r5.setBackgroundColor(r7)
        L_0x056e:
            android.view.View r5 = r0.f6531p
            r5.setLayoutParams(r4)
        L_0x0573:
            android.widget.TextView r4 = r0.f6518c
            r4.setLayoutParams(r11)
            android.content.Context r4 = r16.getContext()
            boolean r4 = p000.dcy.m6195d(r4)
            r5 = 0
            if (r4 == 0) goto L_0x058f
            android.widget.ImageView r4 = r0.f6523h
            if (r1 != r2) goto L_0x058a
            float r7 = r0.f6536u
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
            float r5 = r0.f6468S
        L_0x05be:
            float r11 = r0.f6524i
            float r11 = r5 - r11
            float r11 = java.lang.Math.abs(r11)
            r12 = 981668463(0x3a83126f, float:0.001)
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x05e5
            r0.f6524i = r5
            int r11 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r11 >= 0) goto L_0x05da
            android.widget.ImageView r5 = r0.f6523h
            r11 = 0
            r5.setColorFilter(r11)
            goto L_0x05e5
        L_0x05da:
            android.widget.ImageView r11 = r0.f6523h
            r13 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.graphics.ColorFilter r5 = p000.dej.m6252b(r13, r5)
            r11.setColorFilter(r5)
        L_0x05e5:
            if (r1 == r4) goto L_0x05ea
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L_0x05ee
        L_0x05ea:
            r4 = 1036831949(0x3dcccccd, float:0.1)
        L_0x05ee:
            float r5 = r0.f6467R
            float r5 = r4 - r5
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x0601
            r0.f6467R = r4
            android.widget.ImageView r5 = r0.f6523h
            r5.setAlpha(r4)
        L_0x0601:
            boolean r4 = r0.f6456G
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
            int r4 = r0.f6499ai
            goto L_0x064a
        L_0x0626:
            int r4 = r0.f6501ak
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
            int r4 = r0.f6501ak
            goto L_0x064a
        L_0x0648:
            int r4 = r0.f6502al
        L_0x064a:
            int r5 = r0.f6538w
            if (r4 == r5) goto L_0x0655
            r0.f6538w = r4
            android.widget.TextView r5 = r0.f6518c
            r5.setTextColor(r4)
        L_0x0655:
            if (r8 != 0) goto L_0x065a
            int r4 = r0.f6497ag
            goto L_0x065c
        L_0x065a:
            int r4 = r0.f6498ah
        L_0x065c:
            r3.setMarginStart(r4)
            android.widget.TextView r4 = r0.f6522g
            r4.setLayoutParams(r3)
            if (r1 == 0) goto L_0x0669
            int r3 = r0.f6499ai
            goto L_0x066b
        L_0x0669:
            int r3 = r0.f6500aj
        L_0x066b:
            r0.f6537v = r3
            android.widget.TextView r4 = r0.f6522g
            r4.setTextColor(r3)
            if (r1 != r2) goto L_0x0675
            goto L_0x067c
        L_0x0675:
            if (r1 == r10) goto L_0x067c
            if (r1 == r7) goto L_0x067c
            int r2 = r0.f6502al
            goto L_0x067e
        L_0x067c:
            int r2 = r0.f6501ak
        L_0x067e:
            int r3 = r0.f6539x
            if (r2 != r3) goto L_0x0683
            goto L_0x068a
        L_0x0683:
            r0.f6539x = r2
            android.widget.TextView r3 = r0.f6520e
            r3.setTextColor(r2)
        L_0x068a:
            android.view.View r2 = r0.f6533r
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
            int r1 = r0.f6507aq
            r2.topMargin = r1
            int r1 = r0.f6509as
            r2.bottomMargin = r1
            int r1 = r0.f6510at
            r2.setMarginStart(r1)
            goto L_0x06c7
        L_0x06af:
            r2.topMargin = r14
            int r1 = r0.f6509as
            r2.bottomMargin = r1
            int r1 = r0.f6511au
            r2.setMarginStart(r1)
            goto L_0x06c7
        L_0x06bc:
            int r1 = r0.f6508ar
            r2.topMargin = r1
            r2.bottomMargin = r14
            int r1 = r0.f6510at
            r2.setMarginStart(r1)
        L_0x06c7:
            android.view.View r1 = r0.f6533r
            r1.setLayoutParams(r2)
            return
        L_0x06cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.tvlauncher.home.view.ChannelView.mo3383b(int):void");
    }

    /* renamed from: a */
    public final void mo3378a(boolean z) {
        this.f6541z = z;
        if (!z) {
            mo3385c();
        } else if (this.f6458I) {
        } else {
            if (this.f6517b.mo895o()) {
                this.f6517b.f1084x.mo5322a(new cud(this));
            } else {
                mo3382b();
            }
        }
    }

    /* renamed from: c */
    public final void mo3386c(String str) {
        this.f6520e.setText(str);
    }

    /* renamed from: f */
    private final void m5296f(int i) {
        this.f6520e.setVisibility(i);
        this.f6521f = i;
    }

    /* renamed from: a */
    public static String m5291a(int i) {
        String str;
        switch (i) {
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
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public final String toString() {
        String frameLayout = super.toString();
        String valueOf = String.valueOf(this.f6520e.getText());
        StringBuilder sb = new StringBuilder(String.valueOf(frameLayout).length() + 12 + String.valueOf(valueOf).length());
        sb.append('{');
        sb.append(frameLayout);
        sb.append(", title='");
        sb.append(valueOf);
        sb.append("'}");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo3379a(boolean z, boolean z2) {
        this.f6451B = true;
        if (z && z2) {
            this.f6492ab.setImageDrawable(this.f6476aC);
        } else if (z) {
            this.f6492ab.setImageDrawable(this.f6477aD);
        } else if (z2) {
            this.f6492ab.setImageDrawable(this.f6478aE);
        } else {
            this.f6451B = false;
        }
    }
}
