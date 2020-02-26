package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.tvlauncher.R;
import java.util.ArrayList;

/* renamed from: gp  reason: default package */
/* compiled from: PG */
public final class gp extends ff {
    public gm g;
    public boolean h;
    public boolean i;
    public boolean j;
    public gn k;
    public gj l;
    public gk m;
    public final go n = new go(this);
    public int o;
    private int p;
    private int q;
    private int r;
    private final SparseBooleanArray s = new SparseBooleanArray();
    private fe t;

    public gp(Context context) {
        super(context);
    }

    public final void d() {
        f();
        gj gjVar = this.l;
        if (gjVar != null) {
            gjVar.c();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r18 = this;
            r0 = r18
            fo r1 = r0.c
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x0011
            java.util.ArrayList r1 = r1.f()
            int r4 = r1.size()
            goto L_0x0014
        L_0x0011:
            r1 = r2
            r4 = 0
        L_0x0014:
            int r5 = r0.r
            int r6 = r0.q
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            fx r8 = r0.f
            r12 = r5
            r5 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0023:
            r13 = 1
            if (r5 < r4) goto L_0x00fa
            boolean r5 = r0.h
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
            android.util.SparseBooleanArray r5 = r0.s
            r5.clear()
            r9 = r6
            r6 = 0
            r10 = 0
        L_0x003d:
            if (r6 >= r4) goto L_0x00f8
            java.lang.Object r11 = r1.get(r6)
            fp r11 = (defpackage.fp) r11
            boolean r14 = r11.g()
            if (r14 != 0) goto L_0x00cc
            boolean r14 = r11.f()
            if (r14 == 0) goto L_0x00c3
            int r14 = r11.b
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
            android.view.View r3 = r0.a(r11, r2, r3)
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
            fp r13 = (defpackage.fp) r13
            int r2 = r13.b
            if (r2 == r14) goto L_0x00a3
            goto L_0x00af
        L_0x00a3:
            boolean r2 = r13.e()
            if (r2 == 0) goto L_0x00ab
            int r15 = r15 + 1
        L_0x00ab:
            r2 = 0
            r13.c(r2)
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
            r11.c(r3)
            r12 = r15
            r2 = 0
            r13 = 0
            r14 = 1
            goto L_0x00f0
        L_0x00c3:
            r2 = 0
            r11.c(r2)
            r13 = 0
            r14 = 1
            goto L_0x00f0
        L_0x00cc:
            r2 = 0
            r3 = r8
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r13 = 0
            android.view.View r3 = r0.a(r11, r13, r3)
            r3.measure(r7, r7)
            int r3 = r3.getMeasuredWidth()
            int r9 = r9 - r3
            if (r10 != 0) goto L_0x00e0
            goto L_0x00e1
        L_0x00e0:
            r3 = r10
        L_0x00e1:
            int r10 = r11.b
            if (r10 == 0) goto L_0x00ea
            r14 = 1
            r5.put(r10, r14)
            goto L_0x00eb
        L_0x00ea:
            r14 = 1
        L_0x00eb:
            r11.c(r14)
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
            fp r3 = (defpackage.fp) r3
            boolean r15 = r3.g()
            if (r15 == 0) goto L_0x010c
            int r9 = r9 + 1
            goto L_0x0117
        L_0x010c:
            boolean r15 = r3.f()
            if (r15 == 0) goto L_0x0116
            int r10 = r10 + 1
            goto L_0x0117
        L_0x0116:
            r11 = 1
        L_0x0117:
            boolean r14 = r0.j
            if (r14 != 0) goto L_0x011c
        L_0x011b:
            goto L_0x0121
        L_0x011c:
            boolean r3 = r3.n
            if (r3 == 0) goto L_0x011b
            r12 = 0
        L_0x0121:
            int r5 = r5 + 1
            r2 = r13
            r3 = 0
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gp.a():boolean");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [fx, fn] */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View a(fp fpVar, View view, ViewGroup viewGroup) {
        fw fwVar;
        View actionView = fpVar.getActionView();
        int i2 = 0;
        if (actionView == null || fpVar.h()) {
            if (view instanceof fw) {
                fwVar = (fw) view;
            } else {
                fwVar = (fw) this.d.inflate((int) R.layout.abc_action_menu_item_layout, viewGroup, false);
            }
            fwVar.a(fpVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) fwVar;
            actionMenuItemView.c = this.f;
            if (this.t == null) {
                this.t = new fe(this);
            }
            actionMenuItemView.d = this.t;
            actionView = (View) fwVar;
        }
        if (fpVar.n) {
            i2 = 8;
        }
        actionView.setVisibility(i2);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!(layoutParams instanceof gs)) {
            actionView.setLayoutParams(ActionMenuView.b(layoutParams));
        }
        return actionView;
    }

    public final void f() {
        fx fxVar;
        gk gkVar = this.m;
        if (gkVar == null || (fxVar = this.f) == null) {
            gn gnVar = this.k;
            if (gnVar != null) {
                gnVar.c();
                return;
            }
            return;
        }
        ((View) fxVar).removeCallbacks(gkVar);
        this.m = null;
    }

