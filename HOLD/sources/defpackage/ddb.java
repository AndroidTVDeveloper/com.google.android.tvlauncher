package defpackage;

import android.content.Context;
import android.graphics.Bitmap;

/* renamed from: ddb  reason: default package */
/* compiled from: PG */
public final class ddb implements aew {
    private final xg a;

    public ddb(Context context) {
        this.a = si.a(context).a;
    }

    public final ww a(ww wwVar, tx txVar) {
        Bitmap bitmap = (Bitmap) wwVar.b();
        return new dda(new dcz(bitmap, pp.a(bitmap).a()), this.a);
    }
}
