package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;

/* renamed from: cry  reason: default package */
/* compiled from: PG */
final class cry extends ctm {
    private final /* synthetic */ crz c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cry(crz crz, ImageView imageView) {
        super(imageView);
        this.c = crz;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ctn ctn = (ctn) obj;
        if (ctn != null) {
            ((ImageView) this.a).setImageBitmap(ctn.a);
            crz crz = this.c;
            crz.t = ctn.c;
            crz.u = new BitmapDrawable(crz.b.getResources(), ctn.b);
        } else {
            ((ImageView) this.a).setImageDrawable(null);
        }
        crz crz2 = this.c;
        if (crz2.g) {
            crz2.e();
        } else {
            crz2.f();
        }
    }
}
