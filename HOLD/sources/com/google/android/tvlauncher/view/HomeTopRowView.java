package com.google.android.tvlauncher.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.leanback.widget.HorizontalGridView;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.home.HomeTopRowButton;
import com.google.android.tvlauncher.notifications.NotificationsTrayView;
import java.util.ArrayList;

/* compiled from: PG */
public class HomeTopRowView extends LinearLayout implements View.OnFocusChangeListener, cqz, chu {
    private final ddt A = new ddj(this);
    public Context a;
    public dbj b;
    public cfp c;
    public ViewGroup d;
    public SearchView e;
    public NotificationsTrayView f;
    public cyl g;
    public ddm h;
    public cri i;
    public ddn j;
    public int k = 0;
    public int l = 0;
    public ddw m;
    private HomeTopRowButton n;
    private HomeTopRowButton o;
    private HomeTopRowButton p;
    private chv q;
    private final ViewTreeObserver.OnGlobalFocusChangeListener r = new ddi(this);
    private float s;
    private float t;
    private float u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    public HomeTopRowView(Context context) {
        super(context);
        a(context);
    }

    public final View a() {
        return this;
    }

    public final void a(crh crh) {
    }

    public final void a(crj crj) {
    }

    public final void a(boolean z2) {
    }

    public HomeTopRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public HomeTopRowView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context);
    }

    public final void addFocusables(ArrayList arrayList, int i2, int i3) {
        if (this.f.getVisibility() == 0) {
            arrayList.add(this.f);
        }
        super.addFocusables(arrayList, i2, i3);
    }

    public final void c(boolean z2) {
        boolean z3 = false;
        if (!z2) {
            this.l = 0;
        }
        this.k = this.l;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.e.getLayoutParams();
        marginLayoutParams.setMarginStart(getResources().getDimensionPixelOffset(R.dimen.search_orb_margin_start));
        this.e.setLayoutParams(marginLayoutParams);
        SearchView searchView = this.e;
        if (this.k == 1) {
            z3 = true;
        }
        searchView.c(z3);
        d();
    }

    public final cyt c() {
        HorizontalGridView horizontalGridView = this.f.a;
        if (horizontalGridView != null) {
            return (cyt) horizontalGridView.g;
        }
        return null;
    }

    private final void a(Context context) {
        this.a = context;
        Resources resources = context.getResources();
        this.b = ((cgg) this.a.getApplicationContext()).e();
        this.s = resources.getDimension(R.dimen.top_row_item_focused_z);
        this.t = resources.getDimension(R.dimen.top_row_item_unfocused_z);
        this.u = resources.getFraction(R.fraction.top_row_item_focused_zoom, 1, 1);
        this.v = resources.getInteger(R.integer.top_row_scale_duration_ms);
        this.w = resources.getDimensionPixelSize(R.dimen.top_row_items_container_margin_top);
        this.x = resources.getDimensionPixelSize(R.dimen.top_row_items_container_margin_bottom);
        this.y = resources.getDimensionPixelSize(R.dimen.top_row_selected_items_container_margin_top);
        this.z = resources.getDimensionPixelSize(R.dimen.top_row_selected_items_container_margin_bottom);
        resources.getDimensionPixelSize(R.dimen.featured_carousel_margin_top_default);
        resources.getDimensionPixelSize(R.dimen.featured_carousel_margin_top_expanded);
        resources.getDimensionPixelSize(R.dimen.featured_carousel_margin_bottom_default);
        resources.getDimensionPixelSize(R.dimen.featured_carousel_margin_bottom_expanded);
        this.q = new chv(this);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.r);
        this.a.registerReceiver(this.q, chv.a());
        dbq.a(getContext()).a(this.e);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.r);
        this.a.unregisterReceiver(this.q);
        dbq.a(getContext()).b(this.e);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.d = (ViewGroup) findViewById(R.id.items_container);
        SearchView searchView = (SearchView) findViewById(R.id.search_view);
        this.e = searchView;
        searchView.setOutlineProvider(new ddk());
        this.e.c = this.A;
        HomeTopRowButton homeTopRowButton = (HomeTopRowButton) findViewById(R.id.profiles);
        this.n = homeTopRowButton;
        homeTopRowButton.a((int) R.drawable.ic_tv_options_parental_black);
        this.n.b(R.string.restricted_profile_icon_title);
        this.n.setContentDescription(getResources().getString(R.string.profiles_accessibility_description));
        this.n.setOnClickListener(new dde(this));
        e();
        this.o = (HomeTopRowButton) findViewById(R.id.inputs);
        Uri uri = dck.a(this.a).e.i;
        if (uri != null) {
            su e2 = si.c(this.a).e();
            e2.a(uri);
            ((su) e2.f()).a((ahg) new ddl(this.o.f));
        } else {
            this.o.a((int) R.drawable.ic_action_inputs_black);
        }
        String b2 = dck.a(this.a).b(this.a);
        this.o.a(b2);
        this.o.setContentDescription(b2);
        this.o.setOnClickListener(new ddf(this));
        HomeTopRowButton homeTopRowButton2 = (HomeTopRowButton) findViewById(R.id.partner_widget);
        this.p = homeTopRowButton2;
        homeTopRowButton2.setOnClickListener(new ddg(this));
        f();
        HomeTopRowButton homeTopRowButton3 = (HomeTopRowButton) findViewById(R.id.settings);
        homeTopRowButton3.a((int) R.drawable.ic_action_settings_black);
        homeTopRowButton3.b(R.string.settings_icon_title);
        homeTopRowButton3.setContentDescription(getResources().getString(R.string.settings_accessibility_description));
        homeTopRowButton3.setOnClickListener(new ddh(this));
        this.f = (NotificationsTrayView) findViewById(R.id.notifications_tray);
        b();
        cga.a().a(this);
    }

    public final void onFocusChange(View view, boolean z2) {
        float f2 = z2 ? this.u : 1.0f;
        view.animate().z(z2 ? this.s : this.t).scaleX(f2).scaleY(f2).setDuration((long) this.v);
    }

    public final void a(String str) {
        f(str);
    }

    public final void b(String str) {
        f(str);
    }

    public final void c(String str) {
        f(str);
    }

    public final void d(String str) {
        f(str);
    }

    public final void e(String str) {
        f(str);
    }

    public final void a(ddw ddw) {
        this.m = ddw;
        f();
    }

    public final void a(cri cri) {
        this.i = cri;
    }

    public final void b(boolean z2) {
        this.o.setVisibility(!z2 ? 8 : 0);
    }

    public final void b() {
        this.f.a();
        d();
    }

    private final void f() {
        ddw ddw = this.m;
        if (ddw != null && ddw.a()) {
            HomeTopRowButton homeTopRowButton = this.p;
            Drawable drawable = this.m.b;
            ImageView imageView = homeTopRowButton.f;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
                if (homeTopRowButton.hasFocus()) {
                    drawable.setTint(homeTopRowButton.b);
                }
            }
            this.p.a(this.m.c);
            this.p.setContentDescription(this.m.c);
            this.p.setVisibility(0);
            return;
        }
        this.p.setVisibility(8);
    }

    private final void e() {
        if (czw.a(this.a).b() != null) {
            this.n.setVisibility(0);
        } else {
            this.n.setVisibility(8);
        }
    }

    private final void f(String str) {
        if (TextUtils.equals("com.android.tv.settings", str) && this.n != null) {
            e();
        }
    }

    private final void d() {
        int i2;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.d.getLayoutParams();
        int i4 = this.k;
        if (i4 == 0) {
            marginLayoutParams.topMargin = this.w;
            marginLayoutParams.bottomMargin = this.x;
        } else {
            if (i4 != 1) {
                i2 = this.w;
            } else {
                i2 = this.y;
            }
            marginLayoutParams.topMargin = i2;
            if (this.f.getVisibility() != 0) {
                i3 = this.z;
            } else {
                i3 = this.x;
            }
            marginLayoutParams.bottomMargin = i3;
        }
        this.d.setLayoutParams(marginLayoutParams);
    }
}
