package p000;

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

/* renamed from: gb */
/* compiled from: PG */
final class C0166gb extends C0155fr implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener, C0159fv {

    /* renamed from: a */
    public final C0249jd f9369a;

    /* renamed from: b */
    public final ViewTreeObserver.OnGlobalLayoutListener f9370b = new C0163fz(this);

    /* renamed from: c */
    public View f9371c;

    /* renamed from: d */
    public ViewTreeObserver f9372d;

    /* renamed from: e */
    private final Context f9373e;

    /* renamed from: f */
    private final C0152fo f9374f;

    /* renamed from: h */
    private final C0150fm f9375h;

    /* renamed from: i */
    private final boolean f9376i;

    /* renamed from: j */
    private final int f9377j;

    /* renamed from: k */
    private final int f9378k;

    /* renamed from: l */
    private final View.OnAttachStateChangeListener f9379l = new C0165ga(this);

    /* renamed from: m */
    private PopupWindow.OnDismissListener f9380m;

    /* renamed from: n */
    private View f9381n;

    /* renamed from: o */
    private C0158fu f9382o;

    /* renamed from: p */
    private boolean f9383p;

    /* renamed from: q */
    private boolean f9384q;

    /* renamed from: r */
    private int f9385r;

    /* renamed from: s */
    private int f9386s = 0;

    /* renamed from: t */
    private boolean f9387t;

    public C0166gb(Context context, C0152fo foVar, View view, int i, boolean z) {
        this.f9373e = context;
        this.f9374f = foVar;
        this.f9376i = z;
        this.f9375h = new C0150fm(foVar, LayoutInflater.from(context), this.f9376i, R.layout.abc_popup_menu_item_layout);
        this.f9378k = i;
        Resources resources = context.getResources();
        this.f9377j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f9381n = view;
        this.f9369a = new C0249jd(this.f9373e, this.f9378k);
        foVar.mo4862a(this, context);
    }

    /* renamed from: a */
    public final void mo4843a(C0152fo foVar) {
    }

    /* renamed from: a */
    public final boolean mo4830a() {
        return false;
    }

    /* renamed from: f */
    public final ListView mo4851f() {
        return this.f9369a.f9661a;
    }

    /* renamed from: d */
    public final void mo4849d() {
        if (mo4850e()) {
            this.f9369a.mo4849d();
        }
    }

    /* renamed from: e */
    public final boolean mo4850e() {
        return !this.f9383p && this.f9369a.mo4850e();
    }

    /* renamed from: a */
    public final void mo4828a(C0152fo foVar, boolean z) {
        if (foVar == this.f9374f) {
            mo4849d();
            C0158fu fuVar = this.f9382o;
            if (fuVar != null) {
                fuVar.mo5036a(foVar);
            }
        }
    }

    public final void onDismiss() {
        this.f9383p = true;
        this.f9374f.close();
        ViewTreeObserver viewTreeObserver = this.f9372d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f9372d = this.f9371c.getViewTreeObserver();
            }
            this.f9372d.removeGlobalOnLayoutListener(this.f9370b);
            this.f9372d = null;
        }
        this.f9371c.removeOnAttachStateChangeListener(this.f9379l);
        PopupWindow.OnDismissListener onDismissListener = this.f9380m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        mo4849d();
        return true;
    }

    /* renamed from: a */
    public final boolean mo4832a(C0167gc gcVar) {
        int i;
        if (gcVar.hasVisibleItems()) {
            C0157ft ftVar = new C0157ft(this.f9373e, gcVar, this.f9371c, this.f9376i, this.f9378k);
            ftVar.mo5030a(this.f9382o);
            ftVar.mo5031a(C0155fr.m7359b(gcVar));
            ftVar.f9355c = this.f9380m;
            this.f9380m = null;
            this.f9374f.mo4863a(false);
            C0249jd jdVar = this.f9369a;
            int i2 = jdVar.f9662b;
            if (jdVar.f9664d) {
                i = jdVar.f9663c;
            } else {
                i = 0;
            }
            if ((Gravity.getAbsoluteGravity(this.f9386s, C0107dx.m7209f(this.f9381n)) & 7) == 5) {
                i2 += this.f9381n.getWidth();
            }
            if (!ftVar.mo5035e()) {
                if (ftVar.f9353a != null) {
                    ftVar.mo5029a(i2, i, true, true);
                }
            }
            C0158fu fuVar = this.f9382o;
            if (fuVar != null) {
                fuVar.mo5037b(gcVar);
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo4841a(View view) {
        this.f9381n = view;
    }

    /* renamed from: a */
    public final void mo4829a(C0158fu fuVar) {
        this.f9382o = fuVar;
    }

    /* renamed from: a */
    public final void mo4844a(boolean z) {
        this.f9375h.f9297b = z;
    }

    /* renamed from: a */
    public final void mo4840a(int i) {
        this.f9386s = i;
    }

    /* renamed from: b */
    public final void mo4845b(int i) {
        this.f9369a.f9662b = i;
    }

    /* renamed from: a */
    public final void mo4842a(PopupWindow.OnDismissListener onDismissListener) {
        this.f9380m = onDismissListener;
    }

    /* renamed from: b */
    public final void mo4846b(boolean z) {
        this.f9387t = z;
    }

    /* renamed from: c */
    public final void mo4848c(int i) {
        this.f9369a.mo5285a(i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, ie, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: c */
    public final void mo4847c() {
        View view;
        if (mo4850e()) {
            return;
        }
        if (this.f9383p || (view = this.f9381n) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f9371c = view;
        this.f9369a.mo5288a(this);
        C0249jd jdVar = this.f9369a;
        jdVar.f9670j = this;
        jdVar.mo5292h();
        View view2 = this.f9371c;
        ViewTreeObserver viewTreeObserver = this.f9372d;
        ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
        this.f9372d = viewTreeObserver2;
        if (viewTreeObserver == null) {
            viewTreeObserver2.addOnGlobalLayoutListener(this.f9370b);
        }
        view2.addOnAttachStateChangeListener(this.f9379l);
        C0249jd jdVar2 = this.f9369a;
        jdVar2.f9669i = view2;
        jdVar2.f9667g = this.f9386s;
        if (!this.f9384q) {
            this.f9385r = m7357a(this.f9375h, this.f9373e, this.f9377j);
            this.f9384q = true;
        }
        this.f9369a.mo5289b(this.f9385r);
        this.f9369a.mo5291g();
        this.f9369a.mo5286a(this.f9351g);
        this.f9369a.mo4847c();
        C0223ie ieVar = this.f9369a.f9661a;
        ieVar.setOnKeyListener(this);
        if (this.f9387t && this.f9374f.f9307e != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f9373e).inflate((int) R.layout.abc_popup_menu_header_item_layout, (ViewGroup) ieVar, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f9374f.f9307e);
            }
            frameLayout.setEnabled(false);
            ieVar.addHeaderView(frameLayout, null, false);
        }
        this.f9369a.mo5287a(this.f9375h);
        this.f9369a.mo4847c();
    }

    /* renamed from: b */
    public final void mo4833b() {
        this.f9384q = false;
        C0150fm fmVar = this.f9375h;
        if (fmVar != null) {
            fmVar.notifyDataSetChanged();
        }
    }
}
