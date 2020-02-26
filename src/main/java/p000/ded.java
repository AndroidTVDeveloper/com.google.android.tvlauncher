package p000;

import android.util.FloatProperty;
import android.view.View;

/* renamed from: ded */
/* compiled from: PG */
abstract class ded extends FloatProperty {

    /* renamed from: a */
    public float f8364a;

    /* renamed from: b */
    private final float f8365b;

    /* renamed from: c */
    private float f8366c;

    /* renamed from: d */
    private float f8367d = ((float) Math.pow((double) this.f8367d, 2.2d));

    /* renamed from: e */
    private float f8368e = ((float) Math.pow((double) this.f8368e, 2.2d));

    /* renamed from: f */
    private final float f8369f;

    /* renamed from: g */
    private final float f8370g;

    /* renamed from: h */
    private final float f8371h;

    /* renamed from: i */
    private final float f8372i;

    public ded(int i, int i2) {
        super("Color");
        this.f8365b = ((float) (i >>> 24)) / 255.0f;
        float f = ((float) ((i >> 16) & 255)) / 255.0f;
        this.f8366c = f;
        this.f8367d = ((float) ((i >> 8) & 255)) / 255.0f;
        this.f8368e = ((float) (i & 255)) / 255.0f;
        this.f8366c = (float) Math.pow((double) f, 2.2d);
        double pow = Math.pow((double) (((float) ((i2 >> 16) & 255)) / 255.0f), 2.2d);
        double pow2 = Math.pow((double) (((float) ((i2 >> 8) & 255)) / 255.0f), 2.2d);
        double pow3 = Math.pow((double) (((float) (i2 & 255)) / 255.0f), 2.2d);
        this.f8369f = (((float) (i2 >>> 24)) / 255.0f) - this.f8365b;
        this.f8370g = ((float) pow) - this.f8366c;
        this.f8371h = ((float) pow2) - this.f8367d;
        this.f8372i = ((float) pow3) - this.f8368e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo4179a(float f) {
        float f2 = this.f8365b;
        float f3 = this.f8369f;
        float f4 = this.f8366c;
        float f5 = this.f8370g;
        float f6 = this.f8367d;
        float f7 = this.f8371h;
        float f8 = this.f8368e;
        float f9 = this.f8372i;
        double pow = Math.pow((double) (f4 + (f5 * f)), 0.45454545454545453d);
        double pow2 = Math.pow((double) (f6 + (f7 * f)), 0.45454545454545453d);
        double pow3 = Math.pow((double) (f8 + (f9 * f)), 0.45454545454545453d);
        return Math.round(((float) pow3) * 255.0f) | (Math.round((f2 + (f * f3)) * 255.0f) << 24) | (Math.round(((float) pow) * 255.0f) << 16) | (Math.round(((float) pow2) * 255.0f) << 8);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        View view = (View) obj;
        return Float.valueOf(this.f8364a);
    }
}
