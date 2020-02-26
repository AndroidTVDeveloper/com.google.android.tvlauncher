package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: aac  reason: default package */
/* compiled from: PG */
final class aac implements ug {
    private static final String[] a = {"_data"};
    private final Context b;
    private final Uri c;

    public final Class a() {
        return File.class;
    }

    public final void b() {
    }

    public final void c() {
    }

    public final int d() {
        return 1;
    }

    public aac(Context context, Uri uri) {
        this.b = context;
        this.c = uri;
    }

    public final void a(sm smVar, uf ufVar) {
        Cursor query = this.b.getContentResolver().query(this.c, a, null, null, null);
        String str = null;
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    str = query.getString(query.getColumnIndexOrThrow("_data"));
                }
            } finally {
                query.close();
            }
        }
        if (TextUtils.isEmpty(str)) {
            String valueOf = String.valueOf(this.c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb.append("Failed to find file path for: ");
            sb.append(valueOf);
            ufVar.a((Exception) new FileNotFoundException(sb.toString()));
            return;
        }
        ufVar.a(new File(str));
    }
}
