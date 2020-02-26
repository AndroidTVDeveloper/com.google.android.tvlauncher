package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.tvlauncher.R;

/* renamed from: agz  reason: default package */
/* compiled from: PG */
public final class agz implements ahg {
    private final agy a;
    private final View b;

    public agz(View view) {
        this.b = (View) aic.a(view);
        this.a = new agy(view);
    }

    public final void a() {
    }

    public final void a(Object obj) {
    }

    public final void b() {
    }

    public final void b(Drawable drawable) {
    }

    public final void c() {
    }

    public final void c(Drawable drawable) {
    }

    public final agm d() {
        Object tag = this.b.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof agm) {
            return (agm) tag;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    public final void a(ahf ahf) {
        agy agy = this.a;
        int c = agy.c();
        int b2 = agy.b();
        if (!agy.a(c, b2)) {
            if (!agy.b.contains(ahf)) {
                agy.b.add(ahf);
            }
            if (agy.c == null) {
                ViewTreeObserver viewTreeObserver = agy.a.getViewTreeObserver();
                agy.c = new agx(agy);
                viewTreeObserver.addOnPreDrawListener(agy.c);
                return;
            }
            return;
        }
        ahf.a(c, b2);
    }

    public final void a(Drawable drawable) {
        this.a.a();
    }

    public final void b(ahf ahf) {
        this.a.b.remove(ahf);
    }

    public final void a(agm agm) {
        this.b.setTag(R.id.glide_custom_view_target_tag, agm);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
        sb.append("Target for: ");
        sb.append(valueOf);
        return sb.toString();
    }
}
