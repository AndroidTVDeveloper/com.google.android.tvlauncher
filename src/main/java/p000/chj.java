package p000;

import android.view.animation.AlphaAnimation;
import android.widget.ImageView;

/* renamed from: chj */
/* compiled from: PG */
public final class chj extends ahb {

    /* renamed from: c */
    private final /* synthetic */ chm f5530c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public chj(chm chm, ImageView imageView) {
        super(imageView);
        this.f5530c = chm;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo246b(Object obj) {
        cjj cjj = (cjj) obj;
        if (cjj != null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration((long) this.f5530c.f5541g);
            alphaAnimation.setFillAfter(true);
            this.f5530c.f5537c.setImageBitmap(cjj.f5714b);
            chm.m4736a(this.f5530c.f5537c, alphaAnimation);
        }
    }
}
