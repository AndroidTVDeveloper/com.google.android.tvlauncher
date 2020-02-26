package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.support.p002v7.widget.ActionBarContainer;

/* renamed from: ge */
/* compiled from: PG */
public final class C0169ge extends Drawable {

    /* renamed from: a */
    private final ActionBarContainer f9393a;

    public C0169ge(ActionBarContainer actionBarContainer) {
        this.f9393a = actionBarContainer;
    }

    public final int getOpacity() {
        return 0;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f9393a;
        if (actionBarContainer.f982d) {
            Drawable drawable = actionBarContainer.f981c;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f979a;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (this.f9393a.f980b == null) {
        }
    }

    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f9393a;
        if (actionBarContainer.f982d) {
            Drawable drawable = actionBarContainer.f981c;
            if (drawable != null) {
                drawable.getOutline(outline);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f979a;
        if (drawable2 != null) {
            drawable2.getOutline(outline);
        }
    }
}
