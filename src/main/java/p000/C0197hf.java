package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;

/* renamed from: hf */
/* compiled from: PG */
public class C0197hf extends ImageView {

    /* renamed from: a */
    private final C0189gy f9456a;

    /* renamed from: b */
    private final C0196he f9457b;

    public C0197hf(Context context) {
        this(context, 0);
    }

    public C0197hf(Context context, int i) {
        super(C0295kw.m7862a(context), null, i);
        C0189gy gyVar = new C0189gy(this);
        this.f9456a = gyVar;
        gyVar.mo5101a(null, i);
        C0196he heVar = new C0196he(this);
        this.f9457b = heVar;
        heVar.mo5127b(i);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0189gy gyVar = this.f9456a;
        if (gyVar != null) {
            gyVar.mo5099a();
        }
        C0196he heVar = this.f9457b;
        if (heVar != null) {
            heVar.mo5126b();
        }
    }

    public final boolean hasOverlappingRendering() {
        return this.f9457b.mo5125a() && super.hasOverlappingRendering();
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0189gy gyVar = this.f9456a;
        if (gyVar != null) {
            gyVar.mo5102b();
        }
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0189gy gyVar = this.f9456a;
        if (gyVar != null) {
            gyVar.mo5100a(i);
        }
    }

    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0196he heVar = this.f9457b;
        if (heVar != null) {
            heVar.mo5126b();
        }
    }

    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0196he heVar = this.f9457b;
        if (heVar != null) {
            heVar.mo5126b();
        }
    }

    public final void setImageResource(int i) {
        C0196he heVar = this.f9457b;
        if (heVar != null) {
            heVar.mo5124a(i);
        }
    }

    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0196he heVar = this.f9457b;
        if (heVar != null) {
            heVar.mo5126b();
        }
    }
}
