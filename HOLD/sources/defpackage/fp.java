package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* renamed from: fp  reason: default package */
/* compiled from: PG */
public final class fp implements bt {
    private int A = 16;
    private View B;
    private MenuItem.OnActionExpandListener C;
    public final int a;
    public final int b;
    public final int c;
    public CharSequence d;
    public char e;
    public int f = 4096;
    public char g;
    public int h = 4096;
    public final fo i;
    public gc j;
    public CharSequence k;
    public CharSequence l;
    public int m = 0;
    public boolean n = false;
    public el o;
    private final int p;
    private CharSequence q;
    private Intent r;
    private Drawable s;
    private int t = 0;
    private MenuItem.OnMenuItemClickListener u;
    private ColorStateList v = null;
    private PorterDuff.Mode w = null;
    private boolean x = false;
    private boolean y = false;
    private boolean z = false;

    public fp(fo foVar, int i2, int i3, int i4, int i5, CharSequence charSequence) {
        this.i = foVar;
        this.a = i3;
        this.b = i2;
        this.p = i4;
        this.c = i5;
        this.d = charSequence;
    }

    public final boolean d() {
        return (this.A & 4) != 0;
    }

    public final boolean e() {
        return (this.A & 32) == 32;
    }

    public final boolean f() {
        return (this.m & 1) != 0;
    }

    public final boolean g() {
        return (this.m & 2) == 2;
    }

    public final View getActionView() {
        View view = this.B;
        if (view != null) {
            return view;
        }
        if (this.o == null) {
            return null;
        }
        throw null;
    }

    public final int getAlphabeticModifiers() {
        return this.h;
    }

    public final char getAlphabeticShortcut() {
        return this.g;
    }

    public final CharSequence getContentDescription() {
        return this.k;
    }

    public final int getGroupId() {
        return this.b;
    }

    public final ColorStateList getIconTintList() {
        return this.v;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.w;
    }

