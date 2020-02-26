package defpackage;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.tvlauncher.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: daw  reason: default package */
/* compiled from: PG */
public final class daw {
    private final int A;
    private final int B;
    private final int C;
    private int D;
    private int E;
    private float F;
    private float G;
    private Activity H;
    private FrameLayout I;
    private LinearLayout J;
    private PopupWindow K;
    private int L;
    private float M;
    private float N;
    private float O;
    private float P;
    private List Q;
    private List R;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public View e;
    public dav f;
    public ViewGroup g;
    public List h;
    public ImageView i;
    public dat j;
    public ObjectAnimator k;
    public View.OnAttachStateChangeListener l;
    public ViewTreeObserver.OnScrollChangedListener m;
    public View.OnLayoutChangeListener n;
    public boolean o;
    private int p;
    private int q;
    private final int r;
    private final int s;
    private final float t;
    private final int u;
    private final int v;
    private final int w;
    private final int x;
    private final int y;
    private final int z;

    public daw(Activity activity, View view, int i2) {
        this(activity, view, i2, view.getScaleX(), view.getScaleY());
    }

    private static final boolean a(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.res.Resources.getValue(int, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException}
     arg types: [?, android.util.TypedValue, int]
     candidates:
      ClspMth{android.content.res.Resources.getValue(java.lang.String, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException}
      ClspMth{android.content.res.Resources.getValue(int, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException} */
    public daw(Activity activity, View view, int i2, float f2, float f3) {
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.l = new dak(this);
        this.m = new dal(this);
        this.n = new dam(this);
        this.o = false;
        this.e = view;
        this.H = activity;
        FrameLayout frameLayout = new FrameLayout(this.H);
        this.I = frameLayout;
        frameLayout.setContentDescription(this.H.getString(R.string.context_menu_description));
        PopupWindow popupWindow = new PopupWindow(this.I, -2, -2);
        this.K = popupWindow;
        popupWindow.setFocusable(true);
        this.K.setOnDismissListener(new dan(this));
        float[] fArr = new float[2];
        a(this.e, fArr);
        this.M = fArr[0];
        this.N = fArr[1];
        this.O = ((float) this.e.getWidth()) * f2;
        this.P = ((float) this.e.getHeight()) * f3;
        float f4 = (float) i2;
        this.s = b(R.dimen.context_menu_vertical_margin);
        this.z = b(R.dimen.context_menu_triangle_vertical_margin);
        this.A = b(R.dimen.context_menu_triangle_edge_offset);
        this.C = b(R.dimen.context_menu_triangle_height);
        this.B = b(R.dimen.context_menu_triangle_width);
        this.c = this.H.getColor(R.color.context_menu_background_focused_color);
        this.d = this.H.getColor(R.color.context_menu_background_unfocused_color);
        this.v = this.H.getColor(R.color.context_menu_icon_enabled_color);
        this.w = this.H.getColor(R.color.context_menu_icon_disabled_color);
        this.r = b(R.dimen.context_menu_height_per_row);
        this.x = b(R.dimen.overscan_horizontal);
        this.y = b(R.dimen.overscan_vertical);
        TypedValue typedValue = new TypedValue();
        this.H.getResources().getValue((int) R.dimen.context_menu_overlay_alpha, typedValue, true);
        this.t = typedValue.getFloat();
        this.u = this.H.getResources().getInteger(R.integer.context_menu_overlay_show_animation_duration_ms);
        this.a = this.H.getResources().getInteger(R.integer.context_menu_overlay_dismiss_animation_duration_ms);
        this.b = this.H.getColor(R.color.context_menu_overlay_background_color);
        float f5 = this.M;
        float f6 = this.N;
        RectF rectF = new RectF(f5, f6, this.O + f5, this.P + f6);
        dat dat = new dat(this, this.H, (int) (f2 * f4), (int) (f4 * f3));
        this.j = dat;
        dat.a = rectF;
        this.i = new ImageView(this.H);
    }

    public final void a(day day) {
        this.Q.add(day);
    }

    public final void c() {
        View view = this.e;
        if (view != null && this.j != null) {
            float[] fArr = new float[2];
            a(view, fArr);
            if (Math.abs(fArr[0] - this.M) > 1.0E-4f || Math.abs(fArr[1] - this.N) > 1.0E-4f) {
                float f2 = fArr[0];
                this.M = f2;
                float f3 = fArr[1];
                this.N = f3;
                RectF rectF = new RectF(f2, f3, this.O + f2, this.P + f3);
                dat dat = this.j;
                dat.a = rectF;
                dat.invalidate();
            }
        }
    }

    public final void a(float f2, int i2) {
        ObjectAnimator objectAnimator = this.k;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.j, View.ALPHA, f2);
        this.k = ofFloat;
        ofFloat.setDuration((long) i2);
        this.k.start();
    }

    public final day a(int i2) {
        List list = this.Q;
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            day day = (day) list.get(i3);
            i3++;
            if (day.a == i2) {
                return day;
            }
        }
        return null;
    }

    public final void a() {
        this.K.dismiss();
    }

    private final int b(int i2) {
        return this.e.getResources().getDimensionPixelSize(i2);
    }

    private static final void a(View view, float[] fArr) {
        if (fArr.length >= 2) {
            float[] fArr2 = {0.0f, 0.0f};
            view.getMatrix().mapPoints(fArr2);
            fArr2[0] = fArr2[0] + ((float) view.getLeft());
            fArr2[1] = fArr2[1] + ((float) view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                fArr2[0] = fArr2[0] - ((float) view2.getScrollX());
                fArr2[1] = fArr2[1] - ((float) view2.getScrollY());
                view2.getMatrix().mapPoints(fArr2);
                fArr2[0] = fArr2[0] + ((float) view2.getLeft());
                fArr2[1] = fArr2[1] + ((float) view2.getTop());
                parent = view2.getParent();
            }
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[1];
            return;
        }
        throw new IllegalArgumentException("outLocation must be an array of two floats");
    }

    private static final int b(int i2, int i3) {
        if (a(i2, 5) && i3 == 0) {
            return 8388613;
        }
        if (a(i2, 3) && i3 == 1) {
            return 8388613;
        }
        if (a(i2, 3) && i3 == 0) {
            return 8388611;
        }
        return (!a(i2, 5) || i3 != 1) ? 0 : 8388611;
    }

    public final void b() {
        int i2;
        int i3;
        ArrayList arrayList = new ArrayList();
        List list = this.Q;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add((day) list.get(i4));
        }
        this.h = arrayList;
        this.R.clear();
        if (this.g == null) {
            this.g = (ViewGroup) this.H.getWindow().getDecorView().getRootView();
        }
        this.e.addOnAttachStateChangeListener(this.l);
        this.e.getViewTreeObserver().addOnScrollChangedListener(this.m);
        this.e.getRootView().addOnLayoutChangeListener(this.n);
        ViewGroup viewGroup = this.g;
        viewGroup.addView(this.j, viewGroup.getWidth(), this.g.getHeight());
        float f2 = 0.0f;
        this.j.setAlpha(0.0f);
        a(this.t, this.u);
        LinearLayout linearLayout = new LinearLayout(this.H);
        this.J = linearLayout;
        linearLayout.setOrientation(1);
        this.I.addView(this.J, -2, -2);
        this.I.setAccessibilityDelegate(new dap(this));
        this.J.setOutlineProvider(new daq());
        this.J.setClipToOutline(true);
        this.i.setImageDrawable(this.H.getDrawable(R.drawable.context_menu_triangle));
        this.i.setColorFilter(this.d, PorterDuff.Mode.SRC_ATOP);
        this.J.removeAllViews();
        LayoutInflater layoutInflater = (LayoutInflater) this.H.getSystemService("layout_inflater");
        for (int i5 = 0; i5 < this.h.size(); i5++) {
            View inflate = layoutInflater.inflate((int) R.layout.context_menu_item, (ViewGroup) null);
            day day = (day) this.h.get(i5);
            TextView textView = (TextView) inflate.findViewById(R.id.title);
            textView.setText(day.b);
            Context context = inflate.getContext();
            if (!day.d) {
                i2 = R.color.context_menu_text_disabled_color;
            } else {
                i2 = R.color.context_menu_text_enabled_color;
            }
            textView.setTextColor(context.getColor(i2));
            ImageView imageView = (ImageView) inflate.findViewById(R.id.icon);
            if (!day.d) {
                i3 = this.w;
            } else {
                i3 = this.v;
            }
            imageView.setColorFilter(i3, PorterDuff.Mode.SRC_ATOP);
            Drawable drawable = day.c;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
            }
            inflate.setBackgroundColor(this.d);
            if (dcy.b(this.H)) {
                inflate.setFocusable(true);
            } else {
                inflate.setFocusable(day.d);
            }
            inflate.setEnabled(day.d);
            inflate.setOnClickListener(new dar(this, day));
            inflate.setOnFocusChangeListener(new das(this, day, inflate));
            this.R.add(inflate);
            this.J.addView(inflate, -1, this.r);
        }
        this.J.measure(0, 0);
        this.D = this.J.getMeasuredWidth();
        this.E = this.J.getMeasuredHeight() + this.s;
        this.L = 0;
        this.p = 17;
        if (this.e.getLayoutDirection() != 1) {
            if (this.M + ((float) this.D) <= ((float) (this.g.getWidth() - this.x))) {
                this.L |= 3;
            } else {
                this.L |= 5;
            }
        } else if ((this.M + this.O) - ((float) this.D) < ((float) this.x)) {
            this.L |= 3;
        } else {
            this.L |= 5;
        }
        float f3 = this.N;
        float f4 = this.P;
        int i6 = this.E;
        int height = this.g.getHeight();
        int i7 = this.y;
        if (f3 + f4 + ((float) i6) > ((float) (height - i7))) {
            float f5 = this.N;
            int i8 = this.E;
            if (f5 - ((float) i8) < ((float) i7)) {
                this.E = i8 - this.s;
                if (this.e.getLayoutDirection() == 0) {
                    if (this.M + this.O + ((float) this.D) + ((float) this.C) <= ((float) (this.g.getWidth() - this.x))) {
                        this.p = 5;
                    } else {
                        this.p = 3;
                    }
                } else if ((this.M - ((float) this.D)) - ((float) this.C) < ((float) this.x)) {
                    this.p = 5;
                } else {
                    this.p = 3;
                }
                float f6 = this.N;
                int i9 = this.E;
                int height2 = this.g.getHeight();
                int i10 = this.y;
                if (f6 + ((float) i9) <= ((float) (height2 - i10))) {
                    this.q = 0;
                } else if ((this.N + this.P) - ((float) this.E) < ((float) i10)) {
                    this.q = 2;
                } else {
                    this.q = 1;
                }
            } else {
                this.L |= 48;
            }
        } else {
            this.L |= 80;
        }
        this.I.addView(this.i, -2, -2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.i.getLayoutParams();
        layoutParams.gravity = 0;
        if (this.p == 17) {
            if (b(this.L, this.e.getLayoutDirection()) == 8388613) {
                layoutParams.gravity |= 8388613;
                layoutParams.setMarginEnd(this.A);
            } else {
                layoutParams.gravity |= 8388611;
                layoutParams.setMarginStart(this.A);
            }
            if (a(this.L, 48)) {
                layoutParams.gravity |= 80;
                layoutParams.bottomMargin = this.z;
                this.i.setScaleY(-1.0f);
            } else {
                layoutParams.gravity |= 48;
                layoutParams.topMargin = this.z;
            }
        } else {
            layoutParams.gravity |= 8388611;
            float f7 = 90.0f;
            if (b(this.p, this.e.getLayoutDirection()) == 8388611) {
                layoutParams.setMarginStart(this.D - 2);
                ImageView imageView2 = this.i;
                if (this.e.getLayoutDirection() == 1) {
                    f7 = 270.0f;
                }
                imageView2.setRotation(f7);
            } else {
                layoutParams.setMarginStart(0);
                ImageView imageView3 = this.i;
                if (this.e.getLayoutDirection() != 1) {
                    f7 = 270.0f;
                }
                imageView3.setRotation(f7);
            }
            int i11 = this.q;
            if (i11 == 0) {
                layoutParams.gravity |= 48;
                layoutParams.topMargin = (int) ((this.P - ((float) this.B)) / 2.0f);
            } else if (i11 != 1) {
                int height3 = this.g.getHeight();
                int i12 = this.E;
                layoutParams.gravity |= 48;
                layoutParams.topMargin = (int) ((this.N - ((float) (height3 - i12))) + ((this.P - ((float) this.B)) / 2.0f));
            } else {
                layoutParams.gravity |= 80;
                layoutParams.bottomMargin = (int) ((this.P - ((float) this.B)) / 2.0f);
            }
            this.D += this.C;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.J.getLayoutParams();
        if (this.p != 17) {
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = 0;
            if (this.p == 3) {
                marginLayoutParams.rightMargin = this.C;
            } else {
                marginLayoutParams.leftMargin = this.C;
            }
        } else if (a(this.L, 48)) {
            marginLayoutParams.bottomMargin = this.s;
            marginLayoutParams.topMargin = 0;
        } else {
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.topMargin = this.s;
        }
        if ((this.p == 17 && a(this.L, 48)) || (this.p != 17 && this.q == 1)) {
            this.J.removeAllViews();
            for (int size2 = this.h.size() - 1; size2 >= 0; size2--) {
                this.J.addView((View) this.R.get(size2));
            }
        }
        int i13 = ((ViewGroup.MarginLayoutParams) this.i.getLayoutParams()).topMargin;
        if (this.p != 17) {
            int i14 = 0;
            while (true) {
                if (i14 >= this.h.size()) {
                    break;
                }
                int i15 = this.r;
                if (i13 >= i15 * i14 && i13 <= i15 * (i14 + 1)) {
                    ((day) this.h.get(i14)).b();
                    break;
                }
                i14++;
            }
        } else {
            ((day) this.h.get(0)).b();
        }
        this.G = 0.0f;
        this.F = 0.0f;
        int i16 = this.p;
        if (i16 == 17) {
            float width = this.O - ((float) this.e.getWidth());
            float height4 = this.P - ((float) this.e.getHeight());
            if (!a(this.L, 80)) {
                height4 = 0.0f;
            }
            this.F = height4;
            if (a(this.L, 5)) {
                f2 = width;
            }
            this.G = f2;
        } else {
            if (i16 == 3) {
                this.G = (float) (-this.D);
            } else {
                this.G = this.O;
            }
            this.K.setOverlapAnchor(true);
            if (this.q == 1) {
                this.F = -(((float) this.E) - this.P);
            }
        }
        ((View) this.R.get(0)).requestFocus();
        this.K.setWidth(this.D);
        this.K.setHeight(this.E);
        if (this.p == 17) {
            this.K.showAsDropDown(this.e, (int) this.G, (int) this.F, this.L);
        } else {
            this.K.showAsDropDown(this.e, (int) this.G, (int) this.F, 3);
        }
        this.o = true;
    }
}
