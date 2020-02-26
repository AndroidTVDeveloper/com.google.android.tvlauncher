package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageButton;
import com.google.android.tvlauncher.R;

/* renamed from: hd  reason: default package */
/* compiled from: PG */
public final class hd extends ImageButton {
    private final gy a;
    private final he b;

    public hd(Context context) {
        super(kw.a(context), null, R.attr.toolbarNavigationButtonStyle);
        gy gyVar = new gy(this);
        this.a = gyVar;
        gyVar.a(null, R.attr.toolbarNavigationButtonStyle);
        he heVar = new he(this);
        this.b = heVar;
        heVar.b(R.attr.toolbarNavigationButtonStyle);
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
        this.b.a(i);
    }

    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        he heVar = this.b;
        if (heVar != null) {
            heVar.b();
        }
    }
}