    public final void a(Context context, fo foVar) {
        this.b = context;
        LayoutInflater.from(this.b);
        this.c = foVar;
        Resources resources = context.getResources();
        ew ewVar = new ew(context);
        if (!this.i) {
            int i2 = Build.VERSION.SDK_INT;
            this.h = true;
        }
        int i3 = 2;
        this.p = ewVar.a.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = ewVar.a.getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        int i5 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i4 > 600) {
            i3 = 5;
        } else if (i4 >= 500 || (i4 > 480 && i5 > 640)) {
            i3 = 4;
        } else if (i4 >= 360) {
            i3 = 3;
        }
        this.r = i3;
        int i6 = this.p;
        if (!this.h) {
            this.g = null;
        } else {
            if (this.g == null) {
                this.g = new gm(this, this.a);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.g.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i6 -= this.g.getMeasuredWidth();
        }
        this.q = i6;
        float f = resources.getDisplayMetrics().density;
    }

    public final boolean c() {
        gn gnVar = this.k;
        return gnVar != null && gnVar.e();
    }

    public final void a(fo foVar, boolean z) {
        d();
    }

    public final boolean a(gc gcVar) {
        boolean z = false;
        if (!gcVar.hasVisibleItems()) {
            return false;
        }
        gc gcVar2 = gcVar;
        while (true) {
            fo foVar = gcVar2.h;
            if (foVar == this.c) {
                break;
            }
            gcVar2 = foVar;
        }
        fp fpVar = gcVar2.i;
        fx fxVar = this.f;
        View view = null;
        if (fxVar != null) {
            ViewGroup viewGroup = (ViewGroup) fxVar;
            int childCount = viewGroup.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i2);
                if ((childAt instanceof fw) && ((fw) childAt).a() == fpVar) {
                    view = childAt;
                    break;
                }
                i2++;
            }
        }
        if (view == null) {
            return false;
        }
        this.o = gcVar.i.a;
        int size = gcVar.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            MenuItem item = gcVar.getItem(i3);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i3++;
        }
        gj gjVar = new gj(this, this.b, gcVar, view);
        this.l = gjVar;
        gjVar.a(z);
        if (this.l.b()) {
            return true;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }

    public final void e() {
        fo foVar;
        if (this.h && !c() && (foVar = this.c) != null && this.f != null && this.m == null && !foVar.h().isEmpty()) {
            this.m = new gk(this, new gn(this, this.b, this.c, this.g));
            ((View) this.f).post(this.m);
        }
    }

    public final void b() {
        fx fxVar;
        int size;
        int i2;
        fx fxVar2 = this.f;
        ArrayList arrayList = null;
        if (fxVar2 != null) {
            fo foVar = this.c;
            if (foVar != null) {
                foVar.g();
                ArrayList f = this.c.f();
                int size2 = f.size();
                i2 = 0;
                for (int i3 = 0; i3 < size2; i3++) {
                    fp fpVar = (fp) f.get(i3);
                    if (fpVar.e()) {
                        ViewGroup viewGroup = (ViewGroup) fxVar2;
                        View childAt = viewGroup.getChildAt(i2);
                        fp a = childAt instanceof fw ? ((fw) childAt).a() : null;
                        View a2 = a(fpVar, childAt, viewGroup);
                        if (fpVar != a) {
                            a2.setPressed(false);
                            a2.jumpDrawablesToCurrentState();
                        }
                        if (a2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a2);
                            }
                            ((ViewGroup) this.f).addView(a2, i2);
                        }
                        i2++;
                    }
                }
            } else {
                i2 = 0;
            }
            while (true) {
                ViewGroup viewGroup3 = (ViewGroup) fxVar2;
                if (i2 >= viewGroup3.getChildCount()) {
                    break;
                } else if (viewGroup3.getChildAt(i2) == this.g) {
                    i2++;
                } else {
                    viewGroup3.removeViewAt(i2);
                }
            }
        }
        ((View) this.f).requestLayout();
        fo foVar2 = this.c;
        if (foVar2 != null) {
            foVar2.g();
            ArrayList arrayList2 = foVar2.d;
            int size3 = arrayList2.size();
            int i4 = 0;
            while (i4 < size3) {
                if (((fp) arrayList2.get(i4)).o == null) {
                    i4++;
                } else {
                    throw null;
                }
            }
        }
        fo foVar3 = this.c;
        if (foVar3 != null) {
            arrayList = foVar3.h();
        }
        if (this.h && arrayList != null && ((size = arrayList.size()) != 1 ? size > 0 : (!((fp) arrayList.get(0)).n))) {
            if (this.g == null) {
                this.g = new gm(this, this.a);
            }
            ViewGroup viewGroup4 = (ViewGroup) this.g.getParent();
            if (viewGroup4 != this.f) {
                if (viewGroup4 != null) {
                    viewGroup4.removeView(this.g);
                }
                fx fxVar3 = this.f;
                gm gmVar = this.g;
                gs c = ActionMenuView.c();
                c.a = true;
                ((ActionMenuView) fxVar3).addView(gmVar, c);
                return;
            }
            return;
        }
        gm gmVar2 = this.g;
        if (gmVar2 != null && gmVar2.getParent() == (fxVar = this.f)) {
            ((ViewGroup) fxVar).removeView(this.g);
        }
    }
}
