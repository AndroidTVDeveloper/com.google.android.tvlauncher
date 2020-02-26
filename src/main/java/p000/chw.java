package p000;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.tvlauncher.R;

/* renamed from: chw */
/* compiled from: PG */
final class chw extends ahb {
    public chw(ImageView imageView) {
        super(imageView);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo114a(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (!(drawable instanceof BitmapDrawable) || !((BitmapDrawable) drawable).getBitmap().hasAlpha()) {
            ((ImageView) this.f369a).setBackground(null);
        } else {
            ImageView imageView = (ImageView) this.f369a;
            imageView.setBackgroundColor(C0035bg.m3116b(imageView.getContext(), R.color.app_banner_background_color));
        }
        mo253c((Object) drawable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo246b(Object obj) {
        mo254d((Drawable) obj);
    }
}
