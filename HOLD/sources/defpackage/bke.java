package defpackage;

import java.io.File;

/* renamed from: bke  reason: default package */
/* compiled from: PG */
public final class bke {
    public final File a;
    public final File b;

    public bke(File file) {
        this.a = file;
        this.b = new File(String.valueOf(file.getPath()).concat(".bak"));
    }

    public final boolean a() {
        return this.a.exists() || this.b.exists();
    }
}
