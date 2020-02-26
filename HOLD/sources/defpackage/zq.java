package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.File;

/* renamed from: zq  reason: default package */
/* compiled from: PG */
final class zq implements zs {
    public final Class a() {
        return ParcelFileDescriptor.class;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }

    public final /* bridge */ /* synthetic */ Object a(File file) {
        return ParcelFileDescriptor.open(file, 268435456);
    }
}
