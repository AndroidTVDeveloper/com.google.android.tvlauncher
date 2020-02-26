package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: et */
/* compiled from: PG */
public class C0130et extends Drawable implements Drawable.Callback {

    /* renamed from: a */
    public final Drawable f9184a;

    public C0130et(Drawable drawable) {
        Drawable drawable2 = this.f9184a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f9184a = drawable;
        drawable.setCallback(this);
    }

    public void draw(Canvas canvas) {
        this.f9184a.draw(canvas);
    }

    public final int getChangingConfigurations() {
        return this.f9184a.getChangingConfigurations();
    }

    public final Drawable getCurrent() {
        return this.f9184a.getCurrent();
    }

    public final int getIntrinsicHeight() {
        return this.f9184a.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.f9184a.getIntrinsicWidth();
    }

    public final int getMinimumHeight() {
        return this.f9184a.getMinimumHeight();
    }

    public final int getMinimumWidth() {
        return this.f9184a.getMinimumWidth();
    }

    public final int getOpacity() {
        return this.f9184a.getOpacity();
    }

    public final boolean getPadding(Rect rect) {
        return this.f9184a.getPadding(rect);
    }

    public final int[] getState() {
        return this.f9184a.getState();
    }

    public final Region getTransparentRegion() {
        return this.f9184a.getTransparentRegion();
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final boolean isAutoMirrored() {
        return C0045bq.m3949a(this.f9184a);
    }

    public final boolean isStateful() {
        return this.f9184a.isStateful();
    }

    public final void jumpToCurrentState() {
        this.f9184a.jumpToCurrentState();
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        this.f9184a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i) {
        return this.f9184a.setLevel(i);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public final void setAlpha(int i) {
        this.f9184a.setAlpha(i);
    }

    public final void setAutoMirrored(boolean z) {
        C0045bq.m3947a(this.f9184a, z);
    }

    public final void setChangingConfigurations(int i) {
        this.f9184a.setChangingConfigurations(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f9184a.setColorFilter(colorFilter);
    }

    public final void setDither(boolean z) {
        this.f9184a.setDither(z);
    }

    public final void setFilterBitmap(boolean z) {
        this.f9184a.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        C0045bq.m3942a(this.f9184a, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C0045bq.m3944a(this.f9184a, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f9184a.setState(iArr);
    }

    public final void setTint(int i) {
        C0045bq.m3943a(this.f9184a, i);
    }

    public final void setTintList(ColorStateList colorStateList) {
        C0045bq.m3945a(this.f9184a, colorStateList);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        C0045bq.m3946a(this.f9184a, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f9184a.setVisible(z, z2);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
