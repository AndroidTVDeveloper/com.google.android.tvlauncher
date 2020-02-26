package p000;

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

/* renamed from: aeh */
/* compiled from: PG */
public final class aeh extends Drawable implements Animatable, aem {

    /* renamed from: a */
    public final aeg f175a;

    /* renamed from: b */
    public boolean f176b;

    /* renamed from: c */
    private boolean f177c;

    /* renamed from: d */
    private boolean f178d;

    /* renamed from: e */
    private boolean f179e;

    /* renamed from: f */
    private int f180f;

    /* renamed from: g */
    private int f181g;

    /* renamed from: h */
    private boolean f182h;

    /* renamed from: i */
    private Paint f183i;

    /* renamed from: j */
    private Rect f184j;

    public aeh(Context context, C0525tj tjVar, C0544ub ubVar, int i, int i2, Bitmap bitmap) {
        this(new aeg(new aeo(C0497si.m8291a(context), tjVar, i, i2, ubVar, bitmap)));
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f175a;
    }

    public final int getOpacity() {
        return -2;
    }

    public final boolean isRunning() {
        return this.f177c;
    }

    public aeh(aeg aeg) {
        this.f179e = true;
        this.f181g = -1;
        this.f175a = (aeg) aic.m542a(aeg);
    }

    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (!this.f176b) {
            if (this.f182h) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m247f());
                this.f182h = false;
            }
            aeo aeo = this.f175a.f174a;
            ael ael = aeo.f195e;
            if (ael == null) {
                bitmap = aeo.f198h;
            } else {
                bitmap = ael.f187b;
            }
            canvas.drawBitmap(bitmap, (Rect) null, m247f(), m248g());
        }
    }

    /* renamed from: b */
    public final ByteBuffer mo99b() {
        return ((C0529tn) this.f175a.f174a.f191a).f10498b.asReadOnlyBuffer();
    }

    /* renamed from: f */
    private final Rect m247f() {
        if (this.f184j == null) {
            this.f184j = new Rect();
        }
        return this.f184j;
    }

    /* renamed from: a */
    public final Bitmap mo98a() {
        return this.f175a.f174a.f198h;
    }

    public final int getIntrinsicHeight() {
        return this.f175a.f174a.f202l;
    }

    public final int getIntrinsicWidth() {
        return this.f175a.f174a.f201k;
    }

    /* renamed from: g */
    private final Paint m248g() {
        if (this.f183i == null) {
            this.f183i = new Paint(2);
        }
        return this.f183i;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f182h = true;
    }

    /* renamed from: c */
    public final void mo100c() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback != null) {
            invalidateSelf();
            aeo aeo = this.f175a.f174a;
            ael ael = aeo.f195e;
            if ((ael != null ? ael.f186a : -1) == aeo.mo116a() - 1) {
                this.f180f++;
            }
            if (this.f181g != -1 && this.f180f >= 0) {
                stop();
                return;
            }
            return;
        }
        stop();
        invalidateSelf();
    }

    public final void setAlpha(int i) {
        m248g().setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        m248g().setColorFilter(colorFilter);
    }

    public final boolean setVisible(boolean z, boolean z2) {
        aic.m546a(!this.f176b, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f179e = z;
        if (!z) {
            m246e();
        } else if (this.f178d) {
            m245d();
        }
        return super.setVisible(z, z2);
    }

    public final void start() {
        this.f178d = true;
        this.f180f = 0;
        if (this.f179e) {
            m245d();
        }
    }

    /* renamed from: d */
    private final void m245d() {
        aic.m546a(!this.f176b, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f175a.f174a.mo116a() == 1) {
            invalidateSelf();
        } else if (!this.f177c) {
            this.f177c = true;
            aeo aeo = this.f175a.f174a;
            if (aeo.f196f) {
                throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
            } else if (!aeo.f192b.contains(this)) {
                boolean isEmpty = aeo.f192b.isEmpty();
                aeo.f192b.add(this);
                if (isEmpty && !aeo.f194d) {
                    aeo.f194d = true;
                    aeo.f196f = false;
                    aeo.mo120c();
                }
                invalidateSelf();
            } else {
                throw new IllegalStateException("Cannot subscribe twice in a row");
            }
        }
    }

    public final void stop() {
        this.f178d = false;
        m246e();
    }

    /* renamed from: e */
    private final void m246e() {
        this.f177c = false;
        aeo aeo = this.f175a.f174a;
        aeo.f192b.remove(this);
        if (aeo.f192b.isEmpty()) {
            aeo.mo119b();
        }
    }
}
