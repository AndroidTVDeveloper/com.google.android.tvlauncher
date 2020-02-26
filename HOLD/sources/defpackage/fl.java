package defpackage;

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

/* renamed from: fl  reason: default package */
/* compiled from: PG */
public final class fl extends fr implements View.OnKeyListener, PopupWindow.OnDismissListener, fv {
    public final Handler a;
    public final List b = new ArrayList();
    public final ViewTreeObserver.OnGlobalLayoutListener c = new fg(this);
    public View d;
    public ViewTreeObserver e;
    public boolean f;
    private final Context h;
    private final int i;
    private final int j;
    private final boolean k;
    private final List l = new ArrayList();
    private final View.OnAttachStateChangeListener m = new fh(this);
    private final jb n = new fj(this);
    private int o = 0;
    private int p = 0;
    private View q;
    private int r;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private fu y;
    private PopupWindow.OnDismissListener z;

    public fl(Context context, View view, int i2, boolean z2) {
        this.h = context;
        this.q = view;
        this.j = i2;
        this.k = z2;
        this.w = false;
        this.r = h();
        Resources resources = context.getResources();
        this.i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.a = new Handler();
    }

    public final boolean a() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean g() {
        return false;
    }

    public final void a(fo foVar) {
        foVar.a(this, this.h);
        if (!e()) {
            this.l.add(foVar);
        } else {
            c(foVar);
        }
    }

