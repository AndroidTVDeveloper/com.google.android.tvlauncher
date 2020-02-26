package p000;

import android.os.ParcelFileDescriptor;
import java.io.File;

/* renamed from: zq */
/* compiled from: PG */
final class C0694zq implements C0696zs {
    /* renamed from: a */
    public final Class mo6156a() {
        return ParcelFileDescriptor.class;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6158a(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6157a(File file) {
        return ParcelFileDescriptor.open(file, 268435456);
    }
}
