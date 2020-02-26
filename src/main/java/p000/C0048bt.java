package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* renamed from: bt */
/* compiled from: PG */
public interface C0048bt extends MenuItem {
    /* renamed from: a */
    void mo2409a(C0122el elVar);

    /* renamed from: a */
    void mo2410a(CharSequence charSequence);

    /* renamed from: b */
    void mo2411b(CharSequence charSequence);

    MenuItem setAlphabeticShortcut(char c, int i);

    MenuItem setIconTintList(ColorStateList colorStateList);

    MenuItem setIconTintMode(PorterDuff.Mode mode);

    MenuItem setNumericShortcut(char c, int i);
}
