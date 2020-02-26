package defpackage;

import android.graphics.drawable.Drawable;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;

/* renamed from: chi  reason: default package */
/* compiled from: PG */
public final class chi extends ahb {
    private final /* synthetic */ chm c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public chi(chm chm, ImageView imageView) {
        super(imageView);
        this.c = chm;
    }

    public final void c(Drawable drawable) {
        super.c(drawable);
        this.c.p = false;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        cjj cjj = (cjj) obj;
        if (cjj != null) {
            this.c.c.setImageBitmap(cjj.b);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration((long) this.c.g);
            alphaAnimation.setFillAfter(true);
            int a = cjj.a.a(-1);
            this.c.b.getProgressDrawable().setTint(a);
            this.c.b.getIndeterminateDrawable().setTint(a);
            chm.a(this.c.c, alphaAnimation);
        }
    }
}
