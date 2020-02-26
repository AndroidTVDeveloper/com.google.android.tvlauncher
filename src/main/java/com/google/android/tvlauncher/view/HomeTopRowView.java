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

    /* renamed from: A */
    private final ddt f6697A = new ddj(this);

    /* renamed from: a */
    public Context f6698a;

    /* renamed from: b */
    public dbj f6699b;

    /* renamed from: c */
    public cfp f6700c;

    /* renamed from: d */
    public ViewGroup f6701d;

    /* renamed from: e */
    public SearchView f6702e;

    /* renamed from: f */
    public NotificationsTrayView f6703f;

    /* renamed from: g */
    public cyl f6704g;

    /* renamed from: h */
    public ddm f6705h;

    /* renamed from: i */
    public cri f6706i;

    /* renamed from: j */
    public ddn f6707j;

    /* renamed from: k */
    public int f6708k = 0;

    /* renamed from: l */
    public int f6709l = 0;

    /* renamed from: m */
    public ddw f6710m;

    /* renamed from: n */
    private HomeTopRowButton f6711n;

    /* renamed from: o */
    private HomeTopRowButton f6712o;

    /* renamed from: p */
    private HomeTopRowButton f6713p;

    /* renamed from: q */
    private chv f6714q;

    /* renamed from: r */
    private final ViewTreeObserver.OnGlobalFocusChangeListener f6715r = new ddi(this);

    /* renamed from: s */
    private float f6716s;

    /* renamed from: t */
    private float f6717t;

    /* renamed from: u */
    private float f6718u;

    /* renamed from: v */
    private int f6719v;

    /* renamed from: w */
    private int f6720w;

    /* renamed from: x */
    private int f6721x;

    /* renamed from: y */
    private int f6722y;

    /* renamed from: z */
    private int f6723z;

    public HomeTopRowView(Context context) {
        super(context);
        m5352a(context);
    }

    /* renamed from: a */
    public final View mo3472a() {
        return this;
    }

    /* renamed from: a */
    public final void mo3473a(crh crh) {
    }

    /* renamed from: a */
    public final void mo3475a(crj crj) {
    }

    /* renamed from: a */
    public final void mo3477a(boolean z) {
    }

    public HomeTopRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m5352a(context);
    }

    public HomeTopRowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m5352a(context);
    }

    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        if (this.f6703f.getVisibility() == 0) {
            arrayList.add(this.f6703f);
        }
        super.addFocusables(arrayList, i, i2);
    }

    /* renamed from: c */
    public final void mo3482c(boolean z) {
        boolean z2 = false;
        if (!z) {
            this.f6709l = 0;
        }
        this.f6708k = this.f6709l;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f6702e.getLayoutParams();
        marginLayoutParams.setMarginStart(getResources().getDimensionPixelOffset(R.dimen.search_orb_margin_start));
        this.f6702e.setLayoutParams(marginLayoutParams);
        SearchView searchView = this.f6702e;
        if (this.f6708k == 1) {
            z2 = true;
        }
        searchView.mo3499c(z2);
        m5353d();
    }

    /* renamed from: c */
    public final cyt mo3481c() {
        HorizontalGridView horizontalGridView = this.f6703f.f6682a;
        if (horizontalGridView != null) {
            return (cyt) horizontalGridView.f1067g;
        }
        return null;
    }

    /* renamed from: a */
    private final void m5352a(Context context) {
        this.f6698a = context;
        Resources resources = context.getResources();
        this.f6699b = ((cgg) this.f6698a.getApplicationContext()).mo2750e();
        this.f6716s = resources.getDimension(R.dimen.top_row_item_focused_z);
        this.f6717t = resources.getDimension(R.dimen.top_row_item_unfocused_z);
        this.f6718u = resources.getFraction(R.fraction.top_row_item_focused_zoom, 1, 1);
        this.f6719v = resources.getInteger(R.integer.top_row_scale_duration_ms);
        this.f6720w = resources.getDimensionPixelSize(R.dimen.top_row_items_container_margin_top);
        this.f6721x = resources.getDimensionPixelSize(R.dimen.top_row_items_container_margin_bottom);
        this.f6722y = resources.getDimensionPixelSize(R.dimen.top_row_selected_items_container_margin_top);
        this.f6723z = resources.getDimensionPixelSize(R.dimen.top_row_selected_items_container_margin_bottom);
        resources.getDimensionPixelSize(R.dimen.featured_carousel_margin_top_default);
        resources.getDimensionPixelSize(R.dimen.featured_carousel_margin_top_expanded);
        resources.getDimensionPixelSize(R.dimen.featured_carousel_margin_bottom_default);
        resources.getDimensionPixelSize(R.dimen.featured_carousel_margin_bottom_expanded);
        this.f6714q = new chv(this);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.f6715r);
        this.f6698a.registerReceiver(this.f6714q, chv.m4765a());
        dbq.m6093a(getContext()).mo2887a(this.f6702e);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.f6715r);
        this.f6698a.unregisterReceiver(this.f6714q);
        dbq.m6093a(getContext()).mo2891b(this.f6702e);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f6701d = (ViewGroup) findViewById(R.id.items_container);
        SearchView searchView = (SearchView) findViewById(R.id.search_view);
        this.f6702e = searchView;
        searchView.setOutlineProvider(new ddk());
        this.f6702e.f6746c = this.f6697A;
        HomeTopRowButton homeTopRowButton = (HomeTopRowButton) findViewById(R.id.profiles);
        this.f6711n = homeTopRowButton;
        homeTopRowButton.mo3368a((int) R.drawable.ic_tv_options_parental_black);
        this.f6711n.mo3370b(R.string.restricted_profile_icon_title);
        this.f6711n.setContentDescription(getResources().getString(R.string.profiles_accessibility_description));
        this.f6711n.setOnClickListener(new dde(this));
        m5354e();
        this.f6712o = (HomeTopRowButton) findViewById(R.id.inputs);
        Uri uri = dck.m6123a(this.f6698a).f8228e.f8274i;
        if (uri != null) {
            C0509su e = C0497si.m8296c(this.f6698a).mo5950e();
            e.mo5939a(uri);
            ((C0509su) e.mo210f()).mo5937a((ahg) new ddl(this.f6712o.f6440f));
        } else {
            this.f6712o.mo3368a((int) R.drawable.ic_action_inputs_black);
        }
        String b = dck.m6123a(this.f6698a).mo4093b(this.f6698a);
        this.f6712o.mo3369a(b);
        this.f6712o.setContentDescription(b);
        this.f6712o.setOnClickListener(new ddf(this));
        HomeTopRowButton homeTopRowButton2 = (HomeTopRowButton) findViewById(R.id.partner_widget);
        this.f6713p = homeTopRowButton2;
        homeTopRowButton2.setOnClickListener(new ddg(this));
        m5355f();
        HomeTopRowButton homeTopRowButton3 = (HomeTopRowButton) findViewById(R.id.settings);
        homeTopRowButton3.mo3368a((int) R.drawable.ic_action_settings_black);
        homeTopRowButton3.mo3370b(R.string.settings_icon_title);
        homeTopRowButton3.setContentDescription(getResources().getString(R.string.settings_accessibility_description));
        homeTopRowButton3.setOnClickListener(new ddh(this));
        this.f6703f = (NotificationsTrayView) findViewById(R.id.notifications_tray);
        mo3479b();
        cga.m4692a().mo2745a(this);
    }

    public final void onFocusChange(View view, boolean z) {
        float f = z ? this.f6718u : 1.0f;
        view.animate().z(z ? this.f6716s : this.f6717t).scaleX(f).scaleY(f).setDuration((long) this.f6719v);
    }

    /* renamed from: a */
    public final void mo2827a(String str) {
        m5356f(str);
    }

    /* renamed from: b */
    public final void mo2828b(String str) {
        m5356f(str);
    }

    /* renamed from: c */
    public final void mo2829c(String str) {
        m5356f(str);
    }

    /* renamed from: d */
    public final void mo2830d(String str) {
        m5356f(str);
    }

    /* renamed from: e */
    public final void mo2831e(String str) {
        m5356f(str);
    }

    /* renamed from: a */
    public final void mo3476a(ddw ddw) {
        this.f6710m = ddw;
        m5355f();
    }

    /* renamed from: a */
    public final void mo3474a(cri cri) {
        this.f6706i = cri;
    }

    /* renamed from: b */
    public final void mo3480b(boolean z) {
        this.f6712o.setVisibility(!z ? 8 : 0);
    }

    /* renamed from: b */
    public final void mo3479b() {
        this.f6703f.mo3457a();
        m5353d();
    }

    /* renamed from: f */
    private final void m5355f() {
        ddw ddw = this.f6710m;
        if (ddw != null && ddw.mo4167a()) {
            HomeTopRowButton homeTopRowButton = this.f6713p;
            Drawable drawable = this.f6710m.f8351b;
            ImageView imageView = homeTopRowButton.f6440f;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
                if (homeTopRowButton.hasFocus()) {
                    drawable.setTint(homeTopRowButton.f6436b);
                }
            }
            this.f6713p.mo3369a(this.f6710m.f8352c);
            this.f6713p.setContentDescription(this.f6710m.f8352c);
            this.f6713p.setVisibility(0);
            return;
        }
        this.f6713p.setVisibility(8);
    }

    /* renamed from: e */
    private final void m5354e() {
        if (czw.m6037a(this.f6698a).mo4021b() != null) {
            this.f6711n.setVisibility(0);
        } else {
            this.f6711n.setVisibility(8);
        }
    }

    /* renamed from: f */
    private final void m5356f(String str) {
        if (TextUtils.equals("com.android.tv.settings", str) && this.f6711n != null) {
            m5354e();
        }
    }

    /* renamed from: d */
    private final void m5353d() {
        int i;
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f6701d.getLayoutParams();
        int i3 = this.f6708k;
        if (i3 == 0) {
            marginLayoutParams.topMargin = this.f6720w;
            marginLayoutParams.bottomMargin = this.f6721x;
        } else {
            if (i3 != 1) {
                i = this.f6720w;
            } else {
                i = this.f6722y;
            }
            marginLayoutParams.topMargin = i;
            if (this.f6703f.getVisibility() != 0) {
                i2 = this.f6723z;
            } else {
                i2 = this.f6721x;
            }
            marginLayoutParams.bottomMargin = i2;
        }
        this.f6701d.setLayoutParams(marginLayoutParams);
    }
}
