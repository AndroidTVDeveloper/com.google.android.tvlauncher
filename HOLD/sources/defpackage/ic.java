package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* renamed from: ic  reason: default package */
/* compiled from: PG */
final class ic extends et {
    public boolean b = true;

    public ic(Drawable drawable) {
        super(drawable);
    }

    public final void draw(Canvas canvas) {
        if (this.b) {
            super.draw(canvas);
        }
    }

    public final void setHotspot(float f, float f2) {
        if (this.b) {
            super.setHotspot(f, f2);
        }
    }

    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.b) {
            super.setHotspotBounds(i, i2, i3, i4);
        }
    }

    public final boolean setState(int[] iArr) {
        if (this.b) {
            return super.setState(iArr);
        }
        return false;
    }

    public final boolean setVisible(boolean z, boolean z2) {
        if (this.b) {
            return super.setVisible(z, z2);
        }
        return false;
    }
}
