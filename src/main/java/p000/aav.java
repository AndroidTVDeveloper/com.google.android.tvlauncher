package p000;

import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* renamed from: aav */
/* compiled from: PG */
public final class aav implements aak {

    /* renamed from: a */
    private final Resources f37a;

    public aav(Resources resources) {
        this.f37a = resources;
    }

    /* renamed from: a */
    public final aaj mo5a(aas aas) {
        return new aax(this.f37a, aas.mo25a(Uri.class, InputStream.class));
    }
}
