package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.nio.ByteBuffer;

/* renamed from: aeh  reason: default package */
/* compiled from: PG */
public final class aeh extends Drawable implements Animatable, aem {
    public final aeg a;
    public boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private int f;
    private int g;
    private boolean h;
    private Paint i;
    private Rect j;

    public aeh(Context context, tj tjVar, ub ubVar, int i2, int i3, Bitmap bitmap) {
        this(new aeg(new aeo(si.a(context), tjVar, i2, i3, ubVar, bitmap)));
    }

    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    public final int getOpacity() {
        return -2;
    }

    public final boolean isRunning() {
        return this.c;
    }

    public aeh(aeg aeg) {
        this.e = true;
        this.g = -1;
        this.a = (aeg) aic.a(aeg);
    }

    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (!this.b) {
            if (this.h) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), f());
                this.h = false;
            }
            aeo aeo = this.a.a;
            ael ael = aeo.e;
            if (ael == null) {
                bitmap = aeo.h;
            } else {
                bitmap = ael.b;
            }
            canvas.drawBitmap(bitmap, (Rect) null, f(), g());
        }
    }

    public final ByteBuffer b() {
        return ((tn) this.a.a.a).b.asReadOnlyBuffer();
    }

    private final Rect f() {
        if (this.j == null) {
            this.j = new Rect();
        }
        return this.j;
    }

    public final Bitmap a() {
        return this.a.a.h;
    }

    public final int getIntrinsicHeight() {
        return this.a.a.l;
    }

    public final int getIntrinsicWidth() {
        return this.a.a.k;
    }

    private final Paint g() {
        if (this.i == null) {
            this.i = new Paint(2);
        }
        return this.i;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.h = true;
    }

    public final void c() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback != null) {
            invalidateSelf();
            aeo aeo = this.a.a;
            ael ael = aeo.e;
            if ((ael != null ? ael.a : -1) == aeo.a() - 1) {
                this.f++;
            }
            if (this.g != -1 && this.f >= 0) {
                stop();
                return;
            }
            return;
        }
        stop();
        invalidateSelf();
    }

    public final void setAlpha(int i2) {
        g().setAlpha(i2);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        g().setColorFilter(colorFilter);
    }

    public final boolean setVisible(boolean z, boolean z2) {
        aic.a(!this.b, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.e = z;
        if (!z) {
            e();
        } else if (this.d) {
            d();
        }
        return super.setVisible(z, z2);
    }

    public final void start() {
        this.d = true;
        this.f = 0;
        if (this.e) {
            d();
        }
    }

    private final void d() {
        aic.a(!this.b, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.a.a.a() == 1) {
            invalidateSelf();
        } else if (!this.c) {
            this.c = true;
            aeo aeo = this.a.a;
            if (aeo.f) {
                throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
            } else if (!aeo.b.contains(this)) {
                boolean isEmpty = aeo.b.isEmpty();
                aeo.b.add(this);
                if (isEmpty && !aeo.d) {
                    aeo.d = true;
                    aeo.f = false;
                    aeo.c();
                }
                invalidateSelf();
            } else {
                throw new IllegalStateException("Cannot subscribe twice in a row");
            }
        }
    }

    public final void stop() {
        this.d = false;
        e();
    }

    private final void e() {
        this.c = false;
        aeo aeo = this.a.a;
        aeo.b.remove(this);
        if (aeo.b.isEmpty()) {
            aeo.b();
        }
    }
}
