package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.tvlauncher.R;

/* renamed from: li  reason: default package */
/* compiled from: PG */
public final class li implements hp {
    public final Toolbar a;
    public CharSequence b;
    private int c;
    private View d;
    private Drawable e;
    private Drawable f;
    private Drawable g;
    private CharSequence h;
    private CharSequence i;
    private int j = 0;
    private final Drawable k;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.support.v7.widget.Toolbar, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public li(Toolbar toolbar) {
        Drawable drawable;
        this.a = toolbar;
        this.b = toolbar.m;
        this.h = toolbar.n;
        this.g = toolbar.b();
        String str = null;
        kz a2 = kz.a(toolbar.getContext(), null, er.a, R.attr.actionBarStyle);
        this.k = a2.a(15);
        CharSequence b2 = a2.b(27);
        if (!TextUtils.isEmpty(b2)) {
            this.b = b2;
            if ((this.c & 8) != 0) {
                this.a.a(b2);
            }
        }
        CharSequence b3 = a2.b(25);
        if (!TextUtils.isEmpty(b3)) {
            this.h = b3;
            if ((this.c & 8) != 0) {
                this.a.b(b3);
            }
        }
        Drawable a3 = a2.a(20);
        if (a3 != null) {
            this.f = a3;
            a();
        }
        Drawable a4 = a2.a(17);
        if (a4 != null) {
            this.e = a4;
            a();
        }
        if (this.g == null && (drawable = this.k) != null) {
            this.g = drawable;
            b();
        }
        a(a2.a(10, 0));
        int e2 = a2.e(9, 0);
        if (e2 != 0) {
            View inflate = LayoutInflater.from(this.a.getContext()).inflate(e2, (ViewGroup) this.a, false);
            View view = this.d;
            if (!(view == null || (this.c & 16) == 0)) {
                this.a.removeView(view);
            }
            this.d = inflate;
            if (!(inflate == null || (this.c & 16) == 0)) {
                this.a.addView(inflate);
            }
            a(this.c | 16);
        }
        int f2 = a2.f(13);
        if (f2 > 0) {
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            layoutParams.height = f2;
            this.a.setLayoutParams(layoutParams);
        }
        int c2 = a2.c(7, -1);
        int c3 = a2.c(3, -1);
        if (c2 >= 0 || c3 >= 0) {
            Toolbar toolbar2 = this.a;
            int max = Math.max(c2, 0);
            int max2 = Math.max(c3, 0);
            toolbar2.d();
            toolbar2.l.a(max, max2);
        }
        int e3 = a2.e(28, 0);
        if (e3 != 0) {
            Toolbar toolbar3 = this.a;
            Context context = toolbar3.getContext();
            toolbar3.i = e3;
            TextView textView = toolbar3.b;
            if (textView != null) {
                textView.setTextAppearance(context, e3);
            }
        }
        int e4 = a2.e(26, 0);
        if (e4 != 0) {
            Toolbar toolbar4 = this.a;
            Context context2 = toolbar4.getContext();
            toolbar4.j = e4;
            TextView textView2 = toolbar4.c;
            if (textView2 != null) {
                textView2.setTextAppearance(context2, e4);
            }
        }
        int e5 = a2.e(22, 0);
        if (e5 != 0) {
            this.a.a(e5);
        }
        a2.a();
        if (this.j != R.string.abc_action_bar_up_description) {
            this.j = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(this.a.a())) {
                int i2 = this.j;
                this.i = i2 != 0 ? this.a.getContext().getString(i2) : str;
                c();
            }
        }
        this.i = this.a.a();
        Toolbar toolbar5 = this.a;
        lh lhVar = new lh(this);
        toolbar5.c();
        toolbar5.d.setOnClickListener(lhVar);
    }

    private final void a(int i2) {
        View view;
        int i3 = this.c ^ i2;
        this.c = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    c();
                }
                b();
            }
            if ((i3 & 3) != 0) {
                a();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.a.a(this.b);
                    this.a.b(this.h);
                } else {
                    this.a.a((CharSequence) null);
                    this.a.b((CharSequence) null);
                }
            }
            if ((i3 & 16) != 0 && (view = this.d) != null) {
                if ((i2 & 16) == 0) {
                    this.a.removeView(view);
                } else {
                    this.a.addView(view);
                }
            }
        }
    }

    private final void c() {
        if ((this.c & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.i)) {
            Toolbar toolbar = this.a;
            int i2 = this.j;
            toolbar.c(i2 != 0 ? toolbar.getContext().getText(i2) : null);
            return;
        }
        this.a.c(this.i);
    }

    private final void b() {
        if ((this.c & 4) != 0) {
            Toolbar toolbar = this.a;
            Drawable drawable = this.g;
            if (drawable == null) {
                drawable = this.k;
            }
            toolbar.b(drawable);
            return;
        }
        this.a.b((Drawable) null);
    }

    private final void a() {
        Drawable drawable;
        int i2 = this.c;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) == 0) {
            drawable = this.e;
        } else {
            drawable = this.f;
            if (drawable == null) {
                drawable = this.e;
            }
        }
        this.a.a(drawable);
    }
}
