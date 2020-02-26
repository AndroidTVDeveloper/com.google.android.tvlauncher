package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* renamed from: ey */
/* compiled from: PG */
public final class C0135ey extends ContextWrapper {

    /* renamed from: a */
    private int f9188a;

    /* renamed from: b */
    private Resources.Theme f9189b;

    /* renamed from: c */
    private LayoutInflater f9190c;

    /* renamed from: d */
    private Resources f9191d;

    public C0135ey() {
        super(null);
    }

    public C0135ey(Context context, Resources.Theme theme) {
        super(context);
        this.f9189b = theme;
    }

    public final AssetManager getAssets() {
        return m7265a().getAssets();
    }

    public final Resources getResources() {
        return m7265a();
    }

    /* renamed from: a */
    private final Resources m7265a() {
        if (this.f9191d == null) {
            this.f9191d = super.getResources();
        }
        return this.f9191d;
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f9190c == null) {
            this.f9190c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f9190c;
    }

    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f9189b;
        if (theme != null) {
            return theme;
        }
        if (this.f9188a == 0) {
            this.f9188a = 2131951990;
        }
        m7266b();
        return this.f9189b;
    }

    /* renamed from: b */
    private final void m7266b() {
        if (this.f9189b == null) {
            this.f9189b = m7265a().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f9189b.setTo(theme);
            }
        }
        this.f9189b.applyStyle(this.f9188a, true);
    }

    public final void setTheme(int i) {
        if (this.f9188a != i) {
            this.f9188a = i;
            m7266b();
        }
    }
}
