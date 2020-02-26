package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;

/* renamed from: hf  reason: default package */
/* compiled from: PG */
public class hf extends ImageView {
    private final gy a;
    private final he b;

    public hf(Context context) {
        this(context, 0);
    }

    public hf(Context context, int i) {
        super(kw.a(context), null, i);
        gy gyVar = new gy(this);
        this.a = gyVar;
        gyVar.a(null, i);
        he heVar = new he(this);
        this.b = heVar;
        heVar.b(i);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        gy gyVar = this.a;
        if (gyVar != null) {
            gyVar.a();
        }
        he heVar = this.b;
        if (heVar != null) {
            heVar.b();
        }
    }

    public final boolean hasOverlappingRendering() {
        return this.b.a() && super.hasOverlappingRendering();
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        gy gyVar = this.a;
        if (gyVar != null) {
            gyVar.b();
        }
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        gy gyVar = this.a;
        if (gyVar != null) {
            gyVar.a(i);
        }
    }

    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        he heVar = this.b;
        if (heVar != null) {
            heVar.b();
        }
    }

    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        he heVar = this.b;
        if (heVar != null) {
            heVar.b();
        }
    }

    public final void setImageResource(int i) {
        he heVar = this.b;
        if (heVar != null) {
            heVar.a(i);
        }
    }

    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        he heVar = this.b;
        if (heVar != null) {
            heVar.b();
        }
    }
}
