package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.tvlauncher.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: fl */
/* compiled from: PG */
public final class C0149fl extends C0155fr implements View.OnKeyListener, PopupWindow.OnDismissListener, C0159fv {

    /* renamed from: a */
    public final Handler f9271a;

    /* renamed from: b */
    public final List f9272b = new ArrayList();

    /* renamed from: c */
    public final ViewTreeObserver.OnGlobalLayoutListener f9273c = new C0144fg(this);

    /* renamed from: d */
    public View f9274d;

    /* renamed from: e */
    public ViewTreeObserver f9275e;

    /* renamed from: f */
    public boolean f9276f;

    /* renamed from: h */
    private final Context f9277h;

    /* renamed from: i */
    private final int f9278i;

    /* renamed from: j */
    private final int f9279j;

    /* renamed from: k */
    private final boolean f9280k;

    /* renamed from: l */
    private final List f9281l = new ArrayList();

    /* renamed from: m */
    private final View.OnAttachStateChangeListener f9282m = new C0145fh(this);

    /* renamed from: n */
    private final C0247jb f9283n = new C0147fj(this);

    /* renamed from: o */
    private int f9284o = 0;

    /* renamed from: p */
    private int f9285p = 0;

    /* renamed from: q */
    private View f9286q;

    /* renamed from: r */
    private int f9287r;

    /* renamed from: s */
    private boolean f9288s;

    /* renamed from: t */
    private boolean f9289t;

    /* renamed from: u */
    private int f9290u;

    /* renamed from: v */
    private int f9291v;

    /* renamed from: w */
    private boolean f9292w;

    /* renamed from: x */
    private boolean f9293x;

    /* renamed from: y */
    private C0158fu f9294y;

    /* renamed from: z */
    private PopupWindow.OnDismissListener f9295z;

    public C0149fl(Context context, View view, int i, boolean z) {
        this.f9277h = context;
        this.f9286q = view;
        this.f9279j = i;
        this.f9280k = z;
        this.f9292w = false;
        this.f9287r = m7290h();
        Resources resources = context.getResources();
        this.f9278i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f9271a = new Handler();
    }

    /* renamed from: a */
    public final boolean mo4830a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo4852g() {
        return false;
    }

    /* renamed from: a */
    public final void mo4843a(C0152fo foVar) {
        foVar.mo4862a(this, this.f9277h);
        if (!mo4850e()) {
            this.f9281l.add(foVar);
        } else {
            m7289c(foVar);
        }
    }

