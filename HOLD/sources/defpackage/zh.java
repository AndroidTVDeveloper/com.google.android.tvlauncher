package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: zh  reason: default package */
/* compiled from: PG */
final class zh implements ug {
    private final File a;

    public zh(File file) {
        this.a = file;
    }

    public final Class a() {
        return ByteBuffer.class;
    }

    public final void b() {
    }

    public final void c() {
    }

    public final int d() {
        return 1;
    }

    public final void a(sm smVar, uf ufVar) {
        try {
            ufVar.a(ahr.a(this.a));
        } catch (IOException e) {
            ufVar.a((Exception) e);
        }
    }
}
