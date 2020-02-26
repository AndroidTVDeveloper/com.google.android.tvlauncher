package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* renamed from: aav  reason: default package */
/* compiled from: PG */
public final class aav implements aak {
    private final Resources a;

    public aav(Resources resources) {
        this.a = resources;
    }

    public final aaj a(aas aas) {
        return new aax(this.a, aas.a(Uri.class, InputStream.class));
    }
}
