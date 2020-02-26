package p000;

import java.io.File;

/* renamed from: bke */
/* compiled from: PG */
public final class bke {

    /* renamed from: a */
    public final File f4204a;

    /* renamed from: b */
    public final File f4205b;

    public bke(File file) {
        this.f4204a = file;
        this.f4205b = new File(String.valueOf(file.getPath()).concat(".bak"));
    }

    /* renamed from: a */
    public final boolean mo2031a() {
        return this.f4204a.exists() || this.f4205b.exists();
    }
}
