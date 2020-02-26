package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.InputStream;

/* renamed from: abv  reason: default package */
/* compiled from: PG */
public final class abv implements aak {
    private final Context a;
    private final Class b;

    private abv(Context context, Class cls) {
        this.a = context;
        this.b = cls;
    }

    public final aaj a(aas aas) {
        return new abx(this.a, aas.a(File.class, this.b), aas.a(Uri.class, this.b), this.b);
    }

    public abv(Context context) {
        this(context, ParcelFileDescriptor.class);
    }

    public abv(Context context, byte b2) {
        this(context, InputStream.class);
    }
}
