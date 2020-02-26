package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;

/* renamed from: fa  reason: default package */
/* compiled from: PG */
final class fa {
    public CharSequence A;
    public CharSequence B;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public final /* synthetic */ fb E;
    public el F;
    public final Menu a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public String z;

    public fa(fb fbVar, Menu menu) {
        this.E = fbVar;
        this.a = menu;
        a();
    }

    public static final char a(String str) {
        if (str != null) {
            return str.charAt(0);
        }
        return 0;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    public final void a() {
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = true;
        this.g = true;
    }

    public final void a(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r > 0).setTitleCondensed(this.l).setIcon(this.m);
        int i2 = this.v;
        if (i2 >= 0) {
            menuItem.setShowAsAction(i2);
        }
        if (this.z != null) {
            if (!this.E.c.isRestricted()) {
                fb fbVar = this.E;
                if (fbVar.d == null) {
                    fbVar.d = fbVar.a(fbVar.c);
                }
                menuItem.setOnMenuItemClickListener(new ez(fbVar.d, this.z));
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        boolean z3 = menuItem instanceof fp;
        if (z3) {
            fp fpVar = (fp) menuItem;
        }
        if (this.r >= 2) {
            if (z3) {
                ((fp) menuItem).a(true);
            } else if (menuItem instanceof fq) {
                fq fqVar = (fq) menuItem;
                throw null;
            }
        }
        String str = this.x;
        if (str != null) {
            menuItem.setActionView((View) a(str, fb.a, this.E.b));
            z2 = true;
        }
        int i3 = this.w;
        if (i3 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i3);
            }
        }
        el elVar = this.F;
        if (elVar != null) {
            if (!(menuItem instanceof bt)) {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            } else {
                ((bt) menuItem).a(elVar);
            }
        }
        CharSequence charSequence = this.A;
        boolean z4 = menuItem instanceof bt;
        if (z4) {
            ((bt) menuItem).a(charSequence);
        } else {
            int i4 = Build.VERSION.SDK_INT;
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (!z4) {
            int i5 = Build.VERSION.SDK_INT;
            menuItem.setTooltipText(charSequence2);
        } else {
            ((bt) menuItem).b(charSequence2);
        }
        char c2 = this.n;
        int i6 = this.o;
        if (!z4) {
            int i7 = Build.VERSION.SDK_INT;
            menuItem.setAlphabeticShortcut(c2, i6);
        } else {
            ((bt) menuItem).setAlphabeticShortcut(c2, i6);
        }
        char c3 = this.p;
        int i8 = this.q;
        if (!z4) {
            int i9 = Build.VERSION.SDK_INT;
            menuItem.setNumericShortcut(c3, i8);
        } else {
            ((bt) menuItem).setNumericShortcut(c3, i8);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (!z4) {
                int i10 = Build.VERSION.SDK_INT;
                menuItem.setIconTintMode(mode);
            } else {
                ((bt) menuItem).setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList == null) {
            return;
        }
        if (z4) {
            ((bt) menuItem).setIconTintList(colorStateList);
            return;
        }
        int i11 = Build.VERSION.SDK_INT;
        menuItem.setIconTintList(colorStateList);
    }
}
