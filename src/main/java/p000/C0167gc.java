package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: gc */
/* compiled from: PG */
public final class C0167gc extends C0152fo implements SubMenu {

    /* renamed from: h */
    public final C0152fo f9388h;

    /* renamed from: i */
    public final C0153fp f9389i;

    public C0167gc(Context context, C0152fo foVar, C0153fp fpVar) {
        super(context);
        this.f9388h = foVar;
        this.f9389i = fpVar;
    }

    public final MenuItem getItem() {
        return this.f9389i;
    }

    /* renamed from: k */
    public final void mo4896k() {
    }

    /* renamed from: b */
    public final boolean mo4880b(C0153fp fpVar) {
        return this.f9388h.mo4880b(fpVar);
    }

    /* renamed from: a */
    public final boolean mo4867a(C0152fo foVar, MenuItem menuItem) {
        return this.f9388h.mo4867a(foVar, menuItem);
    }

    /* renamed from: a */
    public final boolean mo4868a(C0153fp fpVar) {
        return this.f9388h.mo4868a(fpVar);
    }

    /* renamed from: i */
    public final C0152fo mo4893i() {
        return this.f9388h.mo4893i();
    }

    /* renamed from: a */
    public final boolean mo4864a() {
        return this.f9388h.mo4864a();
    }

    /* renamed from: b */
    public final boolean mo4879b() {
        return this.f9388h.mo4879b();
    }

    /* renamed from: c */
    public final boolean mo4881c() {
        return this.f9388h.mo4881c();
    }

    public final void setGroupDividerEnabled(boolean z) {
        this.f9388h.setGroupDividerEnabled(z);
    }

    public final SubMenu setHeaderIcon(int i) {
        mo4861a(0, (CharSequence) null, i, (View) null);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        mo4861a(0, (CharSequence) null, 0, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(int i) {
        mo4861a(i, (CharSequence) null, 0, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        mo4861a(0, charSequence, 0, (View) null);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        mo4861a(0, (CharSequence) null, 0, view);
        return this;
    }

    public final SubMenu setIcon(int i) {
        this.f9389i.setIcon(i);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.f9389i.setIcon(drawable);
        return this;
    }

    public final void setQwertyMode(boolean z) {
        this.f9388h.setQwertyMode(z);
    }
}
