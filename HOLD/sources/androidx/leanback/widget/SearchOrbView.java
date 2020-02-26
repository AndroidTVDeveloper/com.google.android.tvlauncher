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
    public View.OnClickListener a;
    public View b;
    private View c;
    private ImageView d;
    private Drawable e;
    private os f;
    private final float g;
    private final int h;
    private final int i;
    private final float j;
    private final float k;
    private ValueAnimator l;
    private boolean m;
    private boolean n;
    private final ArgbEvaluator o;
    private final ValueAnimator.AnimatorUpdateListener p;
    private ValueAnimator q;
    private final ValueAnimator.AnimatorUpdateListener r;

    public SearchOrbView(Context context) {
        this(context, null);
    }

    public int a() {
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
    public SearchOrbView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.o = new ArgbEvaluator();
        this.p = new oq(this);
        this.r = new or(this);
        Resources resources = context.getResources();
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(a(), (ViewGroup) this, true);
        this.c = inflate;
        this.b = inflate.findViewById(R.id.search_orb);
        this.d = (ImageView) this.c.findViewById(R.id.icon);
        this.g = context.getResources().getFraction(R.fraction.lb_search_orb_focused_zoom, 1, 1);
        this.h = context.getResources().getInteger(R.integer.lb_search_orb_pulse_duration_ms);
        this.i = context.getResources().getInteger(R.integer.lb_search_orb_scale_duration_ms);
        this.k = (float) context.getResources().getDimensionPixelSize(R.dimen.lb_search_orb_focused_z);
        this.j = (float) context.getResources().getDimensionPixelSize(R.dimen.lb_search_orb_unfocused_z);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ly.h, i2, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, ly.h, attributeSet, obtainStyledAttributes, i2, 0);
        }
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        a(drawable == null ? resources.getDrawable(R.drawable.lb_ic_in_app_search) : drawable);
        int color = obtainStyledAttributes.getColor(1, resources.getColor(R.color.lb_default_search_color));
        a(new os(color, obtainStyledAttributes.getColor(0, color), obtainStyledAttributes.getColor(3, 0)));
        obtainStyledAttributes.recycle();
        setFocusable(true);
        setClipChildren(false);
        setOnClickListener(this);
        setSoundEffectsEnabled(false);
        a(0.0f);
        dx.a(this.d, this.k);
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        float f2 = z ? this.g : 1.0f;
        this.c.animate().scaleX(f2).scaleY(f2).setDuration((long) this.i).start();
        int i2 = this.i;
        if (this.q == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.q = ofFloat;
            ofFloat.addUpdateListener(this.r);
        }
        if (!z) {
            this.q.reverse();
        } else {
            this.q.start();
        }
        this.q.setDuration((long) i2);
        b(z);
    }

    private final void b(boolean z) {
        this.m = z;
        b();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n = true;
        b();
    }

    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.a;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        this.n = false;
        b();
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public final void onFocusChanged(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
        a(z);
    }

    public final void a(os osVar) {
        this.f = osVar;
        this.d.setColorFilter(osVar.c);
        if (this.l == null) {
            a(this.f.a);
        } else {
            b(true);
        }
    }

    public final void a(Drawable drawable) {
        this.e = drawable;
        this.d.setImageDrawable(drawable);
    }

    public final void a(int i2) {
        if (this.b.getBackground() instanceof GradientDrawable) {
            ((GradientDrawable) this.b.getBackground()).setColor(i2);
        }
    }

    public final void a(float f2) {
        View view = this.b;
        float f3 = this.j;
        dx.a(view, f3 + (f2 * (this.k - f3)));
    }

    private final void b() {
        ValueAnimator valueAnimator = this.l;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.l = null;
        }
        if (this.m && this.n) {
            ValueAnimator ofObject = ValueAnimator.ofObject(this.o, Integer.valueOf(this.f.a), Integer.valueOf(this.f.b), Integer.valueOf(this.f.a));
            this.l = ofObject;
            ofObject.setRepeatCount(-1);
            ValueAnimator valueAnimator2 = this.l;
            int i2 = this.h;
            valueAnimator2.setDuration((long) (i2 + i2));
            this.l.addUpdateListener(this.p);
            this.l.start();
        }
    }
}
