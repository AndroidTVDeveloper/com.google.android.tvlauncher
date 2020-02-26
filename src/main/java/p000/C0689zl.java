package p000;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: zl */
/* compiled from: PG */
final class C0689zl implements C0549ug {

    /* renamed from: a */
    private final String f10853a;

    /* renamed from: b */
    private Object f10854b;

    public C0689zl(String str) {
        this.f10853a = str;
    }

    /* renamed from: a */
    public final Class mo6a() {
        return InputStream.class;
    }

    /* renamed from: c */
    public final void mo9c() {
    }

    /* renamed from: d */
    public final int mo10d() {
        return 1;
    }

    /* renamed from: b */
    public final void mo8b() {
        try {
            ((InputStream) this.f10854b).close();
        } catch (IOException e) {
        }
    }

    /* renamed from: a */
    public final void mo7a(C0501sm smVar, C0548uf ufVar) {
        try {
            String str = this.f10853a;
            if (str.startsWith("data:image")) {
                int indexOf = str.indexOf(44);
                if (indexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                } else if (str.substring(0, indexOf).endsWith(";base64")) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    this.f10854b = byteArrayInputStream;
                    ufVar.mo22a(byteArrayInputStream);
                } else {
                    throw new IllegalArgumentException("Not a base64 image data URL.");
                }
            } else {
                throw new IllegalArgumentException("Not a valid image data URL.");
            }
        } catch (IllegalArgumentException e) {
            ufVar.mo21a((Exception) e);
        }
    }
}
