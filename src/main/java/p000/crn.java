package p000;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: crn */
/* compiled from: PG */
final class crn extends ctm {
    public crn(ImageView imageView) {
        super(imageView);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo246b(Object obj) {
        Drawable drawable = (Drawable) obj;
        ((ImageView) this.f369a).setImageDrawable(drawable);
        if (drawable != null) {
            ((ImageView) this.f369a).setBackground(null);
        }
    }
}
