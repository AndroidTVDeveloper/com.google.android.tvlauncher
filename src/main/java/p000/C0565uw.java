package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* renamed from: uw */
/* compiled from: PG */
public final class C0565uw implements C0567uy {

    /* renamed from: b */
    private static final String[] f10558b = {"_data"};

    /* renamed from: a */
    private final ContentResolver f10559a;

    public C0565uw(ContentResolver contentResolver) {
        this.f10559a = contentResolver;
    }

    /* renamed from: a */
    public final Cursor mo6014a(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return this.f10559a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f10558b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
    }
}
