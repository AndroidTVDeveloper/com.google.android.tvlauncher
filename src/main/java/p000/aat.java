package p000;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;

/* renamed from: aat */
/* compiled from: PG */
public final class aat implements aak {

    /* renamed from: a */
    private final Resources f35a;

    public aat(Resources resources) {
        this.f35a = resources;
    }

    /* renamed from: a */
    public final aaj mo5a(aas aas) {
        return new aax(this.f35a, aas.mo25a(Uri.class, AssetFileDescriptor.class));
    }
}