    public final void d() {
        int size = this.b.size();
        if (size > 0) {
            fk[] fkVarArr = (fk[]) this.b.toArray(new fk[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                fk fkVar = fkVarArr[i2];
                if (fkVar.a.e()) {
                    fkVar.a.d();
                }
            }
        }
    }

    private final int h() {
        return dx.f(this.q) == 1 ? 0 : 1;
    }

    public final ListView f() {
        if (this.b.isEmpty()) {
            return null;
        }
        List list = this.b;
        return ((fk) list.get(list.size() - 1)).a();
    }

    public final boolean e() {
        return this.b.size() > 0 && ((fk) this.b.get(0)).a.e();
    }

    public final void a(fo foVar, boolean z2) {
        int size = this.b.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (foVar == ((fk) this.b.get(i2)).b) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 >= 0) {
            int i3 = i2 + 1;
            if (i3 < this.b.size()) {
                ((fk) this.b.get(i3)).b.a(false);
            }
            fk fkVar = (fk) this.b.remove(i2);
            fo foVar2 = fkVar.b;
            Iterator it = foVar2.f.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                fv fvVar = (fv) weakReference.get();
                if (fvVar == null || fvVar == this) {
                    foVar2.f.remove(weakReference);
                }
            }
            if (this.f) {
                jd jdVar = fkVar.a;
                int i4 = Build.VERSION.SDK_INT;
                jdVar.n.setExitTransition(null);
                fkVar.a.n.setAnimationStyle(0);
            }
            fkVar.a.d();
            int size2 = this.b.size();
            if (size2 > 0) {
                this.r = ((fk) this.b.get(size2 - 1)).c;
            } else {
                this.r = h();
            }
            if (size2 == 0) {
                d();
                fu fuVar = this.y;
                if (fuVar != null) {
                    fuVar.a(foVar);
                }
                ViewTreeObserver viewTreeObserver = this.e;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.e.removeGlobalOnLayoutListener(this.c);
                    }
                    this.e = null;
                }
                this.d.removeOnAttachStateChangeListener(this.m);
                this.z.onDismiss();
            } else if (z2) {
                ((fk) this.b.get(0)).b.a(false);
            }
        }
    }

    public final void onDismiss() {
        fk fkVar;
        int size = this.b.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                fkVar = null;
                break;
            }
            fkVar = (fk) this.b.get(i2);
            if (!fkVar.a.e()) {
                break;
            }
            i2++;
        }
        if (fkVar != null) {
            fkVar.b.a(false);
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
        List list = this.b;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            fk fkVar = (fk) list.get(i2);
            i2++;
            if (gcVar == fkVar.b) {
                fkVar.a().requestFocus();
                return true;
            }
        }
        if (!gcVar.hasVisibleItems()) {
            return false;
        }
        a((fo) gcVar);
        fu fuVar = this.y;
        if (fuVar != null) {
            fuVar.b(gcVar);
        }
        return true;
    }

    public final void a(View view) {
        if (this.q != view) {
            this.q = view;
            this.p = el.a(this.o, dx.f(view));
        }
    }

    public final void a(fu fuVar) {
        this.y = fuVar;
    }

    public final void a(boolean z2) {
        this.w = z2;
    }

    public final void a(int i2) {
        if (this.o != i2) {
            this.o = i2;
            this.p = el.a(i2, dx.f(this.q));
        }
    }

    public final void b(int i2) {
        this.s = true;
        this.u = i2;
    }

    public final void a(PopupWindow.OnDismissListener onDismissListener) {
        this.z = onDismissListener;
    }

    public final void b(boolean z2) {
        this.x = z2;
    }

    public final void c(int i2) {
        this.t = true;
        this.v = i2;
    }

    public final void c() {
        if (!e()) {
            List list = this.l;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                c((fo) list.get(i2));
            }
            this.l.clear();
            View view = this.q;
            this.d = view;
            if (view != null) {
                ViewTreeObserver viewTreeObserver = this.e;
                ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
                this.e = viewTreeObserver2;
                if (viewTreeObserver == null) {
                    viewTreeObserver2.addOnGlobalLayoutListener(this.c);
                }
                this.d.addOnAttachStateChangeListener(this.m);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, ie, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    private final void c(fo foVar) {
        fk fkVar;
        View view;
        int i2;
        MenuItem menuItem;
        int i3;
        fm fmVar;
        int firstVisiblePosition;
        fo foVar2 = foVar;
        LayoutInflater from = LayoutInflater.from(this.h);
        fm fmVar2 = new fm(foVar2, from, this.k, R.layout.abc_cascading_menu_item_layout);
        if (!e() && this.w) {
            fmVar2.b = true;
        } else if (e()) {
            fmVar2.b = fr.b(foVar);
        }
        int a2 = a(fmVar2, this.h, this.i);
        jd jdVar = new jd(this.h, this.j);
        jdVar.p = this.n;
        jdVar.j = this;
        jdVar.a(this);
        jdVar.i = this.q;
        jdVar.g = this.p;
        jdVar.h();
        jdVar.g();
        jdVar.a(fmVar2);
        jdVar.b(a2);
        jdVar.g = this.p;
        if (this.b.size() > 0) {
            List list = this.b;
            fk fkVar2 = (fk) list.get(list.size() - 1);
            fo foVar3 = fkVar2.b;
            int size = foVar3.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = foVar3.getItem(i4);
                if (menuItem.hasSubMenu() && foVar2 == menuItem.getSubMenu()) {
                    break;
                }
                i4++;
            }
            if (menuItem != null) {
                ListView a3 = fkVar2.a();
                ListAdapter adapter = a3.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i3 = headerViewListAdapter.getHeadersCount();
                    fmVar = (fm) headerViewListAdapter.getWrappedAdapter();
                } else {
                    fmVar = (fm) adapter;
                    i3 = 0;
                }
                int count = fmVar.getCount();
                int i5 = 0;
                while (true) {
                    if (i5 < count) {
                        if (menuItem == fmVar.getItem(i5)) {
                            break;
                        }
                        i5++;
                    } else {
                        i5 = -1;
                        break;
                    }
                }
                if (i5 != -1 && (firstVisiblePosition = (i5 + i3) - a3.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a3.getChildCount()) {
                    view = a3.getChildAt(firstVisiblePosition);
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
                jdVar.n.setTouchModal(false);
            } else if (jd.o != null) {
                try {
                    jd.o.invoke(jdVar.n, false);
                } catch (Exception e2) {
                }
            }
            int i6 = Build.VERSION.SDK_INT;
            jdVar.n.setEnterTransition(null);
            List list2 = this.b;
            ListView a4 = ((fk) list2.get(list2.size() - 1)).a();
            int[] iArr = new int[2];
            a4.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.d.getWindowVisibleDisplayFrame(rect);
            if (this.r != 1 ? iArr[0] - a2 < 0 : iArr[0] + a4.getWidth() + a2 <= rect.right) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.r = i2;
            int i7 = Build.VERSION.SDK_INT;
            jdVar.i = view;
            if ((this.p & 5) != 5) {
                if (i2 != 1) {
                    a2 = -a2;
                } else {
                    a2 = view.getWidth();
                }
            } else if (i2 != 1) {
                a2 = -view.getWidth();
            }
            jdVar.b = a2;
            jdVar.f = true;
            jdVar.e = true;
            jdVar.a(0);
        } else {
            if (this.s) {
                jdVar.b = this.u;
            }
            if (this.t) {
                jdVar.a(this.v);
            }
            jdVar.a(this.g);
        }
        this.b.add(new fk(jdVar, foVar2, this.r));
        jdVar.c();
        ie ieVar = jdVar.a;
        ieVar.setOnKeyListener(this);
        if (fkVar == null && this.x && foVar2.e != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate((int) R.layout.abc_popup_menu_header_item_layout, (ViewGroup) ieVar, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(foVar2.e);
            ieVar.addHeaderView(frameLayout, null, false);
            jdVar.c();
        }
    }

    public final void b() {
        List list = this.b;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            a(((fk) list.get(i2)).a().getAdapter()).notifyDataSetChanged();
        }
    }
}
