package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.tvlauncher.R;

/* renamed from: chw  reason: default package */
/* compiled from: PG */
final class chw extends ahb {
    public chw(ImageView imageView) {
        super(imageView);
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (!(drawable instanceof BitmapDrawable) || !((BitmapDrawable) drawable).getBitmap().hasAlpha()) {
            ((ImageView) this.a).setBackground(null);
        } else {
            ImageView imageView = (ImageView) this.a;
            imageView.setBackgroundColor(bg.b(imageView.getContext(), R.color.app_banner_background_color));
        }
        c((Object) drawable);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        d((Drawable) obj);
    }
}
