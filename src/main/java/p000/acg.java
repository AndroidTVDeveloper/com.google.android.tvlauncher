package p000;

import android.content.Context;
import android.graphics.Bitmap;

/* renamed from: acg */
/* compiled from: PG */
public abstract class acg implements C0544ub {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Bitmap mo42a(C0630xg xgVar, Bitmap bitmap, int i, int i2);

    /* renamed from: a */
    public final C0619ww mo36a(Context context, C0619ww wwVar, int i, int i2) {
        if (aie.m560a(i, i2)) {
            C0630xg xgVar = C0497si.m8291a(context).f10362a;
            Bitmap bitmap = (Bitmap) wwVar.mo33b();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap a = mo42a(xgVar, bitmap, i, i2);
            return !bitmap.equals(a) ? acf.m107a(a, xgVar) : wwVar;
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
