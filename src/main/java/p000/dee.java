package p000;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* renamed from: dee */
/* compiled from: PG */
final class dee implements TypeEvaluator {

    /* renamed from: a */
    private final Rect f8373a = new Rect();

    private dee() {
    }

    public /* synthetic */ dee(byte b) {
    }

    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        Rect rect = (Rect) obj;
        Rect rect2 = (Rect) obj2;
        float f2 = ((float) rect.left) + (((float) (rect2.left - rect.left)) * f);
        float f3 = ((float) rect.right) + (((float) (rect2.right - rect.right)) * f);
        float f4 = ((float) rect.top) + (((float) (rect2.top - rect.top)) * f);
        float f5 = ((float) rect.bottom) + (((float) (rect2.bottom - rect.bottom)) * f);
        if (f > 0.9f) {
            this.f8373a.left = Math.round(f2);
            this.f8373a.right = Math.round(f3);
            this.f8373a.top = Math.round(f4);
            this.f8373a.bottom = Math.round(f5);
        } else {
            this.f8373a.left = (int) f2;
            this.f8373a.right = (int) f3;
            this.f8373a.top = (int) f4;
            this.f8373a.bottom = (int) f5;
        }
        return this.f8373a;
    }
}
