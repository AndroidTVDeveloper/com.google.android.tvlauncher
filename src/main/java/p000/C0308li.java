package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p002v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.tvlauncher.R;

/* renamed from: li */
/* compiled from: PG */
public final class C0308li implements C0207hp {

    /* renamed from: a */
    public final Toolbar f9845a;

    /* renamed from: b */
    public CharSequence f9846b;

    /* renamed from: c */
    private int f9847c;

    /* renamed from: d */
    private View f9848d;

    /* renamed from: e */
    private Drawable f9849e;

    /* renamed from: f */
    private Drawable f9850f;

    /* renamed from: g */
    private Drawable f9851g;

    /* renamed from: h */
    private CharSequence f9852h;

    /* renamed from: i */
    private CharSequence f9853i;

    /* renamed from: j */
    private int f9854j = 0;

    /* renamed from: k */
    private final Drawable f9855k;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.support.v7.widget.Toolbar, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public C0308li(Toolbar toolbar) {
        Drawable drawable;
        this.f9845a = toolbar;
        this.f9846b = toolbar.f1151m;
        this.f9852h = toolbar.f1152n;
        this.f9851g = toolbar.mo955b();
        String str = null;
        C0298kz a = C0298kz.m7865a(toolbar.getContext(), null, C0128er.f9163a, R.attr.actionBarStyle);
        this.f9855k = a.mo5512a(15);
        CharSequence b = a.mo5516b(27);
        if (!TextUtils.isEmpty(b)) {
            this.f9846b = b;
            if ((this.f9847c & 8) != 0) {
                this.f9845a.mo954a(b);
            }
        }
        CharSequence b2 = a.mo5516b(25);
        if (!TextUtils.isEmpty(b2)) {
            this.f9852h = b2;
            if ((this.f9847c & 8) != 0) {
                this.f9845a.mo957b(b2);
            }
        }
        Drawable a2 = a.mo5512a(20);
        if (a2 != null) {
            this.f9850f = a2;
            m7887a();
        }
        Drawable a3 = a.mo5512a(17);
        if (a3 != null) {
            this.f9849e = a3;
            m7887a();
        }
        if (this.f9851g == null && (drawable = this.f9855k) != null) {
            this.f9851g = drawable;
            m7889b();
        }
        m7888a(a.mo5511a(10, 0));
        int e = a.mo5521e(9, 0);
        if (e != 0) {
            View inflate = LayoutInflater.from(this.f9845a.getContext()).inflate(e, (ViewGroup) this.f9845a, false);
            View view = this.f9848d;
            if (!(view == null || (this.f9847c & 16) == 0)) {
                this.f9845a.removeView(view);
            }
            this.f9848d = inflate;
            if (!(inflate == null || (this.f9847c & 16) == 0)) {
                this.f9845a.addView(inflate);
            }
            m7888a(this.f9847c | 16);
        }
        int f = a.mo5523f(13);
        if (f > 0) {
            ViewGroup.LayoutParams layoutParams = this.f9845a.getLayoutParams();
            layoutParams.height = f;
            this.f9845a.setLayoutParams(layoutParams);
        }
        int c = a.mo5517c(7, -1);
        int c2 = a.mo5517c(3, -1);
        if (c >= 0 || c2 >= 0) {
            Toolbar toolbar2 = this.f9845a;
            int max = Math.max(c, 0);
            int max2 = Math.max(c2, 0);
            toolbar2.mo961d();
            toolbar2.f1150l.mo5504a(max, max2);
        }
        int e2 = a.mo5521e(28, 0);
        if (e2 != 0) {
            Toolbar toolbar3 = this.f9845a;
            Context context = toolbar3.getContext();
            toolbar3.f1147i = e2;
            TextView textView = toolbar3.f1140b;
            if (textView != null) {
                textView.setTextAppearance(context, e2);
            }
        }
        int e3 = a.mo5521e(26, 0);
        if (e3 != 0) {
            Toolbar toolbar4 = this.f9845a;
            Context context2 = toolbar4.getContext();
            toolbar4.f1148j = e3;
            TextView textView2 = toolbar4.f1141c;
            if (textView2 != null) {
                textView2.setTextAppearance(context2, e3);
            }
        }
        int e4 = a.mo5521e(22, 0);
        if (e4 != 0) {
            this.f9845a.mo952a(e4);
        }
        a.mo5513a();
        if (this.f9854j != R.string.abc_action_bar_up_description) {
            this.f9854j = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(this.f9845a.mo951a())) {
                int i = this.f9854j;
                this.f9853i = i != 0 ? this.f9845a.getContext().getString(i) : str;
                m7890c();
            }
        }
        this.f9853i = this.f9845a.mo951a();
        Toolbar toolbar5 = this.f9845a;
        C0307lh lhVar = new C0307lh(this);
        toolbar5.mo958c();
        toolbar5.f1142d.setOnClickListener(lhVar);
    }

    /* renamed from: a */
    private final void m7888a(int i) {
        View view;
        int i2 = this.f9847c ^ i;
        this.f9847c = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m7890c();
                }
                m7889b();
            }
            if ((i2 & 3) != 0) {
                m7887a();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f9845a.mo954a(this.f9846b);
                    this.f9845a.mo957b(this.f9852h);
                } else {
                    this.f9845a.mo954a((CharSequence) null);
                    this.f9845a.mo957b((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && (view = this.f9848d) != null) {
                if ((i & 16) == 0) {
                    this.f9845a.removeView(view);
                } else {
                    this.f9845a.addView(view);
                }
            }
        }
    }

    /* renamed from: c */
    private final void m7890c() {
        if ((this.f9847c & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f9853i)) {
            Toolbar toolbar = this.f9845a;
            int i = this.f9854j;
            toolbar.mo959c(i != 0 ? toolbar.getContext().getText(i) : null);
            return;
        }
        this.f9845a.mo959c(this.f9853i);
    }

    /* renamed from: b */
    private final void m7889b() {
        if ((this.f9847c & 4) != 0) {
            Toolbar toolbar = this.f9845a;
            Drawable drawable = this.f9851g;
            if (drawable == null) {
                drawable = this.f9855k;
            }
            toolbar.mo956b(drawable);
            return;
        }
        this.f9845a.mo956b((Drawable) null);
    }

    /* renamed from: a */
    private final void m7887a() {
        Drawable drawable;
        int i = this.f9847c;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0) {
            drawable = this.f9849e;
        } else {
            drawable = this.f9850f;
            if (drawable == null) {
                drawable = this.f9849e;
            }
        }
        this.f9845a.mo953a(drawable);
    }
}
