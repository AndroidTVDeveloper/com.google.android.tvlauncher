package p000;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.tvlauncher.R;

/* renamed from: agz */
/* compiled from: PG */
public final class agz implements ahg {

    /* renamed from: a */
    private final agy f355a;

    /* renamed from: b */
    private final View f356b;

    public agz(View view) {
        this.f356b = (View) aic.m542a(view);
        this.f355a = new agy(view);
    }

    /* renamed from: a */
    public final void mo158a() {
    }

    /* renamed from: a */
    public final void mo114a(Object obj) {
    }

    /* renamed from: b */
    public final void mo159b() {
    }

    /* renamed from: b */
    public final void mo233b(Drawable drawable) {
    }

    /* renamed from: c */
    public final void mo160c() {
    }

    /* renamed from: c */
    public final void mo235c(Drawable drawable) {
    }

    /* renamed from: d */
    public final agm mo237d() {
        Object tag = this.f356b.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof agm) {
            return (agm) tag;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    /* renamed from: a */
    public final void mo230a(ahf ahf) {
        agy agy = this.f355a;
        int c = agy.mo250c();
        int b = agy.mo249b();
        if (!agy.m470a(c, b)) {
            if (!agy.f353b.contains(ahf)) {
                agy.f353b.add(ahf);
            }
            if (agy.f354c == null) {
                ViewTreeObserver viewTreeObserver = agy.f352a.getViewTreeObserver();
                agy.f354c = new agx(agy);
                viewTreeObserver.addOnPreDrawListener(agy.f354c);
                return;
            }
            return;
        }
        ahf.mo245a(c, b);
    }

    /* renamed from: a */
    public final void mo113a(Drawable drawable) {
        this.f355a.mo248a();
    }

    /* renamed from: b */
    public final void mo232b(ahf ahf) {
        this.f355a.f353b.remove(ahf);
    }

    /* renamed from: a */
    public final void mo229a(agm agm) {
        this.f356b.setTag(R.id.glide_custom_view_target_tag, agm);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f356b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
        sb.append("Target for: ");
        sb.append(valueOf);
        return sb.toString();
    }
}
