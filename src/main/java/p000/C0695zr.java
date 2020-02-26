package p000;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: zr */
/* compiled from: PG */
final class C0695zr implements C0549ug {

    /* renamed from: a */
    private final File f10857a;

    /* renamed from: b */
    private final C0696zs f10858b;

    /* renamed from: c */
    private Object f10859c;

    public C0695zr(File file, C0696zs zsVar) {
        this.f10857a = file;
        this.f10858b = zsVar;
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
        Object obj = this.f10859c;
        if (obj != null) {
            try {
                this.f10858b.mo6158a(obj);
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a */
    public final Class mo6a() {
        return this.f10858b.mo6156a();
    }

    /* renamed from: a */
    public final void mo7a(C0501sm smVar, C0548uf ufVar) {
        try {
            Object a = this.f10858b.mo6157a(this.f10857a);
            this.f10859c = a;
            ufVar.mo22a(a);
        } catch (FileNotFoundException e) {
            ufVar.mo21a((Exception) e);
        }
    }
}
