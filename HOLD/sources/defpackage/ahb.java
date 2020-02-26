package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: ahb  reason: default package */
/* compiled from: PG */
public abstract class ahb extends ahj {
    private Animatable c;

    public ahb(ImageView imageView) {
        super(imageView);
    }

    /* access modifiers changed from: protected */
    public abstract void b(Object obj);

    public final void a(Drawable drawable) {
        this.b.a();
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
        c((Object) null);
        d(drawable);
    }

    public void c(Drawable drawable) {
        c((Object) null);
        d(drawable);
    }

    public final void b(Drawable drawable) {
        c((Object) null);
        d(drawable);
    }

    public void a(Object obj) {
        c(obj);
    }

    public final void a() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.start();
        }
    }

    public final void b() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public final void d(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    public final void c(Object obj) {
        b(obj);
        if (obj instanceof Animatable) {
            Animatable animatable = (Animatable) obj;
            this.c = animatable;
            animatable.start();
            return;
        }
        this.c = null;
    }
}
