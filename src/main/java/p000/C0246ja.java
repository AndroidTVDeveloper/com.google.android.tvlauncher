package p000;

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

/* renamed from: ja */
/* compiled from: PG */
public class C0246ja implements C0162fy {

    /* renamed from: o */
    private static Method f9658o;

    /* renamed from: p */
    private static Method f9659p;

    /* renamed from: A */
    private Rect f9660A;

    /* renamed from: a */
    public C0223ie f9661a;

    /* renamed from: b */
    public int f9662b;

    /* renamed from: c */
    public int f9663c;

    /* renamed from: d */
    public boolean f9664d;

    /* renamed from: e */
    public boolean f9665e;

    /* renamed from: f */
    public boolean f9666f;

    /* renamed from: g */
    public int f9667g = 0;

    /* renamed from: h */
    public final int f9668h = Integer.MAX_VALUE;

    /* renamed from: i */
    public View f9669i;

    /* renamed from: j */
    public AdapterView.OnItemClickListener f9670j;

    /* renamed from: k */
    public final C0244iz f9671k = new C0244iz(this);

    /* renamed from: l */
    public final Handler f9672l;

    /* renamed from: m */
    public boolean f9673m;

    /* renamed from: n */
    public final PopupWindow f9674n;

    /* renamed from: q */
    private final Context f9675q;

    /* renamed from: r */
    private ListAdapter f9676r;

    /* renamed from: s */
    private final int f9677s = -2;

    /* renamed from: t */
    private int f9678t = -2;

    /* renamed from: u */
    private final int f9679u = 1002;

    /* renamed from: v */
    private DataSetObserver f9680v;

    /* renamed from: w */
    private final C0243iy f9681w = new C0243iy(this);

    /* renamed from: x */
    private final C0242ix f9682x = new C0242ix(this);

    /* renamed from: y */
    private final C0240iv f9683y = new C0240iv(this);

