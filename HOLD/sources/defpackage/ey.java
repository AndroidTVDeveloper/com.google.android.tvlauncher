package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* renamed from: ey  reason: default package */
/* compiled from: PG */
public final class ey extends ContextWrapper {
    private int a;
    private Resources.Theme b;
    private LayoutInflater c;
    private Resources d;

    public ey() {
        super(null);
    }

    public ey(Context context, Resources.Theme theme) {
        super(context);
        this.b = theme;
    }

    public final AssetManager getAssets() {
        return a().getAssets();
    }

    public final Resources getResources() {
        return a();
    }

    private final Resources a() {
        if (this.d == null) {
            this.d = super.getResources();
        }
        return this.d;
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.c == null) {
            this.c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.c;
    }

    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.b;
        if (theme != null) {
            return theme;
        }
        if (this.a == 0) {
            this.a = 2131951990;
        }
        b();
        return this.b;
    }

    private final void b() {
        if (this.b == null) {
            this.b = a().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.b.setTo(theme);
            }
        }
        this.b.applyStyle(this.a, true);
    }

    public final void setTheme(int i) {
        if (this.a != i) {
            this.a = i;
            b();
        }
    }
}
