package p000;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* renamed from: aes */
/* compiled from: PG */
public final class aes implements aew {

    /* renamed from: a */
    private final Bitmap.CompressFormat f213a = Bitmap.CompressFormat.JPEG;

    /* renamed from: a */
    public final C0619ww mo122a(C0619ww wwVar, C0539tx txVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) wwVar.mo33b()).compress(this.f213a, 100, byteArrayOutputStream);
        wwVar.mo35d();
        return new adw(byteArrayOutputStream.toByteArray());
    }
}
