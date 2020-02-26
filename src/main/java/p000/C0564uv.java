package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* renamed from: uv */
/* compiled from: PG */
public final class C0564uv implements C0567uy {

    /* renamed from: b */
    private static final String[] f10556b = {"_data"};

    /* renamed from: a */
    private final ContentResolver f10557a;

    public C0564uv(ContentResolver contentResolver) {
        this.f10557a = contentResolver;
    }

    /* renamed from: a */
    public final Cursor mo6014a(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return this.f10557a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f10556b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
    }
}
