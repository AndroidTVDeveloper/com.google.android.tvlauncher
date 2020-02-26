package p000;

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

/* renamed from: fp */
/* compiled from: PG */
public final class C0153fp implements C0048bt {

    /* renamed from: A */
    private int f9322A = 16;

    /* renamed from: B */
    private View f9323B;

    /* renamed from: C */
    private MenuItem.OnActionExpandListener f9324C;

    /* renamed from: a */
    public final int f9325a;

    /* renamed from: b */
    public final int f9326b;

    /* renamed from: c */
    public final int f9327c;

    /* renamed from: d */
    public CharSequence f9328d;

    /* renamed from: e */
    public char f9329e;

    /* renamed from: f */
    public int f9330f = 4096;

    /* renamed from: g */
    public char f9331g;

    /* renamed from: h */
    public int f9332h = 4096;

    /* renamed from: i */
    public final C0152fo f9333i;

    /* renamed from: j */
    public C0167gc f9334j;

    /* renamed from: k */
    public CharSequence f9335k;

    /* renamed from: l */
    public CharSequence f9336l;

    /* renamed from: m */
    public int f9337m = 0;

    /* renamed from: n */
    public boolean f9338n = false;

    /* renamed from: o */
    public C0122el f9339o;

    /* renamed from: p */
    private final int f9340p;

    /* renamed from: q */
    private CharSequence f9341q;

    /* renamed from: r */
    private Intent f9342r;

    /* renamed from: s */
    private Drawable f9343s;

    /* renamed from: t */
    private int f9344t = 0;

    /* renamed from: u */
    private MenuItem.OnMenuItemClickListener f9345u;

    /* renamed from: v */
    private ColorStateList f9346v = null;

    /* renamed from: w */
    private PorterDuff.Mode f9347w = null;

    /* renamed from: x */
    private boolean f9348x = false;

    /* renamed from: y */
    private boolean f9349y = false;

    /* renamed from: z */
    private boolean f9350z = false;

    public C0153fp(C0152fo foVar, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f9333i = foVar;
        this.f9325a = i2;
        this.f9326b = i;
        this.f9340p = i3;
        this.f9327c = i4;
        this.f9328d = charSequence;
    }

    /* renamed from: d */
    public final boolean mo4917d() {
        return (this.f9322A & 4) != 0;
    }

    /* renamed from: e */
    public final boolean mo4918e() {
        return (this.f9322A & 32) == 32;
    }

    /* renamed from: f */
    public final boolean mo4920f() {
        return (this.f9337m & 1) != 0;
    }

    /* renamed from: g */
    public final boolean mo4921g() {
        return (this.f9337m & 2) == 2;
    }

    public final View getActionView() {
        View view = this.f9323B;
        if (view != null) {
            return view;
        }
        if (this.f9339o == null) {
            return null;
        }
        throw null;
    }

    public final int getAlphabeticModifiers() {
        return this.f9332h;
    }

    public final char getAlphabeticShortcut() {
        return this.f9331g;
    }

    public final CharSequence getContentDescription() {
        return this.f9335k;
    }

    public final int getGroupId() {
        return this.f9326b;
    }

    public final ColorStateList getIconTintList() {
        return this.f9346v;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f9347w;
    }

