package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: zr  reason: default package */
/* compiled from: PG */
final class zr implements ug {
    private final File a;
    private final zs b;
    private Object c;

    public zr(File file, zs zsVar) {
        this.a = file;
        this.b = zsVar;
    }

    public final void c() {
    }

    public final int d() {
        return 1;
    }

    public final void b() {
        Object obj = this.c;
        if (obj != null) {
            try {
                this.b.a(obj);
            } catch (IOException e) {
            }
        }
    }

    public final Class a() {
        return this.b.a();
    }

    public final void a(sm smVar, uf ufVar) {
        try {
            Object a2 = this.b.a(this.a);
            this.c = a2;
            ufVar.a(a2);
        } catch (FileNotFoundException e) {
            ufVar.a((Exception) e);
        }
    }
}
