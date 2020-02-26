package p000;

import android.graphics.drawable.Drawable;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;

/* renamed from: chi */
/* compiled from: PG */
public final class chi extends ahb {

    /* renamed from: c */
    private final /* synthetic */ chm f5529c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public chi(chm chm, ImageView imageView) {
        super(imageView);
        this.f5529c = chm;
    }

    /* renamed from: c */
    public final void mo235c(Drawable drawable) {
        super.mo235c(drawable);
        this.f5529c.f5550p = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo246b(Object obj) {
        cjj cjj = (cjj) obj;
        if (cjj != null) {
            this.f5529c.f5537c.setImageBitmap(cjj.f5714b);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration((long) this.f5529c.f5541g);
            alphaAnimation.setFillAfter(true);
            int a = cjj.f5713a.mo5752a(-1);
            this.f5529c.f5536b.getProgressDrawable().setTint(a);
            this.f5529c.f5536b.getIndeterminateDrawable().setTint(a);
            chm.m4736a(this.f5529c.f5537c, alphaAnimation);
        }
    }
}
