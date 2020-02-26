package p000;

import android.graphics.ColorFilter;
import android.widget.ImageView;

/* renamed from: cux */
/* compiled from: PG */
public final class cux {

    /* renamed from: a */
    public float f7612a;

    /* renamed from: b */
    private final ImageView f7613b;

    /* renamed from: c */
    private final float f7614c;

    /* renamed from: d */
    private final float f7615d;

    public cux(ImageView imageView, float f, float f2) {
        this.f7613b = imageView;
        this.f7614c = f;
        this.f7615d = f2;
    }

    /* renamed from: a */
    public final void mo3780a(int i) {
        float f = 0.0f;
        if (i == 1) {
            f = this.f7614c;
            this.f7612a = f;
        } else if (i == 2) {
            f = this.f7615d;
            this.f7612a = f;
        } else {
            this.f7612a = 0.0f;
        }
        if (f >= 0.01f) {
            this.f7613b.setColorFilter(dej.m6252b(-16777216, f));
        } else {
            this.f7613b.setColorFilter((ColorFilter) null);
        }
    }
}
