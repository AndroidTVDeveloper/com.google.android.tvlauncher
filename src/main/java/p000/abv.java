package p000;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.InputStream;

/* renamed from: abv */
/* compiled from: PG */
public final class abv implements aak {

    /* renamed from: a */
    private final Context f62a;

    /* renamed from: b */
    private final Class f63b;

    private abv(Context context, Class cls) {
        this.f62a = context;
        this.f63b = cls;
    }

    /* renamed from: a */
    public final aaj mo5a(aas aas) {
        return new abx(this.f62a, aas.mo25a(File.class, this.f63b), aas.mo25a(Uri.class, this.f63b), this.f63b);
    }

    public abv(Context context) {
        this(context, ParcelFileDescriptor.class);
    }

    public abv(Context context, byte b) {
        this(context, InputStream.class);
    }
}
