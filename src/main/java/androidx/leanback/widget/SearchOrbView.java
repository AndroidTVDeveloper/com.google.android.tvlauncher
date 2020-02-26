package androidx.leanback.widget;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class SearchOrbView extends FrameLayout implements View.OnClickListener {

    /* renamed from: a */
    public View.OnClickListener f1264a;

    /* renamed from: b */
    public View f1265b;

    /* renamed from: c */
    private View f1266c;

    /* renamed from: d */
    private ImageView f1267d;

    /* renamed from: e */
    private Drawable f1268e;

    /* renamed from: f */
    private C0399os f1269f;

    /* renamed from: g */
    private final float f1270g;

    /* renamed from: h */
    private final int f1271h;

    /* renamed from: i */
    private final int f1272i;

    /* renamed from: j */
    private final float f1273j;

    /* renamed from: k */
    private final float f1274k;

    /* renamed from: l */
    private ValueAnimator f1275l;

    /* renamed from: m */
    private boolean f1276m;

    /* renamed from: n */
    private boolean f1277n;

    /* renamed from: o */
    private final ArgbEvaluator f1278o;

    /* renamed from: p */
    private final ValueAnimator.AnimatorUpdateListener f1279p;

    /* renamed from: q */
    private ValueAnimator f1280q;

    /* renamed from: r */
    private final ValueAnimator.AnimatorUpdateListener f1281r;

    public SearchOrbView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public int mo1048a() {
        return R.layout.lb_search_orb;
    }

    public SearchOrbView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchOrbViewStyle);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, androidx.leanback.widget.SearchOrbView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public SearchOrbView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1278o = new ArgbEvaluator();
        this.f1279p = new C0397oq(this);
        this.f1281r = new C0398or(this);
        Resources resources = context.getResources();
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(mo1048a(), (ViewGroup) this, true);
        this.f1266c = inflate;
        this.f1265b = inflate.findViewById(R.id.search_orb);
        this.f1267d = (ImageView) this.f1266c.findViewById(R.id.icon);
        this.f1270g = context.getResources().getFraction(R.fraction.lb_search_orb_focused_zoom, 1, 1);
        this.f1271h = context.getResources().getInteger(R.integer.lb_search_orb_pulse_duration_ms);
        this.f1272i = context.getResources().getInteger(R.integer.lb_search_orb_scale_duration_ms);
        this.f1274k = (float) context.getResources().getDimensionPixelSize(R.dimen.lb_search_orb_focused_z);
        this.f1273j = (float) context.getResources().getDimensionPixelSize(R.dimen.lb_search_orb_unfocused_z);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0324ly.f9938h, i, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, C0324ly.f9938h, attributeSet, obtainStyledAttributes, i, 0);
        }
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        mo1051a(drawable == null ? resources.getDrawable(R.drawable.lb_ic_in_app_search) : drawable);
        int color = obtainStyledAttributes.getColor(1, resources.getColor(R.color.lb_default_search_color));
        mo1052a(new C0399os(color, obtainStyledAttributes.getColor(0, color), obtainStyledAttributes.getColor(3, 0)));
        obtainStyledAttributes.recycle();
        setFocusable(true);
        setClipChildren(false);
        setOnClickListener(this);
        setSoundEffectsEnabled(false);
        mo1049a(0.0f);
        C0107dx.m7195a(this.f1267d, this.f1274k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1053a(boolean z) {
        float f = z ? this.f1270g : 1.0f;
        this.f1266c.animate().scaleX(f).scaleY(f).setDuration((long) this.f1272i).start();
        int i = this.f1272i;
        if (this.f1280q == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f1280q = ofFloat;
            ofFloat.addUpdateListener(this.f1281r);
        }
        if (!z) {
            this.f1280q.reverse();
        } else {
            this.f1280q.start();
        }
        this.f1280q.setDuration((long) i);
        m1428b(z);
    }

    /* renamed from: b */
    private final void m1428b(boolean z) {
        this.f1276m = z;
        m1427b();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1277n = true;
        m1427b();
    }

    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.f1264a;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        this.f1277n = false;
        m1427b();
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        mo1053a(z);
    }

    /* renamed from: a */
    public final void mo1052a(C0399os osVar) {
        this.f1269f = osVar;
        this.f1267d.setColorFilter(osVar.f10090c);
        if (this.f1275l == null) {
            mo1050a(this.f1269f.f10088a);
        } else {
            m1428b(true);
        }
    }

    /* renamed from: a */
    public final void mo1051a(Drawable drawable) {
        this.f1268e = drawable;
        this.f1267d.setImageDrawable(drawable);
    }

    /* renamed from: a */
    public final void mo1050a(int i) {
        if (this.f1265b.getBackground() instanceof GradientDrawable) {
            ((GradientDrawable) this.f1265b.getBackground()).setColor(i);
        }
    }

    /* renamed from: a */
    public final void mo1049a(float f) {
        View view = this.f1265b;
        float f2 = this.f1273j;
        C0107dx.m7195a(view, f2 + (f * (this.f1274k - f2)));
    }

    /* renamed from: b */
    private final void m1427b() {
        ValueAnimator valueAnimator = this.f1275l;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f1275l = null;
        }
        if (this.f1276m && this.f1277n) {
            ValueAnimator ofObject = ValueAnimator.ofObject(this.f1278o, Integer.valueOf(this.f1269f.f10088a), Integer.valueOf(this.f1269f.f10089b), Integer.valueOf(this.f1269f.f10088a));
            this.f1275l = ofObject;
            ofObject.setRepeatCount(-1);
            ValueAnimator valueAnimator2 = this.f1275l;
            int i = this.f1271h;
            valueAnimator2.setDuration((long) (i + i));
            this.f1275l.addUpdateListener(this.f1279p);
            this.f1275l.start();
        }
    }
}
