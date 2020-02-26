package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionBarContainer;

/* renamed from: ge  reason: default package */
/* compiled from: PG */
public final class ge extends Drawable {
    private final ActionBarContainer a;

    public ge(ActionBarContainer actionBarContainer) {
        this.a = actionBarContainer;
    }

    public final int getOpacity() {
        return 0;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.a;
        if (actionBarContainer.d) {
            Drawable drawable = actionBarContainer.c;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.a;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (this.a.b == null) {
        }
    }

    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.a;
        if (actionBarContainer.d) {
            Drawable drawable = actionBarContainer.c;
            if (drawable != null) {
                drawable.getOutline(outline);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.a;
        if (drawable2 != null) {
            drawable2.getOutline(outline);
        }
    }
}
