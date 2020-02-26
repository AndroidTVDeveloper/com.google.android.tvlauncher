package defpackage;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: zl  reason: default package */
/* compiled from: PG */
final class zl implements ug {
    private final String a;
    private Object b;

    public zl(String str) {
        this.a = str;
    }

    public final Class a() {
        return InputStream.class;
    }

    public final void c() {
    }

    public final int d() {
        return 1;
    }

    public final void b() {
        try {
            ((InputStream) this.b).close();
        } catch (IOException e) {
        }
    }

    public final void a(sm smVar, uf ufVar) {
        try {
            String str = this.a;
            if (str.startsWith("data:image")) {
                int indexOf = str.indexOf(44);
                if (indexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                } else if (str.substring(0, indexOf).endsWith(";base64")) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    this.b = byteArrayInputStream;
                    ufVar.a(byteArrayInputStream);
                } else {
                    throw new IllegalArgumentException("Not a base64 image data URL.");
                }
            } else {
                throw new IllegalArgumentException("Not a valid image data URL.");
            }
        } catch (IllegalArgumentException e) {
            ufVar.a((Exception) e);
        }
    }
}