    /* renamed from: d */
    public final void mo4849d() {
        int size = this.f9272b.size();
        if (size > 0) {
            C0148fk[] fkVarArr = (C0148fk[]) this.f9272b.toArray(new C0148fk[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0148fk fkVar = fkVarArr[i];
                if (fkVar.f9268a.mo4850e()) {
                    fkVar.f9268a.mo4849d();
                }
            }
        }
    }

    /* renamed from: h */
    private final int m7290h() {
        return C0107dx.m7209f(this.f9286q) == 1 ? 0 : 1;
    }

    /* renamed from: f */
    public final ListView mo4851f() {
        if (this.f9272b.isEmpty()) {
            return null;
        }
        List list = this.f9272b;
        return ((C0148fk) list.get(list.size() - 1)).mo4839a();
    }

    /* renamed from: e */
    public final boolean mo4850e() {
        return this.f9272b.size() > 0 && ((C0148fk) this.f9272b.get(0)).f9268a.mo4850e();
    }

    /* renamed from: a */
    public final void mo4828a(C0152fo foVar, boolean z) {
        int size = this.f9272b.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (foVar == ((C0148fk) this.f9272b.get(i)).f9269b) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i >= 0) {
            int i2 = i + 1;
            if (i2 < this.f9272b.size()) {
                ((C0148fk) this.f9272b.get(i2)).f9269b.mo4863a(false);
            }
            C0148fk fkVar = (C0148fk) this.f9272b.remove(i);
            C0152fo foVar2 = fkVar.f9269b;
            Iterator it = foVar2.f9308f.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0159fv fvVar = (C0159fv) weakReference.get();
                if (fvVar == null || fvVar == this) {
                    foVar2.f9308f.remove(weakReference);
                }
            }
            if (this.f9276f) {
                C0249jd jdVar = fkVar.f9268a;
                int i3 = Build.VERSION.SDK_INT;
                jdVar.f9674n.setExitTransition(null);
                fkVar.f9268a.f9674n.setAnimationStyle(0);
            }
            fkVar.f9268a.mo4849d();
            int size2 = this.f9272b.size();
            if (size2 > 0) {
                this.f9287r = ((C0148fk) this.f9272b.get(size2 - 1)).f9270c;
            } else {
                this.f9287r = m7290h();
            }
            if (size2 == 0) {
                mo4849d();
                C0158fu fuVar = this.f9294y;
                if (fuVar != null) {
                    fuVar.mo5036a(foVar);
                }
                ViewTreeObserver viewTreeObserver = this.f9275e;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f9275e.removeGlobalOnLayoutListener(this.f9273c);
                    }
                    this.f9275e = null;
                }
                this.f9274d.removeOnAttachStateChangeListener(this.f9282m);
                this.f9295z.onDismiss();
            } else if (z) {
                ((C0148fk) this.f9272b.get(0)).f9269b.mo4863a(false);
            }
        }
    }

    public final void onDismiss() {
        C0148fk fkVar;
        int size = this.f9272b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                fkVar = null;
                break;
            }
            fkVar = (C0148fk) this.f9272b.get(i);
            if (!fkVar.f9268a.mo4850e()) {
                break;
            }
            i++;
        }
        if (fkVar != null) {
            fkVar.f9269b.mo4863a(false);
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
        List list = this.f9272b;
        int size = list.size();
        int i = 0;
        while (i < size) {
            C0148fk fkVar = (C0148fk) list.get(i);
            i++;
            if (gcVar == fkVar.f9269b) {
                fkVar.mo4839a().requestFocus();
                return true;
            }
        }
        if (!gcVar.hasVisibleItems()) {
            return false;
        }
        mo4843a((C0152fo) gcVar);
        C0158fu fuVar = this.f9294y;
        if (fuVar != null) {
            fuVar.mo5037b(gcVar);
        }
        return true;
    }

    /* renamed from: a */
    public final void mo4841a(View view) {
        if (this.f9286q != view) {
            this.f9286q = view;
            this.f9285p = C0122el.m7244a(this.f9284o, C0107dx.m7209f(view));
        }
    }

    /* renamed from: a */
    public final void mo4829a(C0158fu fuVar) {
        this.f9294y = fuVar;
    }

    /* renamed from: a */
    public final void mo4844a(boolean z) {
        this.f9292w = z;
    }

    /* renamed from: a */
    public final void mo4840a(int i) {
        if (this.f9284o != i) {
            this.f9284o = i;
            this.f9285p = C0122el.m7244a(i, C0107dx.m7209f(this.f9286q));
        }
    }

    /* renamed from: b */
    public final void mo4845b(int i) {
        this.f9288s = true;
        this.f9290u = i;
    }

    /* renamed from: a */
    public final void mo4842a(PopupWindow.OnDismissListener onDismissListener) {
        this.f9295z = onDismissListener;
    }

    /* renamed from: b */
    public final void mo4846b(boolean z) {
        this.f9293x = z;
    }

    /* renamed from: c */
    public final void mo4848c(int i) {
        this.f9289t = true;
        this.f9291v = i;
    }

    /* renamed from: c */
    public final void mo4847c() {
        if (!mo4850e()) {
            List list = this.f9281l;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                m7289c((C0152fo) list.get(i));
            }
            this.f9281l.clear();
            View view = this.f9286q;
            this.f9274d = view;
            if (view != null) {
                ViewTreeObserver viewTreeObserver = this.f9275e;
                ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
                this.f9275e = viewTreeObserver2;
                if (viewTreeObserver == null) {
                    viewTreeObserver2.addOnGlobalLayoutListener(this.f9273c);
                }
                this.f9274d.addOnAttachStateChangeListener(this.f9282m);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, ie, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: c */
    private final void m7289c(C0152fo foVar) {
        C0148fk fkVar;
        View view;
        int i;
        MenuItem menuItem;
        int i2;
        C0150fm fmVar;
        int firstVisiblePosition;
        C0152fo foVar2 = foVar;
        LayoutInflater from = LayoutInflater.from(this.f9277h);
        C0150fm fmVar2 = new C0150fm(foVar2, from, this.f9280k, R.layout.abc_cascading_menu_item_layout);
        if (!mo4850e() && this.f9292w) {
            fmVar2.f9297b = true;
        } else if (mo4850e()) {
            fmVar2.f9297b = C0155fr.m7359b(foVar);
        }
        int a = m7357a(fmVar2, this.f9277h, this.f9278i);
        C0249jd jdVar = new C0249jd(this.f9277h, this.f9279j);
        jdVar.f9690p = this.f9283n;
        jdVar.f9670j = this;
        jdVar.mo5288a(this);
        jdVar.f9669i = this.f9286q;
        jdVar.f9667g = this.f9285p;
        jdVar.mo5292h();
        jdVar.mo5291g();
        jdVar.mo5287a(fmVar2);
        jdVar.mo5289b(a);
        jdVar.f9667g = this.f9285p;
        if (this.f9272b.size() > 0) {
            List list = this.f9272b;
            C0148fk fkVar2 = (C0148fk) list.get(list.size() - 1);
            C0152fo foVar3 = fkVar2.f9269b;
            int size = foVar3.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = foVar3.getItem(i3);
                if (menuItem.hasSubMenu() && foVar2 == menuItem.getSubMenu()) {
                    break;
                }
                i3++;
            }
            if (menuItem != null) {
                ListView a2 = fkVar2.mo4839a();
                ListAdapter adapter = a2.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i2 = headerViewListAdapter.getHeadersCount();
                    fmVar = (C0150fm) headerViewListAdapter.getWrappedAdapter();
                } else {
                    fmVar = (C0150fm) adapter;
                    i2 = 0;
                }
                int count = fmVar.getCount();
                int i4 = 0;
                while (true) {
                    if (i4 < count) {
                        if (menuItem == fmVar.getItem(i4)) {
                            break;
                        }
                        i4++;
                    } else {
                        i4 = -1;
                        break;
                    }
                }
                if (i4 != -1 && (firstVisiblePosition = (i4 + i2) - a2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a2.getChildCount()) {
                    view = a2.getChildAt(firstVisiblePosition);
                    fkVar = fkVar2;
                }
            }
            view = null;
            fkVar = fkVar2;
        } else {
            view = null;
            fkVar = null;
        }
        if (view != null) {
            if (Build.VERSION.SDK_INT > 28) {
                jdVar.f9674n.setTouchModal(false);
            } else if (C0249jd.f9689o != null) {
                try {
                    C0249jd.f9689o.invoke(jdVar.f9674n, false);
                } catch (Exception e) {
                }
            }
            int i5 = Build.VERSION.SDK_INT;
            jdVar.f9674n.setEnterTransition(null);
            List list2 = this.f9272b;
            ListView a3 = ((C0148fk) list2.get(list2.size() - 1)).mo4839a();
            int[] iArr = new int[2];
            a3.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.f9274d.getWindowVisibleDisplayFrame(rect);
            if (this.f9287r != 1 ? iArr[0] - a < 0 : iArr[0] + a3.getWidth() + a <= rect.right) {
                i = 1;
            } else {
                i = 0;
            }
            this.f9287r = i;
            int i6 = Build.VERSION.SDK_INT;
            jdVar.f9669i = view;
            if ((this.f9285p & 5) != 5) {
                if (i != 1) {
                    a = -a;
                } else {
                    a = view.getWidth();
                }
            } else if (i != 1) {
                a = -view.getWidth();
            }
            jdVar.f9662b = a;
            jdVar.f9666f = true;
            jdVar.f9665e = true;
            jdVar.mo5285a(0);
        } else {
            if (this.f9288s) {
                jdVar.f9662b = this.f9290u;
            }
            if (this.f9289t) {
                jdVar.mo5285a(this.f9291v);
            }
            jdVar.mo5286a(this.f9351g);
        }
        this.f9272b.add(new C0148fk(jdVar, foVar2, this.f9287r));
        jdVar.mo4847c();
        C0223ie ieVar = jdVar.f9661a;
        ieVar.setOnKeyListener(this);
        if (fkVar == null && this.f9293x && foVar2.f9307e != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate((int) R.layout.abc_popup_menu_header_item_layout, (ViewGroup) ieVar, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(foVar2.f9307e);
            ieVar.addHeaderView(frameLayout, null, false);
            jdVar.mo4847c();
        }
    }

    /* renamed from: b */
    public final void mo4833b() {
        List list = this.f9272b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m7358a(((C0148fk) list.get(i)).mo4839a().getAdapter()).notifyDataSetChanged();
        }
    }
}