    public final Intent getIntent() {
        return this.r;
    }

    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.a;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.f;
    }

    public final char getNumericShortcut() {
        return this.e;
    }

    public final int getOrder() {
        return this.p;
    }

    public final SubMenu getSubMenu() {
        return this.j;
    }

    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.d;
    }

    public final CharSequence getTooltipText() {
        return this.l;
    }

    public final boolean h() {
        if ((this.m & 8) != 0) {
            View view = this.B;
            if (view == null && this.o != null) {
                throw null;
            } else if (view != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean hasSubMenu() {
        return this.j != null;
    }

    public final boolean isActionViewExpanded() {
        return this.n;
    }

    public final boolean isCheckable() {
        return (this.A & 1) != 0;
    }

    public final boolean isChecked() {
        return (this.A & 2) == 2;
    }

    public final boolean isEnabled() {
        return (this.A & 16) != 0;
    }

    public final boolean isVisible() {
        if (this.o == null) {
            return (this.A & 8) == 0;
        }
        throw null;
    }

    public static void a(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    private final Drawable a(Drawable drawable) {
        if (drawable != null && this.z && (this.x || this.y)) {
            int i2 = Build.VERSION.SDK_INT;
            drawable = drawable.mutate();
            if (this.x) {
                bq.a(drawable, this.v);
            }
            if (this.y) {
                bq.a(drawable, this.w);
            }
            this.z = false;
        }
        return drawable;
    }

    public final boolean collapseActionView() {
        if ((this.m & 8) == 0) {
            return false;
        }
        if (this.B == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.i.b(this);
    }

    public final boolean expandActionView() {
        if (!h()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
            return false;
        }
        return this.i.a(this);
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final Drawable getIcon() {
        Drawable drawable = this.s;
        if (drawable != null) {
            return a(drawable);
        }
        int i2 = this.t;
        if (i2 == 0) {
            return null;
        }
        Drawable b2 = es.b(this.i.a, i2);
        this.t = 0;
        this.s = b2;
        return a(b2);
    }

    public final char b() {
        return this.i.b() ? this.g : this.e;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.q;
        if (charSequence == null) {
            charSequence = this.d;
        }
        int i2 = Build.VERSION.SDK_INT;
        return charSequence;
    }

    public final CharSequence a(fw fwVar) {
        return (fwVar != null && fwVar.b()) ? getTitleCondensed() : this.d;
    }

    public final boolean a() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.u;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        fo foVar = this.i;
        if (foVar.a(foVar, this)) {
            return true;
        }
        Intent intent = this.r;
        if (intent != null) {
            try {
                this.i.a.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException e2) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
            }
        }
        if (this.o == null) {
            return false;
        }
        throw null;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.widget.LinearLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final /* bridge */ /* synthetic */ MenuItem setActionView(int i2) {
        Context context = this.i.a;
        a(LayoutInflater.from(context).inflate(i2, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    private final void a(View view) {
        int i2;
        this.B = view;
        this.o = null;
        if (view != null && view.getId() == -1 && (i2 = this.a) > 0) {
            view.setId(i2);
        }
        this.i.j();
    }

    public final /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        a(view);
        return this;
    }

    public final void d(boolean z2) {
        this.n = z2;
        this.i.b(false);
    }

    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.g != c2) {
            this.g = Character.toLowerCase(c2);
            this.i.b(false);
        }
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.g == c2 && this.h == i2) {
            return this;
        }
        this.g = Character.toLowerCase(c2);
        this.h = KeyEvent.normalizeMetaState(i2);
        this.i.b(false);
        return this;
    }

    public final MenuItem setCheckable(boolean z2) {
        int i2 = this.A;
        boolean z3 = z2 | (i2 & true);
        this.A = z3 ? 1 : 0;
        if (i2 != z3) {
            this.i.b(false);
        }
        return this;
    }

    public final MenuItem setChecked(boolean z2) {
        if ((this.A & 4) != 0) {
            fo foVar = this.i;
            int i2 = this.b;
            int size = foVar.b.size();
            foVar.d();
            for (int i3 = 0; i3 < size; i3++) {
                fp fpVar = (fp) foVar.b.get(i3);
                if (fpVar.b == i2 && fpVar.d() && fpVar.isCheckable()) {
                    fpVar.e(fpVar == this);
                }
            }
            foVar.e();
        } else {
            e(z2);
        }
        return this;
    }

    private final void e(boolean z2) {
        int i2 = this.A;
        int i3 = (!z2 ? 0 : 2) | (i2 & -3);
        this.A = i3;
        if (i2 != i3) {
            this.i.b(false);
        }
    }

    public final void a(CharSequence charSequence) {
        this.k = charSequence;
        this.i.b(false);
    }

    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        a(charSequence);
        return this;
    }

    public final MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.A |= 16;
        } else {
            this.A &= -17;
        }
        this.i.b(false);
        return this;
    }

    public final void a(boolean z2) {
        this.A = (!z2 ? 0 : 4) | (this.A & -5);
    }

    public final MenuItem setIcon(int i2) {
        this.s = null;
        this.t = i2;
        this.z = true;
        this.i.b(false);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.t = 0;
        this.s = drawable;
        this.z = true;
        this.i.b(false);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.v = colorStateList;
        this.x = true;
        this.z = true;
        this.i.b(false);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.w = mode;
        this.y = true;
        this.z = true;
        this.i.b(false);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.r = intent;
        return this;
    }

    public final void c(boolean z2) {
        if (z2) {
            this.A |= 32;
        } else {
            this.A &= -33;
        }
    }

    public final MenuItem setNumericShortcut(char c2) {
        if (this.e != c2) {
            this.e = c2;
            this.i.b(false);
        }
        return this;
    }

    public final MenuItem setNumericShortcut(char c2, int i2) {
        if (this.e == c2 && this.f == i2) {
            return this;
        }
        this.e = c2;
        this.f = KeyEvent.normalizeMetaState(i2);
        this.i.b(false);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.u = onMenuItemClickListener;
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3) {
        this.e = c2;
        this.g = Character.toLowerCase(c3);
        this.i.b(false);
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.e = c2;
        this.f = KeyEvent.normalizeMetaState(i2);
        this.g = Character.toLowerCase(c3);
        this.h = KeyEvent.normalizeMetaState(i3);
        this.i.b(false);
        return this;
    }

    public final void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 == 0 || i3 == 1 || i3 == 2) {
            this.m = i2;
            this.i.j();
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public final /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    public final void a(gc gcVar) {
        this.j = gcVar;
        gcVar.setHeaderTitle(this.d);
    }

    public final void a(el elVar) {
        if (this.o == null) {
            this.B = null;
            this.o = elVar;
            this.i.b(true);
            if (this.o != null) {
                throw null;
            }
            return;
        }
        throw null;
    }

    public final MenuItem setTitle(int i2) {
        setTitle(this.i.a.getString(i2));
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.d = charSequence;
        this.i.b(false);
        gc gcVar = this.j;
        if (gcVar != null) {
            gcVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.q = charSequence;
        this.i.b(false);
        return this;
    }

    public final void b(CharSequence charSequence) {
        this.l = charSequence;
        this.i.b(false);
    }

    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        b(charSequence);
        return this;
    }

    public final MenuItem setVisible(boolean z2) {
        if (b(z2)) {
            fo foVar = this.i;
            foVar.c = true;
            foVar.b(true);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public final boolean b(boolean z2) {
        int i2 = this.A;
        int i3 = (!z2 ? 8 : 0) | (i2 & -9);
        this.A = i3;
        return i2 != i3;
    }

    public final boolean c() {
        return this.i.c() && b() != 0;
    }

    public final String toString() {
        CharSequence charSequence = this.d;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
