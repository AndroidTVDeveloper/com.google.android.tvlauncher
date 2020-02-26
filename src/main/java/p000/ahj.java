package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.tvlauncher.R;

@Deprecated
/* renamed from: ahj */
/* compiled from: PG */
public abstract class ahj extends agu {

    /* renamed from: a */
    public final View f369a;

    /* renamed from: b */
    public final ahi f370b;

    public ahj(View view) {
        this.f369a = (View) aic.m542a(view);
        this.f370b = new ahi(view);
    }

    /* renamed from: d */
    public final agm mo237d() {
        Object tag = this.f369a.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof agm) {
            return (agm) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    /* renamed from: a */
    public final void mo230a(ahf ahf) {
        ahi ahi = this.f370b;
        int c = ahi.mo259c();
        int b = ahi.mo258b();
        if (!ahi.m511a(c, b)) {
            if (!ahi.f367b.contains(ahf)) {
                ahi.f367b.add(ahf);
            }
            if (ahi.f368c == null) {
                ViewTreeObserver viewTreeObserver = ahi.f366a.getViewTreeObserver();
                ahi.f368c = new ahh(ahi);
                viewTreeObserver.addOnPreDrawListener(ahi.f368c);
                return;
            }
            return;
        }
        ahf.mo245a(c, b);
    }

    /* renamed from: b */
    public final void mo232b(ahf ahf) {
        this.f370b.f367b.remove(ahf);
    }

    /* renamed from: a */
    public void mo229a(agm agm) {
        mo260d(agm);
    }

    /* renamed from: d */
    public final void mo260d(Object obj) {
        this.f369a.setTag(R.id.glide_custom_view_target_tag, obj);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f369a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
        sb.append("Target for: ");
        sb.append(valueOf);
        return sb.toString();
    }
}
