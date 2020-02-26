package p000;

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

/* renamed from: daw */
/* compiled from: PG */
public final class daw {

    /* renamed from: A */
    private final int f8073A;

    /* renamed from: B */
    private final int f8074B;

    /* renamed from: C */
    private final int f8075C;

    /* renamed from: D */
    private int f8076D;

    /* renamed from: E */
    private int f8077E;

    /* renamed from: F */
    private float f8078F;

    /* renamed from: G */
    private float f8079G;

    /* renamed from: H */
    private Activity f8080H;

    /* renamed from: I */
    private FrameLayout f8081I;

    /* renamed from: J */
    private LinearLayout f8082J;

    /* renamed from: K */
    private PopupWindow f8083K;

    /* renamed from: L */
    private int f8084L;

    /* renamed from: M */
    private float f8085M;

    /* renamed from: N */
    private float f8086N;

    /* renamed from: O */
    private float f8087O;

    /* renamed from: P */
    private float f8088P;

    /* renamed from: Q */
    private List f8089Q;

    /* renamed from: R */
    private List f8090R;

    /* renamed from: a */
    public final int f8091a;

    /* renamed from: b */
    public final int f8092b;

    /* renamed from: c */
    public final int f8093c;

    /* renamed from: d */
    public final int f8094d;

    /* renamed from: e */
    public View f8095e;

    /* renamed from: f */
    public dav f8096f;

    /* renamed from: g */
    public ViewGroup f8097g;

    /* renamed from: h */
    public List f8098h;

    /* renamed from: i */
    public ImageView f8099i;

    /* renamed from: j */
    public dat f8100j;

    /* renamed from: k */
    public ObjectAnimator f8101k;

    /* renamed from: l */
    public View.OnAttachStateChangeListener f8102l;

    /* renamed from: m */
    public ViewTreeObserver.OnScrollChangedListener f8103m;

    /* renamed from: n */
    public View.OnLayoutChangeListener f8104n;

    /* renamed from: o */
    public boolean f8105o;

    /* renamed from: p */
    private int f8106p;

    /* renamed from: q */
    private int f8107q;

    /* renamed from: r */
    private final int f8108r;

    /* renamed from: s */
    private final int f8109s;

    /* renamed from: t */
    private final float f8110t;

    /* renamed from: u */
    private final int f8111u;

    /* renamed from: v */
    private final int f8112v;

    /* renamed from: w */
    private final int f8113w;

    /* renamed from: x */
    private final int f8114x;

    /* renamed from: y */
    private final int f8115y;

    /* renamed from: z */
    private final int f8116z;

    public daw(Activity activity, View view, int i) {
        this(activity, view, i, view.getScaleX(), view.getScaleY());
    }

