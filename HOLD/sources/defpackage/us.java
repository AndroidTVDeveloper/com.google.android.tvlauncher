package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: us  reason: default package */
/* compiled from: PG */
public abstract class us implements ug {
    private final Uri a;
    private final ContentResolver b;
    private Object c;

    public us(ContentResolver contentResolver, Uri uri) {
        this.b = contentResolver;
        this.a = uri;
    }

    /* access modifiers changed from: protected */
    public abstract Object a(Uri uri, ContentResolver contentResolver);

    /* access modifiers changed from: protected */
    public abstract void a(Object obj);

    public final void c() {
    }

    public final int d() {
        return 1;
    }

    public final void b() {
        Object obj = this.c;
        if (obj != null) {
            try {
                a(obj);
            } catch (IOException e) {
            }
        }
    }

    public final void a(sm smVar, uf ufVar) {
        try {
            Object a2 = a(this.a, this.b);
            this.c = a2;
            ufVar.a(a2);
        } catch (FileNotFoundException e) {
            ufVar.a((Exception) e);
        }
    }
}
