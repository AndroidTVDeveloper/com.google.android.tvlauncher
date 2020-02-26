package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* renamed from: uv  reason: default package */
/* compiled from: PG */
public final class uv implements uy {
    private static final String[] b = {"_data"};
    private final ContentResolver a;

    public uv(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    public final Cursor a(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return this.a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
    }
}
