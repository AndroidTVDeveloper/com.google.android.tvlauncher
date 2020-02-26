package p000;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: zh */
/* compiled from: PG */
final class C0685zh implements C0549ug {

    /* renamed from: a */
    private final File f10852a;

    public C0685zh(File file) {
        this.f10852a = file;
    }

    /* renamed from: a */
    public final Class mo6a() {
        return ByteBuffer.class;
    }

    /* renamed from: b */
    public final void mo8b() {
    }

    /* renamed from: c */
    public final void mo9c() {
    }

    /* renamed from: d */
    public final int mo10d() {
        return 1;
    }

    /* renamed from: a */
    public final void mo7a(C0501sm smVar, C0548uf ufVar) {
        try {
            ufVar.mo22a(ahr.m523a(this.f10852a));
        } catch (IOException e) {
            ufVar.mo21a((Exception) e);
        }
    }
}
