package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: he  reason: default package */
/* compiled from: PG */
public final class he {
    private final ImageView a;

    public he(ImageView imageView) {
        this.a = imageView;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            ib.a();
        }
        if (drawable != null) {
            int i = Build.VERSION.SDK_INT;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        Drawable background = this.a.getBackground();
        int i = Build.VERSION.SDK_INT;
        return !(background instanceof RippleDrawable);
    }

    public final void b(int i) {
        int e;
        kz a2 = kz.a(this.a.getContext(), null, er.e, i);
        try {
            Drawable drawable = this.a.getDrawable();
            if (!(drawable != null || (e = a2.e(1, -1)) == -1 || (drawable = es.b(this.a.getContext(), e)) == null)) {
                this.a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                ib.a();
            }
            if (a2.e(2)) {
                ImageView imageView = this.a;
                ColorStateList d = a2.d(2);
                int i2 = Build.VERSION.SDK_INT;
                imageView.setImageTintList(d);
                int i3 = Build.VERSION.SDK_INT;
            }
            if (a2.e(3)) {
                ImageView imageView2 = this.a;
                PorterDuff.Mode a3 = ib.a(a2.a(3, -1), null);
                int i4 = Build.VERSION.SDK_INT;
                imageView2.setImageTintMode(a3);
                int i5 = Build.VERSION.SDK_INT;
            }
        } finally {
            a2.a();
        }
    }

    public final void a(int i) {
        if (i != 0) {
            Drawable b = es.b(this.a.getContext(), i);
            if (b != null) {
                ib.a();
            }
            this.a.setImageDrawable(b);
        } else {
            this.a.setImageDrawable(null);
        }
        b();
    }
}
