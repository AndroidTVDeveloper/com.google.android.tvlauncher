package defpackage;

import android.view.animation.AlphaAnimation;
import android.widget.ImageView;

/* renamed from: chj  reason: default package */
/* compiled from: PG */
public final class chj extends ahb {
    private final /* synthetic */ chm c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public chj(chm chm, ImageView imageView) {
        super(imageView);
        this.c = chm;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        cjj cjj = (cjj) obj;
        if (cjj != null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration((long) this.c.g);
            alphaAnimation.setFillAfter(true);
            this.c.c.setImageBitmap(cjj.b);
            chm.a(this.c.c, alphaAnimation);
        }
    }
}
