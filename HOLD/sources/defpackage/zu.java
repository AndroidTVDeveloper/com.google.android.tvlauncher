package defpackage;

import java.io.File;

/* renamed from: zu  reason: default package */
/* compiled from: PG */
public final class zu implements aaj {
    private final zs a;

    public zu(zs zsVar) {
        this.a = zsVar;
    }

    public final /* bridge */ /* synthetic */ aai a(Object obj, int i, int i2, tx txVar) {
        File file = (File) obj;
        return new aai(new aho(file), new zr(file, this.a));
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        File file = (File) obj;
        return true;
    }
}
