package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.tvlauncher.R;

@Deprecated
/* renamed from: ahj  reason: default package */
/* compiled from: PG */
public abstract class ahj extends agu {
    public final View a;
    public final ahi b;

    public ahj(View view) {
        this.a = (View) aic.a(view);
        this.b = new ahi(view);
    }

    public final agm d() {
        Object tag = this.a.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof agm) {
            return (agm) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public final void a(ahf ahf) {
        ahi ahi = this.b;
        int c = ahi.c();
        int b2 = ahi.b();
        if (!ahi.a(c, b2)) {
            if (!ahi.b.contains(ahf)) {
                ahi.b.add(ahf);
            }
            if (ahi.c == null) {
                ViewTreeObserver viewTreeObserver = ahi.a.getViewTreeObserver();
                ahi.c = new ahh(ahi);
                viewTreeObserver.addOnPreDrawListener(ahi.c);
                return;
            }
            return;
        }
        ahf.a(c, b2);
    }

    public final void b(ahf ahf) {
        this.b.b.remove(ahf);
    }

    public void a(agm agm) {
        d(agm);
    }

    public final void d(Object obj) {
        this.a.setTag(R.id.glide_custom_view_target_tag, obj);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
        sb.append("Target for: ");
        sb.append(valueOf);
        return sb.toString();
    }
}
