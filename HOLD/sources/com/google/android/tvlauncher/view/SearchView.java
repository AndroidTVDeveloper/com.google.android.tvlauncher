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
    private boolean A;
    private boolean B;
    private int C;
    private boolean D;
    private Drawable E;
    private String[] F;
    private Drawable G;
    private Drawable H;
    private Drawable I;
    private Drawable J;
    private Drawable K;
    private int L;
    private int M;
    private Runnable N;
    private boolean O;
    public final Intent a = new Intent("android.intent.action.ASSIST").addFlags(270532608);
    public Context b;
    public ddt c;
    public SearchOrb d;
    public SearchOrb e;
    public ImageView f;
    public TextSwitcher g;
    public LinearLayout h;
    public final int i;
    public String[] j;
    public Drawable k;
    public int l;
    public int m;
    public int n = 0;
    public Handler o = new Handler();
    public int p = -1;
    private final String q;
    private final String r;
    private final String s;
    private final int t;
    private final int u;
    private final int v;
    private final int w;
    private final int x;
    private final int y;
    private final int z;

    public SearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z2 = false;
        this.b = context;
        Resources resources = context.getResources();
        this.F = resources.getStringArray(R.array.search_orb_text_to_show);
        this.i = resources.getInteger(R.integer.search_orb_idle_hint_flip_delay);
        this.v = resources.getInteger(R.integer.search_orb_text_fade_duration);
        this.q = a(context.getString(R.string.search_hint_text));
        this.r = a(context.getString(R.string.focused_search_mic_hint_text));
        this.s = context.getString(R.string.focused_search_keyboard_hint_text);
        this.t = bg.b(context, R.color.search_orb_focused_hint_color);
        this.u = bg.b(context, R.color.search_orb_unfocused_hint_color);
        this.B = d();
        if (resources.getBoolean(R.bool.is_hint_flipping_allowed) && this.B) {
            z2 = true;
        }
        this.A = z2;
        this.w = resources.getDimensionPixelSize(R.dimen.search_orbs_spacing);
        this.x = resources.getDimensionPixelSize(R.dimen.top_row_item_size) + resources.getDimensionPixelSize(R.dimen.search_orb_icon_padding_end) + resources.getDimensionPixelSize(R.dimen.search_orb_keyboard_icon_padding_start);
        this.z = resources.getDimensionPixelSize(R.dimen.search_text_margin_start);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mic_disabled_icon_size);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.mic_disabled_icon_margin);
        this.y = -((dimensionPixelSize + (dimensionPixelSize2 + dimensionPixelSize2)) - this.z);
        this.I = resources.getDrawable(R.drawable.ic_mic_color, null);
        this.J = resources.getDrawable(R.drawable.ic_mic_grey, null);
        this.K = resources.getDrawable(R.drawable.ic_mic_black, null);
        this.j = this.F;
    }

    public final void c(boolean z2) {
        Drawable drawable;
        if (!z2) {
            b(4);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.h.getLayoutParams();
            marginLayoutParams.setMarginStart(-(this.w + this.x));
            this.h.setLayoutParams(marginLayoutParams);
            this.e.setScaleX(0.0f);
            this.e.setScaleY(0.0f);
        } else {
            b(0);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.h.getLayoutParams();
            marginLayoutParams2.setMarginStart(0);
            this.h.setLayoutParams(marginLayoutParams2);
            this.e.setScaleX(1.0f);
            this.e.setScaleY(1.0f);
        }
        g();
        if (!z2) {
            Drawable drawable2 = this.E;
            if (drawable2 != null) {
                this.d.a(drawable2);
            } else if (this.B) {
                this.d.a(this.I);
            } else {
                Drawable drawable3 = this.k;
                if (drawable3 == null) {
                    this.d.a(this.J);
                } else {
                    this.d.a(drawable3);
                }
            }
        } else {
            if (this.E == null && !this.B) {
                Drawable drawable4 = this.k;
                if (drawable4 == null) {
                    SearchOrb searchOrb = this.d;
                    searchOrb.a(searchOrb.hasFocus() ? this.K : this.J);
                } else {
                    this.d.a(drawable4);
                }
            } else {
                this.d.a(this.I);
            }
            SearchOrb searchOrb2 = this.e;
            if (!searchOrb2.hasFocus()) {
                drawable = this.H;
            } else {
                drawable = this.G;
            }
            searchOrb2.a(drawable);
        }
        this.d.a();
        this.e.a();
    }

    public final void a(boolean z2, int i2) {
        int i3;
        int i4;
        int i5;
        View nextView = this.g.getNextView();
        if (nextView instanceof TextView) {
            TextView textView = (TextView) nextView;
            if (!z2) {
                i5 = this.u;
            } else {
                i5 = this.t;
            }
            textView.setTextColor(i5);
        }
        if (i2 == 1) {
            i4 = R.anim.slide_in_left;
            i3 = R.anim.slide_out_right;
        } else if (i2 == 0) {
            i4 = R.anim.slide_in_bottom;
            i3 = R.anim.slide_out_top;
        } else {
            i4 = R.anim.fade_in;
            i3 = R.anim.fade_out;
        }
        this.g.setInAnimation(this.b, i4);
        this.g.setOutAnimation(this.b, i3);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 23 || keyCode == 62 || keyCode == 66 || keyCode == 96 || keyCode == 160) {
            if (keyEvent.isLongPress()) {
                this.O = true;
                ((AudioManager) getContext().getSystemService("audio")).playSoundEffect(9);
                return true;
            } else if (action == 1) {
                if (!this.O) {
                    this.p = keyEvent.getDeviceId();
                } else {
                    this.O = false;
                    return true;
                }
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final String a(String str) {
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

    private final void f() {
        this.G = bg.a(this.b, (int) R.drawable.ic_keyboard_black);
        this.H = bg.a(this.b, (int) R.drawable.ic_keyboard_grey);
        this.L = bg.b(this.b, R.color.search_orb_bg_bright_color);
        dck a2 = dck.a(this.b);
        int i2 = this.L;
        dcn dcn = a2.e;
        if (dcn.c) {
            i2 = dcn.b;
        }
        this.M = i2;
        this.e.a(this.H);
        SearchOrb searchOrb = this.d;
        int i3 = this.L;
        searchOrb.b = i3;
        this.e.b = i3;
        e();
        b();
    }

    private final boolean d() {
        PackageInfo packageInfo;
        try {
            packageInfo = this.b.getPackageManager().getPackageInfo("com.google.android.katniss", 0);
        } catch (PackageManager.NameNotFoundException e2) {
            packageInfo = null;
        }
        return packageInfo != null;
    }

    private final void e() {
        int dimensionPixelSize = this.b.getResources().getDimensionPixelSize(R.dimen.search_orb_icon_max_size);
        Uri uri = dck.a(this.b).e.a;
        if (uri != null) {
            su e2 = si.c(this.b).e();
            e2.a(uri);
            e2.a((ahg) new ddq(this, dimensionPixelSize, dimensionPixelSize));
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextSwitcher textSwitcher = this.g;
        textSwitcher.clearAnimation();
        if (textSwitcher.getAlpha() != 1.0f) {
            textSwitcher.animate().alpha(1.0f).setDuration((long) this.v).start();
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.b.getSystemService("accessibility");
        boolean z2 = false;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            z2 = true;
        }
        ddp ddp = new ddp(this, z2);
        this.d.setOnClickListener(ddp);
        SearchOrb searchOrb = this.e;
        if (searchOrb != null) {
            searchOrb.setOnClickListener(ddp);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f = (ImageView) findViewById(R.id.mic_disabled_icon);
        this.h = (LinearLayout) findViewById(R.id.search_container);
        this.d = (SearchOrb) findViewById(R.id.mic_orb);
        SearchOrb searchOrb = (SearchOrb) findViewById(R.id.keyboard_orb);
        this.e = searchOrb;
        this.l = searchOrb.getVisibility();
        this.h.bringToFront();
        f();
        Context context = getContext();
        TextSwitcher textSwitcher = (TextSwitcher) findViewById(R.id.text_switcher);
        this.g = textSwitcher;
        textSwitcher.setAnimateFirstView(false);
        this.g.setFactory(new ddr(this, context));
        this.N = new dds(this);
        c();
        c(false);
    }

    public final void a() {
        boolean d2 = d();
        if (d2 != this.B) {
            this.B = d2;
            f();
            g();
            return;
        }
        e();
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i2) {
        if (view != this) {
            return;
        }
        if (i2 != 0) {
            c();
        } else if (this.e.hasFocus()) {
            this.d.requestFocus();
        }
    }

    public final void c() {
        this.o.removeCallbacks(this.N);
        this.g.reset();
        this.n = 0;
        g();
    }

    private final void c(int i2) {
        this.m = i2;
        this.f.setVisibility(i2);
    }

    public final void a(boolean z2) {
        if (this.A) {
            this.o.removeCallbacks(this.N);
            if (z2 && isAttachedToWindow()) {
                Rect rect = new Rect();
                if (getGlobalVisibleRect(rect) && getHeight() == rect.height() && getWidth() == rect.width() && !this.d.hasFocus()) {
                    this.o.post(this.N);
                }
            }
        }
    }

    private final void b(int i2) {
        this.l = i2;
        this.e.setVisibility(i2);
    }

    private final void g() {
        int i2;
        String str;
        this.o.removeCallbacks(this.N);
        int i3 = 1;
        boolean z2 = false;
        boolean z3 = this.d.hasFocus() || this.e.hasFocus();
        int i4 = this.n;
        boolean z4 = this.B && z3 && !this.d.hasFocus();
        if (!z3) {
            i2 = -1;
        } else {
            i2 = !z4 ? -2 : -3;
        }
        this.n = i2;
        if (i4 != i2) {
            if (!(i4 == -1 || i2 == -1)) {
                z2 = true;
            }
            if (z2) {
                i3 = 2;
            }
            a(z3, i3);
            TextSwitcher textSwitcher = this.g;
            if (!z3) {
                str = this.q;
            } else {
                str = z4 ? this.s : this.r;
            }
            textSwitcher.setText(a(str));
        }
    }

    public static boolean a(Context context, Intent intent) {
        try {
            context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e2) {
            String valueOf = String.valueOf(intent);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Exception launching intent ");
            sb.append(valueOf);
            Log.e("SearchView", sb.toString(), e2);
            Toast.makeText(context, context.getString(R.string.app_unavailable), 0).show();
            return false;
        }
    }

    public final void a(Drawable drawable) {
        this.E = drawable;
        b();
    }

    public final void b(boolean z2) {
        this.D = z2;
        h();
    }

    private final void h() {
        if (this.D && this.C == 2) {
            c(0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.g.getLayoutParams();
            marginLayoutParams.setMarginStart(this.z);
            this.g.setLayoutParams(marginLayoutParams);
            return;
        }
        c(4);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.g.getLayoutParams();
        marginLayoutParams2.setMarginStart(this.y);
        this.g.setLayoutParams(marginLayoutParams2);
    }

    public final void a(int i2) {
        this.C = i2;
        h();
    }

    public final void b() {
        Drawable drawable;
        Drawable drawable2;
        SearchOrb searchOrb = this.e;
        boolean z2 = false;
        if (searchOrb != null && searchOrb.hasFocus()) {
            z2 = true;
        }
        boolean hasFocus = this.d.hasFocus();
        if (!this.B) {
            SearchOrb searchOrb2 = this.d;
            int i2 = this.M;
            searchOrb2.b = i2;
            this.e.b = i2;
            Drawable drawable3 = this.k;
            if (drawable3 != null) {
                searchOrb2.a(drawable3);
                return;
            }
            if (!hasFocus) {
                drawable2 = this.J;
            } else {
                drawable2 = this.K;
            }
            searchOrb2.a(drawable2);
            return;
        }
        SearchOrb searchOrb3 = this.d;
        int i3 = this.L;
        searchOrb3.b = i3;
        this.e.b = i3;
        Drawable drawable4 = this.E;
        if (drawable4 == null) {
            if (!hasFocus) {
                drawable = this.J;
            } else {
                drawable = this.I;
            }
            searchOrb3.a(drawable);
        } else if (hasFocus) {
            searchOrb3.a(this.I);
        } else if (z2) {
            searchOrb3.a(this.J);
        } else {
            searchOrb3.a(drawable4);
        }
    }

    public final void a(String[] strArr) {
        this.n = 0;
        if (strArr == null || strArr.length == 0) {
            this.j = this.F;
        } else {
            this.j = strArr;
        }
    }
}
