package defpackage;

import android.graphics.ColorFilter;
import android.widget.ImageView;

/* renamed from: cux  reason: default package */
/* compiled from: PG */
public final class cux {
    public float a;
    private final ImageView b;
    private final float c;
    private final float d;

    public cux(ImageView imageView, float f, float f2) {
        this.b = imageView;
        this.c = f;
        this.d = f2;
    }

    public final void a(int i) {
        float f = 0.0f;
        if (i == 1) {
            f = this.c;
            this.a = f;
        } else if (i == 2) {
            f = this.d;
            this.a = f;
        } else {
            this.a = 0.0f;
        }
        if (f >= 0.01f) {
            this.b.setColorFilter(dej.b(-16777216, f));
        } else {
            this.b.setColorFilter((ColorFilter) null);
        }
    }
}
