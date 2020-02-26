package com.google.android.tvlauncher.view;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class SearchView extends FrameLayout implements ciw {

    /* renamed from: A */
    private boolean f6729A;

    /* renamed from: B */
    private boolean f6730B;

    /* renamed from: C */
    private int f6731C;

    /* renamed from: D */
    private boolean f6732D;

    /* renamed from: E */
    private Drawable f6733E;

    /* renamed from: F */
    private String[] f6734F;

    /* renamed from: G */
    private Drawable f6735G;

    /* renamed from: H */
    private Drawable f6736H;

    /* renamed from: I */
    private Drawable f6737I;

    /* renamed from: J */
    private Drawable f6738J;

    /* renamed from: K */
    private Drawable f6739K;

    /* renamed from: L */
    private int f6740L;

    /* renamed from: M */
    private int f6741M;

    /* renamed from: N */
    private Runnable f6742N;

    /* renamed from: O */
    private boolean f6743O;

    /* renamed from: a */
    public final Intent f6744a = new Intent("android.intent.action.ASSIST").addFlags(270532608);

    /* renamed from: b */
    public Context f6745b;

    /* renamed from: c */
    public ddt f6746c;

    /* renamed from: d */
    public SearchOrb f6747d;

    /* renamed from: e */
    public SearchOrb f6748e;

    /* renamed from: f */
    public ImageView f6749f;

    /* renamed from: g */
    public TextSwitcher f6750g;

    /* renamed from: h */
    public LinearLayout f6751h;

    /* renamed from: i */
    public final int f6752i;

    /* renamed from: j */
    public String[] f6753j;

    /* renamed from: k */
    public Drawable f6754k;

    /* renamed from: l */
    public int f6755l;

    /* renamed from: m */
    public int f6756m;

    /* renamed from: n */
    public int f6757n = 0;

    /* renamed from: o */
    public Handler f6758o = new Handler();

    /* renamed from: p */
    public int f6759p = -1;

    /* renamed from: q */
    private final String f6760q;

    /* renamed from: r */
    private final String f6761r;

    /* renamed from: s */
    private final String f6762s;

    /* renamed from: t */
    private final int f6763t;

    /* renamed from: u */
    private final int f6764u;

    /* renamed from: v */
    private final int f6765v;

    /* renamed from: w */
    private final int f6766w;

    /* renamed from: x */
    private final int f6767x;

    /* renamed from: y */
    private final int f6768y;

    /* renamed from: z */
    private final int f6769z;

    public SearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = false;
        this.f6745b = context;
        Resources resources = context.getResources();
        this.f6734F = resources.getStringArray(R.array.search_orb_text_to_show);
        this.f6752i = resources.getInteger(R.integer.search_orb_idle_hint_flip_delay);
        this.f6765v = resources.getInteger(R.integer.search_orb_text_fade_duration);
        this.f6760q = mo3490a(context.getString(R.string.search_hint_text));
        this.f6761r = mo3490a(context.getString(R.string.focused_search_mic_hint_text));
        this.f6762s = context.getString(R.string.focused_search_keyboard_hint_text);
        this.f6763t = C0035bg.m3116b(context, R.color.search_orb_focused_hint_color);
        this.f6764u = C0035bg.m3116b(context, R.color.search_orb_unfocused_hint_color);
        this.f6730B = m5377d();
        if (resources.getBoolean(R.bool.is_hint_flipping_allowed) && this.f6730B) {
            z = true;
        }
        this.f6729A = z;
        this.f6766w = resources.getDimensionPixelSize(R.dimen.search_orbs_spacing);
        this.f6767x = resources.getDimensionPixelSize(R.dimen.top_row_item_size) + resources.getDimensionPixelSize(R.dimen.search_orb_icon_padding_end) + resources.getDimensionPixelSize(R.dimen.search_orb_keyboard_icon_padding_start);
        this.f6769z = resources.getDimensionPixelSize(R.dimen.search_text_margin_start);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mic_disabled_icon_size);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.mic_disabled_icon_margin);
        this.f6768y = -((dimensionPixelSize + (dimensionPixelSize2 + dimensionPixelSize2)) - this.f6769z);
        this.f6737I = resources.getDrawable(R.drawable.ic_mic_color, null);
        this.f6738J = resources.getDrawable(R.drawable.ic_mic_grey, null);
        this.f6739K = resources.getDrawable(R.drawable.ic_mic_black, null);
        this.f6753j = this.f6734F;
    }

    /* renamed from: c */
    public final void mo3499c(boolean z) {
        Drawable drawable;
        if (!z) {
            m5375b(4);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f6751h.getLayoutParams();
            marginLayoutParams.setMarginStart(-(this.f6766w + this.f6767x));
            this.f6751h.setLayoutParams(marginLayoutParams);
            this.f6748e.setScaleX(0.0f);
            this.f6748e.setScaleY(0.0f);
        } else {
            m5375b(0);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f6751h.getLayoutParams();
            marginLayoutParams2.setMarginStart(0);
            this.f6751h.setLayoutParams(marginLayoutParams2);
            this.f6748e.setScaleX(1.0f);
            this.f6748e.setScaleY(1.0f);
        }
        m5380g();
        if (!z) {
            Drawable drawable2 = this.f6733E;
            if (drawable2 != null) {
                this.f6747d.mo3488a(drawable2);
            } else if (this.f6730B) {
                this.f6747d.mo3488a(this.f6737I);
            } else {
                Drawable drawable3 = this.f6754k;
                if (drawable3 == null) {
                    this.f6747d.mo3488a(this.f6738J);
                } else {
                    this.f6747d.mo3488a(drawable3);
                }
            }
        } else {
            if (this.f6733E == null && !this.f6730B) {
                Drawable drawable4 = this.f6754k;
                if (drawable4 == null) {
                    SearchOrb searchOrb = this.f6747d;
                    searchOrb.mo3488a(searchOrb.hasFocus() ? this.f6739K : this.f6738J);
                } else {
                    this.f6747d.mo3488a(drawable4);
                }
            } else {
                this.f6747d.mo3488a(this.f6737I);
            }
            SearchOrb searchOrb2 = this.f6748e;
            if (!searchOrb2.hasFocus()) {
                drawable = this.f6736H;
            } else {
                drawable = this.f6735G;
            }
            searchOrb2.mo3488a(drawable);
        }
        this.f6747d.mo3487a();
        this.f6748e.mo3487a();
    }

    /* renamed from: a */
    public final void mo3494a(boolean z, int i) {
        int i2;
        int i3;
        int i4;
        View nextView = this.f6750g.getNextView();
        if (nextView instanceof TextView) {
            TextView textView = (TextView) nextView;
            if (!z) {
                i4 = this.f6764u;
            } else {
                i4 = this.f6763t;
            }
            textView.setTextColor(i4);
        }
        if (i == 1) {
            i3 = R.anim.slide_in_left;
            i2 = R.anim.slide_out_right;
        } else if (i == 0) {
            i3 = R.anim.slide_in_bottom;
            i2 = R.anim.slide_out_top;
        } else {
            i3 = R.anim.fade_in;
            i2 = R.anim.fade_out;
        }
        this.f6750g.setInAnimation(this.f6745b, i3);
        this.f6750g.setOutAnimation(this.f6745b, i2);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 23 || keyCode == 62 || keyCode == 66 || keyCode == 96 || keyCode == 160) {
            if (keyEvent.isLongPress()) {
                this.f6743O = true;
                ((AudioManager) getContext().getSystemService("audio")).playSoundEffect(9);
                return true;
            } else if (action == 1) {
                if (!this.f6743O) {
                    this.f6759p = keyEvent.getDeviceId();
                } else {
                    this.f6743O = false;
                    return true;
                }
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: a */
    public final String mo3490a(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str);
        if (getLayoutDirection() == 1) {
            sb.insert(0, " ");
        } else {
            sb.append(" ");
        }
        return sb.toString();
    }

    /* renamed from: f */
    private final void m5379f() {
        this.f6735G = C0035bg.m3107a(this.f6745b, (int) R.drawable.ic_keyboard_black);
        this.f6736H = C0035bg.m3107a(this.f6745b, (int) R.drawable.ic_keyboard_grey);
        this.f6740L = C0035bg.m3116b(this.f6745b, R.color.search_orb_bg_bright_color);
        dck a = dck.m6123a(this.f6745b);
        int i = this.f6740L;
        dcn dcn = a.f8228e;
        if (dcn.f8268c) {
            i = dcn.f8267b;
        }
        this.f6741M = i;
        this.f6748e.mo3488a(this.f6736H);
        SearchOrb searchOrb = this.f6747d;
        int i2 = this.f6740L;
        searchOrb.f6725b = i2;
        this.f6748e.f6725b = i2;
        m5378e();
        mo3496b();
    }

    /* renamed from: d */
    private final boolean m5377d() {
        PackageInfo packageInfo;
        try {
            packageInfo = this.f6745b.getPackageManager().getPackageInfo("com.google.android.katniss", 0);
        } catch (PackageManager.NameNotFoundException e) {
            packageInfo = null;
        }
        return packageInfo != null;
    }

    /* renamed from: e */
    private final void m5378e() {
        int dimensionPixelSize = this.f6745b.getResources().getDimensionPixelSize(R.dimen.search_orb_icon_max_size);
        Uri uri = dck.m6123a(this.f6745b).f8228e.f8260a;
        if (uri != null) {
            C0509su e = C0497si.m8296c(this.f6745b).mo5950e();
            e.mo5939a(uri);
            e.mo5937a((ahg) new ddq(this, dimensionPixelSize, dimensionPixelSize));
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextSwitcher textSwitcher = this.f6750g;
        textSwitcher.clearAnimation();
        if (textSwitcher.getAlpha() != 1.0f) {
            textSwitcher.animate().alpha(1.0f).setDuration((long) this.f6765v).start();
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f6745b.getSystemService("accessibility");
        boolean z = false;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            z = true;
        }
        ddp ddp = new ddp(this, z);
        this.f6747d.setOnClickListener(ddp);
        SearchOrb searchOrb = this.f6748e;
        if (searchOrb != null) {
            searchOrb.setOnClickListener(ddp);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo3498c();
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f6749f = (ImageView) findViewById(R.id.mic_disabled_icon);
        this.f6751h = (LinearLayout) findViewById(R.id.search_container);
        this.f6747d = (SearchOrb) findViewById(R.id.mic_orb);
        SearchOrb searchOrb = (SearchOrb) findViewById(R.id.keyboard_orb);
        this.f6748e = searchOrb;
        this.f6755l = searchOrb.getVisibility();
        this.f6751h.bringToFront();
        m5379f();
        Context context = getContext();
        TextSwitcher textSwitcher = (TextSwitcher) findViewById(R.id.text_switcher);
        this.f6750g = textSwitcher;
        textSwitcher.setAnimateFirstView(false);
        this.f6750g.setFactory(new ddr(this, context));
        this.f6742N = new dds(this);
        mo3498c();
        mo3499c(false);
    }

    /* renamed from: a */
    public final void mo2879a() {
        boolean d = m5377d();
        if (d != this.f6730B) {
            this.f6730B = d;
            m5379f();
            m5380g();
            return;
        }
        m5378e();
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        if (view != this) {
            return;
        }
        if (i != 0) {
            mo3498c();
        } else if (this.f6748e.hasFocus()) {
            this.f6747d.requestFocus();
        }
    }

    /* renamed from: c */
    public final void mo3498c() {
        this.f6758o.removeCallbacks(this.f6742N);
        this.f6750g.reset();
        this.f6757n = 0;
        m5380g();
    }

    /* renamed from: c */
    private final void m5376c(int i) {
        this.f6756m = i;
        this.f6749f.setVisibility(i);
    }

    /* renamed from: a */
    public final void mo3493a(boolean z) {
        if (this.f6729A) {
            this.f6758o.removeCallbacks(this.f6742N);
            if (z && isAttachedToWindow()) {
                Rect rect = new Rect();
                if (getGlobalVisibleRect(rect) && getHeight() == rect.height() && getWidth() == rect.width() && !this.f6747d.hasFocus()) {
                    this.f6758o.post(this.f6742N);
                }
            }
        }
    }

    /* renamed from: b */
    private final void m5375b(int i) {
        this.f6755l = i;
        this.f6748e.setVisibility(i);
    }

    /* renamed from: g */
    private final void m5380g() {
        int i;
        String str;
        this.f6758o.removeCallbacks(this.f6742N);
        int i2 = 1;
        boolean z = false;
        boolean z2 = this.f6747d.hasFocus() || this.f6748e.hasFocus();
        int i3 = this.f6757n;
        boolean z3 = this.f6730B && z2 && !this.f6747d.hasFocus();
        if (!z2) {
            i = -1;
        } else {
            i = !z3 ? -2 : -3;
        }
        this.f6757n = i;
        if (i3 != i) {
            if (!(i3 == -1 || i == -1)) {
                z = true;
            }
            if (z) {
                i2 = 2;
            }
            mo3494a(z2, i2);
            TextSwitcher textSwitcher = this.f6750g;
            if (!z2) {
                str = this.f6760q;
            } else {
                str = z3 ? this.f6762s : this.f6761r;
            }
            textSwitcher.setText(mo3490a(str));
        }
    }

    /* renamed from: a */
    public static boolean m5374a(Context context, Intent intent) {
        try {
            context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e) {
            String valueOf = String.valueOf(intent);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Exception launching intent ");
            sb.append(valueOf);
            Log.e("SearchView", sb.toString(), e);
            Toast.makeText(context, context.getString(R.string.app_unavailable), 0).show();
            return false;
        }
    }

    /* renamed from: a */
    public final void mo3492a(Drawable drawable) {
        this.f6733E = drawable;
        mo3496b();
    }

    /* renamed from: b */
    public final void mo3497b(boolean z) {
        this.f6732D = z;
        m5381h();
    }

    /* renamed from: h */
    private final void m5381h() {
        if (this.f6732D && this.f6731C == 2) {
            m5376c(0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f6750g.getLayoutParams();
            marginLayoutParams.setMarginStart(this.f6769z);
            this.f6750g.setLayoutParams(marginLayoutParams);
            return;
        }
        m5376c(4);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f6750g.getLayoutParams();
        marginLayoutParams2.setMarginStart(this.f6768y);
        this.f6750g.setLayoutParams(marginLayoutParams2);
    }

    /* renamed from: a */
    public final void mo3491a(int i) {
        this.f6731C = i;
        m5381h();
    }

    /* renamed from: b */
    public final void mo3496b() {
        Drawable drawable;
        Drawable drawable2;
        SearchOrb searchOrb = this.f6748e;
        boolean z = false;
        if (searchOrb != null && searchOrb.hasFocus()) {
            z = true;
        }
        boolean hasFocus = this.f6747d.hasFocus();
        if (!this.f6730B) {
            SearchOrb searchOrb2 = this.f6747d;
            int i = this.f6741M;
            searchOrb2.f6725b = i;
            this.f6748e.f6725b = i;
            Drawable drawable3 = this.f6754k;
            if (drawable3 != null) {
                searchOrb2.mo3488a(drawable3);
                return;
            }
            if (!hasFocus) {
                drawable2 = this.f6738J;
            } else {
                drawable2 = this.f6739K;
            }
            searchOrb2.mo3488a(drawable2);
            return;
        }
        SearchOrb searchOrb3 = this.f6747d;
        int i2 = this.f6740L;
        searchOrb3.f6725b = i2;
        this.f6748e.f6725b = i2;
        Drawable drawable4 = this.f6733E;
        if (drawable4 == null) {
            if (!hasFocus) {
                drawable = this.f6738J;
            } else {
                drawable = this.f6737I;
            }
            searchOrb3.mo3488a(drawable);
        } else if (hasFocus) {
            searchOrb3.mo3488a(this.f6737I);
        } else if (z) {
            searchOrb3.mo3488a(this.f6738J);
        } else {
            searchOrb3.mo3488a(drawable4);
        }
    }

    /* renamed from: a */
    public final void mo3495a(String[] strArr) {
        this.f6757n = 0;
        if (strArr == null || strArr.length == 0) {
            this.f6753j = this.f6734F;
        } else {
            this.f6753j = strArr;
        }
    }
}
