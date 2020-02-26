package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.support.p002v7.view.menu.ActionMenuItemView;
import android.support.p002v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.tvlauncher.R;
import java.util.ArrayList;

/* renamed from: gp */
/* compiled from: PG */
public final class C0180gp extends C0143ff {

    /* renamed from: g */
    public C0177gm f9404g;

    /* renamed from: h */
    public boolean f9405h;

    /* renamed from: i */
    public boolean f9406i;

    /* renamed from: j */
    public boolean f9407j;

    /* renamed from: k */
    public C0178gn f9408k;

    /* renamed from: l */
    public C0174gj f9409l;

    /* renamed from: m */
    public C0175gk f9410m;

    /* renamed from: n */
    public final C0179go f9411n = new C0179go(this);

    /* renamed from: o */
    public int f9412o;

    /* renamed from: p */
    private int f9413p;

    /* renamed from: q */
    private int f9414q;

    /* renamed from: r */
    private int f9415r;

    /* renamed from: s */
    private final SparseBooleanArray f9416s = new SparseBooleanArray();

    /* renamed from: t */
    private C0142fe f9417t;

    public C0180gp(Context context) {
        super(context);
    }

    /* renamed from: d */
    public final void mo5072d() {
        mo5074f();
        C0174gj gjVar = this.f9409l;
        if (gjVar != null) {
            gjVar.mo5033c();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo4830a() {
        /*
            r18 = this;
            r0 = r18
            fo r1 = r0.f9257c
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x0011
            java.util.ArrayList r1 = r1.mo4887f()
            int r4 = r1.size()
            goto L_0x0014
        L_0x0011:
            r1 = r2
            r4 = 0
        L_0x0014:
            int r5 = r0.f9415r
            int r6 = r0.f9414q
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            fx r8 = r0.f9260f
            r12 = r5
            r5 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0023:
            r13 = 1
            if (r5 < r4) goto L_0x00fa
            boolean r5 = r0.f9405h
            if (r5 != 0) goto L_0x002b
            goto L_0x0034
        L_0x002b:
            if (r11 == 0) goto L_0x002e
        L_0x002d:
            goto L_0x0032
        L_0x002e:
            int r10 = r10 + r9
            if (r10 <= r12) goto L_0x0034
            goto L_0x002d
        L_0x0032:
            int r12 = r12 + -1
        L_0x0034:
            int r12 = r12 - r9
            android.util.SparseBooleanArray r5 = r0.f9416s
            r5.clear()
            r9 = r6
            r6 = 0
            r10 = 0
        L_0x003d:
            if (r6 >= r4) goto L_0x00f8
            java.lang.Object r11 = r1.get(r6)
            fp r11 = (p000.C0153fp) r11
            boolean r14 = r11.mo4921g()
            if (r14 != 0) goto L_0x00cc
            boolean r14 = r11.mo4920f()
            if (r14 == 0) goto L_0x00c3
            int r14 = r11.f9326b
            boolean r15 = r5.get(r14)
            if (r12 > 0) goto L_0x005c
            if (r15 != 0) goto L_0x005c
            goto L_0x0061
        L_0x005c:
            if (r9 <= 0) goto L_0x0061
            r16 = 1
            goto L_0x0063
        L_0x0061:
            r16 = 0
        L_0x0063:
            if (r16 != 0) goto L_0x0068
            r3 = r16
            goto L_0x0082
        L_0x0068:
            r3 = r8
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r3 = r0.mo4826a(r11, r2, r3)
            r3.measure(r7, r7)
            int r3 = r3.getMeasuredWidth()
            int r9 = r9 - r3
            if (r10 != 0) goto L_0x007b
            r10 = r3
        L_0x007b:
            int r3 = r9 + r10
            if (r3 <= 0) goto L_0x0081
            r3 = 1
            goto L_0x0082
        L_0x0081:
            r3 = 0
        L_0x0082:
            if (r3 == 0) goto L_0x008c
            if (r14 != 0) goto L_0x0087
            goto L_0x008c
        L_0x0087:
            r5.put(r14, r13)
            goto L_0x00b4
        L_0x008c:
            if (r15 == 0) goto L_0x00b4
            r15 = 0
            r5.put(r14, r15)
            r15 = r12
            r12 = 0
        L_0x0094:
            if (r12 >= r6) goto L_0x00b5
            java.lang.Object r17 = r1.get(r12)
            r13 = r17
            fp r13 = (p000.C0153fp) r13
            int r2 = r13.f9326b
            if (r2 == r14) goto L_0x00a3
            goto L_0x00af
        L_0x00a3:
            boolean r2 = r13.mo4918e()
            if (r2 == 0) goto L_0x00ab
            int r15 = r15 + 1
        L_0x00ab:
            r2 = 0
            r13.mo4913c(r2)
        L_0x00af:
            int r12 = r12 + 1
            r2 = 0
            r13 = 1
            goto L_0x0094
        L_0x00b4:
            r15 = r12
        L_0x00b5:
            if (r3 != 0) goto L_0x00b8
            goto L_0x00bb
        L_0x00b8:
            int r15 = r15 + -1
        L_0x00bb:
            r11.mo4913c(r3)
            r12 = r15
            r2 = 0
            r13 = 0
            r14 = 1
            goto L_0x00f0
        L_0x00c3:
            r2 = 0
            r11.mo4913c(r2)
            r13 = 0
            r14 = 1
            goto L_0x00f0
        L_0x00cc:
            r2 = 0
            r3 = r8
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r13 = 0
            android.view.View r3 = r0.mo4826a(r11, r13, r3)
            r3.measure(r7, r7)
            int r3 = r3.getMeasuredWidth()
            int r9 = r9 - r3
            if (r10 != 0) goto L_0x00e0
            goto L_0x00e1
        L_0x00e0:
            r3 = r10
        L_0x00e1:
            int r10 = r11.f9326b
            if (r10 == 0) goto L_0x00ea
            r14 = 1
            r5.put(r10, r14)
            goto L_0x00eb
        L_0x00ea:
            r14 = 1
        L_0x00eb:
            r11.mo4913c(r14)
            r10 = r3
        L_0x00f0:
            int r6 = r6 + 1
            r2 = r13
            r3 = 0
            r13 = 1
            goto L_0x003d
        L_0x00f8:
            r14 = 1
            return r14
        L_0x00fa:
            r13 = r2
            r2 = 0
            r14 = 1
            java.lang.Object r3 = r1.get(r5)
            fp r3 = (p000.C0153fp) r3
            boolean r15 = r3.mo4921g()
            if (r15 == 0) goto L_0x010c
            int r9 = r9 + 1
            goto L_0x0117
        L_0x010c:
            boolean r15 = r3.mo4920f()
            if (r15 == 0) goto L_0x0116
            int r10 = r10 + 1
            goto L_0x0117
        L_0x0116:
            r11 = 1
        L_0x0117:
            boolean r14 = r0.f9407j
            if (r14 != 0) goto L_0x011c
        L_0x011b:
            goto L_0x0121
        L_0x011c:
            boolean r3 = r3.f9338n
            if (r3 == 0) goto L_0x011b
            r12 = 0
        L_0x0121:
            int r5 = r5 + 1
            r2 = r13
            r3 = 0
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0180gp.mo4830a():boolean");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [fx, fn] */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final View mo4826a(C0153fp fpVar, View view, ViewGroup viewGroup) {
        C0160fw fwVar;
        View actionView = fpVar.getActionView();
        int i = 0;
        if (actionView == null || fpVar.mo4941h()) {
            if (view instanceof C0160fw) {
                fwVar = (C0160fw) view;
            } else {
                fwVar = (C0160fw) this.f9258d.inflate((int) R.layout.abc_action_menu_item_layout, viewGroup, false);
            }
            fwVar.mo748a(fpVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) fwVar;
            actionMenuItemView.f952c = this.f9260f;
            if (this.f9417t == null) {
                this.f9417t = new C0142fe(this);
            }
            actionMenuItemView.f953d = this.f9417t;
            actionView = (View) fwVar;
        }
        if (fpVar.f9338n) {
            i = 8;
        }
        actionView.setVisibility(i);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!(layoutParams instanceof C0183gs)) {
            actionView.setLayoutParams(ActionMenuView.m1274b(layoutParams));
        }
        return actionView;
    }

    /* renamed from: f */
    public final void mo5074f() {
        C0161fx fxVar;
        C0175gk gkVar = this.f9410m;
        if (gkVar == null || (fxVar = this.f9260f) == null) {
            C0178gn gnVar = this.f9408k;
            if (gnVar != null) {
                gnVar.mo5033c();
                return;
            }
            return;
        }
        ((View) fxVar).removeCallbacks(gkVar);
        this.f9410m = null;
    }

    /* renamed from: a */
    public final void mo4827a(Context context, C0152fo foVar) {
        this.f9256b = context;
        LayoutInflater.from(this.f9256b);
        this.f9257c = foVar;
        Resources resources = context.getResources();
        C0133ew ewVar = new C0133ew(context);
        if (!this.f9406i) {
            int i = Build.VERSION.SDK_INT;
            this.f9405h = true;
        }
        int i2 = 2;
        this.f9413p = ewVar.f9187a.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = ewVar.f9187a.getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i3 > 600) {
            i2 = 5;
        } else if (i3 >= 500 || (i3 > 480 && i4 > 640)) {
            i2 = 4;
        } else if (i3 >= 360) {
            i2 = 3;
        }
        this.f9415r = i2;
        int i5 = this.f9413p;
        if (!this.f9405h) {
            this.f9404g = null;
        } else {
            if (this.f9404g == null) {
                this.f9404g = new C0177gm(this, this.f9255a);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f9404g.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i5 -= this.f9404g.getMeasuredWidth();
        }
        this.f9414q = i5;
        float f = resources.getDisplayMetrics().density;
    }

    /* renamed from: c */
    public final boolean mo5071c() {
        C0178gn gnVar = this.f9408k;
        return gnVar != null && gnVar.mo5035e();
    }

    /* renamed from: a */
    public final void mo4828a(C0152fo foVar, boolean z) {
        mo5072d();
    }

    /* renamed from: a */
    public final boolean mo4832a(C0167gc gcVar) {
        boolean z = false;
        if (!gcVar.hasVisibleItems()) {
            return false;
        }
        C0167gc gcVar2 = gcVar;
        while (true) {
            C0152fo foVar = gcVar2.f9388h;
            if (foVar == this.f9257c) {
                break;
            }
            gcVar2 = foVar;
        }
        C0153fp fpVar = gcVar2.f9389i;
        C0161fx fxVar = this.f9260f;
        View view = null;
        if (fxVar != null) {
            ViewGroup viewGroup = (ViewGroup) fxVar;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof C0160fw) && ((C0160fw) childAt).mo747a() == fpVar) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        this.f9412o = gcVar.f9389i.f9325a;
        int size = gcVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            MenuItem item = gcVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i2++;
        }
        C0174gj gjVar = new C0174gj(this, this.f9256b, gcVar, view);
        this.f9409l = gjVar;
        gjVar.mo5031a(z);
        if (this.f9409l.mo5032b()) {
            return true;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }

    /* renamed from: e */
    public final void mo5073e() {
        C0152fo foVar;
        if (this.f9405h && !mo5071c() && (foVar = this.f9257c) != null && this.f9260f != null && this.f9410m == null && !foVar.mo4891h().isEmpty()) {
            this.f9410m = new C0175gk(this, new C0178gn(this, this.f9256b, this.f9257c, this.f9404g));
            ((View) this.f9260f).post(this.f9410m);
        }
    }

    /* renamed from: b */
    public final void mo4833b() {
        C0161fx fxVar;
        int size;
        int i;
        C0161fx fxVar2 = this.f9260f;
        ArrayList arrayList = null;
        if (fxVar2 != null) {
            C0152fo foVar = this.f9257c;
            if (foVar != null) {
                foVar.mo4889g();
                ArrayList f = this.f9257c.mo4887f();
                int size2 = f.size();
                i = 0;
                for (int i2 = 0; i2 < size2; i2++) {
                    C0153fp fpVar = (C0153fp) f.get(i2);
                    if (fpVar.mo4918e()) {
                        ViewGroup viewGroup = (ViewGroup) fxVar2;
                        View childAt = viewGroup.getChildAt(i);
                        C0153fp a = childAt instanceof C0160fw ? ((C0160fw) childAt).mo747a() : null;
                        View a2 = mo4826a(fpVar, childAt, viewGroup);
                        if (fpVar != a) {
                            a2.setPressed(false);
                            a2.jumpDrawablesToCurrentState();
                        }
                        if (a2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a2);
                            }
                            ((ViewGroup) this.f9260f).addView(a2, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (true) {
                ViewGroup viewGroup3 = (ViewGroup) fxVar2;
                if (i >= viewGroup3.getChildCount()) {
                    break;
                } else if (viewGroup3.getChildAt(i) == this.f9404g) {
                    i++;
                } else {
                    viewGroup3.removeViewAt(i);
                }
            }
        }
        ((View) this.f9260f).requestLayout();
        C0152fo foVar2 = this.f9257c;
        if (foVar2 != null) {
            foVar2.mo4889g();
            ArrayList arrayList2 = foVar2.f9306d;
            int size3 = arrayList2.size();
            int i3 = 0;
            while (i3 < size3) {
                if (((C0153fp) arrayList2.get(i3)).f9339o == null) {
                    i3++;
                } else {
                    throw null;
                }
            }
        }
        C0152fo foVar3 = this.f9257c;
        if (foVar3 != null) {
            arrayList = foVar3.mo4891h();
        }
        if (this.f9405h && arrayList != null && ((size = arrayList.size()) != 1 ? size > 0 : (!((C0153fp) arrayList.get(0)).f9338n))) {
            if (this.f9404g == null) {
                this.f9404g = new C0177gm(this, this.f9255a);
            }
            ViewGroup viewGroup4 = (ViewGroup) this.f9404g.getParent();
            if (viewGroup4 != this.f9260f) {
                if (viewGroup4 != null) {
                    viewGroup4.removeView(this.f9404g);
                }
                C0161fx fxVar3 = this.f9260f;
                C0177gm gmVar = this.f9404g;
                C0183gs c = ActionMenuView.m1276c();
                c.f9418a = true;
                ((ActionMenuView) fxVar3).addView(gmVar, c);
                return;
            }
            return;
        }
        C0177gm gmVar2 = this.f9404g;
        if (gmVar2 != null && gmVar2.getParent() == (fxVar = this.f9260f)) {
            ((ViewGroup) fxVar).removeView(this.f9404g);
        }
    }
}
