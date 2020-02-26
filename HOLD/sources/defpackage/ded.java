package defpackage;

import android.util.FloatProperty;
import android.view.View;

/* renamed from: ded  reason: default package */
/* compiled from: PG */
abstract class ded extends FloatProperty {
    public float a;
    private final float b;
    private float c;
    private float d = ((float) Math.pow((double) this.d, 2.2d));
    private float e = ((float) Math.pow((double) this.e, 2.2d));
    private final float f;
    private final float g;
    private final float h;
    private final float i;

    public ded(int i2, int i3) {
        super("Color");
        this.b = ((float) (i2 >>> 24)) / 255.0f;
        float f2 = ((float) ((i2 >> 16) & 255)) / 255.0f;
        this.c = f2;
        this.d = ((float) ((i2 >> 8) & 255)) / 255.0f;
        this.e = ((float) (i2 & 255)) / 255.0f;
        this.c = (float) Math.pow((double) f2, 2.2d);
        double pow = Math.pow((double) (((float) ((i3 >> 16) & 255)) / 255.0f), 2.2d);
        double pow2 = Math.pow((double) (((float) ((i3 >> 8) & 255)) / 255.0f), 2.2d);
        double pow3 = Math.pow((double) (((float) (i3 & 255)) / 255.0f), 2.2d);
        this.f = (((float) (i3 >>> 24)) / 255.0f) - this.b;
        this.g = ((float) pow) - this.c;
        this.h = ((float) pow2) - this.d;
        this.i = ((float) pow3) - this.e;
    }

    /* access modifiers changed from: protected */
    public final int a(float f2) {
        float f3 = this.b;
        float f4 = this.f;
        float f5 = this.c;
        float f6 = this.g;
        float f7 = this.d;
        float f8 = this.h;
        float f9 = this.e;
        float f10 = this.i;
        double pow = Math.pow((double) (f5 + (f6 * f2)), 0.45454545454545453d);
        double pow2 = Math.pow((double) (f7 + (f8 * f2)), 0.45454545454545453d);
        double pow3 = Math.pow((double) (f9 + (f10 * f2)), 0.45454545454545453d);
        return Math.round(((float) pow3) * 255.0f) | (Math.round((f3 + (f2 * f4)) * 255.0f) << 24) | (Math.round(((float) pow) * 255.0f) << 16) | (Math.round(((float) pow2) * 255.0f) << 8);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        View view = (View) obj;
        return Float.valueOf(this.a);
    }
}
