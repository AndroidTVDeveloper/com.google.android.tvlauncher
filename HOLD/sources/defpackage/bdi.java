package defpackage;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;

/* renamed from: bdi  reason: default package */
/* compiled from: PG */
public final class bdi {
    public static final bdi a = new bdi(-1, -16777216, 0, 0, -1, null);
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final Typeface g;

    private bdi(int i, int i2, int i3, int i4, int i5, Typeface typeface) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = typeface;
    }

    public static bdi a(CaptioningManager.CaptionStyle captionStyle) {
        CaptioningManager.CaptionStyle captionStyle2 = captionStyle;
        if (blm.a < 21) {
            return new bdi(captionStyle2.foregroundColor, captionStyle2.backgroundColor, 0, captionStyle2.edgeType, captionStyle2.edgeColor, captionStyle.getTypeface());
        }
        return new bdi(!captionStyle.hasForegroundColor() ? a.b : captionStyle2.foregroundColor, !captionStyle.hasBackgroundColor() ? a.c : captionStyle2.backgroundColor, !captionStyle.hasWindowColor() ? a.d : captionStyle2.windowColor, !captionStyle.hasEdgeType() ? a.e : captionStyle2.edgeType, !captionStyle.hasEdgeColor() ? a.f : captionStyle2.edgeColor, captionStyle.getTypeface());
    }
}
