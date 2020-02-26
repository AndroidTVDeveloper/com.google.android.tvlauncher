package p000;

import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;

/* renamed from: cry */
/* compiled from: PG */
final class cry extends ctm {

    /* renamed from: c */
    private final /* synthetic */ crz f7082c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cry(crz crz, ImageView imageView) {
        super(imageView);
        this.f7082c = crz;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo246b(Object obj) {
        ctn ctn = (ctn) obj;
        if (ctn != null) {
            ((ImageView) this.f369a).setImageBitmap(ctn.f7391a);
            crz crz = this.f7082c;
            crz.f7151t = ctn.f7393c;
            crz.f7152u = new BitmapDrawable(crz.f7133b.getResources(), ctn.f7392b);
        } else {
            ((ImageView) this.f369a).setImageDrawable(null);
        }
        crz crz2 = this.f7082c;
        if (crz2.f7138g) {
            crz2.mo3684e();
        } else {
            crz2.mo3685f();
        }
    }
}
