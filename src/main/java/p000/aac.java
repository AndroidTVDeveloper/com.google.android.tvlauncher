package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: aac */
/* compiled from: PG */
final class aac implements C0549ug {

    /* renamed from: a */
    private static final String[] f5a = {"_data"};

    /* renamed from: b */
    private final Context f6b;

    /* renamed from: c */
    private final Uri f7c;

    /* renamed from: a */
    public final Class mo6a() {
        return File.class;
    }

    /* renamed from: b */
    public final void mo8b() {
    }

    /* renamed from: c */
    public final void mo9c() {
    }

    /* renamed from: d */
    public final int mo10d() {
        return 1;
    }

    public aac(Context context, Uri uri) {
        this.f6b = context;
        this.f7c = uri;
    }

    /* renamed from: a */
    public final void mo7a(C0501sm smVar, C0548uf ufVar) {
        Cursor query = this.f6b.getContentResolver().query(this.f7c, f5a, null, null, null);
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
            String valueOf = String.valueOf(this.f7c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb.append("Failed to find file path for: ");
            sb.append(valueOf);
            ufVar.mo21a((Exception) new FileNotFoundException(sb.toString()));
            return;
        }
        ufVar.mo22a(new File(str));
    }
}
