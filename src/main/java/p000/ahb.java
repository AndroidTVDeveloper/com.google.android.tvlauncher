package p000;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: ahb */
/* compiled from: PG */
public abstract class ahb extends ahj {

    /* renamed from: c */
    private Animatable f359c;

    public ahb(ImageView imageView) {
        super(imageView);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo246b(Object obj);

    /* renamed from: a */
    public final void mo113a(Drawable drawable) {
        this.f370b.mo257a();
        Animatable animatable = this.f359c;
        if (animatable != null) {
            animatable.stop();
        }
        mo253c((Object) null);
        mo254d(drawable);
    }

    /* renamed from: c */
    public void mo235c(Drawable drawable) {
        mo253c((Object) null);
        mo254d(drawable);
    }

    /* renamed from: b */
    public final void mo233b(Drawable drawable) {
        mo253c((Object) null);
        mo254d(drawable);
    }

    /* renamed from: a */
    public void mo114a(Object obj) {
        mo253c(obj);
    }

    /* renamed from: a */
    public final void mo158a() {
        Animatable animatable = this.f359c;
        if (animatable != null) {
            animatable.start();
        }
    }

    /* renamed from: b */
    public final void mo159b() {
        Animatable animatable = this.f359c;
        if (animatable != null) {
            animatable.stop();
        }
    }

    /* renamed from: d */
    public final void mo254d(Drawable drawable) {
        ((ImageView) this.f369a).setImageDrawable(drawable);
    }

    /* renamed from: c */
    public final void mo253c(Object obj) {
        mo246b(obj);
        if (obj instanceof Animatable) {
            Animatable animatable = (Animatable) obj;
            this.f359c = animatable;
            animatable.start();
            return;
        }
        this.f359c = null;
    }
}
