package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: gc  reason: default package */
/* compiled from: PG */
public final class gc extends fo implements SubMenu {
    public final fo h;
    public final fp i;

    public gc(Context context, fo foVar, fp fpVar) {
        super(context);
        this.h = foVar;
        this.i = fpVar;
    }

    public final MenuItem getItem() {
        return this.i;
    }

    public final void k() {
    }

    public final boolean b(fp fpVar) {
        return this.h.b(fpVar);
    }

    public final boolean a(fo foVar, MenuItem menuItem) {
        return this.h.a(foVar, menuItem);
    }

    public final boolean a(fp fpVar) {
        return this.h.a(fpVar);
    }

    public final fo i() {
        return this.h.i();
    }

    public final boolean a() {
        return this.h.a();
    }

    public final boolean b() {
        return this.h.b();
    }

    public final boolean c() {
        return this.h.c();
    }

    public final void setGroupDividerEnabled(boolean z) {
        this.h.setGroupDividerEnabled(z);
    }

    public final SubMenu setHeaderIcon(int i2) {
        a(0, (CharSequence) null, i2, (View) null);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        a(0, (CharSequence) null, 0, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(int i2) {
        a(i2, (CharSequence) null, 0, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        a(0, charSequence, 0, (View) null);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        a(0, (CharSequence) null, 0, view);
        return this;
    }

    public final SubMenu setIcon(int i2) {
        this.i.setIcon(i2);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.i.setIcon(drawable);
        return this;
    }

    public final void setQwertyMode(boolean z) {
        this.h.setQwertyMode(z);
    }
}
