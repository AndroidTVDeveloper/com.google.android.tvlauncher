package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;

/* renamed from: fa */
/* compiled from: PG */
final class C0138fa {

    /* renamed from: A */
    public CharSequence f9199A;

    /* renamed from: B */
    public CharSequence f9200B;

    /* renamed from: C */
    public ColorStateList f9201C = null;

    /* renamed from: D */
    public PorterDuff.Mode f9202D = null;

    /* renamed from: E */
    public final /* synthetic */ C0139fb f9203E;

    /* renamed from: F */
    public C0122el f9204F;

    /* renamed from: a */
    public final Menu f9205a;

    /* renamed from: b */
    public int f9206b;

    /* renamed from: c */
    public int f9207c;

    /* renamed from: d */
    public int f9208d;

    /* renamed from: e */
    public int f9209e;

    /* renamed from: f */
    public boolean f9210f;

    /* renamed from: g */
    public boolean f9211g;

    /* renamed from: h */
    public boolean f9212h;

    /* renamed from: i */
    public int f9213i;

    /* renamed from: j */
    public int f9214j;

    /* renamed from: k */
    public CharSequence f9215k;

    /* renamed from: l */
    public CharSequence f9216l;

    /* renamed from: m */
    public int f9217m;

    /* renamed from: n */
    public char f9218n;

    /* renamed from: o */
    public int f9219o;

    /* renamed from: p */
    public char f9220p;

    /* renamed from: q */
    public int f9221q;

    /* renamed from: r */
    public int f9222r;

    /* renamed from: s */
    public boolean f9223s;

    /* renamed from: t */
    public boolean f9224t;

    /* renamed from: u */
    public boolean f9225u;

    /* renamed from: v */
    public int f9226v;

    /* renamed from: w */
    public int f9227w;

    /* renamed from: x */
    public String f9228x;

    /* renamed from: y */
    public String f9229y;

    /* renamed from: z */
    public String f9230z;

    public C0138fa(C0139fb fbVar, Menu menu) {
        this.f9203E = fbVar;
        this.f9205a = menu;
        mo4770a();
    }

    /* renamed from: a */
    public static final char m7267a(String str) {
        if (str != null) {
            return str.charAt(0);
        }
        return 0;
    }

    /* renamed from: a */
    public final Object mo4769a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f9203E.f9234c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo4770a() {
        this.f9206b = 0;
        this.f9207c = 0;
        this.f9208d = 0;
        this.f9209e = 0;
        this.f9210f = true;
        this.f9211g = true;
    }

    /* renamed from: a */
    public final void mo4771a(MenuItem menuItem) {
        boolean z = false;
        menuItem.setChecked(this.f9223s).setVisible(this.f9224t).setEnabled(this.f9225u).setCheckable(this.f9222r > 0).setTitleCondensed(this.f9216l).setIcon(this.f9217m);
        int i = this.f9226v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.f9230z != null) {
            if (!this.f9203E.f9234c.isRestricted()) {
                C0139fb fbVar = this.f9203E;
                if (fbVar.f9235d == null) {
                    fbVar.f9235d = fbVar.mo4772a(fbVar.f9234c);
                }
                menuItem.setOnMenuItemClickListener(new C0136ez(fbVar.f9235d, this.f9230z));
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        boolean z2 = menuItem instanceof C0153fp;
        if (z2) {
            C0153fp fpVar = (C0153fp) menuItem;
        }
        if (this.f9222r >= 2) {
            if (z2) {
                ((C0153fp) menuItem).mo4909a(true);
            } else if (menuItem instanceof C0154fq) {
                C0154fq fqVar = (C0154fq) menuItem;
                throw null;
            }
        }
        String str = this.f9228x;
        if (str != null) {
            menuItem.setActionView((View) mo4769a(str, C0139fb.f9231a, this.f9203E.f9233b));
            z = true;
        }
        int i2 = this.f9227w;
        if (i2 > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        C0122el elVar = this.f9204F;
        if (elVar != null) {
            if (!(menuItem instanceof C0048bt)) {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            } else {
                ((C0048bt) menuItem).mo2409a(elVar);
            }
        }
        CharSequence charSequence = this.f9199A;
        boolean z3 = menuItem instanceof C0048bt;
        if (z3) {
            ((C0048bt) menuItem).mo2410a(charSequence);
        } else {
            int i3 = Build.VERSION.SDK_INT;
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f9200B;
        if (!z3) {
            int i4 = Build.VERSION.SDK_INT;
            menuItem.setTooltipText(charSequence2);
        } else {
            ((C0048bt) menuItem).mo2411b(charSequence2);
        }
        char c = this.f9218n;
        int i5 = this.f9219o;
        if (!z3) {
            int i6 = Build.VERSION.SDK_INT;
            menuItem.setAlphabeticShortcut(c, i5);
        } else {
            ((C0048bt) menuItem).setAlphabeticShortcut(c, i5);
        }
        char c2 = this.f9220p;
        int i7 = this.f9221q;
        if (!z3) {
            int i8 = Build.VERSION.SDK_INT;
            menuItem.setNumericShortcut(c2, i7);
        } else {
            ((C0048bt) menuItem).setNumericShortcut(c2, i7);
        }
        PorterDuff.Mode mode = this.f9202D;
        if (mode != null) {
            if (!z3) {
                int i9 = Build.VERSION.SDK_INT;
                menuItem.setIconTintMode(mode);
            } else {
                ((C0048bt) menuItem).setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.f9201C;
        if (colorStateList == null) {
            return;
        }
        if (z3) {
            ((C0048bt) menuItem).setIconTintList(colorStateList);
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        menuItem.setIconTintList(colorStateList);
    }
}
