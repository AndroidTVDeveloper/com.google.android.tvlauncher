package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;

/* renamed from: uc  reason: default package */
/* compiled from: PG */
public final class uc extends us {
    public uc(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    public final Class a() {
        return AssetFileDescriptor.class;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((AssetFileDescriptor) obj).close();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(Uri uri, ContentResolver contentResolver) {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("FileDescriptor is null for: ");
        sb.append(valueOf);
        throw new FileNotFoundException(sb.toString());
    }
}