    public final Intent getIntent() {
        return this.f9342r;
    }

    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f9325a;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.f9330f;
    }

    public final char getNumericShortcut() {
        return this.f9329e;
    }

    public final int getOrder() {
        return this.f9340p;
    }

    public final SubMenu getSubMenu() {
        return this.f9334j;
    }

    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f9328d;
    }

    public final CharSequence getTooltipText() {
        return this.f9336l;
    }

    /* renamed from: h */
    public final boolean mo4941h() {
        if ((this.f9337m & 8) != 0) {
            View view = this.f9323B;
            if (view == null && this.f9339o != null) {
                throw null;
            } else if (view != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean hasSubMenu() {
        return this.f9334j != null;
    }

    public final boolean isActionViewExpanded() {
        return this.f9338n;
    }

    public final boolean isCheckable() {
        return (this.f9322A & 1) != 0;
    }

    public final boolean isChecked() {
        return (this.f9322A & 2) == 2;
    }

    public final boolean isEnabled() {
        return (this.f9322A & 16) != 0;
    }

    public final boolean isVisible() {
        if (this.f9339o == null) {
            return (this.f9322A & 8) == 0;
        }
        throw null;
    }

    /* renamed from: a */
    public static void m7338a(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* renamed from: a */
    private final Drawable m7336a(Drawable drawable) {
        if (drawable != null && this.f9350z && (this.f9348x || this.f9349y)) {
            int i = Build.VERSION.SDK_INT;
            drawable = drawable.mutate();
            if (this.f9348x) {
                C0045bq.m3945a(drawable, this.f9346v);
            }
            if (this.f9349y) {
                C0045bq.m3946a(drawable, this.f9347w);
            }
            this.f9350z = false;
        }
        return drawable;
    }

    public final boolean collapseActionView() {
        if ((this.f9337m & 8) == 0) {
            return false;
        }
        if (this.f9323B == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f9324C;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f9333i.mo4880b(this);
    }

    public final boolean expandActionView() {
        if (!mo4941h()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f9324C;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
            return false;
        }
        return this.f9333i.mo4868a(this);
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final Drawable getIcon() {
        Drawable drawable = this.f9343s;
        if (drawable != null) {
            return m7336a(drawable);
        }
        int i = this.f9344t;
        if (i == 0) {
            return null;
        }
        Drawable b = C0129es.m7262b(this.f9333i.f9303a, i);
        this.f9344t = 0;
        this.f9343s = b;
        return m7336a(b);
    }

    /* renamed from: b */
    public final char mo4911b() {
        return this.f9333i.mo4879b() ? this.f9331g : this.f9329e;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f9341q;
        if (charSequence == null) {
            charSequence = this.f9328d;
        }
        int i = Build.VERSION.SDK_INT;
        return charSequence;
    }

    /* renamed from: a */
    public final CharSequence mo4907a(C0160fw fwVar) {
        return (fwVar != null && fwVar.mo749b()) ? getTitleCondensed() : this.f9328d;
    }

    /* renamed from: a */
    public final boolean mo4910a() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f9345u;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0152fo foVar = this.f9333i;
        if (foVar.mo4867a(foVar, this)) {
            return true;
        }
        Intent intent = this.f9342r;
        if (intent != null) {
            try {
                this.f9333i.f9303a.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        if (this.f9339o == null) {
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
    public final /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        Context context = this.f9333i.f9303a;
        m7337a(LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    /* renamed from: a */
    private final void m7337a(View view) {
        int i;
        this.f9323B = view;
        this.f9339o = null;
        if (view != null && view.getId() == -1 && (i = this.f9325a) > 0) {
            view.setId(i);
        }
        this.f9333i.mo4895j();
    }

    public final /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        m7337a(view);
        return this;
    }

    /* renamed from: d */
    public final void mo4916d(boolean z) {
        this.f9338n = z;
        this.f9333i.mo4878b(false);
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f9331g != c) {
            this.f9331g = Character.toLowerCase(c);
            this.f9333i.mo4878b(false);
        }
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f9331g == c && this.f9332h == i) {
            return this;
        }
        this.f9331g = Character.toLowerCase(c);
        this.f9332h = KeyEvent.normalizeMetaState(i);
        this.f9333i.mo4878b(false);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        int i = this.f9322A;
        boolean z2 = z | (i & true);
        this.f9322A = z2 ? 1 : 0;
        if (i != z2) {
            this.f9333i.mo4878b(false);
        }
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        if ((this.f9322A & 4) != 0) {
            C0152fo foVar = this.f9333i;
            int i = this.f9326b;
            int size = foVar.f9304b.size();
            foVar.mo4885d();
            for (int i2 = 0; i2 < size; i2++) {
                C0153fp fpVar = (C0153fp) foVar.f9304b.get(i2);
                if (fpVar.f9326b == i && fpVar.mo4917d() && fpVar.isCheckable()) {
                    fpVar.m7339e(fpVar == this);
                }
            }
            foVar.mo4886e();
        } else {
            m7339e(z);
        }
        return this;
    }

    /* renamed from: e */
    private final void m7339e(boolean z) {
        int i = this.f9322A;
        int i2 = (!z ? 0 : 2) | (i & -3);
        this.f9322A = i2;
        if (i != i2) {
            this.f9333i.mo4878b(false);
        }
    }

    /* renamed from: a */
    public final void mo2410a(CharSequence charSequence) {
        this.f9335k = charSequence;
        this.f9333i.mo4878b(false);
    }

    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        mo2410a(charSequence);
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.f9322A |= 16;
        } else {
            this.f9322A &= -17;
        }
        this.f9333i.mo4878b(false);
        return this;
    }

    /* renamed from: a */
    public final void mo4909a(boolean z) {
        this.f9322A = (!z ? 0 : 4) | (this.f9322A & -5);
    }

    public final MenuItem setIcon(int i) {
        this.f9343s = null;
        this.f9344t = i;
        this.f9350z = true;
        this.f9333i.mo4878b(false);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f9344t = 0;
        this.f9343s = drawable;
        this.f9350z = true;
        this.f9333i.mo4878b(false);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f9346v = colorStateList;
        this.f9348x = true;
        this.f9350z = true;
        this.f9333i.mo4878b(false);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f9347w = mode;
        this.f9349y = true;
        this.f9350z = true;
        this.f9333i.mo4878b(false);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f9342r = intent;
        return this;
    }

    /* renamed from: c */
    public final void mo4913c(boolean z) {
        if (z) {
            this.f9322A |= 32;
        } else {
            this.f9322A &= -33;
        }
    }

    public final MenuItem setNumericShortcut(char c) {
        if (this.f9329e != c) {
            this.f9329e = c;
            this.f9333i.mo4878b(false);
        }
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f9329e == c && this.f9330f == i) {
            return this;
        }
        this.f9329e = c;
        this.f9330f = KeyEvent.normalizeMetaState(i);
        this.f9333i.mo4878b(false);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f9324C = onActionExpandListener;
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f9345u = onMenuItemClickListener;
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.f9329e = c;
        this.f9331g = Character.toLowerCase(c2);
        this.f9333i.mo4878b(false);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f9329e = c;
        this.f9330f = KeyEvent.normalizeMetaState(i);
        this.f9331g = Character.toLowerCase(c2);
        this.f9332h = KeyEvent.normalizeMetaState(i2);
        this.f9333i.mo4878b(false);
        return this;
    }

    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.f9337m = i;
            this.f9333i.mo4895j();
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public final /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    /* renamed from: a */
    public final void mo4908a(C0167gc gcVar) {
        this.f9334j = gcVar;
        gcVar.setHeaderTitle(this.f9328d);
    }

    /* renamed from: a */
    public final void mo2409a(C0122el elVar) {
        if (this.f9339o == null) {
            this.f9323B = null;
            this.f9339o = elVar;
            this.f9333i.mo4878b(true);
            if (this.f9339o != null) {
                throw null;
            }
            return;
        }
        throw null;
    }

    public final MenuItem setTitle(int i) {
        setTitle(this.f9333i.f9303a.getString(i));
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f9328d = charSequence;
        this.f9333i.mo4878b(false);
        C0167gc gcVar = this.f9334j;
        if (gcVar != null) {
            gcVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f9341q = charSequence;
        this.f9333i.mo4878b(false);
        return this;
    }

    /* renamed from: b */
    public final void mo2411b(CharSequence charSequence) {
        this.f9336l = charSequence;
        this.f9333i.mo4878b(false);
    }

    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        mo2411b(charSequence);
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        if (mo4912b(z)) {
            C0152fo foVar = this.f9333i;
            foVar.f9305c = true;
            foVar.mo4878b(true);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo4912b(boolean z) {
        int i = this.f9322A;
        int i2 = (!z ? 8 : 0) | (i & -9);
        this.f9322A = i2;
        return i != i2;
    }

    /* renamed from: c */
    public final boolean mo4914c() {
        return this.f9333i.mo4881c() && mo4911b() != 0;
    }

    public final String toString() {
        CharSequence charSequence = this.f9328d;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
