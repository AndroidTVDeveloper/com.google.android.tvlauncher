package p000;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: coq */
/* compiled from: PG */
final class coq extends ahb {

    /* renamed from: c */
    private final /* synthetic */ boolean f6806c;

    /* renamed from: d */
    private final /* synthetic */ int f6807d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public coq(ImageView imageView, boolean z, int i) {
        super(imageView);
        this.f6806c = z;
        this.f6807d = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo246b(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            ((ImageView) this.f369a).setImageBitmap(bitmap);
            if (this.f6806c || !bitmap.hasAlpha()) {
                ((ImageView) this.f369a).setBackground(null);
            } else {
                ((ImageView) this.f369a).setBackgroundColor(this.f6807d);
            }
        } else {
            ((ImageView) this.f369a).setImageDrawable(null);
            ((ImageView) this.f369a).setBackgroundColor(this.f6807d);
        }
    }
}
