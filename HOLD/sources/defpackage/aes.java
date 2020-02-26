package defpackage;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* renamed from: aes  reason: default package */
/* compiled from: PG */
public final class aes implements aew {
    private final Bitmap.CompressFormat a = Bitmap.CompressFormat.JPEG;

    public final ww a(ww wwVar, tx txVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) wwVar.b()).compress(this.a, 100, byteArrayOutputStream);
        wwVar.d();
        return new adw(byteArrayOutputStream.toByteArray());
    }
}
