package defpackage;

import android.content.Context;
import android.graphics.Bitmap;

/* renamed from: acg  reason: default package */
/* compiled from: PG */
public abstract class acg implements ub {
    /* access modifiers changed from: protected */
    public abstract Bitmap a(xg xgVar, Bitmap bitmap, int i, int i2);

    public final ww a(Context context, ww wwVar, int i, int i2) {
        if (aie.a(i, i2)) {
            xg xgVar = si.a(context).a;
            Bitmap bitmap = (Bitmap) wwVar.b();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap a = a(xgVar, bitmap, i, i2);
            return !bitmap.equals(a) ? acf.a(a, xgVar) : wwVar;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("Cannot apply transformation on width: ");
        sb.append(i);
        sb.append(" or height: ");
        sb.append(i2);
        sb.append(" less than or equal to zero and not Target.SIZE_ORIGINAL");
        throw new IllegalArgumentException(sb.toString());
    }
}
