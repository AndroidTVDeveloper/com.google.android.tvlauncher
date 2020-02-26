package p000;

import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

/* renamed from: aau */
/* compiled from: PG */
public final class aau implements aak {

    /* renamed from: a */
    private final Resources f36a;

    public aau(Resources resources) {
        this.f36a = resources;
    }

    /* renamed from: a */
    public final aaj mo5a(aas aas) {
        return new aax(this.f36a, aas.mo25a(Uri.class, ParcelFileDescriptor.class));
    }
}
