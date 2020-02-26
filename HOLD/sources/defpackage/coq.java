package defpackage;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: coq  reason: default package */
/* compiled from: PG */
final class coq extends ahb {
    private final /* synthetic */ boolean c;
    private final /* synthetic */ int d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public coq(ImageView imageView, boolean z, int i) {
        super(imageView);
        this.c = z;
        this.d = i;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            ((ImageView) this.a).setImageBitmap(bitmap);
            if (this.c || !bitmap.hasAlpha()) {
                ((ImageView) this.a).setBackground(null);
            } else {
                ((ImageView) this.a).setBackgroundColor(this.d);
            }
        } else {
            ((ImageView) this.a).setImageDrawable(null);
            ((ImageView) this.a).setBackgroundColor(this.d);
        }
    }
}
