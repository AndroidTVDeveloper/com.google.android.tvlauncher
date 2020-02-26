package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: ja  reason: default package */
/* compiled from: PG */
public class ja implements fy {
    private static Method o;
    private static Method p;
    private Rect A;
    public ie a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g = 0;
    public final int h = Integer.MAX_VALUE;
    public View i;
    public AdapterView.OnItemClickListener j;
    public final iz k = new iz(this);
    public final Handler l;
    public boolean m;
    public final PopupWindow n;
    private final Context q;
    private ListAdapter r;
    private final int s = -2;
    private int t = -2;
    private final int u = 1002;
    private DataSetObserver v;
    private final iy w = new iy(this);
    private final ix x = new ix(this);
    private final iv y = new iv(this);
    private final Rect z = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                o = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e2) {
            }
            try {
                p = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException e3) {
            }
        }
        int i2 = Build.VERSION.SDK_INT;
    }

    public final ListView f() {
        return this.a;
    }

    public ja(Context context, int i2) {
        this.q = context;
        this.l = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, er.k, i2, 0);
        this.b = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.c = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.d = true;
        }
        obtainStyledAttributes.recycle();
        hg hgVar = new hg(context, i2);
        this.n = hgVar;
        hgVar.setInputMethodMode(1);
    }

    public final void a() {
        ie ieVar = this.a;
        if (ieVar != null) {
            ieVar.a = true;
            ieVar.requestLayout();
        }
    }

    public ie a(Context context, boolean z2) {
        return new ie(context, z2);
    }

    public final void d() {
        this.n.dismiss();
        this.n.setContentView(null);
        this.a = null;
        this.l.removeCallbacks(this.k);
    }

    public final boolean b() {
        return this.n.getInputMethodMode() == 2;
    }

    public final boolean e() {
        return this.n.isShowing();
    }

    public final void a(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.v;
        if (dataSetObserver == null) {
            this.v = new iw(this);
        } else {
            ListAdapter listAdapter2 = this.r;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.r = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.v);
        }
        ie ieVar = this.a;
        if (ieVar != null) {
            ieVar.setAdapter(this.r);
        }
    }

    public final void b(int i2) {
        Drawable background = this.n.getBackground();
        if (background != null) {
            background.getPadding(this.z);
            this.t = this.z.left + this.z.right + i2;
            return;
        }
        this.t = i2;
    }

    public final void a(Rect rect) {
        this.A = rect != null ? new Rect(rect) : null;
    }

    public final void g() {
        this.n.setInputMethodMode(2);
    }

    public final void h() {
        this.m = true;
        this.n.setFocusable(true);
    }

    public final void a(PopupWindow.OnDismissListener onDismissListener) {
        this.n.setOnDismissListener(onDismissListener);
    }

    public final void a(int i2) {
        this.c = i2;
        this.d = true;
    }

    public final void c() {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        if (this.a == null) {
            Context context = this.q;
            new it(this);
            ie a2 = a(context, !this.m);
            this.a = a2;
            a2.setAdapter(this.r);
            this.a.setOnItemClickListener(this.j);
            this.a.setFocusable(true);
            this.a.setFocusableInTouchMode(true);
            this.a.setOnItemSelectedListener(new iu(this));
            this.a.setOnScrollListener(this.x);
            this.n.setContentView(this.a);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.n.getContentView();
        }
        Drawable background = this.n.getBackground();
        int i6 = 0;
        if (background != null) {
            background.getPadding(this.z);
            i2 = this.z.top + this.z.bottom;
            if (!this.d) {
                this.c = -this.z.top;
            }
        } else {
            this.z.setEmpty();
            i2 = 0;
        }
        if (this.n.getInputMethodMode() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        View view = this.i;
        int i7 = this.c;
        int i8 = Build.VERSION.SDK_INT;
        int maxAvailableHeight = this.n.getMaxAvailableHeight(view, i7, z2);
        if (this.s != -1) {
            int i9 = this.t;
            if (i9 == -2) {
                i4 = View.MeasureSpec.makeMeasureSpec(this.q.getResources().getDisplayMetrics().widthPixels - (this.z.left + this.z.right), Integer.MIN_VALUE);
            } else if (i9 != -1) {
                i4 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
            } else {
                i4 = View.MeasureSpec.makeMeasureSpec(this.q.getResources().getDisplayMetrics().widthPixels - (this.z.left + this.z.right), 1073741824);
            }
            int a3 = this.a.a(i4, maxAvailableHeight);
            if (a3 > 0) {
                i5 = i2 + this.a.getPaddingTop() + this.a.getPaddingBottom();
            } else {
                i5 = 0;
            }
            i3 = a3 + i5;
        } else {
            i3 = maxAvailableHeight + i2;
        }
        boolean b2 = b();
        PopupWindow popupWindow = this.n;
        int i10 = this.u;
        int i11 = Build.VERSION.SDK_INT;
        popupWindow.setWindowLayoutType(i10);
        if (!this.n.isShowing()) {
            int i12 = this.t;
            if (i12 == -1) {
                i12 = -1;
            } else if (i12 == -2) {
                i12 = this.i.getWidth();
            }
            int i13 = this.s;
            if (i13 == -1) {
                i3 = -1;
            } else if (i13 != -2) {
                i3 = i13;
            }
            this.n.setWidth(i12);
            this.n.setHeight(i3);
            if (Build.VERSION.SDK_INT > 28) {
                this.n.setIsClippedToScreen(true);
            } else {
                Method method = o;
                if (method != null) {
                    try {
                        method.invoke(this.n, true);
                    } catch (Exception e2) {
                    }
                }
            }
            this.n.setOutsideTouchable(true);
            this.n.setTouchInterceptor(this.w);
            if (this.f) {
                hc.a(this.n, this.e);
            }
            if (Build.VERSION.SDK_INT > 28) {
                this.n.setEpicenterBounds(this.A);
            } else {
                Method method2 = p;
                if (method2 != null) {
                    try {
                        method2.invoke(this.n, this.A);
                    } catch (Exception e3) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e3);
                    }
                }
            }
            PopupWindow popupWindow2 = this.n;
            View view2 = this.i;
            int i14 = this.b;
            int i15 = this.c;
            int i16 = this.g;
            int i17 = Build.VERSION.SDK_INT;
            popupWindow2.showAsDropDown(view2, i14, i15, i16);
            this.a.setSelection(-1);
            if (!this.m || this.a.isInTouchMode()) {
                a();
            }
            if (!this.m) {
                this.l.post(this.y);
            }
        } else if (dx.o(this.i)) {
            int i18 = this.t;
            if (i18 == -1) {
                i18 = -1;
            } else if (i18 == -2) {
                i18 = this.i.getWidth();
            }
            int i19 = this.s;
            if (i19 == -1) {
                if (!b2) {
                    i3 = -1;
                }
                if (!b2) {
                    PopupWindow popupWindow3 = this.n;
                    if (this.t == -1) {
                        i6 = -1;
                    }
                    popupWindow3.setWidth(i6);
                    this.n.setHeight(-1);
                } else {
                    this.n.setWidth(this.t == -1 ? -1 : 0);
                    this.n.setHeight(0);
                }
            } else if (i19 != -2) {
                i3 = i19;
            }
            this.n.setOutsideTouchable(true);
            this.n.update(this.i, this.b, this.c, i18 < 0 ? -1 : i18, i3 < 0 ? -1 : i3);
        }
    }
}
