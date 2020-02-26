package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* renamed from: bt  reason: default package */
/* compiled from: PG */
public interface bt extends MenuItem {
    void a(el elVar);

    void a(CharSequence charSequence);

    void b(CharSequence charSequence);

    MenuItem setAlphabeticShortcut(char c, int i);

    MenuItem setIconTintList(ColorStateList colorStateList);

    MenuItem setIconTintMode(PorterDuff.Mode mode);

    MenuItem setNumericShortcut(char c, int i);
}
