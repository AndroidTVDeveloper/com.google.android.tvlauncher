package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: he */
/* compiled from: PG */
public final class C0196he {

    /* renamed from: a */
    private final ImageView f9455a;

    public C0196he(ImageView imageView) {
        this.f9455a = imageView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo5126b() {
        Drawable drawable = this.f9455a.getDrawable();
        if (drawable != null) {
            C0220ib.m7560a();
        }
        if (drawable != null) {
            int i = Build.VERSION.SDK_INT;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo5125a() {
        Drawable background = this.f9455a.getBackground();
        int i = Build.VERSION.SDK_INT;
        return !(background instanceof RippleDrawable);
    }

    /* renamed from: b */
    public final void mo5127b(int i) {
        int e;
        C0298kz a = C0298kz.m7865a(this.f9455a.getContext(), null, C0128er.f9167e, i);
        try {
            Drawable drawable = this.f9455a.getDrawable();
            if (!(drawable != null || (e = a.mo5521e(1, -1)) == -1 || (drawable = C0129es.m7262b(this.f9455a.getContext(), e)) == null)) {
                this.f9455a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0220ib.m7560a();
            }
            if (a.mo5522e(2)) {
                ImageView imageView = this.f9455a;
                ColorStateList d = a.mo5520d(2);
                int i2 = Build.VERSION.SDK_INT;
                imageView.setImageTintList(d);
                int i3 = Build.VERSION.SDK_INT;
            }
            if (a.mo5522e(3)) {
                ImageView imageView2 = this.f9455a;
                PorterDuff.Mode a2 = C0220ib.m7558a(a.mo5511a(3, -1), null);
                int i4 = Build.VERSION.SDK_INT;
                imageView2.setImageTintMode(a2);
                int i5 = Build.VERSION.SDK_INT;
            }
        } finally {
            a.mo5513a();
        }
    }

    /* renamed from: a */
    public final void mo5124a(int i) {
        if (i != 0) {
            Drawable b = C0129es.m7262b(this.f9455a.getContext(), i);
            if (b != null) {
                C0220ib.m7560a();
            }
            this.f9455a.setImageDrawable(b);
        } else {
            this.f9455a.setImageDrawable(null);
        }
        mo5126b();
    }
}