    /* renamed from: z */
    private final Rect f9684z = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f9658o = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e) {
            }
            try {
                f9659p = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException e2) {
            }
        }
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: f */
    public final ListView mo4851f() {
        return this.f9661a;
    }

    public C0246ja(Context context, int i) {
        this.f9675q = context;
        this.f9672l = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C0128er.f9173k, i, 0);
        this.f9662b = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f9663c = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f9664d = true;
        }
        obtainStyledAttributes.recycle();
        C0198hg hgVar = new C0198hg(context, i);
        this.f9674n = hgVar;
        hgVar.setInputMethodMode(1);
    }

    /* renamed from: a */
    public final void mo5284a() {
        C0223ie ieVar = this.f9661a;
        if (ieVar != null) {
            ieVar.f9553a = true;
            ieVar.requestLayout();
        }
    }

    /* renamed from: a */
    public C0223ie mo5283a(Context context, boolean z) {
        return new C0223ie(context, z);
    }

    /* renamed from: d */
    public final void mo4849d() {
        this.f9674n.dismiss();
        this.f9674n.setContentView(null);
        this.f9661a = null;
        this.f9672l.removeCallbacks(this.f9671k);
    }

    /* renamed from: b */
    public final boolean mo5290b() {
        return this.f9674n.getInputMethodMode() == 2;
    }

    /* renamed from: e */
    public final boolean mo4850e() {
        return this.f9674n.isShowing();
    }

    /* renamed from: a */
    public final void mo5287a(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f9680v;
        if (dataSetObserver == null) {
            this.f9680v = new C0241iw(this);
        } else {
            ListAdapter listAdapter2 = this.f9676r;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f9676r = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f9680v);
        }
        C0223ie ieVar = this.f9661a;
        if (ieVar != null) {
            ieVar.setAdapter(this.f9676r);
        }
    }

    /* renamed from: b */
    public final void mo5289b(int i) {
        Drawable background = this.f9674n.getBackground();
        if (background != null) {
            background.getPadding(this.f9684z);
            this.f9678t = this.f9684z.left + this.f9684z.right + i;
            return;
        }
        this.f9678t = i;
    }

    /* renamed from: a */
    public final void mo5286a(Rect rect) {
        this.f9660A = rect != null ? new Rect(rect) : null;
    }

    /* renamed from: g */
    public final void mo5291g() {
        this.f9674n.setInputMethodMode(2);
    }

    /* renamed from: h */
    public final void mo5292h() {
        this.f9673m = true;
        this.f9674n.setFocusable(true);
    }

    /* renamed from: a */
    public final void mo5288a(PopupWindow.OnDismissListener onDismissListener) {
        this.f9674n.setOnDismissListener(onDismissListener);
    }

    /* renamed from: a */
    public final void mo5285a(int i) {
        this.f9663c = i;
        this.f9664d = true;
    }

    /* renamed from: c */
    public final void mo4847c() {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        if (this.f9661a == null) {
            Context context = this.f9675q;
            new C0238it(this);
            C0223ie a = mo5283a(context, !this.f9673m);
            this.f9661a = a;
            a.setAdapter(this.f9676r);
            this.f9661a.setOnItemClickListener(this.f9670j);
            this.f9661a.setFocusable(true);
            this.f9661a.setFocusableInTouchMode(true);
            this.f9661a.setOnItemSelectedListener(new C0239iu(this));
            this.f9661a.setOnScrollListener(this.f9682x);
            this.f9674n.setContentView(this.f9661a);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.f9674n.getContentView();
        }
        Drawable background = this.f9674n.getBackground();
        int i5 = 0;
        if (background != null) {
            background.getPadding(this.f9684z);
            i = this.f9684z.top + this.f9684z.bottom;
            if (!this.f9664d) {
                this.f9663c = -this.f9684z.top;
            }
        } else {
            this.f9684z.setEmpty();
            i = 0;
        }
        if (this.f9674n.getInputMethodMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        View view = this.f9669i;
        int i6 = this.f9663c;
        int i7 = Build.VERSION.SDK_INT;
        int maxAvailableHeight = this.f9674n.getMaxAvailableHeight(view, i6, z);
        if (this.f9677s != -1) {
            int i8 = this.f9678t;
            if (i8 == -2) {
                i3 = View.MeasureSpec.makeMeasureSpec(this.f9675q.getResources().getDisplayMetrics().widthPixels - (this.f9684z.left + this.f9684z.right), Integer.MIN_VALUE);
            } else if (i8 != -1) {
                i3 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
            } else {
                i3 = View.MeasureSpec.makeMeasureSpec(this.f9675q.getResources().getDisplayMetrics().widthPixels - (this.f9684z.left + this.f9684z.right), 1073741824);
            }
            int a2 = this.f9661a.mo5232a(i3, maxAvailableHeight);
            if (a2 > 0) {
                i4 = i + this.f9661a.getPaddingTop() + this.f9661a.getPaddingBottom();
            } else {
                i4 = 0;
            }
            i2 = a2 + i4;
        } else {
            i2 = maxAvailableHeight + i;
        }
        boolean b = mo5290b();
        PopupWindow popupWindow = this.f9674n;
        int i9 = this.f9679u;
        int i10 = Build.VERSION.SDK_INT;
        popupWindow.setWindowLayoutType(i9);
        if (!this.f9674n.isShowing()) {
            int i11 = this.f9678t;
            if (i11 == -1) {
                i11 = -1;
            } else if (i11 == -2) {
                i11 = this.f9669i.getWidth();
            }
            int i12 = this.f9677s;
            if (i12 == -1) {
                i2 = -1;
            } else if (i12 != -2) {
                i2 = i12;
            }
            this.f9674n.setWidth(i11);
            this.f9674n.setHeight(i2);
            if (Build.VERSION.SDK_INT > 28) {
                this.f9674n.setIsClippedToScreen(true);
            } else {
                Method method = f9658o;
                if (method != null) {
                    try {
                        method.invoke(this.f9674n, true);
                    } catch (Exception e) {
                    }
                }
            }
            this.f9674n.setOutsideTouchable(true);
            this.f9674n.setTouchInterceptor(this.f9681w);
            if (this.f9666f) {
                C0194hc.m7486a(this.f9674n, this.f9665e);
            }
            if (Build.VERSION.SDK_INT > 28) {
                this.f9674n.setEpicenterBounds(this.f9660A);
            } else {
                Method method2 = f9659p;
                if (method2 != null) {
                    try {
                        method2.invoke(this.f9674n, this.f9660A);
                    } catch (Exception e2) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                    }
                }
            }
            PopupWindow popupWindow2 = this.f9674n;
            View view2 = this.f9669i;
            int i13 = this.f9662b;
            int i14 = this.f9663c;
            int i15 = this.f9667g;
            int i16 = Build.VERSION.SDK_INT;
            popupWindow2.showAsDropDown(view2, i13, i14, i15);
            this.f9661a.setSelection(-1);
            if (!this.f9673m || this.f9661a.isInTouchMode()) {
                mo5284a();
            }
            if (!this.f9673m) {
                this.f9672l.post(this.f9683y);
            }
        } else if (C0107dx.m7218o(this.f9669i)) {
            int i17 = this.f9678t;
            if (i17 == -1) {
                i17 = -1;
            } else if (i17 == -2) {
                i17 = this.f9669i.getWidth();
            }
            int i18 = this.f9677s;
            if (i18 == -1) {
                if (!b) {
                    i2 = -1;
                }
                if (!b) {
                    PopupWindow popupWindow3 = this.f9674n;
                    if (this.f9678t == -1) {
                        i5 = -1;
                    }
                    popupWindow3.setWidth(i5);
                    this.f9674n.setHeight(-1);
                } else {
                    this.f9674n.setWidth(this.f9678t == -1 ? -1 : 0);
                    this.f9674n.setHeight(0);
                }
            } else if (i18 != -2) {
                i2 = i18;
            }
            this.f9674n.setOutsideTouchable(true);
            this.f9674n.update(this.f9669i, this.f9662b, this.f9663c, i17 < 0 ? -1 : i17, i2 < 0 ? -1 : i2);
        }
    }
}
