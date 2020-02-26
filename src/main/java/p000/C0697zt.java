package p000;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* renamed from: zt */
/* compiled from: PG */
final class C0697zt implements C0696zs {
    /* renamed from: a */
    public final Class mo6156a() {
        return InputStream.class;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6158a(Object obj) {
        ((InputStream) obj).close();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6157a(File file) {
        return new FileInputStream(file);
    }
}
