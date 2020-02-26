package p000;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;

/* renamed from: bdi */
/* compiled from: PG */
public final class bdi {

    /* renamed from: a */
    public static final bdi f3399a = new bdi(-1, -16777216, 0, 0, -1, null);

    /* renamed from: b */
    public final int f3400b;

    /* renamed from: c */
    public final int f3401c;

    /* renamed from: d */
    public final int f3402d;

    /* renamed from: e */
    public final int f3403e;

    /* renamed from: f */
    public final int f3404f;

    /* renamed from: g */
    public final Typeface f3405g;

    private bdi(int i, int i2, int i3, int i4, int i5, Typeface typeface) {
        this.f3400b = i;
        this.f3401c = i2;
        this.f3402d = i3;
        this.f3403e = i4;
        this.f3404f = i5;
        this.f3405g = typeface;
    }

    /* renamed from: a */
    public static bdi m2897a(CaptioningManager.CaptionStyle captionStyle) {
        CaptioningManager.CaptionStyle captionStyle2 = captionStyle;
        if (blm.f4293a < 21) {
            return new bdi(captionStyle2.foregroundColor, captionStyle2.backgroundColor, 0, captionStyle2.edgeType, captionStyle2.edgeColor, captionStyle.getTypeface());
        }
        return new bdi(!captionStyle.hasForegroundColor() ? f3399a.f3400b : captionStyle2.foregroundColor, !captionStyle.hasBackgroundColor() ? f3399a.f3401c : captionStyle2.backgroundColor, !captionStyle.hasWindowColor() ? f3399a.f3402d : captionStyle2.windowColor, !captionStyle.hasEdgeType() ? f3399a.f3403e : captionStyle2.edgeType, !captionStyle.hasEdgeColor() ? f3399a.f3404f : captionStyle2.edgeColor, captionStyle.getTypeface());
    }
}
