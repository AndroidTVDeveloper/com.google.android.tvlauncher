package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;

/* renamed from: aat  reason: default package */
/* compiled from: PG */
public final class aat implements aak {
    private final Resources a;

    public aat(Resources resources) {
        this.a = resources;
    }

    public final aaj a(aas aas) {
        return new aax(this.a, aas.a(Uri.class, AssetFileDescriptor.class));
    }
}
