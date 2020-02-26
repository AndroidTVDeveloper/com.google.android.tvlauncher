package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

/* renamed from: aau  reason: default package */
/* compiled from: PG */
public final class aau implements aak {
    private final Resources a;

    public aau(Resources resources) {
        this.a = resources;
    }

    public final aaj a(aas aas) {
        return new aax(this.a, aas.a(Uri.class, ParcelFileDescriptor.class));
    }
}
