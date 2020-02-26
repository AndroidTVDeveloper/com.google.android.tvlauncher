package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.tvlauncher.R;

/* renamed from: gb  reason: default package */
/* compiled from: PG */
final class gb extends fr implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener, fv {
    public final jd a;
    public final ViewTreeObserver.OnGlobalLayoutListener b = new fz(this);
    public View c;
    public ViewTreeObserver d;
    private final Context e;
    private final fo f;
    private final fm h;
    private final boolean i;
    private final int j;
    private final int k;
    private final View.OnAttachStateChangeListener l = new ga(this);
    private PopupWindow.OnDismissListener m;
    private View n;
    private fu o;
    private boolean p;
    private boolean q;
    private int r;
    private int s = 0;
    private boolean t;

    public gb(Context context, fo foVar, View view, int i2, boolean z) {
        this.e = context;
        this.f = foVar;
        this.i = z;
        this.h = new fm(foVar, LayoutInflater.from(context), this.i, R.layout.abc_popup_menu_item_layout);
        this.k = i2;
        Resources resources = context.getResources();
        this.j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.n = view;
        this.a = new jd(this.e, this.k);
        foVar.a(this, context);
    }

    public final void a(fo foVar) {
    }

    public final boolean a() {
        return false;
    }

    public final ListView f() {
        return this.a.a;
    }

    public final void d() {
        if (e()) {
            this.a.d();
        }
    }

    public final boolean e() {
        return !this.p && this.a.e();
    }

    public final void a(fo foVar, boolean z) {
        if (foVar == this.f) {
            d();
            fu fuVar = this.o;
            if (fuVar != null) {
                fuVar.a(foVar);
            }
        }
    }

    public final void onDismiss() {
        this.p = true;
        this.f.close();
        ViewTreeObserver viewTreeObserver = this.d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.d = this.c.getViewTreeObserver();
            }
            this.d.removeGlobalOnLayoutListener(this.b);
            this.d = null;
        }
        this.c.removeOnAttachStateChangeListener(this.l);
        PopupWindow.OnDismissListener onDismissListener = this.m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        d();
        return true;
    }

    public final boolean a(gc gcVar) {
        int i2;
        if (gcVar.hasVisibleItems()) {
            ft ftVar = new ft(this.e, gcVar, this.c, this.i, this.k);
            ftVar.a(this.o);
            ftVar.a(fr.b(gcVar));
            ftVar.c = this.m;
            this.m = null;
            this.f.a(false);
            jd jdVar = this.a;
            int i3 = jdVar.b;
            if (jdVar.d) {
                i2 = jdVar.c;
            } else {
                i2 = 0;
            }
            if ((Gravity.getAbsoluteGravity(this.s, dx.f(this.n)) & 7) == 5) {
                i3 += this.n.getWidth();
            }
            if (!ftVar.e()) {
                if (ftVar.a != null) {
                    ftVar.a(i3, i2, true, true);
                }
            }
            fu fuVar = this.o;
            if (fuVar != null) {
                fuVar.b(gcVar);
            }
            return true;
        }
        return false;
    }

    public final void a(View view) {
        this.n = view;
    }

    public final void a(fu fuVar) {
        this.o = fuVar;
    }

    public final void a(boolean z) {
        this.h.b = z;
    }

    public final void a(int i2) {
        this.s = i2;
    }

    public final void b(int i2) {
        this.a.b = i2;
    }

    public final void a(PopupWindow.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }

    public final void b(boolean z) {
        this.t = z;
    }

    public final void c(int i2) {
        this.a.a(i2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, ie, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final void c() {
        View view;
        if (e()) {
            return;
        }
        if (this.p || (view = this.n) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.c = view;
        this.a.a(this);
        jd jdVar = this.a;
        jdVar.j = this;
        jdVar.h();
        View view2 = this.c;
        ViewTreeObserver viewTreeObserver = this.d;
        ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
        this.d = viewTreeObserver2;
        if (viewTreeObserver == null) {
            viewTreeObserver2.addOnGlobalLayoutListener(this.b);
        }
        view2.addOnAttachStateChangeListener(this.l);
        jd jdVar2 = this.a;
        jdVar2.i = view2;
        jdVar2.g = this.s;
        if (!this.q) {
            this.r = a(this.h, this.e, this.j);
            this.q = true;
        }
        this.a.b(this.r);
        this.a.g();
        this.a.a(this.g);
        this.a.c();
        ie ieVar = this.a.a;
        ieVar.setOnKeyListener(this);
        if (this.t && this.f.e != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.e).inflate((int) R.layout.abc_popup_menu_header_item_layout, (ViewGroup) ieVar, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f.e);
            }
            frameLayout.setEnabled(false);
            ieVar.addHeaderView(frameLayout, null, false);
        }
        this.a.a(this.h);
        this.a.c();
    }

    public final void b() {
        this.q = false;
        fm fmVar = this.h;
        if (fmVar != null) {
            fmVar.notifyDataSetChanged();
        }
    }
}