    /* renamed from: a */
    private static final boolean m6059a(int i, int i2) {
        return (i & i2) == i2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.res.Resources.getValue(int, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException}
     arg types: [?, android.util.TypedValue, int]
     candidates:
      ClspMth{android.content.res.Resources.getValue(java.lang.String, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException}
      ClspMth{android.content.res.Resources.getValue(int, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException} */
    public daw(Activity activity, View view, int i, float f, float f2) {
        this.f8089Q = new ArrayList();
        this.f8090R = new ArrayList();
        this.f8102l = new dak(this);
        this.f8103m = new dal(this);
        this.f8104n = new dam(this);
        this.f8105o = false;
        this.f8095e = view;
        this.f8080H = activity;
        FrameLayout frameLayout = new FrameLayout(this.f8080H);
        this.f8081I = frameLayout;
        frameLayout.setContentDescription(this.f8080H.getString(R.string.context_menu_description));
        PopupWindow popupWindow = new PopupWindow(this.f8081I, -2, -2);
        this.f8083K = popupWindow;
        popupWindow.setFocusable(true);
        this.f8083K.setOnDismissListener(new dan(this));
        float[] fArr = new float[2];
        m6058a(this.f8095e, fArr);
        this.f8085M = fArr[0];
        this.f8086N = fArr[1];
        this.f8087O = ((float) this.f8095e.getWidth()) * f;
        this.f8088P = ((float) this.f8095e.getHeight()) * f2;
        float f3 = (float) i;
        this.f8109s = m6060b(R.dimen.context_menu_vertical_margin);
        this.f8116z = m6060b(R.dimen.context_menu_triangle_vertical_margin);
        this.f8073A = m6060b(R.dimen.context_menu_triangle_edge_offset);
        this.f8075C = m6060b(R.dimen.context_menu_triangle_height);
        this.f8074B = m6060b(R.dimen.context_menu_triangle_width);
        this.f8093c = this.f8080H.getColor(R.color.context_menu_background_focused_color);
        this.f8094d = this.f8080H.getColor(R.color.context_menu_background_unfocused_color);
        this.f8112v = this.f8080H.getColor(R.color.context_menu_icon_enabled_color);
        this.f8113w = this.f8080H.getColor(R.color.context_menu_icon_disabled_color);
        this.f8108r = m6060b(R.dimen.context_menu_height_per_row);
        this.f8114x = m6060b(R.dimen.overscan_horizontal);
        this.f8115y = m6060b(R.dimen.overscan_vertical);
        TypedValue typedValue = new TypedValue();
        this.f8080H.getResources().getValue((int) R.dimen.context_menu_overlay_alpha, typedValue, true);
        this.f8110t = typedValue.getFloat();
        this.f8111u = this.f8080H.getResources().getInteger(R.integer.context_menu_overlay_show_animation_duration_ms);
        this.f8091a = this.f8080H.getResources().getInteger(R.integer.context_menu_overlay_dismiss_animation_duration_ms);
        this.f8092b = this.f8080H.getColor(R.color.context_menu_overlay_background_color);
        float f4 = this.f8085M;
        float f5 = this.f8086N;
        RectF rectF = new RectF(f4, f5, this.f8087O + f4, this.f8088P + f5);
        dat dat = new dat(this, this.f8080H, (int) (f * f3), (int) (f3 * f2));
        this.f8100j = dat;
        dat.f8068a = rectF;
        this.f8099i = new ImageView(this.f8080H);
    }

    /* renamed from: a */
    public final void mo4053a(day day) {
        this.f8089Q.add(day);
    }

    /* renamed from: c */
    public final void mo4055c() {
        View view = this.f8095e;
        if (view != null && this.f8100j != null) {
            float[] fArr = new float[2];
            m6058a(view, fArr);
            if (Math.abs(fArr[0] - this.f8085M) > 1.0E-4f || Math.abs(fArr[1] - this.f8086N) > 1.0E-4f) {
                float f = fArr[0];
                this.f8085M = f;
                float f2 = fArr[1];
                this.f8086N = f2;
                RectF rectF = new RectF(f, f2, this.f8087O + f, this.f8088P + f2);
                dat dat = this.f8100j;
                dat.f8068a = rectF;
                dat.invalidate();
            }
        }
    }

    /* renamed from: a */
    public final void mo4052a(float f, int i) {
        ObjectAnimator objectAnimator = this.f8101k;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f8100j, View.ALPHA, f);
        this.f8101k = ofFloat;
        ofFloat.setDuration((long) i);
        this.f8101k.start();
    }

    /* renamed from: a */
    public final day mo4050a(int i) {
        List list = this.f8089Q;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            day day = (day) list.get(i2);
            i2++;
            if (day.f8117a == i) {
                return day;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo4051a() {
        this.f8083K.dismiss();
    }

    /* renamed from: b */
    private final int m6060b(int i) {
        return this.f8095e.getResources().getDimensionPixelSize(i);
    }

    /* renamed from: a */
    private static final void m6058a(View view, float[] fArr) {
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

    /* renamed from: b */
    private static final int m6061b(int i, int i2) {
        if (m6059a(i, 5) && i2 == 0) {
            return 8388613;
        }
        if (m6059a(i, 3) && i2 == 1) {
            return 8388613;
        }
        if (m6059a(i, 3) && i2 == 0) {
            return 8388611;
        }
        return (!m6059a(i, 5) || i2 != 1) ? 0 : 8388611;
    }

    /* renamed from: b */
    public final void mo4054b() {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        List list = this.f8089Q;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add((day) list.get(i3));
        }
        this.f8098h = arrayList;
        this.f8090R.clear();
        if (this.f8097g == null) {
            this.f8097g = (ViewGroup) this.f8080H.getWindow().getDecorView().getRootView();
        }
        this.f8095e.addOnAttachStateChangeListener(this.f8102l);
        this.f8095e.getViewTreeObserver().addOnScrollChangedListener(this.f8103m);
        this.f8095e.getRootView().addOnLayoutChangeListener(this.f8104n);
        ViewGroup viewGroup = this.f8097g;
        viewGroup.addView(this.f8100j, viewGroup.getWidth(), this.f8097g.getHeight());
        float f = 0.0f;
        this.f8100j.setAlpha(0.0f);
        mo4052a(this.f8110t, this.f8111u);
        LinearLayout linearLayout = new LinearLayout(this.f8080H);
        this.f8082J = linearLayout;
        linearLayout.setOrientation(1);
        this.f8081I.addView(this.f8082J, -2, -2);
        this.f8081I.setAccessibilityDelegate(new dap(this));
        this.f8082J.setOutlineProvider(new daq());
        this.f8082J.setClipToOutline(true);
        this.f8099i.setImageDrawable(this.f8080H.getDrawable(R.drawable.context_menu_triangle));
        this.f8099i.setColorFilter(this.f8094d, PorterDuff.Mode.SRC_ATOP);
        this.f8082J.removeAllViews();
        LayoutInflater layoutInflater = (LayoutInflater) this.f8080H.getSystemService("layout_inflater");
        for (int i4 = 0; i4 < this.f8098h.size(); i4++) {
            View inflate = layoutInflater.inflate((int) R.layout.context_menu_item, (ViewGroup) null);
            day day = (day) this.f8098h.get(i4);
            TextView textView = (TextView) inflate.findViewById(R.id.title);
            textView.setText(day.f8118b);
            Context context = inflate.getContext();
            if (!day.f8120d) {
                i = R.color.context_menu_text_disabled_color;
            } else {
                i = R.color.context_menu_text_enabled_color;
            }
            textView.setTextColor(context.getColor(i));
            ImageView imageView = (ImageView) inflate.findViewById(R.id.icon);
            if (!day.f8120d) {
                i2 = this.f8113w;
            } else {
                i2 = this.f8112v;
            }
            imageView.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
            Drawable drawable = day.f8119c;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
            }
            inflate.setBackgroundColor(this.f8094d);
            if (dcy.m6193b(this.f8080H)) {
                inflate.setFocusable(true);
            } else {
                inflate.setFocusable(day.f8120d);
            }
            inflate.setEnabled(day.f8120d);
            inflate.setOnClickListener(new dar(this, day));
            inflate.setOnFocusChangeListener(new das(this, day, inflate));
            this.f8090R.add(inflate);
            this.f8082J.addView(inflate, -1, this.f8108r);
        }
        this.f8082J.measure(0, 0);
        this.f8076D = this.f8082J.getMeasuredWidth();
        this.f8077E = this.f8082J.getMeasuredHeight() + this.f8109s;
        this.f8084L = 0;
        this.f8106p = 17;
        if (this.f8095e.getLayoutDirection() != 1) {
            if (this.f8085M + ((float) this.f8076D) <= ((float) (this.f8097g.getWidth() - this.f8114x))) {
                this.f8084L |= 3;
            } else {
                this.f8084L |= 5;
            }
        } else if ((this.f8085M + this.f8087O) - ((float) this.f8076D) < ((float) this.f8114x)) {
            this.f8084L |= 3;
        } else {
            this.f8084L |= 5;
        }
        float f2 = this.f8086N;
        float f3 = this.f8088P;
        int i5 = this.f8077E;
        int height = this.f8097g.getHeight();
        int i6 = this.f8115y;
        if (f2 + f3 + ((float) i5) > ((float) (height - i6))) {
            float f4 = this.f8086N;
            int i7 = this.f8077E;
            if (f4 - ((float) i7) < ((float) i6)) {
                this.f8077E = i7 - this.f8109s;
                if (this.f8095e.getLayoutDirection() == 0) {
                    if (this.f8085M + this.f8087O + ((float) this.f8076D) + ((float) this.f8075C) <= ((float) (this.f8097g.getWidth() - this.f8114x))) {
                        this.f8106p = 5;
                    } else {
                        this.f8106p = 3;
                    }
                } else if ((this.f8085M - ((float) this.f8076D)) - ((float) this.f8075C) < ((float) this.f8114x)) {
                    this.f8106p = 5;
                } else {
                    this.f8106p = 3;
                }
                float f5 = this.f8086N;
                int i8 = this.f8077E;
                int height2 = this.f8097g.getHeight();
                int i9 = this.f8115y;
                if (f5 + ((float) i8) <= ((float) (height2 - i9))) {
                    this.f8107q = 0;
                } else if ((this.f8086N + this.f8088P) - ((float) this.f8077E) < ((float) i9)) {
                    this.f8107q = 2;
                } else {
                    this.f8107q = 1;
                }
            } else {
                this.f8084L |= 48;
            }
        } else {
            this.f8084L |= 80;
        }
        this.f8081I.addView(this.f8099i, -2, -2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f8099i.getLayoutParams();
        layoutParams.gravity = 0;
        if (this.f8106p == 17) {
            if (m6061b(this.f8084L, this.f8095e.getLayoutDirection()) == 8388613) {
                layoutParams.gravity |= 8388613;
                layoutParams.setMarginEnd(this.f8073A);
            } else {
                layoutParams.gravity |= 8388611;
                layoutParams.setMarginStart(this.f8073A);
            }
            if (m6059a(this.f8084L, 48)) {
                layoutParams.gravity |= 80;
                layoutParams.bottomMargin = this.f8116z;
                this.f8099i.setScaleY(-1.0f);
            } else {
                layoutParams.gravity |= 48;
                layoutParams.topMargin = this.f8116z;
            }
        } else {
            layoutParams.gravity |= 8388611;
            float f6 = 90.0f;
            if (m6061b(this.f8106p, this.f8095e.getLayoutDirection()) == 8388611) {
                layoutParams.setMarginStart(this.f8076D - 2);
                ImageView imageView2 = this.f8099i;
                if (this.f8095e.getLayoutDirection() == 1) {
                    f6 = 270.0f;
                }
                imageView2.setRotation(f6);
            } else {
                layoutParams.setMarginStart(0);
                ImageView imageView3 = this.f8099i;
                if (this.f8095e.getLayoutDirection() != 1) {
                    f6 = 270.0f;
                }
                imageView3.setRotation(f6);
            }
            int i10 = this.f8107q;
            if (i10 == 0) {
                layoutParams.gravity |= 48;
                layoutParams.topMargin = (int) ((this.f8088P - ((float) this.f8074B)) / 2.0f);
            } else if (i10 != 1) {
                int height3 = this.f8097g.getHeight();
                int i11 = this.f8077E;
                layoutParams.gravity |= 48;
                layoutParams.topMargin = (int) ((this.f8086N - ((float) (height3 - i11))) + ((this.f8088P - ((float) this.f8074B)) / 2.0f));
            } else {
                layoutParams.gravity |= 80;
                layoutParams.bottomMargin = (int) ((this.f8088P - ((float) this.f8074B)) / 2.0f);
            }
            this.f8076D += this.f8075C;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f8082J.getLayoutParams();
        if (this.f8106p != 17) {
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = 0;
            if (this.f8106p == 3) {
                marginLayoutParams.rightMargin = this.f8075C;
            } else {
                marginLayoutParams.leftMargin = this.f8075C;
            }
        } else if (m6059a(this.f8084L, 48)) {
            marginLayoutParams.bottomMargin = this.f8109s;
            marginLayoutParams.topMargin = 0;
        } else {
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.topMargin = this.f8109s;
        }
        if ((this.f8106p == 17 && m6059a(this.f8084L, 48)) || (this.f8106p != 17 && this.f8107q == 1)) {
            this.f8082J.removeAllViews();
            for (int size2 = this.f8098h.size() - 1; size2 >= 0; size2--) {
                this.f8082J.addView((View) this.f8090R.get(size2));
            }
        }
        int i12 = ((ViewGroup.MarginLayoutParams) this.f8099i.getLayoutParams()).topMargin;
        if (this.f8106p != 17) {
            int i13 = 0;
            while (true) {
                if (i13 >= this.f8098h.size()) {
                    break;
                }
                int i14 = this.f8108r;
                if (i12 >= i14 * i13 && i12 <= i14 * (i13 + 1)) {
                    ((day) this.f8098h.get(i13)).mo4059b();
                    break;
                }
                i13++;
            }
        } else {
            ((day) this.f8098h.get(0)).mo4059b();
        }
        this.f8079G = 0.0f;
        this.f8078F = 0.0f;
        int i15 = this.f8106p;
        if (i15 == 17) {
            float width = this.f8087O - ((float) this.f8095e.getWidth());
            float height4 = this.f8088P - ((float) this.f8095e.getHeight());
            if (!m6059a(this.f8084L, 80)) {
                height4 = 0.0f;
            }
            this.f8078F = height4;
            if (m6059a(this.f8084L, 5)) {
                f = width;
            }
            this.f8079G = f;
        } else {
            if (i15 == 3) {
                this.f8079G = (float) (-this.f8076D);
            } else {
                this.f8079G = this.f8087O;
            }
            this.f8083K.setOverlapAnchor(true);
            if (this.f8107q == 1) {
                this.f8078F = -(((float) this.f8077E) - this.f8088P);
            }
        }
        ((View) this.f8090R.get(0)).requestFocus();
        this.f8083K.setWidth(this.f8076D);
        this.f8083K.setHeight(this.f8077E);
        if (this.f8106p == 17) {
            this.f8083K.showAsDropDown(this.f8095e, (int) this.f8079G, (int) this.f8078F, this.f8084L);
        } else {
            this.f8083K.showAsDropDown(this.f8095e, (int) this.f8079G, (int) this.f8078F, 3);
        }
        this.f8105o = true;
    }
}
