package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: fc */
/* compiled from: PG */
public final class C0140fc implements C0048bt {

    /* renamed from: a */
    private CharSequence f9237a;

    /* renamed from: b */
    private CharSequence f9238b;

    /* renamed from: c */
    private Intent f9239c;

    /* renamed from: d */
    private char f9240d;

    /* renamed from: e */
    private int f9241e = 4096;

    /* renamed from: f */
    private char f9242f;

    /* renamed from: g */
    private int f9243g = 4096;

    /* renamed from: h */
    private Drawable f9244h;

    /* renamed from: i */
    private final Context f9245i;

    /* renamed from: j */
    private CharSequence f9246j;

    /* renamed from: k */
    private CharSequence f9247k;

    /* renamed from: l */
    private ColorStateList f9248l = null;

    /* renamed from: m */
    private PorterDuff.Mode f9249m = null;

    /* renamed from: n */
    private boolean f9250n = false;

    /* renamed from: o */
    private boolean f9251o = false;

    /* renamed from: p */
    private int f9252p = 16;

    public C0140fc(Context context, CharSequence charSequence) {
        this.f9245i = context;
        this.f9237a = charSequence;
    }

    public final boolean collapseActionView() {
        return false;
    }

    public final boolean expandActionView() {
        return false;
    }

    public final View getActionView() {
        return null;
    }

    public final int getAlphabeticModifiers() {
        return this.f9243g;
    }

    public final char getAlphabeticShortcut() {
        return this.f9242f;
    }

    public final CharSequence getContentDescription() {
        return this.f9246j;
    }

    public final int getGroupId() {
        return 0;
    }

    public final Drawable getIcon() {
        return this.f9244h;
    }

    public final ColorStateList getIconTintList() {
        return this.f9248l;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f9249m;
    }

    public final Intent getIntent() {
        return this.f9239c;
    }

    public final int getItemId() {
        return 16908332;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.f9241e;
    }

    public final char getNumericShortcut() {
        return this.f9240d;
    }

    public final int getOrder() {
        return 0;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    public final CharSequence getTitle() {
        return this.f9237a;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f9238b;
        return charSequence == null ? this.f9237a : charSequence;
    }

    public final CharSequence getTooltipText() {
        return this.f9247k;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    public final boolean isActionViewExpanded() {
        return false;
    }

    public final boolean isCheckable() {
        return (this.f9252p & 1) != 0;
    }

    public final boolean isChecked() {
        return (this.f9252p & 2) != 0;
    }

    public final boolean isEnabled() {
        return (this.f9252p & 16) != 0;
    }

    public final boolean isVisible() {
        return (this.f9252p & 8) == 0;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public final void setShowAsAction(int i) {
    }

    public final /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    /* renamed from: a */
    private final void m7273a() {
        Drawable drawable = this.f9244h;
        if (drawable == null) {
            return;
        }
        if (this.f9250n || this.f9251o) {
            int i = Build.VERSION.SDK_INT;
            this.f9244h = drawable;
            Drawable mutate = drawable.mutate();
            this.f9244h = mutate;
            if (this.f9250n) {
                C0045bq.m3945a(mutate, this.f9248l);
            }
            if (this.f9251o) {
                C0045bq.m3946a(this.f9244h, this.f9249m);
            }
        }
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        this.f9242f = Character.toLowerCase(c);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f9242f = Character.toLowerCase(c);
        this.f9243g = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.f9252p = z | (this.f9252p & true) ? 1 : 0;
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        this.f9252p = (!z ? 0 : 2) | (this.f9252p & -3);
        return this;
    }

    /* renamed from: a */
    public final void mo2410a(CharSequence charSequence) {
        this.f9246j = charSequence;
    }

    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        this.f9246j = charSequence;
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        this.f9252p = (!z ? 0 : 16) | (this.f9252p & -17);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.f9244h = C0035bg.m3107a(this.f9245i, i);
        m7273a();
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f9244h = drawable;
        m7273a();
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f9248l = colorStateList;
        this.f9250n = true;
        m7273a();
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f9249m = mode;
        this.f9251o = true;
        m7273a();
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f9239c = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c) {
        this.f9240d = c;
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        this.f9240d = c;
        this.f9241e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.f9240d = c;
        this.f9242f = Character.toLowerCase(c2);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f9240d = c;
        this.f9241e = KeyEvent.normalizeMetaState(i);
        this.f9242f = Character.toLowerCase(c2);
        this.f9243g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    /* renamed from: a */
    public final void mo2409a(C0122el elVar) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setTitle(int i) {
        this.f9237a = this.f9245i.getResources().getString(i);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f9237a = charSequence;
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f9238b = charSequence;
        return this;
    }

    /* renamed from: b */
    public final void mo2411b(CharSequence charSequence) {
        this.f9247k = charSequence;
    }

    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        this.f9247k = charSequence;
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f9252p & 8;
        if (z) {
            i = 0;
        }
        this.f9252p = i2 | i;
        return this;
    }
}
