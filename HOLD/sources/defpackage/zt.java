package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* renamed from: zt  reason: default package */
/* compiled from: PG */
final class zt implements zs {
    public final Class a() {
        return InputStream.class;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((InputStream) obj).close();
    }

    public final /* bridge */ /* synthetic */ Object a(File file) {
        return new FileInputStream(file);
    }
}
