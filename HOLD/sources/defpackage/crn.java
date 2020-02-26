package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: crn  reason: default package */
/* compiled from: PG */
final class crn extends ctm {
    public crn(ImageView imageView) {
        super(imageView);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Drawable drawable = (Drawable) obj;
        ((ImageView) this.a).setImageDrawable(drawable);
        if (drawable != null) {
            ((ImageView) this.a).setBackground(null);
        }
    }
}
